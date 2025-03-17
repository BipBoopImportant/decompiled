package com.google.android.gms.measurement.internal;

import K9.C6620s;
import L9.a;
import Q9.b;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.d;
import com.google.android.gms.common.util.e;
import com.google.android.gms.internal.measurement.V0;
import com.google.ar.core.ImageMetadata;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import sa.C8750c;
import sa.C8755h;
import sa.a0;
import sa.b0;
import sa.c0;
import sa.d0;
import sa.e0;
import sa.k0;

/* renamed from: com.google.android.gms.measurement.internal.s4  reason: case insensitive filesystem */
public final class C7685s4 extends B1 {
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final S4 f50392c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public C8755h f50393d;

    /* renamed from: e  reason: collision with root package name */
    private volatile Boolean f50394e;

    /* renamed from: f  reason: collision with root package name */
    private final A f50395f;

    /* renamed from: g  reason: collision with root package name */
    private final C7652n5 f50396g;

    /* renamed from: h  reason: collision with root package name */
    private final List<Runnable> f50397h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private final A f50398i;

    protected C7685s4(P2 p22) {
        super(p22);
        this.f50396g = new C7652n5(p22.zzb());
        this.f50392c = new S4(this);
        this.f50395f = new C7699u4(this, p22);
        this.f50398i = new F4(this, p22);
    }

    static /* synthetic */ void K(C7685s4 s4Var, ComponentName componentName) {
        s4Var.k();
        if (s4Var.f50393d != null) {
            s4Var.f50393d = null;
            s4Var.f().I().b("Disconnected from device MeasurementService", componentName);
            s4Var.k();
            s4Var.d0();
        }
    }

    public static /* synthetic */ void L(C7685s4 s4Var, E5 e52, C7583e eVar) {
        C8755h hVar = s4Var.f50393d;
        if (hVar == null) {
            s4Var.f().E().a("[sgtm] Discarding data. Failed to update batch upload status.");
            return;
        }
        try {
            hVar.t3(e52, eVar);
            s4Var.o0();
        } catch (RemoteException e10) {
            s4Var.f().E().c("[sgtm] Failed to update batch upload status, rowId, exception", Long.valueOf(eVar.f50114a), e10);
        }
    }

    public static /* synthetic */ void M(C7685s4 s4Var, AtomicReference atomicReference, E5 e52, Bundle bundle) {
        synchronized (atomicReference) {
            try {
                C8755h hVar = s4Var.f50393d;
                if (hVar == null) {
                    s4Var.f().E().a("Failed to request trigger URIs; not connected to service");
                    return;
                }
                C6620s.l(e52);
                hVar.O0(e52, bundle, new C7720x4(s4Var, atomicReference));
                s4Var.o0();
            } catch (RemoteException e10) {
                s4Var.f().E().b("Failed to request trigger URIs; remote exception", e10);
                atomicReference.notifyAll();
            }
        }
    }

    public static /* synthetic */ void N(C7685s4 s4Var, AtomicReference atomicReference, E5 e52, k0 k0Var) {
        synchronized (atomicReference) {
            try {
                C8755h hVar = s4Var.f50393d;
                if (hVar == null) {
                    s4Var.f().E().a("[sgtm] Failed to get upload batches; not connected to service");
                    return;
                }
                C6620s.l(e52);
                hVar.H3(e52, k0Var, new C7734z4(s4Var, atomicReference));
                s4Var.o0();
            } catch (RemoteException e10) {
                s4Var.f().E().b("[sgtm] Failed to get upload batches; remote exception", e10);
                atomicReference.notifyAll();
            }
        }
    }

    private final void Q(Runnable runnable) {
        k();
        if (i0()) {
            runnable.run();
        } else if (((long) this.f50397h.size()) >= 1000) {
            f().E().a("Discarding data. Max runnable queue size reached");
        } else {
            this.f50397h.add(runnable);
            this.f50398i.b(60000);
            d0();
        }
    }

    /* access modifiers changed from: private */
    public final void n0() {
        k();
        f().I().b("Processing queued up service tasks", Integer.valueOf(this.f50397h.size()));
        for (Runnable run : this.f50397h) {
            try {
                run.run();
            } catch (RuntimeException e10) {
                f().E().b("Task exception while flushing queue", e10);
            }
        }
        this.f50397h.clear();
        this.f50398i.a();
    }

    /* access modifiers changed from: private */
    public final void o0() {
        k();
        this.f50396g.c();
        this.f50395f.b(K.f49730U.a(null).longValue());
    }

    private final E5 r0(boolean z10) {
        return m().A(z10 ? f().M() : null);
    }

    public static /* synthetic */ void s0(C7685s4 s4Var) {
        C8755h hVar = s4Var.f50393d;
        if (hVar == null) {
            s4Var.f().E().a("Failed to send storage consent settings to service");
            return;
        }
        try {
            E5 r02 = s4Var.r0(false);
            C6620s.l(r02);
            hVar.X2(r02);
            s4Var.o0();
        } catch (RemoteException e10) {
            s4Var.f().E().b("Failed to send storage consent settings to the service", e10);
        }
    }

    public static /* synthetic */ void t0(C7685s4 s4Var) {
        C8755h hVar = s4Var.f50393d;
        if (hVar == null) {
            s4Var.f().E().a("Failed to send Dma consent settings to service");
            return;
        }
        try {
            E5 r02 = s4Var.r0(false);
            C6620s.l(r02);
            hVar.B3(r02);
            s4Var.o0();
        } catch (RemoteException e10) {
            s4Var.f().E().b("Failed to send Dma consent settings to the service", e10);
        }
    }

    static /* synthetic */ void v0(C7685s4 s4Var) {
        s4Var.k();
        if (s4Var.i0()) {
            s4Var.f().I().a("Inactivity, disconnecting from the service");
            s4Var.e0();
        }
    }

    public final void B(Bundle bundle) {
        k();
        w();
        Q(new G4(this, r0(false), bundle));
    }

    public final void C(V0 v02) {
        k();
        w();
        Q(new D4(this, r0(false), v02));
    }

    public final void D(V0 v02, J j10, String str) {
        k();
        w();
        if (h().s(d.f48050a) != 0) {
            f().J().a("Not bundling data. Service unavailable or out of date");
            h().T(v02, new byte[0]);
            return;
        }
        Q(new K4(this, j10, str, v02));
    }

    /* access modifiers changed from: protected */
    public final void E(V0 v02, String str, String str2) {
        k();
        w();
        Q(new Q4(this, str, str2, r0(false), v02));
    }

    /* access modifiers changed from: protected */
    public final void F(V0 v02, String str, String str2, boolean z10) {
        k();
        w();
        Q(new C7706v4(this, str, str2, r0(false), z10, v02));
    }

    /* access modifiers changed from: protected */
    public final void G(C7583e eVar) {
        k();
        w();
        E5 r02 = r0(true);
        C6620s.l(r02);
        Q(new d0(this, r02, eVar));
    }

    /* access modifiers changed from: protected */
    public final void H(C7597g gVar) {
        C6620s.l(gVar);
        k();
        w();
        Q(new O4(this, true, r0(true), n().D(gVar), new C7597g(gVar), gVar));
    }

    /* access modifiers changed from: protected */
    public final void I(J j10, String str) {
        C6620s.l(j10);
        k();
        w();
        Q(new L4(this, true, r0(true), n().E(j10), j10, str));
    }

    /* access modifiers changed from: protected */
    public final void J(C7630k4 k4Var) {
        k();
        w();
        Q(new H4(this, k4Var));
    }

    /* access modifiers changed from: protected */
    public final void P(P5 p52) {
        k();
        w();
        Q(new C7727y4(this, r0(true), n().F(p52), p52));
    }

    public final void R(AtomicReference<String> atomicReference) {
        k();
        w();
        Q(new A4(this, atomicReference, r0(false)));
    }

    /* access modifiers changed from: protected */
    public final void S(AtomicReference<List<C7645m5>> atomicReference, Bundle bundle) {
        k();
        w();
        E5 r02 = r0(false);
        if (a().r(K.f49756e1)) {
            Q(new c0(this, atomicReference, r02, bundle));
        } else {
            Q(new C7713w4(this, atomicReference, r02, bundle));
        }
    }

    /* access modifiers changed from: protected */
    public final void T(AtomicReference<List<C7597g>> atomicReference, String str, String str2, String str3) {
        k();
        w();
        Q(new N4(this, atomicReference, str, str2, str3, r0(false)));
    }

    /* access modifiers changed from: protected */
    public final void U(AtomicReference<List<P5>> atomicReference, String str, String str2, String str3, boolean z10) {
        k();
        w();
        Q(new P4(this, atomicReference, str, str2, str3, r0(false), z10));
    }

    /* access modifiers changed from: protected */
    public final void V(AtomicReference<C7707v5> atomicReference, k0 k0Var) {
        k();
        w();
        Q(new e0(this, atomicReference, r0(false), k0Var));
    }

    /* access modifiers changed from: protected */
    public final void W(C8755h hVar) {
        k();
        C6620s.l(hVar);
        this.f50393d = hVar;
        o0();
        n0();
    }

    /* access modifiers changed from: package-private */
    public final void X(C8755h hVar, a aVar, E5 e52) {
        int i10;
        long j10;
        long j11;
        long j12;
        C8755h hVar2 = hVar;
        a aVar2 = aVar;
        E5 e53 = e52;
        k();
        w();
        int i11 = 100;
        int i12 = 100;
        int i13 = 0;
        while (i13 < 1001 && i12 == i11) {
            ArrayList arrayList = new ArrayList();
            List<a> B10 = n().B(i11);
            if (B10 != null) {
                arrayList.addAll(B10);
                i10 = B10.size();
            } else {
                i10 = 0;
            }
            if (aVar2 != null && i10 < i11) {
                arrayList.add(aVar2);
            }
            boolean r10 = a().r(K.f49721P0);
            int size = arrayList.size();
            int i14 = 0;
            while (i14 < size) {
                int i15 = i14 + 1;
                a aVar3 = (a) arrayList.get(i14);
                if (aVar3 instanceof J) {
                    if (r10) {
                        try {
                            j12 = this.f50228a.zzb().a();
                            try {
                                j11 = this.f50228a.zzb().c();
                            } catch (RemoteException e10) {
                                e = e10;
                                j11 = 0;
                                j10 = j12;
                                f().E().b("Failed to send event to the service", e);
                                C7593f2.a(this.f50228a).b(36301, 13, j10, this.f50228a.zzb().a(), (int) (this.f50228a.zzb().c() - j11));
                                i14 = i15;
                            }
                        } catch (RemoteException e11) {
                            e = e11;
                            j11 = 0;
                            j10 = 0;
                            f().E().b("Failed to send event to the service", e);
                            if (r10 && j10 != 0) {
                                C7593f2.a(this.f50228a).b(36301, 13, j10, this.f50228a.zzb().a(), (int) (this.f50228a.zzb().c() - j11));
                            }
                            i14 = i15;
                        }
                    } else {
                        j12 = 0;
                        j11 = 0;
                    }
                    try {
                        hVar2.K2((J) aVar3, e53);
                        if (r10) {
                            f().I().a("Logging telemetry for logEvent from database");
                            C7593f2.a(this.f50228a).b(36301, 0, j12, this.f50228a.zzb().a(), (int) (this.f50228a.zzb().c() - j11));
                        }
                    } catch (RemoteException e12) {
                        e = e12;
                        j10 = j12;
                        f().E().b("Failed to send event to the service", e);
                        C7593f2.a(this.f50228a).b(36301, 13, j10, this.f50228a.zzb().a(), (int) (this.f50228a.zzb().c() - j11));
                        i14 = i15;
                    }
                } else if (aVar3 instanceof P5) {
                    try {
                        hVar2.v3((P5) aVar3, e53);
                    } catch (RemoteException e13) {
                        f().E().b("Failed to send user property to the service", e13);
                    }
                } else if (aVar3 instanceof C7597g) {
                    try {
                        hVar2.p1((C7597g) aVar3, e53);
                    } catch (RemoteException e14) {
                        f().E().b("Failed to send conditional user property to the service", e14);
                    }
                } else {
                    f().E().a("Discarding data. Unrecognized parcel type.");
                }
                i14 = i15;
            }
            i13++;
            i12 = i10;
            i11 = 100;
        }
    }

    /* access modifiers changed from: protected */
    public final void Y(boolean z10) {
        k();
        w();
        if (k0()) {
            Q(new M4(this, r0(false)));
        }
    }

    /* access modifiers changed from: protected */
    public final C8750c Z() {
        k();
        w();
        C8755h hVar = this.f50393d;
        if (hVar == null) {
            d0();
            f().D().a("Failed to get consents; not connected to service yet.");
            return null;
        }
        E5 r02 = r0(false);
        C6620s.l(r02);
        try {
            C8750c h22 = hVar.h2(r02);
            o0();
            return h22;
        } catch (RemoteException e10) {
            f().E().b("Failed to get consents; remote exception", e10);
            return null;
        }
    }

    public final /* bridge */ /* synthetic */ C7611i a() {
        return super.a();
    }

    /* access modifiers changed from: package-private */
    public final Boolean a0() {
        return this.f50394e;
    }

    public final /* bridge */ /* synthetic */ E b() {
        return super.b();
    }

    /* access modifiers changed from: protected */
    public final void b0() {
        k();
        w();
        Q(new E4(this, r0(true)));
    }

    /* access modifiers changed from: protected */
    public final void c0() {
        k();
        w();
        E5 r02 = r0(true);
        n().H();
        Q(new C4(this, r02));
    }

    public final /* bridge */ /* synthetic */ C7586e2 d() {
        return super.d();
    }

    /* access modifiers changed from: package-private */
    public final void d0() {
        k();
        w();
        if (!i0()) {
            if (m0()) {
                this.f50392c.a();
            } else if (!a().X()) {
                List<ResolveInfo> queryIntentServices = zza().getPackageManager().queryIntentServices(new Intent().setClassName(zza(), "com.google.android.gms.measurement.AppMeasurementService"), ImageMetadata.CONTROL_AE_ANTIBANDING_MODE);
                if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                    f().E().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                    return;
                }
                Intent intent = new Intent("com.google.android.gms.measurement.START");
                intent.setComponent(new ComponentName(zza(), "com.google.android.gms.measurement.AppMeasurementService"));
                this.f50392c.b(intent);
            }
        }
    }

    public final /* bridge */ /* synthetic */ C7683s2 e() {
        return super.e();
    }

    public final void e0() {
        k();
        w();
        this.f50392c.d();
        try {
            b.b().c(zza(), this.f50392c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f50393d = null;
    }

    public final /* bridge */ /* synthetic */ C7607h2 f() {
        return super.f();
    }

    /* access modifiers changed from: protected */
    public final void f0() {
        k();
        w();
        E5 r02 = r0(false);
        n().G();
        Q(new B4(this, r02));
    }

    public final /* bridge */ /* synthetic */ C7595f4 g() {
        return super.g();
    }

    /* access modifiers changed from: protected */
    public final void g0() {
        k();
        w();
        Q(new a0(this));
    }

    public final /* bridge */ /* synthetic */ Q5 h() {
        return super.h();
    }

    /* access modifiers changed from: protected */
    public final void h0() {
        k();
        w();
        Q(new J4(this, r0(true)));
    }

    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    public final boolean i0() {
        k();
        w();
        return this.f50393d != null;
    }

    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    /* access modifiers changed from: package-private */
    public final boolean j0() {
        k();
        w();
        return !m0() || h().F0() >= 200900;
    }

    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    /* access modifiers changed from: package-private */
    public final boolean k0() {
        k();
        w();
        return !m0() || h().F0() >= K.f49699E0.a(null).intValue();
    }

    public final /* bridge */ /* synthetic */ C7555a l() {
        return super.l();
    }

    /* access modifiers changed from: package-private */
    public final boolean l0() {
        k();
        w();
        return !m0() || h().F0() >= 241200;
    }

    public final /* bridge */ /* synthetic */ C7565b2 m() {
        return super.m();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m0() {
        /*
            r5 = this;
            r5.k()
            r5.w()
            java.lang.Boolean r0 = r5.f50394e
            if (r0 != 0) goto L_0x0103
            r5.k()
            r5.w()
            com.google.android.gms.measurement.internal.s2 r0 = r5.e()
            java.lang.Boolean r0 = r0.L()
            r1 = 1
            if (r0 == 0) goto L_0x0023
            boolean r2 = r0.booleanValue()
            if (r2 == 0) goto L_0x0023
            goto L_0x00fd
        L_0x0023:
            com.google.android.gms.measurement.internal.b2 r2 = r5.m()
            int r2 = r2.B()
            r3 = 0
            if (r2 != r1) goto L_0x0031
        L_0x002e:
            r0 = r1
            goto L_0x00d9
        L_0x0031:
            com.google.android.gms.measurement.internal.h2 r2 = r5.f()
            com.google.android.gms.measurement.internal.i2 r2 = r2.I()
            java.lang.String r4 = "Checking service availability"
            r2.a(r4)
            com.google.android.gms.measurement.internal.Q5 r2 = r5.h()
            r4 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r2 = r2.s(r4)
            if (r2 == 0) goto L_0x00ca
            if (r2 == r1) goto L_0x00bc
            r4 = 2
            if (r2 == r4) goto L_0x009a
            r0 = 3
            if (r2 == r0) goto L_0x008c
            r0 = 9
            if (r2 == r0) goto L_0x007e
            r0 = 18
            if (r2 == r0) goto L_0x0070
            com.google.android.gms.measurement.internal.h2 r0 = r5.f()
            com.google.android.gms.measurement.internal.i2 r0 = r0.J()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.String r2 = "Unexpected service status"
            r0.b(r2, r1)
        L_0x006c:
            r0 = r3
            r1 = r0
            goto L_0x00d9
        L_0x0070:
            com.google.android.gms.measurement.internal.h2 r0 = r5.f()
            com.google.android.gms.measurement.internal.i2 r0 = r0.J()
            java.lang.String r2 = "Service updating"
            r0.a(r2)
            goto L_0x002e
        L_0x007e:
            com.google.android.gms.measurement.internal.h2 r0 = r5.f()
            com.google.android.gms.measurement.internal.i2 r0 = r0.J()
            java.lang.String r1 = "Service invalid"
            r0.a(r1)
            goto L_0x006c
        L_0x008c:
            com.google.android.gms.measurement.internal.h2 r0 = r5.f()
            com.google.android.gms.measurement.internal.i2 r0 = r0.J()
            java.lang.String r1 = "Service disabled"
            r0.a(r1)
            goto L_0x006c
        L_0x009a:
            com.google.android.gms.measurement.internal.h2 r2 = r5.f()
            com.google.android.gms.measurement.internal.i2 r2 = r2.D()
            java.lang.String r4 = "Service container out of date"
            r2.a(r4)
            com.google.android.gms.measurement.internal.Q5 r2 = r5.h()
            int r2 = r2.F0()
            r4 = 17443(0x4423, float:2.4443E-41)
            if (r2 >= r4) goto L_0x00b6
        L_0x00b3:
            r0 = r1
            r1 = r3
            goto L_0x00d9
        L_0x00b6:
            if (r0 != 0) goto L_0x00b9
            goto L_0x00ba
        L_0x00b9:
            r1 = r3
        L_0x00ba:
            r0 = r3
            goto L_0x00d9
        L_0x00bc:
            com.google.android.gms.measurement.internal.h2 r0 = r5.f()
            com.google.android.gms.measurement.internal.i2 r0 = r0.I()
            java.lang.String r2 = "Service missing"
            r0.a(r2)
            goto L_0x00b3
        L_0x00ca:
            com.google.android.gms.measurement.internal.h2 r0 = r5.f()
            com.google.android.gms.measurement.internal.i2 r0 = r0.I()
            java.lang.String r2 = "Service available"
            r0.a(r2)
            goto L_0x002e
        L_0x00d9:
            if (r1 != 0) goto L_0x00f3
            com.google.android.gms.measurement.internal.i r2 = r5.a()
            boolean r2 = r2.X()
            if (r2 == 0) goto L_0x00f3
            com.google.android.gms.measurement.internal.h2 r0 = r5.f()
            com.google.android.gms.measurement.internal.i2 r0 = r0.E()
            java.lang.String r2 = "No way to upload. Consider using the full version of Analytics"
            r0.a(r2)
            goto L_0x00f4
        L_0x00f3:
            r3 = r0
        L_0x00f4:
            if (r3 == 0) goto L_0x00fd
            com.google.android.gms.measurement.internal.s2 r0 = r5.e()
            r0.u(r1)
        L_0x00fd:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r5.f50394e = r0
        L_0x0103:
            java.lang.Boolean r0 = r5.f50394e
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7685s4.m0():boolean");
    }

    public final /* bridge */ /* synthetic */ C7579d2 n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ C7691t3 o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ C7616i4 p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ J2 q() {
        return super.q();
    }

    /* access modifiers changed from: protected */
    public final void q0(boolean z10) {
        k();
        w();
        Q(new b0(this));
    }

    public final /* bridge */ /* synthetic */ C7644m4 r() {
        return super.r();
    }

    public final /* bridge */ /* synthetic */ C7685s4 s() {
        return super.s();
    }

    public final /* bridge */ /* synthetic */ C7575c5 t() {
        return super.t();
    }

    /* access modifiers changed from: protected */
    public final boolean v() {
        return false;
    }

    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    public final /* bridge */ /* synthetic */ e zzb() {
        return super.zzb();
    }

    public final /* bridge */ /* synthetic */ C7590f zzd() {
        return super.zzd();
    }
}
