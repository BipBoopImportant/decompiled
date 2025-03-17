package com.google.android.material.navigation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final int f67056a = Color.alpha(-1728053248);

    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DrawerLayout f67057a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f67058b;

        a(DrawerLayout drawerLayout, View view) {
            this.f67057a = drawerLayout;
            this.f67058b = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f67057a.e(this.f67058b, false);
            this.f67057a.setScrimColor(-1728053248);
        }
    }

    public static Animator.AnimatorListener b(DrawerLayout drawerLayout, View view) {
        return new a(drawerLayout, view);
    }

    public static ValueAnimator.AnimatorUpdateListener c(DrawerLayout drawerLayout) {
        return new a(drawerLayout);
    }
}
