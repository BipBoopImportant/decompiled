package Rh;

import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f63208a;

    /* renamed from: b  reason: collision with root package name */
    public final LinearLayout f63209b;

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f63210c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f63211d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f63212e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f63213f;

    /* renamed from: g  reason: collision with root package name */
    public final TextView f63214g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f63215h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f63216i;

    /* renamed from: j  reason: collision with root package name */
    public final TextView f63217j;

    /* renamed from: k  reason: collision with root package name */
    public final TextView f63218k;

    /* renamed from: l  reason: collision with root package name */
    public final TextView f63219l;

    /* renamed from: m  reason: collision with root package name */
    public final TextView f63220m;

    /* renamed from: n  reason: collision with root package name */
    public final TextView f63221n;

    /* renamed from: o  reason: collision with root package name */
    public final TextView f63222o;

    /* renamed from: p  reason: collision with root package name */
    public final TextView f63223p;

    /* renamed from: q  reason: collision with root package name */
    public final LinearLayout f63224q;

    private b(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, LinearLayout linearLayout4) {
        this.f63208a = linearLayout;
        this.f63209b = linearLayout2;
        this.f63210c = linearLayout3;
        this.f63211d = textView;
        this.f63212e = textView2;
        this.f63213f = textView3;
        this.f63214g = textView4;
        this.f63215h = textView5;
        this.f63216i = textView6;
        this.f63217j = textView7;
        this.f63218k = textView8;
        this.f63219l = textView9;
        this.f63220m = textView10;
        this.f63221n = textView11;
        this.f63222o = textView12;
        this.f63223p = textView13;
        this.f63224q = linearLayout4;
    }

    public static b a(View view) {
        View view2 = view;
        int i10 = Ph.b.f62811e;
        LinearLayout linearLayout = (LinearLayout) X4.b.a(view2, i10);
        if (linearLayout != null) {
            i10 = Ph.b.f62812f;
            LinearLayout linearLayout2 = (LinearLayout) X4.b.a(view2, i10);
            if (linearLayout2 != null) {
                i10 = Ph.b.f62814h;
                TextView textView = (TextView) X4.b.a(view2, i10);
                if (textView != null) {
                    i10 = Ph.b.f62815i;
                    TextView textView2 = (TextView) X4.b.a(view2, i10);
                    if (textView2 != null) {
                        i10 = Ph.b.f62816j;
                        TextView textView3 = (TextView) X4.b.a(view2, i10);
                        if (textView3 != null) {
                            i10 = Ph.b.f62817k;
                            TextView textView4 = (TextView) X4.b.a(view2, i10);
                            if (textView4 != null) {
                                i10 = Ph.b.f62818l;
                                TextView textView5 = (TextView) X4.b.a(view2, i10);
                                if (textView5 != null) {
                                    i10 = Ph.b.f62819m;
                                    TextView textView6 = (TextView) X4.b.a(view2, i10);
                                    if (textView6 != null) {
                                        i10 = Ph.b.f62820n;
                                        TextView textView7 = (TextView) X4.b.a(view2, i10);
                                        if (textView7 != null) {
                                            i10 = Ph.b.f62821o;
                                            TextView textView8 = (TextView) X4.b.a(view2, i10);
                                            if (textView8 != null) {
                                                i10 = Ph.b.f62822p;
                                                TextView textView9 = (TextView) X4.b.a(view2, i10);
                                                if (textView9 != null) {
                                                    i10 = Ph.b.f62823q;
                                                    TextView textView10 = (TextView) X4.b.a(view2, i10);
                                                    if (textView10 != null) {
                                                        i10 = Ph.b.f62826t;
                                                        TextView textView11 = (TextView) X4.b.a(view2, i10);
                                                        if (textView11 != null) {
                                                            i10 = Ph.b.f62831y;
                                                            TextView textView12 = (TextView) X4.b.a(view2, i10);
                                                            if (textView12 != null) {
                                                                i10 = Ph.b.f62832z;
                                                                TextView textView13 = (TextView) X4.b.a(view2, i10);
                                                                if (textView13 != null) {
                                                                    i10 = Ph.b.f62805A;
                                                                    LinearLayout linearLayout3 = (LinearLayout) X4.b.a(view2, i10);
                                                                    if (linearLayout3 != null) {
                                                                        return new b((LinearLayout) view2, linearLayout, linearLayout2, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, linearLayout3);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f63208a;
    }
}
