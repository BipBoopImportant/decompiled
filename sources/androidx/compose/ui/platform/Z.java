package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p1.O0;
import p1.P;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000e\u001a\u00020\t*\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0013\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\"\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/platform/Z;", "Landroidx/compose/ui/platform/Y;", "Lp1/O0;", "tmpMatrix", "<init>", "([FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroid/view/View;", "view", "matrix", "LXH/N;", "d", "(Landroid/view/View;[F)V", "Landroid/graphics/Matrix;", "other", "b", "([FLandroid/graphics/Matrix;)V", "", "x", "y", "c", "([FFF)V", "a", "[F", "", "[I", "tmpLocation", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class Z implements Y {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f19362a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f19363b;

    public /* synthetic */ Z(float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(fArr);
    }

    private final void b(float[] fArr, Matrix matrix) {
        P.b(this.f19362a, matrix);
        K.i(fArr, this.f19362a);
    }

    private final void c(float[] fArr, float f10, float f11) {
        K.j(fArr, f10, f11, this.f19362a);
    }

    private final void d(View view, float[] fArr) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            d((View) parent, fArr);
            c(fArr, -((float) view.getScrollX()), -((float) view.getScrollY()));
            c(fArr, (float) view.getLeft(), (float) view.getTop());
        } else {
            int[] iArr = this.f19363b;
            view.getLocationInWindow(iArr);
            c(fArr, -((float) view.getScrollX()), -((float) view.getScrollY()));
            c(fArr, (float) iArr[0], (float) iArr[1]);
        }
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            b(fArr, matrix);
        }
    }

    public void a(View view, float[] fArr) {
        O0.h(fArr);
        d(view, fArr);
    }

    private Z(float[] fArr) {
        this.f19362a = fArr;
        this.f19363b = new int[2];
    }
}
