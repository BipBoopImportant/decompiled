package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

class j extends RecyclerView.p implements RecyclerView.u {

    /* renamed from: D  reason: collision with root package name */
    private static final int[] f44048D = {16842919};

    /* renamed from: E  reason: collision with root package name */
    private static final int[] f44049E = new int[0];

    /* renamed from: A  reason: collision with root package name */
    int f44050A;

    /* renamed from: B  reason: collision with root package name */
    private final Runnable f44051B;

    /* renamed from: C  reason: collision with root package name */
    private final RecyclerView.v f44052C;

    /* renamed from: a  reason: collision with root package name */
    private final int f44053a;

    /* renamed from: b  reason: collision with root package name */
    private final int f44054b;

    /* renamed from: c  reason: collision with root package name */
    final StateListDrawable f44055c;

    /* renamed from: d  reason: collision with root package name */
    final Drawable f44056d;

    /* renamed from: e  reason: collision with root package name */
    private final int f44057e;

    /* renamed from: f  reason: collision with root package name */
    private final int f44058f;

    /* renamed from: g  reason: collision with root package name */
    private final StateListDrawable f44059g;

    /* renamed from: h  reason: collision with root package name */
    private final Drawable f44060h;

    /* renamed from: i  reason: collision with root package name */
    private final int f44061i;

    /* renamed from: j  reason: collision with root package name */
    private final int f44062j;

    /* renamed from: k  reason: collision with root package name */
    int f44063k;

    /* renamed from: l  reason: collision with root package name */
    int f44064l;

    /* renamed from: m  reason: collision with root package name */
    float f44065m;

    /* renamed from: n  reason: collision with root package name */
    int f44066n;

    /* renamed from: o  reason: collision with root package name */
    int f44067o;

    /* renamed from: p  reason: collision with root package name */
    float f44068p;

    /* renamed from: q  reason: collision with root package name */
    private int f44069q = 0;

    /* renamed from: r  reason: collision with root package name */
    private int f44070r = 0;

    /* renamed from: s  reason: collision with root package name */
    private RecyclerView f44071s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f44072t = false;

    /* renamed from: u  reason: collision with root package name */
    private boolean f44073u = false;

    /* renamed from: v  reason: collision with root package name */
    private int f44074v = 0;

    /* renamed from: w  reason: collision with root package name */
    private int f44075w = 0;

    /* renamed from: x  reason: collision with root package name */
    private final int[] f44076x = new int[2];

    /* renamed from: y  reason: collision with root package name */
    private final int[] f44077y = new int[2];

    /* renamed from: z  reason: collision with root package name */
    final ValueAnimator f44078z;

    class a implements Runnable {
        a() {
        }

        public void run() {
            j.this.s(500);
        }
    }

    class b extends RecyclerView.v {
        b() {
        }

        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            j.this.D(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    private class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private boolean f44081a = false;

        c() {
        }

        public void onAnimationCancel(Animator animator) {
            this.f44081a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f44081a) {
                this.f44081a = false;
            } else if (((Float) j.this.f44078z.getAnimatedValue()).floatValue() == 0.0f) {
                j jVar = j.this;
                jVar.f44050A = 0;
                jVar.A(0);
            } else {
                j jVar2 = j.this;
                jVar2.f44050A = 2;
                jVar2.x();
            }
        }
    }

    private class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            j.this.f44055c.setAlpha(floatValue);
            j.this.f44056d.setAlpha(floatValue);
            j.this.x();
        }
    }

    j(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f44078z = ofFloat;
        this.f44050A = 0;
        this.f44051B = new a();
        this.f44052C = new b();
        this.f44055c = stateListDrawable;
        this.f44056d = drawable;
        this.f44059g = stateListDrawable2;
        this.f44060h = drawable2;
        this.f44057e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f44058f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f44061i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f44062j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f44053a = i11;
        this.f44054b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        l(recyclerView);
    }

    private void B() {
        this.f44071s.j(this);
        this.f44071s.m(this);
        this.f44071s.n(this.f44052C);
    }

    private void E(float f10) {
        int[] r10 = r();
        float max = Math.max((float) r10[0], Math.min((float) r10[1], f10));
        if (Math.abs(((float) this.f44064l) - max) >= 2.0f) {
            int z10 = z(this.f44065m, max, r10, this.f44071s.computeVerticalScrollRange(), this.f44071s.computeVerticalScrollOffset(), this.f44070r);
            if (z10 != 0) {
                this.f44071s.scrollBy(0, z10);
            }
            this.f44065m = max;
        }
    }

    private void m() {
        this.f44071s.removeCallbacks(this.f44051B);
    }

    private void n() {
        this.f44071s.k1(this);
        this.f44071s.m1(this);
        this.f44071s.n1(this.f44052C);
        m();
    }

    private void o(Canvas canvas) {
        int i10 = this.f44070r;
        int i11 = this.f44061i;
        int i12 = i10 - i11;
        int i13 = this.f44067o;
        int i14 = this.f44066n;
        int i15 = i13 - (i14 / 2);
        this.f44059g.setBounds(0, 0, i14, i11);
        this.f44060h.setBounds(0, 0, this.f44069q, this.f44062j);
        canvas.translate(0.0f, (float) i12);
        this.f44060h.draw(canvas);
        canvas.translate((float) i15, 0.0f);
        this.f44059g.draw(canvas);
        canvas.translate((float) (-i15), (float) (-i12));
    }

    private void p(Canvas canvas) {
        int i10 = this.f44069q;
        int i11 = this.f44057e;
        int i12 = i10 - i11;
        int i13 = this.f44064l;
        int i14 = this.f44063k;
        int i15 = i13 - (i14 / 2);
        this.f44055c.setBounds(0, 0, i11, i14);
        this.f44056d.setBounds(0, 0, this.f44058f, this.f44070r);
        if (u()) {
            this.f44056d.draw(canvas);
            canvas.translate((float) this.f44057e, (float) i15);
            canvas.scale(-1.0f, 1.0f);
            this.f44055c.draw(canvas);
            canvas.scale(-1.0f, 1.0f);
            canvas.translate((float) (-this.f44057e), (float) (-i15));
            return;
        }
        canvas.translate((float) i12, 0.0f);
        this.f44056d.draw(canvas);
        canvas.translate(0.0f, (float) i15);
        this.f44055c.draw(canvas);
        canvas.translate((float) (-i12), (float) (-i15));
    }

    private int[] q() {
        int[] iArr = this.f44077y;
        int i10 = this.f44054b;
        iArr[0] = i10;
        iArr[1] = this.f44069q - i10;
        return iArr;
    }

    private int[] r() {
        int[] iArr = this.f44076x;
        int i10 = this.f44054b;
        iArr[0] = i10;
        iArr[1] = this.f44070r - i10;
        return iArr;
    }

    private void t(float f10) {
        int[] q10 = q();
        float max = Math.max((float) q10[0], Math.min((float) q10[1], f10));
        if (Math.abs(((float) this.f44067o) - max) >= 2.0f) {
            int z10 = z(this.f44068p, max, q10, this.f44071s.computeHorizontalScrollRange(), this.f44071s.computeHorizontalScrollOffset(), this.f44069q);
            if (z10 != 0) {
                this.f44071s.scrollBy(z10, 0);
            }
            this.f44068p = max;
        }
    }

    private boolean u() {
        return this.f44071s.getLayoutDirection() == 1;
    }

    private void y(int i10) {
        m();
        this.f44071s.postDelayed(this.f44051B, (long) i10);
    }

    private int z(float f10, float f11, int[] iArr, int i10, int i11, int i12) {
        int i13 = iArr[1] - iArr[0];
        if (i13 == 0) {
            return 0;
        }
        int i14 = i10 - i12;
        int i15 = (int) (((f11 - f10) / ((float) i13)) * ((float) i14));
        int i16 = i11 + i15;
        if (i16 >= i14 || i16 < 0) {
            return 0;
        }
        return i15;
    }

    /* access modifiers changed from: package-private */
    public void A(int i10) {
        if (i10 == 2 && this.f44074v != 2) {
            this.f44055c.setState(f44048D);
            m();
        }
        if (i10 == 0) {
            x();
        } else {
            C();
        }
        if (this.f44074v == 2 && i10 != 2) {
            this.f44055c.setState(f44049E);
            y(1200);
        } else if (i10 == 1) {
            y(1500);
        }
        this.f44074v = i10;
    }

    public void C() {
        int i10 = this.f44050A;
        if (i10 != 0) {
            if (i10 == 3) {
                this.f44078z.cancel();
            } else {
                return;
            }
        }
        this.f44050A = 1;
        ValueAnimator valueAnimator = this.f44078z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.f44078z.setDuration(500);
        this.f44078z.setStartDelay(0);
        this.f44078z.start();
    }

    /* access modifiers changed from: package-private */
    public void D(int i10, int i11) {
        int computeVerticalScrollRange = this.f44071s.computeVerticalScrollRange();
        int i12 = this.f44070r;
        this.f44072t = computeVerticalScrollRange - i12 > 0 && i12 >= this.f44053a;
        int computeHorizontalScrollRange = this.f44071s.computeHorizontalScrollRange();
        int i13 = this.f44069q;
        boolean z10 = computeHorizontalScrollRange - i13 > 0 && i13 >= this.f44053a;
        this.f44073u = z10;
        boolean z11 = this.f44072t;
        if (z11 || z10) {
            if (z11) {
                float f10 = (float) i12;
                this.f44064l = (int) ((f10 * (((float) i11) + (f10 / 2.0f))) / ((float) computeVerticalScrollRange));
                this.f44063k = Math.min(i12, (i12 * i12) / computeVerticalScrollRange);
            }
            if (this.f44073u) {
                float f11 = (float) i13;
                this.f44067o = (int) ((f11 * (((float) i10) + (f11 / 2.0f))) / ((float) computeHorizontalScrollRange));
                this.f44066n = Math.min(i13, (i13 * i13) / computeHorizontalScrollRange);
            }
            int i14 = this.f44074v;
            if (i14 == 0 || i14 == 1) {
                A(1);
            }
        } else if (this.f44074v != 0) {
            A(0);
        }
    }

    public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f44074v != 0) {
            if (motionEvent.getAction() == 0) {
                boolean w10 = w(motionEvent.getX(), motionEvent.getY());
                boolean v10 = v(motionEvent.getX(), motionEvent.getY());
                if (w10 || v10) {
                    if (v10) {
                        this.f44075w = 1;
                        this.f44068p = (float) ((int) motionEvent.getX());
                    } else if (w10) {
                        this.f44075w = 2;
                        this.f44065m = (float) ((int) motionEvent.getY());
                    }
                    A(2);
                }
            } else if (motionEvent.getAction() == 1 && this.f44074v == 2) {
                this.f44065m = 0.0f;
                this.f44068p = 0.0f;
                A(1);
                this.f44075w = 0;
            } else if (motionEvent.getAction() == 2 && this.f44074v == 2) {
                C();
                if (this.f44075w == 1) {
                    t(motionEvent.getX());
                }
                if (this.f44075w == 2) {
                    E(motionEvent.getY());
                }
            }
        }
    }

    public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i10 = this.f44074v;
        if (i10 == 1) {
            boolean w10 = w(motionEvent.getX(), motionEvent.getY());
            boolean v10 = v(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!w10 && !v10) {
                return false;
            }
            if (v10) {
                this.f44075w = 1;
                this.f44068p = (float) ((int) motionEvent.getX());
            } else if (w10) {
                this.f44075w = 2;
                this.f44065m = (float) ((int) motionEvent.getY());
            }
            A(2);
        } else if (i10 != 2) {
            return false;
        }
        return true;
    }

    public void e(boolean z10) {
    }

    public void k(Canvas canvas, RecyclerView recyclerView, RecyclerView.C c10) {
        if (this.f44069q != this.f44071s.getWidth() || this.f44070r != this.f44071s.getHeight()) {
            this.f44069q = this.f44071s.getWidth();
            this.f44070r = this.f44071s.getHeight();
            A(0);
        } else if (this.f44050A != 0) {
            if (this.f44072t) {
                p(canvas);
            }
            if (this.f44073u) {
                o(canvas);
            }
        }
    }

    public void l(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f44071s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                n();
            }
            this.f44071s = recyclerView;
            if (recyclerView != null) {
                B();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void s(int i10) {
        int i11 = this.f44050A;
        if (i11 == 1) {
            this.f44078z.cancel();
        } else if (i11 != 2) {
            return;
        }
        this.f44050A = 3;
        ValueAnimator valueAnimator = this.f44078z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
        this.f44078z.setDuration((long) i10);
        this.f44078z.start();
    }

    /* access modifiers changed from: package-private */
    public boolean v(float f10, float f11) {
        if (f11 >= ((float) (this.f44070r - this.f44061i))) {
            int i10 = this.f44067o;
            int i11 = this.f44066n;
            return f10 >= ((float) (i10 - (i11 / 2))) && f10 <= ((float) (i10 + (i11 / 2)));
        }
    }

    /* access modifiers changed from: package-private */
    public boolean w(float f10, float f11) {
        if (!u() ? f10 >= ((float) (this.f44069q - this.f44057e)) : f10 <= ((float) this.f44057e)) {
            int i10 = this.f44064l;
            int i11 = this.f44063k;
            return f11 >= ((float) (i10 - (i11 / 2))) && f11 <= ((float) (i10 + (i11 / 2)));
        }
    }

    /* access modifiers changed from: package-private */
    public void x() {
        this.f44071s.invalidate();
    }
}
