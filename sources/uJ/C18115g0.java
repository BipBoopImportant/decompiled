package uJ;

import java.util.List;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nJ.C17656k;
import vJ.g;
import wJ.C18225g;
import wJ.C18231m;

/* renamed from: uJ.g0  reason: case insensitive filesystem */
final class C18115g0 extends C18113f0 {

    /* renamed from: b  reason: collision with root package name */
    private final y0 f147884b;

    /* renamed from: c  reason: collision with root package name */
    private final List<E0> f147885c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f147886d;

    /* renamed from: e  reason: collision with root package name */
    private final C17656k f147887e;

    /* renamed from: f  reason: collision with root package name */
    private final C17642l<g, C18113f0> f147888f;

    public C18115g0(y0 y0Var, List<? extends E0> list, boolean z10, C17656k kVar, C17642l<? super g, ? extends C18113f0> lVar) {
        C17542s.j(y0Var, "constructor");
        C17542s.j(list, "arguments");
        C17542s.j(kVar, "memberScope");
        C17542s.j(lVar, "refinedTypeFactory");
        this.f147884b = y0Var;
        this.f147885c = list;
        this.f147886d = z10;
        this.f147887e = kVar;
        this.f147888f = lVar;
        if ((q() instanceof C18225g) && !(q() instanceof C18231m)) {
            throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + q() + 10 + N0());
        }
    }

    public List<E0> L0() {
        return this.f147885c;
    }

    public u0 M0() {
        return u0.f147932b.k();
    }

    public y0 N0() {
        return this.f147884b;
    }

    public boolean O0() {
        return this.f147886d;
    }

    /* renamed from: U0 */
    public C18113f0 R0(boolean z10) {
        return z10 == O0() ? this : z10 ? new C18109d0(this) : new C18105b0(this);
    }

    /* renamed from: V0 */
    public C18113f0 T0(u0 u0Var) {
        C17542s.j(u0Var, "newAttributes");
        return u0Var.isEmpty() ? this : new C18117h0(this, u0Var);
    }

    /* renamed from: W0 */
    public C18113f0 S0(g gVar) {
        C17542s.j(gVar, "kotlinTypeRefiner");
        C18113f0 invoke = this.f147888f.invoke(gVar);
        return invoke == null ? this : invoke;
    }

    public C17656k q() {
        return this.f147887e;
    }
}
