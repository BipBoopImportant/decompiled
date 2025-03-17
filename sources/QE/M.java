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
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;

public final class M implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f114405a;

    /* renamed from: b  reason: collision with root package name */
    public final FloatingActionButton f114406b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f114407c;

    /* renamed from: d  reason: collision with root package name */
    public final ShapeableImageView f114408d;

    /* renamed from: e  reason: collision with root package name */
    public final MaterialButton f114409e;

    private M(ConstraintLayout constraintLayout, FloatingActionButton floatingActionButton, TextView textView, ShapeableImageView shapeableImageView, MaterialButton materialButton) {
        this.f114405a = constraintLayout;
        this.f114406b = floatingActionButton;
        this.f114407c = textView;
        this.f114408d = shapeableImageView;
        this.f114409e = materialButton;
    }

    public static M a(View view) {
        int i10 = C13317i.f113025i;
        FloatingActionButton floatingActionButton = (FloatingActionButton) b.a(view, i10);
        if (floatingActionButton != null) {
            i10 = C13317i.f113050n;
            TextView textView = (TextView) b.a(view, i10);
            if (textView != null) {
                i10 = C13317i.f112942P0;
                ShapeableImageView shapeableImageView = (ShapeableImageView) b.a(view, i10);
                if (shapeableImageView != null) {
                    i10 = C13317i.f112999c3;
                    MaterialButton materialButton = (MaterialButton) b.a(view, i10);
                    if (materialButton != null) {
                        return new M((ConstraintLayout) view, floatingActionButton, textView, shapeableImageView, materialButton);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static M c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C13318j.f113115K, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f114405a;
    }
}
