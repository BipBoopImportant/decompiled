package TF;

import SF.C16401b;
import X4.a;
import X4.b;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sugarcube.app.base.ui.utils.BouncingBallView;

/* renamed from: TF.y  reason: case insensitive filesystem */
public final class C16482y implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f138509a;

    /* renamed from: b  reason: collision with root package name */
    public final BouncingBallView f138510b;

    private C16482y(ConstraintLayout constraintLayout, BouncingBallView bouncingBallView) {
        this.f138509a = constraintLayout;
        this.f138510b = bouncingBallView;
    }

    public static C16482y a(View view) {
        int i10 = C16401b.f138106W;
        BouncingBallView bouncingBallView = (BouncingBallView) b.a(view, i10);
        if (bouncingBallView != null) {
            return new C16482y((ConstraintLayout) view, bouncingBallView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f138509a;
    }
}
