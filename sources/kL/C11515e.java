package kl;

import android.animation.ValueAnimator;
import com.ingka.ikea.app.uicomponents.view.progress.HorizontalProgressView;

/* renamed from: kl.e  reason: case insensitive filesystem */
public final /* synthetic */ class C11515e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HorizontalProgressView f98970a;

    public /* synthetic */ C11515e(HorizontalProgressView horizontalProgressView) {
        this.f98970a = horizontalProgressView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        HorizontalProgressView.f(this.f98970a, valueAnimator);
    }
}
