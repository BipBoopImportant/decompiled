package com.oppwa.mobile.connect.checkout.dialog;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.oppwa.mobile.connect.R;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.b  reason: case insensitive filesystem */
class C14052b {
    static void a(ViewGroup viewGroup, int i10, int i11) {
        if (i10 != i11) {
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i10, i11});
            ofInt.addUpdateListener(new k2(ofInt, viewGroup));
            ofInt.setDuration(200);
            ofInt.start();
        }
    }

    static void b(Context context, View view) {
        view.startAnimation(a(context, R.anim.opp_show_view));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(ValueAnimator valueAnimator, ViewGroup viewGroup, ValueAnimator valueAnimator2) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        layoutParams.height = intValue;
        viewGroup.setLayoutParams(layoutParams);
    }

    static void a(Context context, View view) {
        view.startAnimation(a(context, R.anim.opp_hide_view));
    }

    private static Animation a(Context context, int i10) {
        Animation loadAnimation = AnimationUtils.loadAnimation(context, i10);
        loadAnimation.setDuration(200);
        return loadAnimation;
    }
}
