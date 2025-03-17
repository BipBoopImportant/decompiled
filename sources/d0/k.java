package d0;

import android.animation.ValueAnimator;
import androidx.camera.view.ScreenFlashView;

public final /* synthetic */ class k implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ScreenFlashView f23103a;

    public /* synthetic */ k(ScreenFlashView screenFlashView) {
        this.f23103a = screenFlashView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f23103a.f(valueAnimator);
    }
}
