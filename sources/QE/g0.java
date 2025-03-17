package QE;

import OE.C13317i;
import OE.C13318j;
import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;

public final class g0 implements a {

    /* renamed from: a  reason: collision with root package name */
    private final CardView f114577a;

    /* renamed from: b  reason: collision with root package name */
    public final LinearLayout f114578b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f114579c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f114580d;

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f114581e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f114582f;

    private g0(CardView cardView, LinearLayout linearLayout, TextView textView, TextView textView2, ImageView imageView, TextView textView3) {
        this.f114577a = cardView;
        this.f114578b = linearLayout;
        this.f114579c = textView;
        this.f114580d = textView2;
        this.f114581e = imageView;
        this.f114582f = textView3;
    }

    public static g0 a(View view) {
        int i10 = C13317i.f112917J;
        LinearLayout linearLayout = (LinearLayout) b.a(view, i10);
        if (linearLayout != null) {
            i10 = C13317i.f113023h2;
            TextView textView = (TextView) b.a(view, i10);
            if (textView != null) {
                i10 = C13317i.f113028i2;
                TextView textView2 = (TextView) b.a(view, i10);
                if (textView2 != null) {
                    i10 = C13317i.f113033j2;
                    ImageView imageView = (ImageView) b.a(view, i10);
                    if (imageView != null) {
                        i10 = C13317i.f113038k2;
                        TextView textView3 = (TextView) b.a(view, i10);
                        if (textView3 != null) {
                            return new g0((CardView) view, linearLayout, textView, textView2, imageView, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static g0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C13318j.f113134b0, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public CardView getRoot() {
        return this.f114577a;
    }
}
