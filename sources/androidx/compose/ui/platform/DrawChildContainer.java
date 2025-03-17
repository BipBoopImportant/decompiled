package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import i1.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import p1.C5702H;
import p1.C5732n0;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010!\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010#¨\u0006%"}, d2 = {"Landroidx/compose/ui/platform/DrawChildContainer;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "changed", "", "l", "t", "r", "b", "LXH/N;", "onLayout", "(ZIIII)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "requestLayout", "()V", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "getChildCount", "()I", "Lp1/n0;", "Landroid/view/View;", "view", "", "drawingTime", "a", "(Lp1/n0;Landroid/view/View;J)V", "Z", "isDrawing", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class DrawChildContainer extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    private boolean f19189a;

    public DrawChildContainer(Context context) {
        super(context);
        setClipChildren(false);
        setTag(i.f24338J, Boolean.TRUE);
    }

    public final void a(C5732n0 n0Var, View view, long j10) {
        super.drawChild(C5702H.d(n0Var), view, j10);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        int childCount = super.getChildCount();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = getChildAt(i10);
            C17542s.h(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            if (((ViewLayer) childAt).u()) {
                this.f19189a = true;
                try {
                    super.dispatchDraw(canvas);
                    return;
                } finally {
                    this.f19189a = false;
                }
            } else {
                i10++;
            }
        }
    }

    public int getChildCount() {
        if (this.f19189a) {
            return super.getChildCount();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void requestLayout() {
    }
}
