package com.google.android.material.appbar;

import I2.C4600b0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

abstract class c<V extends View> extends e<V> {

    /* renamed from: d  reason: collision with root package name */
    private Runnable f65966d;

    /* renamed from: e  reason: collision with root package name */
    OverScroller f65967e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f65968f;

    /* renamed from: g  reason: collision with root package name */
    private int f65969g = -1;

    /* renamed from: h  reason: collision with root package name */
    private int f65970h;

    /* renamed from: i  reason: collision with root package name */
    private int f65971i = -1;

    /* renamed from: j  reason: collision with root package name */
    private VelocityTracker f65972j;

    private class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final CoordinatorLayout f65973a;

        /* renamed from: b  reason: collision with root package name */
        private final V f65974b;

        a(CoordinatorLayout coordinatorLayout, V v10) {
            this.f65973a = coordinatorLayout;
            this.f65974b = v10;
        }

        public void run() {
            OverScroller overScroller;
            if (this.f65974b != null && (overScroller = c.this.f65967e) != null) {
                if (overScroller.computeScrollOffset()) {
                    c cVar = c.this;
                    cVar.T(this.f65973a, this.f65974b, cVar.f65967e.getCurrY());
                    C4600b0.g0(this.f65974b, this);
                    return;
                }
                c.this.R(this.f65973a, this.f65974b);
            }
        }
    }

    public c() {
    }

    private void M() {
        if (this.f65972j == null) {
            this.f65972j = VelocityTracker.obtain();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean H(androidx.coordinatorlayout.widget.CoordinatorLayout r12, V r13, android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r14.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L_0x004e
            r4 = 2
            if (r0 == r4) goto L_0x002d
            r12 = 3
            if (r0 == r12) goto L_0x0072
            r12 = 6
            if (r0 == r12) goto L_0x0013
            goto L_0x004c
        L_0x0013:
            int r12 = r14.getActionIndex()
            if (r12 != 0) goto L_0x001b
            r12 = r2
            goto L_0x001c
        L_0x001b:
            r12 = r3
        L_0x001c:
            int r13 = r14.getPointerId(r12)
            r11.f65969g = r13
            float r12 = r14.getY(r12)
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r13
            int r12 = (int) r12
            r11.f65970h = r12
            goto L_0x004c
        L_0x002d:
            int r0 = r11.f65969g
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r1) goto L_0x0036
            return r3
        L_0x0036:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r1 = r11.f65970h
            int r7 = r1 - r0
            r11.f65970h = r0
            int r8 = r11.O(r13)
            r9 = 0
            r4 = r11
            r5 = r12
            r6 = r13
            r4.S(r5, r6, r7, r8, r9)
        L_0x004c:
            r12 = r3
            goto L_0x0081
        L_0x004e:
            android.view.VelocityTracker r0 = r11.f65972j
            if (r0 == 0) goto L_0x0072
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f65972j
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f65972j
            int r4 = r11.f65969g
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.P(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.N(r6, r7, r8, r9, r10)
            r12 = r2
            goto L_0x0073
        L_0x0072:
            r12 = r3
        L_0x0073:
            r11.f65968f = r3
            r11.f65969g = r1
            android.view.VelocityTracker r13 = r11.f65972j
            if (r13 == 0) goto L_0x0081
            r13.recycle()
            r13 = 0
            r11.f65972j = r13
        L_0x0081:
            android.view.VelocityTracker r13 = r11.f65972j
            if (r13 == 0) goto L_0x0088
            r13.addMovement(r14)
        L_0x0088:
            boolean r13 = r11.f65968f
            if (r13 != 0) goto L_0x0090
            if (r12 == 0) goto L_0x008f
            goto L_0x0090
        L_0x008f:
            r2 = r3
        L_0x0090:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.c.H(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public boolean L(V v10) {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean N(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, float f10) {
        V v11 = v10;
        Runnable runnable = this.f65966d;
        if (runnable != null) {
            v10.removeCallbacks(runnable);
            this.f65966d = null;
        }
        if (this.f65967e == null) {
            this.f65967e = new OverScroller(v10.getContext());
        }
        this.f65967e.fling(0, I(), 0, Math.round(f10), 0, 0, i10, i11);
        if (this.f65967e.computeScrollOffset()) {
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            a aVar = new a(coordinatorLayout, v10);
            this.f65966d = aVar;
            C4600b0.g0(v10, aVar);
            return true;
        }
        CoordinatorLayout coordinatorLayout3 = coordinatorLayout;
        R(coordinatorLayout, v10);
        return false;
    }

    /* access modifiers changed from: package-private */
    public int O(V v10) {
        return -v10.getHeight();
    }

    /* access modifiers changed from: package-private */
    public int P(V v10) {
        return v10.getHeight();
    }

    /* access modifiers changed from: package-private */
    public int Q() {
        return I();
    }

    /* access modifiers changed from: package-private */
    public void R(CoordinatorLayout coordinatorLayout, V v10) {
    }

    /* access modifiers changed from: package-private */
    public final int S(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12) {
        return U(coordinatorLayout, v10, Q() - i10, i11, i12);
    }

    /* access modifiers changed from: package-private */
    public int T(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        return U(coordinatorLayout, v10, i10, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* access modifiers changed from: package-private */
    public int U(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12) {
        int c10;
        int I10 = I();
        if (i11 == 0 || I10 < i11 || I10 > i12 || I10 == (c10 = B2.a.c(i10, i11, i12))) {
            return 0;
        }
        K(c10);
        return I10 - c10;
    }

    public boolean o(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f65971i < 0) {
            this.f65971i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f65968f) {
            int i10 = this.f65969g;
            if (i10 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i10)) == -1) {
                return false;
            }
            int y10 = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y10 - this.f65970h) > this.f65971i) {
                this.f65970h = y10;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f65969g = -1;
            int x10 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            boolean z10 = L(v10) && coordinatorLayout.B(v10, x10, y11);
            this.f65968f = z10;
            if (z10) {
                this.f65970h = y11;
                this.f65969g = motionEvent.getPointerId(0);
                M();
                OverScroller overScroller = this.f65967e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f65967e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f65972j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
