package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public abstract class x extends RecyclerView.n {
    private static final boolean DEBUG = false;
    private static final String TAG = "SimpleItemAnimator";
    boolean mSupportsChangeAnimations = true;

    @SuppressLint({"UnknownNullness"})
    public abstract boolean animateAdd(RecyclerView.G g10);

    public boolean animateAppearance(RecyclerView.G g10, RecyclerView.n.c cVar, RecyclerView.n.c cVar2) {
        int i10;
        int i11;
        if (cVar == null || ((i10 = cVar.f43825a) == (i11 = cVar2.f43825a) && cVar.f43826b == cVar2.f43826b)) {
            return animateAdd(g10);
        }
        return animateMove(g10, i10, cVar.f43826b, i11, cVar2.f43826b);
    }

    @SuppressLint({"UnknownNullness"})
    public abstract boolean animateChange(RecyclerView.G g10, RecyclerView.G g11, int i10, int i11, int i12, int i13);

    public boolean animateChange(RecyclerView.G g10, RecyclerView.G g11, RecyclerView.n.c cVar, RecyclerView.n.c cVar2) {
        int i10;
        int i11;
        int i12 = cVar.f43825a;
        int i13 = cVar.f43826b;
        if (g11.shouldIgnore()) {
            int i14 = cVar.f43825a;
            i10 = cVar.f43826b;
            i11 = i14;
        } else {
            i11 = cVar2.f43825a;
            i10 = cVar2.f43826b;
        }
        return animateChange(g10, g11, i12, i13, i11, i10);
    }

    public boolean animateDisappearance(RecyclerView.G g10, RecyclerView.n.c cVar, RecyclerView.n.c cVar2) {
        int i10 = cVar.f43825a;
        int i11 = cVar.f43826b;
        View view = g10.itemView;
        int left = cVar2 == null ? view.getLeft() : cVar2.f43825a;
        int top = cVar2 == null ? view.getTop() : cVar2.f43826b;
        if (g10.isRemoved() || (i10 == left && i11 == top)) {
            return animateRemove(g10);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return animateMove(g10, i10, i11, left, top);
    }

    @SuppressLint({"UnknownNullness"})
    public abstract boolean animateMove(RecyclerView.G g10, int i10, int i11, int i12, int i13);

    public boolean animatePersistence(RecyclerView.G g10, RecyclerView.n.c cVar, RecyclerView.n.c cVar2) {
        int i10 = cVar.f43825a;
        int i11 = cVar2.f43825a;
        if (i10 == i11 && cVar.f43826b == cVar2.f43826b) {
            dispatchMoveFinished(g10);
            return false;
        }
        return animateMove(g10, i10, cVar.f43826b, i11, cVar2.f43826b);
    }

    @SuppressLint({"UnknownNullness"})
    public abstract boolean animateRemove(RecyclerView.G g10);

    public boolean canReuseUpdatedViewHolder(RecyclerView.G g10) {
        return !this.mSupportsChangeAnimations || g10.isInvalid();
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchAddFinished(RecyclerView.G g10) {
        onAddFinished(g10);
        dispatchAnimationFinished(g10);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchAddStarting(RecyclerView.G g10) {
        onAddStarting(g10);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchChangeFinished(RecyclerView.G g10, boolean z10) {
        onChangeFinished(g10, z10);
        dispatchAnimationFinished(g10);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchChangeStarting(RecyclerView.G g10, boolean z10) {
        onChangeStarting(g10, z10);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchMoveFinished(RecyclerView.G g10) {
        onMoveFinished(g10);
        dispatchAnimationFinished(g10);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchMoveStarting(RecyclerView.G g10) {
        onMoveStarting(g10);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchRemoveFinished(RecyclerView.G g10) {
        onRemoveFinished(g10);
        dispatchAnimationFinished(g10);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchRemoveStarting(RecyclerView.G g10) {
        onRemoveStarting(g10);
    }

    public boolean getSupportsChangeAnimations() {
        return this.mSupportsChangeAnimations;
    }

    @SuppressLint({"UnknownNullness"})
    public void onAddFinished(RecyclerView.G g10) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onAddStarting(RecyclerView.G g10) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onChangeFinished(RecyclerView.G g10, boolean z10) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onChangeStarting(RecyclerView.G g10, boolean z10) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onMoveFinished(RecyclerView.G g10) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onMoveStarting(RecyclerView.G g10) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onRemoveFinished(RecyclerView.G g10) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onRemoveStarting(RecyclerView.G g10) {
    }

    public void setSupportsChangeAnimations(boolean z10) {
        this.mSupportsChangeAnimations = z10;
    }
}
