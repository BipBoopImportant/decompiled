package QE;

import OE.C13317i;
import OE.C13318j;
import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.sugarcube.app.base.ui.utils.BouncingBallView;

public final class L implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f114397a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f114398b;

    /* renamed from: c  reason: collision with root package name */
    public final MaterialButton f114399c;

    /* renamed from: d  reason: collision with root package name */
    public final MaterialButton f114400d;

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f114401e;

    /* renamed from: f  reason: collision with root package name */
    public final BouncingBallView f114402f;

    /* renamed from: g  reason: collision with root package name */
    public final TextView f114403g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f114404h;

    private L(ConstraintLayout constraintLayout, TextView textView, MaterialButton materialButton, MaterialButton materialButton2, ImageView imageView, BouncingBallView bouncingBallView, TextView textView2, TextView textView3) {
        this.f114397a = constraintLayout;
        this.f114398b = textView;
        this.f114399c = materialButton;
        this.f114400d = materialButton2;
        this.f114401e = imageView;
        this.f114402f = bouncingBallView;
        this.f114403g = textView2;
        this.f114404h = textView3;
    }

    public static L a(View view) {
        int i10 = C13317i.f113040l;
        TextView textView = (TextView) b.a(view, i10);
        if (textView != null) {
            i10 = C13317i.f113073s;
            MaterialButton materialButton = (MaterialButton) b.a(view, i10);
            if (materialButton != null) {
                i10 = C13317i.f112921K;
                MaterialButton materialButton2 = (MaterialButton) b.a(view, i10);
                if (materialButton2 != null) {
                    i10 = C13317i.f112947Q1;
                    ImageView imageView = (ImageView) b.a(view, i10);
                    if (imageView != null) {
                        i10 = C13317i.f112955S1;
                        BouncingBallView bouncingBallView = (BouncingBallView) b.a(view, i10);
                        if (bouncingBallView != null) {
                            i10 = C13317i.f113009e3;
                            TextView textView2 = (TextView) b.a(view, i10);
                            if (textView2 != null) {
                                i10 = C13317i.f113029i3;
                                TextView textView3 = (TextView) b.a(view, i10);
                                if (textView3 != null) {
                                    return new L((ConstraintLayout) view, textView, materialButton, materialButton2, imageView, bouncingBallView, textView2, textView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static L c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C13318j.f113114J, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f114397a;
    }
}
