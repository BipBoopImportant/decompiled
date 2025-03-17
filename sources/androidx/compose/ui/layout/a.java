package androidx.compose.ui.layout;

import E1.C4491y;
import E1.H;
import androidx.compose.ui.d;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/d;", "", "layoutId", "b", "(Landroidx/compose/ui/d;Ljava/lang/Object;)Landroidx/compose/ui/d;", "LE1/H;", "a", "(LE1/H;)Ljava/lang/Object;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a {
    public static final Object a(H h10) {
        Object h11 = h10.h();
        C4491y yVar = h11 instanceof C4491y ? (C4491y) h11 : null;
        if (yVar != null) {
            return yVar.e1();
        }
        return null;
    }

    public static final d b(d dVar, Object obj) {
        return dVar.s(new LayoutIdElement(obj));
    }
}
