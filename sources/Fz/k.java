package Fz;

import Ez.c;
import Ez.d;
import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

public final class k implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f110140a;

    /* renamed from: b  reason: collision with root package name */
    public final Button f110141b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f110142c;

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f110143d;

    /* renamed from: e  reason: collision with root package name */
    public final Button f110144e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f110145f;

    private k(ConstraintLayout constraintLayout, Button button, TextView textView, ImageView imageView, Button button2, TextView textView2) {
        this.f110140a = constraintLayout;
        this.f110141b = button;
        this.f110142c = textView;
        this.f110143d = imageView;
        this.f110144e = button2;
        this.f110145f = textView2;
    }

    public static k a(View view) {
        int i10 = c.f109604r;
        Button button = (Button) b.a(view, i10);
        if (button != null) {
            i10 = c.f109507D;
            TextView textView = (TextView) b.a(view, i10);
            if (textView != null) {
                i10 = c.f109626y0;
                ImageView imageView = (ImageView) b.a(view, i10);
                if (imageView != null) {
                    i10 = c.f109524L0;
                    Button button2 = (Button) b.a(view, i10);
                    if (button2 != null) {
                        i10 = c.f109603q1;
                        TextView textView2 = (TextView) b.a(view, i10);
                        if (textView2 != null) {
                            return new k((ConstraintLayout) view, button, textView, imageView, button2, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static k c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(d.f109643k, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f110140a;
    }
}
