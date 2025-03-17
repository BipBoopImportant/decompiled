package uJ;

import kotlin.jvm.internal.C17542s;

/* renamed from: uJ.h0  reason: case insensitive filesystem */
final class C18117h0 extends C18079C {

    /* renamed from: c  reason: collision with root package name */
    private final u0 f147893c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18117h0(C18113f0 f0Var, u0 u0Var) {
        super(f0Var);
        C17542s.j(f0Var, "delegate");
        C17542s.j(u0Var, "attributes");
        this.f147893c = u0Var;
    }

    public u0 M0() {
        return this.f147893c;
    }

    /* renamed from: Z0 */
    public C18117h0 Y0(C18113f0 f0Var) {
        C17542s.j(f0Var, "delegate");
        return new C18117h0(f0Var, M0());
    }
}
