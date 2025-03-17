package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

public abstract class y extends RecyclerView.t {

    /* renamed from: a  reason: collision with root package name */
    RecyclerView f44189a;

    /* renamed from: b  reason: collision with root package name */
    private Scroller f44190b;

    /* renamed from: c  reason: collision with root package name */
    private final RecyclerView.v f44191c = new a();

    class a extends RecyclerView.v {

        /* renamed from: a  reason: collision with root package name */
        boolean f44192a = false;

        a() {
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
            super.onScrollStateChanged(recyclerView, i10);
            if (i10 == 0 && this.f44192a) {
                this.f44192a = false;
                y.this.j();
            }
        }

        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            if (i10 != 0 || i11 != 0) {
                this.f44192a = true;
            }
        }
    }

    private void e() {
        this.f44189a.n1(this.f44191c);
        this.f44189a.setOnFlingListener((RecyclerView.t) null);
    }

    private void h() {
        if (this.f44189a.getOnFlingListener() == null) {
            this.f44189a.n(this.f44191c);
            this.f44189a.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    private boolean i(RecyclerView.q qVar, int i10, int i11) {
        RecyclerView.B d10;
        int g10;
        if (!(qVar instanceof RecyclerView.B.b) || (d10 = d(qVar)) == null || (g10 = g(qVar, i10, i11)) == -1) {
            return false;
        }
        d10.p(g10);
        qVar.j2(d10);
        return true;
    }

    public boolean a(int i10, int i11) {
        RecyclerView.q layoutManager = this.f44189a.getLayoutManager();
        if (layoutManager == null || this.f44189a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f44189a.getMinFlingVelocity();
        return (Math.abs(i11) > minFlingVelocity || Math.abs(i10) > minFlingVelocity) && i(layoutManager, i10, i11);
    }

    public void b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f44189a;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                e();
            }
            this.f44189a = recyclerView;
            if (recyclerView != null) {
                h();
                this.f44190b = new Scroller(this.f44189a.getContext(), new DecelerateInterpolator());
                j();
            }
        }
    }

    public abstract int[] c(RecyclerView.q qVar, View view);

    /* access modifiers changed from: protected */
    public abstract RecyclerView.B d(RecyclerView.q qVar);

    @SuppressLint({"UnknownNullness"})
    public abstract View f(RecyclerView.q qVar);

    @SuppressLint({"UnknownNullness"})
    public abstract int g(RecyclerView.q qVar, int i10, int i11);

    /* access modifiers changed from: package-private */
    public void j() {
        RecyclerView.q layoutManager;
        View f10;
        RecyclerView recyclerView = this.f44189a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (f10 = f(layoutManager)) != null) {
            int[] c10 = c(layoutManager, f10);
            int i10 = c10[0];
            if (i10 != 0 || c10[1] != 0) {
                this.f44189a.B1(i10, c10[1]);
            }
        }
    }
}
