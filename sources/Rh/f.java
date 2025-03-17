package Rh;

import Ph.c;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public final class f implements a {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f63234a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f63235b;

    private f(TextView textView, TextView textView2) {
        this.f63234a = textView;
        this.f63235b = textView2;
    }

    public static f a(View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new f(textView, textView);
        }
        throw new NullPointerException("rootView");
    }

    public static f c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(c.f62838f, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public TextView getRoot() {
        return this.f63234a;
    }
}
