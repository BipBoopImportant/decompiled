package QE;

import OE.C13317i;
import OE.C13318j;
import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.sugarcube.app.base.ui.interstitial.OptionInterstitialCard;

/* renamed from: QE.u  reason: case insensitive filesystem */
public final class C13443u implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f114724a;

    /* renamed from: b  reason: collision with root package name */
    public final FloatingActionButton f114725b;

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f114726c;

    /* renamed from: d  reason: collision with root package name */
    public final OptionInterstitialCard f114727d;

    /* renamed from: e  reason: collision with root package name */
    public final OptionInterstitialCard f114728e;

    private C13443u(ConstraintLayout constraintLayout, FloatingActionButton floatingActionButton, ImageView imageView, OptionInterstitialCard optionInterstitialCard, OptionInterstitialCard optionInterstitialCard2) {
        this.f114724a = constraintLayout;
        this.f114725b = floatingActionButton;
        this.f114726c = imageView;
        this.f114727d = optionInterstitialCard;
        this.f114728e = optionInterstitialCard2;
    }

    public static C13443u a(View view) {
        int i10 = C13317i.f112941P;
        FloatingActionButton floatingActionButton = (FloatingActionButton) b.a(view, i10);
        if (floatingActionButton != null) {
            i10 = C13317i.f112945Q;
            ImageView imageView = (ImageView) b.a(view, i10);
            if (imageView != null) {
                i10 = C13317i.f112949R;
                OptionInterstitialCard optionInterstitialCard = (OptionInterstitialCard) b.a(view, i10);
                if (optionInterstitialCard != null) {
                    i10 = C13317i.f112953S;
                    OptionInterstitialCard optionInterstitialCard2 = (OptionInterstitialCard) b.a(view, i10);
                    if (optionInterstitialCard2 != null) {
                        return new C13443u((ConstraintLayout) view, floatingActionButton, imageView, optionInterstitialCard, optionInterstitialCard2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C13443u c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C13318j.f113152s, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f114724a;
    }
}
