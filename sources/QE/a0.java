package QE;

import OE.C13317i;
import OE.C13318j;
import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;

public final class a0 implements a {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f114501a;

    /* renamed from: b  reason: collision with root package name */
    public final b0 f114502b;

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f114503c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f114504d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f114505e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f114506f;

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f114507g;

    /* renamed from: h  reason: collision with root package name */
    public final CardView f114508h;

    /* renamed from: i  reason: collision with root package name */
    public final ImageButton f114509i;

    private a0(LinearLayout linearLayout, b0 b0Var, LinearLayout linearLayout2, TextView textView, TextView textView2, TextView textView3, ImageView imageView, CardView cardView, ImageButton imageButton) {
        this.f114501a = linearLayout;
        this.f114502b = b0Var;
        this.f114503c = linearLayout2;
        this.f114504d = textView;
        this.f114505e = textView2;
        this.f114506f = textView3;
        this.f114507g = imageView;
        this.f114508h = cardView;
        this.f114509i = imageButton;
    }

    public static a0 a(View view) {
        int i10 = C13317i.f113077t;
        View a10 = b.a(view, i10);
        if (a10 != null) {
            b0 a11 = b0.a(a10);
            LinearLayout linearLayout = (LinearLayout) view;
            i10 = C13317i.f112905G;
            TextView textView = (TextView) b.a(view, i10);
            if (textView != null) {
                i10 = C13317i.f112909H;
                TextView textView2 = (TextView) b.a(view, i10);
                if (textView2 != null) {
                    TextView textView3 = (TextView) b.a(view, C13317i.f112937O);
                    i10 = C13317i.f112922K0;
                    ImageView imageView = (ImageView) b.a(view, i10);
                    if (imageView != null) {
                        i10 = C13317i.f112926L0;
                        CardView cardView = (CardView) b.a(view, i10);
                        if (cardView != null) {
                            i10 = C13317i.f112948Q2;
                            ImageButton imageButton = (ImageButton) b.a(view, i10);
                            if (imageButton != null) {
                                return new a0(linearLayout, a11, linearLayout, textView, textView2, textView3, imageView, cardView, imageButton);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static a0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C13318j.f113128X, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f114501a;
    }
}
