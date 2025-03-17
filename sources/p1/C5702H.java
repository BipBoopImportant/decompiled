package p1;

import android.graphics.Canvas;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t\"\u0019\u0010\u000e\u001a\u00060\u0005j\u0002`\u000b*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\f\u0010\r*\n\u0010\u000f\"\u00020\u00052\u00020\u0005¨\u0006\u0010"}, d2 = {"Lp1/J0;", "image", "Lp1/n0;", "a", "(Lp1/J0;)Lp1/n0;", "Landroid/graphics/Canvas;", "c", "b", "(Landroid/graphics/Canvas;)Lp1/n0;", "Landroid/graphics/Canvas;", "EmptyCanvas", "Landroidx/compose/ui/graphics/NativeCanvas;", "d", "(Lp1/n0;)Landroid/graphics/Canvas;", "nativeCanvas", "NativeCanvas", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: p1.H  reason: case insensitive filesystem */
public final class C5702H {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final Canvas f27206a = new Canvas();

    public static final C5732n0 a(J0 j02) {
        C5701G g10 = new C5701G();
        g10.b(new Canvas(O.b(j02)));
        return g10;
    }

    public static final C5732n0 b(Canvas canvas) {
        C5701G g10 = new C5701G();
        g10.b(canvas);
        return g10;
    }

    public static final Canvas d(C5732n0 n0Var) {
        C17542s.h(n0Var, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidCanvas");
        return ((C5701G) n0Var).a();
    }
}
