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

public final class h implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f110126a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f110127b;

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f110128c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f110129d;

    private h(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, TextView textView2) {
        this.f110126a = constraintLayout;
        this.f110127b = textView;
        this.f110128c = imageView;
        this.f110129d = textView2;
    }

    public static h a(View view) {
        int i10 = c.f109563d0;
        TextView textView = (TextView) b.a(view, i10);
        if (textView != null) {
            i10 = c.f109605r0;
            ImageView imageView = (ImageView) b.a(view, i10);
            if (imageView != null) {
                i10 = c.f109603q1;
                TextView textView2 = (TextView) b.a(view, i10);
                if (textView2 != null) {
                    return new h((ConstraintLayout) view, textView, imageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static h c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(d.f109640h, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f110126a;
    }
}
