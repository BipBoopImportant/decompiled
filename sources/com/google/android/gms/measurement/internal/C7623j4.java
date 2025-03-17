package com.google.android.gms.measurement.internal;

import K9.C6620s;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.A2;
import com.google.android.gms.internal.measurement.B2;
import com.google.android.gms.internal.measurement.C7427v2;
import com.google.android.gms.internal.measurement.C7435w2;
import com.google.android.gms.internal.measurement.C7443x2;
import com.google.android.gms.internal.measurement.C7459z2;
import com.google.android.gms.internal.measurement.F2;
import com.google.android.gms.internal.measurement.L4;
import com.google.android.gms.internal.measurement.n7;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.j4  reason: case insensitive filesystem */
final class C7623j4 extends C7721x5 {
    public C7623j4(C7728y5 y5Var) {
        super(y5Var);
    }

    private static String c(String str, String str2) {
        throw new SecurityException("This implementation should not be used.");
    }

    /* access modifiers changed from: protected */
    public final boolean v() {
        return false;
    }

    public final byte[] w(J j10, String str) {
        R5 r52;
        C7459z2.b bVar;
        A2.a aVar;
        byte[] bArr;
        C7676r2 r2Var;
        Bundle bundle;
        G g10;
        long j11;
        J j12 = j10;
        String str2 = str;
        k();
        this.f50228a.k();
        C6620s.l(j10);
        C6620s.f(str);
        if ("_iap".equals(j12.f49672a) || "_iapx".equals(j12.f49672a)) {
            C7459z2.b P10 = C7459z2.P();
            n().l1();
            C7676r2 S02 = n().S0(str2);
            if (S02 == null) {
                f().D().b("Log and bundle not available. package_name", str2);
                byte[] bArr2 = new byte[0];
                n().o1();
                return bArr2;
            } else if (!S02.A()) {
                f().D().b("Log and bundle disabled. package_name", str2);
                byte[] bArr3 = new byte[0];
                n().o1();
                return bArr3;
            } else {
                A2.a l12 = A2.H2().H0(1).l1("android");
                if (!TextUtils.isEmpty(S02.l())) {
                    l12.d0(S02.l());
                }
                if (!TextUtils.isEmpty(S02.n())) {
                    l12.p0((String) C6620s.l(S02.n()));
                }
                if (!TextUtils.isEmpty(S02.o())) {
                    l12.w0((String) C6620s.l(S02.o()));
                }
                if (S02.V() != -2147483648L) {
                    l12.s0((int) S02.V());
                }
                l12.D0(S02.A0()).u0(S02.w0());
                String q10 = S02.q();
                String j13 = S02.j();
                if (!TextUtils.isEmpty(q10)) {
                    l12.f1(q10);
                } else if (!TextUtils.isEmpty(j13)) {
                    l12.Q(j13);
                }
                l12.V0(S02.K0());
                C7671q3 b02 = this.f50303b.b0(str2);
                l12.n0(S02.u0());
                if (this.f50228a.o() && a().N(l12.u1()) && b02.w() && !TextUtils.isEmpty((CharSequence) null)) {
                    l12.T0((String) null);
                }
                l12.F0(b02.u());
                if (b02.w() && S02.z()) {
                    Pair<String, Boolean> x10 = p().x(S02.l(), b02);
                    if (S02.z() && x10 != null && !TextUtils.isEmpty((CharSequence) x10.first)) {
                        try {
                            l12.n1(c((String) x10.first, Long.toString(j12.f49675d)));
                            Object obj = x10.second;
                            if (obj != null) {
                                l12.k0(((Boolean) obj).booleanValue());
                            }
                        } catch (SecurityException e10) {
                            f().D().b("Resettable device id encryption failed", e10.getMessage());
                            return new byte[0];
                        } finally {
                            n().o1();
                        }
                    }
                }
                b().m();
                A2.a O02 = l12.O0(Build.MODEL);
                b().m();
                O02.j1(Build.VERSION.RELEASE).Q0((int) b().s()).s1(b().t());
                try {
                    if (b02.x() && S02.m() != null) {
                        l12.j0(c((String) C6620s.l(S02.m()), Long.toString(j12.f49675d)));
                    }
                    if (!TextUtils.isEmpty(S02.p())) {
                        l12.c1((String) C6620s.l(S02.p()));
                    }
                    String l10 = S02.l();
                    List<R5> f12 = n().f1(l10);
                    Iterator<R5> it = f12.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            r52 = null;
                            break;
                        }
                        r52 = it.next();
                        if ("_lte".equals(r52.f49944c)) {
                            break;
                        }
                    }
                    if (r52 == null || r52.f49946e == null) {
                        R5 r53 = new R5(l10, "auto", "_lte", zzb().a(), 0L);
                        f12.add(r53);
                        n().k0(r53);
                    }
                    F2[] f2Arr = new F2[f12.size()];
                    for (int i10 = 0; i10 < f12.size(); i10++) {
                        F2.a G10 = F2.V().D(f12.get(i10).f49944c).G(f12.get(i10).f49945d);
                        l().T(G10, f12.get(i10).f49946e);
                        f2Arr[i10] = (F2) ((L4) G10.s());
                    }
                    l12.v0(Arrays.asList(f2Arr));
                    this.f50303b.x(S02, l12);
                    this.f50303b.i0(S02, l12);
                    C7628k2 b10 = C7628k2.b(j10);
                    h().L(b10.f50206d, n().O0(str2));
                    h().U(b10, a().v(str2));
                    Bundle bundle2 = b10.f50206d;
                    bundle2.putLong("_c", 1);
                    f().D().a("Marking in-app purchase as real-time");
                    bundle2.putLong("_r", 1);
                    bundle2.putString("_o", j12.f49674c);
                    if (h().C0(l12.u1(), S02.v())) {
                        h().M(bundle2, "_dbg", 1L);
                        h().M(bundle2, "_r", 1L);
                    }
                    G R02 = n().R0(str2, j12.f49672a);
                    if (R02 == null) {
                        bundle = bundle2;
                        aVar = l12;
                        r2Var = S02;
                        bVar = P10;
                        bArr = null;
                        g10 = new G(str, j12.f49672a, 0, 0, j12.f49675d, 0, (Long) null, (Long) null, (Long) null, (Boolean) null);
                        j11 = 0;
                    } else {
                        bundle = bundle2;
                        aVar = l12;
                        r2Var = S02;
                        bVar = P10;
                        bArr = null;
                        j11 = R02.f49633f;
                        g10 = R02.a(j12.f49675d);
                    }
                    n().W(g10);
                    D d10 = new D(this.f50228a, j12.f49674c, str, j12.f49672a, j12.f49675d, j11, bundle);
                    C7427v2.a E10 = C7427v2.V().M(d10.f49569d).K(d10.f49567b).E(d10.f49570e);
                    Iterator<String> it2 = d10.f49571f.iterator();
                    while (it2.hasNext()) {
                        String next = it2.next();
                        C7443x2.a G11 = C7443x2.X().G(next);
                        Object t02 = d10.f49571f.t0(next);
                        if (t02 != null) {
                            l().S(G11, t02);
                            E10.G(G11);
                        }
                    }
                    A2.a aVar2 = aVar;
                    aVar2.K(E10).L(B2.J().z(C7435w2.J().z(g10.f49630c).A(j12.f49672a)));
                    aVar2.P(m().x(r2Var.l(), Collections.emptyList(), aVar2.V(), Long.valueOf(E10.O()), Long.valueOf(E10.O()), false));
                    if (E10.S()) {
                        aVar2.R0(E10.O()).z0(E10.O());
                    }
                    long E02 = r2Var.E0();
                    int i11 = (E02 > 0 ? 1 : (E02 == 0 ? 0 : -1));
                    if (i11 != 0) {
                        aVar2.I0(E02);
                    }
                    long I02 = r2Var.I0();
                    if (I02 != 0) {
                        aVar2.M0(I02);
                    } else if (i11 != 0) {
                        aVar2.M0(E02);
                    }
                    String u10 = r2Var.u();
                    if (n7.a()) {
                        if (a().F(str, K.f49705H0) && u10 != null) {
                            aVar2.q1(u10);
                        }
                    } else {
                        String str3 = str;
                    }
                    r2Var.y();
                    aVar2.y0((int) r2Var.G0()).e1(114010).b1(zzb().a()).q0(true);
                    this.f50303b.H(aVar2.u1(), aVar2);
                    C7459z2.b bVar2 = bVar;
                    bVar2.C(aVar2);
                    C7676r2 r2Var2 = r2Var;
                    r2Var2.D0(aVar2.x0());
                    r2Var2.z0(aVar2.r0());
                    n().X(r2Var2, false, false);
                    n().q1();
                    try {
                        return l().f0(((C7459z2) ((L4) bVar2.s())).l());
                    } catch (IOException e11) {
                        f().E().c("Data loss. Failed to bundle and serialize. appId", C7607h2.t(str), e11);
                        return bArr;
                    }
                } catch (SecurityException e12) {
                    f().D().b("app instance id encryption failed", e12.getMessage());
                    byte[] bArr4 = new byte[0];
                    n().o1();
                    return bArr4;
                }
            }
        } else {
            f().D().c("Generating a payload for this event is not available. package_name, event_name", str2, j12.f49672a);
            return null;
        }
    }
}
