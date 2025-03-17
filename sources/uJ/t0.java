package uJ;

import DI.C15566m;
import EI.C15649h;

public interface t0 {

    public static final class a {
        public static /* synthetic */ u0 a(t0 t0Var, C15649h hVar, y0 y0Var, C15566m mVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    y0Var = null;
                }
                if ((i10 & 4) != 0) {
                    mVar = null;
                }
                return t0Var.a(hVar, y0Var, mVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toAttributes");
        }
    }

    u0 a(C15649h hVar, y0 y0Var, C15566m mVar);
}
