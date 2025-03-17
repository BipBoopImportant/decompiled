package QE;

import OE.C13317i;
import OE.C13318j;
import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sugarcube.app.base.ui.utils.BouncingBallView;

/* renamed from: QE.h  reason: case insensitive filesystem */
public final class C13431h implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f114583a;

    /* renamed from: b  reason: collision with root package name */
    public final CardView f114584b;

    /* renamed from: c  reason: collision with root package name */
    public final BouncingBallView f114585c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f114586d;

    private C13431h(ConstraintLayout constraintLayout, CardView cardView, BouncingBallView bouncingBallView, TextView textView) {
        this.f114583a = constraintLayout;
        this.f114584b = cardView;
        this.f114585c = bouncingBallView;
        this.f114586d = textView;
    }

    public static C13431h a(View view) {
        int i10 = C13317i.f112913I;
        CardView cardView = (CardView) b.a(view, i10);
        if (cardView != null) {
            i10 = C13317i.f112955S1;
            BouncingBallView bouncingBallView = (BouncingBallView) b.a(view, i10);
            if (bouncingBallView != null) {
                i10 = C13317i.f112994b3;
                TextView textView = (TextView) b.a(view, i10);
                if (textView != null) {
                    return new C13431h((ConstraintLayout) view, cardView, bouncingBallView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C13431h c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static C13431h d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C13318j.f113141h, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f114583a;
    }
}
