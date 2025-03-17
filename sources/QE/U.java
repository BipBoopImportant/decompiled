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
import com.sugarcube.app.base.ui.utils.BouncingBallView;

public final class U implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f114455a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f114456b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f114457c;

    /* renamed from: d  reason: collision with root package name */
    public final CardView f114458d;

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f114459e;

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f114460f;

    /* renamed from: g  reason: collision with root package name */
    public final BouncingBallView f114461g;

    /* renamed from: h  reason: collision with root package name */
    public final ScrollView f114462h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f114463i;

    /* renamed from: j  reason: collision with root package name */
    public final TextView f114464j;

    private U(ConstraintLayout constraintLayout, TextView textView, TextView textView2, CardView cardView, ImageView imageView, LinearLayout linearLayout, BouncingBallView bouncingBallView, ScrollView scrollView, TextView textView3, TextView textView4) {
        this.f114455a = constraintLayout;
        this.f114456b = textView;
        this.f114457c = textView2;
        this.f114458d = cardView;
        this.f114459e = imageView;
        this.f114460f = linearLayout;
        this.f114461g = bouncingBallView;
        this.f114462h = scrollView;
        this.f114463i = textView3;
        this.f114464j = textView4;
    }

    public static U a(View view) {
        int i10 = C13317i.f113035k;
        TextView textView = (TextView) b.a(view, i10);
        if (textView != null) {
            i10 = C13317i.f113055o;
            TextView textView2 = (TextView) b.a(view, i10);
            if (textView2 != null) {
                i10 = C13317i.f112893D;
                CardView cardView = (CardView) b.a(view, i10);
                if (cardView != null) {
                    i10 = C13317i.f112938O0;
                    ImageView imageView = (ImageView) b.a(view, i10);
                    if (imageView != null) {
                        i10 = C13317i.f112951R1;
                        LinearLayout linearLayout = (LinearLayout) b.a(view, i10);
                        if (linearLayout != null) {
                            i10 = C13317i.f112955S1;
                            BouncingBallView bouncingBallView = (BouncingBallView) b.a(view, i10);
                            if (bouncingBallView != null) {
                                i10 = C13317i.f112944P2;
                                ScrollView scrollView = (ScrollView) b.a(view, i10);
                                if (scrollView != null) {
                                    i10 = C13317i.f113004d3;
                                    TextView textView3 = (TextView) b.a(view, i10);
                                    if (textView3 != null) {
                                        i10 = C13317i.f113024h3;
                                        TextView textView4 = (TextView) b.a(view, i10);
                                        if (textView4 != null) {
                                            return new U((ConstraintLayout) view, textView, textView2, cardView, imageView, linearLayout, bouncingBallView, scrollView, textView3, textView4);
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

    public static U c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C13318j.f113122R, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f114455a;
    }
}
