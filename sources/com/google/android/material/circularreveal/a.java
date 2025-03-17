package com.google.android.material.circularreveal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewAnimationUtils;
import com.google.android.material.circularreveal.c;

public final class a {

    /* renamed from: com.google.android.material.circularreveal.a$a  reason: collision with other inner class name */
    class C1163a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f66477a;

        C1163a(c cVar) {
            this.f66477a = cVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f66477a.b();
        }

        public void onAnimationStart(Animator animator) {
            this.f66477a.a();
        }
    }

    public static Animator a(c cVar, float f10, float f11, float f12) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(cVar, c.C1164c.f66481a, c.b.f66479b, new c.e[]{new c.e(f10, f11, f12)});
        c.e revealInfo = cVar.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) cVar, (int) f10, (int) f11, revealInfo.f66485c, f12);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofObject, createCircularReveal});
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }

    public static Animator.AnimatorListener b(c cVar) {
        return new C1163a(cVar);
    }
}
