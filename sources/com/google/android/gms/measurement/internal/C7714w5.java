package com.google.android.gms.measurement.internal;

import K9.C6620s;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.util.e;
import com.google.android.gms.internal.measurement.C7319i2;
import com.google.android.gms.internal.measurement.E2;
import com.google.android.gms.internal.measurement.L4;
import java.util.Collections;
import java.util.HashMap;
import sa.X;

/* renamed from: com.google.android.gms.measurement.internal.w5  reason: case insensitive filesystem */
public final class C7714w5 extends C7673q5 {
    C7714w5(C7728y5 y5Var) {
        super(y5Var);
    }

    private final boolean u(String str, String str2) {
        C7676r2 S02;
        C7319i2 K10 = o().K(str);
        if (K10 == null || (S02 = n().S0(str)) == null) {
            return false;
        }
        if ((!K10.b0() || K10.S().m() != 100) && !h().C0(str, S02.v())) {
            return !TextUtils.isEmpty(str2) && Math.abs(str2.hashCode() % 100) < K10.S().m();
        }
        return true;
    }

    private final String v(String str) {
        String Q10 = o().Q(str);
        if (TextUtils.isEmpty(Q10)) {
            return K.f49782r.a(null);
        }
        Uri parse = Uri.parse(K.f49782r.a(null));
        Uri.Builder buildUpon = parse.buildUpon();
        String authority = parse.getAuthority();
        buildUpon.authority(Q10 + "." + authority);
        return buildUpon.build().toString();
    }

    private static boolean w(String str) {
        String a10 = K.f49786t.a(null);
        if (TextUtils.isEmpty(a10)) {
            return false;
        }
        for (String trim : a10.split(",")) {
            if (str.equalsIgnoreCase(trim.trim())) {
                return true;
            }
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ C7611i a() {
        return super.a();
    }

    public final /* bridge */ /* synthetic */ E b() {
        return super.b();
    }

    public final /* bridge */ /* synthetic */ C7586e2 d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ C7683s2 e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ C7607h2 f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ C7595f4 g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ Q5 h() {
        return super.h();
    }

    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    public final /* bridge */ /* synthetic */ N5 l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ Y5 m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ C7660p n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ C2 o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ Y4 p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ J2 q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ C7714w5 r() {
        return super.r();
    }

    public final C7735z5 s(String str) {
        C7611i a10 = a();
        Y1<Boolean> y12 = K.f49711K0;
        C7735z5 z5Var = null;
        if (a10.r(y12)) {
            C7676r2 S02 = n().S0(str);
            if (S02 == null || !S02.C()) {
                return new C7735z5(v(str), X.GOOGLE_ANALYTICS);
            }
            E2.b J10 = E2.J();
            E2.d dVar = E2.d.GA_UPLOAD;
            E2.b z10 = J10.C(dVar).z((E2.a) C6620s.l(E2.a.a(S02.F())));
            if (!u(str, S02.m())) {
                z10.A(E2.c.NOT_IN_ROLLOUT);
                return new C7735z5(v(str), Collections.emptyMap(), X.GOOGLE_ANALYTICS, (E2) ((L4) z10.s()));
            }
            String l10 = S02.l();
            z10.C(dVar);
            C7319i2 K10 = o().K(S02.l());
            if (K10 == null || !K10.b0()) {
                f().I().b("[sgtm] Missing sgtm_setting in remote config. appId", l10);
                z10.A(E2.c.MISSING_SGTM_SETTINGS);
            } else {
                HashMap hashMap = new HashMap();
                if (!TextUtils.isEmpty(S02.v())) {
                    hashMap.put("x-gtm-server-preview", S02.v());
                }
                String M10 = K10.S().M();
                E2.a a11 = E2.a.a(S02.F());
                if (a11 != null && a11 != E2.a.CLIENT_UPLOAD_ELIGIBLE) {
                    z10.z(a11);
                } else if (!a().r(y12)) {
                    z10.z(E2.a.SERVICE_FLAG_OFF);
                } else if (w(S02.l())) {
                    z10.z(E2.a.PINNED_TO_SERVICE_UPLOAD);
                } else if (TextUtils.isEmpty(M10)) {
                    z10.z(E2.a.MISSING_SGTM_SERVER_URL);
                } else {
                    f().I().b("[sgtm] Eligible for client side upload. appId", l10);
                    z10.C(E2.d.SDK_CLIENT_UPLOAD).z(E2.a.CLIENT_UPLOAD_ELIGIBLE);
                    z5Var = new C7735z5(M10, hashMap, X.SGTM_CLIENT, (E2) ((L4) z10.s()));
                }
                K10.S().N();
                K10.S().L();
                if (!TextUtils.isEmpty(M10)) {
                    f().I().b("[sgtm] Eligible for local service direct upload. appId", l10);
                    z10.C(E2.d.SDK_SERVICE_UPLOAD).A(E2.c.SERVICE_UPLOAD_ELIGIBLE);
                    z5Var = new C7735z5(M10, hashMap, X.SGTM, (E2) ((L4) z10.s()));
                } else {
                    z10.A(E2.c.NON_PLAY_MISSING_SGTM_SERVER_URL);
                    f().I().b("[sgtm] Local service, missing sgtm_server_url", S02.l());
                }
            }
            return z5Var != null ? z5Var : new C7735z5(v(str), Collections.emptyMap(), X.GOOGLE_ANALYTICS, (E2) ((L4) z10.s()));
        }
        C7676r2 S03 = n().S0(str);
        if (S03 == null) {
            return new C7735z5(v(str), X.GOOGLE_ANALYTICS);
        }
        if (!u(str, S03.m())) {
            return new C7735z5(v(str), X.GOOGLE_ANALYTICS);
        }
        if (S03.C()) {
            f().I().a("sgtm upload enabled in manifest.");
            C7319i2 K11 = o().K(S03.l());
            if (K11 != null && K11.b0()) {
                String N10 = K11.S().N();
                if (!TextUtils.isEmpty(N10)) {
                    String L10 = K11.S().L();
                    f().I().c("sgtm configured with upload_url, server_info", N10, TextUtils.isEmpty(L10) ? "Y" : "N");
                    if (TextUtils.isEmpty(L10)) {
                        z5Var = new C7735z5(N10, X.SGTM);
                    } else {
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("x-sgtm-server-info", L10);
                        if (!TextUtils.isEmpty(S03.v())) {
                            hashMap2.put("x-gtm-server-preview", S03.v());
                        }
                        z5Var = new C7735z5(N10, hashMap2, X.SGTM);
                    }
                }
            }
        }
        return z5Var != null ? z5Var : new C7735z5(v(str), X.GOOGLE_ANALYTICS);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        r3 = o().K(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean t(java.lang.String r3, com.google.android.gms.internal.measurement.E2.a r4) {
        /*
            r2 = this;
            r2.k()
            com.google.android.gms.measurement.internal.i r0 = r2.a()
            com.google.android.gms.measurement.internal.Y1<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.K.f49711K0
            boolean r0 = r0.r(r1)
            r1 = 0
            if (r0 == 0) goto L_0x003b
            com.google.android.gms.internal.measurement.E2$a r0 = com.google.android.gms.internal.measurement.E2.a.CLIENT_UPLOAD_ELIGIBLE
            if (r4 != r0) goto L_0x003b
            boolean r4 = w(r3)
            if (r4 == 0) goto L_0x001b
            goto L_0x003b
        L_0x001b:
            com.google.android.gms.measurement.internal.C2 r4 = r2.o()
            com.google.android.gms.internal.measurement.i2 r3 = r4.K(r3)
            if (r3 == 0) goto L_0x003b
            boolean r4 = r3.b0()
            if (r4 == 0) goto L_0x003b
            com.google.android.gms.internal.measurement.n2 r3 = r3.S()
            java.lang.String r3 = r3.M()
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x003b
            r3 = 1
            return r3
        L_0x003b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7714w5.t(java.lang.String, com.google.android.gms.internal.measurement.E2$a):boolean");
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
