package lf;

import android.animation.ValueAnimator;
import lf.C10021d;

/* renamed from: lf.b  reason: case insensitive filesystem */
public final /* synthetic */ class C10019b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C10021d.a f75231a;

    public /* synthetic */ C10019b(C10021d.a aVar) {
        this.f75231a = aVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C10021d.a.q(this.f75231a, valueAnimator);
    }
}
