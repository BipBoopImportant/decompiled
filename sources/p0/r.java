package p0;

import XH.C16807N;
import dI.C17164e;
import kotlin.Metadata;
import n0.C5589L;
import nI.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J>\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H¦@¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lp0/r;", "", "Ln0/L;", "dragPriority", "Lkotlin/Function2;", "Lp0/n;", "LdI/e;", "LXH/N;", "block", "b", "(Ln0/L;LnI/p;LdI/e;)Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface r {
    static /* synthetic */ Object a(r rVar, C5589L l10, p pVar, C17164e eVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                l10 = C5589L.Default;
            }
            return rVar.b(l10, pVar, eVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drag");
    }

    Object b(C5589L l10, p<? super n, ? super C17164e<? super C16807N>, ? extends Object> pVar, C17164e<? super C16807N> eVar);
}
