package uJ;

import kotlin.jvm.internal.C17542s;
import vJ.g;

/* renamed from: uJ.i0  reason: case insensitive filesystem */
public final class C18119i0 extends C18078B implements N0 {

    /* renamed from: b  reason: collision with root package name */
    private final C18113f0 f147895b;

    /* renamed from: c  reason: collision with root package name */
    private final C18096U f147896c;

    public C18119i0(C18113f0 f0Var, C18096U u10) {
        C17542s.j(f0Var, "delegate");
        C17542s.j(u10, "enhancement");
        this.f147895b = f0Var;
        this.f147896c = u10;
    }

    /* renamed from: U0 */
    public C18113f0 R0(boolean z10) {
        P0 d10 = O0.d(H0().U0(z10), j0().Q0().R0(z10));
        C17542s.h(d10, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (C18113f0) d10;
    }

    /* renamed from: V0 */
    public C18113f0 T0(u0 u0Var) {
        C17542s.j(u0Var, "newAttributes");
        P0 d10 = O0.d(H0().V0(u0Var), j0());
        C17542s.h(d10, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (C18113f0) d10;
    }

    /* access modifiers changed from: protected */
    public C18113f0 W0() {
        return this.f147895b;
    }

    /* renamed from: Z0 */
    public C18113f0 H0() {
        return W0();
    }

    /* renamed from: a1 */
    public C18119i0 X0(g gVar) {
        C17542s.j(gVar, "kotlinTypeRefiner");
        C18096U h10 = gVar.h(W0());
        C17542s.h(h10, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new C18119i0((C18113f0) h10, gVar.h(j0()));
    }

    /* renamed from: b1 */
    public C18119i0 Y0(C18113f0 f0Var) {
        C17542s.j(f0Var, "delegate");
        return new C18119i0(f0Var, j0());
    }

    public C18096U j0() {
        return this.f147896c;
    }

    public String toString() {
        return "[@EnhancedForWarnings(" + j0() + ")] " + H0();
    }
}
