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

/* renamed from: QE.m  reason: case insensitive filesystem */
public final class C13436m implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f114647a;

    /* renamed from: b  reason: collision with root package name */
    public final FloatingActionButton f114648b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f114649c;

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f114650d;

    /* renamed from: e  reason: collision with root package name */
    public final ProgressBar f114651e;

    /* renamed from: f  reason: collision with root package name */
    public final ProgressBar f114652f;

    /* renamed from: g  reason: collision with root package name */
    public final MaterialCardView f114653g;

    /* renamed from: h  reason: collision with root package name */
    public final PlayerView f114654h;

    private C13436m(ConstraintLayout constraintLayout, FloatingActionButton floatingActionButton, TextView textView, ImageView imageView, ProgressBar progressBar, ProgressBar progressBar2, MaterialCardView materialCardView, PlayerView playerView) {
        this.f114647a = constraintLayout;
        this.f114648b = floatingActionButton;
        this.f114649c = textView;
        this.f114650d = imageView;
        this.f114651e = progressBar;
        this.f114652f = progressBar2;
        this.f114653g = materialCardView;
        this.f114654h = playerView;
    }

    public static C13436m a(View view) {
        int i10 = C13317i.f113025i;
        FloatingActionButton floatingActionButton = (FloatingActionButton) b.a(view, i10);
        if (floatingActionButton != null) {
            i10 = C13317i.f113065q;
            TextView textView = (TextView) b.a(view, i10);
            if (textView != null) {
                i10 = C13317i.f113031j0;
                ImageView imageView = (ImageView) b.a(view, i10);
                if (imageView != null) {
                    i10 = C13317i.f113032j1;
                    ProgressBar progressBar = (ProgressBar) b.a(view, i10);
                    if (progressBar != null) {
                        i10 = C13317i.f112963U1;
                        ProgressBar progressBar2 = (ProgressBar) b.a(view, i10);
                        if (progressBar2 != null) {
                            return new C13436m((ConstraintLayout) view, floatingActionButton, textView, imageView, progressBar, progressBar2, (MaterialCardView) b.a(view, C13317i.f113048m2), (PlayerView) b.a(view, C13317i.f113053n2));
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C13436m c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C13318j.f113147n, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f114647a;
    }
}
