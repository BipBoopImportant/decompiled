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
import com.google.android.material.button.MaterialButton;
import com.sugarcube.app.base.ui.utils.BouncingBallView;

public final class J implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f114377a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f114378b;

    /* renamed from: c  reason: collision with root package name */
    public final MaterialButton f114379c;

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f114380d;

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f114381e;

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f114382f;

    /* renamed from: g  reason: collision with root package name */
    public final MaterialButton f114383g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f114384h;

    /* renamed from: i  reason: collision with root package name */
    public final MaterialButton f114385i;

    /* renamed from: j  reason: collision with root package name */
    public final TextView f114386j;

    /* renamed from: k  reason: collision with root package name */
    public final TextView f114387k;

    /* renamed from: l  reason: collision with root package name */
    public final BouncingBallView f114388l;

    private J(ConstraintLayout constraintLayout, TextView textView, MaterialButton materialButton, LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2, MaterialButton materialButton2, TextView textView2, MaterialButton materialButton3, TextView textView3, TextView textView4, BouncingBallView bouncingBallView) {
        this.f114377a = constraintLayout;
        this.f114378b = textView;
        this.f114379c = materialButton;
        this.f114380d = linearLayout;
        this.f114381e = imageView;
        this.f114382f = linearLayout2;
        this.f114383g = materialButton2;
        this.f114384h = textView2;
        this.f114385i = materialButton3;
        this.f114386j = textView3;
        this.f114387k = textView4;
        this.f114388l = bouncingBallView;
    }

    public static J a(View view) {
        int i10 = C13317i.f113035k;
        TextView textView = (TextView) b.a(view, i10);
        if (textView != null) {
            i10 = C13317i.f113102z0;
            MaterialButton materialButton = (MaterialButton) b.a(view, i10);
            if (materialButton != null) {
                i10 = C13317i.f112882A0;
                LinearLayout linearLayout = (LinearLayout) b.a(view, i10);
                if (linearLayout != null) {
                    i10 = C13317i.f112938O0;
                    ImageView imageView = (ImageView) b.a(view, i10);
                    if (imageView != null) {
                        i10 = C13317i.f113037k1;
                        LinearLayout linearLayout2 = (LinearLayout) b.a(view, i10);
                        if (linearLayout2 != null) {
                            i10 = C13317i.f113047m1;
                            MaterialButton materialButton2 = (MaterialButton) b.a(view, i10);
                            if (materialButton2 != null) {
                                i10 = C13317i.f113052n1;
                                TextView textView2 = (TextView) b.a(view, i10);
                                if (textView2 != null) {
                                    i10 = C13317i.f112964U2;
                                    MaterialButton materialButton3 = (MaterialButton) b.a(view, i10);
                                    if (materialButton3 != null) {
                                        i10 = C13317i.f113004d3;
                                        TextView textView3 = (TextView) b.a(view, i10);
                                        if (textView3 != null) {
                                            i10 = C13317i.f113024h3;
                                            TextView textView4 = (TextView) b.a(view, i10);
                                            if (textView4 != null) {
                                                i10 = C13317i.f113064p3;
                                                BouncingBallView bouncingBallView = (BouncingBallView) b.a(view, i10);
                                                if (bouncingBallView != null) {
                                                    return new J((ConstraintLayout) view, textView, materialButton, linearLayout, imageView, linearLayout2, materialButton2, textView2, materialButton3, textView3, textView4, bouncingBallView);
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

    public static J c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C13318j.f113112H, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f114377a;
    }
}
