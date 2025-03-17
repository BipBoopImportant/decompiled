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

public final class q implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f110179a;

    /* renamed from: b  reason: collision with root package name */
    public final Button f110180b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f110181c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f110182d;

    /* renamed from: e  reason: collision with root package name */
    public final Button f110183e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f110184f;

    private q(ConstraintLayout constraintLayout, Button button, TextView textView, TextView textView2, Button button2, TextView textView3) {
        this.f110179a = constraintLayout;
        this.f110180b = button;
        this.f110181c = textView;
        this.f110182d = textView2;
        this.f110183e = button2;
        this.f110184f = textView3;
    }

    public static q a(View view) {
        int i10 = c.f109601q;
        Button button = (Button) b.a(view, i10);
        if (button != null) {
            i10 = c.f109507D;
            TextView textView = (TextView) b.a(view, i10);
            if (textView != null) {
                i10 = c.f109578i0;
                TextView textView2 = (TextView) b.a(view, i10);
                if (textView2 != null) {
                    i10 = c.f109587l0;
                    Button button2 = (Button) b.a(view, i10);
                    if (button2 != null) {
                        i10 = c.f109593n0;
                        TextView textView3 = (TextView) b.a(view, i10);
                        if (textView3 != null) {
                            return new q((ConstraintLayout) view, button, textView, textView2, button2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static q c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(d.f109649q, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f110179a;
    }
}
