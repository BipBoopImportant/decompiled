package Rh;

import Ph.c;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public final class e implements a {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f63232a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f63233b;

    private e(TextView textView, TextView textView2) {
        this.f63232a = textView;
        this.f63233b = textView2;
    }

    public static e a(View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new e(textView, textView);
        }
        throw new NullPointerException("rootView");
    }

    public static e c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(c.f62837e, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public TextView getRoot() {
        return this.f63232a;
    }
}
