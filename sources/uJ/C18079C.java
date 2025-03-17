package uJ;

import kotlin.jvm.internal.C17542s;

/* renamed from: uJ.C  reason: case insensitive filesystem */
public abstract class C18079C extends C18078B {

    /* renamed from: b  reason: collision with root package name */
    private final C18113f0 f147801b;

    public C18079C(C18113f0 f0Var) {
        C17542s.j(f0Var, "delegate");
        this.f147801b = f0Var;
    }

    /* renamed from: U0 */
    public C18113f0 R0(boolean z10) {
        return z10 == O0() ? this : W0().U0(z10).V0(M0());
    }

    /* renamed from: V0 */
    public C18113f0 T0(u0 u0Var) {
        C17542s.j(u0Var, "newAttributes");
        return u0Var != M0() ? new C18117h0(this, u0Var) : this;
    }

    /* access modifiers changed from: protected */
    public C18113f0 W0() {
        return this.f147801b;
    }
}
