package T1;

import N1.C4669d;
import N1.W;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u0011\u0010\u0007\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LT1/P;", "", "maxChars", "LN1/d;", "c", "(LT1/P;I)LN1/d;", "b", "a", "(LT1/P;)LN1/d;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class Q {
    public static final C4669d a(P p10) {
        return p10.f().r(p10.h());
    }

    public static final C4669d b(P p10, int i10) {
        return p10.f().subSequence(W.k(p10.h()), Math.min(W.k(p10.h()) + i10, p10.i().length()));
    }

    public static final C4669d c(P p10, int i10) {
        return p10.f().subSequence(Math.max(0, W.l(p10.h()) - i10), W.l(p10.h()));
    }
}
