package Ey;

import By.C12671j;
import By.C12672k;
import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f109486a;

    /* renamed from: b  reason: collision with root package name */
    public final ComposeView f109487b;

    /* renamed from: c  reason: collision with root package name */
    public final ComposeView f109488c;

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerView f109489d;

    /* renamed from: e  reason: collision with root package name */
    public final ComposeView f109490e;

    /* renamed from: f  reason: collision with root package name */
    public final SwipeRefreshLayout f109491f;

    /* renamed from: g  reason: collision with root package name */
    public final Group f109492g;

    private c(ConstraintLayout constraintLayout, ComposeView composeView, ComposeView composeView2, RecyclerView recyclerView, ComposeView composeView3, SwipeRefreshLayout swipeRefreshLayout, Group group) {
        this.f109486a = constraintLayout;
        this.f109487b = composeView;
        this.f109488c = composeView2;
        this.f109489d = recyclerView;
        this.f109490e = composeView3;
        this.f109491f = swipeRefreshLayout;
        this.f109492g = group;
    }

    public static c a(View view) {
        int i10 = C12671j.f108227a;
        ComposeView composeView = (ComposeView) b.a(view, i10);
        if (composeView != null) {
            i10 = C12671j.f108228b;
            ComposeView composeView2 = (ComposeView) b.a(view, i10);
            if (composeView2 != null) {
                i10 = C12671j.f108229c;
                RecyclerView recyclerView = (RecyclerView) b.a(view, i10);
                if (recyclerView != null) {
                    i10 = C12671j.f108234h;
                    ComposeView composeView3 = (ComposeView) b.a(view, i10);
                    if (composeView3 != null) {
                        i10 = C12671j.f108235i;
                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) b.a(view, i10);
                        if (swipeRefreshLayout != null) {
                            i10 = C12671j.f108236j;
                            Group group = (Group) b.a(view, i10);
                            if (group != null) {
                                return new c((ConstraintLayout) view, composeView, composeView2, recyclerView, composeView3, swipeRefreshLayout, group);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static c c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static c d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C12672k.f108239c, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f109486a;
    }
}
