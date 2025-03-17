package Rh;

import Ph.b;
import Ph.c;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public final class i implements a {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f63242a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f63243b;

    private i(LinearLayout linearLayout, TextView textView) {
        this.f63242a = linearLayout;
        this.f63243b = textView;
    }

    public static i a(View view) {
        int i10 = b.f62806B;
        TextView textView = (TextView) X4.b.a(view, i10);
        if (textView != null) {
            return new i((LinearLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static i c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(c.f62841i, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f63242a;
    }
}
