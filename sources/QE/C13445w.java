package QE;

import OE.C13317i;
import OE.C13318j;
import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sugarcube.app.base.ui.feedback.FeedbackSmileRatingBar;

/* renamed from: QE.w  reason: case insensitive filesystem */
public final class C13445w implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f114739a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageButton f114740b;

    /* renamed from: c  reason: collision with root package name */
    public final FeedbackSmileRatingBar f114741c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f114742d;

    private C13445w(ConstraintLayout constraintLayout, ImageButton imageButton, FeedbackSmileRatingBar feedbackSmileRatingBar, TextView textView) {
        this.f114739a = constraintLayout;
        this.f114740b = imageButton;
        this.f114741c = feedbackSmileRatingBar;
        this.f114742d = textView;
    }

    public static C13445w a(View view) {
        int i10 = C13317i.f113016g0;
        ImageButton imageButton = (ImageButton) b.a(view, i10);
        if (imageButton != null) {
            i10 = C13317i.f113021h0;
            FeedbackSmileRatingBar feedbackSmileRatingBar = (FeedbackSmileRatingBar) b.a(view, i10);
            if (feedbackSmileRatingBar != null) {
                i10 = C13317i.f113026i0;
                TextView textView = (TextView) b.a(view, i10);
                if (textView != null) {
                    return new C13445w((ConstraintLayout) view, imageButton, feedbackSmileRatingBar, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C13445w c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static C13445w d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C13318j.f113154u, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f114739a;
    }
}
