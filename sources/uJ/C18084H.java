package uJ;

import DI.n0;
import kotlin.jvm.internal.C17542s;

/* renamed from: uJ.H  reason: case insensitive filesystem */
public class C18084H {
    public static /* synthetic */ E0 b(C18084H h10, n0 n0Var, C18085I i10, D0 d02, C18096U u10, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 8) != 0) {
                u10 = d02.e(n0Var, i10);
            }
            return h10.a(n0Var, i10, d02, u10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: computeProjection");
    }

    public E0 a(n0 n0Var, C18085I i10, D0 d02, C18096U u10) {
        C17542s.j(n0Var, "parameter");
        C17542s.j(i10, "typeAttr");
        C17542s.j(d02, "typeParameterUpperBoundEraser");
        C17542s.j(u10, "erasedUpperBound");
        return new G0(Q0.OUT_VARIANCE, u10);
    }
}
