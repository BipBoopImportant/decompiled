package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import kotlin.Metadata;
import p1.P;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0017ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/platform/b0;", "Landroidx/compose/ui/platform/Y;", "<init>", "()V", "Landroid/view/View;", "view", "Lp1/O0;", "matrix", "LXH/N;", "a", "(Landroid/view/View;[F)V", "Landroid/graphics/Matrix;", "Landroid/graphics/Matrix;", "tmpMatrix", "", "b", "[I", "tmpPosition", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.b0  reason: case insensitive filesystem */
final class C5088b0 implements Y {

    /* renamed from: a  reason: collision with root package name */
    private final Matrix f19374a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    private final int[] f19375b = new int[2];

    public void a(View view, float[] fArr) {
        this.f19374a.reset();
        view.transformMatrixToGlobal(this.f19374a);
        ViewParent viewParent = view.getParent();
        while (viewParent instanceof View) {
            view = (View) viewParent;
            viewParent = view.getParent();
        }
        view.getLocationOnScreen(this.f19375b);
        int[] iArr = this.f19375b;
        int i10 = iArr[0];
        int i11 = iArr[1];
        view.getLocationInWindow(iArr);
        int[] iArr2 = this.f19375b;
        this.f19374a.postTranslate((float) (iArr2[0] - i10), (float) (iArr2[1] - i11));
        P.b(fArr, this.f19374a);
    }
}
