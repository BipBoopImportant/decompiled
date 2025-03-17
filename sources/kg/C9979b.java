package kg;

import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentContainerView;
import com.ingka.ikea.app.s;
import com.ingka.ikea.app.t;

/* renamed from: kg.b  reason: case insensitive filesystem */
public final class C9979b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final CoordinatorLayout f75075a;

    /* renamed from: b  reason: collision with root package name */
    public final ComposeView f75076b;

    /* renamed from: c  reason: collision with root package name */
    public final ComposeView f75077c;

    /* renamed from: d  reason: collision with root package name */
    public final FragmentContainerView f75078d;

    private C9979b(CoordinatorLayout coordinatorLayout, ComposeView composeView, ComposeView composeView2, FragmentContainerView fragmentContainerView) {
        this.f75075a = coordinatorLayout;
        this.f75076b = composeView;
        this.f75077c = composeView2;
        this.f75078d = fragmentContainerView;
    }

    public static C9979b a(View view) {
        int i10 = s.f72309e;
        ComposeView composeView = (ComposeView) b.a(view, i10);
        if (composeView != null) {
            i10 = s.f72311g;
            ComposeView composeView2 = (ComposeView) b.a(view, i10);
            if (composeView2 != null) {
                i10 = s.f72312h;
                FragmentContainerView fragmentContainerView = (FragmentContainerView) b.a(view, i10);
                if (fragmentContainerView != null) {
                    return new C9979b((CoordinatorLayout) view, composeView, composeView2, fragmentContainerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C9979b c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static C9979b d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(t.f72314b, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public CoordinatorLayout getRoot() {
        return this.f75075a;
    }
}
