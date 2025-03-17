package TF;

import SF.C16401b;
import SF.C16402c;
import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.sugarcube.app.base.ui.utils.BouncingBallView;

/* renamed from: TF.f  reason: case insensitive filesystem */
public final class C16463f implements a {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f138410a;

    /* renamed from: b  reason: collision with root package name */
    public final BouncingBallView f138411b;

    private C16463f(LinearLayout linearLayout, BouncingBallView bouncingBallView) {
        this.f138410a = linearLayout;
        this.f138411b = bouncingBallView;
    }

    public static C16463f a(View view) {
        int i10 = C16401b.f138127e0;
        BouncingBallView bouncingBallView = (BouncingBallView) b.a(view, i10);
        if (bouncingBallView != null) {
            return new C16463f((LinearLayout) view, bouncingBallView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C16463f c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C16402c.f138194c, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f138410a;
    }
}
