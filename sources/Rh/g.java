package Rh;

import Ph.c;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public final class g implements a {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f63236a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f63237b;

    private g(TextView textView, TextView textView2) {
        this.f63236a = textView;
        this.f63237b = textView2;
    }

    public static g a(View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new g(textView, textView);
        }
        throw new NullPointerException("rootView");
    }

    public static g c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(c.f62839g, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public TextView getRoot() {
        return this.f63236a;
    }
}
