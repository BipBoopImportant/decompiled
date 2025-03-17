package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;

public final class b implements r {

    /* renamed from: a  reason: collision with root package name */
    private final RecyclerView.h f43942a;

    public b(RecyclerView.h hVar) {
        this.f43942a = hVar;
    }

    public void a(int i10, int i11) {
        this.f43942a.notifyItemRangeInserted(i10, i11);
    }

    public void b(int i10, int i11) {
        this.f43942a.notifyItemRangeRemoved(i10, i11);
    }

    @SuppressLint({"UnknownNullness"})
    public void c(int i10, int i11, Object obj) {
        this.f43942a.notifyItemRangeChanged(i10, i11, obj);
    }

    public void d(int i10, int i11) {
        this.f43942a.notifyItemMoved(i10, i11);
    }
}
