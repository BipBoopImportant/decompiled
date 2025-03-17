package w4;

import android.animation.ValueAnimator;
import androidx.media3.ui.DefaultTimeBar;

/* renamed from: w4.d  reason: case insensitive filesystem */
public final /* synthetic */ class C8914d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DefaultTimeBar f57092a;

    public /* synthetic */ C8914d(DefaultTimeBar defaultTimeBar) {
        this.f57092a = defaultTimeBar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f57092a.l(valueAnimator);
    }
}
