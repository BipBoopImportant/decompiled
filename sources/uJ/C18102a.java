package uJ;

import kotlin.jvm.internal.C17542s;
import vJ.g;

/* renamed from: uJ.a  reason: case insensitive filesystem */
public final class C18102a extends C18078B {

    /* renamed from: b  reason: collision with root package name */
    private final C18113f0 f147865b;

    /* renamed from: c  reason: collision with root package name */
    private final C18113f0 f147866c;

    public C18102a(C18113f0 f0Var, C18113f0 f0Var2) {
        C17542s.j(f0Var, "delegate");
        C17542s.j(f0Var2, "abbreviation");
        this.f147865b = f0Var;
        this.f147866c = f0Var2;
    }

    public final C18113f0 I() {
        return W0();
    }

    /* renamed from: V0 */
    public C18113f0 T0(u0 u0Var) {
        C17542s.j(u0Var, "newAttributes");
        return new C18102a(W0().V0(u0Var), this.f147866c);
    }

    /* access modifiers changed from: protected */
    public C18113f0 W0() {
        return this.f147865b;
    }

    public final C18113f0 Z0() {
        return this.f147866c;
    }

    /* renamed from: a1 */
    public C18102a U0(boolean z10) {
        return new C18102a(W0().U0(z10), this.f147866c.U0(z10));
    }

    /* renamed from: b1 */
    public C18102a X0(g gVar) {
        C17542s.j(gVar, "kotlinTypeRefiner");
        C18096U h10 = gVar.h(W0());
        C17542s.h(h10, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        C18096U h11 = gVar.h(this.f147866c);
        C17542s.h(h11, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new C18102a((C18113f0) h10, (C18113f0) h11);
    }

    /* renamed from: c1 */
    public C18102a Y0(C18113f0 f0Var) {
        C17542s.j(f0Var, "delegate");
        return new C18102a(f0Var, this.f147866c);
    }
}
