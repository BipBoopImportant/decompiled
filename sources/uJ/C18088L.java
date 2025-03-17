package uJ;

import DI.n0;
import XH.t;
import fJ.n;
import fJ.w;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import vJ.e;
import vJ.g;
import zJ.C18755d;

/* renamed from: uJ.L  reason: case insensitive filesystem */
public final class C18088L extends C18087K implements C18143x {

    /* renamed from: e  reason: collision with root package name */
    public static final a f147828e = new a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    public static boolean f147829f;

    /* renamed from: d  reason: collision with root package name */
    private boolean f147830d;

    /* renamed from: uJ.L$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18088L(C18113f0 f0Var, C18113f0 f0Var2) {
        super(f0Var, f0Var2);
        C17542s.j(f0Var, "lowerBound");
        C17542s.j(f0Var2, "upperBound");
    }

    private final void Z0() {
        if (f147829f && !this.f147830d) {
            this.f147830d = true;
            C18090N.b(V0());
            C18090N.b(W0());
            C17542s.e(V0(), W0());
            e.f149048a.d(V0(), W0());
        }
    }

    public boolean F0() {
        return (V0().N0().e() instanceof n0) && C17542s.e(V0().N0(), W0().N0());
    }

    public P0 R0(boolean z10) {
        return C18099X.e(V0().U0(z10), W0().U0(z10));
    }

    public C18096U S(C18096U u10) {
        P0 p02;
        C17542s.j(u10, "replacement");
        P0 Q02 = u10.Q0();
        if (Q02 instanceof C18087K) {
            p02 = Q02;
        } else if (Q02 instanceof C18113f0) {
            C18113f0 f0Var = (C18113f0) Q02;
            p02 = C18099X.e(f0Var, f0Var.U0(true));
        } else {
            throw new t();
        }
        return O0.b(p02, Q02);
    }

    public P0 T0(u0 u0Var) {
        C17542s.j(u0Var, "newAttributes");
        return C18099X.e(V0().V0(u0Var), W0().V0(u0Var));
    }

    public C18113f0 U0() {
        Z0();
        return V0();
    }

    public String X0(n nVar, w wVar) {
        C17542s.j(nVar, "renderer");
        C17542s.j(wVar, "options");
        if (!wVar.i()) {
            return nVar.P(nVar.S(V0()), nVar.S(W0()), C18755d.n(this));
        }
        return '(' + nVar.S(V0()) + ".." + nVar.S(W0()) + ')';
    }

    /* renamed from: Y0 */
    public C18087K S0(g gVar) {
        C17542s.j(gVar, "kotlinTypeRefiner");
        C18096U h10 = gVar.h(V0());
        C17542s.h(h10, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        C18096U h11 = gVar.h(W0());
        C17542s.h(h11, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new C18088L((C18113f0) h10, (C18113f0) h11);
    }

    public String toString() {
        return '(' + V0() + ".." + W0() + ')';
    }
}
