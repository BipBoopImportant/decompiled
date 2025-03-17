package uJ;

import java.util.List;
import kotlin.jvm.internal.C17542s;
import nJ.C17656k;
import vJ.g;

/* renamed from: uJ.B  reason: case insensitive filesystem */
public abstract class C18078B extends C18113f0 {
    public List<E0> L0() {
        return W0().L0();
    }

    public u0 M0() {
        return W0().M0();
    }

    public y0 N0() {
        return W0().N0();
    }

    public boolean O0() {
        return W0().O0();
    }

    /* access modifiers changed from: protected */
    public abstract C18113f0 W0();

    /* renamed from: X0 */
    public C18113f0 S0(g gVar) {
        C17542s.j(gVar, "kotlinTypeRefiner");
        C18096U h10 = gVar.h(W0());
        C17542s.h(h10, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return Y0((C18113f0) h10);
    }

    public abstract C18078B Y0(C18113f0 f0Var);

    public C17656k q() {
        return W0().q();
    }
}
