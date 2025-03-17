package com.google.android.gms.measurement.internal;

import K9.C6604c;
import K9.C6620s;
import Q9.b;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import sa.C8755h;

public final class S4 implements ServiceConnection, C6604c.a, C6604c.b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f49952a;

    /* renamed from: b  reason: collision with root package name */
    private volatile C7600g2 f49953b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ C7685s4 f49954c;

    protected S4(C7685s4 s4Var) {
        this.f49954c = s4Var;
    }

    public final void a() {
        this.f49954c.k();
        Context zza = this.f49954c.zza();
        synchronized (this) {
            try {
                if (this.f49952a) {
                    this.f49954c.f().I().a("Connection attempt already in progress");
                } else if (this.f49953b == null || (!this.f49953b.c() && !this.f49953b.l())) {
                    this.f49953b = new C7600g2(zza, Looper.getMainLooper(), this, this);
                    this.f49954c.f().I().a("Connecting to remote service");
                    this.f49952a = true;
                    C6620s.l(this.f49953b);
                    this.f49953b.q();
                } else {
                    this.f49954c.f().I().a("Already awaiting connection attempt");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(Intent intent) {
        this.f49954c.k();
        Context zza = this.f49954c.zza();
        b b10 = b.b();
        synchronized (this) {
            try {
                if (this.f49952a) {
                    this.f49954c.f().I().a("Connection attempt already in progress");
                    return;
                }
                this.f49954c.f().I().a("Using local app measurement service");
                this.f49952a = true;
                b10.a(zza, intent, this.f49954c.f50392c, 129);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        if (this.f49953b != null && (this.f49953b.l() || this.f49953b.c())) {
            this.f49953b.k();
        }
        this.f49953b = null;
    }

    public final void onConnected(Bundle bundle) {
        C6620s.e("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                C6620s.l(this.f49953b);
                this.f49954c.q().B(new T4(this, (C8755h) this.f49953b.D()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f49953b = null;
                this.f49952a = false;
            }
        }
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        C6620s.e("MeasurementServiceConnection.onConnectionFailed");
        C7607h2 D10 = this.f49954c.f50228a.D();
        if (D10 != null) {
            D10.J().b("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.f49952a = false;
            this.f49953b = null;
        }
        this.f49954c.q().B(new V4(this));
    }

    public final void onConnectionSuspended(int i10) {
        C6620s.e("MeasurementServiceConnection.onConnectionSuspended");
        this.f49954c.f().D().a("Service connection suspended");
        this.f49954c.q().B(new W4(this));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r3.f49954c.f().E().a("Service connect failed to get IMeasurementService");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0060 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
        /*
            r3 = this;
            java.lang.String r4 = "MeasurementServiceConnection.onServiceConnected"
            K9.C6620s.e(r4)
            monitor-enter(r3)
            r4 = 0
            if (r5 != 0) goto L_0x001f
            r3.f49952a = r4     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.s4 r4 = r3.f49954c     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.h2 r4 = r4.f()     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.i2 r4 = r4.E()     // Catch:{ all -> 0x001c }
            java.lang.String r5 = "Service connected with null binder"
            r4.a(r5)     // Catch:{ all -> 0x001c }
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            return
        L_0x001c:
            r4 = move-exception
            goto L_0x0097
        L_0x001f:
            r0 = 0
            java.lang.String r1 = r5.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x0060 }
            java.lang.String r2 = "com.google.android.gms.measurement.internal.IMeasurementService"
            boolean r2 = r2.equals(r1)     // Catch:{ RemoteException -> 0x0060 }
            if (r2 == 0) goto L_0x0050
            java.lang.String r1 = "com.google.android.gms.measurement.internal.IMeasurementService"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x0060 }
            boolean r2 = r1 instanceof sa.C8755h     // Catch:{ RemoteException -> 0x0060 }
            if (r2 == 0) goto L_0x003a
            sa.h r1 = (sa.C8755h) r1     // Catch:{ RemoteException -> 0x0060 }
        L_0x0038:
            r0 = r1
            goto L_0x0040
        L_0x003a:
            com.google.android.gms.measurement.internal.a2 r1 = new com.google.android.gms.measurement.internal.a2     // Catch:{ RemoteException -> 0x0060 }
            r1.<init>(r5)     // Catch:{ RemoteException -> 0x0060 }
            goto L_0x0038
        L_0x0040:
            com.google.android.gms.measurement.internal.s4 r5 = r3.f49954c     // Catch:{ RemoteException -> 0x0060 }
            com.google.android.gms.measurement.internal.h2 r5 = r5.f()     // Catch:{ RemoteException -> 0x0060 }
            com.google.android.gms.measurement.internal.i2 r5 = r5.I()     // Catch:{ RemoteException -> 0x0060 }
            java.lang.String r1 = "Bound to IMeasurementService interface"
            r5.a(r1)     // Catch:{ RemoteException -> 0x0060 }
            goto L_0x006f
        L_0x0050:
            com.google.android.gms.measurement.internal.s4 r5 = r3.f49954c     // Catch:{ RemoteException -> 0x0060 }
            com.google.android.gms.measurement.internal.h2 r5 = r5.f()     // Catch:{ RemoteException -> 0x0060 }
            com.google.android.gms.measurement.internal.i2 r5 = r5.E()     // Catch:{ RemoteException -> 0x0060 }
            java.lang.String r2 = "Got binder with a wrong descriptor"
            r5.b(r2, r1)     // Catch:{ RemoteException -> 0x0060 }
            goto L_0x006f
        L_0x0060:
            com.google.android.gms.measurement.internal.s4 r5 = r3.f49954c     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.h2 r5 = r5.f()     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.i2 r5 = r5.E()     // Catch:{ all -> 0x001c }
            java.lang.String r1 = "Service connect failed to get IMeasurementService"
            r5.a(r1)     // Catch:{ all -> 0x001c }
        L_0x006f:
            if (r0 != 0) goto L_0x0087
            r3.f49952a = r4     // Catch:{ all -> 0x001c }
            Q9.b r4 = Q9.b.b()     // Catch:{ IllegalArgumentException -> 0x0095 }
            com.google.android.gms.measurement.internal.s4 r5 = r3.f49954c     // Catch:{ IllegalArgumentException -> 0x0095 }
            android.content.Context r5 = r5.zza()     // Catch:{ IllegalArgumentException -> 0x0095 }
            com.google.android.gms.measurement.internal.s4 r0 = r3.f49954c     // Catch:{ IllegalArgumentException -> 0x0095 }
            com.google.android.gms.measurement.internal.S4 r0 = r0.f50392c     // Catch:{ IllegalArgumentException -> 0x0095 }
            r4.c(r5, r0)     // Catch:{ IllegalArgumentException -> 0x0095 }
            goto L_0x0095
        L_0x0087:
            com.google.android.gms.measurement.internal.s4 r4 = r3.f49954c     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.J2 r4 = r4.q()     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.R4 r5 = new com.google.android.gms.measurement.internal.R4     // Catch:{ all -> 0x001c }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x001c }
            r4.B(r5)     // Catch:{ all -> 0x001c }
        L_0x0095:
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            return
        L_0x0097:
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.S4.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C6620s.e("MeasurementServiceConnection.onServiceDisconnected");
        this.f49954c.f().D().a("Service disconnected");
        this.f49954c.q().B(new U4(this, componentName));
    }
}
