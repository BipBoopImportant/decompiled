package QE;

import OE.C13317i;
import X4.a;
import X4.b;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;

public final class j0 implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f114617a;

    /* renamed from: b  reason: collision with root package name */
    public final MaterialButton f114618b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f114619c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f114620d;

    private j0(ConstraintLayout constraintLayout, MaterialButton materialButton, TextView textView, TextView textView2) {
        this.f114617a = constraintLayout;
        this.f114618b = materialButton;
        this.f114619c = textView;
        this.f114620d = textView2;
    }

    public static j0 a(View view) {
        int i10 = C13317i.f112908G2;
        MaterialButton materialButton = (MaterialButton) b.a(view, i10);
        if (materialButton != null) {
            i10 = C13317i.f112912H2;
            TextView textView = (TextView) b.a(view, i10);
            if (textView != null) {
                i10 = C13317i.f112916I2;
                TextView textView2 = (TextView) b.a(view, i10);
                if (textView2 != null) {
                    return new j0((ConstraintLayout) view, materialButton, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f114617a;
    }
}
