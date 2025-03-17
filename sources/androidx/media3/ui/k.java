package androidx.media3.ui;

import android.animation.ValueAnimator;

public final /* synthetic */ class k implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t f43339a;

    public /* synthetic */ k(t tVar) {
        this.f43339a = tVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f43339a.L(valueAnimator);
    }
}
