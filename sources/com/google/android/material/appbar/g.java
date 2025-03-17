package com.google.android.material.appbar;

import Ea.C9068b;
import Ea.C9073g;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.internal.s;

class g {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f65990a = {16843848};

    static void a(View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    static void b(View view, float f10) {
        int integer = view.getResources().getInteger(C9073g.f59509a);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j10 = (long) integer;
        stateListAnimator.addState(new int[]{16842910, C9068b.f59334g0, -C9068b.f59336h0}, ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(j10));
        stateListAnimator.addState(new int[]{16842910}, ObjectAnimator.ofFloat(view, "elevation", new float[]{f10}).setDuration(j10));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(0));
        view.setStateListAnimator(stateListAnimator);
    }

    static void c(View view, AttributeSet attributeSet, int i10, int i11) {
        Context context = view.getContext();
        TypedArray i12 = s.i(context, attributeSet, f65990a, i10, i11, new int[0]);
        try {
            if (i12.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, i12.getResourceId(0, 0)));
            }
        } finally {
            i12.recycle();
        }
    }
}
