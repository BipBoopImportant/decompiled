package TF;

import SF.C16401b;
import X4.a;
import X4.b;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: TF.d  reason: case insensitive filesystem */
public final class C16461d implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f138399a;

    /* renamed from: b  reason: collision with root package name */
    public final ComposeView f138400b;

    private C16461d(ConstraintLayout constraintLayout, ComposeView composeView) {
        this.f138399a = constraintLayout;
        this.f138400b = composeView;
    }

    public static C16461d a(View view) {
        int i10 = C16401b.f138080J;
        ComposeView composeView = (ComposeView) b.a(view, i10);
        if (composeView != null) {
            return new C16461d((ConstraintLayout) view, composeView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f138399a;
    }
}
