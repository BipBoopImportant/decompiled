package Fz;

import Ez.c;
import Ez.d;
import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

public final class y implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f110224a;

    /* renamed from: b  reason: collision with root package name */
    public final ConstraintLayout f110225b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f110226c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f110227d;

    /* renamed from: e  reason: collision with root package name */
    public final ConstraintLayout f110228e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f110229f;

    /* renamed from: g  reason: collision with root package name */
    public final TextView f110230g;

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f110231h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f110232i;

    private y(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TextView textView, TextView textView2, ConstraintLayout constraintLayout3, TextView textView3, TextView textView4, ImageView imageView, TextView textView5) {
        this.f110224a = constraintLayout;
        this.f110225b = constraintLayout2;
        this.f110226c = textView;
        this.f110227d = textView2;
        this.f110228e = constraintLayout3;
        this.f110229f = textView3;
        this.f110230g = textView4;
        this.f110231h = imageView;
        this.f110232i = textView5;
    }

    public static y a(View view) {
        int i10 = c.f109565e;
        ConstraintLayout constraintLayout = (ConstraintLayout) b.a(view, i10);
        if (constraintLayout != null) {
            i10 = c.f109568f;
            TextView textView = (TextView) b.a(view, i10);
            if (textView != null) {
                i10 = c.f109571g;
                TextView textView2 = (TextView) b.a(view, i10);
                if (textView2 != null) {
                    i10 = c.f109627z;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) b.a(view, i10);
                    if (constraintLayout2 != null) {
                        i10 = c.f109501A;
                        TextView textView3 = (TextView) b.a(view, i10);
                        if (textView3 != null) {
                            i10 = c.f109503B;
                            TextView textView4 = (TextView) b.a(view, i10);
                            if (textView4 != null) {
                                i10 = c.f109512F0;
                                ImageView imageView = (ImageView) b.a(view, i10);
                                if (imageView != null) {
                                    i10 = c.f109514G0;
                                    TextView textView5 = (TextView) b.a(view, i10);
                                    if (textView5 != null) {
                                        return new y((ConstraintLayout) view, constraintLayout, textView, textView2, constraintLayout2, textView3, textView4, imageView, textView5);
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

    public static y c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(d.f109658z, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f110224a;
    }
}
