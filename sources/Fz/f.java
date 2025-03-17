package Fz;

import Ez.c;
import Ez.d;
import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public final class f implements a {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f110118a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f110119b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f110120c;

    private f(LinearLayout linearLayout, ImageView imageView, TextView textView) {
        this.f110118a = linearLayout;
        this.f110119b = imageView;
        this.f110120c = textView;
    }

    public static f a(View view) {
        int i10 = c.f109588l1;
        ImageView imageView = (ImageView) b.a(view, i10);
        if (imageView != null) {
            i10 = c.f109591m1;
            TextView textView = (TextView) b.a(view, i10);
            if (textView != null) {
                return new f((LinearLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static f c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(d.f109638f, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f110118a;
    }
}
