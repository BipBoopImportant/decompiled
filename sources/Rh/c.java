package Rh;

import Ph.b;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ingka.ikea.app.uicomponents.view.LoadingMaterialButton;
import com.ingka.ikea.app.uicomponents.view.progress.HorizontalProgressView;

public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f63225a;

    /* renamed from: b  reason: collision with root package name */
    public final LoadingMaterialButton f63226b;

    /* renamed from: c  reason: collision with root package name */
    public final RecyclerView f63227c;

    /* renamed from: d  reason: collision with root package name */
    public final HorizontalProgressView f63228d;

    /* renamed from: e  reason: collision with root package name */
    public final CoordinatorLayout f63229e;

    private c(ConstraintLayout constraintLayout, LoadingMaterialButton loadingMaterialButton, RecyclerView recyclerView, HorizontalProgressView horizontalProgressView, CoordinatorLayout coordinatorLayout) {
        this.f63225a = constraintLayout;
        this.f63226b = loadingMaterialButton;
        this.f63227c = recyclerView;
        this.f63228d = horizontalProgressView;
        this.f63229e = coordinatorLayout;
    }

    public static c a(View view) {
        int i10 = b.f62807a;
        LoadingMaterialButton loadingMaterialButton = (LoadingMaterialButton) X4.b.a(view, i10);
        if (loadingMaterialButton != null) {
            i10 = b.f62810d;
            RecyclerView recyclerView = (RecyclerView) X4.b.a(view, i10);
            if (recyclerView != null) {
                i10 = b.f62825s;
                HorizontalProgressView horizontalProgressView = (HorizontalProgressView) X4.b.a(view, i10);
                if (horizontalProgressView != null) {
                    i10 = b.f62829w;
                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) X4.b.a(view, i10);
                    if (coordinatorLayout != null) {
                        return new c((ConstraintLayout) view, loadingMaterialButton, recyclerView, horizontalProgressView, coordinatorLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static c c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(Ph.c.f62834b, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f63225a;
    }
}
