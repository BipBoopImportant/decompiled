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

/* renamed from: QE.s  reason: case insensitive filesystem */
public final class C13441s implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f114697a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f114698b;

    /* renamed from: c  reason: collision with root package name */
    public final MaterialButton f114699c;

    /* renamed from: d  reason: collision with root package name */
    public final CardView f114700d;

    /* renamed from: e  reason: collision with root package name */
    public final MaterialButton f114701e;

    /* renamed from: f  reason: collision with root package name */
    public final ProgressBar f114702f;

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f114703g;

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f114704h;

    /* renamed from: i  reason: collision with root package name */
    public final ScrollView f114705i;

    /* renamed from: j  reason: collision with root package name */
    public final TextView f114706j;

    /* renamed from: k  reason: collision with root package name */
    public final TextView f114707k;

    private C13441s(ConstraintLayout constraintLayout, TextView textView, MaterialButton materialButton, CardView cardView, MaterialButton materialButton2, ProgressBar progressBar, ImageView imageView, LinearLayout linearLayout, ScrollView scrollView, TextView textView2, TextView textView3) {
        this.f114697a = constraintLayout;
        this.f114698b = textView;
        this.f114699c = materialButton;
        this.f114700d = cardView;
        this.f114701e = materialButton2;
        this.f114702f = progressBar;
        this.f114703g = imageView;
        this.f114704h = linearLayout;
        this.f114705i = scrollView;
        this.f114706j = textView2;
        this.f114707k = textView3;
    }

    public static C13441s a(View view) {
        int i10 = C13317i.f113040l;
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
                        i10 = C13317i.f113032j1;
                        ProgressBar progressBar = (ProgressBar) b.a(view, i10);
                        if (progressBar != null) {
                            i10 = C13317i.f112947Q1;
                            ImageView imageView = (ImageView) b.a(view, i10);
                            if (imageView != null) {
                                LinearLayout linearLayout = (LinearLayout) b.a(view, C13317i.f112951R1);
                                ScrollView scrollView = (ScrollView) b.a(view, C13317i.f112944P2);
                                i10 = C13317i.f113009e3;
                                TextView textView2 = (TextView) b.a(view, i10);
                                if (textView2 != null) {
                                    i10 = C13317i.f113029i3;
                                    TextView textView3 = (TextView) b.a(view, i10);
                                    if (textView3 != null) {
                                        return new C13441s((ConstraintLayout) view, textView, materialButton, cardView, materialButton2, progressBar, imageView, linearLayout, scrollView, textView2, textView3);
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

    public static C13441s c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C13318j.f113150q, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f114697a;
    }
}
