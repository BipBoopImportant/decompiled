package K9;

import Q9.b;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import ca.C7112f;
import java.util.HashMap;
import java.util.concurrent.Executor;

final class v0 extends C6611i {
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f37929g = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final Context f37930h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public volatile Handler f37931i;

    /* renamed from: j  reason: collision with root package name */
    private final t0 f37932j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final b f37933k;

    /* renamed from: l  reason: collision with root package name */
    private final long f37934l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final long f37935m;

    /* renamed from: n  reason: collision with root package name */
    private volatile Executor f37936n;

    v0(Context context, Looper looper, Executor executor) {
        t0 t0Var = new t0(this, (u0) null);
        this.f37932j = t0Var;
        this.f37930h = context.getApplicationContext();
        this.f37931i = new C7112f(looper, t0Var);
        this.f37933k = b.b();
        this.f37934l = 5000;
        this.f37935m = 300000;
        this.f37936n = executor;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006c, code lost:
        return r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.common.ConnectionResult d(K9.r0 r5, android.content.ServiceConnection r6, java.lang.String r7, java.util.concurrent.Executor r8) {
        /*
            r4 = this;
            java.lang.String r0 = "ServiceConnection must not be null"
            K9.C6620s.m(r6, r0)
            java.util.HashMap r0 = r4.f37929g
            monitor-enter(r0)
            java.util.HashMap r1 = r4.f37929g     // Catch:{ all -> 0x0015 }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0015 }
            K9.s0 r1 = (K9.s0) r1     // Catch:{ all -> 0x0015 }
            if (r8 != 0) goto L_0x0018
            java.util.concurrent.Executor r8 = r4.f37936n     // Catch:{ all -> 0x0015 }
            goto L_0x0018
        L_0x0015:
            r5 = move-exception
            goto L_0x0088
        L_0x0018:
            if (r1 != 0) goto L_0x002c
            K9.s0 r1 = new K9.s0     // Catch:{ all -> 0x0015 }
            r1.<init>(r4, r5)     // Catch:{ all -> 0x0015 }
            r1.e(r6, r6, r7)     // Catch:{ all -> 0x0015 }
            com.google.android.gms.common.ConnectionResult r6 = K9.s0.d(r1, r7, r8)     // Catch:{ all -> 0x0015 }
            java.util.HashMap r7 = r4.f37929g     // Catch:{ all -> 0x0015 }
            r7.put(r5, r1)     // Catch:{ all -> 0x0015 }
            goto L_0x0059
        L_0x002c:
            android.os.Handler r2 = r4.f37931i     // Catch:{ all -> 0x0015 }
            r3 = 0
            r2.removeMessages(r3, r5)     // Catch:{ all -> 0x0015 }
            boolean r2 = r1.h(r6)     // Catch:{ all -> 0x0015 }
            if (r2 != 0) goto L_0x006d
            r1.e(r6, r6, r7)     // Catch:{ all -> 0x0015 }
            int r5 = r1.a()     // Catch:{ all -> 0x0015 }
            r2 = 1
            r3 = 0
            if (r5 == r2) goto L_0x004d
            r6 = 2
            if (r5 == r6) goto L_0x0048
        L_0x0046:
            r6 = r3
            goto L_0x0059
        L_0x0048:
            com.google.android.gms.common.ConnectionResult r6 = K9.s0.d(r1, r7, r8)     // Catch:{ all -> 0x0015 }
            goto L_0x0059
        L_0x004d:
            android.content.ComponentName r5 = r1.b()     // Catch:{ all -> 0x0015 }
            android.os.IBinder r7 = r1.c()     // Catch:{ all -> 0x0015 }
            r6.onServiceConnected(r5, r7)     // Catch:{ all -> 0x0015 }
            goto L_0x0046
        L_0x0059:
            boolean r5 = r1.j()     // Catch:{ all -> 0x0015 }
            if (r5 == 0) goto L_0x0063
            com.google.android.gms.common.ConnectionResult r5 = com.google.android.gms.common.ConnectionResult.f47963e     // Catch:{ all -> 0x0015 }
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            return r5
        L_0x0063:
            if (r6 != 0) goto L_0x006b
            com.google.android.gms.common.ConnectionResult r6 = new com.google.android.gms.common.ConnectionResult     // Catch:{ all -> 0x0015 }
            r5 = -1
            r6.<init>(r5)     // Catch:{ all -> 0x0015 }
        L_0x006b:
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            return r6
        L_0x006d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0015 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0015 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0015 }
            r7.<init>()     // Catch:{ all -> 0x0015 }
            java.lang.String r8 = "Trying to bind a GmsServiceConnection that was already connected before.  config="
            r7.append(r8)     // Catch:{ all -> 0x0015 }
            r7.append(r5)     // Catch:{ all -> 0x0015 }
            java.lang.String r5 = r7.toString()     // Catch:{ all -> 0x0015 }
            r6.<init>(r5)     // Catch:{ all -> 0x0015 }
            throw r6     // Catch:{ all -> 0x0015 }
        L_0x0088:
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: K9.v0.d(K9.r0, android.content.ServiceConnection, java.lang.String, java.util.concurrent.Executor):com.google.android.gms.common.ConnectionResult");
    }

    /* access modifiers changed from: protected */
    public final void e(r0 r0Var, ServiceConnection serviceConnection, String str) {
        C6620s.m(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f37929g) {
            try {
                s0 s0Var = (s0) this.f37929g.get(r0Var);
                if (s0Var == null) {
                    String obj = r0Var.toString();
                    throw new IllegalStateException("Nonexistent connection status for service config: " + obj);
                } else if (s0Var.h(serviceConnection)) {
                    s0Var.f(serviceConnection, str);
                    if (s0Var.i()) {
                        this.f37931i.sendMessageDelayed(this.f37931i.obtainMessage(0, r0Var), this.f37934l);
                    }
                } else {
                    String obj2 = r0Var.toString();
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + obj2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
