package QE;

import OE.C13317i;
import OE.C13318j;
import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.media3.ui.PlayerView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* renamed from: QE.j  reason: case insensitive filesystem */
public final class C13433j implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f114606a;

    /* renamed from: b  reason: collision with root package name */
    public final MaterialCardView f114607b;

    /* renamed from: c  reason: collision with root package name */
    public final PlayerView f114608c;

    /* renamed from: d  reason: collision with root package name */
    public final FrameLayout f114609d;

    /* renamed from: e  reason: collision with root package name */
    public final View f114610e;

    /* renamed from: f  reason: collision with root package name */
    public final View f114611f;

    /* renamed from: g  reason: collision with root package name */
    public final FloatingActionButton f114612g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f114613h;

    /* renamed from: i  reason: collision with root package name */
    public final Guideline f114614i;

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f114615j;

    /* renamed from: k  reason: collision with root package name */
    public final ProgressBar f114616k;

    private C13433j(ConstraintLayout constraintLayout, MaterialCardView materialCardView, PlayerView playerView, FrameLayout frameLayout, View view, View view2, FloatingActionButton floatingActionButton, TextView textView, Guideline guideline, ImageView imageView, ProgressBar progressBar) {
        this.f114606a = constraintLayout;
        this.f114607b = materialCardView;
        this.f114608c = playerView;
        this.f114609d = frameLayout;
        this.f114610e = view;
        this.f114611f = view2;
        this.f114612g = floatingActionButton;
        this.f114613h = textView;
        this.f114614i = guideline;
        this.f114615j = imageView;
        this.f114616k = progressBar;
    }

    public static C13433j a(View view) {
        MaterialCardView materialCardView = (MaterialCardView) b.a(view, C13317i.f112985a);
        PlayerView playerView = (PlayerView) b.a(view, C13317i.f112990b);
        int i10 = C13317i.f112995c;
        FrameLayout frameLayout = (FrameLayout) b.a(view, i10);
        if (frameLayout != null) {
            View a10 = b.a(view, C13317i.f113000d);
            i10 = C13317i.f113005e;
            View a11 = b.a(view, i10);
            if (a11 != null) {
                i10 = C13317i.f113025i;
                FloatingActionButton floatingActionButton = (FloatingActionButton) b.a(view, i10);
                if (floatingActionButton != null) {
                    i10 = C13317i.f113030j;
                    TextView textView = (TextView) b.a(view, i10);
                    if (textView != null) {
                        i10 = C13317i.f112890C0;
                        Guideline guideline = (Guideline) b.a(view, i10);
                        if (guideline != null) {
                            i10 = C13317i.f112934N0;
                            ImageView imageView = (ImageView) b.a(view, i10);
                            if (imageView != null) {
                                i10 = C13317i.f113032j1;
                                ProgressBar progressBar = (ProgressBar) b.a(view, i10);
                                if (progressBar != null) {
                                    return new C13433j((ConstraintLayout) view, materialCardView, playerView, frameLayout, a10, a11, floatingActionButton, textView, guideline, imageView, progressBar);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C13433j c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C13318j.f113144k, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f114606a;
    }
}
