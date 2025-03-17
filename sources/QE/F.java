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
import androidx.media3.ui.PlayerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.sugarcube.app.base.ui.hybrid.PanoTargetView;

public final class F implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f114346a;

    /* renamed from: b  reason: collision with root package name */
    public final FloatingActionButton f114347b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f114348c;

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f114349d;

    /* renamed from: e  reason: collision with root package name */
    public final MaterialCardView f114350e;

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f114351f;

    /* renamed from: g  reason: collision with root package name */
    public final PlayerView f114352g;

    /* renamed from: h  reason: collision with root package name */
    public final PanoTargetView f114353h;

    /* renamed from: i  reason: collision with root package name */
    public final ImageView f114354i;

    /* renamed from: j  reason: collision with root package name */
    public final MaterialButton f114355j;

    private F(ConstraintLayout constraintLayout, FloatingActionButton floatingActionButton, TextView textView, ImageView imageView, MaterialCardView materialCardView, ImageView imageView2, PlayerView playerView, PanoTargetView panoTargetView, ImageView imageView3, MaterialButton materialButton) {
        this.f114346a = constraintLayout;
        this.f114347b = floatingActionButton;
        this.f114348c = textView;
        this.f114349d = imageView;
        this.f114350e = materialCardView;
        this.f114351f = imageView2;
        this.f114352g = playerView;
        this.f114353h = panoTargetView;
        this.f114354i = imageView3;
        this.f114355j = materialButton;
    }

    public static F a(View view) {
        int i10 = C13317i.f113025i;
        FloatingActionButton floatingActionButton = (FloatingActionButton) b.a(view, i10);
        if (floatingActionButton != null) {
            i10 = C13317i.f113065q;
            TextView textView = (TextView) b.a(view, i10);
            if (textView != null) {
                i10 = C13317i.f112897E;
                ImageView imageView = (ImageView) b.a(view, i10);
                if (imageView != null) {
                    i10 = C13317i.f112923K1;
                    MaterialCardView materialCardView = (MaterialCardView) b.a(view, i10);
                    if (materialCardView != null) {
                        i10 = C13317i.f112927L1;
                        ImageView imageView2 = (ImageView) b.a(view, i10);
                        if (imageView2 != null) {
                            i10 = C13317i.f112931M1;
                            PlayerView playerView = (PlayerView) b.a(view, i10);
                            if (playerView != null) {
                                i10 = C13317i.f112935N1;
                                PanoTargetView panoTargetView = (PanoTargetView) b.a(view, i10);
                                if (panoTargetView != null) {
                                    i10 = C13317i.f113043l2;
                                    ImageView imageView3 = (ImageView) b.a(view, i10);
                                    if (imageView3 != null) {
                                        i10 = C13317i.f112989a3;
                                        MaterialButton materialButton = (MaterialButton) b.a(view, i10);
                                        if (materialButton != null) {
                                            return new F((ConstraintLayout) view, floatingActionButton, textView, imageView, materialCardView, imageView2, playerView, panoTargetView, imageView3, materialButton);
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

    public static F c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C13318j.f113108D, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f114346a;
    }
}
