package com.google.android.material.floatingactionbutton;

import Ea.C9069c;
import H2.i;
import Sa.C9270b;
import Ta.C9272b;
import Ua.C9286g;
import Ua.k;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import java.util.ArrayList;
import u2.C6012a;

class c extends b {

    /* renamed from: O  reason: collision with root package name */
    private StateListAnimator f66799O;

    static class a extends C9286g {
        a(k kVar) {
            super(kVar);
        }

        public boolean isStateful() {
            return true;
        }
    }

    c(FloatingActionButton floatingActionButton, C9272b bVar) {
        super(floatingActionButton, bVar);
    }

    private StateListAnimator j0(float f10, float f11, float f12) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(b.f66736I, k0(f10, f12));
        stateListAnimator.addState(b.f66737J, k0(f10, f11));
        stateListAnimator.addState(b.f66738K, k0(f10, f11));
        stateListAnimator.addState(b.f66739L, k0(f10, f11));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f66767w, "elevation", new float[]{f10}).setDuration(0));
        arrayList.add(ObjectAnimator.ofFloat(this.f66767w, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(b.f66731D);
        stateListAnimator.addState(b.f66740M, animatorSet);
        stateListAnimator.addState(b.f66741N, k0(0.0f, 0.0f));
        return stateListAnimator;
    }

    private Animator k0(float f10, float f11) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f66767w, "elevation", new float[]{f10}).setDuration(0)).with(ObjectAnimator.ofFloat(this.f66767w, View.TRANSLATION_Z, new float[]{f11}).setDuration(100));
        animatorSet.setInterpolator(b.f66731D);
        return animatorSet;
    }

    /* access modifiers changed from: package-private */
    public void A() {
    }

    /* access modifiers changed from: package-private */
    public void C() {
        f0();
    }

    /* access modifiers changed from: package-private */
    public void E(int[] iArr) {
    }

    /* access modifiers changed from: package-private */
    public void F(float f10, float f11, float f12) {
        if (this.f66767w.getStateListAnimator() == this.f66799O) {
            StateListAnimator j02 = j0(f10, f11, f12);
            this.f66799O = j02;
            this.f66767w.setStateListAnimator(j02);
        }
        if (Z()) {
            f0();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean K() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public void V(ColorStateList colorStateList) {
        Drawable drawable = this.f66747c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(C9270b.d(colorStateList));
        } else {
            super.V(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean Z() {
        return this.f66768x.d() || !b0();
    }

    /* access modifiers changed from: package-private */
    public void d0() {
    }

    /* access modifiers changed from: package-private */
    public a i0(int i10, ColorStateList colorStateList) {
        Context context = this.f66767w.getContext();
        a aVar = new a((k) i.g(this.f66745a));
        aVar.e(C6012a.c(context, C9069c.f59366e), C6012a.c(context, C9069c.f59365d), C6012a.c(context, C9069c.f59363b), C6012a.c(context, C9069c.f59364c));
        aVar.d((float) i10);
        aVar.c(colorStateList);
        return aVar;
    }

    /* access modifiers changed from: package-private */
    public C9286g l0() {
        return new a((k) i.g(this.f66745a));
    }

    public float m() {
        return this.f66767w.getElevation();
    }

    /* access modifiers changed from: package-private */
    public void r(Rect rect) {
        if (this.f66768x.d()) {
            super.r(rect);
        } else if (!b0()) {
            int sizeDimension = (this.f66755k - this.f66767w.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    /* access modifiers changed from: package-private */
    public void x(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i10) {
        Drawable drawable;
        C9286g l02 = l0();
        this.f66746b = l02;
        l02.setTintList(colorStateList);
        if (mode != null) {
            this.f66746b.setTintMode(mode);
        }
        this.f66746b.Q(this.f66767w.getContext());
        if (i10 > 0) {
            this.f66748d = i0(i10, colorStateList);
            drawable = new LayerDrawable(new Drawable[]{(Drawable) i.g(this.f66748d), (Drawable) i.g(this.f66746b)});
        } else {
            this.f66748d = null;
            drawable = this.f66746b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(C9270b.d(colorStateList2), drawable, (Drawable) null);
        this.f66747c = rippleDrawable;
        this.f66749e = rippleDrawable;
    }
}
