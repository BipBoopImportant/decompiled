package com.google.android.material.transformation;

import I2.C4600b0;
import Oa.C9153a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public int f67626a = 0;

    class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f67627a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f67628b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C9153a f67629c;

        a(View view, int i10, C9153a aVar) {
            this.f67627a = view;
            this.f67628b = i10;
            this.f67629c = aVar;
        }

        public boolean onPreDraw() {
            this.f67627a.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f67626a == this.f67628b) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                C9153a aVar = this.f67629c;
                expandableBehavior.L((View) aVar, this.f67627a, aVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
    }

    private boolean J(boolean z10) {
        if (!z10) {
            return this.f67626a == 1;
        }
        int i10 = this.f67626a;
        return i10 == 0 || i10 == 2;
    }

    /* access modifiers changed from: protected */
    public C9153a K(CoordinatorLayout coordinatorLayout, View view) {
        List<View> r10 = coordinatorLayout.r(view);
        int size = r10.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = r10.get(i10);
            if (i(coordinatorLayout, view, view2)) {
                return (C9153a) view2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract boolean L(View view, View view2, boolean z10, boolean z11);

    public abstract boolean i(CoordinatorLayout coordinatorLayout, View view, View view2);

    public boolean l(CoordinatorLayout coordinatorLayout, View view, View view2) {
        C9153a aVar = (C9153a) view2;
        if (!J(aVar.a())) {
            return false;
        }
        this.f67626a = aVar.a() ? 1 : 2;
        return L((View) aVar, view, aVar.a(), true);
    }

    public boolean p(CoordinatorLayout coordinatorLayout, View view, int i10) {
        C9153a K10;
        if (C4600b0.S(view) || (K10 = K(coordinatorLayout, view)) == null || !J(K10.a())) {
            return false;
        }
        int i11 = K10.a() ? 1 : 2;
        this.f67626a = i11;
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, i11, K10));
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
