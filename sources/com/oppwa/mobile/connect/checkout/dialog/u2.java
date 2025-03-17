package com.oppwa.mobile.connect.checkout.dialog;

import android.animation.ValueAnimator;

public final /* synthetic */ class u2 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C14066f f121332a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ValueAnimator f121333b;

    public /* synthetic */ u2(C14066f fVar, ValueAnimator valueAnimator) {
        this.f121332a = fVar;
        this.f121333b = valueAnimator;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f121332a.a(this.f121333b, valueAnimator);
    }
}
