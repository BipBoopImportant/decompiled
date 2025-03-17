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
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;

/* renamed from: QE.t  reason: case insensitive filesystem */
public final class C13442t implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f114708a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f114709b;

    /* renamed from: c  reason: collision with root package name */
    public final CardView f114710c;

    /* renamed from: d  reason: collision with root package name */
    public final MaterialButton f114711d;

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f114712e;

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f114713f;

    /* renamed from: g  reason: collision with root package name */
    public final ProgressBar f114714g;

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f114715h;

    /* renamed from: i  reason: collision with root package name */
    public final MaterialButton f114716i;

    /* renamed from: j  reason: collision with root package name */
    public final TextView f114717j;

    /* renamed from: k  reason: collision with root package name */
    public final ScrollView f114718k;

    /* renamed from: l  reason: collision with root package name */
    public final MaterialButton f114719l;

    /* renamed from: m  reason: collision with root package name */
    public final TextView f114720m;

    /* renamed from: n  reason: collision with root package name */
    public final TextView f114721n;

    /* renamed from: o  reason: collision with root package name */
    public final TextView f114722o;

    /* renamed from: p  reason: collision with root package name */
    public final LinearLayout f114723p;

    private C13442t(ConstraintLayout constraintLayout, TextView textView, CardView cardView, MaterialButton materialButton, LinearLayout linearLayout, ImageView imageView, ProgressBar progressBar, LinearLayout linearLayout2, MaterialButton materialButton2, TextView textView2, ScrollView scrollView, MaterialButton materialButton3, TextView textView3, TextView textView4, TextView textView5, LinearLayout linearLayout3) {
        this.f114708a = constraintLayout;
        this.f114709b = textView;
        this.f114710c = cardView;
        this.f114711d = materialButton;
        this.f114712e = linearLayout;
        this.f114713f = imageView;
        this.f114714g = progressBar;
        this.f114715h = linearLayout2;
        this.f114716i = materialButton2;
        this.f114717j = textView2;
        this.f114718k = scrollView;
        this.f114719l = materialButton3;
        this.f114720m = textView3;
        this.f114721n = textView4;
        this.f114722o = textView5;
        this.f114723p = linearLayout3;
    }

    public static C13442t a(View view) {
        View view2 = view;
        int i10 = C13317i.f113045m;
        TextView textView = (TextView) b.a(view2, i10);
        if (textView != null) {
            CardView cardView = (CardView) b.a(view2, C13317i.f112889C);
            i10 = C13317i.f113098y0;
            MaterialButton materialButton = (MaterialButton) b.a(view2, i10);
            if (materialButton != null) {
                i10 = C13317i.f112882A0;
                LinearLayout linearLayout = (LinearLayout) b.a(view2, i10);
                if (linearLayout != null) {
                    i10 = C13317i.f112958T0;
                    ImageView imageView = (ImageView) b.a(view2, i10);
                    if (imageView != null) {
                        i10 = C13317i.f113032j1;
                        ProgressBar progressBar = (ProgressBar) b.a(view2, i10);
                        if (progressBar != null) {
                            i10 = C13317i.f113037k1;
                            LinearLayout linearLayout2 = (LinearLayout) b.a(view2, i10);
                            if (linearLayout2 != null) {
                                i10 = C13317i.f113042l1;
                                MaterialButton materialButton2 = (MaterialButton) b.a(view2, i10);
                                if (materialButton2 != null) {
                                    i10 = C13317i.f113052n1;
                                    TextView textView2 = (TextView) b.a(view2, i10);
                                    if (textView2 != null) {
                                        ScrollView scrollView = (ScrollView) b.a(view2, C13317i.f112944P2);
                                        i10 = C13317i.f112960T2;
                                        MaterialButton materialButton3 = (MaterialButton) b.a(view2, i10);
                                        if (materialButton3 != null) {
                                            TextView textView3 = (TextView) b.a(view2, C13317i.f113004d3);
                                            TextView textView4 = (TextView) b.a(view2, C13317i.f113014f3);
                                            i10 = C13317i.f113034j3;
                                            TextView textView5 = (TextView) b.a(view2, i10);
                                            if (textView5 != null) {
                                                return new C13442t((ConstraintLayout) view2, textView, cardView, materialButton, linearLayout, imageView, progressBar, linearLayout2, materialButton2, textView2, scrollView, materialButton3, textView3, textView4, textView5, (LinearLayout) b.a(view2, C13317i.f113054n3));
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

    public static C13442t c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C13318j.f113151r, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f114708a;
    }
}
