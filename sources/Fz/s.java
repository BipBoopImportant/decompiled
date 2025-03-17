package Fz;

import Ez.c;
import Ez.d;
import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;

public final class s implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f110188a;

    /* renamed from: b  reason: collision with root package name */
    public final LottieAnimationView f110189b;

    /* renamed from: c  reason: collision with root package name */
    public final AppCompatTextView f110190c;

    /* renamed from: d  reason: collision with root package name */
    public final AppCompatTextView f110191d;

    private s(ConstraintLayout constraintLayout, LottieAnimationView lottieAnimationView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f110188a = constraintLayout;
        this.f110189b = lottieAnimationView;
        this.f110190c = appCompatTextView;
        this.f110191d = appCompatTextView2;
    }

    public static s a(View view) {
        int i10 = c.f109607s;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) b.a(view, i10);
        if (lottieAnimationView != null) {
            i10 = c.f109612t1;
            AppCompatTextView appCompatTextView = (AppCompatTextView) b.a(view, i10);
            if (appCompatTextView != null) {
                i10 = c.f109615u1;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) b.a(view, i10);
                if (appCompatTextView2 != null) {
                    return new s((ConstraintLayout) view, lottieAnimationView, appCompatTextView, appCompatTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static s c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(d.f109653u, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f110188a;
    }
}
