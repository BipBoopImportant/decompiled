package p0;

import XH.C16807N;
import dI.C17164e;
import kotlin.Metadata;
import n0.C5589L;
import nI.p;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J>\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H¦@¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lp0/D;", "", "Ln0/L;", "scrollPriority", "Lkotlin/Function2;", "Lp0/A;", "LdI/e;", "LXH/N;", "block", "f", "(Ln0/L;LnI/p;LdI/e;)Ljava/lang/Object;", "", "delta", "e", "(F)F", "", "b", "()Z", "isScrollInProgress", "d", "canScrollForward", "c", "canScrollBackward", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: p0.D  reason: case insensitive filesystem */
public interface C5681D {
    static /* synthetic */ Object a(C5681D d10, C5589L l10, p pVar, C17164e eVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                l10 = C5589L.Default;
            }
            return d10.f(l10, pVar, eVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scroll");
    }

    boolean b();

    boolean c() {
        return true;
    }

    boolean d() {
        return true;
    }

    float e(float f10);

    Object f(C5589L l10, p<? super C5678A, ? super C17164e<? super C16807N>, ? extends Object> pVar, C17164e<? super C16807N> eVar);
}
