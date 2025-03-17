package androidx.swiperefreshlayout.widget;

import H2.i;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

public class a extends Drawable implements Animatable {

    /* renamed from: g  reason: collision with root package name */
    private static final Interpolator f44540g = new LinearInterpolator();

    /* renamed from: h  reason: collision with root package name */
    private static final Interpolator f44541h = new h3.b();

    /* renamed from: i  reason: collision with root package name */
    private static final int[] f44542i = {-16777216};

    /* renamed from: a  reason: collision with root package name */
    private final c f44543a;

    /* renamed from: b  reason: collision with root package name */
    private float f44544b;

    /* renamed from: c  reason: collision with root package name */
    private Resources f44545c;

    /* renamed from: d  reason: collision with root package name */
    private Animator f44546d;

    /* renamed from: e  reason: collision with root package name */
    float f44547e;

    /* renamed from: f  reason: collision with root package name */
    boolean f44548f;

    /* renamed from: androidx.swiperefreshlayout.widget.a$a  reason: collision with other inner class name */
    class C0768a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f44549a;

        C0768a(c cVar) {
            this.f44549a = cVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            a.this.n(floatValue, this.f44549a);
            a.this.b(floatValue, this.f44549a, false);
            a.this.invalidateSelf();
        }
    }

    class b implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f44551a;

        b(c cVar) {
            this.f44551a = cVar;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
        }

        public void onAnimationRepeat(Animator animator) {
            a.this.b(1.0f, this.f44551a, true);
            this.f44551a.A();
            this.f44551a.l();
            a aVar = a.this;
            if (aVar.f44548f) {
                aVar.f44548f = false;
                animator.cancel();
                animator.setDuration(1332);
                animator.start();
                this.f44551a.x(false);
                return;
            }
            aVar.f44547e += 1.0f;
        }

        public void onAnimationStart(Animator animator) {
            a.this.f44547e = 0.0f;
        }
    }

    private static class c {

        /* renamed from: a  reason: collision with root package name */
        final RectF f44553a = new RectF();

        /* renamed from: b  reason: collision with root package name */
        final Paint f44554b;

        /* renamed from: c  reason: collision with root package name */
        final Paint f44555c;

        /* renamed from: d  reason: collision with root package name */
        final Paint f44556d;

        /* renamed from: e  reason: collision with root package name */
        float f44557e;

        /* renamed from: f  reason: collision with root package name */
        float f44558f;

        /* renamed from: g  reason: collision with root package name */
        float f44559g;

        /* renamed from: h  reason: collision with root package name */
        float f44560h;

        /* renamed from: i  reason: collision with root package name */
        int[] f44561i;

        /* renamed from: j  reason: collision with root package name */
        int f44562j;

        /* renamed from: k  reason: collision with root package name */
        float f44563k;

        /* renamed from: l  reason: collision with root package name */
        float f44564l;

        /* renamed from: m  reason: collision with root package name */
        float f44565m;

        /* renamed from: n  reason: collision with root package name */
        boolean f44566n;

        /* renamed from: o  reason: collision with root package name */
        Path f44567o;

        /* renamed from: p  reason: collision with root package name */
        float f44568p;

        /* renamed from: q  reason: collision with root package name */
        float f44569q;

        /* renamed from: r  reason: collision with root package name */
        int f44570r;

        /* renamed from: s  reason: collision with root package name */
        int f44571s;

        /* renamed from: t  reason: collision with root package name */
        int f44572t;

        /* renamed from: u  reason: collision with root package name */
        int f44573u;

        c() {
            Paint paint = new Paint();
            this.f44554b = paint;
            Paint paint2 = new Paint();
            this.f44555c = paint2;
            Paint paint3 = new Paint();
            this.f44556d = paint3;
            this.f44557e = 0.0f;
            this.f44558f = 0.0f;
            this.f44559g = 0.0f;
            this.f44560h = 5.0f;
            this.f44568p = 1.0f;
            this.f44572t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        /* access modifiers changed from: package-private */
        public void A() {
            this.f44563k = this.f44557e;
            this.f44564l = this.f44558f;
            this.f44565m = this.f44559g;
        }

        /* access modifiers changed from: package-private */
        public void a(Canvas canvas, Rect rect) {
            RectF rectF = this.f44553a;
            float f10 = this.f44569q;
            float f11 = (this.f44560h / 2.0f) + f10;
            if (f10 <= 0.0f) {
                f11 = (((float) Math.min(rect.width(), rect.height())) / 2.0f) - Math.max((((float) this.f44570r) * this.f44568p) / 2.0f, this.f44560h / 2.0f);
            }
            rectF.set(((float) rect.centerX()) - f11, ((float) rect.centerY()) - f11, ((float) rect.centerX()) + f11, ((float) rect.centerY()) + f11);
            float f12 = this.f44557e;
            float f13 = this.f44559g;
            float f14 = (f12 + f13) * 360.0f;
            float f15 = ((this.f44558f + f13) * 360.0f) - f14;
            this.f44554b.setColor(this.f44573u);
            this.f44554b.setAlpha(this.f44572t);
            float f16 = this.f44560h / 2.0f;
            rectF.inset(f16, f16);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f44556d);
            float f17 = -f16;
            rectF.inset(f17, f17);
            canvas.drawArc(rectF, f14, f15, false, this.f44554b);
            b(canvas, f14, f15, rectF);
        }

        /* access modifiers changed from: package-private */
        public void b(Canvas canvas, float f10, float f11, RectF rectF) {
            if (this.f44566n) {
                Path path = this.f44567o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f44567o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                this.f44567o.moveTo(0.0f, 0.0f);
                this.f44567o.lineTo(((float) this.f44570r) * this.f44568p, 0.0f);
                Path path3 = this.f44567o;
                float f12 = this.f44568p;
                path3.lineTo((((float) this.f44570r) * f12) / 2.0f, ((float) this.f44571s) * f12);
                this.f44567o.offset(((Math.min(rectF.width(), rectF.height()) / 2.0f) + rectF.centerX()) - ((((float) this.f44570r) * this.f44568p) / 2.0f), rectF.centerY() + (this.f44560h / 2.0f));
                this.f44567o.close();
                this.f44555c.setColor(this.f44573u);
                this.f44555c.setAlpha(this.f44572t);
                canvas.save();
                canvas.rotate(f10 + f11, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f44567o, this.f44555c);
                canvas.restore();
            }
        }

        /* access modifiers changed from: package-private */
        public int c() {
            return this.f44572t;
        }

        /* access modifiers changed from: package-private */
        public float d() {
            return this.f44558f;
        }

        /* access modifiers changed from: package-private */
        public int e() {
            return this.f44561i[f()];
        }

        /* access modifiers changed from: package-private */
        public int f() {
            return (this.f44562j + 1) % this.f44561i.length;
        }

        /* access modifiers changed from: package-private */
        public float g() {
            return this.f44557e;
        }

        /* access modifiers changed from: package-private */
        public int h() {
            return this.f44561i[this.f44562j];
        }

        /* access modifiers changed from: package-private */
        public float i() {
            return this.f44564l;
        }

        /* access modifiers changed from: package-private */
        public float j() {
            return this.f44565m;
        }

        /* access modifiers changed from: package-private */
        public float k() {
            return this.f44563k;
        }

        /* access modifiers changed from: package-private */
        public void l() {
            t(f());
        }

        /* access modifiers changed from: package-private */
        public void m() {
            this.f44563k = 0.0f;
            this.f44564l = 0.0f;
            this.f44565m = 0.0f;
            y(0.0f);
            v(0.0f);
            w(0.0f);
        }

        /* access modifiers changed from: package-private */
        public void n(int i10) {
            this.f44572t = i10;
        }

        /* access modifiers changed from: package-private */
        public void o(float f10, float f11) {
            this.f44570r = (int) f10;
            this.f44571s = (int) f11;
        }

        /* access modifiers changed from: package-private */
        public void p(float f10) {
            if (f10 != this.f44568p) {
                this.f44568p = f10;
            }
        }

        /* access modifiers changed from: package-private */
        public void q(float f10) {
            this.f44569q = f10;
        }

        /* access modifiers changed from: package-private */
        public void r(int i10) {
            this.f44573u = i10;
        }

        /* access modifiers changed from: package-private */
        public void s(ColorFilter colorFilter) {
            this.f44554b.setColorFilter(colorFilter);
        }

        /* access modifiers changed from: package-private */
        public void t(int i10) {
            this.f44562j = i10;
            this.f44573u = this.f44561i[i10];
        }

        /* access modifiers changed from: package-private */
        public void u(int[] iArr) {
            this.f44561i = iArr;
            t(0);
        }

        /* access modifiers changed from: package-private */
        public void v(float f10) {
            this.f44558f = f10;
        }

        /* access modifiers changed from: package-private */
        public void w(float f10) {
            this.f44559g = f10;
        }

        /* access modifiers changed from: package-private */
        public void x(boolean z10) {
            if (this.f44566n != z10) {
                this.f44566n = z10;
            }
        }

        /* access modifiers changed from: package-private */
        public void y(float f10) {
            this.f44557e = f10;
        }

        /* access modifiers changed from: package-private */
        public void z(float f10) {
            this.f44560h = f10;
            this.f44554b.setStrokeWidth(f10);
        }
    }

    public a(Context context) {
        this.f44545c = ((Context) i.g(context)).getResources();
        c cVar = new c();
        this.f44543a = cVar;
        cVar.u(f44542i);
        k(2.5f);
        m();
    }

    private void a(float f10, c cVar) {
        n(f10, cVar);
        cVar.y(cVar.k() + (((cVar.i() - 0.01f) - cVar.k()) * f10));
        cVar.v(cVar.i());
        cVar.w(cVar.j() + ((((float) (Math.floor((double) (cVar.j() / 0.8f)) + 1.0d)) - cVar.j()) * f10));
    }

    private int c(float f10, int i10, int i11) {
        int i12 = (i10 >> 24) & 255;
        int i13 = (i10 >> 16) & 255;
        int i14 = (i10 >> 8) & 255;
        int i15 = i10 & 255;
        return ((i12 + ((int) (((float) (((i11 >> 24) & 255) - i12)) * f10))) << 24) | ((i13 + ((int) (((float) (((i11 >> 16) & 255) - i13)) * f10))) << 16) | ((i14 + ((int) (((float) (((i11 >> 8) & 255) - i14)) * f10))) << 8) | (i15 + ((int) (f10 * ((float) ((i11 & 255) - i15)))));
    }

    private void h(float f10) {
        this.f44544b = f10;
    }

    private void i(float f10, float f11, float f12, float f13) {
        c cVar = this.f44543a;
        float f14 = this.f44545c.getDisplayMetrics().density;
        cVar.z(f11 * f14);
        cVar.q(f10 * f14);
        cVar.t(0);
        cVar.o(f12 * f14, f13 * f14);
    }

    private void m() {
        c cVar = this.f44543a;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new C0768a(cVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f44540g);
        ofFloat.addListener(new b(cVar));
        this.f44546d = ofFloat;
    }

    /* access modifiers changed from: package-private */
    public void b(float f10, c cVar, boolean z10) {
        float f11;
        float f12;
        if (this.f44548f) {
            a(f10, cVar);
        } else if (f10 != 1.0f || z10) {
            float j10 = cVar.j();
            if (f10 < 0.5f) {
                f11 = cVar.k();
                f12 = (f44541h.getInterpolation(f10 / 0.5f) * 0.79f) + 0.01f + f11;
            } else {
                float k10 = cVar.k() + 0.79f;
                float f13 = k10;
                f11 = k10 - (((1.0f - f44541h.getInterpolation((f10 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f12 = f13;
            }
            cVar.y(f11);
            cVar.v(f12);
            cVar.w(j10 + (0.20999998f * f10));
            h((f10 + this.f44547e) * 216.0f);
        }
    }

    public void d(boolean z10) {
        this.f44543a.x(z10);
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f44544b, bounds.exactCenterX(), bounds.exactCenterY());
        this.f44543a.a(canvas, bounds);
        canvas.restore();
    }

    public void e(float f10) {
        this.f44543a.p(f10);
        invalidateSelf();
    }

    public void f(int... iArr) {
        this.f44543a.u(iArr);
        this.f44543a.t(0);
        invalidateSelf();
    }

    public void g(float f10) {
        this.f44543a.w(f10);
        invalidateSelf();
    }

    public int getAlpha() {
        return this.f44543a.c();
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isRunning() {
        return this.f44546d.isRunning();
    }

    public void j(float f10, float f11) {
        this.f44543a.y(f10);
        this.f44543a.v(f11);
        invalidateSelf();
    }

    public void k(float f10) {
        this.f44543a.z(f10);
        invalidateSelf();
    }

    public void l(int i10) {
        if (i10 == 0) {
            i(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            i(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    public void n(float f10, c cVar) {
        if (f10 > 0.75f) {
            cVar.r(c((f10 - 0.75f) / 0.25f, cVar.h(), cVar.e()));
        } else {
            cVar.r(cVar.h());
        }
    }

    public void setAlpha(int i10) {
        this.f44543a.n(i10);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f44543a.s(colorFilter);
        invalidateSelf();
    }

    public void start() {
        this.f44546d.cancel();
        this.f44543a.A();
        if (this.f44543a.d() != this.f44543a.g()) {
            this.f44548f = true;
            this.f44546d.setDuration(666);
            this.f44546d.start();
            return;
        }
        this.f44543a.t(0);
        this.f44543a.m();
        this.f44546d.setDuration(1332);
        this.f44546d.start();
    }

    public void stop() {
        this.f44546d.cancel();
        h(0.0f);
        this.f44543a.x(false);
        this.f44543a.t(0);
        this.f44543a.m();
        invalidateSelf();
    }
}
