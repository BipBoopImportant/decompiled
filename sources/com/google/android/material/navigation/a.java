package com.google.android.material.navigation;

import Fa.C9081a;
import android.animation.ValueAnimator;
import androidx.drawerlayout.widget.DrawerLayout;
import x2.C6244c;

public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DrawerLayout f67055a;

    public /* synthetic */ a(DrawerLayout drawerLayout) {
        this.f67055a = drawerLayout;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f67055a.setScrimColor(C6244c.p(-1728053248, C9081a.c(b.f67056a, 0, valueAnimator.getAnimatedFraction())));
    }
}
