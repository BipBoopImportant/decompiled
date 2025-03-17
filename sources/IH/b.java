package Ih;

import Hh.c;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f61121a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f61122b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f61123c;

    private b(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.f61121a = linearLayout;
        this.f61122b = textView;
        this.f61123c = textView2;
    }

    public static b a(View view) {
        int i10 = Hh.b.f60987g;
        TextView textView = (TextView) X4.b.a(view, i10);
        if (textView != null) {
            i10 = Hh.b.f60991k;
            TextView textView2 = (TextView) X4.b.a(view, i10);
            if (textView2 != null) {
                return new b((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static b c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(c.f60993b, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f61121a;
    }
}
