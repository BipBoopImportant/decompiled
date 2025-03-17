package QE;

import OE.C13317i;
import X4.a;
import X4.b;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;

public final class m0 implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f114655a;

    /* renamed from: b  reason: collision with root package name */
    public final MaterialButton f114656b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f114657c;

    private m0(ConstraintLayout constraintLayout, MaterialButton materialButton, TextView textView) {
        this.f114655a = constraintLayout;
        this.f114656b = materialButton;
        this.f114657c = textView;
    }

    public static m0 a(View view) {
        int i10 = C13317i.f112952R2;
        MaterialButton materialButton = (MaterialButton) b.a(view, i10);
        if (materialButton != null) {
            i10 = C13317i.f112956S2;
            TextView textView = (TextView) b.a(view, i10);
            if (textView != null) {
                return new m0((ConstraintLayout) view, materialButton, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f114655a;
    }
}
