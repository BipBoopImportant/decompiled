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
import androidx.constraintlayout.widget.Guideline;
import androidx.media3.ui.PlayerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* renamed from: QE.D  reason: case insensitive filesystem */
public final class C13423D implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f114333a;

    /* renamed from: b  reason: collision with root package name */
    public final MaterialCardView f114334b;

    /* renamed from: c  reason: collision with root package name */
    public final PlayerView f114335c;

    /* renamed from: d  reason: collision with root package name */
    public final MaterialButton f114336d;

    /* renamed from: e  reason: collision with root package name */
    public final FloatingActionButton f114337e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f114338f;

    /* renamed from: g  reason: collision with root package name */
    public final Guideline f114339g;

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f114340h;

    private C13423D(ConstraintLayout constraintLayout, MaterialCardView materialCardView, PlayerView playerView, MaterialButton materialButton, FloatingActionButton floatingActionButton, TextView textView, Guideline guideline, ImageView imageView) {
        this.f114333a = constraintLayout;
        this.f114334b = materialCardView;
        this.f114335c = playerView;
        this.f114336d = materialButton;
        this.f114337e = floatingActionButton;
        this.f114338f = textView;
        this.f114339g = guideline;
        this.f114340h = imageView;
    }

    public static C13423D a(View view) {
        int i10 = C13317i.f112985a;
        MaterialCardView materialCardView = (MaterialCardView) b.a(view, i10);
        if (materialCardView != null) {
            i10 = C13317i.f112990b;
            PlayerView playerView = (PlayerView) b.a(view, i10);
            if (playerView != null) {
                i10 = C13317i.f113005e;
                MaterialButton materialButton = (MaterialButton) b.a(view, i10);
                if (materialButton != null) {
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
                                    return new C13423D((ConstraintLayout) view, materialCardView, playerView, materialButton, floatingActionButton, textView, guideline, imageView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C13423D c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C13318j.f113106B, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f114333a;
    }
}
