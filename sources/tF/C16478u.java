package TF;

import SF.C16401b;
import X4.a;
import X4.b;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.sugarcube.decorate.v1.internal.RotateControlView;

/* renamed from: TF.u  reason: case insensitive filesystem */
public final class C16478u implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f138475a;

    /* renamed from: b  reason: collision with root package name */
    public final RotateControlView f138476b;

    /* renamed from: c  reason: collision with root package name */
    public final ShapeableImageView f138477c;

    private C16478u(ConstraintLayout constraintLayout, RotateControlView rotateControlView, ShapeableImageView shapeableImageView) {
        this.f138475a = constraintLayout;
        this.f138476b = rotateControlView;
        this.f138477c = shapeableImageView;
    }

    public static C16478u a(View view) {
        int i10 = C16401b.f138107W0;
        RotateControlView rotateControlView = (RotateControlView) b.a(view, i10);
        if (rotateControlView != null) {
            i10 = C16401b.f138109X0;
            ShapeableImageView shapeableImageView = (ShapeableImageView) b.a(view, i10);
            if (shapeableImageView != null) {
                return new C16478u((ConstraintLayout) view, rotateControlView, shapeableImageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f138475a;
    }
}
