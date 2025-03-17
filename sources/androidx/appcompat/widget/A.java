package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import n.C5577b;

public abstract class A implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final float f15926a;

    /* renamed from: b  reason: collision with root package name */
    private final int f15927b;

    /* renamed from: c  reason: collision with root package name */
    private final int f15928c;

    /* renamed from: d  reason: collision with root package name */
    final View f15929d;

    /* renamed from: e  reason: collision with root package name */
    private Runnable f15930e;

    /* renamed from: f  reason: collision with root package name */
    private Runnable f15931f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f15932g;

    /* renamed from: h  reason: collision with root package name */
    private int f15933h;

    /* renamed from: i  reason: collision with root package name */
    private final int[] f15934i = new int[2];

    private class a implements Runnable {
        a() {
        }

        public void run() {
            ViewParent parent = A.this.f15929d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    private class b implements Runnable {
        b() {
        }

        public void run() {
            A.this.e();
        }
    }

    public A(View view) {
        this.f15929d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f15926a = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f15927b = tapTimeout;
        this.f15928c = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private void a() {
        Runnable runnable = this.f15931f;
        if (runnable != null) {
            this.f15929d.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f15930e;
        if (runnable2 != null) {
            this.f15929d.removeCallbacks(runnable2);
        }
    }

    private boolean f(MotionEvent motionEvent) {
        DropDownListView dropDownListView;
        View view = this.f15929d;
        C5577b b10 = b();
        if (b10 == null || !b10.b() || (dropDownListView = (DropDownListView) b10.p()) == null || !dropDownListView.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        i(view, obtainNoHistory);
        j(dropDownListView, obtainNoHistory);
        boolean e10 = dropDownListView.e(obtainNoHistory, this.f15933h);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return e10 && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r1 != 3) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f15929d
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L_0x0041
            r3 = 1
            if (r1 == r3) goto L_0x003d
            r4 = 2
            if (r1 == r4) goto L_0x001a
            r6 = 3
            if (r1 == r6) goto L_0x003d
            goto L_0x006d
        L_0x001a:
            int r1 = r5.f15933h
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L_0x006d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f15926a
            boolean r6 = h(r0, r4, r6, r1)
            if (r6 != 0) goto L_0x006d
            r5.a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L_0x003d:
            r5.a()
            goto L_0x006d
        L_0x0041:
            int r6 = r6.getPointerId(r2)
            r5.f15933h = r6
            java.lang.Runnable r6 = r5.f15930e
            if (r6 != 0) goto L_0x0052
            androidx.appcompat.widget.A$a r6 = new androidx.appcompat.widget.A$a
            r6.<init>()
            r5.f15930e = r6
        L_0x0052:
            java.lang.Runnable r6 = r5.f15930e
            int r1 = r5.f15927b
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f15931f
            if (r6 != 0) goto L_0x0065
            androidx.appcompat.widget.A$b r6 = new androidx.appcompat.widget.A$b
            r6.<init>()
            r5.f15931f = r6
        L_0x0065:
            java.lang.Runnable r6 = r5.f15931f
            int r1 = r5.f15928c
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.A.g(android.view.MotionEvent):boolean");
    }

    private static boolean h(View view, float f10, float f11, float f12) {
        float f13 = -f12;
        return f10 >= f13 && f11 >= f13 && f10 < ((float) (view.getRight() - view.getLeft())) + f12 && f11 < ((float) (view.getBottom() - view.getTop())) + f12;
    }

    private boolean i(View view, MotionEvent motionEvent) {
        int[] iArr = this.f15934i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
        return true;
    }

    private boolean j(View view, MotionEvent motionEvent) {
        int[] iArr = this.f15934i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
        return true;
    }

    public abstract C5577b b();

    /* access modifiers changed from: protected */
    public abstract boolean c();

    /* access modifiers changed from: protected */
    public boolean d() {
        C5577b b10 = b();
        if (b10 == null || !b10.b()) {
            return true;
        }
        b10.dismiss();
        return true;
    }

    /* access modifiers changed from: package-private */
    public void e() {
        a();
        View view = this.f15929d;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f15932g = true;
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        boolean z11 = this.f15932g;
        if (z11) {
            z10 = f(motionEvent) || !d();
        } else {
            z10 = g(motionEvent) && c();
            if (z10) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f15929d.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f15932g = z10;
        return z10 || z11;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.f15932g = false;
        this.f15933h = -1;
        Runnable runnable = this.f15930e;
        if (runnable != null) {
            this.f15929d.removeCallbacks(runnable);
        }
    }
}
