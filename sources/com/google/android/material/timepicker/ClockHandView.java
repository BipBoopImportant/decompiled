package com.google.android.material.timepicker;

import Ea.C9068b;
import Ea.C9070d;
import Ea.C9077k;
import Ea.C9078l;
import Fa.C9081a;
import I2.C4600b0;
import Pa.C9233a;
import Qa.C9242i;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.material.internal.v;
import java.util.ArrayList;
import java.util.List;

class ClockHandView extends View {

    /* renamed from: a  reason: collision with root package name */
    private final int f67581a;

    /* renamed from: b  reason: collision with root package name */
    private final TimeInterpolator f67582b;

    /* renamed from: c  reason: collision with root package name */
    private final ValueAnimator f67583c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f67584d;

    /* renamed from: e  reason: collision with root package name */
    private float f67585e;

    /* renamed from: f  reason: collision with root package name */
    private float f67586f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f67587g;

    /* renamed from: h  reason: collision with root package name */
    private final int f67588h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f67589i;

    /* renamed from: j  reason: collision with root package name */
    private final List<b> f67590j;

    /* renamed from: k  reason: collision with root package name */
    private final int f67591k;

    /* renamed from: l  reason: collision with root package name */
    private final float f67592l;

    /* renamed from: m  reason: collision with root package name */
    private final Paint f67593m;

    /* renamed from: n  reason: collision with root package name */
    private final RectF f67594n;

    /* renamed from: o  reason: collision with root package name */
    private final int f67595o;

    /* renamed from: p  reason: collision with root package name */
    private float f67596p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f67597q;

    /* renamed from: r  reason: collision with root package name */
    private double f67598r;

    /* renamed from: s  reason: collision with root package name */
    private int f67599s;

    /* renamed from: t  reason: collision with root package name */
    private int f67600t;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public interface b {
        void a(float f10, boolean z10);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C9068b.f59300F);
    }

    private void c(float f10, float f11) {
        int i10 = 2;
        if (C9233a.a((float) (getWidth() / 2), (float) (getHeight() / 2), f10, f11) > ((float) h(2)) + v.d(getContext(), 12)) {
            i10 = 1;
        }
        this.f67600t = i10;
    }

    private void d(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int h10 = h(this.f67600t);
        float f10 = (float) width;
        float f11 = (float) h10;
        float f12 = (float) height;
        this.f67593m.setStrokeWidth(0.0f);
        canvas.drawCircle((((float) Math.cos(this.f67598r)) * f11) + f10, (f11 * ((float) Math.sin(this.f67598r))) + f12, (float) this.f67591k, this.f67593m);
        double sin = Math.sin(this.f67598r);
        double cos = Math.cos(this.f67598r);
        double d10 = (double) ((float) (h10 - this.f67591k));
        float f13 = (float) (width + ((int) (cos * d10)));
        float f14 = (float) (height + ((int) (d10 * sin)));
        this.f67593m.setStrokeWidth((float) this.f67595o);
        canvas.drawLine(f10, f12, f13, f14, this.f67593m);
        canvas.drawCircle(f10, f12, this.f67592l, this.f67593m);
    }

    private int f(float f10, float f11) {
        int degrees = (int) Math.toDegrees(Math.atan2((double) (f11 - ((float) (getHeight() / 2))), (double) (f10 - ((float) (getWidth() / 2)))));
        int i10 = degrees + 90;
        return i10 < 0 ? degrees + 450 : i10;
    }

    private int h(int i10) {
        return i10 == 2 ? Math.round(((float) this.f67599s) * 0.66f) : this.f67599s;
    }

    private Pair<Float, Float> j(float f10) {
        float g10 = g();
        if (Math.abs(g10 - f10) > 180.0f) {
            if (g10 > 180.0f && f10 < 180.0f) {
                f10 += 360.0f;
            }
            if (g10 < 180.0f && f10 > 180.0f) {
                g10 += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(g10), Float.valueOf(f10));
    }

    private boolean k(float f10, float f11, boolean z10, boolean z11, boolean z12) {
        float f12 = (float) f(f10, f11);
        boolean z13 = false;
        boolean z14 = g() != f12;
        if (z11 && z14) {
            return true;
        }
        if (!z14 && !z10) {
            return false;
        }
        if (z12 && this.f67584d) {
            z13 = true;
        }
        o(f12, z13);
        return true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void l(ValueAnimator valueAnimator) {
        p(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    private void p(float f10, boolean z10) {
        float f11 = f10 % 360.0f;
        this.f67596p = f11;
        this.f67598r = Math.toRadians((double) (f11 - 90.0f));
        float h10 = (float) h(this.f67600t);
        float width = ((float) (getWidth() / 2)) + (((float) Math.cos(this.f67598r)) * h10);
        float height = ((float) (getHeight() / 2)) + (h10 * ((float) Math.sin(this.f67598r)));
        RectF rectF = this.f67594n;
        int i10 = this.f67591k;
        rectF.set(width - ((float) i10), height - ((float) i10), width + ((float) i10), height + ((float) i10));
        for (b a10 : this.f67590j) {
            a10.a(f11, z10);
        }
        invalidate();
    }

    public void b(b bVar) {
        this.f67590j.add(bVar);
    }

    public RectF e() {
        return this.f67594n;
    }

    public float g() {
        return this.f67596p;
    }

    public int i() {
        return this.f67591k;
    }

    public void m(int i10) {
        this.f67599s = i10;
        invalidate();
    }

    public void n(float f10) {
        o(f10, false);
    }

    public void o(float f10, boolean z10) {
        ValueAnimator valueAnimator = this.f67583c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z10) {
            p(f10, false);
            return;
        }
        Pair<Float, Float> j10 = j(f10);
        this.f67583c.setFloatValues(new float[]{((Float) j10.first).floatValue(), ((Float) j10.second).floatValue()});
        this.f67583c.setDuration((long) this.f67581a);
        this.f67583c.setInterpolator(this.f67582b);
        this.f67583c.addUpdateListener(new a(this));
        this.f67583c.addListener(new a());
        this.f67583c.start();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d(canvas);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.f67583c.isRunning()) {
            n(g());
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (actionMasked == 0) {
            this.f67585e = x10;
            this.f67586f = y10;
            this.f67587g = true;
            this.f67597q = false;
            z11 = true;
            z12 = false;
            z10 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i10 = (int) (x10 - this.f67585e);
            int i11 = (int) (y10 - this.f67586f);
            this.f67587g = (i10 * i10) + (i11 * i11) > this.f67588h;
            z12 = this.f67597q;
            boolean z13 = actionMasked == 1;
            if (this.f67589i) {
                c(x10, y10);
            }
            z10 = z13;
            z11 = false;
        } else {
            z12 = false;
            z11 = false;
            z10 = false;
        }
        this.f67597q |= k(x10, y10, z12, z11, z10);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void q(boolean z10) {
        if (this.f67589i && !z10) {
            this.f67600t = 1;
        }
        this.f67589i = z10;
        invalidate();
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f67583c = new ValueAnimator();
        this.f67590j = new ArrayList();
        Paint paint = new Paint();
        this.f67593m = paint;
        this.f67594n = new RectF();
        this.f67600t = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9078l.f59792Q1, i10, C9077k.f59589F);
        this.f67581a = C9242i.f(context, C9068b.f59302H, 200);
        this.f67582b = C9242i.g(context, C9068b.f59312R, C9081a.f60372b);
        this.f67599s = obtainStyledAttributes.getDimensionPixelSize(C9078l.f59812S1, 0);
        this.f67591k = obtainStyledAttributes.getDimensionPixelSize(C9078l.f59822T1, 0);
        Resources resources = getResources();
        this.f67595o = resources.getDimensionPixelSize(C9070d.f59377F);
        this.f67592l = (float) resources.getDimensionPixelSize(C9070d.f59375D);
        int color = obtainStyledAttributes.getColor(C9078l.f59802R1, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        n(0.0f);
        this.f67588h = ViewConfiguration.get(context).getScaledTouchSlop();
        C4600b0.z0(this, 2);
        obtainStyledAttributes.recycle();
    }
}
