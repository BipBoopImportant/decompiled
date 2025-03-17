package com.oppwa.mobile.connect.checkout.dialog;

import android.animation.ValueAnimator;
import android.view.ViewGroup;

public final /* synthetic */ class k2 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ValueAnimator f121267a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f121268b;

    public /* synthetic */ k2(ValueAnimator valueAnimator, ViewGroup viewGroup) {
        this.f121267a = valueAnimator;
        this.f121268b = viewGroup;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C14052b.a(this.f121267a, this.f121268b, valueAnimator);
    }
}
