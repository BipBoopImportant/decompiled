package com.google.android.material.floatingactionbutton;

import Ua.k;
import Ua.l;
import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.google.android.material.drawable.d;
import x2.C6244c;

class a extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    private final l f66714a = l.k();

    /* renamed from: b  reason: collision with root package name */
    private final Paint f66715b;

    /* renamed from: c  reason: collision with root package name */
    private final Path f66716c = new Path();

    /* renamed from: d  reason: collision with root package name */
    private final Rect f66717d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    private final RectF f66718e = new RectF();

    /* renamed from: f  reason: collision with root package name */
    private final RectF f66719f = new RectF();

    /* renamed from: g  reason: collision with root package name */
    private final b f66720g = new b();

    /* renamed from: h  reason: collision with root package name */
    float f66721h;

    /* renamed from: i  reason: collision with root package name */
    private int f66722i;

    /* renamed from: j  reason: collision with root package name */
    private int f66723j;

    /* renamed from: k  reason: collision with root package name */
    private int f66724k;

    /* renamed from: l  reason: collision with root package name */
    private int f66725l;

    /* renamed from: m  reason: collision with root package name */
    private int f66726m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f66727n = true;

    /* renamed from: o  reason: collision with root package name */
    private k f66728o;

    /* renamed from: p  reason: collision with root package name */
    private ColorStateList f66729p;

    private class b extends Drawable.ConstantState {
        private b() {
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            return a.this;
        }
    }

    a(k kVar) {
        this.f66728o = kVar;
        Paint paint = new Paint(1);
        this.f66715b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    private Shader a() {
        Rect rect = this.f66717d;
        copyBounds(rect);
        float height = this.f66721h / ((float) rect.height());
        return new LinearGradient(0.0f, (float) rect.top, 0.0f, (float) rect.bottom, new int[]{C6244c.k(this.f66722i, this.f66726m), C6244c.k(this.f66723j, this.f66726m), C6244c.k(C6244c.p(this.f66723j, 0), this.f66726m), C6244c.k(C6244c.p(this.f66725l, 0), this.f66726m), C6244c.k(this.f66725l, this.f66726m), C6244c.k(this.f66724k, this.f66726m)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP);
    }

    /* access modifiers changed from: protected */
    public RectF b() {
        this.f66719f.set(getBounds());
        return this.f66719f;
    }

    /* access modifiers changed from: package-private */
    public void c(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f66726m = colorStateList.getColorForState(getState(), this.f66726m);
        }
        this.f66729p = colorStateList;
        this.f66727n = true;
        invalidateSelf();
    }

    public void d(float f10) {
        if (this.f66721h != f10) {
            this.f66721h = f10;
            this.f66715b.setStrokeWidth(f10 * 1.3333f);
            this.f66727n = true;
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        if (this.f66727n) {
            this.f66715b.setShader(a());
            this.f66727n = false;
        }
        float strokeWidth = this.f66715b.getStrokeWidth() / 2.0f;
        copyBounds(this.f66717d);
        this.f66718e.set(this.f66717d);
        float min = Math.min(this.f66728o.r().a(b()), this.f66718e.width() / 2.0f);
        if (this.f66728o.u(b())) {
            this.f66718e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f66718e, min, min, this.f66715b);
        }
    }

    /* access modifiers changed from: package-private */
    public void e(int i10, int i11, int i12, int i13) {
        this.f66722i = i10;
        this.f66723j = i11;
        this.f66724k = i12;
        this.f66725l = i13;
    }

    public void f(k kVar) {
        this.f66728o = kVar;
        invalidateSelf();
    }

    public Drawable.ConstantState getConstantState() {
        return this.f66720g;
    }

    public int getOpacity() {
        return this.f66721h > 0.0f ? -3 : -2;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f66728o.u(b())) {
            outline.setRoundRect(getBounds(), this.f66728o.r().a(b()));
            return;
        }
        copyBounds(this.f66717d);
        this.f66718e.set(this.f66717d);
        this.f66714a.e(this.f66728o, 1.0f, this.f66718e, this.f66716c);
        d.j(outline, this.f66716c);
    }

    public boolean getPadding(Rect rect) {
        if (!this.f66728o.u(b())) {
            return true;
        }
        int round = Math.round(this.f66721h);
        rect.set(round, round, round, round);
        return true;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.f66729p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f66727n = true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f66729p;
        if (!(colorStateList == null || (colorForState = colorStateList.getColorForState(iArr, this.f66726m)) == this.f66726m)) {
            this.f66727n = true;
            this.f66726m = colorForState;
        }
        if (this.f66727n) {
            invalidateSelf();
        }
        return this.f66727n;
    }

    public void setAlpha(int i10) {
        this.f66715b.setAlpha(i10);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f66715b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
