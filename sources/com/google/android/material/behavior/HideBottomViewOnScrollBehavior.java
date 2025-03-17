package com.google.android.material.behavior;

import Ea.C9068b;
import Fa.C9081a;
import Qa.C9242i;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: j  reason: collision with root package name */
    private static final int f65991j = C9068b.f59302H;

    /* renamed from: k  reason: collision with root package name */
    private static final int f65992k = C9068b.f59305K;

    /* renamed from: l  reason: collision with root package name */
    private static final int f65993l = C9068b.f59312R;

    /* renamed from: a  reason: collision with root package name */
    private final LinkedHashSet<b> f65994a = new LinkedHashSet<>();

    /* renamed from: b  reason: collision with root package name */
    private int f65995b;

    /* renamed from: c  reason: collision with root package name */
    private int f65996c;

    /* renamed from: d  reason: collision with root package name */
    private TimeInterpolator f65997d;

    /* renamed from: e  reason: collision with root package name */
    private TimeInterpolator f65998e;

    /* renamed from: f  reason: collision with root package name */
    private int f65999f = 0;

    /* renamed from: g  reason: collision with root package name */
    private int f66000g = 2;

    /* renamed from: h  reason: collision with root package name */
    private int f66001h = 0;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public ViewPropertyAnimator f66002i;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationEnd(Animator animator) {
            ViewPropertyAnimator unused = HideBottomViewOnScrollBehavior.this.f66002i = null;
        }
    }

    public interface b {
        void a(View view, int i10);
    }

    public HideBottomViewOnScrollBehavior() {
    }

    private void J(V v10, int i10, long j10, TimeInterpolator timeInterpolator) {
        this.f66002i = v10.animate().translationY((float) i10).setInterpolator(timeInterpolator).setDuration(j10).setListener(new a());
    }

    private void R(V v10, int i10) {
        this.f66000g = i10;
        Iterator<b> it = this.f65994a.iterator();
        while (it.hasNext()) {
            it.next().a(v10, this.f66000g);
        }
    }

    public boolean E(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
        return i10 == 2;
    }

    public boolean K() {
        return this.f66000g == 1;
    }

    public boolean L() {
        return this.f66000g == 2;
    }

    public void M(V v10, int i10) {
        this.f66001h = i10;
        if (this.f66000g == 1) {
            v10.setTranslationY((float) (this.f65999f + i10));
        }
    }

    public void N(V v10) {
        O(v10, true);
    }

    public void O(V v10, boolean z10) {
        if (!K()) {
            ViewPropertyAnimator viewPropertyAnimator = this.f66002i;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v10.clearAnimation();
            }
            R(v10, 1);
            int i10 = this.f65999f + this.f66001h;
            if (z10) {
                J(v10, i10, (long) this.f65996c, this.f65998e);
                return;
            }
            v10.setTranslationY((float) i10);
        }
    }

    public void P(V v10) {
        Q(v10, true);
    }

    public void Q(V v10, boolean z10) {
        if (!L()) {
            ViewPropertyAnimator viewPropertyAnimator = this.f66002i;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v10.clearAnimation();
            }
            R(v10, 2);
            if (z10) {
                J(v10, 0, (long) this.f65995b, this.f65997d);
                return;
            }
            v10.setTranslationY((float) 0);
        }
    }

    public boolean p(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        this.f65999f = v10.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v10.getLayoutParams()).bottomMargin;
        this.f65995b = C9242i.f(v10.getContext(), f65991j, 225);
        this.f65996c = C9242i.f(v10.getContext(), f65992k, 175);
        Context context = v10.getContext();
        int i11 = f65993l;
        this.f65997d = C9242i.g(context, i11, C9081a.f60374d);
        this.f65998e = C9242i.g(v10.getContext(), i11, C9081a.f60373c);
        return super.p(coordinatorLayout, v10, i10);
    }

    public void x(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i11 > 0) {
            N(v10);
        } else if (i11 < 0) {
            P(v10);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
