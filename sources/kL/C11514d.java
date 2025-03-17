package kl;

import android.animation.ValueAnimator;
import com.ingka.ikea.app.uicomponents.view.progress.FullScreenProgressView;

/* renamed from: kl.d  reason: case insensitive filesystem */
public final /* synthetic */ class C11514d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FullScreenProgressView f98969a;

    public /* synthetic */ C11514d(FullScreenProgressView fullScreenProgressView) {
        this.f98969a = fullScreenProgressView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        FullScreenProgressView.z(this.f98969a, valueAnimator);
    }
}
