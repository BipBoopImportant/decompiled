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

public final class Y implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f114488a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f114489b;

    /* renamed from: c  reason: collision with root package name */
    public final ConstraintLayout f114490c;

    /* renamed from: d  reason: collision with root package name */
    public final MaterialButton f114491d;

    /* renamed from: e  reason: collision with root package name */
    public final MaterialButton f114492e;

    private Y(ConstraintLayout constraintLayout, TextView textView, ConstraintLayout constraintLayout2, MaterialButton materialButton, MaterialButton materialButton2) {
        this.f114488a = constraintLayout;
        this.f114489b = textView;
        this.f114490c = constraintLayout2;
        this.f114491d = materialButton;
        this.f114492e = materialButton2;
    }

    public static Y a(View view) {
        int i10 = C13317i.f113057o1;
        TextView textView = (TextView) b.a(view, i10);
        if (textView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i10 = C13317i.f113067q1;
            MaterialButton materialButton = (MaterialButton) b.a(view, i10);
            if (materialButton != null) {
                i10 = C13317i.f113071r1;
                MaterialButton materialButton2 = (MaterialButton) b.a(view, i10);
                if (materialButton2 != null) {
                    return new Y(constraintLayout, textView, constraintLayout, materialButton, materialButton2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static Y c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C13318j.f113126V, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f114488a;
    }
}
