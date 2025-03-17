package QE;

import OE.C13317i;
import X4.a;
import X4.b;
import android.view.View;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;

public final class b0 implements a {

    /* renamed from: a  reason: collision with root package name */
    private final CardView f114516a;

    /* renamed from: b  reason: collision with root package name */
    public final CardView f114517b;

    /* renamed from: c  reason: collision with root package name */
    public final ConstraintLayout f114518c;

    /* renamed from: d  reason: collision with root package name */
    public final Guideline f114519d;

    /* renamed from: e  reason: collision with root package name */
    public final Guideline f114520e;

    /* renamed from: f  reason: collision with root package name */
    public final Guideline f114521f;

    /* renamed from: g  reason: collision with root package name */
    public final Guideline f114522g;

    /* renamed from: h  reason: collision with root package name */
    public final Guideline f114523h;

    /* renamed from: i  reason: collision with root package name */
    public final Guideline f114524i;

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f114525j;

    /* renamed from: k  reason: collision with root package name */
    public final ImageView f114526k;

    /* renamed from: l  reason: collision with root package name */
    public final ImageView f114527l;

    /* renamed from: m  reason: collision with root package name */
    public final ImageView f114528m;

    /* renamed from: n  reason: collision with root package name */
    public final ImageView f114529n;

    /* renamed from: o  reason: collision with root package name */
    public final ImageView f114530o;

    private b0(CardView cardView, CardView cardView2, ConstraintLayout constraintLayout, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, Guideline guideline5, Guideline guideline6, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6) {
        this.f114516a = cardView;
        this.f114517b = cardView2;
        this.f114518c = constraintLayout;
        this.f114519d = guideline;
        this.f114520e = guideline2;
        this.f114521f = guideline3;
        this.f114522g = guideline4;
        this.f114523h = guideline5;
        this.f114524i = guideline6;
        this.f114525j = imageView;
        this.f114526k = imageView2;
        this.f114527l = imageView3;
        this.f114528m = imageView4;
        this.f114529n = imageView5;
        this.f114530o = imageView6;
    }

    public static b0 a(View view) {
        View view2 = view;
        CardView cardView = (CardView) view2;
        int i10 = C13317i.f113015g;
        ConstraintLayout constraintLayout = (ConstraintLayout) b.a(view2, i10);
        if (constraintLayout != null) {
            i10 = C13317i.f112886B0;
            Guideline guideline = (Guideline) b.a(view2, i10);
            if (guideline != null) {
                i10 = C13317i.f112894D0;
                Guideline guideline2 = (Guideline) b.a(view2, i10);
                if (guideline2 != null) {
                    i10 = C13317i.f112898E0;
                    Guideline guideline3 = (Guideline) b.a(view2, i10);
                    if (guideline3 != null) {
                        i10 = C13317i.f112902F0;
                        Guideline guideline4 = (Guideline) b.a(view2, i10);
                        if (guideline4 != null) {
                            i10 = C13317i.f112906G0;
                            Guideline guideline5 = (Guideline) b.a(view2, i10);
                            if (guideline5 != null) {
                                i10 = C13317i.f112910H0;
                                Guideline guideline6 = (Guideline) b.a(view2, i10);
                                if (guideline6 != null) {
                                    i10 = C13317i.f112946Q0;
                                    ImageView imageView = (ImageView) b.a(view2, i10);
                                    if (imageView != null) {
                                        i10 = C13317i.f112950R0;
                                        ImageView imageView2 = (ImageView) b.a(view2, i10);
                                        if (imageView2 != null) {
                                            i10 = C13317i.f112954S0;
                                            ImageView imageView3 = (ImageView) b.a(view2, i10);
                                            if (imageView3 != null) {
                                                i10 = C13317i.f112966V0;
                                                ImageView imageView4 = (ImageView) b.a(view2, i10);
                                                if (imageView4 != null) {
                                                    i10 = C13317i.f112970W0;
                                                    ImageView imageView5 = (ImageView) b.a(view2, i10);
                                                    if (imageView5 != null) {
                                                        i10 = C13317i.f113099y1;
                                                        ImageView imageView6 = (ImageView) b.a(view2, i10);
                                                        if (imageView6 != null) {
                                                            return new b0(cardView, cardView, constraintLayout, guideline, guideline2, guideline3, guideline4, guideline5, guideline6, imageView, imageView2, imageView3, imageView4, imageView5, imageView6);
                                                        }
                                                    }
                                                }
                                            }
                                        }
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

    /* renamed from: b */
    public CardView getRoot() {
        return this.f114516a;
    }
}
