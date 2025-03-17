package a9;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: a9.n  reason: case insensitive filesystem */
public final /* synthetic */ class C6885n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f42720a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C6893o f42721b;

    public /* synthetic */ C6885n(RecyclerView recyclerView, C6893o oVar) {
        this.f42720a = recyclerView;
        this.f42721b = oVar;
    }

    public final void run() {
        C6893o.d(this.f42720a, this.f42721b);
    }
}
