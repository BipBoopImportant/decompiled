package com.optimizely.ab.config;

import GE.C12939d;
import GE.C12945j;
import HE.C12998c;
import HE.C12999d;
import HE.C13000e;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class PollingProjectConfigManager implements ProjectConfigManager, AutoCloseable, C12999d {
    private static final C12945j SIGNAL = new C12945j();
    /* access modifiers changed from: private */
    public static final Logger logger = LoggerFactory.getLogger((Class<?>) PollingProjectConfigManager.class);
    private final long blockingTimeoutPeriod;
    private final TimeUnit blockingTimeoutUnit;
    private final CountDownLatch countDownLatch;
    private final AtomicReference<C12998c> currentOptimizelyConfig;
    private final AtomicReference<ProjectConfig> currentProjectConfig;
    private final C12939d notificationCenter;
    private final long period;
    private final ScheduledExecutorService scheduledExecutorService;
    private ScheduledFuture<?> scheduledFuture;
    private volatile boolean started;
    private final TimeUnit timeUnit;

    private class ProjectConfigFetcher implements Runnable {
        private ProjectConfigFetcher() {
        }

        public void run() {
            try {
                PollingProjectConfigManager.this.setConfig(PollingProjectConfigManager.this.poll());
            } catch (Exception e10) {
                PollingProjectConfigManager.logger.error("Uncaught exception polling for ProjectConfig.", (Throwable) e10);
            }
        }
    }

    public PollingProjectConfigManager(long j10, TimeUnit timeUnit2) {
        this(j10, timeUnit2, Long.MAX_VALUE, TimeUnit.MILLISECONDS, new C12939d());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Thread lambda$new$0(ThreadFactory threadFactory, Runnable runnable) {
        Thread newThread = threadFactory.newThread(runnable);
        newThread.setDaemon(true);
        return newThread;
    }

    public synchronized void close() {
        stop();
        this.scheduledExecutorService.shutdownNow();
        this.started = false;
    }

    public ProjectConfig getConfig() {
        if (this.started) {
            try {
                if (!this.countDownLatch.await(this.blockingTimeoutPeriod, this.blockingTimeoutUnit)) {
                    logger.warn("Timeout exceeded waiting for ProjectConfig to be set, returning null.");
                    this.countDownLatch.countDown();
                }
            } catch (InterruptedException unused) {
                logger.warn("Interrupted waiting for valid ProjectConfig, returning null.");
            }
            return this.currentProjectConfig.get();
        }
        ProjectConfig poll = poll();
        return poll == null ? this.currentProjectConfig.get() : poll;
    }

    public C12939d getNotificationCenter() {
        return this.notificationCenter;
    }

    public C12998c getOptimizelyConfig() {
        return this.currentOptimizelyConfig.get();
    }

    public boolean isRunning() {
        return this.started;
    }

    /* access modifiers changed from: protected */
    public abstract ProjectConfig poll();

    /* access modifiers changed from: package-private */
    public void setConfig(ProjectConfig projectConfig) {
        if (projectConfig != null) {
            ProjectConfig projectConfig2 = this.currentProjectConfig.get();
            String revision = projectConfig2 == null ? "null" : projectConfig2.getRevision();
            if (!projectConfig.getRevision().equals(revision)) {
                if (projectConfig2 == null) {
                    logger.info("New datafile set with revision: {}.", (Object) projectConfig.getRevision());
                } else {
                    logger.info("New datafile set with revision: {}. Old revision: {}", (Object) projectConfig.getRevision(), (Object) revision);
                }
                this.currentProjectConfig.set(projectConfig);
                this.currentOptimizelyConfig.set(new C13000e(projectConfig).d());
                this.countDownLatch.countDown();
                this.notificationCenter.c(SIGNAL);
            }
        }
    }

    public synchronized void start() {
        if (this.started) {
            logger.warn("Manager already started.");
        } else if (this.scheduledExecutorService.isShutdown()) {
            logger.warn("Not starting. Already in shutdown.");
        } else {
            this.scheduledFuture = this.scheduledExecutorService.scheduleAtFixedRate(new ProjectConfigFetcher(), 0, this.period, this.timeUnit);
            this.started = true;
        }
    }

    public synchronized void stop() {
        if (!this.started) {
            logger.warn("Not pausing. Manager has not been started.");
        } else if (this.scheduledExecutorService.isShutdown()) {
            logger.warn("Not pausing. Already in shutdown.");
        } else {
            logger.info("pausing project watcher");
            this.scheduledFuture.cancel(true);
            this.started = false;
        }
    }

    public PollingProjectConfigManager(long j10, TimeUnit timeUnit2, C12939d dVar) {
        this(j10, timeUnit2, Long.MAX_VALUE, TimeUnit.MILLISECONDS, dVar);
    }

    public PollingProjectConfigManager(long j10, TimeUnit timeUnit2, long j11, TimeUnit timeUnit3, C12939d dVar) {
        this.currentProjectConfig = new AtomicReference<>();
        this.currentOptimizelyConfig = new AtomicReference<>();
        this.countDownLatch = new CountDownLatch(1);
        this.period = j10;
        this.timeUnit = timeUnit2;
        this.blockingTimeoutPeriod = j11;
        this.blockingTimeoutUnit = timeUnit3;
        this.notificationCenter = dVar;
        this.scheduledExecutorService = Executors.newSingleThreadScheduledExecutor(new a(Executors.defaultThreadFactory()));
    }
}
