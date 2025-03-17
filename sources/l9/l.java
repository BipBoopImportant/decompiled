package l9;

import android.annotation.SuppressLint;
import j9.f;
import j9.i;
import p9.C8639a;

public final class l {
    @SuppressLint({"DiscouragedApi"})
    public static void a(i<?> iVar, f fVar) {
        if (iVar instanceof s) {
            u.c().e().u(((s) iVar).d().f(fVar), 1);
            return;
        }
        C8639a.f("ForcedSender", "Expected instance of `TransportImpl`, got `%s`.", iVar);
    }
}
