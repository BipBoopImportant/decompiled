package androidx.compose.ui.platform;

import D1.a;
import G1.G;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import java.util.HashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0012\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u0011\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u0011\u0010\u001eJ\u001d\u0010#\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0019\u0010'\u001a\u00020\f2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\tH\u0017¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\fH\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\t2\u0006\u0010\"\u001a\u00020!H\u0014¢\u0006\u0004\b-\u0010.R3\u00105\u001a\u001e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u0002000/j\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u000200`18\u0006¢\u0006\f\n\u0004\b#\u00102\u001a\u0004\b3\u00104R3\u00107\u001a\u001e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u001f0/j\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u001f`18\u0006¢\u0006\f\n\u0004\b\u0011\u00102\u001a\u0004\b6\u00104¨\u00068"}, d2 = {"Landroidx/compose/ui/platform/AndroidViewsHandler;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "widthMeasureSpec", "heightMeasureSpec", "LXH/N;", "onMeasure", "(II)V", "", "changed", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "Landroid/view/View;", "child", "target", "onDescendantInvalidated", "(Landroid/view/View;Landroid/view/View;)V", "", "location", "Landroid/graphics/Rect;", "dirty", "", "([ILandroid/graphics/Rect;)Ljava/lang/Void;", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "view", "Landroid/graphics/Canvas;", "canvas", "a", "(Landroidx/compose/ui/viewinterop/AndroidViewHolder;Landroid/graphics/Canvas;)V", "Landroid/view/MotionEvent;", "ev", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "requestLayout", "()V", "shouldDelayChildPressedState", "()Z", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "Ljava/util/HashMap;", "LG1/G;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "getHolderToLayoutNode", "()Ljava/util/HashMap;", "holderToLayoutNode", "getLayoutNodeToHolder", "layoutNodeToHolder", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidViewsHandler extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<AndroidViewHolder, G> f19150a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<G, AndroidViewHolder> f19151b = new HashMap<>();

    public AndroidViewsHandler(Context context) {
        super(context);
        setClipChildren(false);
    }

    public final void a(AndroidViewHolder androidViewHolder, Canvas canvas) {
        androidViewHolder.draw(canvas);
    }

    public Void b(int[] iArr, Rect rect) {
        return null;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<AndroidViewHolder, G> getHolderToLayoutNode() {
        return this.f19150a;
    }

    public final HashMap<G, AndroidViewHolder> getLayoutNodeToHolder() {
        return this.f19151b;
    }

    public /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return (ViewParent) b(iArr, rect);
    }

    @SuppressLint({"MissingSuperCall"})
    public void onDescendantInvalidated(View view, View view2) {
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        for (AndroidViewHolder androidViewHolder : this.f19150a.keySet()) {
            androidViewHolder.layout(androidViewHolder.getLeft(), androidViewHolder.getTop(), androidViewHolder.getRight(), androidViewHolder.getBottom());
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        boolean z10 = false;
        if (!(View.MeasureSpec.getMode(i10) == 1073741824)) {
            a.a("widthMeasureSpec should be EXACTLY");
        }
        if (View.MeasureSpec.getMode(i11) == 1073741824) {
            z10 = true;
        }
        if (!z10) {
            a.a("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        for (AndroidViewHolder v10 : this.f19150a.keySet()) {
            v10.v();
        }
    }

    @SuppressLint({"MissingSuperCall"})
    public void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            G g10 = this.f19150a.get(childAt);
            if (childAt.isLayoutRequested() && g10 != null) {
                G.x1(g10, false, false, false, 7, (Object) null);
            }
        }
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
