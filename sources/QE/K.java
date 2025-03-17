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
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sugarcube.app.base.ui.utils.BouncingBallView;

public final class K implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f114389a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f114390b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f114391c;

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f114392d;

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f114393e;

    /* renamed from: f  reason: collision with root package name */
    public final BouncingBallView f114394f;

    /* renamed from: g  reason: collision with root package name */
    public final TextView f114395g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f114396h;

    private K(ConstraintLayout constraintLayout, TextView textView, TextView textView2, ImageView imageView, LinearLayout linearLayout, BouncingBallView bouncingBallView, TextView textView3, TextView textView4) {
        this.f114389a = constraintLayout;
        this.f114390b = textView;
        this.f114391c = textView2;
        this.f114392d = imageView;
        this.f114393e = linearLayout;
        this.f114394f = bouncingBallView;
        this.f114395g = textView3;
        this.f114396h = textView4;
    }

    public static K a(View view) {
        int i10 = C13317i.f113035k;
        TextView textView = (TextView) b.a(view, i10);
        if (textView != null) {
            i10 = C13317i.f113055o;
            TextView textView2 = (TextView) b.a(view, i10);
            if (textView2 != null) {
                i10 = C13317i.f112938O0;
                ImageView imageView = (ImageView) b.a(view, i10);
                if (imageView != null) {
                    i10 = C13317i.f112951R1;
                    LinearLayout linearLayout = (LinearLayout) b.a(view, i10);
                    if (linearLayout != null) {
                        i10 = C13317i.f112955S1;
                        BouncingBallView bouncingBallView = (BouncingBallView) b.a(view, i10);
                        if (bouncingBallView != null) {
                            i10 = C13317i.f113004d3;
                            TextView textView3 = (TextView) b.a(view, i10);
                            if (textView3 != null) {
                                i10 = C13317i.f113024h3;
                                TextView textView4 = (TextView) b.a(view, i10);
                                if (textView4 != null) {
                                    return new K((ConstraintLayout) view, textView, textView2, imageView, linearLayout, bouncingBallView, textView3, textView4);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static K c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C13318j.f113113I, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f114389a;
    }
}
