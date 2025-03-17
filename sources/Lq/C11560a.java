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

/* renamed from: lq.a  reason: case insensitive filesystem */
public final class C11560a implements a {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f99461a;

    /* renamed from: b  reason: collision with root package name */
    public final CardView f99462b;

    /* renamed from: c  reason: collision with root package name */
    public final CardView f99463c;

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f99464d;

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f99465e;

    private C11560a(LinearLayout linearLayout, CardView cardView, CardView cardView2, ImageView imageView, ImageView imageView2) {
        this.f99461a = linearLayout;
        this.f99462b = cardView;
        this.f99463c = cardView2;
        this.f99464d = imageView;
        this.f99465e = imageView2;
    }

    public static C11560a a(View view) {
        int i10 = n.f98658c;
        CardView cardView = (CardView) b.a(view, i10);
        if (cardView != null) {
            i10 = n.f98659d;
            CardView cardView2 = (CardView) b.a(view, i10);
            if (cardView2 != null) {
                i10 = n.f98660e;
                ImageView imageView = (ImageView) b.a(view, i10);
                if (imageView != null) {
                    i10 = n.f98661f;
                    ImageView imageView2 = (ImageView) b.a(view, i10);
                    if (imageView2 != null) {
                        return new C11560a((LinearLayout) view, cardView, cardView2, imageView, imageView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C11560a c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(o.f98671a, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f99461a;
    }
}
