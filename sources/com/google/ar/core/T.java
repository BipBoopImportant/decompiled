package com.google.ar.core;

import android.animation.ValueAnimator;

final class T implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f67725a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f67726b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f67727c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ InstallActivity f67728d;

    T(InstallActivity installActivity, int i10, int i11, int i12) {
        this.f67725a = i10;
        this.f67726b = i11;
        this.f67727c = i12;
        this.f67728d = installActivity;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = 1.0f - valueAnimator.getAnimatedFraction();
        float animatedFraction2 = valueAnimator.getAnimatedFraction();
        float f10 = ((float) this.f67726b) * animatedFraction2;
        float f11 = ((float) this.f67726b) * animatedFraction2;
        this.f67728d.getWindow().setLayout((int) ((((float) this.f67725a) * animatedFraction) + f10), (int) ((((float) this.f67727c) * animatedFraction) + f11));
        this.f67728d.getWindow().getDecorView().refreshDrawableState();
    }
}
