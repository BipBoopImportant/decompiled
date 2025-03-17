package Ye;

import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;

public final class a implements X4.a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f64971a;

    /* renamed from: b  reason: collision with root package name */
    public final Barrier f64972b;

    /* renamed from: c  reason: collision with root package name */
    public final ConstraintLayout f64973c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f64974d;

    /* renamed from: e  reason: collision with root package name */
    public final MaterialButton f64975e;

    /* renamed from: f  reason: collision with root package name */
    public final MaterialButton f64976f;

    /* renamed from: g  reason: collision with root package name */
    public final TextView f64977g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f64978h;

    private a(ConstraintLayout constraintLayout, Barrier barrier, ConstraintLayout constraintLayout2, TextView textView, MaterialButton materialButton, MaterialButton materialButton2, TextView textView2, TextView textView3) {
        this.f64971a = constraintLayout;
        this.f64972b = barrier;
        this.f64973c = constraintLayout2;
        this.f64974d = textView;
        this.f64975e = materialButton;
        this.f64976f = materialButton2;
        this.f64977g = textView2;
        this.f64978h = textView3;
    }

    public static a a(View view) {
        int i10 = We.a.f64685a;
        Barrier barrier = (Barrier) b.a(view, i10);
        if (barrier != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i10 = We.a.f64694j;
            TextView textView = (TextView) b.a(view, i10);
            if (textView != null) {
                i10 = We.a.f64696l;
                MaterialButton materialButton = (MaterialButton) b.a(view, i10);
                if (materialButton != null) {
                    i10 = We.a.f64701q;
                    MaterialButton materialButton2 = (MaterialButton) b.a(view, i10);
                    if (materialButton2 != null) {
                        i10 = We.a.f64702r;
                        TextView textView2 = (TextView) b.a(view, i10);
                        if (textView2 != null) {
                            i10 = We.a.f64703s;
                            TextView textView3 = (TextView) b.a(view, i10);
                            if (textView3 != null) {
                                return new a(constraintLayout, barrier, constraintLayout, textView, materialButton, materialButton2, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static a c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(We.b.f64708a, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f64971a;
    }
}
