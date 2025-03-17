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

/* renamed from: QE.l  reason: case insensitive filesystem */
public final class C13435l implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f114629a;

    /* renamed from: b  reason: collision with root package name */
    public final FloatingActionButton f114630b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f114631c;

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f114632d;

    /* renamed from: e  reason: collision with root package name */
    public final MaterialCardView f114633e;

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f114634f;

    /* renamed from: g  reason: collision with root package name */
    public final PlayerView f114635g;

    /* renamed from: h  reason: collision with root package name */
    public final PanoTargetView f114636h;

    /* renamed from: i  reason: collision with root package name */
    public final ImageView f114637i;

    /* renamed from: j  reason: collision with root package name */
    public final MaterialButton f114638j;

    private C13435l(ConstraintLayout constraintLayout, FloatingActionButton floatingActionButton, TextView textView, ImageView imageView, MaterialCardView materialCardView, ImageView imageView2, PlayerView playerView, PanoTargetView panoTargetView, ImageView imageView3, MaterialButton materialButton) {
        this.f114629a = constraintLayout;
        this.f114630b = floatingActionButton;
        this.f114631c = textView;
        this.f114632d = imageView;
        this.f114633e = materialCardView;
        this.f114634f = imageView2;
        this.f114635g = playerView;
        this.f114636h = panoTargetView;
        this.f114637i = imageView3;
        this.f114638j = materialButton;
    }

    public static C13435l a(View view) {
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
                                            return new C13435l((ConstraintLayout) view, floatingActionButton, textView, imageView, materialCardView, imageView2, playerView, panoTargetView, imageView3, materialButton);
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

    public static C13435l c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C13318j.f113146m, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f114629a;
    }
}
