package TF;

import SF.C16401b;
import X4.a;
import X4.b;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;

/* renamed from: TF.s  reason: case insensitive filesystem */
public final class C16476s implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f138468a;

    /* renamed from: b  reason: collision with root package name */
    public final LinearLayout f138469b;

    /* renamed from: c  reason: collision with root package name */
    public final ShapeableImageView f138470c;

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f138471d;

    private C16476s(ConstraintLayout constraintLayout, LinearLayout linearLayout, ShapeableImageView shapeableImageView, LinearLayout linearLayout2) {
        this.f138468a = constraintLayout;
        this.f138469b = linearLayout;
        this.f138470c = shapeableImageView;
        this.f138471d = linearLayout2;
    }

    public static C16476s a(View view) {
        int i10 = C16401b.f138117b;
        LinearLayout linearLayout = (LinearLayout) b.a(view, i10);
        if (linearLayout != null) {
            i10 = C16401b.f138103U0;
            ShapeableImageView shapeableImageView = (ShapeableImageView) b.a(view, i10);
            if (shapeableImageView != null) {
                i10 = C16401b.f138105V0;
                LinearLayout linearLayout2 = (LinearLayout) b.a(view, i10);
                if (linearLayout2 != null) {
                    return new C16476s((ConstraintLayout) view, linearLayout, shapeableImageView, linearLayout2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f138468a;
    }
}
