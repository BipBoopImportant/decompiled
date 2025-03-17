package com.google.android.material.appbar;

import B2.a;
import I2.C0;
import I2.C4600b0;
import I2.C4632s;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.sugarcube.app.base.data.source.CatalogRepository;
import java.util.List;

abstract class d extends e<View> {

    /* renamed from: d  reason: collision with root package name */
    final Rect f65976d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    final Rect f65977e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    private int f65978f = 0;

    /* renamed from: g  reason: collision with root package name */
    private int f65979g;

    public d() {
    }

    private static int R(int i10) {
        if (i10 == 0) {
            return 8388659;
        }
        return i10;
    }

    /* access modifiers changed from: protected */
    public void J(CoordinatorLayout coordinatorLayout, View view, int i10) {
        View L10 = L(coordinatorLayout.r(view));
        if (L10 != null) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
            Rect rect = this.f65976d;
            rect.set(coordinatorLayout.getPaddingLeft() + fVar.leftMargin, L10.getBottom() + fVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - fVar.rightMargin, ((coordinatorLayout.getHeight() + L10.getBottom()) - coordinatorLayout.getPaddingBottom()) - fVar.bottomMargin);
            C0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && C4600b0.w(coordinatorLayout) && !C4600b0.w(view)) {
                rect.left += lastWindowInsets.k();
                rect.right -= lastWindowInsets.l();
            }
            Rect rect2 = this.f65977e;
            C4632s.a(R(fVar.f20920c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i10);
            int M10 = M(L10);
            view.layout(rect2.left, rect2.top - M10, rect2.right, rect2.bottom - M10);
            this.f65978f = rect2.top - L10.getBottom();
            return;
        }
        super.J(coordinatorLayout, view, i10);
        this.f65978f = 0;
    }

    /* access modifiers changed from: package-private */
    public abstract View L(List<View> list);

    /* access modifiers changed from: package-private */
    public final int M(View view) {
        if (this.f65979g == 0) {
            return 0;
        }
        float N10 = N(view);
        int i10 = this.f65979g;
        return a.c((int) (N10 * ((float) i10)), 0, i10);
    }

    /* access modifiers changed from: package-private */
    public float N(View view) {
        return 1.0f;
    }

    public final int O() {
        return this.f65979g;
    }

    /* access modifiers changed from: package-private */
    public int P(View view) {
        return view.getMeasuredHeight();
    }

    /* access modifiers changed from: package-private */
    public final int Q() {
        return this.f65978f;
    }

    public final void S(int i10) {
        this.f65979g = i10;
    }

    /* access modifiers changed from: protected */
    public boolean T() {
        return false;
    }

    public boolean q(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        View L10;
        C0 lastWindowInsets;
        int i14 = view.getLayoutParams().height;
        if ((i14 != -1 && i14 != -2) || (L10 = L(coordinatorLayout.r(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i12);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (C4600b0.w(L10) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.m() + lastWindowInsets.j();
        }
        int P10 = size + P(L10);
        int measuredHeight = L10.getMeasuredHeight();
        if (T()) {
            view.setTranslationY((float) (-measuredHeight));
        } else {
            view.setTranslationY(0.0f);
            P10 -= measuredHeight;
        }
        coordinatorLayout.J(view, i10, i11, View.MeasureSpec.makeMeasureSpec(P10, i14 == -1 ? CatalogRepository.FETCH_FLAG_SDB : Integer.MIN_VALUE), i13);
        return true;
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
