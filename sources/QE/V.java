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
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.sugarcube.app.base.ui.utils.BouncingBallView;

public final class V implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f114465a;

    /* renamed from: b  reason: collision with root package name */
    public final LinearLayout f114466b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f114467c;

    /* renamed from: d  reason: collision with root package name */
    public final MaterialButton f114468d;

    /* renamed from: e  reason: collision with root package name */
    public final CardView f114469e;

    /* renamed from: f  reason: collision with root package name */
    public final MaterialButton f114470f;

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f114471g;

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f114472h;

    /* renamed from: i  reason: collision with root package name */
    public final BouncingBallView f114473i;

    /* renamed from: j  reason: collision with root package name */
    public final ScrollView f114474j;

    /* renamed from: k  reason: collision with root package name */
    public final TextView f114475k;

    /* renamed from: l  reason: collision with root package name */
    public final TextView f114476l;

    private V(ConstraintLayout constraintLayout, LinearLayout linearLayout, TextView textView, MaterialButton materialButton, CardView cardView, MaterialButton materialButton2, ImageView imageView, LinearLayout linearLayout2, BouncingBallView bouncingBallView, ScrollView scrollView, TextView textView2, TextView textView3) {
        this.f114465a = constraintLayout;
        this.f114466b = linearLayout;
        this.f114467c = textView;
        this.f114468d = materialButton;
        this.f114469e = cardView;
        this.f114470f = materialButton2;
        this.f114471g = imageView;
        this.f114472h = linearLayout2;
        this.f114473i = bouncingBallView;
        this.f114474j = scrollView;
        this.f114475k = textView2;
        this.f114476l = textView3;
    }

    public static V a(View view) {
        int i10 = C13317i.f113020h;
        LinearLayout linearLayout = (LinearLayout) b.a(view, i10);
        if (linearLayout != null) {
            i10 = C13317i.f113040l;
            TextView textView = (TextView) b.a(view, i10);
            if (textView != null) {
                i10 = C13317i.f113073s;
                MaterialButton materialButton = (MaterialButton) b.a(view, i10);
                if (materialButton != null) {
                    i10 = C13317i.f112893D;
                    CardView cardView = (CardView) b.a(view, i10);
                    if (cardView != null) {
                        i10 = C13317i.f112921K;
                        MaterialButton materialButton2 = (MaterialButton) b.a(view, i10);
                        if (materialButton2 != null) {
                            i10 = C13317i.f112947Q1;
                            ImageView imageView = (ImageView) b.a(view, i10);
                            if (imageView != null) {
                                i10 = C13317i.f112951R1;
                                LinearLayout linearLayout2 = (LinearLayout) b.a(view, i10);
                                if (linearLayout2 != null) {
                                    i10 = C13317i.f112955S1;
                                    BouncingBallView bouncingBallView = (BouncingBallView) b.a(view, i10);
                                    if (bouncingBallView != null) {
                                        i10 = C13317i.f112944P2;
                                        ScrollView scrollView = (ScrollView) b.a(view, i10);
                                        if (scrollView != null) {
                                            i10 = C13317i.f113009e3;
                                            TextView textView2 = (TextView) b.a(view, i10);
                                            if (textView2 != null) {
                                                i10 = C13317i.f113029i3;
                                                TextView textView3 = (TextView) b.a(view, i10);
                                                if (textView3 != null) {
                                                    return new V((ConstraintLayout) view, linearLayout, textView, materialButton, cardView, materialButton2, imageView, linearLayout2, bouncingBallView, scrollView, textView2, textView3);
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

    public static V c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C13318j.f113123S, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f114465a;
    }
}
