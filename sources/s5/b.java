package S5;

import GK.C15776D;
import GK.C15786e;
import QJ.C16324p;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.h;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LGK/e;", "LGK/D;", "a", "(LGK/e;LdI/e;)Ljava/lang/Object;", "coil-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class b {
    public static final Object a(C15786e eVar, C17164e<? super C15776D> eVar2) {
        C16324p pVar = new C16324p(C17187b.c(eVar2), 1);
        pVar.C();
        k kVar = new k(eVar, pVar);
        FirebasePerfOkHttpClient.enqueue(eVar, kVar);
        pVar.K(kVar);
        Object w10 = pVar.w();
        if (w10 == C17187b.f()) {
            h.c(eVar2);
        }
        return w10;
    }
}
