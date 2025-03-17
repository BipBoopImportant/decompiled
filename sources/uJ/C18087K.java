package uJ;

import fJ.n;
import fJ.w;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nJ.C17656k;
import yJ.C18738g;

/* renamed from: uJ.K  reason: case insensitive filesystem */
public abstract class C18087K extends P0 implements C18738g {

    /* renamed from: b  reason: collision with root package name */
    private final C18113f0 f147826b;

    /* renamed from: c  reason: collision with root package name */
    private final C18113f0 f147827c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18087K(C18113f0 f0Var, C18113f0 f0Var2) {
        super((DefaultConstructorMarker) null);
        C17542s.j(f0Var, "lowerBound");
        C17542s.j(f0Var2, "upperBound");
        this.f147826b = f0Var;
        this.f147827c = f0Var2;
    }

    public List<E0> L0() {
        return U0().L0();
    }

    public u0 M0() {
        return U0().M0();
    }

    public y0 N0() {
        return U0().N0();
    }

    public boolean O0() {
        return U0().O0();
    }

    public abstract C18113f0 U0();

    public final C18113f0 V0() {
        return this.f147826b;
    }

    public final C18113f0 W0() {
        return this.f147827c;
    }

    public abstract String X0(n nVar, w wVar);

    public C17656k q() {
        return U0().q();
    }

    public String toString() {
        return n.f143183k.S(this);
    }
}
