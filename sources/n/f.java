package N;

import C.W;
import N.c;
import androidx.camera.core.impl.A;
import androidx.camera.core.impl.C5047t;
import androidx.camera.core.impl.C5051v;
import androidx.camera.core.impl.C5055x;
import androidx.camera.core.impl.C5059z;
import androidx.camera.core.n;

public final class f extends a<n> {
    public f(int i10, c.a<n> aVar) {
        super(i10, aVar);
    }

    private boolean d(W w10) {
        C5059z a10 = A.a(w10);
        return (a10.h() == C5051v.LOCKED_FOCUSED || a10.h() == C5051v.PASSIVE_FOCUSED) && a10.k() == C5047t.CONVERGED && a10.i() == C5055x.CONVERGED;
    }

    public void c(n nVar) {
        if (d(nVar.F2())) {
            super.b(nVar);
        } else {
            this.f9155d.a(nVar);
        }
    }
}
