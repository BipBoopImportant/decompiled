package Ye;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f64979a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f64980b;

    private b(TextView textView, TextView textView2) {
        this.f64979a = textView;
        this.f64980b = textView2;
    }

    public static b a(View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new b(textView, textView);
        }
        throw new NullPointerException("rootView");
    }

    public static b c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(We.b.f64712e, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public TextView getRoot() {
        return this.f64979a;
    }
}
