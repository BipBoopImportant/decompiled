package il;

import Xo.e;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ip.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tI.C17974j;
import tI.C17978n;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B/\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lil/b;", "Landroidx/recyclerview/widget/RecyclerView$p;", "", "lineHeight", "color", "startIndex", "Landroid/graphics/drawable/Drawable;", "drawable", "<init>", "(IIILandroid/graphics/drawable/Drawable;)V", "Landroid/graphics/Canvas;", "canvas", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$C;", "state", "LXH/N;", "i", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$C;)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "g", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$C;)V", "a", "I", "b", "c", "Landroid/graphics/drawable/Drawable;", "d", "Landroid/graphics/Rect;", "bounds", "uicomponents_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: il.b  reason: case insensitive filesystem */
public final class C11402b extends RecyclerView.p {

    /* renamed from: a  reason: collision with root package name */
    private final int f98362a;

    /* renamed from: b  reason: collision with root package name */
    private final int f98363b;

    /* renamed from: c  reason: collision with root package name */
    private final Drawable f98364c;

    /* renamed from: d  reason: collision with root package name */
    private final Rect f98365d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11402b(int i10, int i11, int i12, Drawable drawable, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? h.a(e.a(1)) : i10, i11, (i13 & 4) != 0 ? 1 : i12, (i13 & 8) != 0 ? new ColorDrawable(i11) : drawable);
    }

    public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C c10) {
        C17542s.j(rect, "outRect");
        C17542s.j(view, "view");
        C17542s.j(recyclerView, "parent");
        C17542s.j(c10, "state");
        rect.set(0, 0, 0, 0);
    }

    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C c10) {
        C17542s.j(canvas, "canvas");
        C17542s.j(recyclerView, "parent");
        C17542s.j(c10, "state");
        C17974j w10 = C17978n.w(this.f98363b, recyclerView.getChildCount() - 1);
        int p10 = w10.p();
        int q10 = w10.q();
        if (p10 <= q10) {
            while (true) {
                View childAt = recyclerView.getChildAt(p10);
                recyclerView.q0(childAt, this.f98365d);
                int a10 = this.f98365d.bottom + h.a(childAt.getTranslationY());
                this.f98364c.setBounds(0, a10 - this.f98362a, recyclerView.getWidth(), a10);
                this.f98364c.draw(canvas);
                if (p10 != q10) {
                    p10++;
                } else {
                    return;
                }
            }
        }
    }

    public C11402b(int i10, int i11, int i12, Drawable drawable) {
        C17542s.j(drawable, "drawable");
        this.f98362a = i10;
        this.f98363b = i12;
        this.f98364c = drawable;
        this.f98365d = new Rect();
    }
}
