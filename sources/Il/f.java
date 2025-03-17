package il;

import Xo.e;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import fI.C17221b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u0019B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001a¨\u0006 "}, d2 = {"Lil/f;", "Landroidx/recyclerview/widget/RecyclerView$p;", "", "spacing", "", "excludeLast", "Lil/f$a;", "orientation", "firstItemSpacing", "<init>", "(IZLil/f$a;I)V", "position", "l", "(I)I", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$C;", "state", "LXH/N;", "g", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$C;)V", "a", "I", "b", "Z", "c", "Lil/f$a;", "d", "uicomponents_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f extends RecyclerView.p {

    /* renamed from: a  reason: collision with root package name */
    private final int f98367a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f98368b;

    /* renamed from: c  reason: collision with root package name */
    private final a f98369c;

    /* renamed from: d  reason: collision with root package name */
    private final int f98370d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lil/f$a;", "", "<init>", "(Ljava/lang/String;I)V", "VERTICAL", "HORIZONTAL", "uicomponents_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum a {
        VERTICAL,
        HORIZONTAL;

        static {
            a[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i10, boolean z10, a aVar, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i12 & 2) != 0 ? false : z10, (i12 & 4) != 0 ? a.VERTICAL : aVar, (i12 & 8) != 0 ? (int) e.a(0) : i11);
    }

    private final int l(int i10) {
        if (i10 == 0) {
            return this.f98370d;
        }
        return 0;
    }

    public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C c10) {
        C17542s.j(rect, "outRect");
        C17542s.j(view, "view");
        C17542s.j(recyclerView, "parent");
        C17542s.j(c10, "state");
        RecyclerView.h adapter = recyclerView.getAdapter();
        if (adapter != null) {
            super.g(rect, view, recyclerView, c10);
            int m02 = recyclerView.m0(view);
            int i10 = (!this.f98368b || m02 < adapter.getItemCount() + -1) ? this.f98367a : 0;
            if (this.f98369c == a.VERTICAL) {
                rect.set(0, 0, 0, i10);
            } else {
                rect.set(l(m02), 0, i10, 0);
            }
        }
    }

    public f(int i10, boolean z10, a aVar, int i11) {
        C17542s.j(aVar, "orientation");
        this.f98367a = i10;
        this.f98368b = z10;
        this.f98369c = aVar;
        this.f98370d = i11;
    }
}
