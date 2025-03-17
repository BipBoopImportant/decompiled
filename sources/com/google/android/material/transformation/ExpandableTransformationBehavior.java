package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

@Deprecated
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public AnimatorSet f67631b;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationEnd(Animator animator) {
            AnimatorSet unused = ExpandableTransformationBehavior.this.f67631b = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    /* access modifiers changed from: protected */
    public boolean L(View view, View view2, boolean z10, boolean z11) {
        AnimatorSet animatorSet = this.f67631b;
        boolean z12 = animatorSet != null;
        if (z12) {
            animatorSet.cancel();
        }
        AnimatorSet N10 = N(view, view2, z10, z12);
        this.f67631b = N10;
        N10.addListener(new a());
        this.f67631b.start();
        if (!z11) {
            this.f67631b.end();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract AnimatorSet N(View view, View view2, boolean z10, boolean z11);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
