package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.view.View;
import androidx.transition.C7026l;

class A {
    static Animator a(View view, y yVar, int i10, int i11, float f10, float f11, float f12, float f13, TimeInterpolator timeInterpolator, C7026l lVar) {
        float f14;
        float f15;
        View view2 = view;
        y yVar2 = yVar;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) yVar2.f44775b.getTag(C7021g.f44674e);
        if (iArr != null) {
            f14 = ((float) (iArr[0] - i10)) + translationX;
            f15 = ((float) (iArr[1] - i11)) + translationY;
        } else {
            f14 = f10;
            f15 = f11;
        }
        view.setTranslationX(f14);
        view.setTranslationY(f15);
        if (f14 == f12 && f15 == f13) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{f14, f12}), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{f15, f13})});
        a aVar = new a(view, yVar2.f44775b, translationX, translationY);
        lVar.c(aVar);
        ofPropertyValuesHolder.addListener(aVar);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }

    private static class a extends AnimatorListenerAdapter implements C7026l.h {

        /* renamed from: a  reason: collision with root package name */
        private final View f44574a;

        /* renamed from: b  reason: collision with root package name */
        private final View f44575b;

        /* renamed from: c  reason: collision with root package name */
        private int[] f44576c;

        /* renamed from: d  reason: collision with root package name */
        private float f44577d;

        /* renamed from: e  reason: collision with root package name */
        private float f44578e;

        /* renamed from: f  reason: collision with root package name */
        private final float f44579f;

        /* renamed from: g  reason: collision with root package name */
        private final float f44580g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f44581h;

        a(View view, View view2, float f10, float f11) {
            this.f44575b = view;
            this.f44574a = view2;
            this.f44579f = f10;
            this.f44580g = f11;
            int[] iArr = (int[]) view2.getTag(C7021g.f44674e);
            this.f44576c = iArr;
            if (iArr != null) {
                view2.setTag(C7021g.f44674e, (Object) null);
            }
        }

        private void a() {
            if (this.f44576c == null) {
                this.f44576c = new int[2];
            }
            this.f44575b.getLocationOnScreen(this.f44576c);
            this.f44574a.setTag(C7021g.f44674e, this.f44576c);
        }

        public void d(C7026l lVar) {
            this.f44575b.setTranslationX(this.f44577d);
            this.f44575b.setTranslationY(this.f44578e);
        }

        public void e(C7026l lVar) {
        }

        public void g(C7026l lVar) {
            a();
            this.f44577d = this.f44575b.getTranslationX();
            this.f44578e = this.f44575b.getTranslationY();
            this.f44575b.setTranslationX(this.f44579f);
            this.f44575b.setTranslationY(this.f44580g);
        }

        public void i(C7026l lVar, boolean z10) {
            if (!this.f44581h) {
                this.f44574a.setTag(C7021g.f44674e, (Object) null);
            }
        }

        public void j(C7026l lVar) {
            i(lVar, false);
        }

        public void l(C7026l lVar) {
            this.f44581h = true;
            this.f44575b.setTranslationX(this.f44579f);
            this.f44575b.setTranslationY(this.f44580g);
        }

        public void onAnimationCancel(Animator animator) {
            this.f44581h = true;
            this.f44575b.setTranslationX(this.f44579f);
            this.f44575b.setTranslationY(this.f44580g);
        }

        public void onAnimationEnd(Animator animator, boolean z10) {
            if (!z10) {
                this.f44575b.setTranslationX(this.f44579f);
                this.f44575b.setTranslationY(this.f44580g);
            }
        }

        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }
    }
}
