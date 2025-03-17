package cl;

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

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\"\u0010#\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcl/a;", "Landroidx/recyclerview/widget/RecyclerView$p;", "", "lineHeight", "color", "", "excludeLast", "addToTopItem", "<init>", "(IIZZ)V", "Landroid/graphics/Canvas;", "canvas", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$C;", "state", "LXH/N;", "i", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$C;)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "g", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$C;)V", "a", "I", "b", "Z", "c", "d", "getEnabled", "()Z", "setEnabled", "(Z)V", "enabled", "Landroid/graphics/drawable/Drawable;", "e", "Landroid/graphics/drawable/Drawable;", "drawable", "f", "Landroid/graphics/Rect;", "bounds", "uicomponents_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: cl.a  reason: case insensitive filesystem */
public final class C11144a extends RecyclerView.p {

    /* renamed from: a  reason: collision with root package name */
    private final int f90763a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f90764b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f90765c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f90766d;

    /* renamed from: e  reason: collision with root package name */
    private final Drawable f90767e;

    /* renamed from: f  reason: collision with root package name */
    private final Rect f90768f;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11144a(int i10, int i11, boolean z10, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? h.a(e.a(1)) : i10, i11, (i12 & 4) != 0 ? false : z10, (i12 & 8) != 0 ? false : z11);
    }

    public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C c10) {
        RecyclerView.h adapter;
        C17542s.j(rect, "outRect");
        C17542s.j(view, "view");
        C17542s.j(recyclerView, "parent");
        C17542s.j(c10, "state");
        if (this.f90766d && (adapter = recyclerView.getAdapter()) != null) {
            super.g(rect, view, recyclerView, c10);
            int m02 = recyclerView.m0(view);
            rect.set(0, (m02 != 0 || !this.f90765c) ? 0 : this.f90763a, 0, (!this.f90764b || m02 < adapter.getItemCount() + -1) ? this.f90763a : 0);
        }
    }

    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C c10) {
        RecyclerView.h adapter;
        C17542s.j(canvas, "canvas");
        C17542s.j(recyclerView, "parent");
        C17542s.j(c10, "state");
        if (this.f90766d && (adapter = recyclerView.getAdapter()) != null) {
            int childCount = recyclerView.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = recyclerView.getChildAt(i10);
                int m02 = recyclerView.m0(childAt);
                if (!this.f90764b || m02 < adapter.getItemCount() - 1) {
                    recyclerView.q0(childAt, this.f90768f);
                    int a10 = this.f90768f.bottom + h.a(childAt.getTranslationY());
                    this.f90767e.setBounds(0, a10 - this.f90763a, recyclerView.getWidth(), a10);
                    this.f90767e.draw(canvas);
                }
            }
        }
    }

    public C11144a(int i10, int i11, boolean z10, boolean z11) {
        this.f90763a = i10;
        this.f90764b = z10;
        this.f90765c = z11;
        this.f90766d = true;
        this.f90767e = new ColorDrawable(i11);
        this.f90768f = new Rect();
    }
}
