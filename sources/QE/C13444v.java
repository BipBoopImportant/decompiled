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
import androidx.constraintlayout.widget.Group;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.sugarcube.app.base.ui.feedback.FeedbackSmileRatingBar;

/* renamed from: QE.v  reason: case insensitive filesystem */
public final class C13444v implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f114729a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f114730b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f114731c;

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f114732d;

    /* renamed from: e  reason: collision with root package name */
    public final FeedbackSmileRatingBar f114733e;

    /* renamed from: f  reason: collision with root package name */
    public final TextInputEditText f114734f;

    /* renamed from: g  reason: collision with root package name */
    public final TextInputLayout f114735g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f114736h;

    /* renamed from: i  reason: collision with root package name */
    public final MaterialButton f114737i;

    /* renamed from: j  reason: collision with root package name */
    public final Group f114738j;

    private C13444v(ConstraintLayout constraintLayout, TextView textView, TextView textView2, ImageView imageView, FeedbackSmileRatingBar feedbackSmileRatingBar, TextInputEditText textInputEditText, TextInputLayout textInputLayout, TextView textView3, MaterialButton materialButton, Group group) {
        this.f114729a = constraintLayout;
        this.f114730b = textView;
        this.f114731c = textView2;
        this.f114732d = imageView;
        this.f114733e = feedbackSmileRatingBar;
        this.f114734f = textInputEditText;
        this.f114735g = textInputLayout;
        this.f114736h = textView3;
        this.f114737i = materialButton;
        this.f114738j = group;
    }

    public static C13444v a(View view) {
        int i10 = C13317i.f112975X1;
        TextView textView = (TextView) b.a(view, i10);
        if (textView != null) {
            i10 = C13317i.f112979Y1;
            TextView textView2 = (TextView) b.a(view, i10);
            if (textView2 != null) {
                i10 = C13317i.f112983Z1;
                ImageView imageView = (ImageView) b.a(view, i10);
                if (imageView != null) {
                    i10 = C13317i.f112988a2;
                    FeedbackSmileRatingBar feedbackSmileRatingBar = (FeedbackSmileRatingBar) b.a(view, i10);
                    if (feedbackSmileRatingBar != null) {
                        i10 = C13317i.f112993b2;
                        TextInputEditText textInputEditText = (TextInputEditText) b.a(view, i10);
                        if (textInputEditText != null) {
                            i10 = C13317i.f112998c2;
                            TextInputLayout textInputLayout = (TextInputLayout) b.a(view, i10);
                            if (textInputLayout != null) {
                                i10 = C13317i.f113003d2;
                                TextView textView3 = (TextView) b.a(view, i10);
                                if (textView3 != null) {
                                    i10 = C13317i.f113008e2;
                                    MaterialButton materialButton = (MaterialButton) b.a(view, i10);
                                    if (materialButton != null) {
                                        i10 = C13317i.f113013f2;
                                        Group group = (Group) b.a(view, i10);
                                        if (group != null) {
                                            return new C13444v((ConstraintLayout) view, textView, textView2, imageView, feedbackSmileRatingBar, textInputEditText, textInputLayout, textView3, materialButton, group);
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

    public static C13444v c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C13318j.f113153t, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f114729a;
    }
}
