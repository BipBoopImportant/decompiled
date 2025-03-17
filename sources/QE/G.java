package QE;

import OE.C13317i;
import OE.C13318j;
import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.ui.PlayerView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public final class G implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f114356a;

    /* renamed from: b  reason: collision with root package name */
    public final FloatingActionButton f114357b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f114358c;

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f114359d;

    /* renamed from: e  reason: collision with root package name */
    public final MaterialCardView f114360e;

    /* renamed from: f  reason: collision with root package name */
    public final PlayerView f114361f;

    /* renamed from: g  reason: collision with root package name */
    public final ProgressBar f114362g;

    private G(ConstraintLayout constraintLayout, FloatingActionButton floatingActionButton, TextView textView, ImageView imageView, MaterialCardView materialCardView, PlayerView playerView, ProgressBar progressBar) {
        this.f114356a = constraintLayout;
        this.f114357b = floatingActionButton;
        this.f114358c = textView;
        this.f114359d = imageView;
        this.f114360e = materialCardView;
        this.f114361f = playerView;
        this.f114362g = progressBar;
    }

    public static G a(View view) {
        int i10 = C13317i.f113025i;
        FloatingActionButton floatingActionButton = (FloatingActionButton) b.a(view, i10);
        if (floatingActionButton != null) {
            i10 = C13317i.f113065q;
            TextView textView = (TextView) b.a(view, i10);
            if (textView != null) {
                i10 = C13317i.f113031j0;
                ImageView imageView = (ImageView) b.a(view, i10);
                if (imageView != null) {
                    i10 = C13317i.f112974X0;
                    MaterialCardView materialCardView = (MaterialCardView) b.a(view, i10);
                    if (materialCardView != null) {
                        i10 = C13317i.f112978Y0;
                        PlayerView playerView = (PlayerView) b.a(view, i10);
                        if (playerView != null) {
                            i10 = C13317i.f112963U1;
                            ProgressBar progressBar = (ProgressBar) b.a(view, i10);
                            if (progressBar != null) {
                                return new G((ConstraintLayout) view, floatingActionButton, textView, imageView, materialCardView, playerView, progressBar);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static G c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C13318j.f113109E, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f114356a;
    }
}
