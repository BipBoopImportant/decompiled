package X8;

import A8.d;
import B8.a;
import F8.g;
import G8.f;
import QJ.S;
import a9.C6783a1;
import a9.C6799c1;
import a9.C6838h0;
import a9.C6876l6;
import a9.C6908p6;
import a9.C6923r6;
import a9.O0;
import android.app.Application;
import android.util.DisplayMetrics;
import androidx.lifecycle.O;
import c8.C7102a;
import com.contentsquare.android.internal.features.initialize.ContentsquareModule;
import com.contentsquare.android.sdk.C;
import com.contentsquare.android.sdk.C0;
import com.contentsquare.android.sdk.C7128h0;
import com.contentsquare.android.sdk.C7133k;
import com.contentsquare.android.sdk.D;
import com.contentsquare.android.sdk.F;
import com.contentsquare.android.sdk.G;
import com.contentsquare.android.sdk.J0;
import com.contentsquare.android.sdk.Z;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import u8.C8886a;

public class c {

    /* renamed from: g  reason: collision with root package name */
    public static c f40789g;

    /* renamed from: a  reason: collision with root package name */
    public final O0 f40790a;

    /* renamed from: b  reason: collision with root package name */
    public final G f40791b;

    /* renamed from: c  reason: collision with root package name */
    public final C f40792c;

    /* renamed from: d  reason: collision with root package name */
    public final J0 f40793d;

    /* renamed from: e  reason: collision with root package name */
    public final C6799c1 f40794e;

    /* renamed from: f  reason: collision with root package name */
    public final d f40795f;

    public c(Application application) {
        Application application2 = application;
        b j10 = b.j(application);
        C8886a g10 = C8886a.g(application);
        O0 o02 = new O0(application2, j10.s());
        this.f40790a = o02;
        F f10 = new F(j10.l(), application2, new DisplayMetrics());
        C7128h0 h0Var = new C7128h0(j10.d(), j10.a(), g10.d());
        C17542s.j(h0Var, "listener");
        if (!f10.f46966d.contains(h0Var)) {
            f10.f46966d.add(h0Var);
        }
        G g11 = new G(application, j10.f(), j10.a(), g10.c(), j10.e(), f10, g10.f());
        this.f40791b = g11;
        ContentsquareModule c10 = ContentsquareModule.c(application);
        com.contentsquare.android.sdk.O0 a10 = j10.a();
        C0 c02 = C0.f46933a;
        J0 j02 = new J0(o02, a10, j10.d(), j10.h(), c10.d(), g10.f());
        this.f40793d = j02;
        D8.c cVar = D.f46936e;
        D a11 = D.a.a(application);
        C6838h0 f11 = j10.f();
        com.contentsquare.android.sdk.O0 a12 = j10.a();
        a11.f46940c.getClass();
        List singletonList = Collections.singletonList(new C7102a.b());
        C7133k d10 = j10.d();
        C6908p6 h10 = j10.h();
        C6783a1 d11 = c10.d();
        g d12 = g10.d();
        C17542s.j(g11, "legacyComponentsHolder");
        C17542s.j(f11, "eventsStatusPrefsHelper");
        C17542s.j(a12, "analyticsPipeline");
        C17542s.j(singletonList, "notToBeTrackedActivityFilters");
        C17542s.j(c02, "screenViewEventsHandler");
        C17542s.j(d10, "eventsBuildersFactory");
        C17542s.j(h10, "gesturesInterceptor");
        C17542s.j(j02, "screenViewHandler");
        C17542s.j(d11, "liveActivityProvider");
        C17542s.j(d12, "deviceInfo");
        b bVar = j10;
        G g12 = g11;
        this.f40792c = new C(g11, f11, a12, singletonList, d10, h10, j02, d11, d12, new C6876l6(new C6923r6(new f(250, S.b()))));
        C6799c1 c1Var = new C6799c1(g12, new Z(application, bVar.o(), bVar.q(), bVar.f(), g12), bVar.l());
        this.f40794e = c1Var;
        this.f40795f = new d(O.l(), application, new a(), c1Var.a(), g10.c());
    }

    public static c c() {
        return f40789g;
    }

    public static c d(Application application) {
        if (f40789g == null) {
            f40789g = new c(application);
        }
        return f40789g;
    }

    public d a() {
        return this.f40795f;
    }

    public C b() {
        return this.f40792c;
    }

    public G e() {
        return this.f40791b;
    }

    public C6799c1 f() {
        return this.f40794e;
    }

    public J0 g() {
        return this.f40793d;
    }
}
