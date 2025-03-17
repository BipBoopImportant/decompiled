package TF;

import SF.C16401b;
import SF.C16402c;
import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: TF.e  reason: case insensitive filesystem */
public final class C16462e implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f138401a;

    /* renamed from: b  reason: collision with root package name */
    public final CardView f138402b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f138403c;

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f138404d;

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f138405e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f138406f;

    /* renamed from: g  reason: collision with root package name */
    public final TextView f138407g;

    /* renamed from: h  reason: collision with root package name */
    public final ProgressBar f138408h;

    /* renamed from: i  reason: collision with root package name */
    public final ImageView f138409i;

    private C16462e(ConstraintLayout constraintLayout, CardView cardView, TextView textView, ImageView imageView, ImageView imageView2, TextView textView2, TextView textView3, ProgressBar progressBar, ImageView imageView3) {
        this.f138401a = constraintLayout;
        this.f138402b = cardView;
        this.f138403c = textView;
        this.f138404d = imageView;
        this.f138405e = imageView2;
        this.f138406f = textView2;
        this.f138407g = textView3;
        this.f138408h = progressBar;
        this.f138409i = imageView3;
    }

    public static C16462e a(View view) {
        int i10 = C16401b.f138062A;
        CardView cardView = (CardView) b.a(view, i10);
        if (cardView != null) {
            i10 = C16401b.f138064B;
            TextView textView = (TextView) b.a(view, i10);
            if (textView != null) {
                i10 = C16401b.f138066C;
                ImageView imageView = (ImageView) b.a(view, i10);
                if (imageView != null) {
                    i10 = C16401b.f138068D;
                    ImageView imageView2 = (ImageView) b.a(view, i10);
                    if (imageView2 != null) {
                        i10 = C16401b.f138070E;
                        TextView textView2 = (TextView) b.a(view, i10);
                        if (textView2 != null) {
                            i10 = C16401b.f138072F;
                            TextView textView3 = (TextView) b.a(view, i10);
                            if (textView3 != null) {
                                i10 = C16401b.f138074G;
                                ProgressBar progressBar = (ProgressBar) b.a(view, i10);
                                if (progressBar != null) {
                                    i10 = C16401b.f138071E0;
                                    ImageView imageView3 = (ImageView) b.a(view, i10);
                                    if (imageView3 != null) {
                                        return new C16462e((ConstraintLayout) view, cardView, textView, imageView, imageView2, textView2, textView3, progressBar, imageView3);
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

    public static C16462e c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C16402c.f138193b, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f138401a;
    }
}
