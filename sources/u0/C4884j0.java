package U0;

import dI.C17164e;
import dI.C17168i;
import kotlin.Metadata;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a*\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001H@¢\u0006\u0004\b\u0004\u0010\u0005\u001a*\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001H@¢\u0006\u0004\b\u0006\u0010\u0005\"\u001e\u0010\r\u001a\u00020\b*\u00020\u00078FX\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"R", "Lkotlin/Function1;", "", "onFrame", "c", "(LnI/l;LdI/e;)Ljava/lang/Object;", "b", "LdI/i;", "LU0/h0;", "a", "(LdI/i;)LU0/h0;", "getMonotonicFrameClock$annotations", "(LdI/i;)V", "monotonicFrameClock", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: U0.j0  reason: case insensitive filesystem */
public final class C4884j0 {
    public static final C4879h0 a(C17168i iVar) {
        C4879h0 h0Var = (C4879h0) iVar.get(C4879h0.f13990g0);
        if (h0Var != null) {
            return h0Var;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static final <R> Object b(C17642l<? super Long, ? extends R> lVar, C17164e<? super R> eVar) {
        return a(eVar.getContext()).i0(new C4882i0(lVar), eVar);
    }

    public static final <R> Object c(C17642l<? super Long, ? extends R> lVar, C17164e<? super R> eVar) {
        return a(eVar.getContext()).i0(lVar, eVar);
    }
}
