package Qe;

import Ge.k;
import Ge.l;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f63072a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f63073b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f63074c;

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f63075d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f63076e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f63077f;

    private b(LinearLayout linearLayout, TextView textView, TextView textView2, LinearLayout linearLayout2, TextView textView3, TextView textView4) {
        this.f63072a = linearLayout;
        this.f63073b = textView;
        this.f63074c = textView2;
        this.f63075d = linearLayout2;
        this.f63076e = textView3;
        this.f63077f = textView4;
    }

    public static b a(View view) {
        int i10 = k.f60617a;
        TextView textView = (TextView) X4.b.a(view, i10);
        if (textView != null) {
            i10 = k.f60618b;
            TextView textView2 = (TextView) X4.b.a(view, i10);
            if (textView2 != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                i10 = k.f60623g;
                TextView textView3 = (TextView) X4.b.a(view, i10);
                if (textView3 != null) {
                    i10 = k.f60626j;
                    TextView textView4 = (TextView) X4.b.a(view, i10);
                    if (textView4 != null) {
                        return new b(linearLayout, textView, textView2, linearLayout, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static b c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(l.f60633b, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f63072a;
    }
}
