package XJ;

import QJ.C16301d0;
import WJ.C16748i;
import XH.C16807N;
import XH.x;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import nI.p;

@Metadata(d1 = {"\u0000$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0004\u001aQ\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0000¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\u000b\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00070\u00032\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a#\u0010\u000f\u001a\u00020\u00072\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"R", "T", "Lkotlin/Function2;", "LdI/e;", "", "receiver", "completion", "LXH/N;", "c", "(LnI/p;Ljava/lang/Object;LdI/e;)V", "fatalCompletion", "b", "(LdI/e;LdI/e;)V", "", "e", "a", "(LdI/e;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: XJ.a  reason: case insensitive filesystem */
public final class C16832a {
    private static final void a(C17164e<?> eVar, Throwable th2) {
        if (th2 instanceof C16301d0) {
            th2 = ((C16301d0) th2).getCause();
        }
        x.a aVar = x.f139812b;
        eVar.resumeWith(x.b(y.a(th2)));
        throw th2;
    }

    public static final void b(C17164e<? super C16807N> eVar, C17164e<?> eVar2) {
        try {
            C17164e<? super C16807N> c10 = C17187b.c(eVar);
            x.a aVar = x.f139812b;
            C16748i.b(c10, x.b(C16807N.f139792a));
        } catch (Throwable th2) {
            a(eVar2, th2);
        }
    }

    public static final <R, T> void c(p<? super R, ? super C17164e<? super T>, ? extends Object> pVar, R r10, C17164e<? super T> eVar) {
        try {
            C17164e<C16807N> c10 = C17187b.c(C17187b.a(pVar, r10, eVar));
            x.a aVar = x.f139812b;
            C16748i.b(c10, x.b(C16807N.f139792a));
        } catch (Throwable th2) {
            a(eVar, th2);
        }
    }
}
