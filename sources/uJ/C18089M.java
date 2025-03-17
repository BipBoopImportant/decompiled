package uJ;

import fJ.n;
import fJ.w;
import kotlin.jvm.internal.C17542s;
import vJ.g;

/* renamed from: uJ.M  reason: case insensitive filesystem */
public final class C18089M extends C18087K implements N0 {

    /* renamed from: d  reason: collision with root package name */
    private final C18087K f147831d;

    /* renamed from: e  reason: collision with root package name */
    private final C18096U f147832e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18089M(C18087K k10, C18096U u10) {
        super(k10.V0(), k10.W0());
        C17542s.j(k10, "origin");
        C17542s.j(u10, "enhancement");
        this.f147831d = k10;
        this.f147832e = u10;
    }

    public P0 R0(boolean z10) {
        return O0.d(H0().R0(z10), j0().Q0().R0(z10));
    }

    public P0 T0(u0 u0Var) {
        C17542s.j(u0Var, "newAttributes");
        return O0.d(H0().T0(u0Var), j0());
    }

    public C18113f0 U0() {
        return H0().U0();
    }

    public String X0(n nVar, w wVar) {
        C17542s.j(nVar, "renderer");
        C17542s.j(wVar, "options");
        return wVar.d() ? nVar.S(j0()) : H0().X0(nVar, wVar);
    }

    /* renamed from: Y0 */
    public C18087K H0() {
        return this.f147831d;
    }

    /* renamed from: Z0 */
    public C18089M S0(g gVar) {
        C17542s.j(gVar, "kotlinTypeRefiner");
        C18096U h10 = gVar.h(H0());
        C17542s.h(h10, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return new C18089M((C18087K) h10, gVar.h(j0()));
    }

    public C18096U j0() {
        return this.f147832e;
    }

    public String toString() {
        return "[@EnhancedForWarnings(" + j0() + ")] " + H0();
    }
}
