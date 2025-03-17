package com.contentsquare.android.sdk;

import A8.b;
import F8.e;
import F8.g;
import a9.C6815e1;
import a9.C6908p6;
import a9.D4;
import com.contentsquare.android.sdk.A0;
import com.contentsquare.android.sdk.C7115b;
import com.contentsquare.android.sdk.C7122e0;
import com.contentsquare.android.sdk.C7125g;
import com.contentsquare.android.sdk.C7148r0;
import com.contentsquare.android.sdk.C7149s;
import com.contentsquare.android.sdk.C7155v;
import com.contentsquare.android.sdk.C7157w;
import com.contentsquare.android.sdk.C7162y0;
import com.contentsquare.android.sdk.C7163z;
import com.contentsquare.android.sdk.D0;
import com.contentsquare.android.sdk.H0;
import com.contentsquare.android.sdk.J;
import com.contentsquare.android.sdk.L0;
import com.contentsquare.android.sdk.Q;
import com.contentsquare.android.sdk.T;
import com.contentsquare.android.sdk.T0;
import com.contentsquare.android.sdk.U0;
import com.contentsquare.android.sdk.V0;
import com.contentsquare.android.sdk.W;
import com.contentsquare.android.sdk.Z0;
import com.contentsquare.android.sdk.e1;
import com.contentsquare.android.sdk.h1;
import com.contentsquare.android.sdk.j1;
import com.oppwa.mobile.connect.BuildConfig;
import d9.M;
import kotlin.jvm.internal.C17542s;
import org.json.JSONObject;

/* renamed from: com.contentsquare.android.sdk.k  reason: case insensitive filesystem */
public final class C7133k {

    /* renamed from: a  reason: collision with root package name */
    public final g f47463a;

    /* renamed from: b  reason: collision with root package name */
    public final C7117c f47464b;

    /* renamed from: c  reason: collision with root package name */
    public final C6815e1 f47465c;

    /* renamed from: d  reason: collision with root package name */
    public final b f47466d;

    /* renamed from: e  reason: collision with root package name */
    public C6908p6 f47467e;

    public C7133k(g gVar, C7117c cVar, C6815e1 e1Var, b bVar) {
        C17542s.j(gVar, "deviceInfo");
        C17542s.j(cVar, "session");
        C17542s.j(e1Var, "userIdRestoreHelper");
        C17542s.j(bVar, "configuration");
        this.f47463a = gVar;
        this.f47464b = cVar;
        this.f47465c = e1Var;
        this.f47466d = bVar;
    }

    public static C7162y0.a b(C7133k kVar, int i10) {
        C6908p6 p6Var = kVar.f47467e;
        return kVar.a(i10, p6Var != null ? ((D4) p6Var).f41960d : null);
    }

    public final <T extends C7162y0.a<? extends C7162y0>> T a(int i10, String str) {
        T t10;
        switch (i10) {
            case -2:
                t10 = new j1.a();
                break;
            case 0:
                t10 = new C7157w.a();
                break;
            case 1:
                t10 = new C7149s.a();
                break;
            case 2:
                t10 = new C7125g.a();
                break;
            case 4:
                t10 = new C7148r0.a();
                break;
            case 5:
                t10 = new C7163z.a();
                break;
            case 6:
                t10 = new C7122e0.a();
                break;
            case 8:
                t10 = new T.a();
                break;
            case 9:
                t10 = new A0.a();
                break;
            case 10:
                t10 = new Q.a();
                break;
            case 16:
                t10 = new C7155v.a();
                break;
            case 18:
                t10 = new L0.a();
                break;
            case 19:
                t10 = new H0.a();
                break;
            case 21:
                t10 = new Z0.a();
                break;
            case 22:
                t10 = new J.a();
                break;
            case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER /*23*/:
                t10 = new U0.a();
                break;
            case BuildConfig.MIN_SDK_VERSION /*24*/:
                t10 = new T0.a();
                break;
            case 25:
                t10 = new W.a();
                break;
            case 26:
                t10 = new C7115b.a();
                break;
            case 28:
                t10 = new e1.a();
                break;
            case 29:
                t10 = new V0.a();
                break;
            case 30:
                t10 = new D0.a();
                break;
            default:
                t10 = new h1.a();
                break;
        }
        String l10 = this.f47463a.l();
        C17542s.j(l10, "carrierId");
        t10.f47747e = l10;
        e b10 = this.f47463a.b();
        C17542s.j(b10, "connectionType");
        t10.f47746d = b10;
        g.c m10 = this.f47463a.m();
        C17542s.j(m10, "orientation");
        t10.f47748f = m10;
        g gVar = this.f47463a;
        JSONObject p10 = gVar.p(gVar.c());
        C17542s.j(p10, "originVersion");
        t10.f47749g = p10;
        C7117c cVar = this.f47464b;
        t10.f47750h = cVar.f47324k;
        t10.f47745c = cVar.f47323j;
        if (!(str == null || str.length() == 0)) {
            C17542s.j(str, "url");
            t10.f47744b = str;
        }
        C17542s.h(t10, "null cannot be cast to non-null type T of com.contentsquare.android.analytics.internal.model.EventsBuildersFactory.builderFor");
        return t10;
    }
}
