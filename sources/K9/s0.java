package K9;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashMap;
import java.util.Map;

final class s0 implements ServiceConnection, w0 {

    /* renamed from: a  reason: collision with root package name */
    private final Map f37911a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private int f37912b = 2;

    /* renamed from: c  reason: collision with root package name */
    private boolean f37913c;

    /* renamed from: d  reason: collision with root package name */
    private IBinder f37914d;

    /* renamed from: e  reason: collision with root package name */
    private final r0 f37915e;

    /* renamed from: f  reason: collision with root package name */
    private ComponentName f37916f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ v0 f37917g;

    public s0(v0 v0Var, r0 r0Var) {
        this.f37917g = v0Var;
        this.f37915e = r0Var;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:9|10|11|12|13|14|15) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x005e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* bridge */ /* synthetic */ com.google.android.gms.common.ConnectionResult d(K9.s0 r9, java.lang.String r10, java.util.concurrent.Executor r11) {
        /*
            K9.r0 r0 = r9.f37915e     // Catch:{ f0 -> 0x006a }
            K9.v0 r1 = r9.f37917g     // Catch:{ f0 -> 0x006a }
            android.content.Context r1 = r1.f37930h     // Catch:{ f0 -> 0x006a }
            android.content.Intent r5 = r0.b(r1)     // Catch:{ f0 -> 0x006a }
            r0 = 3
            r9.f37912b = r0
            android.os.StrictMode$VmPolicy r0 = com.google.android.gms.common.util.v.a()
            K9.v0 r1 = r9.f37917g     // Catch:{ all -> 0x004c }
            Q9.b r2 = r1.f37933k     // Catch:{ all -> 0x004c }
            android.content.Context r3 = r1.f37930h     // Catch:{ all -> 0x004c }
            r7 = 4225(0x1081, float:5.92E-42)
            r4 = r10
            r6 = r9
            r8 = r11
            boolean r10 = r2.d(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x004c }
            r9.f37913c = r10     // Catch:{ all -> 0x004c }
            if (r10 == 0) goto L_0x004e
            K9.v0 r10 = r9.f37917g     // Catch:{ all -> 0x004c }
            android.os.Handler r10 = r10.f37931i     // Catch:{ all -> 0x004c }
            K9.r0 r11 = r9.f37915e     // Catch:{ all -> 0x004c }
            r1 = 1
            android.os.Message r10 = r10.obtainMessage(r1, r11)     // Catch:{ all -> 0x004c }
            K9.v0 r11 = r9.f37917g     // Catch:{ all -> 0x004c }
            android.os.Handler r11 = r11.f37931i     // Catch:{ all -> 0x004c }
            K9.v0 r9 = r9.f37917g     // Catch:{ all -> 0x004c }
            long r1 = r9.f37935m     // Catch:{ all -> 0x004c }
            r11.sendMessageDelayed(r10, r1)     // Catch:{ all -> 0x004c }
            com.google.android.gms.common.ConnectionResult r9 = com.google.android.gms.common.ConnectionResult.f47963e     // Catch:{ all -> 0x004c }
        L_0x0048:
            android.os.StrictMode.setVmPolicy(r0)
            goto L_0x006d
        L_0x004c:
            r9 = move-exception
            goto L_0x0066
        L_0x004e:
            r10 = 2
            r9.f37912b = r10     // Catch:{ all -> 0x004c }
            K9.v0 r10 = r9.f37917g     // Catch:{ IllegalArgumentException -> 0x005e }
            Q9.b r11 = r10.f37933k     // Catch:{ IllegalArgumentException -> 0x005e }
            android.content.Context r10 = r10.f37930h     // Catch:{ IllegalArgumentException -> 0x005e }
            r11.c(r10, r9)     // Catch:{ IllegalArgumentException -> 0x005e }
        L_0x005e:
            com.google.android.gms.common.ConnectionResult r9 = new com.google.android.gms.common.ConnectionResult     // Catch:{ all -> 0x004c }
            r10 = 16
            r9.<init>(r10)     // Catch:{ all -> 0x004c }
            goto L_0x0048
        L_0x0066:
            android.os.StrictMode.setVmPolicy(r0)
            throw r9
        L_0x006a:
            r9 = move-exception
            com.google.android.gms.common.ConnectionResult r9 = r9.f37847a
        L_0x006d:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: K9.s0.d(K9.s0, java.lang.String, java.util.concurrent.Executor):com.google.android.gms.common.ConnectionResult");
    }

    public final int a() {
        return this.f37912b;
    }

    public final ComponentName b() {
        return this.f37916f;
    }

    public final IBinder c() {
        return this.f37914d;
    }

    public final void e(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f37911a.put(serviceConnection, serviceConnection2);
    }

    public final void f(ServiceConnection serviceConnection, String str) {
        this.f37911a.remove(serviceConnection);
    }

    public final void g(String str) {
        this.f37917g.f37931i.removeMessages(1, this.f37915e);
        v0 v0Var = this.f37917g;
        v0Var.f37933k.c(v0Var.f37930h, this);
        this.f37913c = false;
        this.f37912b = 2;
    }

    public final boolean h(ServiceConnection serviceConnection) {
        return this.f37911a.containsKey(serviceConnection);
    }

    public final boolean i() {
        return this.f37911a.isEmpty();
    }

    public final boolean j() {
        return this.f37913c;
    }

    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f37917g.f37929g) {
            try {
                this.f37917g.f37931i.removeMessages(1, this.f37915e);
                this.f37914d = iBinder;
                this.f37916f = componentName;
                for (ServiceConnection onServiceConnected : this.f37911a.values()) {
                    onServiceConnected.onServiceConnected(componentName, iBinder);
                }
                this.f37912b = 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f37917g.f37929g) {
            try {
                this.f37917g.f37931i.removeMessages(1, this.f37915e);
                this.f37914d = null;
                this.f37916f = componentName;
                for (ServiceConnection onServiceDisconnected : this.f37911a.values()) {
                    onServiceDisconnected.onServiceDisconnected(componentName);
                }
                this.f37912b = 2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
