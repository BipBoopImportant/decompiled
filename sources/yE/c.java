package Ye;

import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f64981a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f64982b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f64983c;

    /* renamed from: d  reason: collision with root package name */
    public final Button f64984d;

    private c(ConstraintLayout constraintLayout, TextView textView, TextView textView2, Button button) {
        this.f64981a = constraintLayout;
        this.f64982b = textView;
        this.f64983c = textView2;
        this.f64984d = button;
    }

    public static c a(View view) {
        int i10 = We.a.f64687c;
        TextView textView = (TextView) b.a(view, i10);
        if (textView != null) {
            i10 = We.a.f64688d;
            TextView textView2 = (TextView) b.a(view, i10);
            if (textView2 != null) {
                i10 = We.a.f64698n;
                Button button = (Button) b.a(view, i10);
                if (button != null) {
                    return new c((ConstraintLayout) view, textView, textView2, button);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static c c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(We.b.f64713f, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f64981a;
    }
}
