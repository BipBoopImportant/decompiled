package QE;

import OE.C13317i;
import X4.a;
import X4.b;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;

/* renamed from: QE.q  reason: case insensitive filesystem */
public final class C13440q implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f114687a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f114688b;

    /* renamed from: c  reason: collision with root package name */
    public final ShapeableImageView f114689c;

    /* renamed from: d  reason: collision with root package name */
    public final MaterialButton f114690d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f114691e;

    private C13440q(ConstraintLayout constraintLayout, TextView textView, ShapeableImageView shapeableImageView, MaterialButton materialButton, TextView textView2) {
        this.f114687a = constraintLayout;
        this.f114688b = textView;
        this.f114689c = shapeableImageView;
        this.f114690d = materialButton;
        this.f114691e = textView2;
    }

    public static C13440q a(View view) {
        int i10 = C13317i.f113060p;
        TextView textView = (TextView) b.a(view, i10);
        if (textView != null) {
            i10 = C13317i.f112942P0;
            ShapeableImageView shapeableImageView = (ShapeableImageView) b.a(view, i10);
            if (shapeableImageView != null) {
                i10 = C13317i.f113079t1;
                MaterialButton materialButton = (MaterialButton) b.a(view, i10);
                if (materialButton != null) {
                    i10 = C13317i.f113039k3;
                    TextView textView2 = (TextView) b.a(view, i10);
                    if (textView2 != null) {
                        return new C13440q((ConstraintLayout) view, textView, shapeableImageView, materialButton, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f114687a;
    }
}
