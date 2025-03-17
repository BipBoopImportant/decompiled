package com.google.android.material.timepicker;

import android.animation.ValueAnimator;

public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ClockHandView f67615a;

    public /* synthetic */ a(ClockHandView clockHandView) {
        this.f67615a = clockHandView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f67615a.l(valueAnimator);
    }
}
