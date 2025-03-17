package com.google.android.material.bottomappbar;

import Ea.C9067a;
import Ea.C9068b;
import Ea.C9070d;
import Ea.C9077k;
import Fa.C9081a;
import Fa.C9091k;
import I2.C4600b0;
import Qa.C9242i;
import Ua.C9286g;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.v;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import y2.C6260a;

public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {

    /* renamed from: T0  reason: collision with root package name */
    private static final int f66022T0 = C9077k.f59611u;

    /* renamed from: U0  reason: collision with root package name */
    private static final int f66023U0 = C9068b.f59302H;

    /* renamed from: V0  reason: collision with root package name */
    private static final int f66024V0 = C9068b.f59312R;
    /* access modifiers changed from: private */

    /* renamed from: A0  reason: collision with root package name */
    public Animator f66025A0;

    /* renamed from: B0  reason: collision with root package name */
    private int f66026B0;

    /* renamed from: C0  reason: collision with root package name */
    private int f66027C0;
    /* access modifiers changed from: private */

    /* renamed from: D0  reason: collision with root package name */
    public int f66028D0;
    /* access modifiers changed from: private */

    /* renamed from: E0  reason: collision with root package name */
    public final int f66029E0;

    /* renamed from: F0  reason: collision with root package name */
    private int f66030F0;

    /* renamed from: G0  reason: collision with root package name */
    private int f66031G0;
    /* access modifiers changed from: private */

    /* renamed from: H0  reason: collision with root package name */
    public final boolean f66032H0;

    /* renamed from: I0  reason: collision with root package name */
    private boolean f66033I0;

    /* renamed from: J0  reason: collision with root package name */
    private int f66034J0;

    /* renamed from: K0  reason: collision with root package name */
    private ArrayList<g> f66035K0;
    /* access modifiers changed from: private */

    /* renamed from: L0  reason: collision with root package name */
    public int f66036L0;
    /* access modifiers changed from: private */

    /* renamed from: M0  reason: collision with root package name */
    public boolean f66037M0;

    /* renamed from: N0  reason: collision with root package name */
    private boolean f66038N0;

    /* renamed from: O0  reason: collision with root package name */
    private Behavior f66039O0;

    /* renamed from: P0  reason: collision with root package name */
    private int f66040P0;

    /* renamed from: Q0  reason: collision with root package name */
    private int f66041Q0;

    /* renamed from: R0  reason: collision with root package name */
    private int f66042R0;

    /* renamed from: S0  reason: collision with root package name */
    AnimatorListenerAdapter f66043S0;

    /* renamed from: U  reason: collision with root package name */
    private Integer f66044U;

    /* renamed from: y0  reason: collision with root package name */
    private final C9286g f66045y0;
    /* access modifiers changed from: private */

    /* renamed from: z0  reason: collision with root package name */
    public Animator f66046z0;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.s0();
            Animator unused = BottomAppBar.this.f66046z0 = null;
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.t0();
        }
    }

    class b extends FloatingActionButton.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f66053a;

        class a extends FloatingActionButton.b {
            a() {
            }

            public void b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.s0();
            }
        }

        b(int i10) {
            this.f66053a = i10;
        }

        public void a(FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.x0(this.f66053a));
            floatingActionButton.t(new a());
        }
    }

    class c extends AnimatorListenerAdapter {
        c() {
        }

        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.s0();
            boolean unused = BottomAppBar.this.f66037M0 = false;
            Animator unused2 = BottomAppBar.this.f66025A0 = null;
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.t0();
        }
    }

    class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public boolean f66057a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ActionMenuView f66058b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f66059c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f66060d;

        d(ActionMenuView actionMenuView, int i10, boolean z10) {
            this.f66058b = actionMenuView;
            this.f66059c = i10;
            this.f66060d = z10;
        }

        public void onAnimationCancel(Animator animator) {
            this.f66057a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f66057a) {
                boolean z10 = BottomAppBar.this.f66036L0 != 0;
                BottomAppBar bottomAppBar = BottomAppBar.this;
                bottomAppBar.D0(bottomAppBar.f66036L0);
                BottomAppBar.this.J0(this.f66058b, this.f66059c, this.f66060d, z10);
            }
        }
    }

    class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ActionMenuView f66062a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f66063b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f66064c;

        e(ActionMenuView actionMenuView, int i10, boolean z10) {
            this.f66062a = actionMenuView;
            this.f66063b = i10;
            this.f66064c = z10;
        }

        public void run() {
            ActionMenuView actionMenuView = this.f66062a;
            actionMenuView.setTranslationX((float) BottomAppBar.this.w0(actionMenuView, this.f66063b, this.f66064c));
        }
    }

    class f extends AnimatorListenerAdapter {
        f() {
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.f66043S0.onAnimationStart(animator);
            FloatingActionButton c02 = BottomAppBar.this.u0();
            if (c02 != null) {
                c02.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    interface g {
        void a(BottomAppBar bottomAppBar);

        void b(BottomAppBar bottomAppBar);
    }

    static class h extends O2.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        int f66067c;

        /* renamed from: d  reason: collision with root package name */
        boolean f66068d;

        class a implements Parcelable.ClassLoaderCreator<h> {
            a() {
            }

            /* renamed from: a */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            /* renamed from: c */
            public h[] newArray(int i10) {
                return new h[i10];
            }
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f66067c);
            parcel.writeInt(this.f66068d ? 1 : 0);
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f66067c = parcel.readInt();
            this.f66068d = parcel.readInt() != 0;
        }
    }

    private void A0(int i10, boolean z10) {
        if (!C4600b0.S(this)) {
            this.f66037M0 = false;
            D0(this.f66036L0);
            return;
        }
        Animator animator = this.f66025A0;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!y0()) {
            i10 = 0;
            z10 = false;
        }
        r0(i10, z10, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.f66025A0 = animatorSet;
        animatorSet.addListener(new c());
        this.f66025A0.start();
    }

    private void B0(int i10) {
        if (this.f66026B0 != i10 && C4600b0.S(this)) {
            Animator animator = this.f66046z0;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.f66027C0 == 1) {
                q0(i10, arrayList);
            } else {
                p0(i10, arrayList);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            animatorSet.setInterpolator(C9242i.g(getContext(), f66024V0, C9081a.f60371a));
            this.f66046z0 = animatorSet;
            animatorSet.addListener(new a());
            this.f66046z0.start();
        }
    }

    private Drawable C0(Drawable drawable) {
        if (drawable == null || this.f66044U == null) {
            return drawable;
        }
        Drawable r10 = C6260a.r(drawable.mutate());
        C6260a.n(r10, this.f66044U.intValue());
        return r10;
    }

    private void E0() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null && this.f66025A0 == null) {
            actionMenuView.setAlpha(1.0f);
            if (!y0()) {
                I0(actionMenuView, 0, false);
            } else {
                I0(actionMenuView, this.f66026B0, this.f66038N0);
            }
        }
    }

    /* access modifiers changed from: private */
    public void F0() {
        getTopEdgeTreatment().p(getFabTranslationX());
        this.f66045y0.c0((!this.f66038N0 || !y0() || this.f66028D0 != 1) ? 0.0f : 1.0f);
        View v02 = v0();
        if (v02 != null) {
            v02.setTranslationY(getFabTranslationY());
            v02.setTranslationX(getFabTranslationX());
        }
    }

    private void I0(ActionMenuView actionMenuView, int i10, boolean z10) {
        J0(actionMenuView, i10, z10, false);
    }

    /* access modifiers changed from: private */
    public void J0(ActionMenuView actionMenuView, int i10, boolean z10, boolean z11) {
        e eVar = new e(actionMenuView, i10, z10);
        if (z11) {
            actionMenuView.post(eVar);
        } else {
            eVar.run();
        }
    }

    /* access modifiers changed from: private */
    public static void K0(BottomAppBar bottomAppBar, View view) {
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
        fVar.f20921d = 17;
        int i10 = bottomAppBar.f66028D0;
        if (i10 == 1) {
            fVar.f20921d = 17 | 48;
        }
        if (i10 == 0) {
            fVar.f20921d |= 80;
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public int getBottomInset() {
        return this.f66040P0;
    }

    private int getFabAlignmentAnimationDuration() {
        return C9242i.f(getContext(), f66023U0, 300);
    }

    /* access modifiers changed from: private */
    public float getFabTranslationX() {
        return x0(this.f66026B0);
    }

    private float getFabTranslationY() {
        if (this.f66028D0 == 1) {
            return -getTopEdgeTreatment().c();
        }
        View v02 = v0();
        return (float) (v02 != null ? (-((getMeasuredHeight() + getBottomInset()) - v02.getMeasuredHeight())) / 2 : 0);
    }

    /* access modifiers changed from: private */
    public int getLeftInset() {
        return this.f66042R0;
    }

    /* access modifiers changed from: private */
    public int getRightInset() {
        return this.f66041Q0;
    }

    private b getTopEdgeTreatment() {
        return (b) this.f66045y0.E().p();
    }

    /* access modifiers changed from: private */
    public void n0(FloatingActionButton floatingActionButton) {
        floatingActionButton.e(this.f66043S0);
        floatingActionButton.f(new f());
        floatingActionButton.g((C9091k<? extends FloatingActionButton>) null);
    }

    private void o0() {
        Animator animator = this.f66025A0;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f66046z0;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    private void q0(int i10, List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(u0(), "translationX", new float[]{x0(i10)});
        ofFloat.setDuration((long) getFabAlignmentAnimationDuration());
        list.add(ofFloat);
    }

    private void r0(int i10, boolean z10, List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            float fabAlignmentAnimationDuration = (float) getFabAlignmentAnimationDuration();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{1.0f});
            ofFloat.setDuration((long) (0.8f * fabAlignmentAnimationDuration));
            if (Math.abs(actionMenuView.getTranslationX() - ((float) w0(actionMenuView, i10, z10))) > 1.0f) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{0.0f});
                ofFloat2.setDuration((long) (fabAlignmentAnimationDuration * 0.2f));
                ofFloat2.addListener(new d(actionMenuView, i10, z10));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playSequentially(new Animator[]{ofFloat2, ofFloat});
                list.add(animatorSet);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                list.add(ofFloat);
            }
        }
    }

    /* access modifiers changed from: private */
    public void s0() {
        ArrayList<g> arrayList;
        int i10 = this.f66034J0 - 1;
        this.f66034J0 = i10;
        if (i10 == 0 && (arrayList = this.f66035K0) != null) {
            Iterator<g> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
        }
    }

    /* access modifiers changed from: private */
    public void t0() {
        ArrayList<g> arrayList;
        int i10 = this.f66034J0;
        this.f66034J0 = i10 + 1;
        if (i10 == 0 && (arrayList = this.f66035K0) != null) {
            Iterator<g> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b(this);
            }
        }
    }

    /* access modifiers changed from: private */
    public FloatingActionButton u0() {
        View v02 = v0();
        if (v02 instanceof FloatingActionButton) {
            return (FloatingActionButton) v02;
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View v0() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            java.util.List r0 = r0.s(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002d
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L_0x002c
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L_0x0018
        L_0x002c:
            return r2
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.v0():android.view.View");
    }

    /* access modifiers changed from: private */
    public float x0(int i10) {
        boolean i11 = v.i(this);
        int i12 = 1;
        if (i10 != 1) {
            return 0.0f;
        }
        View v02 = v0();
        int measuredWidth = (getMeasuredWidth() / 2) - ((i11 ? this.f66042R0 : this.f66041Q0) + ((this.f66030F0 == -1 || v02 == null) ? this.f66029E0 : (v02.getMeasuredWidth() / 2) + this.f66030F0));
        if (i11) {
            i12 = -1;
        }
        return (float) (measuredWidth * i12);
    }

    private boolean y0() {
        FloatingActionButton u02 = u0();
        return u02 != null && u02.p();
    }

    public void D0(int i10) {
        if (i10 != 0) {
            this.f66036L0 = 0;
            getMenu().clear();
            x(i10);
        }
    }

    public void G0(int i10, int i11) {
        this.f66036L0 = i11;
        this.f66037M0 = true;
        A0(i10, this.f66038N0);
        B0(i10);
        this.f66026B0 = i10;
    }

    /* access modifiers changed from: package-private */
    public boolean H0(int i10) {
        float f10 = (float) i10;
        if (f10 == getTopEdgeTreatment().j()) {
            return false;
        }
        getTopEdgeTreatment().o(f10);
        this.f66045y0.invalidateSelf();
        return true;
    }

    public ColorStateList getBackgroundTint() {
        return this.f66045y0.I();
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().c();
    }

    public int getFabAlignmentMode() {
        return this.f66026B0;
    }

    public int getFabAlignmentModeEndMargin() {
        return this.f66030F0;
    }

    public int getFabAnchorMode() {
        return this.f66028D0;
    }

    public int getFabAnimationMode() {
        return this.f66027C0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().e();
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f();
    }

    public boolean getHideOnScroll() {
        return this.f66033I0;
    }

    public int getMenuAlignmentMode() {
        return this.f66031G0;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Ua.h.f(this, this.f66045y0);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            o0();
            F0();
            View v02 = v0();
            if (v02 != null && C4600b0.S(v02)) {
                v02.post(new a(v02));
            }
        }
        E0();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        this.f66026B0 = hVar.f66067c;
        this.f66038N0 = hVar.f66068d;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        hVar.f66067c = this.f66026B0;
        hVar.f66068d = this.f66038N0;
        return hVar;
    }

    /* access modifiers changed from: protected */
    public void p0(int i10, List<Animator> list) {
        FloatingActionButton u02 = u0();
        if (u02 != null && !u02.o()) {
            t0();
            u02.m(new b(i10));
        }
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        C6260a.o(this.f66045y0, colorStateList);
    }

    public void setCradleVerticalOffset(float f10) {
        if (f10 != getCradleVerticalOffset()) {
            getTopEdgeTreatment().k(f10);
            this.f66045y0.invalidateSelf();
            F0();
        }
    }

    public void setElevation(float f10) {
        this.f66045y0.a0(f10);
        getBehavior().M(this, this.f66045y0.D() - this.f66045y0.C());
    }

    public void setFabAlignmentMode(int i10) {
        G0(i10, 0);
    }

    public void setFabAlignmentModeEndMargin(int i10) {
        if (this.f66030F0 != i10) {
            this.f66030F0 = i10;
            F0();
        }
    }

    public void setFabAnchorMode(int i10) {
        this.f66028D0 = i10;
        F0();
        View v02 = v0();
        if (v02 != null) {
            K0(this, v02);
            v02.requestLayout();
            this.f66045y0.invalidateSelf();
        }
    }

    public void setFabAnimationMode(int i10) {
        this.f66027C0 = i10;
    }

    /* access modifiers changed from: package-private */
    public void setFabCornerSize(float f10) {
        if (f10 != getTopEdgeTreatment().d()) {
            getTopEdgeTreatment().l(f10);
            this.f66045y0.invalidateSelf();
        }
    }

    public void setFabCradleMargin(float f10) {
        if (f10 != getFabCradleMargin()) {
            getTopEdgeTreatment().m(f10);
            this.f66045y0.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f10) {
        if (f10 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().n(f10);
            this.f66045y0.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z10) {
        this.f66033I0 = z10;
    }

    public void setMenuAlignmentMode(int i10) {
        if (this.f66031G0 != i10) {
            this.f66031G0 = i10;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                I0(actionMenuView, this.f66026B0, y0());
            }
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(C0(drawable));
    }

    public void setNavigationIconTint(int i10) {
        this.f66044U = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
    }

    public void setTitle(CharSequence charSequence) {
    }

    /* access modifiers changed from: protected */
    public int w0(ActionMenuView actionMenuView, int i10, boolean z10) {
        int i11 = 0;
        if (this.f66031G0 != 1 && (i10 != 1 || !z10)) {
            return 0;
        }
        boolean i12 = v.i(this);
        int measuredWidth = i12 ? getMeasuredWidth() : 0;
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            if ((childAt.getLayoutParams() instanceof Toolbar.g) && (((Toolbar.g) childAt.getLayoutParams()).f15537a & 8388615) == 8388611) {
                measuredWidth = i12 ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        int right = i12 ? actionMenuView.getRight() : actionMenuView.getLeft();
        int i14 = i12 ? this.f66041Q0 : -this.f66042R0;
        if (getNavigationIcon() == null) {
            i11 = getResources().getDimensionPixelOffset(C9070d.f59436t);
            if (!i12) {
                i11 = -i11;
            }
        }
        return measuredWidth - ((right + i14) + i11);
    }

    public Behavior getBehavior() {
        if (this.f66039O0 == null) {
            this.f66039O0 = new Behavior();
        }
        return this.f66039O0;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        /* access modifiers changed from: private */

        /* renamed from: m  reason: collision with root package name */
        public final Rect f66047m = new Rect();
        /* access modifiers changed from: private */

        /* renamed from: n  reason: collision with root package name */
        public WeakReference<BottomAppBar> f66048n;
        /* access modifiers changed from: private */

        /* renamed from: o  reason: collision with root package name */
        public int f66049o;

        /* renamed from: p  reason: collision with root package name */
        private final View.OnLayoutChangeListener f66050p = new a();

        class a implements View.OnLayoutChangeListener {
            a() {
            }

            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f66048n.get();
                if (bottomAppBar == null || (!(view instanceof FloatingActionButton) && !(view instanceof ExtendedFloatingActionButton))) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                int height = view.getHeight();
                if (view instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    floatingActionButton.j(Behavior.this.f66047m);
                    int height2 = Behavior.this.f66047m.height();
                    bottomAppBar.H0(height2);
                    bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().r().a(new RectF(Behavior.this.f66047m)));
                    height = height2;
                }
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
                if (Behavior.this.f66049o == 0) {
                    if (bottomAppBar.f66028D0 == 1) {
                        fVar.bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(C9070d.f59399a0) - ((view.getMeasuredHeight() - height) / 2));
                    }
                    fVar.leftMargin = bottomAppBar.getLeftInset();
                    fVar.rightMargin = bottomAppBar.getRightInset();
                    if (v.i(view)) {
                        fVar.leftMargin += bottomAppBar.f66029E0;
                    } else {
                        fVar.rightMargin += bottomAppBar.f66029E0;
                    }
                }
                bottomAppBar.F0();
            }
        }

        public Behavior() {
        }

        /* renamed from: V */
        public boolean p(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i10) {
            this.f66048n = new WeakReference<>(bottomAppBar);
            View i02 = bottomAppBar.v0();
            if (i02 != null && !C4600b0.S(i02)) {
                BottomAppBar.K0(bottomAppBar, i02);
                this.f66049o = ((CoordinatorLayout.f) i02.getLayoutParams()).bottomMargin;
                if (i02 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) i02;
                    if (bottomAppBar.f66028D0 == 0 && bottomAppBar.f66032H0) {
                        C4600b0.x0(floatingActionButton, 0.0f);
                        floatingActionButton.setCompatElevation(0.0f);
                    }
                    if (floatingActionButton.getShowMotionSpec() == null) {
                        floatingActionButton.setShowMotionSpecResource(C9067a.f59292b);
                    }
                    if (floatingActionButton.getHideMotionSpec() == null) {
                        floatingActionButton.setHideMotionSpecResource(C9067a.f59291a);
                    }
                    bottomAppBar.n0(floatingActionButton);
                }
                i02.addOnLayoutChangeListener(this.f66050p);
                bottomAppBar.F0();
            }
            coordinatorLayout.I(bottomAppBar, i10);
            return super.p(coordinatorLayout, bottomAppBar, i10);
        }

        /* renamed from: W */
        public boolean E(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i10, int i11) {
            return bottomAppBar.getHideOnScroll() && super.E(coordinatorLayout, bottomAppBar, view, view2, i10, i11);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }
}
