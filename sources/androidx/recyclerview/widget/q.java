package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.G;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.h;
import java.util.List;

public abstract class q<T, VH extends RecyclerView.G> extends RecyclerView.h<VH> {
    final d<T> mDiffer;
    private final d.b<T> mListener;

    class a implements d.b<T> {
        a() {
        }

        public void a(List<T> list, List<T> list2) {
            q.this.onCurrentListChanged(list, list2);
        }
    }

    protected q(h.f<T> fVar) {
        a aVar = new a();
        this.mListener = aVar;
        d<T> dVar = new d<>(new b(this), new c.a(fVar).a());
        this.mDiffer = dVar;
        dVar.a(aVar);
    }

    public List<T> getCurrentList() {
        return this.mDiffer.b();
    }

    /* access modifiers changed from: protected */
    public T getItem(int i10) {
        return this.mDiffer.b().get(i10);
    }

    public int getItemCount() {
        return this.mDiffer.b().size();
    }

    public void onCurrentListChanged(List<T> list, List<T> list2) {
    }

    public void submitList(List<T> list) {
        this.mDiffer.e(list);
    }

    public void submitList(List<T> list, Runnable runnable) {
        this.mDiffer.f(list, runnable);
    }

    protected q(c<T> cVar) {
        a aVar = new a();
        this.mListener = aVar;
        d<T> dVar = new d<>(new b(this), cVar);
        this.mDiffer = dVar;
        dVar.a(aVar);
    }
}
