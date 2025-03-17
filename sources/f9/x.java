package F9;

import K9.C6620s;
import Q9.b;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import ba.C7089f;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

final class x implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    int f35599a = 0;

    /* renamed from: b  reason: collision with root package name */
    final Messenger f35600b = new Messenger(new C7089f(Looper.getMainLooper(), new u(this)));

    /* renamed from: c  reason: collision with root package name */
    y f35601c;

    /* renamed from: d  reason: collision with root package name */
    final Queue f35602d = new ArrayDeque();

    /* renamed from: e  reason: collision with root package name */
    final SparseArray f35603e = new SparseArray();

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ D f35604f;

    /* synthetic */ x(D d10, w wVar) {
        this.f35604f = d10;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(int i10, String str) {
        b(i10, str, (Throwable) null);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void b(int i10, String str, Throwable th2) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i11 = this.f35599a;
            if (i11 == 0) {
                throw new IllegalStateException();
            } else if (i11 == 1 || i11 == 2) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Unbinding service");
                }
                this.f35599a = 4;
                b.b().c(this.f35604f.f35548a, this);
                B b10 = new B(i10, str, th2);
                for (A c10 : this.f35602d) {
                    c10.c(b10);
                }
                this.f35602d.clear();
                for (int i12 = 0; i12 < this.f35603e.size(); i12++) {
                    ((A) this.f35603e.valueAt(i12)).c(b10);
                }
                this.f35603e.clear();
            } else if (i11 == 3) {
                this.f35599a = 4;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        this.f35604f.f35549b.execute(new r(this));
    }

    /* access modifiers changed from: package-private */
    public final synchronized void d() {
        if (this.f35599a == 1) {
            a(1, "Timed out while binding");
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void e(int i10) {
        A a10 = (A) this.f35603e.get(i10);
        if (a10 != null) {
            Log.w("MessengerIpcClient", "Timing out request: " + i10);
            this.f35603e.remove(i10);
            a10.c(new B(3, "Timed out waiting for response", (Throwable) null));
            f();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void f() {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.f35599a     // Catch:{ all -> 0x0026 }
            r1 = 2
            if (r0 != r1) goto L_0x003a
            java.util.Queue r0 = r2.f35602d     // Catch:{ all -> 0x0026 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0026 }
            if (r0 == 0) goto L_0x003a
            android.util.SparseArray r0 = r2.f35603e     // Catch:{ all -> 0x0026 }
            int r0 = r0.size()     // Catch:{ all -> 0x0026 }
            if (r0 != 0) goto L_0x003a
            java.lang.String r0 = "MessengerIpcClient"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x0026 }
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = "MessengerIpcClient"
            java.lang.String r1 = "Finished handling requests, unbinding"
            android.util.Log.v(r0, r1)     // Catch:{ all -> 0x0026 }
            goto L_0x0028
        L_0x0026:
            r0 = move-exception
            goto L_0x003c
        L_0x0028:
            r0 = 3
            r2.f35599a = r0     // Catch:{ all -> 0x0026 }
            F9.D r0 = r2.f35604f     // Catch:{ all -> 0x0026 }
            Q9.b r1 = Q9.b.b()     // Catch:{ all -> 0x0026 }
            android.content.Context r0 = r0.f35548a     // Catch:{ all -> 0x0026 }
            r1.c(r0, r2)     // Catch:{ all -> 0x0026 }
            monitor-exit(r2)
            return
        L_0x003a:
            monitor-exit(r2)
            return
        L_0x003c:
            monitor-exit(r2)     // Catch:{ all -> 0x0026 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: F9.x.f():void");
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean g(A a10) {
        int i10 = this.f35599a;
        if (i10 == 0) {
            this.f35602d.add(a10);
            C6620s.p(this.f35599a == 0);
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Starting bind to GmsCore");
            }
            this.f35599a = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            try {
                if (!b.b().a(this.f35604f.f35548a, intent, this, 1)) {
                    a(0, "Unable to bind to service");
                } else {
                    this.f35604f.f35549b.schedule(new s(this), 30, TimeUnit.SECONDS);
                }
            } catch (SecurityException e10) {
                b(0, "Unable to bind to service", e10);
            }
        } else if (i10 == 1) {
            this.f35602d.add(a10);
            return true;
        } else if (i10 != 2) {
            return false;
        } else {
            this.f35602d.add(a10);
            c();
            return true;
        }
        return true;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.f35604f.f35549b.execute(new q(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.f35604f.f35549b.execute(new t(this));
    }
}
