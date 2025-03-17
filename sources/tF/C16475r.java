package TF;

import SF.C16401b;
import X4.a;
import X4.b;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;

/* renamed from: TF.r  reason: case insensitive filesystem */
public final class C16475r implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f138464a;

    /* renamed from: b  reason: collision with root package name */
    public final ShapeableImageView f138465b;

    /* renamed from: c  reason: collision with root package name */
    public final MaterialButton f138466c;

    /* renamed from: d  reason: collision with root package name */
    public final MaterialButton f138467d;

    private C16475r(ConstraintLayout constraintLayout, ShapeableImageView shapeableImageView, MaterialButton materialButton, MaterialButton materialButton2) {
        this.f138464a = constraintLayout;
        this.f138465b = shapeableImageView;
        this.f138466c = materialButton;
        this.f138467d = materialButton2;
    }

    public static C16475r a(View view) {
        int i10 = C16401b.f138093P0;
        ShapeableImageView shapeableImageView = (ShapeableImageView) b.a(view, i10);
        if (shapeableImageView != null) {
            i10 = C16401b.f138095Q0;
            MaterialButton materialButton = (MaterialButton) b.a(view, i10);
            if (materialButton != null) {
                i10 = C16401b.f138097R0;
                MaterialButton materialButton2 = (MaterialButton) b.a(view, i10);
                if (materialButton2 != null) {
                    return new C16475r((ConstraintLayout) view, shapeableImageView, materialButton, materialButton2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f138464a;
    }
}
