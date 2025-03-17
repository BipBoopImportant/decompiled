package u0;

import androidx.compose.ui.d;
import c2.n;
import kotlin.Metadata;
import m0.C5548j;
import m0.N;
import m0.P0;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001JI\u0010\t\u001a\u00020\u0002*\u00020\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H&¢\u0006\u0004\b\t\u0010\n\u0001\u0001\u000bø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lu0/o;", "", "Landroidx/compose/ui/d;", "Lm0/N;", "", "fadeInSpec", "Lc2/n;", "placementSpec", "fadeOutSpec", "a", "(Landroidx/compose/ui/d;Lm0/N;Lm0/N;Lm0/N;)Landroidx/compose/ui/d;", "Lu0/p;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: u0.o  reason: case insensitive filesystem */
public interface C5991o {
    static /* synthetic */ d b(C5991o oVar, d dVar, N n10, N n11, N n12, int i10, Object obj) {
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
            return oVar.a(dVar, n10, n11, n12);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateItem");
    }

    d a(d dVar, N<Float> n10, N<n> n11, N<Float> n12);
}
