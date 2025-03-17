package Ye;

import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;

public final class d implements a {

    /* renamed from: a  reason: collision with root package name */
    private final CardView f64985a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f64986b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f64987c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f64988d;

    private d(CardView cardView, ImageView imageView, TextView textView, TextView textView2) {
        this.f64985a = cardView;
        this.f64986b = imageView;
        this.f64987c = textView;
        this.f64988d = textView2;
    }

    public static d a(View view) {
        int i10 = We.a.f64693i;
        ImageView imageView = (ImageView) b.a(view, i10);
        if (imageView != null) {
            i10 = We.a.f64691g;
            TextView textView = (TextView) b.a(view, i10);
            if (textView != null) {
                i10 = We.a.f64692h;
                TextView textView2 = (TextView) b.a(view, i10);
                if (textView2 != null) {
                    return new d((CardView) view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static d c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(We.b.f64716i, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public CardView getRoot() {
        return this.f64985a;
    }
}
