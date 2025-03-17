package Qa;

import Ea.C9070d;
import Fa.C9081a;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C4987b;
import h3.b;

/* renamed from: Qa.f  reason: case insensitive filesystem */
public class C9239f extends C9234a<View> {

    /* renamed from: g  reason: collision with root package name */
    private final float f62888g;

    /* renamed from: h  reason: collision with root package name */
    private final float f62889h;

    /* renamed from: Qa.f$a */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationEnd(Animator animator) {
            C9239f.this.f62876b.setTranslationY(0.0f);
            C9239f.this.k(0.0f);
        }
    }

    public C9239f(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f62888g = resources.getDimension(C9070d.f59420l);
        this.f62889h = resources.getDimension(C9070d.f59422m);
    }

    private Animator g() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.f62876b, View.SCALE_X, new float[]{1.0f}), ObjectAnimator.ofFloat(this.f62876b, View.SCALE_Y, new float[]{1.0f})});
        V v10 = this.f62876b;
        if (v10 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v10;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(viewGroup.getChildAt(i10), View.SCALE_Y, new float[]{1.0f})});
            }
        }
        animatorSet.setInterpolator(new b());
        return animatorSet;
    }

    public void f() {
        if (super.b() != null) {
            Animator g10 = g();
            g10.setDuration((long) this.f62879e);
            g10.start();
        }
    }

    public void h(C4987b bVar, Animator.AnimatorListener animatorListener) {
        float height = ((float) this.f62876b.getHeight()) * this.f62876b.getScaleY();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f62876b, View.TRANSLATION_Y, new float[]{height});
        ofFloat.setInterpolator(new b());
        ofFloat.setDuration((long) C9081a.c(this.f62877c, this.f62878d, bVar.a()));
        ofFloat.addListener(new a());
        if (animatorListener != null) {
            ofFloat.addListener(animatorListener);
        }
        ofFloat.start();
    }

    public void i(C4987b bVar, Animator.AnimatorListener animatorListener) {
        Animator g10 = g();
        g10.setDuration((long) C9081a.c(this.f62877c, this.f62878d, bVar.a()));
        if (animatorListener != null) {
            g10.addListener(animatorListener);
        }
        g10.start();
    }

    public void j(C4987b bVar) {
        super.d(bVar);
    }

    public void k(float f10) {
        float a10 = a(f10);
        float width = (float) this.f62876b.getWidth();
        float height = (float) this.f62876b.getHeight();
        if (width > 0.0f && height > 0.0f) {
            float a11 = 1.0f - C9081a.a(0.0f, this.f62888g / width, a10);
            float a12 = 1.0f - C9081a.a(0.0f, this.f62889h / height, a10);
            this.f62876b.setScaleX(a11);
            this.f62876b.setPivotY(height);
            this.f62876b.setScaleY(a12);
            V v10 = this.f62876b;
            if (v10 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) v10;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    childAt.setPivotY((float) (-childAt.getTop()));
                    childAt.setScaleY(a12 != 0.0f ? a11 / a12 : 1.0f);
                }
            }
        }
    }

    public void l(C4987b bVar) {
        if (super.e(bVar) != null) {
            k(bVar.a());
        }
    }
}
