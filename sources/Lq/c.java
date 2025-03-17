package lq;

import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import jq.n;
import jq.o;

public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f99470a;

    /* renamed from: b  reason: collision with root package name */
    public final CardView f99471b;

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f99472c;

    private c(LinearLayout linearLayout, CardView cardView, ImageView imageView) {
        this.f99470a = linearLayout;
        this.f99471b = cardView;
        this.f99472c = imageView;
    }

    public static c a(View view) {
        int i10 = n.f98656a;
        CardView cardView = (CardView) b.a(view, i10);
        if (cardView != null) {
            i10 = n.f98657b;
            ImageView imageView = (ImageView) b.a(view, i10);
            if (imageView != null) {
                return new c((LinearLayout) view, cardView, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static c c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(o.f98673c, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f99470a;
    }
}
