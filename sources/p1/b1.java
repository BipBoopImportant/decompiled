package p1;

import XH.C16814e;
import android.graphics.Rect;
import android.graphics.RectF;
import c2.p;
import kotlin.Metadata;
import o1.C5669i;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\u0007\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\t\u001a\u00020\u0000*\u00020\u0004¢\u0006\u0004\b\t\u0010\n\u001a\u0011\u0010\f\u001a\u00020\u0001*\u00020\u000b¢\u0006\u0004\b\f\u0010\r\u001a\u0011\u0010\u000e\u001a\u00020\u000b*\u00020\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lo1/i;", "Landroid/graphics/Rect;", "b", "(Lo1/i;)Landroid/graphics/Rect;", "Landroid/graphics/RectF;", "c", "(Lo1/i;)Landroid/graphics/RectF;", "e", "(Landroid/graphics/Rect;)Lo1/i;", "f", "(Landroid/graphics/RectF;)Lo1/i;", "Lc2/p;", "a", "(Lc2/p;)Landroid/graphics/Rect;", "d", "(Landroid/graphics/Rect;)Lc2/p;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class b1 {
    public static final Rect a(p pVar) {
        return new Rect(pVar.j(), pVar.m(), pVar.k(), pVar.e());
    }

    @C16814e
    public static final Rect b(C5669i iVar) {
        return new Rect((int) iVar.o(), (int) iVar.r(), (int) iVar.p(), (int) iVar.j());
    }

    public static final RectF c(C5669i iVar) {
        return new RectF(iVar.o(), iVar.r(), iVar.p(), iVar.j());
    }

    public static final p d(Rect rect) {
        return new p(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final C5669i e(Rect rect) {
        return new C5669i((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
    }

    public static final C5669i f(RectF rectF) {
        return new C5669i(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
