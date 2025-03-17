package QJ;

import WJ.C16747h;
import WJ.C16748i;
import XH.C16807N;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.h;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0001\u001a\u00020\u0000H@¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"LXH/N;", "a", "(LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class s1 {
    public static final Object a(C17164e<? super C16807N> eVar) {
        Object obj;
        C17168i context = eVar.getContext();
        I0.l(context);
        C17164e<? super C16807N> c10 = C17187b.c(eVar);
        C16747h hVar = c10 instanceof C16747h ? (C16747h) c10 : null;
        if (hVar == null) {
            obj = C16807N.f139792a;
        } else {
            if (C16748i.d(hVar.f139551d, context)) {
                hVar.l(context, C16807N.f139792a);
            } else {
                r1 r1Var = new r1();
                C17168i plus = context.plus(r1Var);
                C16807N n10 = C16807N.f139792a;
                hVar.l(plus, n10);
                if (r1Var.f137679a) {
                    obj = C16748i.e(hVar) ? C17187b.f() : n10;
                }
            }
            obj = C17187b.f();
        }
        if (obj == C17187b.f()) {
            h.c(eVar);
        }
        return obj == C17187b.f() ? obj : C16807N.f139792a;
    }
}
