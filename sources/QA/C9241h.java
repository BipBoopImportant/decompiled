package Qa;

import Ea.C9070d;
import Fa.C9081a;
import I2.C4600b0;
import I2.C4632s;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C4987b;
import h3.b;

/* renamed from: Qa.h  reason: case insensitive filesystem */
public class C9241h extends C9234a<View> {

    /* renamed from: g  reason: collision with root package name */
    private final float f62891g;

    /* renamed from: h  reason: collision with root package name */
    private final float f62892h;

    /* renamed from: i  reason: collision with root package name */
    private final float f62893i;

    /* renamed from: Qa.h$a */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f62894a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f62895b;

        a(boolean z10, int i10) {
            this.f62894a = z10;
            this.f62895b = i10;
        }

        public void onAnimationEnd(Animator animator) {
            C9241h.this.f62876b.setTranslationX(0.0f);
            C9241h.this.k(0.0f, this.f62894a, this.f62895b);
        }
    }

    public C9241h(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f62891g = resources.getDimension(C9070d.f59426o);
        this.f62892h = resources.getDimension(C9070d.f59424n);
        this.f62893i = resources.getDimension(C9070d.f59428p);
    }

    private boolean g(int i10, int i11) {
        return (C4632s.b(i10, C4600b0.z(this.f62876b)) & i11) == i11;
    }

    private int i(boolean z10) {
        ViewGroup.LayoutParams layoutParams = this.f62876b.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return z10 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
    }

    public void f() {
        if (super.b() != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.f62876b, View.SCALE_X, new float[]{1.0f}), ObjectAnimator.ofFloat(this.f62876b, View.SCALE_Y, new float[]{1.0f})});
            V v10 = this.f62876b;
            if (v10 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) v10;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(viewGroup.getChildAt(i10), View.SCALE_Y, new float[]{1.0f})});
                }
            }
            animatorSet.setDuration((long) this.f62879e);
            animatorSet.start();
        }
    }

    public void h(C4987b bVar, int i10, Animator.AnimatorListener animatorListener, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        boolean z10 = bVar.b() == 0;
        boolean g10 = g(i10, 3);
        float width = (((float) this.f62876b.getWidth()) * this.f62876b.getScaleX()) + ((float) i(g10));
        V v10 = this.f62876b;
        Property property = View.TRANSLATION_X;
        if (g10) {
            width = -width;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(v10, property, new float[]{width});
        if (animatorUpdateListener != null) {
            ofFloat.addUpdateListener(animatorUpdateListener);
        }
        ofFloat.setInterpolator(new b());
        ofFloat.setDuration((long) C9081a.c(this.f62877c, this.f62878d, bVar.a()));
        ofFloat.addListener(new a(z10, i10));
        if (animatorListener != null) {
            ofFloat.addListener(animatorListener);
        }
        ofFloat.start();
    }

    public void j(C4987b bVar) {
        super.d(bVar);
    }

    public void k(float f10, boolean z10, int i10) {
        float a10 = a(f10);
        boolean g10 = g(i10, 3);
        boolean z11 = z10 == g10;
        int width = this.f62876b.getWidth();
        int height = this.f62876b.getHeight();
        float f11 = (float) width;
        if (f11 > 0.0f) {
            float f12 = (float) height;
            if (f12 > 0.0f) {
                float f13 = this.f62891g / f11;
                float f14 = this.f62892h / f11;
                float f15 = this.f62893i / f12;
                V v10 = this.f62876b;
                if (g10) {
                    f11 = 0.0f;
                }
                v10.setPivotX(f11);
                if (!z11) {
                    f14 = -f13;
                }
                float a11 = C9081a.a(0.0f, f14, a10);
                float f16 = a11 + 1.0f;
                this.f62876b.setScaleX(f16);
                float a12 = 1.0f - C9081a.a(0.0f, f15, a10);
                this.f62876b.setScaleY(a12);
                V v11 = this.f62876b;
                if (v11 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) v11;
                    for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                        View childAt = viewGroup.getChildAt(i11);
                        childAt.setPivotX((float) (g10 ? (width - childAt.getRight()) + childAt.getWidth() : -childAt.getLeft()));
                        childAt.setPivotY((float) (-childAt.getTop()));
                        float f17 = z11 ? 1.0f - a11 : 1.0f;
                        float f18 = a12 != 0.0f ? (f16 / a12) * f17 : 1.0f;
                        childAt.setScaleX(f17);
                        childAt.setScaleY(f18);
                    }
                }
            }
        }
    }

    public void l(C4987b bVar, int i10) {
        if (super.e(bVar) != null) {
            k(bVar.a(), bVar.b() == 0, i10);
        }
    }
}
