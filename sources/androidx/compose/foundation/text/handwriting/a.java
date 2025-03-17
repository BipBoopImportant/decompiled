package androidx.compose.foundation.text.handwriting;

import C0.c;
import androidx.compose.foundation.layout.D;
import androidx.compose.ui.d;
import c2.h;
import kotlin.Metadata;
import nI.C17631a;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a)\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u001a\u0010\f\u001a\u00020\u00078\u0000X\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u001a\u0010\r\u001a\u00020\u00078\u0000X\u0004¢\u0006\f\n\u0004\b\n\u0010\t\u001a\u0004\b\b\u0010\u000b¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/d;", "", "enabled", "Lkotlin/Function0;", "onHandwritingSlopExceeded", "c", "(Landroidx/compose/ui/d;ZLnI/a;)Landroidx/compose/ui/d;", "Lc2/h;", "a", "F", "b", "()F", "HandwritingBoundsVerticalOffset", "HandwritingBoundsHorizontalOffset", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final float f18507a = h.B((float) 40);

    /* renamed from: b  reason: collision with root package name */
    private static final float f18508b = h.B((float) 10);

    public static final float a() {
        return f18508b;
    }

    public static final float b() {
        return f18507a;
    }

    public static final d c(d dVar, boolean z10, C17631a<Boolean> aVar) {
        return (!z10 || !c.a()) ? dVar : D.j(dVar.s(new StylusHandwritingElementWithNegativePadding(aVar)), f18508b, f18507a);
    }
}
