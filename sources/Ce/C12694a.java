package CE;

import DE.C12750e;
import DE.h;
import FE.C12875g;
import GE.C12939d;
import com.optimizely.ab.config.ProjectConfig;
import java.util.LinkedList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* renamed from: CE.a  reason: case insensitive filesystem */
public class C12694a implements C12697d, AutoCloseable {
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final Logger f108384j = LoggerFactory.getLogger((Class<?>) C12694a.class);

    /* renamed from: k  reason: collision with root package name */
    public static final long f108385k;

    /* renamed from: l  reason: collision with root package name */
    public static final long f108386l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final Object f108387m = new Object();
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public static final Object f108388n = new Object();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final BlockingQueue<Object> f108389a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C12696c f108390b;

    /* renamed from: c  reason: collision with root package name */
    final int f108391c;

    /* renamed from: d  reason: collision with root package name */
    final long f108392d;

    /* renamed from: e  reason: collision with root package name */
    final long f108393e;

    /* renamed from: f  reason: collision with root package name */
    private final ExecutorService f108394f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final C12939d f108395g;

    /* renamed from: h  reason: collision with root package name */
    private Future<?> f108396h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f108397i;

    /* renamed from: CE.a$b */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private BlockingQueue<Object> f108398a = new ArrayBlockingQueue(1000);

        /* renamed from: b  reason: collision with root package name */
        private C12696c f108399b = null;

        /* renamed from: c  reason: collision with root package name */
        private Integer f108400c = C12875g.d("event.processor.batch.size", 10);

        /* renamed from: d  reason: collision with root package name */
        private Long f108401d = C12875g.e("event.processor.batch.interval", Long.valueOf(C12694a.f108385k));

        /* renamed from: e  reason: collision with root package name */
        private Long f108402e = C12875g.e("event.processor.close.timeout", Long.valueOf(C12694a.f108386l));

        /* renamed from: f  reason: collision with root package name */
        private ExecutorService f108403f = null;

        /* renamed from: g  reason: collision with root package name */
        private C12939d f108404g = null;

        /* access modifiers changed from: private */
        public static /* synthetic */ Thread d(ThreadFactory threadFactory, Runnable runnable) {
            Thread newThread = threadFactory.newThread(runnable);
            newThread.setDaemon(true);
            return newThread;
        }

        public C12694a b() {
            return c(true);
        }

        public C12694a c(boolean z10) {
            if (this.f108400c.intValue() < 0) {
                C12694a.f108384j.warn("Invalid batchSize of {}, Defaulting to {}", (Object) this.f108400c, (Object) 10);
                this.f108400c = 10;
            }
            if (this.f108401d.longValue() < 0) {
                Logger d10 = C12694a.f108384j;
                Long l10 = this.f108401d;
                long j10 = C12694a.f108385k;
                d10.warn("Invalid flushInterval of {}, Defaulting to {}", (Object) l10, (Object) Long.valueOf(j10));
                this.f108401d = Long.valueOf(j10);
            }
            if (this.f108402e.longValue() < 0) {
                Logger d11 = C12694a.f108384j;
                Long l11 = this.f108402e;
                long j11 = C12694a.f108386l;
                d11.warn("Invalid timeoutMillis of {}, Defaulting to {}", (Object) l11, (Object) Long.valueOf(j11));
                this.f108402e = Long.valueOf(j11);
            }
            if (this.f108399b != null) {
                if (this.f108403f == null) {
                    this.f108403f = Executors.newSingleThreadExecutor(new C12695b(Executors.defaultThreadFactory()));
                }
                C12694a aVar = new C12694a(this.f108398a, this.f108399b, this.f108400c, this.f108401d, this.f108402e, this.f108403f, this.f108404g);
                if (z10) {
                    aVar.n();
                }
                return aVar;
            }
            throw new IllegalArgumentException("EventHandler was not configured");
        }

        public b e(Integer num) {
            this.f108400c = num;
            return this;
        }

        public b f(C12696c cVar) {
            this.f108399b = cVar;
            return this;
        }

        public b g(Long l10) {
            this.f108401d = l10;
            return this;
        }

        public b h(C12939d dVar) {
            this.f108404g = dVar;
            return this;
        }
    }

    /* renamed from: CE.a$c */
    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private LinkedList<h> f108405a = new LinkedList<>();

        /* renamed from: b  reason: collision with root package name */
        private long f108406b;

        public c() {
            this.f108406b = System.currentTimeMillis() + C12694a.this.f108392d;
        }

        private void a(h hVar) {
            if (c(hVar)) {
                b();
                this.f108405a = new LinkedList<>();
            }
            if (this.f108405a.isEmpty()) {
                this.f108406b = System.currentTimeMillis() + C12694a.this.f108392d;
            }
            this.f108405a.add(hVar);
            if (this.f108405a.size() >= C12694a.this.f108391c) {
                b();
            }
        }

        private void b() {
            if (!this.f108405a.isEmpty()) {
                C12699f c10 = C12750e.c(this.f108405a);
                if (C12694a.this.f108395g != null) {
                    C12694a.this.f108395g.c(c10);
                }
                try {
                    C12694a.this.f108390b.a(c10);
                } catch (Exception e10) {
                    C12694a.f108384j.error("Error dispatching event: {}", (Object) c10, (Object) e10);
                }
                this.f108405a = new LinkedList<>();
            }
        }

        private boolean c(h hVar) {
            if (this.f108405a.isEmpty()) {
                return false;
            }
            ProjectConfig b10 = this.f108405a.peekLast().a().b();
            ProjectConfig b11 = hVar.a().b();
            return !b10.getProjectId().equals(b11.getProjectId()) || !b10.getRevision().equals(b11.getRevision());
        }

        public void run() {
            Object take;
            while (true) {
                int i10 = 0;
                while (true) {
                    try {
                        if (System.currentTimeMillis() >= this.f108406b) {
                            C12694a.f108384j.debug("Deadline exceeded flushing current batch.");
                            b();
                            this.f108406b = System.currentTimeMillis() + C12694a.this.f108392d;
                        }
                        take = i10 > 2 ? C12694a.this.f108389a.take() : C12694a.this.f108389a.poll(this.f108406b - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
                        if (take != null) {
                            break;
                        }
                        C12694a.f108384j.debug("Empty item after waiting flush interval.");
                        i10++;
                    } catch (InterruptedException unused) {
                        C12694a.f108384j.info("Interrupted while processing buffer.");
                    } catch (Exception e10) {
                        C12694a.f108384j.error("Uncaught exception processing buffer.", (Throwable) e10);
                    } catch (Throwable th2) {
                        C12694a.f108384j.info("Exiting processing loop. Attempting to flush pending events.");
                        b();
                        throw th2;
                    }
                }
                if (take == C12694a.f108387m) {
                    break;
                } else if (take == C12694a.f108388n) {
                    C12694a.f108384j.debug("Received flush signal.");
                    b();
                } else {
                    a((h) take);
                }
            }
            C12694a.f108384j.info("Received shutdown signal.");
            C12694a.f108384j.info("Exiting processing loop. Attempting to flush pending events.");
            b();
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f108385k = timeUnit.toMillis(30);
        f108386l = timeUnit.toMillis(5);
    }

    public static b l() {
        return new b();
    }

    public void c(h hVar) {
        Logger logger = f108384j;
        logger.debug("Received userEvent: {}", (Object) hVar);
        if (this.f108394f.isShutdown()) {
            logger.warn("Executor shutdown, not accepting tasks.");
        } else if (!this.f108389a.offer(hVar)) {
            logger.warn("Payload not accepted by the queue. Current size: {}", (Object) Integer.valueOf(this.f108389a.size()));
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void close() {
        /*
            r5 = this;
            org.slf4j.Logger r0 = f108384j
            java.lang.String r1 = "Start close"
            r0.info(r1)
            java.util.concurrent.BlockingQueue<java.lang.Object> r0 = r5.f108389a
            java.lang.Object r1 = f108387m
            r0.put(r1)
            r0 = 0
            java.util.concurrent.Future<?> r1 = r5.f108396h     // Catch:{ InterruptedException -> 0x0030, TimeoutException -> 0x0022 }
            long r2 = r5.f108393e     // Catch:{ InterruptedException -> 0x0030, TimeoutException -> 0x0022 }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x0030, TimeoutException -> 0x0022 }
            r1.get(r2, r4)     // Catch:{ InterruptedException -> 0x0030, TimeoutException -> 0x0022 }
        L_0x0018:
            r5.f108397i = r0
            CE.c r0 = r5.f108390b
            FE.C12877i.a(r0)
            goto L_0x003f
        L_0x0020:
            r1 = move-exception
            goto L_0x0040
        L_0x0022:
            org.slf4j.Logger r1 = f108384j     // Catch:{ all -> 0x0020 }
            java.lang.String r2 = "Timeout exceeded attempting to close for {} ms"
            long r3 = r5.f108393e     // Catch:{ all -> 0x0020 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0020 }
            r1.error((java.lang.String) r2, (java.lang.Object) r3)     // Catch:{ all -> 0x0020 }
            goto L_0x0018
        L_0x0030:
            org.slf4j.Logger r1 = f108384j     // Catch:{ all -> 0x0020 }
            java.lang.String r2 = "Interrupted while awaiting termination."
            r1.warn(r2)     // Catch:{ all -> 0x0020 }
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0020 }
            r1.interrupt()     // Catch:{ all -> 0x0020 }
            goto L_0x0018
        L_0x003f:
            return
        L_0x0040:
            r5.f108397i = r0
            CE.c r0 = r5.f108390b
            FE.C12877i.a(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: CE.C12694a.close():void");
    }

    public synchronized void n() {
        if (this.f108397i) {
            f108384j.info("Executor already started.");
            return;
        }
        this.f108397i = true;
        this.f108396h = this.f108394f.submit(new c());
    }

    private C12694a(BlockingQueue<Object> blockingQueue, C12696c cVar, Integer num, Long l10, Long l11, ExecutorService executorService, C12939d dVar) {
        this.f108397i = false;
        this.f108390b = cVar;
        this.f108389a = blockingQueue;
        this.f108391c = num.intValue();
        this.f108392d = l10.longValue();
        this.f108393e = l11.longValue();
        this.f108395g = dVar;
        this.f108394f = executorService;
    }
}
