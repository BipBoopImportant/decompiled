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

public final class z implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f110233a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f110234b;

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f110235c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f110236d;

    private z(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, TextView textView2) {
        this.f110233a = constraintLayout;
        this.f110234b = textView;
        this.f110235c = imageView;
        this.f110236d = textView2;
    }

    public static z a(View view) {
        int i10 = c.f109552Z0;
        TextView textView = (TextView) b.a(view, i10);
        if (textView != null) {
            i10 = c.f109555a1;
            ImageView imageView = (ImageView) b.a(view, i10);
            if (imageView != null) {
                i10 = c.f109558b1;
                TextView textView2 = (TextView) b.a(view, i10);
                if (textView2 != null) {
                    return new z((ConstraintLayout) view, textView, imageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static z c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(d.f109629A, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f110233a;
    }
}
