package G1;

import androidx.compose.ui.d;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a0\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0007"}, d2 = {"LG1/j;", "LG1/e0;", "type", "stopType", "Landroidx/compose/ui/d$c;", "b", "(LG1/j;II)Landroidx/compose/ui/d$c;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: G1.d0  reason: case insensitive filesystem */
public final class C4500d0 {
    /* access modifiers changed from: private */
    public static final d.c b(C4507j jVar, int i10, int i11) {
        d.c a22 = jVar.E0().a2();
        if (a22 == null || (a22.Z1() & i10) == 0) {
            return null;
        }
        while (a22 != null) {
            int e22 = a22.e2();
            if ((e22 & i11) != 0) {
                return null;
            }
            if ((e22 & i10) != 0) {
                return a22;
            }
            a22 = a22.a2();
        }
        return null;
    }
}
