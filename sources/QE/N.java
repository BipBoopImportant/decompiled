package QE;

import OE.C13317i;
import OE.C13318j;
import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;

public final class N implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f114410a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f114411b;

    /* renamed from: c  reason: collision with root package name */
    public final ShapeableImageView f114412c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f114413d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f114414e;

    /* renamed from: f  reason: collision with root package name */
    public final MaterialButton f114415f;

    private N(ConstraintLayout constraintLayout, TextView textView, ShapeableImageView shapeableImageView, TextView textView2, TextView textView3, MaterialButton materialButton) {
        this.f114410a = constraintLayout;
        this.f114411b = textView;
        this.f114412c = shapeableImageView;
        this.f114413d = textView2;
        this.f114414e = textView3;
        this.f114415f = materialButton;
    }

    public static N a(View view) {
        int i10 = C13317i.f113025i;
        TextView textView = (TextView) b.a(view, i10);
        if (textView != null) {
            i10 = C13317i.f112942P0;
            ShapeableImageView shapeableImageView = (ShapeableImageView) b.a(view, i10);
            if (shapeableImageView != null) {
                i10 = C13317i.f113083u1;
                TextView textView2 = (TextView) b.a(view, i10);
                if (textView2 != null) {
                    i10 = C13317i.f113087v1;
                    TextView textView3 = (TextView) b.a(view, i10);
                    if (textView3 != null) {
                        i10 = C13317i.f113103z1;
                        MaterialButton materialButton = (MaterialButton) b.a(view, i10);
                        if (materialButton != null) {
                            return new N((ConstraintLayout) view, textView, shapeableImageView, textView2, textView3, materialButton);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static N c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static N d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C13318j.f113116L, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f114410a;
    }
}
