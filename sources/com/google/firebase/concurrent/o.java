package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

class o implements ScheduledExecutorService {

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f68222a;

    /* renamed from: b  reason: collision with root package name */
    private final ScheduledExecutorService f68223b;

    o(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f68222a = executorService;
        this.f68223b = scheduledExecutorService;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void m(Runnable runnable, p.b bVar) {
        try {
            runnable.run();
            bVar.set(null);
        } catch (Exception e10) {
            bVar.a(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void o(Runnable runnable, p.b bVar) {
        this.f68222a.execute(new m(runnable, bVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture p(Runnable runnable, long j10, TimeUnit timeUnit, p.b bVar) {
        return this.f68223b.schedule(new j(this, runnable, bVar), j10, timeUnit);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void q(Callable callable, p.b bVar) {
        try {
            bVar.set(callable.call());
        } catch (Exception e10) {
            bVar.a(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Future r(Callable callable, p.b bVar) {
        return this.f68222a.submit(new n(callable, bVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture s(Callable callable, long j10, TimeUnit timeUnit, p.b bVar) {
        return this.f68223b.schedule(new k(this, callable, bVar), j10, timeUnit);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void t(Runnable runnable, p.b bVar) {
        try {
            runnable.run();
        } catch (Exception e10) {
            bVar.a(e10);
            throw e10;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void u(Runnable runnable, p.b bVar) {
        this.f68222a.execute(new d(runnable, bVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture w(Runnable runnable, long j10, long j11, TimeUnit timeUnit, p.b bVar) {
        return this.f68223b.scheduleAtFixedRate(new i(this, runnable, bVar), j10, j11, timeUnit);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void x(Runnable runnable, p.b bVar) {
        this.f68222a.execute(new e(runnable, bVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture y(Runnable runnable, long j10, long j11, TimeUnit timeUnit, p.b bVar) {
        return this.f68223b.scheduleWithFixedDelay(new l(this, runnable, bVar), j10, j11, timeUnit);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void z(Runnable runnable, p.b bVar) {
        try {
            runnable.run();
        } catch (Exception e10) {
            bVar.a(e10);
        }
    }

    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return this.f68222a.awaitTermination(j10, timeUnit);
    }

    public void execute(Runnable runnable) {
        this.f68222a.execute(runnable);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.f68222a.invokeAll(collection);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return this.f68222a.invokeAny(collection);
    }

    public boolean isShutdown() {
        return this.f68222a.isShutdown();
    }

    public boolean isTerminated() {
        return this.f68222a.isTerminated();
    }

    public ScheduledFuture<?> schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        return new p(new c(this, runnable, j10, timeUnit));
    }

    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        return new p(new f(this, runnable, j10, j11, timeUnit));
    }

    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        return new p(new g(this, runnable, j10, j11, timeUnit));
    }

    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    public <T> Future<T> submit(Callable<T> callable) {
        return this.f68222a.submit(callable);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
        return this.f68222a.invokeAll(collection, j10, timeUnit);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
        return this.f68222a.invokeAny(collection, j10, timeUnit);
    }

    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j10, TimeUnit timeUnit) {
        return new p(new h(this, callable, j10, timeUnit));
    }

    public <T> Future<T> submit(Runnable runnable, T t10) {
        return this.f68222a.submit(runnable, t10);
    }

    public Future<?> submit(Runnable runnable) {
        return this.f68222a.submit(runnable);
    }
}
