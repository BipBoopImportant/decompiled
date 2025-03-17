package TF;

import SF.C16401b;
import X4.a;
import X4.b;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;

/* renamed from: TF.t  reason: case insensitive filesystem */
public final class C16477t implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f138472a;

    /* renamed from: b  reason: collision with root package name */
    public final ShapeableImageView f138473b;

    /* renamed from: c  reason: collision with root package name */
    public final RecyclerView f138474c;

    private C16477t(ConstraintLayout constraintLayout, ShapeableImageView shapeableImageView, RecyclerView recyclerView) {
        this.f138472a = constraintLayout;
        this.f138473b = shapeableImageView;
        this.f138474c = recyclerView;
    }

    public static C16477t a(View view) {
        int i10 = C16401b.f138099S0;
        ShapeableImageView shapeableImageView = (ShapeableImageView) b.a(view, i10);
        if (shapeableImageView != null) {
            i10 = C16401b.f138101T0;
            RecyclerView recyclerView = (RecyclerView) b.a(view, i10);
            if (recyclerView != null) {
                return new C16477t((ConstraintLayout) view, shapeableImageView, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f138472a;
    }
}
