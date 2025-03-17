package T1;

import N1.W;
import N1.X;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\"\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0005"}, d2 = {"LN1/W;", "target", "deleted", "a", "(JJ)J", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: T1.m  reason: case insensitive filesystem */
public final class C4844m {
    public static final long a(long j10, long j11) {
        int j12;
        int l10 = W.l(j10);
        int k10 = W.k(j10);
        if (W.p(j11, j10)) {
            if (W.d(j11, j10)) {
                l10 = W.l(j11);
                k10 = l10;
            } else if (W.d(j10, j11)) {
                j12 = W.j(j11);
            } else if (W.e(j11, l10)) {
                l10 = W.l(j11);
                j12 = W.j(j11);
            } else {
                k10 = W.l(j11);
            }
            return X.b(l10, k10);
        }
        if (k10 > W.l(j11)) {
            l10 -= W.j(j11);
            j12 = W.j(j11);
        }
        return X.b(l10, k10);
        k10 -= j12;
        return X.b(l10, k10);
    }
}
