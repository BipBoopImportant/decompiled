package Fz;

import Ez.c;
import X4.a;
import X4.b;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.button.MaterialButton;

public final class u implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f110199a;

    /* renamed from: b  reason: collision with root package name */
    public final MaterialButton f110200b;

    /* renamed from: c  reason: collision with root package name */
    public final MaterialButton f110201c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f110202d;

    /* renamed from: e  reason: collision with root package name */
    public final LottieAnimationView f110203e;

    /* renamed from: f  reason: collision with root package name */
    public final LottieAnimationView f110204f;

    /* renamed from: g  reason: collision with root package name */
    public final Guideline f110205g;

    /* renamed from: h  reason: collision with root package name */
    public final MaterialButton f110206h;

    /* renamed from: i  reason: collision with root package name */
    public final ImageButton f110207i;

    /* renamed from: j  reason: collision with root package name */
    public final ImageButton f110208j;

    /* renamed from: k  reason: collision with root package name */
    public final TextView f110209k;

    /* renamed from: l  reason: collision with root package name */
    public final ConstraintLayout f110210l;

    private u(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, TextView textView, LottieAnimationView lottieAnimationView, LottieAnimationView lottieAnimationView2, Guideline guideline, MaterialButton materialButton3, ImageButton imageButton, ImageButton imageButton2, TextView textView2, ConstraintLayout constraintLayout2) {
        this.f110199a = constraintLayout;
        this.f110200b = materialButton;
        this.f110201c = materialButton2;
        this.f110202d = textView;
        this.f110203e = lottieAnimationView;
        this.f110204f = lottieAnimationView2;
        this.f110205g = guideline;
        this.f110206h = materialButton3;
        this.f110207i = imageButton;
        this.f110208j = imageButton2;
        this.f110209k = textView2;
        this.f110210l = constraintLayout2;
    }

    public static u a(View view) {
        int i10 = c.f109553a;
        MaterialButton materialButton = (MaterialButton) b.a(view, i10);
        if (materialButton != null) {
            i10 = c.f109559c;
            MaterialButton materialButton2 = (MaterialButton) b.a(view, i10);
            if (materialButton2 != null) {
                i10 = c.f109580j;
                TextView textView = (TextView) b.a(view, i10);
                if (textView != null) {
                    i10 = c.f109607s;
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) b.a(view, i10);
                    if (lottieAnimationView != null) {
                        i10 = c.f109610t;
                        LottieAnimationView lottieAnimationView2 = (LottieAnimationView) b.a(view, i10);
                        if (lottieAnimationView2 != null) {
                            i10 = c.f109511F;
                            Guideline guideline = (Guideline) b.a(view, i10);
                            if (guideline != null) {
                                i10 = c.f109521K;
                                MaterialButton materialButton3 = (MaterialButton) b.a(view, i10);
                                if (materialButton3 != null) {
                                    i10 = c.f109510E0;
                                    ImageButton imageButton = (ImageButton) b.a(view, i10);
                                    if (imageButton != null) {
                                        i10 = c.f109520J0;
                                        ImageButton imageButton2 = (ImageButton) b.a(view, i10);
                                        if (imageButton2 != null) {
                                            i10 = c.f109550Y0;
                                            TextView textView2 = (TextView) b.a(view, i10);
                                            if (textView2 != null) {
                                                i10 = c.f109561c1;
                                                ConstraintLayout constraintLayout = (ConstraintLayout) b.a(view, i10);
                                                if (constraintLayout != null) {
                                                    return new u((ConstraintLayout) view, materialButton, materialButton2, textView, lottieAnimationView, lottieAnimationView2, guideline, materialButton3, imageButton, imageButton2, textView2, constraintLayout);
                                                }
                                            }
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

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f110199a;
    }
}
