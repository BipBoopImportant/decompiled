package uJ;

import AI.C15429j;
import DI.C15561h;
import DI.l0;
import DI.n0;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import YH.C16877v;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import tJ.C17989i;
import tJ.C17994n;
import vJ.g;
import vJ.h;
import wJ.C18230l;

/* renamed from: uJ.q  reason: case insensitive filesystem */
public abstract class C18134q extends C18142w {

    /* renamed from: b  reason: collision with root package name */
    private final C17989i<b> f147916b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f147917c;

    /* renamed from: uJ.q$a */
    private final class a implements y0 {

        /* renamed from: a  reason: collision with root package name */
        private final g f147918a;

        /* renamed from: b  reason: collision with root package name */
        private final C16824o f147919b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C18134q f147920c;

        public a(C18134q qVar, g gVar) {
            C17542s.j(gVar, "kotlinTypeRefiner");
            this.f147920c = qVar;
            this.f147918a = gVar;
            this.f147919b = C16825p.a(s.PUBLICATION, new C18132p(this, qVar));
        }

        private final List<C18096U> h() {
            return (List) this.f147919b.getValue();
        }

        /* access modifiers changed from: private */
        public static final List j(a aVar, C18134q qVar) {
            return h.b(aVar.f147918a, qVar.a());
        }

        public y0 b(g gVar) {
            C17542s.j(gVar, "kotlinTypeRefiner");
            return this.f147920c.b(gVar);
        }

        public C15561h e() {
            return this.f147920c.e();
        }

        public boolean equals(Object obj) {
            return this.f147920c.equals(obj);
        }

        public boolean f() {
            return this.f147920c.f();
        }

        public List<n0> getParameters() {
            List<n0> parameters = this.f147920c.getParameters();
            C17542s.i(parameters, "getParameters(...)");
            return parameters;
        }

        public int hashCode() {
            return this.f147920c.hashCode();
        }

        /* renamed from: i */
        public List<C18096U> a() {
            return h();
        }

        public C15429j p() {
            C15429j p10 = this.f147920c.p();
            C17542s.i(p10, "getBuiltIns(...)");
            return p10;
        }

        public String toString() {
            return this.f147920c.toString();
        }
    }

    /* renamed from: uJ.q$b */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final Collection<C18096U> f147921a;

        /* renamed from: b  reason: collision with root package name */
        private List<? extends C18096U> f147922b = C16877v.e(C18230l.f149170a.l());

        public b(Collection<? extends C18096U> collection) {
            C17542s.j(collection, "allSupertypes");
            this.f147921a = collection;
        }

        public final Collection<C18096U> a() {
            return this.f147921a;
        }

        public final List<C18096U> b() {
            return this.f147922b;
        }

        public final void c(List<? extends C18096U> list) {
            C17542s.j(list, "<set-?>");
            this.f147922b = list;
        }
    }

    public C18134q(C17994n nVar) {
        C17542s.j(nVar, "storageManager");
        this.f147916b = nVar.i(new C18118i(this), C18120j.f147897a, new C18122k(this));
    }

    /* access modifiers changed from: private */
    public static final b B(C18134q qVar) {
        return new b(qVar.s());
    }

    /* access modifiers changed from: private */
    public static final b C(boolean z10) {
        return new b(C16877v.e(C18230l.f149170a.l()));
    }

    /* access modifiers changed from: private */
    public static final C16807N D(C18134q qVar, b bVar) {
        C17542s.j(bVar, "supertypes");
        Collection<C18096U> a10 = qVar.w().a(qVar, bVar.a(), new C18124l(qVar), new C18126m(qVar));
        List list = null;
        if (a10.isEmpty()) {
            C18096U t10 = qVar.t();
            List e10 = t10 != null ? C16877v.e(t10) : null;
            if (e10 == null) {
                e10 = C16877v.n();
            }
            a10 = e10;
        }
        if (qVar.v()) {
            qVar.w().a(qVar, a10, new C18128n(qVar), new C18130o(qVar));
        }
        if (a10 instanceof List) {
            list = (List) a10;
        }
        if (list == null) {
            list = C16877v.t1(a10);
        }
        bVar.c(qVar.y(list));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final Iterable E(C18134q qVar, y0 y0Var) {
        C17542s.j(y0Var, "it");
        return qVar.r(y0Var, false);
    }

    /* access modifiers changed from: private */
    public static final C16807N F(C18134q qVar, C18096U u10) {
        C17542s.j(u10, "it");
        qVar.A(u10);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final Iterable G(C18134q qVar, y0 y0Var) {
        C17542s.j(y0Var, "it");
        return qVar.r(y0Var, true);
    }

    /* access modifiers changed from: private */
    public static final C16807N H(C18134q qVar, C18096U u10) {
        C17542s.j(u10, "it");
        qVar.z(u10);
        return C16807N.f139792a;
    }

    private final Collection<C18096U> r(y0 y0Var, boolean z10) {
        List<T> V02;
        C18134q qVar = y0Var instanceof C18134q ? (C18134q) y0Var : null;
        if (qVar != null && (V02 = C16877v.V0(((b) qVar.f147916b.invoke()).a(), qVar.u(z10))) != null) {
            return V02;
        }
        Collection<C18096U> a10 = y0Var.a();
        C17542s.i(a10, "getSupertypes(...)");
        return a10;
    }

    /* access modifiers changed from: protected */
    public void A(C18096U u10) {
        C17542s.j(u10, "type");
    }

    public y0 b(g gVar) {
        C17542s.j(gVar, "kotlinTypeRefiner");
        return new a(this, gVar);
    }

    /* access modifiers changed from: protected */
    public abstract Collection<C18096U> s();

    /* access modifiers changed from: protected */
    public C18096U t() {
        return null;
    }

    /* access modifiers changed from: protected */
    public Collection<C18096U> u(boolean z10) {
        return C16877v.n();
    }

    /* access modifiers changed from: protected */
    public boolean v() {
        return this.f147917c;
    }

    /* access modifiers changed from: protected */
    public abstract l0 w();

    /* renamed from: x */
    public List<C18096U> a() {
        return ((b) this.f147916b.invoke()).b();
    }

    /* access modifiers changed from: protected */
    public List<C18096U> y(List<C18096U> list) {
        C17542s.j(list, "supertypes");
        return list;
    }

    /* access modifiers changed from: protected */
    public void z(C18096U u10) {
        C17542s.j(u10, "type");
    }
}
