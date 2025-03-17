package co;

import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ingka.ikea.app.uicomponents.view.progress.FullScreenProgressView;
import com.ingka.ikea.app.uicomponents.view.progress.HorizontalProgressView;
import com.ingka.ikea.checkout.impl.l0;
import com.ingka.ikea.checkout.impl.m0;

/* renamed from: co.a  reason: case insensitive filesystem */
public final class C11150a implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f90770a;

    /* renamed from: b  reason: collision with root package name */
    public final LinearLayout f90771b;

    /* renamed from: c  reason: collision with root package name */
    public final RecyclerView f90772c;

    /* renamed from: d  reason: collision with root package name */
    public final FullScreenProgressView f90773d;

    /* renamed from: e  reason: collision with root package name */
    public final HorizontalProgressView f90774e;

    private C11150a(ConstraintLayout constraintLayout, LinearLayout linearLayout, RecyclerView recyclerView, FullScreenProgressView fullScreenProgressView, HorizontalProgressView horizontalProgressView) {
        this.f90770a = constraintLayout;
        this.f90771b = linearLayout;
        this.f90772c = recyclerView;
        this.f90773d = fullScreenProgressView;
        this.f90774e = horizontalProgressView;
    }

    public static C11150a a(View view) {
        int i10 = l0.f94609a;
        LinearLayout linearLayout = (LinearLayout) b.a(view, i10);
        if (linearLayout != null) {
            i10 = l0.f94610b;
            RecyclerView recyclerView = (RecyclerView) b.a(view, i10);
            if (recyclerView != null) {
                i10 = l0.f94617i;
                FullScreenProgressView fullScreenProgressView = (FullScreenProgressView) b.a(view, i10);
                if (fullScreenProgressView != null) {
                    i10 = l0.f94618j;
                    HorizontalProgressView horizontalProgressView = (HorizontalProgressView) b.a(view, i10);
                    if (horizontalProgressView != null) {
                        return new C11150a((ConstraintLayout) view, linearLayout, recyclerView, fullScreenProgressView, horizontalProgressView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C11150a c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static C11150a d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(m0.f94622a, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f90770a;
    }
}
