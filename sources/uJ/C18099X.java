package uJ;

import DI.C15558e;
import DI.C15561h;
import DI.m0;
import DI.n0;
import GI.C15707A;
import YH.C16877v;
import iJ.C17383q;
import java.util.List;
import kJ.C17506e;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nJ.C17656k;
import uJ.C18137r0;
import vJ.g;
import wJ.C18226h;
import wJ.C18230l;

/* renamed from: uJ.X  reason: case insensitive filesystem */
public final class C18099X {

    /* renamed from: a  reason: collision with root package name */
    public static final C18099X f147858a = new C18099X();

    /* renamed from: b  reason: collision with root package name */
    private static final C17642l<g, C18113f0> f147859b = a.f147860a;

    /* renamed from: uJ.X$a */
    static final class a implements C17642l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f147860a = new a();

        a() {
        }

        /* renamed from: a */
        public final Void invoke(g gVar) {
            C17542s.j(gVar, "<unused var>");
            return null;
        }
    }

    /* renamed from: uJ.X$b */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final C18113f0 f147861a;

        /* renamed from: b  reason: collision with root package name */
        private final y0 f147862b;

        public b(C18113f0 f0Var, y0 y0Var) {
            this.f147861a = f0Var;
            this.f147862b = y0Var;
        }

        public final C18113f0 a() {
            return this.f147861a;
        }

        public final y0 b() {
            return this.f147862b;
        }
    }

    private C18099X() {
    }

    public static final C18113f0 c(m0 m0Var, List<? extends E0> list) {
        C17542s.j(m0Var, "<this>");
        C17542s.j(list, "arguments");
        return new C18133p0(C18137r0.a.f147928a, false).i(C18135q0.f147923e.a((C18135q0) null, m0Var, list), u0.f147932b.k());
    }

    private final C17656k d(y0 y0Var, List<? extends E0> list, g gVar) {
        C15561h e10 = y0Var.e();
        if (e10 instanceof n0) {
            return ((n0) e10).r().q();
        }
        if (e10 instanceof C15558e) {
            if (gVar == null) {
                gVar = C17506e.r(C17506e.s(e10));
            }
            return list.isEmpty() ? C15707A.b((C15558e) e10, gVar) : C15707A.a((C15558e) e10, z0.f147956c.b(y0Var, list), gVar);
        } else if (e10 instanceof m0) {
            return C18230l.a(C18226h.SCOPE_FOR_ABBREVIATION_TYPE, true, ((m0) e10).getName().toString());
        } else {
            if (y0Var instanceof C18095T) {
                return ((C18095T) y0Var).j();
            }
            throw new IllegalStateException("Unsupported classifier: " + e10 + " for constructor: " + y0Var);
        }
    }

    public static final P0 e(C18113f0 f0Var, C18113f0 f0Var2) {
        C17542s.j(f0Var, "lowerBound");
        C17542s.j(f0Var2, "upperBound");
        return C17542s.e(f0Var, f0Var2) ? f0Var : new C18088L(f0Var, f0Var2);
    }

    public static final C18113f0 f(u0 u0Var, C17383q qVar, boolean z10) {
        C17542s.j(u0Var, "attributes");
        C17542s.j(qVar, "constructor");
        return m(u0Var, qVar, C16877v.n(), z10, C18230l.a(C18226h.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"));
    }

    private final b g(y0 y0Var, g gVar, List<? extends E0> list) {
        C15561h f10;
        C15561h e10 = y0Var.e();
        if (e10 == null || (f10 = gVar.f(e10)) == null) {
            return null;
        }
        if (f10 instanceof m0) {
            return new b(c((m0) f10, list), (y0) null);
        }
        y0 b10 = f10.k().b(gVar);
        C17542s.i(b10, "refine(...)");
        return new b((C18113f0) null, b10);
    }

    public static final C18113f0 h(u0 u0Var, C15558e eVar, List<? extends E0> list) {
        C17542s.j(u0Var, "attributes");
        C17542s.j(eVar, "descriptor");
        C17542s.j(list, "arguments");
        y0 k10 = eVar.k();
        C17542s.i(k10, "getTypeConstructor(...)");
        return k(u0Var, k10, list, false, (g) null, 16, (Object) null);
    }

    public static final C18113f0 i(u0 u0Var, y0 y0Var, List<? extends E0> list, boolean z10) {
        C17542s.j(u0Var, "attributes");
        C17542s.j(y0Var, "constructor");
        C17542s.j(list, "arguments");
        return k(u0Var, y0Var, list, z10, (g) null, 16, (Object) null);
    }

    public static final C18113f0 j(u0 u0Var, y0 y0Var, List<? extends E0> list, boolean z10, g gVar) {
        C17542s.j(u0Var, "attributes");
        C17542s.j(y0Var, "constructor");
        C17542s.j(list, "arguments");
        if (!u0Var.isEmpty() || !list.isEmpty() || z10 || y0Var.e() == null) {
            return n(u0Var, y0Var, list, z10, f147858a.d(y0Var, list, gVar), new C18097V(y0Var, list, u0Var, z10));
        }
        C15561h e10 = y0Var.e();
        C17542s.g(e10);
        C18113f0 r10 = e10.r();
        C17542s.i(r10, "getDefaultType(...)");
        return r10;
    }

    public static /* synthetic */ C18113f0 k(u0 u0Var, y0 y0Var, List list, boolean z10, g gVar, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            gVar = null;
        }
        return j(u0Var, y0Var, list, z10, gVar);
    }

    /* access modifiers changed from: private */
    public static final C18113f0 l(y0 y0Var, List list, u0 u0Var, boolean z10, g gVar) {
        C17542s.j(gVar, "refiner");
        b g10 = f147858a.g(y0Var, gVar, list);
        if (g10 == null) {
            return null;
        }
        C18113f0 a10 = g10.a();
        if (a10 != null) {
            return a10;
        }
        y0 b10 = g10.b();
        C17542s.g(b10);
        return j(u0Var, b10, list, z10, gVar);
    }

    public static final C18113f0 m(u0 u0Var, y0 y0Var, List<? extends E0> list, boolean z10, C17656k kVar) {
        C17542s.j(u0Var, "attributes");
        C17542s.j(y0Var, "constructor");
        C17542s.j(list, "arguments");
        C17542s.j(kVar, "memberScope");
        y0 y0Var2 = y0Var;
        List<? extends E0> list2 = list;
        C18115g0 g0Var = new C18115g0(y0Var2, list2, z10, kVar, new C18098W(y0Var2, list2, u0Var, z10, kVar));
        return u0Var.isEmpty() ? g0Var : new C18117h0(g0Var, u0Var);
    }

    public static final C18113f0 n(u0 u0Var, y0 y0Var, List<? extends E0> list, boolean z10, C17656k kVar, C17642l<? super g, ? extends C18113f0> lVar) {
        C17542s.j(u0Var, "attributes");
        C17542s.j(y0Var, "constructor");
        C17542s.j(list, "arguments");
        C17542s.j(kVar, "memberScope");
        C17542s.j(lVar, "refinedTypeFactory");
        C18115g0 g0Var = new C18115g0(y0Var, list, z10, kVar, lVar);
        return u0Var.isEmpty() ? g0Var : new C18117h0(g0Var, u0Var);
    }

    /* access modifiers changed from: private */
    public static final C18113f0 o(y0 y0Var, List list, u0 u0Var, boolean z10, C17656k kVar, g gVar) {
        C17542s.j(gVar, "kotlinTypeRefiner");
        b g10 = f147858a.g(y0Var, gVar, list);
        if (g10 == null) {
            return null;
        }
        C18113f0 a10 = g10.a();
        if (a10 != null) {
            return a10;
        }
        y0 b10 = g10.b();
        C17542s.g(b10);
        return m(u0Var, b10, list, z10, kVar);
    }
}
