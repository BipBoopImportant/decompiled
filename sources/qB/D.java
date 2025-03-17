package Qb;

import Nb.g;
import Yb.j;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

class D implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    private final a f62907a;

    /* renamed from: b  reason: collision with root package name */
    private final j f62908b;

    /* renamed from: c  reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f62909c;

    /* renamed from: d  reason: collision with root package name */
    private final Nb.a f62910d;

    /* renamed from: e  reason: collision with root package name */
    private final AtomicBoolean f62911e = new AtomicBoolean(false);

    interface a {
        void a(j jVar, Thread thread, Throwable th2);
    }

    public D(a aVar, j jVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Nb.a aVar2) {
        this.f62907a = aVar;
        this.f62908b = jVar;
        this.f62909c = uncaughtExceptionHandler;
        this.f62910d = aVar2;
    }

    private boolean b(Thread thread, Throwable th2) {
        if (thread == null) {
            g.f().d("Crashlytics will not record uncaught exception; null thread");
            return false;
        } else if (th2 == null) {
            g.f().d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        } else if (!this.f62910d.b()) {
            return true;
        } else {
            g.f().b("Crashlytics will not record uncaught exception; native crash exists for session.");
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        return this.f62911e.get();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (r7.f62909c != null) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        Nb.g.f().b("Completed exception processing. Invoking default exception handler.");
        r7.f62909c.uncaughtException(r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        Nb.g.f().b("Completed exception processing, but no default exception handler.");
        java.lang.System.exit(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0041, code lost:
        r7.f62911e.set(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0052, code lost:
        if (r7.f62909c == null) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0055, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void uncaughtException(java.lang.Thread r8, java.lang.Throwable r9) {
        /*
            r7 = this;
            java.lang.String r0 = "Completed exception processing, but no default exception handler."
            java.lang.String r1 = "Completed exception processing. Invoking default exception handler."
            java.util.concurrent.atomic.AtomicBoolean r2 = r7.f62911e
            r3 = 1
            r2.set(r3)
            r2 = 0
            boolean r4 = r7.b(r8, r9)     // Catch:{ Exception -> 0x001b }
            if (r4 == 0) goto L_0x001d
            Qb.D$a r4 = r7.f62907a     // Catch:{ Exception -> 0x001b }
            Yb.j r5 = r7.f62908b     // Catch:{ Exception -> 0x001b }
            r4.a(r5, r8, r9)     // Catch:{ Exception -> 0x001b }
            goto L_0x0026
        L_0x0019:
            r4 = move-exception
            goto L_0x0056
        L_0x001b:
            r4 = move-exception
            goto L_0x0047
        L_0x001d:
            Nb.g r4 = Nb.g.f()     // Catch:{ Exception -> 0x001b }
            java.lang.String r5 = "Uncaught exception will not be recorded by Crashlytics."
            r4.b(r5)     // Catch:{ Exception -> 0x001b }
        L_0x0026:
            java.lang.Thread$UncaughtExceptionHandler r4 = r7.f62909c
            if (r4 == 0) goto L_0x0037
        L_0x002a:
            Nb.g r0 = Nb.g.f()
            r0.b(r1)
            java.lang.Thread$UncaughtExceptionHandler r0 = r7.f62909c
            r0.uncaughtException(r8, r9)
            goto L_0x0041
        L_0x0037:
            Nb.g r8 = Nb.g.f()
            r8.b(r0)
            java.lang.System.exit(r3)
        L_0x0041:
            java.util.concurrent.atomic.AtomicBoolean r8 = r7.f62911e
            r8.set(r2)
            goto L_0x0055
        L_0x0047:
            Nb.g r5 = Nb.g.f()     // Catch:{ all -> 0x0019 }
            java.lang.String r6 = "An error occurred in the uncaught exception handler"
            r5.e(r6, r4)     // Catch:{ all -> 0x0019 }
            java.lang.Thread$UncaughtExceptionHandler r4 = r7.f62909c
            if (r4 == 0) goto L_0x0037
            goto L_0x002a
        L_0x0055:
            return
        L_0x0056:
            java.lang.Thread$UncaughtExceptionHandler r5 = r7.f62909c
            if (r5 == 0) goto L_0x0067
            Nb.g r0 = Nb.g.f()
            r0.b(r1)
            java.lang.Thread$UncaughtExceptionHandler r0 = r7.f62909c
            r0.uncaughtException(r8, r9)
            goto L_0x0071
        L_0x0067:
            Nb.g r8 = Nb.g.f()
            r8.b(r0)
            java.lang.System.exit(r3)
        L_0x0071:
            java.util.concurrent.atomic.AtomicBoolean r8 = r7.f62911e
            r8.set(r2)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Qb.D.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
