package Fz;

import Ez.c;
import Ez.d;
import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

public final class m implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f110150a;

    /* renamed from: b  reason: collision with root package name */
    public final Button f110151b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f110152c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f110153d;

    /* renamed from: e  reason: collision with root package name */
    public final Button f110154e;

    private m(ConstraintLayout constraintLayout, Button button, TextView textView, TextView textView2, Button button2) {
        this.f110150a = constraintLayout;
        this.f110151b = button;
        this.f110152c = textView;
        this.f110153d = textView2;
        this.f110154e = button2;
    }

    public static m a(View view) {
        int i10 = c.f109533Q;
        Button button = (Button) b.a(view, i10);
        if (button != null) {
            i10 = c.f109566e0;
            TextView textView = (TextView) b.a(view, i10);
            if (textView != null) {
                i10 = c.f109569f0;
                TextView textView2 = (TextView) b.a(view, i10);
                if (textView2 != null) {
                    i10 = c.f109522K0;
                    Button button2 = (Button) b.a(view, i10);
                    if (button2 != null) {
                        return new m((ConstraintLayout) view, button, textView, textView2, button2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static m c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(d.f109645m, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f110150a;
    }
}
