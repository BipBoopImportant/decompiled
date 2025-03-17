package t0;

import androidx.compose.ui.d;
import c2.n;
import kotlin.Metadata;
import m0.C5548j;
import m0.N;
import m0.P0;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u0007\u001a\u00020\u0002*\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0007\u0010\u0006JI\u0010\r\u001a\u00020\u0002*\u00020\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bH\u0016¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lt0/c;", "", "Landroidx/compose/ui/d;", "", "fraction", "d", "(Landroidx/compose/ui/d;F)Landroidx/compose/ui/d;", "c", "Lm0/N;", "fadeInSpec", "Lc2/n;", "placementSpec", "fadeOutSpec", "a", "(Landroidx/compose/ui/d;Lm0/N;Lm0/N;Lm0/N;)Landroidx/compose/ui/d;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: t0.c  reason: case insensitive filesystem */
public interface C5938c {
    static /* synthetic */ d b(C5938c cVar, d dVar, float f10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                f10 = 1.0f;
            }
            return cVar.d(dVar, f10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxWidth");
    }

    static /* synthetic */ d e(C5938c cVar, d dVar, N n10, N n11, N n12, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                n10 = C5548j.h(0.0f, 400.0f, (Object) null, 5, (Object) null);
            }
            if ((i10 & 2) != 0) {
                n11 = C5548j.h(0.0f, 400.0f, n.b(P0.c(n.f23044b)), 1, (Object) null);
            }
            if ((i10 & 4) != 0) {
                n12 = C5548j.h(0.0f, 400.0f, (Object) null, 5, (Object) null);
            }
            return cVar.a(dVar, n10, n11, n12);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateItem");
    }

    d a(d dVar, N<Float> n10, N<n> n11, N<Float> n12) {
        return dVar;
    }

    d c(d dVar, float f10);

    d d(d dVar, float f10);
}
