package Rh;

import Ph.b;
import Ph.c;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ingka.ikea.app.uicomponents.view.progress.HorizontalProgressView;

public final class h implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f63238a;

    /* renamed from: b  reason: collision with root package name */
    public final HorizontalProgressView f63239b;

    /* renamed from: c  reason: collision with root package name */
    public final ConstraintLayout f63240c;

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerView f63241d;

    private h(ConstraintLayout constraintLayout, HorizontalProgressView horizontalProgressView, ConstraintLayout constraintLayout2, RecyclerView recyclerView) {
        this.f63238a = constraintLayout;
        this.f63239b = horizontalProgressView;
        this.f63240c = constraintLayout2;
        this.f63241d = recyclerView;
    }

    public static h a(View view) {
        int i10 = b.f62824r;
        HorizontalProgressView horizontalProgressView = (HorizontalProgressView) X4.b.a(view, i10);
        if (horizontalProgressView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            int i11 = b.f62827u;
            RecyclerView recyclerView = (RecyclerView) X4.b.a(view, i11);
            if (recyclerView != null) {
                return new h(constraintLayout, horizontalProgressView, constraintLayout, recyclerView);
            }
            i10 = i11;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static h c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(c.f62840h, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f63238a;
    }
}
