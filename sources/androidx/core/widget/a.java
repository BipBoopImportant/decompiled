package androidx.core.widget;

import I2.C4600b0;
import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

public abstract class a implements View.OnTouchListener {

    /* renamed from: r  reason: collision with root package name */
    private static final int f21201r = ViewConfiguration.getTapTimeout();

    /* renamed from: a  reason: collision with root package name */
    final C0329a f21202a = new C0329a();

    /* renamed from: b  reason: collision with root package name */
    private final Interpolator f21203b = new AccelerateInterpolator();

    /* renamed from: c  reason: collision with root package name */
    final View f21204c;

    /* renamed from: d  reason: collision with root package name */
    private Runnable f21205d;

    /* renamed from: e  reason: collision with root package name */
    private float[] f21206e = {0.0f, 0.0f};

    /* renamed from: f  reason: collision with root package name */
    private float[] f21207f = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: g  reason: collision with root package name */
    private int f21208g;

    /* renamed from: h  reason: collision with root package name */
    private int f21209h;

    /* renamed from: i  reason: collision with root package name */
    private float[] f21210i = {0.0f, 0.0f};

    /* renamed from: j  reason: collision with root package name */
    private float[] f21211j = {0.0f, 0.0f};

    /* renamed from: k  reason: collision with root package name */
    private float[] f21212k = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: l  reason: collision with root package name */
    private boolean f21213l;

    /* renamed from: m  reason: collision with root package name */
    boolean f21214m;

    /* renamed from: n  reason: collision with root package name */
    boolean f21215n;

    /* renamed from: o  reason: collision with root package name */
    boolean f21216o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f21217p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f21218q;

    /* renamed from: androidx.core.widget.a$a  reason: collision with other inner class name */
    private static class C0329a {

        /* renamed from: a  reason: collision with root package name */
        private int f21219a;

        /* renamed from: b  reason: collision with root package name */
        private int f21220b;

        /* renamed from: c  reason: collision with root package name */
        private float f21221c;

        /* renamed from: d  reason: collision with root package name */
        private float f21222d;

        /* renamed from: e  reason: collision with root package name */
        private long f21223e = Long.MIN_VALUE;

        /* renamed from: f  reason: collision with root package name */
        private long f21224f = 0;

        /* renamed from: g  reason: collision with root package name */
        private int f21225g = 0;

        /* renamed from: h  reason: collision with root package name */
        private int f21226h = 0;

        /* renamed from: i  reason: collision with root package name */
        private long f21227i = -1;

        /* renamed from: j  reason: collision with root package name */
        private float f21228j;

        /* renamed from: k  reason: collision with root package name */
        private int f21229k;

        C0329a() {
        }

        private float e(long j10) {
            long j11 = this.f21223e;
            if (j10 < j11) {
                return 0.0f;
            }
            long j12 = this.f21227i;
            if (j12 < 0 || j10 < j12) {
                return a.e(((float) (j10 - j11)) / ((float) this.f21219a), 0.0f, 1.0f) * 0.5f;
            }
            float f10 = this.f21228j;
            return (1.0f - f10) + (f10 * a.e(((float) (j10 - j12)) / ((float) this.f21229k), 0.0f, 1.0f));
        }

        private float g(float f10) {
            return (-4.0f * f10 * f10) + (f10 * 4.0f);
        }

        public void a() {
            if (this.f21224f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float g10 = g(e(currentAnimationTimeMillis));
                this.f21224f = currentAnimationTimeMillis;
                float f10 = ((float) (currentAnimationTimeMillis - this.f21224f)) * g10;
                this.f21225g = (int) (this.f21221c * f10);
                this.f21226h = (int) (f10 * this.f21222d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        public int b() {
            return this.f21225g;
        }

        public int c() {
            return this.f21226h;
        }

        public int d() {
            float f10 = this.f21221c;
            return (int) (f10 / Math.abs(f10));
        }

        public int f() {
            float f10 = this.f21222d;
            return (int) (f10 / Math.abs(f10));
        }

        public boolean h() {
            return this.f21227i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f21227i + ((long) this.f21229k);
        }

        public void i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f21229k = a.f((int) (currentAnimationTimeMillis - this.f21223e), 0, this.f21220b);
            this.f21228j = e(currentAnimationTimeMillis);
            this.f21227i = currentAnimationTimeMillis;
        }

        public void j(int i10) {
            this.f21220b = i10;
        }

        public void k(int i10) {
            this.f21219a = i10;
        }

        public void l(float f10, float f11) {
            this.f21221c = f10;
            this.f21222d = f11;
        }

        public void m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f21223e = currentAnimationTimeMillis;
            this.f21227i = -1;
            this.f21224f = currentAnimationTimeMillis;
            this.f21228j = 0.5f;
            this.f21225g = 0;
            this.f21226h = 0;
        }
    }

    private class b implements Runnable {
        b() {
        }

        public void run() {
            a aVar = a.this;
            if (aVar.f21216o) {
                if (aVar.f21214m) {
                    aVar.f21214m = false;
                    aVar.f21202a.m();
                }
                C0329a aVar2 = a.this.f21202a;
                if (aVar2.h() || !a.this.u()) {
                    a.this.f21216o = false;
                    return;
                }
                a aVar3 = a.this;
                if (aVar3.f21215n) {
                    aVar3.f21215n = false;
                    aVar3.c();
                }
                aVar2.a();
                a.this.j(aVar2.b(), aVar2.c());
                C4600b0.g0(a.this.f21204c, this);
            }
        }
    }

    public a(View view) {
        this.f21204c = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = (float) ((int) ((1575.0f * f10) + 0.5f));
        o(f11, f11);
        float f12 = (float) ((int) ((f10 * 315.0f) + 0.5f));
        p(f12, f12);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(f21201r);
        r(500);
        q(500);
    }

    private float d(int i10, float f10, float f11, float f12) {
        float h10 = h(this.f21206e[i10], f11, this.f21207f[i10], f10);
        int i11 = (h10 > 0.0f ? 1 : (h10 == 0.0f ? 0 : -1));
        if (i11 == 0) {
            return 0.0f;
        }
        float f13 = this.f21210i[i10];
        float f14 = this.f21211j[i10];
        float f15 = this.f21212k[i10];
        float f16 = f13 * f12;
        return i11 > 0 ? e(h10 * f16, f14, f15) : -e((-h10) * f16, f14, f15);
    }

    static float e(float f10, float f11, float f12) {
        return f10 > f12 ? f12 : f10 < f11 ? f11 : f10;
    }

    static int f(int i10, int i11, int i12) {
        return i10 > i12 ? i12 : i10 < i11 ? i11 : i10;
    }

    private float g(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f21208g;
        if (i10 == 0 || i10 == 1) {
            if (f10 < f11) {
                return f10 >= 0.0f ? 1.0f - (f10 / f11) : (!this.f21216o || i10 != 1) ? 0.0f : 1.0f;
            }
        } else if (i10 == 2 && f10 < 0.0f) {
            return f10 / (-f11);
        }
    }

    private float h(float f10, float f11, float f12, float f13) {
        float f14;
        float e10 = e(f10 * f11, 0.0f, f12);
        float g10 = g(f11 - f13, e10) - g(f13, e10);
        if (g10 < 0.0f) {
            f14 = -this.f21203b.getInterpolation(-g10);
        } else if (g10 <= 0.0f) {
            return 0.0f;
        } else {
            f14 = this.f21203b.getInterpolation(g10);
        }
        return e(f14, -1.0f, 1.0f);
    }

    private void i() {
        if (this.f21214m) {
            this.f21216o = false;
        } else {
            this.f21202a.i();
        }
    }

    private void v() {
        int i10;
        if (this.f21205d == null) {
            this.f21205d = new b();
        }
        this.f21216o = true;
        this.f21214m = true;
        if (this.f21213l || (i10 = this.f21209h) <= 0) {
            this.f21205d.run();
        } else {
            C4600b0.h0(this.f21204c, this.f21205d, (long) i10);
        }
        this.f21213l = true;
    }

    public abstract boolean a(int i10);

    public abstract boolean b(int i10);

    /* access modifiers changed from: package-private */
    public void c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f21204c.onTouchEvent(obtain);
        obtain.recycle();
    }

    public abstract void j(int i10, int i11);

    public a k(int i10) {
        this.f21209h = i10;
        return this;
    }

    public a l(int i10) {
        this.f21208g = i10;
        return this;
    }

    public a m(boolean z10) {
        if (this.f21217p && !z10) {
            i();
        }
        this.f21217p = z10;
        return this;
    }

    public a n(float f10, float f11) {
        float[] fArr = this.f21207f;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a o(float f10, float f11) {
        float[] fArr = this.f21212k;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f21217p
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x0058
        L_0x0016:
            r5.i()
            goto L_0x0058
        L_0x001a:
            r5.f21215n = r2
            r5.f21213l = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f21204c
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f21204c
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f21202a
            r7.l(r0, r6)
            boolean r6 = r5.f21216o
            if (r6 != 0) goto L_0x0058
            boolean r6 = r5.u()
            if (r6 == 0) goto L_0x0058
            r5.v()
        L_0x0058:
            boolean r6 = r5.f21218q
            if (r6 == 0) goto L_0x0061
            boolean r6 = r5.f21216o
            if (r6 == 0) goto L_0x0061
            r1 = r2
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public a p(float f10, float f11) {
        float[] fArr = this.f21211j;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    public a q(int i10) {
        this.f21202a.j(i10);
        return this;
    }

    public a r(int i10) {
        this.f21202a.k(i10);
        return this;
    }

    public a s(float f10, float f11) {
        float[] fArr = this.f21206e;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a t(float f10, float f11) {
        float[] fArr = this.f21210i;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    /* access modifiers changed from: package-private */
    public boolean u() {
        C0329a aVar = this.f21202a;
        int f10 = aVar.f();
        int d10 = aVar.d();
        return (f10 != 0 && b(f10)) || (d10 != 0 && a(d10));
    }
}
