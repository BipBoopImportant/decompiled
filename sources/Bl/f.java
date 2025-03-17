package bl;

import X4.a;
import X4.b;
import al.C11067a;
import al.C11068b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;

public final class f implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f90478a;

    /* renamed from: b  reason: collision with root package name */
    public final MaterialButton f90479b;

    /* renamed from: c  reason: collision with root package name */
    public final MaterialButton f90480c;

    /* renamed from: d  reason: collision with root package name */
    public final FrameLayout f90481d;

    /* renamed from: e  reason: collision with root package name */
    public final WebView f90482e;

    private f(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, FrameLayout frameLayout, WebView webView) {
        this.f90478a = constraintLayout;
        this.f90479b = materialButton;
        this.f90480c = materialButton2;
        this.f90481d = frameLayout;
        this.f90482e = webView;
    }

    public static f a(View view) {
        int i10 = C11067a.f90287a;
        MaterialButton materialButton = (MaterialButton) b.a(view, i10);
        if (materialButton != null) {
            i10 = C11067a.f90305s;
            MaterialButton materialButton2 = (MaterialButton) b.a(view, i10);
            if (materialButton2 != null) {
                i10 = C11067a.f90285A;
                FrameLayout frameLayout = (FrameLayout) b.a(view, i10);
                if (frameLayout != null) {
                    i10 = C11067a.f90286B;
                    WebView webView = (WebView) b.a(view, i10);
                    if (webView != null) {
                        return new f((ConstraintLayout) view, materialButton, materialButton2, frameLayout, webView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static f c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C11068b.f90331s, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f90478a;
    }
}
