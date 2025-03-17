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

public final class T implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f114441a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f114442b;

    /* renamed from: c  reason: collision with root package name */
    public final CardView f114443c;

    /* renamed from: d  reason: collision with root package name */
    public final MaterialButton f114444d;

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f114445e;

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f114446f;

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f114447g;

    /* renamed from: h  reason: collision with root package name */
    public final MaterialButton f114448h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f114449i;

    /* renamed from: j  reason: collision with root package name */
    public final ScrollView f114450j;

    /* renamed from: k  reason: collision with root package name */
    public final MaterialButton f114451k;

    /* renamed from: l  reason: collision with root package name */
    public final TextView f114452l;

    /* renamed from: m  reason: collision with root package name */
    public final TextView f114453m;

    /* renamed from: n  reason: collision with root package name */
    public final LinearLayout f114454n;

    private T(ConstraintLayout constraintLayout, TextView textView, CardView cardView, MaterialButton materialButton, LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2, MaterialButton materialButton2, TextView textView2, ScrollView scrollView, MaterialButton materialButton3, TextView textView3, TextView textView4, LinearLayout linearLayout3) {
        this.f114441a = constraintLayout;
        this.f114442b = textView;
        this.f114443c = cardView;
        this.f114444d = materialButton;
        this.f114445e = linearLayout;
        this.f114446f = imageView;
        this.f114447g = linearLayout2;
        this.f114448h = materialButton2;
        this.f114449i = textView2;
        this.f114450j = scrollView;
        this.f114451k = materialButton3;
        this.f114452l = textView3;
        this.f114453m = textView4;
        this.f114454n = linearLayout3;
    }

    public static T a(View view) {
        View view2 = view;
        int i10 = C13317i.f113035k;
        TextView textView = (TextView) b.a(view2, i10);
        if (textView != null) {
            i10 = C13317i.f112889C;
            CardView cardView = (CardView) b.a(view2, i10);
            if (cardView != null) {
                i10 = C13317i.f113102z0;
                MaterialButton materialButton = (MaterialButton) b.a(view2, i10);
                if (materialButton != null) {
                    i10 = C13317i.f112882A0;
                    LinearLayout linearLayout = (LinearLayout) b.a(view2, i10);
                    if (linearLayout != null) {
                        i10 = C13317i.f112938O0;
                        ImageView imageView = (ImageView) b.a(view2, i10);
                        if (imageView != null) {
                            i10 = C13317i.f113037k1;
                            LinearLayout linearLayout2 = (LinearLayout) b.a(view2, i10);
                            if (linearLayout2 != null) {
                                i10 = C13317i.f113047m1;
                                MaterialButton materialButton2 = (MaterialButton) b.a(view2, i10);
                                if (materialButton2 != null) {
                                    i10 = C13317i.f113052n1;
                                    TextView textView2 = (TextView) b.a(view2, i10);
                                    if (textView2 != null) {
                                        i10 = C13317i.f112944P2;
                                        ScrollView scrollView = (ScrollView) b.a(view2, i10);
                                        if (scrollView != null) {
                                            i10 = C13317i.f112964U2;
                                            MaterialButton materialButton3 = (MaterialButton) b.a(view2, i10);
                                            if (materialButton3 != null) {
                                                i10 = C13317i.f113004d3;
                                                TextView textView3 = (TextView) b.a(view2, i10);
                                                if (textView3 != null) {
                                                    i10 = C13317i.f113024h3;
                                                    TextView textView4 = (TextView) b.a(view2, i10);
                                                    if (textView4 != null) {
                                                        i10 = C13317i.f113054n3;
                                                        LinearLayout linearLayout3 = (LinearLayout) b.a(view2, i10);
                                                        if (linearLayout3 != null) {
                                                            return new T((ConstraintLayout) view2, textView, cardView, materialButton, linearLayout, imageView, linearLayout2, materialButton2, textView2, scrollView, materialButton3, textView3, textView4, linearLayout3);
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

    public static T c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C13318j.f113121Q, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f114441a;
    }
}
