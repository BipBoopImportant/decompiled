package QE;

import OE.C13317i;
import OE.C13318j;
import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: QE.z  reason: case insensitive filesystem */
public final class C13448z implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f114754a;

    /* renamed from: b  reason: collision with root package name */
    public final ConstraintLayout f114755b;

    /* renamed from: c  reason: collision with root package name */
    public final SwipeRefreshLayout f114756c;

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerView f114757d;

    /* renamed from: e  reason: collision with root package name */
    public final ComposeView f114758e;

    private C13448z(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, SwipeRefreshLayout swipeRefreshLayout, RecyclerView recyclerView, ComposeView composeView) {
        this.f114754a = constraintLayout;
        this.f114755b = constraintLayout2;
        this.f114756c = swipeRefreshLayout;
        this.f114757d = recyclerView;
        this.f114758e = composeView;
    }

    public static C13448z a(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i10 = C13317i.f113036k0;
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) b.a(view, i10);
        if (swipeRefreshLayout != null) {
            i10 = C13317i.f112914I0;
            RecyclerView recyclerView = (RecyclerView) b.a(view, i10);
            if (recyclerView != null) {
                i10 = C13317i.f113049m3;
                ComposeView composeView = (ComposeView) b.a(view, i10);
                if (composeView != null) {
                    return new C13448z(constraintLayout, constraintLayout, swipeRefreshLayout, recyclerView, composeView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C13448z c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C13318j.f113157x, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f114754a;
    }
}
