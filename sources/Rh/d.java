package Rh;

import Ph.c;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public final class d implements a {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f63230a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f63231b;

    private d(TextView textView, TextView textView2) {
        this.f63230a = textView;
        this.f63231b = textView2;
    }

    public static d a(View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new d(textView, textView);
        }
        throw new NullPointerException("rootView");
    }

    public static d c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(c.f62835c, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public TextView getRoot() {
        return this.f63230a;
    }
}
