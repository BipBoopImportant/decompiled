package com.google.android.gms.measurement.internal;

import G9.e;
import K9.C6620s;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.d;
import com.google.android.gms.common.util.q;
import com.google.android.gms.internal.measurement.C;
import com.google.android.gms.internal.measurement.C7280e;
import com.google.android.gms.internal.measurement.C7281e0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import sa.A;
import sa.B;
import sa.C8750c;
import sa.C8754g;
import sa.C8756i;
import sa.C8760m;
import sa.C8769w;
import sa.C8770x;
import sa.C8771y;
import sa.C8772z;
import sa.H;
import sa.k0;

public final class S2 extends C8754g {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C7728y5 f49947a;

    /* renamed from: b  reason: collision with root package name */
    private Boolean f49948b;

    /* renamed from: i  reason: collision with root package name */
    private String f49949i;

    public S2(C7728y5 y5Var) {
        this(y5Var, (String) null);
    }

    public static /* synthetic */ void K3(S2 s22, Bundle bundle, String str, E5 e52) {
        boolean r10 = s22.f49947a.r0().r(K.f49739Y0);
        boolean r11 = s22.f49947a.r0().r(K.f49744a1);
        if (!bundle.isEmpty() || !r10) {
            s22.f49947a.u0().o0(str, bundle);
            if (!s22.f49947a.u0().n0(str, e52.f49594F)) {
                return;
            }
            if (r11) {
                s22.f49947a.u0().c0(str, Long.valueOf(e52.f49594F), (String) null, bundle);
            } else {
                s22.f49947a.u0().c0(str, (Long) null, (String) null, bundle);
            }
        } else {
            C7660p u02 = s22.f49947a.u0();
            u02.k();
            u02.s();
            try {
                u02.z().execSQL("delete from default_event_params where app_id=?", new String[]{str});
            } catch (SQLiteException e10) {
                u02.f().E().b("Error clearing default event params", e10);
            }
        }
    }

    public static /* synthetic */ void L3(S2 s22, E5 e52) {
        s22.f49947a.K0();
        s22.f49947a.y0(e52);
    }

    public static /* synthetic */ void M3(S2 s22, E5 e52, Bundle bundle, C8756i iVar, String str) {
        s22.f49947a.K0();
        try {
            iVar.r2(s22.f49947a.o(e52, bundle));
        } catch (RemoteException e10) {
            s22.f49947a.f().E().c("Failed to return trigger URIs for app", str, e10);
        }
    }

    public static /* synthetic */ void N3(S2 s22, E5 e52, C7583e eVar) {
        s22.f49947a.K0();
        s22.f49947a.I((String) C6620s.l(e52.f49596a), eVar);
    }

    public static /* synthetic */ void O3(S2 s22, String str, k0 k0Var, C8760m mVar) {
        s22.f49947a.K0();
        try {
            mVar.G1(s22.f49947a.i(str, k0Var));
        } catch (RemoteException e10) {
            s22.f49947a.f().E().c("[sgtm] Failed to return upload batches for app", str, e10);
        }
    }

    private final void P3(Runnable runnable) {
        C6620s.l(runnable);
        if (this.f49947a.q().I()) {
            runnable.run();
        } else {
            this.f49947a.q().E(runnable);
        }
    }

    private final void Q3(String str, boolean z10) {
        boolean z11;
        if (!TextUtils.isEmpty(str)) {
            if (z10) {
                try {
                    if (this.f49948b == null) {
                        if (!"com.google.android.gms".equals(this.f49949i) && !q.a(this.f49947a.zza(), Binder.getCallingUid())) {
                            if (!e.a(this.f49947a.zza()).c(Binder.getCallingUid())) {
                                z11 = false;
                                this.f49948b = Boolean.valueOf(z11);
                            }
                        }
                        z11 = true;
                        this.f49948b = Boolean.valueOf(z11);
                    }
                    if (this.f49948b.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e10) {
                    this.f49947a.f().E().b("Measurement Service called with invalid calling package. appId", C7607h2.t(str));
                    throw e10;
                }
            }
            if (this.f49949i == null && d.k(this.f49947a.zza(), Binder.getCallingUid(), str)) {
                this.f49949i = str;
            }
            if (!str.equals(this.f49949i)) {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[]{str}));
            }
            return;
        }
        this.f49947a.f().E().a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    public static /* synthetic */ void S3(S2 s22, E5 e52) {
        s22.f49947a.K0();
        s22.f49947a.v0(e52);
    }

    private final void T3(E5 e52, boolean z10) {
        C6620s.l(e52);
        C6620s.f(e52.f49596a);
        Q3(e52.f49596a, false);
        this.f49947a.I0().i0(e52.f49597b, e52.f49611p);
    }

    private final void U3(Runnable runnable) {
        C6620s.l(runnable);
        if (this.f49947a.q().I()) {
            runnable.run();
        } else {
            this.f49947a.q().B(runnable);
        }
    }

    private final void W3(J j10, E5 e52) {
        this.f49947a.K0();
        this.f49947a.v(j10, e52);
    }

    public final void B0(J j10, String str, String str2) {
        C6620s.l(j10);
        C6620s.f(str);
        Q3(str, true);
        U3(new C7622j3(this, j10, str));
    }

    public final void B3(E5 e52) {
        C6620s.f(e52.f49596a);
        C6620s.l(e52.f49616u);
        P3(new C8772z(this, e52));
    }

    public final void H1(Bundle bundle, E5 e52) {
        T3(e52, false);
        String str = e52.f49596a;
        C6620s.l(str);
        U3(new B(this, bundle, str, e52));
    }

    public final void H3(E5 e52, k0 k0Var, C8760m mVar) {
        if (this.f49947a.r0().r(K.f49711K0)) {
            T3(e52, false);
            this.f49947a.q().B(new A(this, (String) C6620s.l(e52.f49596a), k0Var, mVar));
        }
    }

    public final List<C7597g> J(String str, String str2, E5 e52) {
        T3(e52, false);
        String str3 = e52.f49596a;
        C6620s.l(str3);
        try {
            return (List) this.f49947a.q().u(new C7580d3(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f49947a.f().E().b("Failed to get conditional user properties", e10);
            return Collections.emptyList();
        }
    }

    public final void J1(E5 e52) {
        T3(e52, false);
        U3(new X2(this, e52));
    }

    public final byte[] J2(J j10, String str) {
        C6620s.f(str);
        C6620s.l(j10);
        Q3(str, true);
        this.f49947a.f().D().b("Log and bundle. event", this.f49947a.x0().c(j10.f49672a));
        long b10 = this.f49947a.zzb().b() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f49947a.q().z(new C7615i3(this, j10, str)).get();
            if (bArr == null) {
                this.f49947a.f().E().b("Log and bundle returned null. appId", C7607h2.t(str));
                bArr = new byte[0];
            }
            this.f49947a.f().D().d("Log and bundle processed. event, size, time_ms", this.f49947a.x0().c(j10.f49672a), Integer.valueOf(bArr.length), Long.valueOf((this.f49947a.zzb().b() / 1000000) - b10));
            return bArr;
        } catch (InterruptedException e10) {
            e = e10;
            this.f49947a.f().E().d("Failed to log and bundle. appId, event, error", C7607h2.t(str), this.f49947a.x0().c(j10.f49672a), e);
            return null;
        } catch (ExecutionException e11) {
            e = e11;
            this.f49947a.f().E().d("Failed to log and bundle. appId, event, error", C7607h2.t(str), this.f49947a.x0().c(j10.f49672a), e);
            return null;
        }
    }

    public final void K2(J j10, E5 e52) {
        C6620s.l(j10);
        T3(e52, false);
        U3(new C7601g3(this, j10, e52));
    }

    public final void O0(E5 e52, Bundle bundle, C8756i iVar) {
        T3(e52, false);
        this.f49947a.q().B(new C8771y(this, e52, bundle, iVar, (String) C6620s.l(e52.f49596a)));
    }

    public final List<P5> P(String str, String str2, String str3, boolean z10) {
        Q3(str, true);
        try {
            List<R5> list = (List) this.f49947a.q().u(new C7559a3(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (R5 r52 : list) {
                if (!z10) {
                    if (!Q5.E0(r52.f49944c)) {
                    }
                }
                arrayList.add(new P5(r52));
            }
            return arrayList;
        } catch (InterruptedException e10) {
            e = e10;
            this.f49947a.f().E().c("Failed to get user properties as. appId", C7607h2.t(str), e);
            return Collections.emptyList();
        } catch (ExecutionException e11) {
            e = e11;
            this.f49947a.f().E().c("Failed to get user properties as. appId", C7607h2.t(str), e);
            return Collections.emptyList();
        }
    }

    public final void Q2(E5 e52) {
        T3(e52, false);
        U3(new T2(this, e52));
    }

    /* access modifiers changed from: package-private */
    public final J R3(J j10, E5 e52) {
        F f10;
        if (!(!"_cmp".equals(j10.f49672a) || (f10 = j10.f49673b) == null || f10.x() == 0)) {
            String E02 = j10.f49673b.E0("_cis");
            if ("referrer broadcast".equals(E02) || "referrer API".equals(E02)) {
                this.f49947a.f().H().b("Event has been filtered ", j10.toString());
                return new J("_cmpx", j10.f49673b, j10.f49674c, j10.f49675d);
            }
        }
        return j10;
    }

    public final void T1(E5 e52) {
        T3(e52, false);
        U3(new U2(this, e52));
    }

    public final void U1(E5 e52) {
        C6620s.f(e52.f49596a);
        Q3(e52.f49596a, false);
        U3(new C7587e3(this, e52));
    }

    /* access modifiers changed from: package-private */
    public final void V3(J j10, E5 e52) {
        boolean z10;
        if (!this.f49947a.B0().V(e52.f49596a)) {
            W3(j10, e52);
            return;
        }
        this.f49947a.f().I().b("EES config found for", e52.f49596a);
        C2 B02 = this.f49947a.B0();
        String str = e52.f49596a;
        C d10 = TextUtils.isEmpty(str) ? null : B02.f49554j.d(str);
        if (d10 == null) {
            this.f49947a.f().I().b("EES not loaded for", e52.f49596a);
            W3(j10, e52);
            return;
        }
        try {
            Map<String, Object> O10 = this.f49947a.H0().O(j10.f49673b.J(), true);
            String a10 = H.a(j10.f49672a);
            if (a10 == null) {
                a10 = j10.f49672a;
            }
            z10 = d10.e(new C7280e(a10, j10.f49675d, O10));
        } catch (C7281e0 unused) {
            this.f49947a.f().E().c("EES error. appId, eventName", e52.f49597b, j10.f49672a);
            z10 = false;
        }
        if (!z10) {
            this.f49947a.f().I().b("EES was not applied to event", j10.f49672a);
            W3(j10, e52);
            return;
        }
        if (d10.h()) {
            this.f49947a.f().I().b("EES edited event", j10.f49672a);
            W3(this.f49947a.H0().F(d10.a().d()), e52);
        } else {
            W3(j10, e52);
        }
        if (d10.g()) {
            for (C7280e next : d10.a().f()) {
                this.f49947a.f().I().b("EES logging created event", next.e());
                W3(this.f49947a.H0().F(next), e52);
            }
        }
    }

    public final void X2(E5 e52) {
        C6620s.f(e52.f49596a);
        C6620s.l(e52.f49616u);
        P3(new C8770x(this, e52));
    }

    public final List<P5> g0(E5 e52, boolean z10) {
        T3(e52, false);
        String str = e52.f49596a;
        C6620s.l(str);
        try {
            List<R5> list = (List) this.f49947a.q().u(new V2(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (R5 r52 : list) {
                if (!z10) {
                    if (!Q5.E0(r52.f49944c)) {
                    }
                }
                arrayList.add(new P5(r52));
            }
            return arrayList;
        } catch (InterruptedException e10) {
            e = e10;
            this.f49947a.f().E().c("Failed to get user properties. appId", C7607h2.t(e52.f49596a), e);
            return null;
        } catch (ExecutionException e11) {
            e = e11;
            this.f49947a.f().E().c("Failed to get user properties. appId", C7607h2.t(e52.f49596a), e);
            return null;
        }
    }

    public final C8750c h2(E5 e52) {
        T3(e52, false);
        C6620s.f(e52.f49596a);
        try {
            return (C8750c) this.f49947a.q().z(new C7608h3(this, e52)).get(10000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            this.f49947a.f().E().c("Failed to get consent. appId", C7607h2.t(e52.f49596a), e10);
            return new C8750c((Bundle) null);
        }
    }

    public final void h3(E5 e52) {
        C6620s.f(e52.f49596a);
        C6620s.l(e52.f49616u);
        P3(new C7594f3(this, e52));
    }

    public final void i2(C7597g gVar) {
        C6620s.l(gVar);
        C6620s.l(gVar.f50136c);
        C6620s.f(gVar.f50134a);
        Q3(gVar.f50134a, true);
        U3(new Y2(this, new C7597g(gVar)));
    }

    public final List<P5> n3(String str, String str2, boolean z10, E5 e52) {
        T3(e52, false);
        String str3 = e52.f49596a;
        C6620s.l(str3);
        try {
            List<R5> list = (List) this.f49947a.q().u(new C7566b3(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (R5 r52 : list) {
                if (!z10) {
                    if (!Q5.E0(r52.f49944c)) {
                    }
                }
                arrayList.add(new P5(r52));
            }
            return arrayList;
        } catch (InterruptedException e10) {
            e = e10;
            this.f49947a.f().E().c("Failed to query user properties. appId", C7607h2.t(e52.f49596a), e);
            return Collections.emptyList();
        } catch (ExecutionException e11) {
            e = e11;
            this.f49947a.f().E().c("Failed to query user properties. appId", C7607h2.t(e52.f49596a), e);
            return Collections.emptyList();
        }
    }

    public final void p1(C7597g gVar, E5 e52) {
        C6620s.l(gVar);
        C6620s.l(gVar.f50136c);
        T3(e52, false);
        C7597g gVar2 = new C7597g(gVar);
        gVar2.f50134a = e52.f49596a;
        U3(new Z2(this, gVar2, e52));
    }

    public final void q0(long j10, String str, String str2, String str3) {
        U3(new W2(this, str2, str3, str, j10));
    }

    public final List<C7645m5> r0(E5 e52, Bundle bundle) {
        T3(e52, false);
        C6620s.l(e52.f49596a);
        if (this.f49947a.r0().r(K.f49753d1)) {
            try {
                return (List) this.f49947a.q().z(new C7629k3(this, e52, bundle)).get(10000, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException e10) {
                this.f49947a.f().E().c("Failed to get trigger URIs. appId", C7607h2.t(e52.f49596a), e10);
                return Collections.emptyList();
            }
        } else {
            try {
                return (List) this.f49947a.q().u(new C7650n3(this, e52, bundle)).get();
            } catch (InterruptedException | ExecutionException e11) {
                this.f49947a.f().E().c("Failed to get trigger URIs. appId", C7607h2.t(e52.f49596a), e11);
                return Collections.emptyList();
            }
        }
    }

    public final List<C7597g> t0(String str, String str2, String str3) {
        Q3(str, true);
        try {
            return (List) this.f49947a.q().u(new C7573c3(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f49947a.f().E().b("Failed to get conditional user properties as", e10);
            return Collections.emptyList();
        }
    }

    public final void t3(E5 e52, C7583e eVar) {
        if (this.f49947a.r0().r(K.f49711K0)) {
            T3(e52, false);
            U3(new C8769w(this, e52, eVar));
        }
    }

    public final String u2(E5 e52) {
        T3(e52, false);
        return this.f49947a.c0(e52);
    }

    public final void v3(P5 p52, E5 e52) {
        C6620s.l(p52);
        T3(e52, false);
        U3(new C7636l3(this, p52, e52));
    }

    private S2(C7728y5 y5Var, String str) {
        C6620s.l(y5Var);
        this.f49947a = y5Var;
        this.f49949i = null;
    }
}
