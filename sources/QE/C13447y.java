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
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;

/* renamed from: QE.y  reason: case insensitive filesystem */
public final class C13447y implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f114748a;

    /* renamed from: b  reason: collision with root package name */
    public final C13427d f114749b;

    /* renamed from: c  reason: collision with root package name */
    public final ComposeView f114750c;

    /* renamed from: d  reason: collision with root package name */
    public final ViewPager2 f114751d;

    /* renamed from: e  reason: collision with root package name */
    public final TabLayout f114752e;

    /* renamed from: f  reason: collision with root package name */
    public final ComposeView f114753f;

    private C13447y(ConstraintLayout constraintLayout, C13427d dVar, ComposeView composeView, ViewPager2 viewPager2, TabLayout tabLayout, ComposeView composeView2) {
        this.f114748a = constraintLayout;
        this.f114749b = dVar;
        this.f114750c = composeView;
        this.f114751d = viewPager2;
        this.f114752e = tabLayout;
        this.f114753f = composeView2;
    }

    public static C13447y a(View view) {
        int i10 = C13317i.f113010f;
        View a10 = b.a(view, i10);
        if (a10 != null) {
            C13427d a11 = C13427d.a(a10);
            i10 = C13317i.f113046m0;
            ComposeView composeView = (ComposeView) b.a(view, i10);
            if (composeView != null) {
                i10 = C13317i.f113086v0;
                ViewPager2 viewPager2 = (ViewPager2) b.a(view, i10);
                if (viewPager2 != null) {
                    i10 = C13317i.f113090w0;
                    TabLayout tabLayout = (TabLayout) b.a(view, i10);
                    if (tabLayout != null) {
                        i10 = C13317i.f112967V1;
                        ComposeView composeView2 = (ComposeView) b.a(view, i10);
                        if (composeView2 != null) {
                            return new C13447y((ConstraintLayout) view, a11, composeView, viewPager2, tabLayout, composeView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C13447y c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C13318j.f113156w, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f114748a;
    }
}
