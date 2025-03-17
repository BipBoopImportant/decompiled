package androidx.media3.ui;

import android.animation.ValueAnimator;

public final /* synthetic */ class s implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t f43347a;

    public /* synthetic */ s(t tVar) {
        this.f43347a = tVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f43347a.J(valueAnimator);
    }
}
