package N;

import G.c;
import android.util.Size;
import androidx.camera.core.impl.C5046s0;
import androidx.camera.core.impl.o1;

public final class e {
    public static void a(o1.a<?, ?, ?> aVar, int i10) {
        Size N10;
        C5046s0 s0Var = (C5046s0) aVar.e();
        int E10 = s0Var.E(-1);
        if (E10 == -1 || E10 != i10) {
            ((C5046s0.a) aVar).b(i10);
        }
        if (E10 != -1 && i10 != -1 && E10 != i10) {
            if (Math.abs(c.b(i10) - c.b(E10)) % 180 == 90 && (N10 = s0Var.N((Size) null)) != null) {
                ((C5046s0.a) aVar).d(new Size(N10.getHeight(), N10.getWidth()));
            }
        }
    }
}
