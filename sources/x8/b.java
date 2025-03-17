package X8;

import C8.a;
import D8.c;
import G8.h;
import G8.t;
import G8.u;
import a9.C6789b;
import a9.C6807d1;
import a9.C6815e1;
import a9.C6838h0;
import a9.C6887n1;
import a9.C6901p;
import a9.C6908p6;
import a9.C6950v1;
import a9.D4;
import a9.G1;
import a9.I0;
import a9.M0;
import a9.M6;
import a9.Q0;
import a9.T;
import a9.V6;
import a9.W6;
import a9.Y1;
import a9.Z6;
import android.app.Application;
import com.contentsquare.android.internal.features.initialize.ContentsquareModule;
import com.contentsquare.android.internal.features.srm.SrmKeysCache;
import com.contentsquare.android.sdk.C7117c;
import com.contentsquare.android.sdk.C7126g0;
import com.contentsquare.android.sdk.C7133k;
import com.contentsquare.android.sdk.C7151t;
import com.contentsquare.android.sdk.C7164z0;
import com.contentsquare.android.sdk.E0;
import com.contentsquare.android.sdk.O0;
import com.contentsquare.android.sdk.o1;
import com.contentsquare.android.sdk.t1;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import k8.C8465a;
import u8.C8886a;

public class b {

    /* renamed from: w  reason: collision with root package name */
    public static c f40765w = new c("CsApplicationModule");

    /* renamed from: x  reason: collision with root package name */
    public static b f40766x;

    /* renamed from: a  reason: collision with root package name */
    public final Application f40767a;

    /* renamed from: b  reason: collision with root package name */
    public final W6 f40768b;

    /* renamed from: c  reason: collision with root package name */
    public final Q0 f40769c;

    /* renamed from: d  reason: collision with root package name */
    public final t f40770d = new t();

    /* renamed from: e  reason: collision with root package name */
    public final o1 f40771e = new o1();

    /* renamed from: f  reason: collision with root package name */
    public final Y1 f40772f;

    /* renamed from: g  reason: collision with root package name */
    public final u f40773g;

    /* renamed from: h  reason: collision with root package name */
    public final C6838h0 f40774h;

    /* renamed from: i  reason: collision with root package name */
    public final ExecutorService f40775i;

    /* renamed from: j  reason: collision with root package name */
    public final t1 f40776j;

    /* renamed from: k  reason: collision with root package name */
    public final I0 f40777k;

    /* renamed from: l  reason: collision with root package name */
    public final C6815e1 f40778l;

    /* renamed from: m  reason: collision with root package name */
    public final C7117c f40779m;

    /* renamed from: n  reason: collision with root package name */
    public final D4 f40780n;

    /* renamed from: o  reason: collision with root package name */
    public final C7133k f40781o;

    /* renamed from: p  reason: collision with root package name */
    public final C7151t f40782p;

    /* renamed from: q  reason: collision with root package name */
    public final C6887n1 f40783q;

    /* renamed from: r  reason: collision with root package name */
    public final C6807d1 f40784r;

    /* renamed from: s  reason: collision with root package name */
    public final C8465a f40785s;

    /* renamed from: t  reason: collision with root package name */
    public final M0 f40786t;

    /* renamed from: u  reason: collision with root package name */
    public final E0 f40787u;

    /* renamed from: v  reason: collision with root package name */
    public final O0 f40788v;

    public b(Application application) {
        Application application2 = application;
        this.f40767a = application2;
        C8886a g10 = C8886a.g(application);
        this.f40772f = new Y1(application2);
        this.f40773g = new u();
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.f40775i = newSingleThreadExecutor;
        E8.c f10 = g10.f();
        C6838h0 h0Var = new C6838h0(f10);
        this.f40774h = h0Var;
        W6 w62 = new W6(f10, new c("InSampleIntervalValidator"));
        this.f40768b = w62;
        Q0 q02 = new Q0(f10);
        this.f40769c = q02;
        t1 t1Var = new t1(g10.c(), w62, f10);
        this.f40776j = t1Var;
        I0 i02 = new I0(f10);
        this.f40777k = i02;
        C6815e1 e1Var = new C6815e1(f10, i02);
        this.f40778l = e1Var;
        O0 o02 = new O0(t1Var);
        this.f40788v = o02;
        C7117c cVar = new C7117c(q02, e1Var, o02, g10.c(), g10.d().c(), h0Var, f10);
        this.f40779m = cVar;
        C7133k kVar = new C7133k(g10.d(), cVar, e1Var, g10.c());
        this.f40781o = kVar;
        T t10 = new T(G1.f42019f);
        E0 e02 = new E0();
        this.f40787u = e02;
        C7126g0 g0Var = new C7126g0(application2, t10, new t(), new a());
        C7164z0 z0Var = r1;
        O0 o03 = o02;
        C7164z0 z0Var2 = new C7164z0(t10, application, g0Var, kVar, o02, e02);
        D4 d42 = new D4(z0Var, ContentsquareModule.c(application).a());
        this.f40780n = d42;
        kVar.f47467e = d42;
        M6 m62 = new M6();
        C6789b bVar = new C6789b(g10.c());
        V6 v62 = new V6(application.getApplicationContext(), cVar, e1Var);
        E8.c cVar2 = f10;
        this.f40782p = new C7151t(v62, kVar, newSingleThreadExecutor, o03, g10.c(), cVar2, m62, bVar);
        this.f40783q = new C6887n1(new a(), new C6950v1(application.getApplicationContext(), new h()));
        this.f40784r = new C6807d1(new C6901p(g10.c()), new SrmKeysCache(new h(), application.getApplicationContext().getFilesDir().getAbsolutePath()), new Z6(new h(), application.getApplicationContext().getFilesDir().getAbsolutePath()), g10.c(), g10.d().c());
        this.f40785s = new C8465a(g10.c(), cVar2);
        this.f40786t = new M0();
    }

    public static b i() {
        return f40766x;
    }

    public static b j(Application application) {
        if (f40766x == null) {
            f40766x = new b(application);
            f40765w.f("CsApplicationModule singleton is now initialized.");
        }
        return f40766x;
    }

    public O0 a() {
        return this.f40788v;
    }

    public Application b() {
        return this.f40767a;
    }

    public C8465a c() {
        return this.f40785s;
    }

    public C7133k d() {
        return this.f40781o;
    }

    public C7151t e() {
        return this.f40782p;
    }

    public C6838h0 f() {
        return this.f40774h;
    }

    public E0 g() {
        return this.f40787u;
    }

    public C6908p6 h() {
        return this.f40780n;
    }

    public C6887n1 k() {
        return this.f40783q;
    }

    public t1 l() {
        return this.f40776j;
    }

    public C7117c m() {
        return this.f40779m;
    }

    public C6807d1 n() {
        return this.f40784r;
    }

    public Y1 o() {
        return this.f40772f;
    }

    public u p() {
        return this.f40773g;
    }

    public I0 q() {
        return this.f40777k;
    }

    public C6815e1 r() {
        return this.f40778l;
    }

    public o1 s() {
        return this.f40771e;
    }

    public M0 t() {
        return this.f40786t;
    }
}
