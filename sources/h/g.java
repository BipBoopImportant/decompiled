package H;

import H2.i;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;

final class g implements Executor {

    /* renamed from: a  reason: collision with root package name */
    final Deque<Runnable> f6675a = new ArrayDeque();

    /* renamed from: b  reason: collision with root package name */
    private final Executor f6676b;

    /* renamed from: c  reason: collision with root package name */
    private final b f6677c = new b();

    /* renamed from: d  reason: collision with root package name */
    c f6678d = c.IDLE;

    /* renamed from: e  reason: collision with root package name */
    long f6679e = 0;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f6680a;

        a(Runnable runnable) {
            this.f6680a = runnable;
        }

        public void run() {
            this.f6680a.run();
        }
    }

    final class b implements Runnable {
        b() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
            java.lang.Thread.currentThread().interrupt();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
            if (r1 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
            java.lang.Thread.currentThread().interrupt();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x004a, code lost:
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
            r3.run();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0051, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            C.C4391e0.d("SequentialExecutor", "Exception while executing runnable " + r3, r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
            if (r1 == false) goto L_?;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void a() {
            /*
                r9 = this;
                r0 = 0
                r1 = r0
            L_0x0002:
                H.g r2 = H.g.this     // Catch:{ all -> 0x004f }
                java.util.Deque<java.lang.Runnable> r2 = r2.f6675a     // Catch:{ all -> 0x004f }
                monitor-enter(r2)     // Catch:{ all -> 0x004f }
                if (r0 != 0) goto L_0x0028
                H.g r0 = H.g.this     // Catch:{ all -> 0x001c }
                H.g$c r3 = r0.f6678d     // Catch:{ all -> 0x001c }
                H.g$c r4 = H.g.c.RUNNING     // Catch:{ all -> 0x001c }
                if (r3 != r4) goto L_0x001e
                monitor-exit(r2)     // Catch:{ all -> 0x001c }
                if (r1 == 0) goto L_0x001b
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L_0x001b:
                return
            L_0x001c:
                r0 = move-exception
                goto L_0x0069
            L_0x001e:
                long r5 = r0.f6679e     // Catch:{ all -> 0x001c }
                r7 = 1
                long r5 = r5 + r7
                r0.f6679e = r5     // Catch:{ all -> 0x001c }
                r0.f6678d = r4     // Catch:{ all -> 0x001c }
                r0 = 1
            L_0x0028:
                H.g r3 = H.g.this     // Catch:{ all -> 0x001c }
                java.util.Deque<java.lang.Runnable> r3 = r3.f6675a     // Catch:{ all -> 0x001c }
                java.lang.Object r3 = r3.poll()     // Catch:{ all -> 0x001c }
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch:{ all -> 0x001c }
                if (r3 != 0) goto L_0x0045
                H.g r0 = H.g.this     // Catch:{ all -> 0x001c }
                H.g$c r3 = H.g.c.IDLE     // Catch:{ all -> 0x001c }
                r0.f6678d = r3     // Catch:{ all -> 0x001c }
                monitor-exit(r2)     // Catch:{ all -> 0x001c }
                if (r1 == 0) goto L_0x0044
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L_0x0044:
                return
            L_0x0045:
                monitor-exit(r2)     // Catch:{ all -> 0x001c }
                boolean r2 = java.lang.Thread.interrupted()     // Catch:{ all -> 0x004f }
                r1 = r1 | r2
                r3.run()     // Catch:{ RuntimeException -> 0x0051 }
                goto L_0x0002
            L_0x004f:
                r0 = move-exception
                goto L_0x006b
            L_0x0051:
                r2 = move-exception
                java.lang.String r4 = "SequentialExecutor"
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x004f }
                r5.<init>()     // Catch:{ all -> 0x004f }
                java.lang.String r6 = "Exception while executing runnable "
                r5.append(r6)     // Catch:{ all -> 0x004f }
                r5.append(r3)     // Catch:{ all -> 0x004f }
                java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x004f }
                C.C4391e0.d(r4, r3, r2)     // Catch:{ all -> 0x004f }
                goto L_0x0002
            L_0x0069:
                monitor-exit(r2)     // Catch:{ all -> 0x001c }
                throw r0     // Catch:{ all -> 0x004f }
            L_0x006b:
                if (r1 == 0) goto L_0x0074
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L_0x0074:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: H.g.b.a():void");
        }

        public void run() {
            try {
                a();
            } catch (Error e10) {
                synchronized (g.this.f6675a) {
                    g.this.f6678d = c.IDLE;
                    throw e10;
                }
            }
        }
    }

    enum c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    g(Executor executor) {
        this.f6676b = (Executor) i.g(executor);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r7.f6676b.execute(r7.f6677c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r7.f6678d == r8) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        r0 = r7.f6675a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0035, code lost:
        if (r7.f6679e != r3) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        if (r7.f6678d != r8) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003b, code lost:
        r7.f6678d = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003e, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0040, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0041, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0043, code lost:
        throw r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0044, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0049, code lost:
        monitor-enter(r7.f6675a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r0 = r7.f6678d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x004e, code lost:
        if (r0 != H.g.c.IDLE) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0052, code lost:
        if (r0 == H.g.c.QUEUING) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0055, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x005d, code lost:
        if (r7.f6675a.removeLastOccurrence(r1) != false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x005f, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0061, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0064, code lost:
        if ((r8 instanceof java.util.concurrent.RejectedExecutionException) != false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0069, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x006a, code lost:
        throw r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x006c, code lost:
        throw r8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0066 A[ADDED_TO_REGION, Catch:{ Error | RuntimeException -> 0x0044, all -> 0x0055 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void execute(java.lang.Runnable r8) {
        /*
            r7 = this;
            H2.i.g(r8)
            java.util.Deque<java.lang.Runnable> r0 = r7.f6675a
            monitor-enter(r0)
            H.g$c r1 = r7.f6678d     // Catch:{ all -> 0x006d }
            H.g$c r2 = H.g.c.RUNNING     // Catch:{ all -> 0x006d }
            if (r1 == r2) goto L_0x006f
            H.g$c r2 = H.g.c.QUEUED     // Catch:{ all -> 0x006d }
            if (r1 != r2) goto L_0x0011
            goto L_0x006f
        L_0x0011:
            long r3 = r7.f6679e     // Catch:{ all -> 0x006d }
            H.g$a r1 = new H.g$a     // Catch:{ all -> 0x006d }
            r1.<init>(r8)     // Catch:{ all -> 0x006d }
            java.util.Deque<java.lang.Runnable> r8 = r7.f6675a     // Catch:{ all -> 0x006d }
            r8.add(r1)     // Catch:{ all -> 0x006d }
            H.g$c r8 = H.g.c.QUEUING     // Catch:{ all -> 0x006d }
            r7.f6678d = r8     // Catch:{ all -> 0x006d }
            monitor-exit(r0)     // Catch:{ all -> 0x006d }
            java.util.concurrent.Executor r0 = r7.f6676b     // Catch:{ RuntimeException -> 0x0046, Error -> 0x0044 }
            H.g$b r5 = r7.f6677c     // Catch:{ RuntimeException -> 0x0046, Error -> 0x0044 }
            r0.execute(r5)     // Catch:{ RuntimeException -> 0x0046, Error -> 0x0044 }
            H.g$c r0 = r7.f6678d
            if (r0 == r8) goto L_0x002e
            return
        L_0x002e:
            java.util.Deque<java.lang.Runnable> r0 = r7.f6675a
            monitor-enter(r0)
            long r5 = r7.f6679e     // Catch:{ all -> 0x003e }
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0040
            H.g$c r1 = r7.f6678d     // Catch:{ all -> 0x003e }
            if (r1 != r8) goto L_0x0040
            r7.f6678d = r2     // Catch:{ all -> 0x003e }
            goto L_0x0040
        L_0x003e:
            r8 = move-exception
            goto L_0x0042
        L_0x0040:
            monitor-exit(r0)     // Catch:{ all -> 0x003e }
            return
        L_0x0042:
            monitor-exit(r0)     // Catch:{ all -> 0x003e }
            throw r8
        L_0x0044:
            r8 = move-exception
            goto L_0x0047
        L_0x0046:
            r8 = move-exception
        L_0x0047:
            java.util.Deque<java.lang.Runnable> r2 = r7.f6675a
            monitor-enter(r2)
            H.g$c r0 = r7.f6678d     // Catch:{ all -> 0x0055 }
            H.g$c r3 = H.g.c.IDLE     // Catch:{ all -> 0x0055 }
            if (r0 == r3) goto L_0x0057
            H.g$c r3 = H.g.c.QUEUING     // Catch:{ all -> 0x0055 }
            if (r0 != r3) goto L_0x0061
            goto L_0x0057
        L_0x0055:
            r8 = move-exception
            goto L_0x006b
        L_0x0057:
            java.util.Deque<java.lang.Runnable> r0 = r7.f6675a     // Catch:{ all -> 0x0055 }
            boolean r0 = r0.removeLastOccurrence(r1)     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x0061
            r0 = 1
            goto L_0x0062
        L_0x0061:
            r0 = 0
        L_0x0062:
            boolean r1 = r8 instanceof java.util.concurrent.RejectedExecutionException     // Catch:{ all -> 0x0055 }
            if (r1 == 0) goto L_0x006a
            if (r0 != 0) goto L_0x006a
            monitor-exit(r2)     // Catch:{ all -> 0x0055 }
            return
        L_0x006a:
            throw r8     // Catch:{ all -> 0x0055 }
        L_0x006b:
            monitor-exit(r2)     // Catch:{ all -> 0x0055 }
            throw r8
        L_0x006d:
            r8 = move-exception
            goto L_0x0076
        L_0x006f:
            java.util.Deque<java.lang.Runnable> r1 = r7.f6675a     // Catch:{ all -> 0x006d }
            r1.add(r8)     // Catch:{ all -> 0x006d }
            monitor-exit(r0)     // Catch:{ all -> 0x006d }
            return
        L_0x0076:
            monitor-exit(r0)     // Catch:{ all -> 0x006d }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: H.g.execute(java.lang.Runnable):void");
    }
}
