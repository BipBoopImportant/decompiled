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
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: Fz.c  reason: case insensitive filesystem */
public final class C12913c implements a {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f110074a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f110075b;

    /* renamed from: c  reason: collision with root package name */
    public final Button f110076c;

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f110077d;

    private C12913c(LinearLayout linearLayout, TextView textView, Button button, ImageView imageView) {
        this.f110074a = linearLayout;
        this.f110075b = textView;
        this.f110076c = button;
        this.f110077d = imageView;
    }

    public static C12913c a(View view) {
        int i10 = c.f109507D;
        TextView textView = (TextView) b.a(view, i10);
        if (textView != null) {
            i10 = c.f109557b0;
            Button button = (Button) b.a(view, i10);
            if (button != null) {
                i10 = c.f109624x1;
                ImageView imageView = (ImageView) b.a(view, i10);
                if (imageView != null) {
                    return new C12913c((LinearLayout) view, textView, button, imageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C12913c c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(d.f109635c, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f110074a;
    }
}
