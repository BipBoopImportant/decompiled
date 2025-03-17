package V5;

import QJ.C16310i;
import QJ.C16311i0;
import QJ.F0;
import QJ.M;
import QJ.Q;
import QJ.S;
import QJ.T;
import XH.C16807N;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LQJ/Q;", "Lkotlin/Function2;", "LdI/e;", "LXH/N;", "", "block", "LQJ/F0;", "a", "(LQJ/Q;LnI/p;)LQJ/F0;", "coil-compose-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g {
    public static final F0 a(Q q10, p<? super Q, ? super C17164e<? super C16807N>, ? extends Object> pVar) {
        M e10 = l.e(q10.getCoroutineContext());
        return (e10 == null || C17542s.e(e10, C16311i0.d())) ? C16310i.c(q10, C16311i0.d(), T.UNDISPATCHED, pVar) : C16310i.c(S.a(new e(q10.getCoroutineContext())), new f(e10), T.UNDISPATCHED, pVar);
    }
}
