package G1;

import androidx.compose.ui.d;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LG1/j;", "Landroidx/compose/ui/d$c;", "b", "(LG1/j;)Landroidx/compose/ui/d$c;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class J {
    /* access modifiers changed from: private */
    public static final d.c b(C4507j jVar) {
        int a10 = C4502e0.a(4);
        int a11 = C4502e0.a(2);
        d.c a22 = jVar.E0().a2();
        if (a22 == null || (a22.Z1() & a10) == 0) {
            return null;
        }
        while (a22 != null && (a22.e2() & a11) == 0) {
            if ((a22.e2() & a10) != 0) {
                return a22;
            }
            a22 = a22.a2();
        }
        return null;
    }
}
