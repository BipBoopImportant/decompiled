package zK;

import androidx.compose.ui.d;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a'\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/d;", "Lc2/h;", "width", "height", "a", "(Landroidx/compose/ui/d;FF)Landroidx/compose/ui/d;", "design_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: zK.k  reason: case insensitive filesystem */
public final class C18766k {
    public static final d a(d dVar, float f10, float f11) {
        C17542s.j(dVar, "$this$minimumTouchTargetSize");
        return dVar.s(new C18765j(f10, f11, (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ d b(d dVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = h.B((float) 48);
        }
        if ((i10 & 2) != 0) {
            f11 = h.B((float) 48);
        }
        return a(dVar, f10, f11);
    }
}
