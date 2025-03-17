package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<b> f66992a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private b f66993b = null;

    /* renamed from: c  reason: collision with root package name */
    ValueAnimator f66994c = null;

    /* renamed from: d  reason: collision with root package name */
    private final Animator.AnimatorListener f66995d = new a();

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationEnd(Animator animator) {
            n nVar = n.this;
            if (nVar.f66994c == animator) {
                nVar.f66994c = null;
            }
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        final int[] f66997a;

        /* renamed from: b  reason: collision with root package name */
        final ValueAnimator f66998b;

        b(int[] iArr, ValueAnimator valueAnimator) {
            this.f66997a = iArr;
            this.f66998b = valueAnimator;
        }
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f66995d);
        this.f66992a.add(bVar);
    }
}
