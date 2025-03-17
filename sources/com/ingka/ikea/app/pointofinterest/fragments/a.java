package com.ingka.ikea.app.pointofinterest.fragments;

import android.animation.ValueAnimator;
import android.view.View;

public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f72074a;

    public /* synthetic */ a(View view) {
        this.f72074a = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        b.b(this.f72074a, valueAnimator);
    }
}
