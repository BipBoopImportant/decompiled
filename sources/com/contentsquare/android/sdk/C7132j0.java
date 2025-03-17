package com.contentsquare.android.sdk;

import A8.b;
import E8.c;
import F8.g;
import G8.v;
import a9.C6839h1;
import a9.C6912q2;
import com.contentsquare.android.core.features.config.model.JsonConfig;
import com.contentsquare.android.sdk.C7134k0;
import com.contentsquare.android.sdk.O;
import com.contentsquare.android.sdk.U;
import kotlin.jvm.internal.C17542s;

/* renamed from: com.contentsquare.android.sdk.j0  reason: case insensitive filesystem */
public final class C7132j0 implements C6839h1 {

    /* renamed from: a  reason: collision with root package name */
    public final g f47457a;

    /* renamed from: b  reason: collision with root package name */
    public final U f47458b;

    /* renamed from: c  reason: collision with root package name */
    public final c f47459c;

    /* renamed from: d  reason: collision with root package name */
    public final b f47460d;

    /* renamed from: e  reason: collision with root package name */
    public final D8.c f47461e = new D8.c("DefaultCsScreenGraphCallback");

    public C7132j0(g gVar, U u10, c cVar, b bVar) {
        C17542s.j(gVar, "deviceInfo");
        C17542s.j(u10, "screenCaptureProcessor");
        C17542s.j(cVar, "preferencesStore");
        C17542s.j(bVar, "configuration");
        this.f47457a = gVar;
        this.f47458b = u10;
        this.f47459c = cVar;
        this.f47460d = bVar;
    }

    public final void a(String str) {
        C17542s.j(str, "screenName");
        U u10 = this.f47458b;
        C7134k0.b.e eVar = C7134k0.b.e.f47474a;
        u10.getClass();
        C17542s.j(eVar, "reason");
        C17542s.j(str, "screenName");
        u10.f47157b.a(new C7134k0.a(eVar, str));
    }

    public final void a(C6912q2 q2Var, String str, boolean z10) {
        JsonConfig.ClientMode e10;
        C17542s.j(q2Var, "screenGraph");
        C17542s.j(str, "encodedScreenshot");
        JsonConfig.ProjectConfiguration b10 = this.f47460d.b();
        if (b10 != null) {
            O o10 = new O();
            o10.f47065n = q2Var;
            o10.f47055d = b10.g();
            o10.f47054c = this.f47457a.j().b();
            O.a aVar = z10 ? O.a.f47069c : O.a.f47068b;
            C17542s.j(aVar, "<set-?>");
            o10.f47067p = aVar;
            o10.f47053b = this.f47457a.d();
            o10.f47052a = this.f47457a.k();
            o10.f47056e = (double) this.f47457a.i();
            o10.f47059h = this.f47457a.c().i();
            o10.f47060i = "2";
            o10.f47061j = this.f47457a.c().d();
            o10.f47062k = this.f47457a.g();
            String str2 = null;
            o10.f47063l = this.f47459c.f(E8.b.INAPP_USER_ID, (String) null);
            o10.f47057f = this.f47457a.f();
            o10.f47058g = this.f47457a.e();
            o10.f47064m = q2Var.f42805a;
            C17542s.j(str, "<set-?>");
            o10.f47066o = str;
            JsonConfig.ProjectConfiguration b11 = this.f47460d.b();
            if (!(b11 == null || (e10 = b11.e()) == null)) {
                str2 = e10.a();
            }
            if (str2 == null) {
                str2 = "";
            }
            String f10 = v.f36295a.f(str2);
            U u10 = this.f47458b;
            u10.getClass();
            C17542s.j(o10, "screenCapture");
            C17542s.j(f10, "servicePath");
            if (u10.f47156a.a(new U.b(u10, new U.a(o10, f10), u10.f47160e, u10.f47158c)) != null) {
                return;
            }
        }
        this.f47461e.l("The raw configuration living in configuration shouldn't be null");
    }
}
