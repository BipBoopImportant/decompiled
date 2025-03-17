package yF;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LyF/d;", "Landroidx/recyclerview/widget/RecyclerView$p;", "", "spaceSize", "<init>", "(F)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$C;", "state", "LXH/N;", "g", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$C;)V", "a", "F", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: yF.d  reason: case insensitive filesystem */
public final class C15306d extends RecyclerView.p {

    /* renamed from: a  reason: collision with root package name */
    private final float f132226a;

    public C15306d(float f10) {
        this.f132226a = f10;
    }

    public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C c10) {
        C17542s.j(rect, "outRect");
        C17542s.j(view, "view");
        C17542s.j(recyclerView, "parent");
        C17542s.j(c10, "state");
        if (recyclerView.m0(view) != 0) {
            rect.top = (int) this.f132226a;
        }
    }
}
