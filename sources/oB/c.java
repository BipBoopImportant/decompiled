package Ob;

import android.os.Bundle;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class c implements b, a {

    /* renamed from: a  reason: collision with root package name */
    private final e f62050a;

    /* renamed from: b  reason: collision with root package name */
    private final int f62051b;

    /* renamed from: c  reason: collision with root package name */
    private final TimeUnit f62052c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f62053d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private CountDownLatch f62054e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f62055f = false;

    public c(e eVar, int i10, TimeUnit timeUnit) {
        this.f62050a = eVar;
        this.f62051b = i10;
        this.f62052c = timeUnit;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:11|12) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        Nb.g.f().d("Interrupted while awaiting app exception callback from Analytics listener.");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0061 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.String r6, android.os.Bundle r7) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f62053d
            monitor-enter(r0)
            Nb.g r1 = Nb.g.f()     // Catch:{ all -> 0x0055 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0055 }
            r2.<init>()     // Catch:{ all -> 0x0055 }
            java.lang.String r3 = "Logging event "
            r2.append(r3)     // Catch:{ all -> 0x0055 }
            r2.append(r6)     // Catch:{ all -> 0x0055 }
            java.lang.String r3 = " to Firebase Analytics with params "
            r2.append(r3)     // Catch:{ all -> 0x0055 }
            r2.append(r7)     // Catch:{ all -> 0x0055 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0055 }
            r1.i(r2)     // Catch:{ all -> 0x0055 }
            java.util.concurrent.CountDownLatch r1 = new java.util.concurrent.CountDownLatch     // Catch:{ all -> 0x0055 }
            r2 = 1
            r1.<init>(r2)     // Catch:{ all -> 0x0055 }
            r5.f62054e = r1     // Catch:{ all -> 0x0055 }
            r1 = 0
            r5.f62055f = r1     // Catch:{ all -> 0x0055 }
            Ob.e r1 = r5.f62050a     // Catch:{ all -> 0x0055 }
            r1.a(r6, r7)     // Catch:{ all -> 0x0055 }
            Nb.g r6 = Nb.g.f()     // Catch:{ all -> 0x0055 }
            java.lang.String r7 = "Awaiting app exception callback from Analytics..."
            r6.i(r7)     // Catch:{ all -> 0x0055 }
            java.util.concurrent.CountDownLatch r6 = r5.f62054e     // Catch:{ InterruptedException -> 0x0061 }
            int r7 = r5.f62051b     // Catch:{ InterruptedException -> 0x0061 }
            long r3 = (long) r7     // Catch:{ InterruptedException -> 0x0061 }
            java.util.concurrent.TimeUnit r7 = r5.f62052c     // Catch:{ InterruptedException -> 0x0061 }
            boolean r6 = r6.await(r3, r7)     // Catch:{ InterruptedException -> 0x0061 }
            if (r6 == 0) goto L_0x0057
            r5.f62055f = r2     // Catch:{ InterruptedException -> 0x0061 }
            Nb.g r6 = Nb.g.f()     // Catch:{ InterruptedException -> 0x0061 }
            java.lang.String r7 = "App exception callback received from Analytics listener."
            r6.i(r7)     // Catch:{ InterruptedException -> 0x0061 }
            goto L_0x006a
        L_0x0055:
            r6 = move-exception
            goto L_0x006f
        L_0x0057:
            Nb.g r6 = Nb.g.f()     // Catch:{ InterruptedException -> 0x0061 }
            java.lang.String r7 = "Timeout exceeded while awaiting app exception callback from Analytics listener."
            r6.k(r7)     // Catch:{ InterruptedException -> 0x0061 }
            goto L_0x006a
        L_0x0061:
            Nb.g r6 = Nb.g.f()     // Catch:{ all -> 0x0055 }
            java.lang.String r7 = "Interrupted while awaiting app exception callback from Analytics listener."
            r6.d(r7)     // Catch:{ all -> 0x0055 }
        L_0x006a:
            r6 = 0
            r5.f62054e = r6     // Catch:{ all -> 0x0055 }
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            return
        L_0x006f:
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Ob.c.a(java.lang.String, android.os.Bundle):void");
    }

    public void w(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.f62054e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
