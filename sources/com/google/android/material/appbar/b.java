package com.google.android.material.appbar;

import Ua.C9286g;
import android.animation.ValueAnimator;

public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f65964a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C9286g f65965b;

    public /* synthetic */ b(AppBarLayout appBarLayout, C9286g gVar) {
        this.f65964a = appBarLayout;
        this.f65965b = gVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f65964a.r(this.f65965b, valueAnimator);
    }
}
