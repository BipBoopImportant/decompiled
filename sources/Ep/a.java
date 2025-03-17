package Ep;

import Dp.j;
import Dp.k;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public final class a implements X4.a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f80743a;

    /* renamed from: b  reason: collision with root package name */
    public final RecyclerView f80744b;

    /* renamed from: c  reason: collision with root package name */
    public final FrameLayout f80745c;

    private a(ConstraintLayout constraintLayout, RecyclerView recyclerView, FrameLayout frameLayout) {
        this.f80743a = constraintLayout;
        this.f80744b = recyclerView;
        this.f80745c = frameLayout;
    }

    public static a a(View view) {
        int i10 = j.f80133e;
        RecyclerView recyclerView = (RecyclerView) b.a(view, i10);
        if (recyclerView != null) {
            i10 = j.f80136h;
            FrameLayout frameLayout = (FrameLayout) b.a(view, i10);
            if (frameLayout != null) {
                return new a((ConstraintLayout) view, recyclerView, frameLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static a c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(k.f80137a, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f80743a;
    }
}
