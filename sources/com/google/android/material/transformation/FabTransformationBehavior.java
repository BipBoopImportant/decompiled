package com.google.android.material.transformation;

import Ea.C9072f;
import Fa.C9081a;
import Fa.C9082b;
import Fa.C9083c;
import Fa.C9084d;
import Fa.C9085e;
import Fa.C9088h;
import Fa.C9089i;
import Fa.C9090j;
import I2.C4600b0;
import Pa.C9233a;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.circularreveal.c;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;

@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c  reason: collision with root package name */
    private final Rect f67633c = new Rect();

    /* renamed from: d  reason: collision with root package name */
    private final RectF f67634d = new RectF();

    /* renamed from: e  reason: collision with root package name */
    private final RectF f67635e = new RectF();

    /* renamed from: f  reason: collision with root package name */
    private final int[] f67636f = new int[2];

    /* renamed from: g  reason: collision with root package name */
    private float f67637g;

    /* renamed from: h  reason: collision with root package name */
    private float f67638h;

    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f67639a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f67640b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f67641c;

        a(boolean z10, View view, View view2) {
            this.f67639a = z10;
            this.f67640b = view;
            this.f67641c = view2;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f67639a) {
                this.f67640b.setVisibility(4);
                this.f67641c.setAlpha(1.0f);
                this.f67641c.setVisibility(0);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.f67639a) {
                this.f67640b.setVisibility(0);
                this.f67641c.setAlpha(0.0f);
                this.f67641c.setVisibility(4);
            }
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f67643a;

        b(View view) {
            this.f67643a = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f67643a.invalidate();
        }
    }

    class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.google.android.material.circularreveal.c f67645a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Drawable f67646b;

        c(com.google.android.material.circularreveal.c cVar, Drawable drawable) {
            this.f67645a = cVar;
            this.f67646b = drawable;
        }

        public void onAnimationEnd(Animator animator) {
            this.f67645a.setCircularRevealOverlayDrawable((Drawable) null);
        }

        public void onAnimationStart(Animator animator) {
            this.f67645a.setCircularRevealOverlayDrawable(this.f67646b);
        }
    }

    class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.google.android.material.circularreveal.c f67648a;

        d(com.google.android.material.circularreveal.c cVar) {
            this.f67648a = cVar;
        }

        public void onAnimationEnd(Animator animator) {
            c.e revealInfo = this.f67648a.getRevealInfo();
            revealInfo.f66485c = Float.MAX_VALUE;
            this.f67648a.setRevealInfo(revealInfo);
        }
    }

    protected static class e {

        /* renamed from: a  reason: collision with root package name */
        public C9088h f67650a;

        /* renamed from: b  reason: collision with root package name */
        public C9090j f67651b;

        protected e() {
        }
    }

    public FabTransformationBehavior() {
    }

    private ViewGroup O(View view) {
        View findViewById = view.findViewById(C9072f.f59463F);
        return findViewById != null ? j0(findViewById) : ((view instanceof TransformationChildLayout) || (view instanceof TransformationChildCard)) ? j0(((ViewGroup) view).getChildAt(0)) : j0(view);
    }

    private void P(View view, e eVar, C9089i iVar, C9089i iVar2, float f10, float f11, float f12, float f13, RectF rectF) {
        float W10 = W(eVar, iVar, f10, f12);
        float W11 = W(eVar, iVar2, f11, f13);
        Rect rect = this.f67633c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f67634d;
        rectF2.set(rect);
        RectF rectF3 = this.f67635e;
        X(view, rectF3);
        rectF3.offset(W10, W11);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    private void Q(View view, RectF rectF) {
        X(view, rectF);
        rectF.offset(this.f67637g, this.f67638h);
    }

    private Pair<C9089i, C9089i> R(float f10, float f11, boolean z10, e eVar) {
        C9089i iVar;
        C9089i iVar2;
        int i10;
        if (f10 == 0.0f || f11 == 0.0f) {
            iVar2 = eVar.f67650a.e("translationXLinear");
            iVar = eVar.f67650a.e("translationYLinear");
        } else if ((!z10 || f11 >= 0.0f) && (z10 || i10 <= 0)) {
            iVar2 = eVar.f67650a.e("translationXCurveDownwards");
            iVar = eVar.f67650a.e("translationYCurveDownwards");
        } else {
            iVar2 = eVar.f67650a.e("translationXCurveUpwards");
            iVar = eVar.f67650a.e("translationYCurveUpwards");
        }
        return new Pair<>(iVar2, iVar);
    }

    private float S(View view, View view2, C9090j jVar) {
        RectF rectF = this.f67634d;
        RectF rectF2 = this.f67635e;
        Q(view, rectF);
        X(view2, rectF2);
        rectF2.offset(-U(view, view2, jVar), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    private float T(View view, View view2, C9090j jVar) {
        RectF rectF = this.f67634d;
        RectF rectF2 = this.f67635e;
        Q(view, rectF);
        X(view2, rectF2);
        rectF2.offset(0.0f, -V(view, view2, jVar));
        return rectF.centerY() - rectF2.top;
    }

    private float U(View view, View view2, C9090j jVar) {
        float f10;
        float centerX;
        float centerX2;
        RectF rectF = this.f67634d;
        RectF rectF2 = this.f67635e;
        Q(view, rectF);
        X(view2, rectF2);
        int i10 = jVar.f60391a & 7;
        if (i10 == 1) {
            centerX = rectF2.centerX();
            centerX2 = rectF.centerX();
        } else if (i10 == 3) {
            centerX = rectF2.left;
            centerX2 = rectF.left;
        } else if (i10 != 5) {
            f10 = 0.0f;
            return f10 + jVar.f60392b;
        } else {
            centerX = rectF2.right;
            centerX2 = rectF.right;
        }
        f10 = centerX - centerX2;
        return f10 + jVar.f60392b;
    }

    private float V(View view, View view2, C9090j jVar) {
        float f10;
        float centerY;
        float centerY2;
        RectF rectF = this.f67634d;
        RectF rectF2 = this.f67635e;
        Q(view, rectF);
        X(view2, rectF2);
        int i10 = jVar.f60391a & 112;
        if (i10 == 16) {
            centerY = rectF2.centerY();
            centerY2 = rectF.centerY();
        } else if (i10 == 48) {
            centerY = rectF2.top;
            centerY2 = rectF.top;
        } else if (i10 != 80) {
            f10 = 0.0f;
            return f10 + jVar.f60393c;
        } else {
            centerY = rectF2.bottom;
            centerY2 = rectF.bottom;
        }
        f10 = centerY - centerY2;
        return f10 + jVar.f60393c;
    }

    private float W(e eVar, C9089i iVar, float f10, float f11) {
        long c10 = iVar.c();
        long d10 = iVar.d();
        C9089i e10 = eVar.f67650a.e("expansion");
        return C9081a.a(f10, f11, iVar.e().getInterpolation(((float) (((e10.c() + e10.d()) + 17) - c10)) / ((float) d10)));
    }

    private void X(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.f67636f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    private void Y(View view, View view2, boolean z10, boolean z11, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup O10;
        ObjectAnimator objectAnimator;
        if (view2 instanceof ViewGroup) {
            if ((!(view2 instanceof com.google.android.material.circularreveal.c) || com.google.android.material.circularreveal.b.f66478a != 0) && (O10 = O(view2)) != null) {
                if (z10) {
                    if (!z11) {
                        C9084d.f60377a.set(O10, Float.valueOf(0.0f));
                    }
                    objectAnimator = ObjectAnimator.ofFloat(O10, C9084d.f60377a, new float[]{1.0f});
                } else {
                    objectAnimator = ObjectAnimator.ofFloat(O10, C9084d.f60377a, new float[]{0.0f});
                }
                eVar.f67650a.e("contentFade").a(objectAnimator);
                list.add(objectAnimator);
            }
        }
    }

    private void Z(View view, View view2, boolean z10, boolean z11, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if (view2 instanceof com.google.android.material.circularreveal.c) {
            com.google.android.material.circularreveal.c cVar = (com.google.android.material.circularreveal.c) view2;
            int h02 = h0(view);
            int i10 = 16777215 & h02;
            if (z10) {
                if (!z11) {
                    cVar.setCircularRevealScrimColor(h02);
                }
                objectAnimator = ObjectAnimator.ofInt(cVar, c.d.f66482a, new int[]{i10});
            } else {
                objectAnimator = ObjectAnimator.ofInt(cVar, c.d.f66482a, new int[]{h02});
            }
            objectAnimator.setEvaluator(C9083c.b());
            eVar.f67650a.e("color").a(objectAnimator);
            list.add(objectAnimator);
        }
    }

    private void a0(View view, View view2, boolean z10, e eVar, List<Animator> list) {
        float U10 = U(view, view2, eVar.f67651b);
        float V10 = V(view, view2, eVar.f67651b);
        Pair<C9089i, C9089i> R10 = R(U10, V10, z10, eVar);
        C9089i iVar = (C9089i) R10.first;
        C9089i iVar2 = (C9089i) R10.second;
        Property property = View.TRANSLATION_X;
        if (!z10) {
            U10 = this.f67637g;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, new float[]{U10});
        Property property2 = View.TRANSLATION_Y;
        if (!z10) {
            V10 = this.f67638h;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, property2, new float[]{V10});
        iVar.a(ofFloat);
        iVar2.a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    @TargetApi(21)
    private void b0(View view, View view2, boolean z10, boolean z11, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        float u10 = C4600b0.u(view2) - C4600b0.u(view);
        if (z10) {
            if (!z11) {
                view2.setTranslationZ(-u10);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{0.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{-u10});
        }
        eVar.f67650a.e("elevation").a(objectAnimator);
        list.add(objectAnimator);
    }

    private void c0(View view, View view2, boolean z10, boolean z11, e eVar, float f10, float f11, List<Animator> list, List<Animator.AnimatorListener> list2) {
        Animator animator;
        View view3 = view;
        View view4 = view2;
        e eVar2 = eVar;
        if (view4 instanceof com.google.android.material.circularreveal.c) {
            com.google.android.material.circularreveal.c cVar = (com.google.android.material.circularreveal.c) view4;
            float S10 = S(view3, view4, eVar2.f67651b);
            float T10 = T(view3, view4, eVar2.f67651b);
            ((FloatingActionButton) view3).i(this.f67633c);
            float width = ((float) this.f67633c.width()) / 2.0f;
            C9089i e10 = eVar2.f67650a.e("expansion");
            if (z10) {
                if (!z11) {
                    cVar.setRevealInfo(new c.e(S10, T10, width));
                }
                if (z11) {
                    width = cVar.getRevealInfo().f66485c;
                }
                animator = com.google.android.material.circularreveal.a.a(cVar, S10, T10, C9233a.b(S10, T10, 0.0f, 0.0f, f10, f11));
                animator.addListener(new d(cVar));
                f0(view2, e10.c(), (int) S10, (int) T10, width, list);
            } else {
                float f12 = cVar.getRevealInfo().f66485c;
                Animator a10 = com.google.android.material.circularreveal.a.a(cVar, S10, T10, width);
                int i10 = (int) S10;
                int i11 = (int) T10;
                View view5 = view2;
                f0(view5, e10.c(), i10, i11, f12, list);
                long c10 = e10.c();
                long d10 = e10.d();
                long f13 = eVar2.f67650a.f();
                e0(view5, c10, d10, f13, i10, i11, width, list);
                animator = a10;
            }
            e10.a(animator);
            list.add(animator);
            list2.add(com.google.android.material.circularreveal.a.b(cVar));
        }
    }

    private void d0(View view, View view2, boolean z10, boolean z11, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if ((view2 instanceof com.google.android.material.circularreveal.c) && (view instanceof ImageView)) {
            com.google.android.material.circularreveal.c cVar = (com.google.android.material.circularreveal.c) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z10) {
                    if (!z11) {
                        drawable.setAlpha(255);
                    }
                    objectAnimator = ObjectAnimator.ofInt(drawable, C9085e.f60378b, new int[]{0});
                } else {
                    objectAnimator = ObjectAnimator.ofInt(drawable, C9085e.f60378b, new int[]{255});
                }
                objectAnimator.addUpdateListener(new b(view2));
                eVar.f67650a.e("iconFade").a(objectAnimator);
                list.add(objectAnimator);
                list2.add(new c(cVar, drawable));
            }
        }
    }

    private void e0(View view, long j10, long j11, long j12, int i10, int i11, float f10, List<Animator> list) {
        long j13 = j10 + j11;
        if (j13 < j12) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i10, i11, f10, f10);
            createCircularReveal.setStartDelay(j13);
            createCircularReveal.setDuration(j12 - j13);
            list.add(createCircularReveal);
        }
    }

    private void f0(View view, long j10, int i10, int i11, float f10, List<Animator> list) {
        if (j10 > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i10, i11, f10, f10);
            createCircularReveal.setStartDelay(0);
            createCircularReveal.setDuration(j10);
            list.add(createCircularReveal);
        }
    }

    private void g0(View view, View view2, boolean z10, boolean z11, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2, RectF rectF) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        View view3 = view;
        View view4 = view2;
        boolean z12 = z10;
        e eVar2 = eVar;
        List<Animator> list3 = list;
        float U10 = U(view3, view4, eVar2.f67651b);
        float V10 = V(view3, view4, eVar2.f67651b);
        Pair<C9089i, C9089i> R10 = R(U10, V10, z12, eVar2);
        C9089i iVar = (C9089i) R10.first;
        C9089i iVar2 = (C9089i) R10.second;
        if (z12) {
            if (!z11) {
                view4.setTranslationX(-U10);
                view4.setTranslationY(-V10);
            }
            objectAnimator2 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, new float[]{0.0f});
            objectAnimator = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, new float[]{0.0f});
            P(view2, eVar, iVar, iVar2, -U10, -V10, 0.0f, 0.0f, rectF);
        } else {
            objectAnimator2 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, new float[]{-U10});
            objectAnimator = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, new float[]{-V10});
        }
        iVar.a(objectAnimator2);
        iVar2.a(objectAnimator);
        list3.add(objectAnimator2);
        list3.add(objectAnimator);
    }

    private int h0(View view) {
        ColorStateList r10 = C4600b0.r(view);
        if (r10 != null) {
            return r10.getColorForState(view.getDrawableState(), r10.getDefaultColor());
        }
        return 0;
    }

    private ViewGroup j0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public AnimatorSet N(View view, View view2, boolean z10, boolean z11) {
        boolean z12 = z10;
        e i02 = i0(view2.getContext(), z12);
        if (z12) {
            this.f67637g = view.getTranslationX();
            this.f67638h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        b0(view, view2, z10, z11, i02, arrayList, arrayList2);
        RectF rectF = this.f67634d;
        View view3 = view;
        View view4 = view2;
        boolean z13 = z10;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        g0(view3, view4, z13, z11, i02, arrayList3, arrayList4, rectF);
        float width = rectF.width();
        float height = rectF.height();
        a0(view3, view4, z13, i02, arrayList);
        boolean z14 = z11;
        e eVar = i02;
        d0(view3, view4, z13, z14, eVar, arrayList3, arrayList4);
        c0(view3, view4, z13, z14, eVar, width, height, arrayList, arrayList2);
        ArrayList arrayList5 = arrayList;
        ArrayList arrayList6 = arrayList2;
        Z(view3, view4, z13, z14, eVar, arrayList5, arrayList6);
        Y(view3, view4, z13, z14, eVar, arrayList5, arrayList6);
        AnimatorSet animatorSet = new AnimatorSet();
        C9082b.a(animatorSet, arrayList);
        animatorSet.addListener(new a(z12, view2, view));
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i10));
        }
        return animatorSet;
    }

    public boolean i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
        }
    }

    /* access modifiers changed from: protected */
    public abstract e i0(Context context, boolean z10);

    public void k(CoordinatorLayout.f fVar) {
        if (fVar.f20925h == 0) {
            fVar.f20925h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
