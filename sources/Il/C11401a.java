package il;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ9\u0010\u000f\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lil/a;", "Landroidx/recyclerview/widget/g;", "<init>", "()V", "Landroidx/recyclerview/widget/RecyclerView$G;", "holder", "", "animateAdd", "(Landroidx/recyclerview/widget/RecyclerView$G;)Z", "animateRemove", "", "fromX", "fromY", "toX", "toY", "animateMove", "(Landroidx/recyclerview/widget/RecyclerView$G;IIII)Z", "uicomponents_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: il.a  reason: case insensitive filesystem */
public final class C11401a extends g {
    public C11401a() {
        setSupportsChangeAnimations(false);
    }

    public boolean animateAdd(RecyclerView.G g10) {
        dispatchAddFinished(g10);
        return false;
    }

    public boolean animateMove(RecyclerView.G g10, int i10, int i11, int i12, int i13) {
        dispatchMoveFinished(g10);
        return false;
    }

    public boolean animateRemove(RecyclerView.G g10) {
        dispatchRemoveFinished(g10);
        return false;
    }
}
