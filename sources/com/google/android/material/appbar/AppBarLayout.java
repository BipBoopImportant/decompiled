package com.google.android.material.appbar;

import Ea.C9068b;
import Ea.C9077k;
import Ea.C9078l;
import Fa.C9081a;
import I2.C0;
import I2.C4597a;
import I2.C4600b0;
import I2.D;
import I2.I;
import J2.t;
import La.C9138a;
import Ua.C9286g;
import Ua.h;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import j.C5443a;
import java.lang.ref.WeakReference;
import java.util.List;
import y2.C6260a;

public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {

    /* renamed from: z  reason: collision with root package name */
    private static final int f65904z = C9077k.f59599i;

    /* renamed from: a  reason: collision with root package name */
    private int f65905a;

    /* renamed from: b  reason: collision with root package name */
    private int f65906b;

    /* renamed from: c  reason: collision with root package name */
    private int f65907c;

    /* renamed from: d  reason: collision with root package name */
    private int f65908d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f65909e;

    /* renamed from: f  reason: collision with root package name */
    private int f65910f;

    /* renamed from: g  reason: collision with root package name */
    private C0 f65911g;

    /* renamed from: h  reason: collision with root package name */
    private List<b> f65912h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f65913i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f65914j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f65915k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f65916l;

    /* renamed from: m  reason: collision with root package name */
    private int f65917m;

    /* renamed from: n  reason: collision with root package name */
    private WeakReference<View> f65918n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f65919o;

    /* renamed from: p  reason: collision with root package name */
    private ValueAnimator f65920p;

    /* renamed from: q  reason: collision with root package name */
    private ValueAnimator.AnimatorUpdateListener f65921q;

    /* renamed from: r  reason: collision with root package name */
    private final List<f> f65922r;

    /* renamed from: s  reason: collision with root package name */
    private final long f65923s;

    /* renamed from: t  reason: collision with root package name */
    private final TimeInterpolator f65924t;

    /* renamed from: u  reason: collision with root package name */
    private int[] f65925u;

    /* renamed from: v  reason: collision with root package name */
    private Drawable f65926v;

    /* renamed from: w  reason: collision with root package name */
    private Integer f65927w;

    /* renamed from: x  reason: collision with root package name */
    private final float f65928x;

    /* renamed from: y  reason: collision with root package name */
    private Behavior f65929y;

    protected static class BaseBehavior<T extends AppBarLayout> extends c<T> {
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public int f65930k;

        /* renamed from: l  reason: collision with root package name */
        private int f65931l;

        /* renamed from: m  reason: collision with root package name */
        private ValueAnimator f65932m;

        /* renamed from: n  reason: collision with root package name */
        private c f65933n;

        /* renamed from: o  reason: collision with root package name */
        private WeakReference<View> f65934o;

        class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f65935a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AppBarLayout f65936b;

            a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f65935a = coordinatorLayout;
                this.f65936b = appBarLayout;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.T(this.f65935a, this.f65936b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        class b extends C4597a {

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ AppBarLayout f65938d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f65939e;

            b(AppBarLayout appBarLayout, CoordinatorLayout coordinatorLayout) {
                this.f65938d = appBarLayout;
                this.f65939e = coordinatorLayout;
            }

            public void g(View view, t tVar) {
                View V10;
                super.g(view, tVar);
                tVar.i0(ScrollView.class.getName());
                if (this.f65938d.getTotalScrollRange() != 0 && (V10 = BaseBehavior.this.j0(this.f65939e)) != null && BaseBehavior.this.f0(this.f65938d)) {
                    if (BaseBehavior.this.Q() != (-this.f65938d.getTotalScrollRange())) {
                        tVar.b(t.a.f8846q);
                        tVar.L0(true);
                    }
                    if (BaseBehavior.this.Q() == 0) {
                        return;
                    }
                    if (!V10.canScrollVertically(-1)) {
                        tVar.b(t.a.f8847r);
                        tVar.L0(true);
                    } else if ((-this.f65938d.getDownNestedPreScrollRange()) != 0) {
                        tVar.b(t.a.f8847r);
                        tVar.L0(true);
                    }
                }
            }

            public boolean j(View view, int i10, Bundle bundle) {
                if (i10 == 4096) {
                    this.f65938d.setExpanded(false);
                    return true;
                } else if (i10 != 8192) {
                    return super.j(view, i10, bundle);
                } else {
                    if (BaseBehavior.this.Q() != 0) {
                        View V10 = BaseBehavior.this.j0(this.f65939e);
                        if (V10.canScrollVertically(-1)) {
                            int i11 = -this.f65938d.getDownNestedPreScrollRange();
                            if (i11 != 0) {
                                BaseBehavior.this.u(this.f65939e, this.f65938d, V10, 0, i11, new int[]{0, 0}, 1);
                                return true;
                            }
                        } else {
                            this.f65938d.setExpanded(true);
                            return true;
                        }
                    }
                    return false;
                }
            }
        }

        public BaseBehavior() {
        }

        private void A0(CoordinatorLayout coordinatorLayout, T t10) {
            int topInset = t10.getTopInset() + t10.getPaddingTop();
            int Q10 = Q() - topInset;
            int i02 = i0(t10, Q10);
            if (i02 >= 0) {
                View childAt = t10.getChildAt(i02);
                e eVar = (e) childAt.getLayoutParams();
                int c10 = eVar.c();
                if ((c10 & 17) == 17) {
                    int i10 = -childAt.getTop();
                    int i11 = -childAt.getBottom();
                    if (i02 == 0 && C4600b0.w(t10) && C4600b0.w(childAt)) {
                        i10 -= t10.getTopInset();
                    }
                    if (e0(c10, 2)) {
                        i11 += C4600b0.A(childAt);
                    } else if (e0(c10, 5)) {
                        int A10 = C4600b0.A(childAt) + i11;
                        if (Q10 < A10) {
                            i10 = A10;
                        } else {
                            i11 = A10;
                        }
                    }
                    if (e0(c10, 32)) {
                        i10 += eVar.topMargin;
                        i11 -= eVar.bottomMargin;
                    }
                    Z(coordinatorLayout, t10, B2.a.c(b0(Q10, i11, i10) + topInset, -t10.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        private void B0(CoordinatorLayout coordinatorLayout, T t10, int i10, int i11, boolean z10) {
            View h02 = h0(t10, i10);
            boolean z11 = false;
            if (h02 != null) {
                int c10 = ((e) h02.getLayoutParams()).c();
                if ((c10 & 1) != 0) {
                    int A10 = C4600b0.A(h02);
                    if (i11 <= 0 || (c10 & 12) == 0 ? !((c10 & 2) == 0 || (-i10) < (h02.getBottom() - A10) - t10.getTopInset()) : (-i10) >= (h02.getBottom() - A10) - t10.getTopInset()) {
                        z11 = true;
                    }
                }
            }
            if (t10.o()) {
                z11 = t10.A(g0(coordinatorLayout));
            }
            boolean x10 = t10.x(z11);
            if (z10 || (x10 && z0(coordinatorLayout, t10))) {
                if (t10.getBackground() != null) {
                    t10.getBackground().jumpToCurrentState();
                }
                if (t10.getForeground() != null) {
                    t10.getForeground().jumpToCurrentState();
                }
                if (t10.getStateListAnimator() != null) {
                    t10.getStateListAnimator().jumpToCurrentState();
                }
            }
        }

        private void Y(CoordinatorLayout coordinatorLayout, T t10) {
            if (!C4600b0.N(coordinatorLayout)) {
                C4600b0.p0(coordinatorLayout, new b(t10, coordinatorLayout));
            }
        }

        private void Z(CoordinatorLayout coordinatorLayout, T t10, int i10, float f10) {
            int abs = Math.abs(Q() - i10);
            float abs2 = Math.abs(f10);
            a0(coordinatorLayout, t10, i10, abs2 > 0.0f ? Math.round((((float) abs) / abs2) * 1000.0f) * 3 : (int) (((((float) abs) / ((float) t10.getHeight())) + 1.0f) * 150.0f));
        }

        private void a0(CoordinatorLayout coordinatorLayout, T t10, int i10, int i11) {
            int Q10 = Q();
            if (Q10 == i10) {
                ValueAnimator valueAnimator = this.f65932m;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f65932m.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f65932m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f65932m = valueAnimator3;
                valueAnimator3.setInterpolator(C9081a.f60375e);
                this.f65932m.addUpdateListener(new a(coordinatorLayout, t10));
            } else {
                valueAnimator2.cancel();
            }
            this.f65932m.setDuration((long) Math.min(i11, 600));
            this.f65932m.setIntValues(new int[]{Q10, i10});
            this.f65932m.start();
        }

        private int b0(int i10, int i11, int i12) {
            return i10 < (i11 + i12) / 2 ? i11 : i12;
        }

        private boolean d0(CoordinatorLayout coordinatorLayout, T t10, View view) {
            return t10.k() && coordinatorLayout.getHeight() - view.getHeight() <= t10.getHeight();
        }

        private static boolean e0(int i10, int i11) {
            return (i10 & i11) == i11;
        }

        /* access modifiers changed from: private */
        public boolean f0(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (((e) appBarLayout.getChildAt(i10).getLayoutParams()).f65949a != 0) {
                    return true;
                }
            }
            return false;
        }

        private View g0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if ((childAt instanceof D) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        private static View h0(AppBarLayout appBarLayout, int i10) {
            int abs = Math.abs(i10);
            int childCount = appBarLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = appBarLayout.getChildAt(i11);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private int i0(T t10, int i10) {
            int childCount = t10.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = t10.getChildAt(i11);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                e eVar = (e) childAt.getLayoutParams();
                if (e0(eVar.c(), 32)) {
                    top -= eVar.topMargin;
                    bottom += eVar.bottomMargin;
                }
                int i12 = -i10;
                if (top <= i12 && bottom >= i12) {
                    return i11;
                }
            }
            return -1;
        }

        /* access modifiers changed from: private */
        public View j0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (((CoordinatorLayout.f) childAt.getLayoutParams()).f() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        private int m0(T t10, int i10) {
            int abs = Math.abs(i10);
            int childCount = t10.getChildCount();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i12 >= childCount) {
                    break;
                }
                View childAt = t10.getChildAt(i12);
                e eVar = (e) childAt.getLayoutParams();
                Interpolator d10 = eVar.d();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i12++;
                } else if (d10 != null) {
                    int c10 = eVar.c();
                    if ((c10 & 1) != 0) {
                        i11 = childAt.getHeight() + eVar.topMargin + eVar.bottomMargin;
                        if ((c10 & 2) != 0) {
                            i11 -= C4600b0.A(childAt);
                        }
                    }
                    if (C4600b0.w(childAt)) {
                        i11 -= t10.getTopInset();
                    }
                    if (i11 > 0) {
                        float f10 = (float) i11;
                        return Integer.signum(i10) * (childAt.getTop() + Math.round(f10 * d10.getInterpolation(((float) (abs - childAt.getTop())) / f10)));
                    }
                }
            }
            return i10;
        }

        private boolean z0(CoordinatorLayout coordinatorLayout, T t10) {
            List<View> s10 = coordinatorLayout.s(t10);
            int size = s10.size();
            for (int i10 = 0; i10 < size; i10++) {
                CoordinatorLayout.c f10 = ((CoordinatorLayout.f) s10.get(i10).getLayoutParams()).f();
                if (f10 instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) f10).O() != 0;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public int Q() {
            return I() + this.f65930k;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c0 */
        public boolean L(T t10) {
            WeakReference<View> weakReference = this.f65934o;
            if (weakReference == null) {
                return true;
            }
            View view = weakReference.get();
            return view != null && view.isShown() && !view.canScrollVertically(-1);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k0 */
        public int O(T t10) {
            return (-t10.getDownNestedScrollRange()) + t10.getTopInset();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l0 */
        public int P(T t10) {
            return t10.getTotalScrollRange();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n0 */
        public void R(CoordinatorLayout coordinatorLayout, T t10) {
            A0(coordinatorLayout, t10);
            if (t10.o()) {
                t10.x(t10.A(g0(coordinatorLayout)));
            }
        }

        /* renamed from: o0 */
        public boolean p(CoordinatorLayout coordinatorLayout, T t10, int i10) {
            boolean p10 = super.p(coordinatorLayout, t10, i10);
            int pendingAction = t10.getPendingAction();
            c cVar = this.f65933n;
            if (cVar == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z10 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i11 = -t10.getUpNestedPreScrollRange();
                        if (z10) {
                            Z(coordinatorLayout, t10, i11, 0.0f);
                        } else {
                            T(coordinatorLayout, t10, i11);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z10) {
                            Z(coordinatorLayout, t10, 0, 0.0f);
                        } else {
                            T(coordinatorLayout, t10, 0);
                        }
                    }
                }
            } else if (cVar.f65941c) {
                T(coordinatorLayout, t10, -t10.getTotalScrollRange());
            } else if (cVar.f65942d) {
                T(coordinatorLayout, t10, 0);
            } else {
                View childAt = t10.getChildAt(cVar.f65943e);
                T(coordinatorLayout, t10, (-childAt.getBottom()) + (this.f65933n.f65945g ? C4600b0.A(childAt) + t10.getTopInset() : Math.round(((float) childAt.getHeight()) * this.f65933n.f65944f)));
            }
            t10.u();
            this.f65933n = null;
            K(B2.a.c(I(), -t10.getTotalScrollRange(), 0));
            B0(coordinatorLayout, t10, I(), 0, true);
            t10.s(I());
            Y(coordinatorLayout, t10);
            return p10;
        }

        /* renamed from: p0 */
        public boolean q(CoordinatorLayout coordinatorLayout, T t10, int i10, int i11, int i12, int i13) {
            if (((CoordinatorLayout.f) t10.getLayoutParams()).height != -2) {
                return super.q(coordinatorLayout, t10, i10, i11, i12, i13);
            }
            coordinatorLayout.J(t10, i10, i11, View.MeasureSpec.makeMeasureSpec(0, 0), i13);
            return true;
        }

        /* renamed from: q0 */
        public void u(CoordinatorLayout coordinatorLayout, T t10, View view, int i10, int i11, int[] iArr, int i12) {
            int i13;
            int i14;
            if (i11 != 0) {
                if (i11 < 0) {
                    i13 = -t10.getTotalScrollRange();
                    i14 = t10.getDownNestedPreScrollRange() + i13;
                } else {
                    i13 = -t10.getUpNestedPreScrollRange();
                    i14 = 0;
                }
                int i15 = i13;
                int i16 = i14;
                if (i15 != i16) {
                    iArr[1] = S(coordinatorLayout, t10, i11, i15, i16);
                }
            }
            if (t10.o()) {
                t10.x(t10.A(view));
            }
        }

        /* renamed from: r0 */
        public void x(CoordinatorLayout coordinatorLayout, T t10, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            if (i13 < 0) {
                iArr[1] = S(coordinatorLayout, t10, i13, -t10.getDownNestedScrollRange(), 0);
            }
            if (i13 == 0) {
                Y(coordinatorLayout, t10);
            }
        }

        /* renamed from: s0 */
        public void B(CoordinatorLayout coordinatorLayout, T t10, Parcelable parcelable) {
            if (parcelable instanceof c) {
                w0((c) parcelable, true);
                super.B(coordinatorLayout, t10, this.f65933n.a());
                return;
            }
            super.B(coordinatorLayout, t10, parcelable);
            this.f65933n = null;
        }

        /* renamed from: t0 */
        public Parcelable C(CoordinatorLayout coordinatorLayout, T t10) {
            Parcelable C10 = super.C(coordinatorLayout, t10);
            c x02 = x0(C10, t10);
            return x02 == null ? C10 : x02;
        }

        /* renamed from: u0 */
        public boolean E(CoordinatorLayout coordinatorLayout, T t10, View view, View view2, int i10, int i11) {
            ValueAnimator valueAnimator;
            boolean z10 = (i10 & 2) != 0 && (t10.o() || d0(coordinatorLayout, t10, view));
            if (z10 && (valueAnimator = this.f65932m) != null) {
                valueAnimator.cancel();
            }
            this.f65934o = null;
            this.f65931l = i11;
            return z10;
        }

        /* renamed from: v0 */
        public void G(CoordinatorLayout coordinatorLayout, T t10, View view, int i10) {
            if (this.f65931l == 0 || i10 == 1) {
                A0(coordinatorLayout, t10);
                if (t10.o()) {
                    t10.x(t10.A(view));
                }
            }
            this.f65934o = new WeakReference<>(view);
        }

        /* access modifiers changed from: package-private */
        public void w0(c cVar, boolean z10) {
            if (this.f65933n == null || z10) {
                this.f65933n = cVar;
            }
        }

        /* access modifiers changed from: package-private */
        public c x0(Parcelable parcelable, T t10) {
            int I10 = I();
            int childCount = t10.getChildCount();
            boolean z10 = false;
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = t10.getChildAt(i10);
                int bottom = childAt.getBottom() + I10;
                if (childAt.getTop() + I10 > 0 || bottom < 0) {
                    i10++;
                } else {
                    if (parcelable == null) {
                        parcelable = O2.a.f11763b;
                    }
                    c cVar = new c(parcelable);
                    boolean z11 = I10 == 0;
                    cVar.f65942d = z11;
                    cVar.f65941c = !z11 && (-I10) >= t10.getTotalScrollRange();
                    cVar.f65943e = i10;
                    if (bottom == C4600b0.A(childAt) + t10.getTopInset()) {
                        z10 = true;
                    }
                    cVar.f65945g = z10;
                    cVar.f65944f = ((float) bottom) / ((float) childAt.getHeight());
                    return cVar;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: y0 */
        public int U(CoordinatorLayout coordinatorLayout, T t10, int i10, int i11, int i12) {
            int Q10 = Q();
            int i13 = 0;
            if (i11 == 0 || Q10 < i11 || Q10 > i12) {
                this.f65930k = 0;
            } else {
                int c10 = B2.a.c(i10, i11, i12);
                if (Q10 != c10) {
                    int m02 = t10.i() ? m0(t10, c10) : c10;
                    boolean K10 = K(m02);
                    int i14 = Q10 - c10;
                    this.f65930k = c10 - m02;
                    int i15 = 1;
                    if (K10) {
                        while (i13 < t10.getChildCount()) {
                            e eVar = (e) t10.getChildAt(i13).getLayoutParams();
                            c b10 = eVar.b();
                            if (!(b10 == null || (eVar.c() & 1) == 0)) {
                                b10.a(t10, t10.getChildAt(i13), (float) I());
                            }
                            i13++;
                        }
                    }
                    if (!K10 && t10.i()) {
                        coordinatorLayout.f(t10);
                    }
                    t10.s(I());
                    if (c10 < Q10) {
                        i15 = -1;
                    }
                    B0(coordinatorLayout, t10, c10, i15, false);
                    i13 = i14;
                }
            }
            Y(coordinatorLayout, t10);
            return i13;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        protected static class c extends O2.a {
            public static final Parcelable.Creator<c> CREATOR = new a();

            /* renamed from: c  reason: collision with root package name */
            boolean f65941c;

            /* renamed from: d  reason: collision with root package name */
            boolean f65942d;

            /* renamed from: e  reason: collision with root package name */
            int f65943e;

            /* renamed from: f  reason: collision with root package name */
            float f65944f;

            /* renamed from: g  reason: collision with root package name */
            boolean f65945g;

            class a implements Parcelable.ClassLoaderCreator<c> {
                a() {
                }

                /* renamed from: a */
                public c createFromParcel(Parcel parcel) {
                    return new c(parcel, (ClassLoader) null);
                }

                /* renamed from: b */
                public c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new c(parcel, classLoader);
                }

                /* renamed from: c */
                public c[] newArray(int i10) {
                    return new c[i10];
                }
            }

            public c(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                boolean z10 = false;
                this.f65941c = parcel.readByte() != 0;
                this.f65942d = parcel.readByte() != 0;
                this.f65943e = parcel.readInt();
                this.f65944f = parcel.readFloat();
                this.f65945g = parcel.readByte() != 0 ? true : z10;
            }

            public void writeToParcel(Parcel parcel, int i10) {
                super.writeToParcel(parcel, i10);
                parcel.writeByte(this.f65941c ? (byte) 1 : 0);
                parcel.writeByte(this.f65942d ? (byte) 1 : 0);
                parcel.writeInt(this.f65943e);
                parcel.writeFloat(this.f65944f);
                parcel.writeByte(this.f65945g ? (byte) 1 : 0);
            }

            public c(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public /* bridge */ /* synthetic */ boolean H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.H(coordinatorLayout, view, motionEvent);
        }

        public /* bridge */ /* synthetic */ int I() {
            return super.I();
        }

        public /* bridge */ /* synthetic */ boolean K(int i10) {
            return super.K(i10);
        }

        public /* bridge */ /* synthetic */ boolean o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.o(coordinatorLayout, view, motionEvent);
        }

        public /* bridge */ /* synthetic */ boolean o0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            return super.p(coordinatorLayout, appBarLayout, i10);
        }

        public /* bridge */ /* synthetic */ boolean p0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12, int i13) {
            return super.q(coordinatorLayout, appBarLayout, i10, i11, i12, i13);
        }

        public /* bridge */ /* synthetic */ void q0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int[] iArr, int i12) {
            super.u(coordinatorLayout, appBarLayout, view, i10, i11, iArr, i12);
        }

        public /* bridge */ /* synthetic */ void r0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            super.x(coordinatorLayout, appBarLayout, view, i10, i11, i12, i13, i14, iArr);
        }

        public /* bridge */ /* synthetic */ void s0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.B(coordinatorLayout, appBarLayout, parcelable);
        }

        public /* bridge */ /* synthetic */ Parcelable t0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.C(coordinatorLayout, appBarLayout);
        }

        public /* bridge */ /* synthetic */ boolean u0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i10, int i11) {
            return super.E(coordinatorLayout, appBarLayout, view, view2, i10, i11);
        }

        public /* bridge */ /* synthetic */ void v0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
            super.G(coordinatorLayout, appBarLayout, view, i10);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends d {
        public ScrollingViewBehavior() {
        }

        private static int V(AppBarLayout appBarLayout) {
            CoordinatorLayout.c f10 = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).f();
            if (f10 instanceof BaseBehavior) {
                return ((BaseBehavior) f10).Q();
            }
            return 0;
        }

        private void W(View view, View view2) {
            CoordinatorLayout.c f10 = ((CoordinatorLayout.f) view2.getLayoutParams()).f();
            if (f10 instanceof BaseBehavior) {
                C4600b0.Z(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) f10).f65930k) + Q()) - M(view2));
            }
        }

        private void X(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.o()) {
                    appBarLayout.x(appBarLayout.A(view));
                }
            }
        }

        public boolean A(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
            AppBarLayout U10 = L(coordinatorLayout.r(view));
            if (U10 != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                Rect rect3 = this.f65976d;
                rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect3.contains(rect2)) {
                    U10.setExpanded(false, !z10);
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public float N(View view) {
            int i10;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int V10 = V(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + V10 > downNestedPreScrollRange) && (i10 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (((float) V10) / ((float) i10)) + 1.0f;
                }
            }
            return 0.0f;
        }

        /* access modifiers changed from: package-private */
        public int P(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.P(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: U */
        public AppBarLayout L(List<View> list) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = list.get(i10);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        public boolean i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        public boolean l(CoordinatorLayout coordinatorLayout, View view, View view2) {
            W(view, view2);
            X(view, view2);
            return false;
        }

        public void m(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                C4600b0.p0(coordinatorLayout, (C4597a) null);
            }
        }

        public /* bridge */ /* synthetic */ boolean p(CoordinatorLayout coordinatorLayout, View view, int i10) {
            return super.p(coordinatorLayout, view, i10);
        }

        public /* bridge */ /* synthetic */ boolean q(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
            return super.q(coordinatorLayout, view, i10, i11, i12, i13);
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9078l.f60040n6);
            S(obtainStyledAttributes.getDimensionPixelSize(C9078l.f60051o6, 0));
            obtainStyledAttributes.recycle();
        }
    }

    class a implements I {
        a() {
        }

        public C0 a(View view, C0 c02) {
            return AppBarLayout.this.t(c02);
        }
    }

    public interface b<T extends AppBarLayout> {
        void a(T t10, int i10);
    }

    public static abstract class c {
        public abstract void a(AppBarLayout appBarLayout, View view, float f10);
    }

    public static class d extends c {

        /* renamed from: a  reason: collision with root package name */
        private final Rect f65947a = new Rect();

        /* renamed from: b  reason: collision with root package name */
        private final Rect f65948b = new Rect();

        private static void b(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        public void a(AppBarLayout appBarLayout, View view, float f10) {
            b(this.f65947a, appBarLayout, view);
            float abs = ((float) this.f65947a.top) - Math.abs(f10);
            if (abs <= 0.0f) {
                float b10 = 1.0f - B2.a.b(Math.abs(abs / ((float) this.f65947a.height())), 0.0f, 1.0f);
                float height = (-abs) - ((((float) this.f65947a.height()) * 0.3f) * (1.0f - (b10 * b10)));
                view.setTranslationY(height);
                view.getDrawingRect(this.f65948b);
                this.f65948b.offset(0, (int) (-height));
                if (height >= ((float) this.f65948b.height())) {
                    view.setVisibility(4);
                } else {
                    view.setVisibility(0);
                }
                C4600b0.w0(view, this.f65948b);
                return;
            }
            C4600b0.w0(view, (Rect) null);
            view.setTranslationY(0.0f);
            view.setVisibility(0);
        }
    }

    public interface f {
        void a(float f10, int i10);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C9068b.f59323b);
    }

    private boolean B() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        return childAt.getVisibility() != 8 && !C4600b0.w(childAt);
    }

    private void C(float f10, float f11) {
        ValueAnimator valueAnimator = this.f65920p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f10, f11});
        this.f65920p = ofFloat;
        ofFloat.setDuration(this.f65923s);
        this.f65920p.setInterpolator(this.f65924t);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f65921q;
        if (animatorUpdateListener != null) {
            this.f65920p.addUpdateListener(animatorUpdateListener);
        }
        this.f65920p.start();
    }

    private void D() {
        setWillNotDraw(!z());
    }

    private void c() {
        WeakReference<View> weakReference = this.f65918n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f65918n = null;
    }

    private Integer d() {
        Drawable drawable = this.f65926v;
        if (drawable instanceof C9286g) {
            return Integer.valueOf(((C9286g) drawable).A());
        }
        ColorStateList f10 = com.google.android.material.drawable.d.f(drawable);
        if (f10 != null) {
            return Integer.valueOf(f10.getDefaultColor());
        }
        return null;
    }

    private View e(View view) {
        int i10;
        if (this.f65918n == null && (i10 = this.f65917m) != -1) {
            View findViewById = view != null ? view.findViewById(i10) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.f65917m);
            }
            if (findViewById != null) {
                this.f65918n = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.f65918n;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private boolean j() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (((e) getChildAt(i10).getLayoutParams()).e()) {
                return true;
            }
        }
        return false;
    }

    private void l(C9286g gVar, ColorStateList colorStateList, ColorStateList colorStateList2) {
        this.f65921q = new a(this, colorStateList, colorStateList2, gVar, C9138a.f(getContext(), C9068b.f59352q));
        C4600b0.t0(this, gVar);
    }

    private void m(Context context, C9286g gVar) {
        gVar.Q(context);
        this.f65921q = new b(this, gVar);
        C4600b0.t0(this, gVar);
    }

    private void n() {
        Behavior behavior = this.f65929y;
        BaseBehavior.c x02 = (behavior == null || this.f65906b == -1 || this.f65910f != 0) ? null : behavior.x0(O2.a.f11763b, this);
        this.f65906b = -1;
        this.f65907c = -1;
        this.f65908d = -1;
        if (x02 != null) {
            this.f65929y.w0(x02, false);
        }
    }

    private boolean p() {
        return getBackground() instanceof C9286g;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void q(ColorStateList colorStateList, ColorStateList colorStateList2, C9286g gVar, Integer num, ValueAnimator valueAnimator) {
        Integer num2;
        int j10 = C9138a.j(colorStateList.getDefaultColor(), colorStateList2.getDefaultColor(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
        gVar.b0(ColorStateList.valueOf(j10));
        if (!(this.f65926v == null || (num2 = this.f65927w) == null || !num2.equals(num))) {
            C6260a.n(this.f65926v, j10);
        }
        if (!this.f65922r.isEmpty()) {
            for (f next : this.f65922r) {
                if (gVar.x() != null) {
                    next.a(0.0f, j10);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void r(C9286g gVar, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        gVar.a0(floatValue);
        Drawable drawable = this.f65926v;
        if (drawable instanceof C9286g) {
            ((C9286g) drawable).a0(floatValue);
        }
        for (f a10 : this.f65922r) {
            a10.a(floatValue, gVar.A());
        }
    }

    private void v(boolean z10, boolean z11, boolean z12) {
        int i10 = 0;
        int i11 = (z10 ? 1 : 2) | (z11 ? 4 : 0);
        if (z12) {
            i10 = 8;
        }
        this.f65910f = i11 | i10;
        requestLayout();
    }

    private boolean w(boolean z10) {
        if (this.f65914j == z10) {
            return false;
        }
        this.f65914j = z10;
        refreshDrawableState();
        return true;
    }

    private boolean z() {
        return this.f65926v != null && getTopInset() > 0;
    }

    /* access modifiers changed from: package-private */
    public boolean A(View view) {
        View e10 = e(view);
        if (e10 != null) {
            view = e10;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (z()) {
            int save = canvas.save();
            canvas.translate(0.0f, (float) (-this.f65905a));
            this.f65926v.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f65926v;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public e generateDefaultLayoutParams() {
        return new e(-1, -2);
    }

    /* renamed from: g */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.f65929y = behavior;
        return behavior;
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedPreScrollRange() {
        int i10;
        int A10;
        int i11 = this.f65907c;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i13 = eVar.f65949a;
                if ((i13 & 5) == 5) {
                    int i14 = eVar.topMargin + eVar.bottomMargin;
                    if ((i13 & 8) != 0) {
                        A10 = C4600b0.A(childAt);
                    } else if ((i13 & 2) != 0) {
                        A10 = measuredHeight - C4600b0.A(childAt);
                    } else {
                        i10 = i14 + measuredHeight;
                        if (childCount == 0 && C4600b0.w(childAt)) {
                            i10 = Math.min(i10, measuredHeight - getTopInset());
                        }
                        i12 += i10;
                    }
                    i10 = i14 + A10;
                    i10 = Math.min(i10, measuredHeight - getTopInset());
                    i12 += i10;
                } else if (i12 > 0) {
                    break;
                }
            }
        }
        int max = Math.max(0, i12);
        this.f65907c = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedScrollRange() {
        int i10 = this.f65908d;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + eVar.topMargin + eVar.bottomMargin;
                int i13 = eVar.f65949a;
                if ((i13 & 1) == 0) {
                    break;
                }
                i12 += measuredHeight;
                if ((i13 & 2) != 0) {
                    i12 -= C4600b0.A(childAt);
                    break;
                }
            }
            i11++;
        }
        int max = Math.max(0, i12);
        this.f65908d = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f65917m;
    }

    public C9286g getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof C9286g) {
            return (C9286g) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int A10 = C4600b0.A(this);
        if (A10 == 0) {
            int childCount = getChildCount();
            A10 = childCount >= 1 ? C4600b0.A(getChildAt(childCount - 1)) : 0;
            if (A10 == 0) {
                return getHeight() / 3;
            }
        }
        return (A10 * 2) + topInset;
    }

    /* access modifiers changed from: package-private */
    public int getPendingAction() {
        return this.f65910f;
    }

    public Drawable getStatusBarForeground() {
        return this.f65926v;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    public final int getTopInset() {
        C0 c02 = this.f65911g;
        if (c02 != null) {
            return c02.m();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i10 = this.f65906b;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i13 = eVar.f65949a;
                if ((i13 & 1) == 0) {
                    break;
                }
                i12 += measuredHeight + eVar.topMargin + eVar.bottomMargin;
                if (i11 == 0 && C4600b0.w(childAt)) {
                    i12 -= getTopInset();
                }
                if ((i13 & 2) != 0) {
                    i12 -= C4600b0.A(childAt);
                    break;
                }
            }
            i11++;
        }
        int max = Math.max(0, i12);
        this.f65906b = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new e((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    /* access modifiers changed from: package-private */
    public boolean i() {
        return this.f65909e;
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        return getTotalScrollRange() != 0;
    }

    public boolean o() {
        return this.f65916l;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i10) {
        if (this.f65925u == null) {
            this.f65925u = new int[4];
        }
        int[] iArr = this.f65925u;
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + iArr.length);
        boolean z10 = this.f65914j;
        int i11 = C9068b.f59334g0;
        if (!z10) {
            i11 = -i11;
        }
        iArr[0] = i11;
        iArr[1] = (!z10 || !this.f65915k) ? -C9068b.f59336h0 : C9068b.f59336h0;
        int i12 = C9068b.f59326c0;
        if (!z10) {
            i12 = -i12;
        }
        iArr[2] = i12;
        iArr[3] = (!z10 || !this.f65915k) ? -C9068b.f59324b0 : C9068b.f59324b0;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = true;
        if (C4600b0.w(this) && B()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                C4600b0.Z(getChildAt(childCount), topInset);
            }
        }
        n();
        this.f65909e = false;
        int childCount2 = getChildCount();
        int i14 = 0;
        while (true) {
            if (i14 >= childCount2) {
                break;
            } else if (((e) getChildAt(i14).getLayoutParams()).d() != null) {
                this.f65909e = true;
                break;
            } else {
                i14++;
            }
        }
        Drawable drawable = this.f65926v;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.f65913i) {
            if (!this.f65916l && !j()) {
                z11 = false;
            }
            w(z11);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != 1073741824 && C4600b0.w(this) && B()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = B2.a.c(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i11));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        n();
    }

    /* access modifiers changed from: package-private */
    public void s(int i10) {
        this.f65905a = i10;
        if (!willNotDraw()) {
            C4600b0.f0(this);
        }
        List<b> list = this.f65912h;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = this.f65912h.get(i11);
                if (bVar != null) {
                    bVar.a(this, i10);
                }
            }
        }
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        h.d(this, f10);
    }

    public void setExpanded(boolean z10) {
        setExpanded(z10, C4600b0.S(this));
    }

    public void setLiftOnScroll(boolean z10) {
        this.f65916l = z10;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.f65917m = -1;
        if (view == null) {
            c();
        } else {
            this.f65918n = new WeakReference<>(view);
        }
    }

    public void setLiftOnScrollTargetViewId(int i10) {
        this.f65917m = i10;
        c();
    }

    public void setLiftableOverrideEnabled(boolean z10) {
        this.f65913i = z10;
    }

    public void setOrientation(int i10) {
        if (i10 == 1) {
            super.setOrientation(i10);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f65926v;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f65926v = drawable3;
            this.f65927w = d();
            Drawable drawable4 = this.f65926v;
            if (drawable4 != null) {
                if (drawable4.isStateful()) {
                    this.f65926v.setState(getDrawableState());
                }
                C6260a.m(this.f65926v, C4600b0.z(this));
                this.f65926v.setVisible(getVisibility() == 0, false);
                this.f65926v.setCallback(this);
            }
            D();
            C4600b0.f0(this);
        }
    }

    public void setStatusBarForegroundColor(int i10) {
        setStatusBarForeground(new ColorDrawable(i10));
    }

    public void setStatusBarForegroundResource(int i10) {
        setStatusBarForeground(C5443a.b(getContext(), i10));
    }

    @Deprecated
    public void setTargetElevation(float f10) {
        g.b(this, f10);
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f65926v;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
    }

    /* access modifiers changed from: package-private */
    public C0 t(C0 c02) {
        C0 c03 = C4600b0.w(this) ? c02 : null;
        if (!H2.c.a(this.f65911g, c03)) {
            this.f65911g = c03;
            D();
            requestLayout();
        }
        return c02;
    }

    /* access modifiers changed from: package-private */
    public void u() {
        this.f65910f = 0;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f65926v;
    }

    /* access modifiers changed from: package-private */
    public boolean x(boolean z10) {
        return y(z10, !this.f65913i);
    }

    /* access modifiers changed from: package-private */
    public boolean y(boolean z10, boolean z11) {
        if (!z11 || this.f65915k == z10) {
            return false;
        }
        this.f65915k = z10;
        refreshDrawableState();
        if (!p()) {
            return true;
        }
        float f10 = 0.0f;
        if (this.f65919o) {
            float f11 = z10 ? 0.0f : 1.0f;
            if (z10) {
                f10 = 1.0f;
            }
            C(f11, f10);
            return true;
        } else if (!this.f65916l) {
            return true;
        } else {
            float f12 = z10 ? 0.0f : this.f65928x;
            if (z10) {
                f10 = this.f65928x;
            }
            C(f12, f10);
            return true;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppBarLayout(android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            int r4 = f65904z
            android.content.Context r10 = Xa.C9359a.c(r10, r11, r12, r4)
            r9.<init>(r10, r11, r12)
            r10 = -1
            r9.f65906b = r10
            r9.f65907c = r10
            r9.f65908d = r10
            r6 = 0
            r9.f65910f = r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.f65922r = r0
            android.content.Context r7 = r9.getContext()
            r8 = 1
            r9.setOrientation(r8)
            android.view.ViewOutlineProvider r0 = r9.getOutlineProvider()
            android.view.ViewOutlineProvider r1 = android.view.ViewOutlineProvider.BACKGROUND
            if (r0 != r1) goto L_0x002d
            com.google.android.material.appbar.g.a(r9)
        L_0x002d:
            com.google.android.material.appbar.g.c(r9, r11, r12, r4)
            int[] r2 = Ea.C9078l.f60000k
            int[] r5 = new int[r6]
            r0 = r7
            r1 = r11
            r3 = r12
            android.content.res.TypedArray r11 = com.google.android.material.internal.s.i(r0, r1, r2, r3, r4, r5)
            int r12 = Ea.C9078l.f60011l
            android.graphics.drawable.Drawable r12 = r11.getDrawable(r12)
            I2.C4600b0.t0(r9, r12)
            int r12 = Ea.C9078l.f60077r
            android.content.res.ColorStateList r12 = Ra.c.a(r7, r11, r12)
            if (r12 == 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r8 = r6
        L_0x004e:
            r9.f65919o = r8
            android.graphics.drawable.Drawable r0 = r9.getBackground()
            android.content.res.ColorStateList r0 = com.google.android.material.drawable.d.f(r0)
            if (r0 == 0) goto L_0x006b
            Ua.g r1 = new Ua.g
            r1.<init>()
            r1.b0(r0)
            if (r12 == 0) goto L_0x0068
            r9.l(r1, r0, r12)
            goto L_0x006b
        L_0x0068:
            r9.m(r7, r1)
        L_0x006b:
            int r12 = Ea.C9068b.f59304J
            android.content.res.Resources r0 = r9.getResources()
            int r1 = Ea.C9073g.f59509a
            int r0 = r0.getInteger(r1)
            int r12 = Qa.C9242i.f(r7, r12, r0)
            long r0 = (long) r12
            r9.f65923s = r0
            int r12 = Ea.C9068b.f59315U
            android.animation.TimeInterpolator r0 = Fa.C9081a.f60371a
            android.animation.TimeInterpolator r12 = Qa.C9242i.g(r7, r12, r0)
            r9.f65924t = r12
            int r12 = Ea.C9078l.f60055p
            boolean r12 = r11.hasValue(r12)
            if (r12 == 0) goto L_0x0099
            int r12 = Ea.C9078l.f60055p
            boolean r12 = r11.getBoolean(r12, r6)
            r9.v(r12, r6, r6)
        L_0x0099:
            int r12 = Ea.C9078l.f60044o
            boolean r12 = r11.hasValue(r12)
            if (r12 == 0) goto L_0x00ab
            int r12 = Ea.C9078l.f60044o
            int r12 = r11.getDimensionPixelSize(r12, r6)
            float r12 = (float) r12
            com.google.android.material.appbar.g.b(r9, r12)
        L_0x00ab:
            int r12 = Ea.C9078l.f60033n
            boolean r12 = r11.hasValue(r12)
            if (r12 == 0) goto L_0x00bc
            int r12 = Ea.C9078l.f60033n
            boolean r12 = r11.getBoolean(r12, r6)
            r9.setKeyboardNavigationCluster(r12)
        L_0x00bc:
            int r12 = Ea.C9078l.f60022m
            boolean r12 = r11.hasValue(r12)
            if (r12 == 0) goto L_0x00cd
            int r12 = Ea.C9078l.f60022m
            boolean r12 = r11.getBoolean(r12, r6)
            r9.setTouchscreenBlocksFocus(r12)
        L_0x00cd:
            android.content.res.Resources r12 = r9.getResources()
            int r0 = Ea.C9070d.f59398a
            float r12 = r12.getDimension(r0)
            r9.f65928x = r12
            int r12 = Ea.C9078l.f60066q
            boolean r12 = r11.getBoolean(r12, r6)
            r9.f65916l = r12
            int r12 = Ea.C9078l.f60088s
            int r10 = r11.getResourceId(r12, r10)
            r9.f65917m = r10
            int r10 = Ea.C9078l.f60099t
            android.graphics.drawable.Drawable r10 = r11.getDrawable(r10)
            r9.setStatusBarForeground(r10)
            r11.recycle()
            com.google.android.material.appbar.AppBarLayout$a r10 = new com.google.android.material.appbar.AppBarLayout$a
            r10.<init>()
            I2.C4600b0.E0(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setExpanded(boolean z10, boolean z11) {
        v(z10, z11, true);
    }

    public static class e extends LinearLayout.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        int f65949a = 1;

        /* renamed from: b  reason: collision with root package name */
        private c f65950b;

        /* renamed from: c  reason: collision with root package name */
        Interpolator f65951c;

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9078l.f60121v);
            this.f65949a = obtainStyledAttributes.getInt(C9078l.f60143x, 0);
            f(obtainStyledAttributes.getInt(C9078l.f60132w, 0));
            if (obtainStyledAttributes.hasValue(C9078l.f60154y)) {
                this.f65951c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(C9078l.f60154y, 0));
            }
            obtainStyledAttributes.recycle();
        }

        private c a(int i10) {
            if (i10 != 1) {
                return null;
            }
            return new d();
        }

        public c b() {
            return this.f65950b;
        }

        public int c() {
            return this.f65949a;
        }

        public Interpolator d() {
            return this.f65951c;
        }

        /* access modifiers changed from: package-private */
        public boolean e() {
            int i10 = this.f65949a;
            return (i10 & 1) == 1 && (i10 & 10) != 0;
        }

        public void f(int i10) {
            this.f65950b = a(i10);
        }

        public void g(int i10) {
            this.f65949a = i10;
        }

        public e(int i10, int i11) {
            super(i10, i11);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public e(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
