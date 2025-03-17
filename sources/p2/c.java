package P2;

import I2.C4600b0;
import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

public class c {

    /* renamed from: x  reason: collision with root package name */
    private static final Interpolator f11865x = new a();

    /* renamed from: a  reason: collision with root package name */
    private int f11866a;

    /* renamed from: b  reason: collision with root package name */
    private int f11867b;

    /* renamed from: c  reason: collision with root package name */
    private int f11868c = -1;

    /* renamed from: d  reason: collision with root package name */
    private float[] f11869d;

    /* renamed from: e  reason: collision with root package name */
    private float[] f11870e;

    /* renamed from: f  reason: collision with root package name */
    private float[] f11871f;

    /* renamed from: g  reason: collision with root package name */
    private float[] f11872g;

    /* renamed from: h  reason: collision with root package name */
    private int[] f11873h;

    /* renamed from: i  reason: collision with root package name */
    private int[] f11874i;

    /* renamed from: j  reason: collision with root package name */
    private int[] f11875j;

    /* renamed from: k  reason: collision with root package name */
    private int f11876k;

    /* renamed from: l  reason: collision with root package name */
    private VelocityTracker f11877l;

    /* renamed from: m  reason: collision with root package name */
    private float f11878m;

    /* renamed from: n  reason: collision with root package name */
    private float f11879n;

    /* renamed from: o  reason: collision with root package name */
    private int f11880o;

    /* renamed from: p  reason: collision with root package name */
    private final int f11881p;

    /* renamed from: q  reason: collision with root package name */
    private int f11882q;

    /* renamed from: r  reason: collision with root package name */
    private OverScroller f11883r;

    /* renamed from: s  reason: collision with root package name */
    private final C0179c f11884s;

    /* renamed from: t  reason: collision with root package name */
    private View f11885t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f11886u;

    /* renamed from: v  reason: collision with root package name */
    private final ViewGroup f11887v;

    /* renamed from: w  reason: collision with root package name */
    private final Runnable f11888w = new b();

    class a implements Interpolator {
        a() {
        }

        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            c.this.K(0);
        }
    }

    /* renamed from: P2.c$c  reason: collision with other inner class name */
    public static abstract class C0179c {
        public abstract int a(View view, int i10, int i11);

        public abstract int b(View view, int i10, int i11);

        public int c(int i10) {
            return i10;
        }

        public int d(View view) {
            return 0;
        }

        public int e(View view) {
            return 0;
        }

        public void f(int i10, int i11) {
        }

        public boolean g(int i10) {
            return false;
        }

        public void h(int i10, int i11) {
        }

        public void i(View view, int i10) {
        }

        public abstract void j(int i10);

        public abstract void k(View view, int i10, int i11, int i12, int i13);

        public abstract void l(View view, float f10, float f11);

        public abstract boolean m(View view, int i10);
    }

    private c(Context context, ViewGroup viewGroup, C0179c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (cVar != null) {
            this.f11887v = viewGroup;
            this.f11884s = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int i10 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f11881p = i10;
            this.f11880o = i10;
            this.f11867b = viewConfiguration.getScaledTouchSlop();
            this.f11878m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f11879n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f11883r = new OverScroller(context, f11865x);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    private boolean D(int i10) {
        if (C(i10)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i10 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    private void G() {
        this.f11877l.computeCurrentVelocity(1000, this.f11878m);
        p(g(this.f11877l.getXVelocity(this.f11868c), this.f11879n, this.f11878m), g(this.f11877l.getYVelocity(this.f11868c), this.f11879n, this.f11878m));
    }

    private void H(float f10, float f11, int i10) {
        boolean c10 = c(f10, f11, i10, 1);
        if (c(f11, f10, i10, 4)) {
            c10 |= true;
        }
        if (c(f10, f11, i10, 2)) {
            c10 |= true;
        }
        if (c(f11, f10, i10, 8)) {
            c10 |= true;
        }
        if (c10) {
            int[] iArr = this.f11874i;
            iArr[i10] = iArr[i10] | c10;
            this.f11884s.f(c10 ? 1 : 0, i10);
        }
    }

    private void I(float f10, float f11, int i10) {
        s(i10);
        float[] fArr = this.f11869d;
        this.f11871f[i10] = f10;
        fArr[i10] = f10;
        float[] fArr2 = this.f11870e;
        this.f11872g[i10] = f11;
        fArr2[i10] = f11;
        this.f11873h[i10] = y((int) f10, (int) f11);
        this.f11876k |= 1 << i10;
    }

    private void J(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (D(pointerId)) {
                float x10 = motionEvent.getX(i10);
                float y10 = motionEvent.getY(i10);
                this.f11871f[pointerId] = x10;
                this.f11872g[pointerId] = y10;
            }
        }
    }

    private boolean c(float f10, float f11, int i10, int i11) {
        float abs = Math.abs(f10);
        float abs2 = Math.abs(f11);
        if ((this.f11873h[i10] & i11) != i11 || (this.f11882q & i11) == 0 || (this.f11875j[i10] & i11) == i11 || (this.f11874i[i10] & i11) == i11) {
            return false;
        }
        int i12 = this.f11867b;
        if (abs <= ((float) i12) && abs2 <= ((float) i12)) {
            return false;
        }
        if (abs >= abs2 * 0.5f || !this.f11884s.g(i11)) {
            return (this.f11874i[i10] & i11) == 0 && abs > ((float) this.f11867b);
        }
        int[] iArr = this.f11875j;
        iArr[i10] = iArr[i10] | i11;
        return false;
    }

    private boolean f(View view, float f10, float f11) {
        if (view == null) {
            return false;
        }
        boolean z10 = this.f11884s.d(view) > 0;
        boolean z11 = this.f11884s.e(view) > 0;
        if (!z10 || !z11) {
            return z10 ? Math.abs(f10) > ((float) this.f11867b) : z11 && Math.abs(f11) > ((float) this.f11867b);
        }
        int i10 = this.f11867b;
        return (f10 * f10) + (f11 * f11) > ((float) (i10 * i10));
    }

    private float g(float f10, float f11, float f12) {
        float abs = Math.abs(f10);
        if (abs < f11) {
            return 0.0f;
        }
        return abs > f12 ? f10 > 0.0f ? f12 : -f12 : f10;
    }

    private int h(int i10, int i11, int i12) {
        int abs = Math.abs(i10);
        if (abs < i11) {
            return 0;
        }
        return abs > i12 ? i10 > 0 ? i12 : -i12 : i10;
    }

    private void i() {
        float[] fArr = this.f11869d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f11870e, 0.0f);
            Arrays.fill(this.f11871f, 0.0f);
            Arrays.fill(this.f11872g, 0.0f);
            Arrays.fill(this.f11873h, 0);
            Arrays.fill(this.f11874i, 0);
            Arrays.fill(this.f11875j, 0);
            this.f11876k = 0;
        }
    }

    private void j(int i10) {
        if (this.f11869d != null && C(i10)) {
            this.f11869d[i10] = 0.0f;
            this.f11870e[i10] = 0.0f;
            this.f11871f[i10] = 0.0f;
            this.f11872g[i10] = 0.0f;
            this.f11873h[i10] = 0;
            this.f11874i[i10] = 0;
            this.f11875j[i10] = 0;
            this.f11876k = (~(1 << i10)) & this.f11876k;
        }
    }

    private int k(int i10, int i11, int i12) {
        if (i10 == 0) {
            return 0;
        }
        int width = this.f11887v.getWidth();
        float f10 = (float) (width / 2);
        float q10 = f10 + (q(Math.min(1.0f, ((float) Math.abs(i10)) / ((float) width))) * f10);
        int abs = Math.abs(i11);
        return Math.min(abs > 0 ? Math.round(Math.abs(q10 / ((float) abs)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i10)) / ((float) i12)) + 1.0f) * 256.0f), 600);
    }

    private int l(View view, int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float f12;
        float f13;
        int h10 = h(i12, (int) this.f11879n, (int) this.f11878m);
        int h11 = h(i13, (int) this.f11879n, (int) this.f11878m);
        int abs = Math.abs(i10);
        int abs2 = Math.abs(i11);
        int abs3 = Math.abs(h10);
        int abs4 = Math.abs(h11);
        int i14 = abs3 + abs4;
        int i15 = abs + abs2;
        if (h10 != 0) {
            f10 = (float) abs3;
            f11 = (float) i14;
        } else {
            f10 = (float) abs;
            f11 = (float) i15;
        }
        float f14 = f10 / f11;
        if (h11 != 0) {
            f12 = (float) abs4;
            f13 = (float) i14;
        } else {
            f12 = (float) abs2;
            f13 = (float) i15;
        }
        float f15 = f12 / f13;
        return (int) ((((float) k(i10, h10, this.f11884s.d(view))) * f14) + (((float) k(i11, h11, this.f11884s.e(view))) * f15));
    }

    public static c n(ViewGroup viewGroup, float f10, C0179c cVar) {
        c o10 = o(viewGroup, cVar);
        o10.f11867b = (int) (((float) o10.f11867b) * (1.0f / f10));
        return o10;
    }

    public static c o(ViewGroup viewGroup, C0179c cVar) {
        return new c(viewGroup.getContext(), viewGroup, cVar);
    }

    private void p(float f10, float f11) {
        this.f11886u = true;
        this.f11884s.l(this.f11885t, f10, f11);
        this.f11886u = false;
        if (this.f11866a == 1) {
            K(0);
        }
    }

    private float q(float f10) {
        return (float) Math.sin((double) ((f10 - 0.5f) * 0.47123894f));
    }

    private void r(int i10, int i11, int i12, int i13) {
        int left = this.f11885t.getLeft();
        int top = this.f11885t.getTop();
        if (i12 != 0) {
            i10 = this.f11884s.a(this.f11885t, i10, i12);
            C4600b0.Y(this.f11885t, i10 - left);
        }
        int i14 = i10;
        if (i13 != 0) {
            i11 = this.f11884s.b(this.f11885t, i11, i13);
            C4600b0.Z(this.f11885t, i11 - top);
        }
        int i15 = i11;
        if (i12 != 0 || i13 != 0) {
            this.f11884s.k(this.f11885t, i14, i15, i14 - left, i15 - top);
        }
    }

    private void s(int i10) {
        float[] fArr = this.f11869d;
        if (fArr == null || fArr.length <= i10) {
            int i11 = i10 + 1;
            float[] fArr2 = new float[i11];
            float[] fArr3 = new float[i11];
            float[] fArr4 = new float[i11];
            float[] fArr5 = new float[i11];
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f11870e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f11871f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f11872g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f11873h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f11874i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f11875j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f11869d = fArr2;
            this.f11870e = fArr3;
            this.f11871f = fArr4;
            this.f11872g = fArr5;
            this.f11873h = iArr;
            this.f11874i = iArr2;
            this.f11875j = iArr3;
        }
    }

    private boolean u(int i10, int i11, int i12, int i13) {
        int left = this.f11885t.getLeft();
        int top = this.f11885t.getTop();
        int i14 = i10 - left;
        int i15 = i11 - top;
        if (i14 == 0 && i15 == 0) {
            this.f11883r.abortAnimation();
            K(0);
            return false;
        }
        this.f11883r.startScroll(left, top, i14, i15, l(this.f11885t, i14, i15, i12, i13));
        K(2);
        return true;
    }

    private int y(int i10, int i11) {
        int i12 = i10 < this.f11887v.getLeft() + this.f11880o ? 1 : 0;
        if (i11 < this.f11887v.getTop() + this.f11880o) {
            i12 |= 4;
        }
        if (i10 > this.f11887v.getRight() - this.f11880o) {
            i12 |= 2;
        }
        return i11 > this.f11887v.getBottom() - this.f11880o ? i12 | 8 : i12;
    }

    public int A() {
        return this.f11866a;
    }

    public boolean B(int i10, int i11) {
        return E(this.f11885t, i10, i11);
    }

    public boolean C(int i10) {
        return ((1 << i10) & this.f11876k) != 0;
    }

    public boolean E(View view, int i10, int i11) {
        return view != null && i10 >= view.getLeft() && i10 < view.getRight() && i11 >= view.getTop() && i11 < view.getBottom();
    }

    public void F(MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f11877l == null) {
            this.f11877l = VelocityTracker.obtain();
        }
        this.f11877l.addMovement(motionEvent);
        int i11 = 0;
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View t10 = t((int) x10, (int) y10);
            I(x10, y10, pointerId);
            R(t10, pointerId);
            int i12 = this.f11873h[pointerId];
            int i13 = this.f11882q;
            if ((i12 & i13) != 0) {
                this.f11884s.h(i12 & i13, pointerId);
            }
        } else if (actionMasked == 1) {
            if (this.f11866a == 1) {
                G();
            }
            a();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f11866a == 1) {
                    p(0.0f, 0.0f);
                }
                a();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x11 = motionEvent.getX(actionIndex);
                float y11 = motionEvent.getY(actionIndex);
                I(x11, y11, pointerId2);
                if (this.f11866a == 0) {
                    R(t((int) x11, (int) y11), pointerId2);
                    int i14 = this.f11873h[pointerId2];
                    int i15 = this.f11882q;
                    if ((i14 & i15) != 0) {
                        this.f11884s.h(i14 & i15, pointerId2);
                    }
                } else if (B((int) x11, (int) y11)) {
                    R(this.f11885t, pointerId2);
                }
            } else if (actionMasked == 6) {
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                if (this.f11866a == 1 && pointerId3 == this.f11868c) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (true) {
                        if (i11 >= pointerCount) {
                            i10 = -1;
                            break;
                        }
                        int pointerId4 = motionEvent.getPointerId(i11);
                        if (pointerId4 != this.f11868c) {
                            View t11 = t((int) motionEvent.getX(i11), (int) motionEvent.getY(i11));
                            View view = this.f11885t;
                            if (t11 == view && R(view, pointerId4)) {
                                i10 = this.f11868c;
                                break;
                            }
                        }
                        i11++;
                    }
                    if (i10 == -1) {
                        G();
                    }
                }
                j(pointerId3);
            }
        } else if (this.f11866a != 1) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (i11 < pointerCount2) {
                int pointerId5 = motionEvent.getPointerId(i11);
                if (D(pointerId5)) {
                    float x12 = motionEvent.getX(i11);
                    float y12 = motionEvent.getY(i11);
                    float f10 = x12 - this.f11869d[pointerId5];
                    float f11 = y12 - this.f11870e[pointerId5];
                    H(f10, f11, pointerId5);
                    if (this.f11866a != 1) {
                        View t12 = t((int) x12, (int) y12);
                        if (f(t12, f10, f11) && R(t12, pointerId5)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i11++;
            }
            J(motionEvent);
        } else if (D(this.f11868c)) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f11868c);
            float x13 = motionEvent.getX(findPointerIndex);
            float y13 = motionEvent.getY(findPointerIndex);
            float[] fArr = this.f11871f;
            int i16 = this.f11868c;
            int i17 = (int) (x13 - fArr[i16]);
            int i18 = (int) (y13 - this.f11872g[i16]);
            r(this.f11885t.getLeft() + i17, this.f11885t.getTop() + i18, i17, i18);
            J(motionEvent);
        }
    }

    /* access modifiers changed from: package-private */
    public void K(int i10) {
        this.f11887v.removeCallbacks(this.f11888w);
        if (this.f11866a != i10) {
            this.f11866a = i10;
            this.f11884s.j(i10);
            if (this.f11866a == 0) {
                this.f11885t = null;
            }
        }
    }

    public void L(int i10) {
        this.f11880o = i10;
    }

    public void M(int i10) {
        this.f11882q = i10;
    }

    public void N(float f10) {
        this.f11879n = f10;
    }

    public boolean O(int i10, int i11) {
        if (this.f11886u) {
            return u(i10, i11, (int) this.f11877l.getXVelocity(this.f11868c), (int) this.f11877l.getYVelocity(this.f11868c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dd, code lost:
        if (r12 != r11) goto L_0x00e6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean P(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            int r3 = r17.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r16.a()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.f11877l
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f11877l = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.f11877l
            r4.addMovement(r1)
            r4 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0104
            if (r2 == r6) goto L_0x00ff
            if (r2 == r4) goto L_0x0070
            r7 = 3
            if (r2 == r7) goto L_0x00ff
            r7 = 5
            if (r2 == r7) goto L_0x003c
            r4 = 6
            if (r2 == r4) goto L_0x0034
        L_0x0031:
            r5 = 0
            goto L_0x0135
        L_0x0034:
            int r1 = r1.getPointerId(r3)
            r0.j(r1)
            goto L_0x0031
        L_0x003c:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.I(r7, r1, r2)
            int r3 = r0.f11866a
            if (r3 != 0) goto L_0x0060
            int[] r1 = r0.f11873h
            r1 = r1[r2]
            int r3 = r0.f11882q
            r4 = r1 & r3
            if (r4 == 0) goto L_0x0031
            P2.c$c r4 = r0.f11884s
            r1 = r1 & r3
            r4.h(r1, r2)
            goto L_0x0031
        L_0x0060:
            if (r3 != r4) goto L_0x0031
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.t(r3, r1)
            android.view.View r3 = r0.f11885t
            if (r1 != r3) goto L_0x0031
            r0.R(r1, r2)
            goto L_0x0031
        L_0x0070:
            float[] r2 = r0.f11869d
            if (r2 == 0) goto L_0x0031
            float[] r2 = r0.f11870e
            if (r2 != 0) goto L_0x0079
            goto L_0x0031
        L_0x0079:
            int r2 = r17.getPointerCount()
            r3 = 0
        L_0x007e:
            if (r3 >= r2) goto L_0x00fa
            int r4 = r1.getPointerId(r3)
            boolean r7 = r0.D(r4)
            if (r7 != 0) goto L_0x008c
            goto L_0x00f7
        L_0x008c:
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.f11869d
            r9 = r9[r4]
            float r9 = r7 - r9
            float[] r10 = r0.f11870e
            r10 = r10[r4]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.t(r7, r8)
            if (r7 == 0) goto L_0x00b0
            boolean r8 = r0.f(r7, r9, r10)
            if (r8 == 0) goto L_0x00b0
            r8 = r6
            goto L_0x00b1
        L_0x00b0:
            r8 = 0
        L_0x00b1:
            if (r8 == 0) goto L_0x00e6
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r13 = r11 + r12
            P2.c$c r14 = r0.f11884s
            int r12 = r14.a(r7, r13, r12)
            int r13 = r7.getTop()
            int r14 = (int) r10
            int r15 = r13 + r14
            P2.c$c r5 = r0.f11884s
            int r5 = r5.b(r7, r15, r14)
            P2.c$c r14 = r0.f11884s
            int r14 = r14.d(r7)
            P2.c$c r15 = r0.f11884s
            int r15 = r15.e(r7)
            if (r14 == 0) goto L_0x00df
            if (r14 <= 0) goto L_0x00e6
            if (r12 != r11) goto L_0x00e6
        L_0x00df:
            if (r15 == 0) goto L_0x00fa
            if (r15 <= 0) goto L_0x00e6
            if (r5 != r13) goto L_0x00e6
            goto L_0x00fa
        L_0x00e6:
            r0.H(r9, r10, r4)
            int r5 = r0.f11866a
            if (r5 != r6) goto L_0x00ee
            goto L_0x00fa
        L_0x00ee:
            if (r8 == 0) goto L_0x00f7
            boolean r4 = r0.R(r7, r4)
            if (r4 == 0) goto L_0x00f7
            goto L_0x00fa
        L_0x00f7:
            int r3 = r3 + 1
            goto L_0x007e
        L_0x00fa:
            r16.J(r17)
            goto L_0x0031
        L_0x00ff:
            r16.a()
            goto L_0x0031
        L_0x0104:
            float r2 = r17.getX()
            float r3 = r17.getY()
            r5 = 0
            int r1 = r1.getPointerId(r5)
            r0.I(r2, r3, r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.t(r2, r3)
            android.view.View r3 = r0.f11885t
            if (r2 != r3) goto L_0x0125
            int r3 = r0.f11866a
            if (r3 != r4) goto L_0x0125
            r0.R(r2, r1)
        L_0x0125:
            int[] r2 = r0.f11873h
            r2 = r2[r1]
            int r3 = r0.f11882q
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0135
            P2.c$c r4 = r0.f11884s
            r2 = r2 & r3
            r4.h(r2, r1)
        L_0x0135:
            int r1 = r0.f11866a
            if (r1 != r6) goto L_0x013a
            r5 = r6
        L_0x013a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: P2.c.P(android.view.MotionEvent):boolean");
    }

    public boolean Q(View view, int i10, int i11) {
        this.f11885t = view;
        this.f11868c = -1;
        boolean u10 = u(i10, i11, 0, 0);
        if (!u10 && this.f11866a == 0 && this.f11885t != null) {
            this.f11885t = null;
        }
        return u10;
    }

    /* access modifiers changed from: package-private */
    public boolean R(View view, int i10) {
        if (view == this.f11885t && this.f11868c == i10) {
            return true;
        }
        if (view == null || !this.f11884s.m(view, i10)) {
            return false;
        }
        this.f11868c = i10;
        b(view, i10);
        return true;
    }

    public void a() {
        this.f11868c = -1;
        i();
        VelocityTracker velocityTracker = this.f11877l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f11877l = null;
        }
    }

    public void b(View view, int i10) {
        if (view.getParent() == this.f11887v) {
            this.f11885t = view;
            this.f11868c = i10;
            this.f11884s.i(view, i10);
            K(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f11887v + ")");
    }

    public boolean d(int i10) {
        int length = this.f11869d.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (e(i10, i11)) {
                return true;
            }
        }
        return false;
    }

    public boolean e(int i10, int i11) {
        if (!C(i11)) {
            return false;
        }
        boolean z10 = (i10 & 1) == 1;
        boolean z11 = (i10 & 2) == 2;
        float f10 = this.f11871f[i11] - this.f11869d[i11];
        float f11 = this.f11872g[i11] - this.f11870e[i11];
        if (!z10 || !z11) {
            return z10 ? Math.abs(f10) > ((float) this.f11867b) : z11 && Math.abs(f11) > ((float) this.f11867b);
        }
        int i12 = this.f11867b;
        return (f10 * f10) + (f11 * f11) > ((float) (i12 * i12));
    }

    public boolean m(boolean z10) {
        if (this.f11866a == 2) {
            boolean computeScrollOffset = this.f11883r.computeScrollOffset();
            int currX = this.f11883r.getCurrX();
            int currY = this.f11883r.getCurrY();
            int left = currX - this.f11885t.getLeft();
            int top = currY - this.f11885t.getTop();
            if (left != 0) {
                C4600b0.Y(this.f11885t, left);
            }
            if (top != 0) {
                C4600b0.Z(this.f11885t, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f11884s.k(this.f11885t, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f11883r.getFinalX() && currY == this.f11883r.getFinalY()) {
                this.f11883r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z10) {
                    this.f11887v.post(this.f11888w);
                } else {
                    K(0);
                }
            }
        }
        return this.f11866a == 2;
    }

    public View t(int i10, int i11) {
        for (int childCount = this.f11887v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f11887v.getChildAt(this.f11884s.c(childCount));
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public View v() {
        return this.f11885t;
    }

    public int w() {
        return this.f11881p;
    }

    public int x() {
        return this.f11880o;
    }

    public int z() {
        return this.f11867b;
    }
}
