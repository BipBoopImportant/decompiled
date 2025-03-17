package Vd;

import Sd.c;
import Sd.d;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

public final class a implements X4.a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f64508a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f64509b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f64510c;

    /* renamed from: d  reason: collision with root package name */
    public final Button f64511d;

    private a(ConstraintLayout constraintLayout, TextView textView, TextView textView2, Button button) {
        this.f64508a = constraintLayout;
        this.f64509b = textView;
        this.f64510c = textView2;
        this.f64511d = button;
    }

    public static a a(View view) {
        int i10 = c.f63337b;
        TextView textView = (TextView) b.a(view, i10);
        if (textView != null) {
            i10 = c.f63338c;
            TextView textView2 = (TextView) b.a(view, i10);
            if (textView2 != null) {
                i10 = c.f63339d;
                Button button = (Button) b.a(view, i10);
                if (button != null) {
                    return new a((ConstraintLayout) view, textView, textView2, button);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static a c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(d.f63349a, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f64508a;
    }
}
