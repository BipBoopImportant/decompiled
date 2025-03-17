package org.maplibre.android.annotations;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

@Deprecated
class b extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    private RectF f145468a;

    /* renamed from: b  reason: collision with root package name */
    private float f145469b;

    /* renamed from: c  reason: collision with root package name */
    private float f145470c;

    /* renamed from: d  reason: collision with root package name */
    private float f145471d;

    /* renamed from: e  reason: collision with root package name */
    private float f145472e;

    /* renamed from: f  reason: collision with root package name */
    private Paint f145473f = new Paint(1);

    /* renamed from: g  reason: collision with root package name */
    private float f145474g;

    /* renamed from: h  reason: collision with root package name */
    private Paint f145475h;

    /* renamed from: i  reason: collision with root package name */
    private Path f145476i;

    /* renamed from: j  reason: collision with root package name */
    private Path f145477j = new Path();

    b(RectF rectF, a aVar, float f10, float f11, float f12, float f13, int i10, float f14, int i11) {
        this.f145468a = rectF;
        this.f145469b = f10;
        this.f145470c = f11;
        this.f145471d = f12;
        this.f145472e = f13;
        this.f145473f.setColor(i10);
        this.f145474g = f14;
        if (f14 > 0.0f) {
            Paint paint = new Paint(1);
            this.f145475h = paint;
            paint.setColor(i11);
            this.f145476i = new Path();
            e(aVar, this.f145477j, f14);
            e(aVar, this.f145476i, 0.0f);
            return;
        }
        e(aVar, this.f145477j, 0.0f);
    }

    private void a(RectF rectF, Path path, float f10) {
        path.moveTo(rectF.left + this.f145472e + f10, rectF.top + f10);
        path.lineTo((rectF.width() - this.f145472e) - f10, rectF.top + f10);
        float f11 = rectF.right;
        float f12 = this.f145472e;
        float f13 = rectF.top;
        path.arcTo(new RectF(f11 - f12, f13 + f10, f11 - f10, f12 + f13), 270.0f, 90.0f);
        path.lineTo(rectF.right - f10, ((rectF.bottom - this.f145470c) - this.f145472e) - f10);
        float f14 = rectF.right;
        float f15 = this.f145472e;
        float f16 = rectF.bottom;
        float f17 = this.f145470c;
        path.arcTo(new RectF(f14 - f15, (f16 - f15) - f17, f14 - f10, (f16 - f17) - f10), 0.0f, 90.0f);
        float f18 = f10 / 2.0f;
        path.lineTo(((rectF.left + this.f145469b) + this.f145471d) - f18, (rectF.bottom - this.f145470c) - f10);
        path.lineTo(rectF.left + this.f145471d + (this.f145469b / 2.0f), (rectF.bottom - f10) - f10);
        path.lineTo(rectF.left + this.f145471d + f18, (rectF.bottom - this.f145470c) - f10);
        path.lineTo(rectF.left + Math.min(this.f145472e, this.f145471d) + f10, (rectF.bottom - this.f145470c) - f10);
        float f19 = rectF.left;
        float f20 = rectF.bottom;
        float f21 = this.f145472e;
        float f22 = this.f145470c;
        path.arcTo(new RectF(f19 + f10, (f20 - f21) - f22, f21 + f19, (f20 - f22) - f10), 90.0f, 90.0f);
        path.lineTo(rectF.left + f10, rectF.top + this.f145472e + f10);
        float f23 = rectF.left;
        float f24 = rectF.top;
        float f25 = this.f145472e;
        path.arcTo(new RectF(f23 + f10, f10 + f24, f23 + f25, f25 + f24), 180.0f, 90.0f);
        path.close();
    }

    private void b(RectF rectF, Path path, float f10) {
        path.moveTo(rectF.left + f10, rectF.top + f10);
        path.lineTo(rectF.right - f10, rectF.top + f10);
        path.lineTo(rectF.right - f10, (rectF.bottom - this.f145470c) - f10);
        float f11 = f10 / 2.0f;
        path.lineTo(((rectF.left + this.f145469b) + this.f145471d) - f11, (rectF.bottom - this.f145470c) - f10);
        path.lineTo(rectF.left + this.f145471d + (this.f145469b / 2.0f), (rectF.bottom - f10) - f10);
        path.lineTo(rectF.left + this.f145471d + f11, (rectF.bottom - this.f145470c) - f10);
        path.lineTo(rectF.left + this.f145471d + f10, (rectF.bottom - this.f145470c) - f10);
        path.lineTo(rectF.left + f10, (rectF.bottom - this.f145470c) - f10);
        path.lineTo(rectF.left + f10, rectF.top + f10);
        path.close();
    }

    private void c(RectF rectF, Path path, float f10) {
        path.moveTo(this.f145469b + rectF.left + this.f145472e + f10, rectF.top + f10);
        path.lineTo((rectF.width() - this.f145472e) - f10, rectF.top + f10);
        float f11 = rectF.right;
        float f12 = this.f145472e;
        float f13 = rectF.top;
        path.arcTo(new RectF(f11 - f12, f13 + f10, f11 - f10, f12 + f13), 270.0f, 90.0f);
        path.lineTo(rectF.right - f10, (rectF.bottom - this.f145472e) - f10);
        float f14 = rectF.right;
        float f15 = this.f145472e;
        float f16 = rectF.bottom;
        path.arcTo(new RectF(f14 - f15, f16 - f15, f14 - f10, f16 - f10), 0.0f, 90.0f);
        path.lineTo(rectF.left + this.f145469b + this.f145472e + f10, rectF.bottom - f10);
        float f17 = rectF.left;
        float f18 = this.f145469b;
        float f19 = rectF.bottom;
        float f20 = this.f145472e;
        path.arcTo(new RectF(f17 + f18 + f10, f19 - f20, f20 + f17 + f18, f19 - f10), 90.0f, 90.0f);
        float f21 = f10 / 2.0f;
        path.lineTo(rectF.left + this.f145469b + f10, (this.f145470c + this.f145471d) - f21);
        path.lineTo(rectF.left + f10 + f10, this.f145471d + (this.f145470c / 2.0f));
        path.lineTo(rectF.left + this.f145469b + f10, this.f145471d + f21);
        path.lineTo(rectF.left + this.f145469b + f10, rectF.top + this.f145472e + f10);
        float f22 = rectF.left;
        float f23 = this.f145469b;
        float f24 = rectF.top;
        float f25 = this.f145472e;
        path.arcTo(new RectF(f22 + f23 + f10, f10 + f24, f22 + f25 + f23, f25 + f24), 180.0f, 90.0f);
        path.close();
    }

    private void d(RectF rectF, Path path, float f10) {
        path.moveTo(this.f145469b + rectF.left + f10, rectF.top + f10);
        path.lineTo(rectF.width() - f10, rectF.top + f10);
        path.lineTo(rectF.right - f10, rectF.bottom - f10);
        path.lineTo(rectF.left + this.f145469b + f10, rectF.bottom - f10);
        float f11 = f10 / 2.0f;
        path.lineTo(rectF.left + this.f145469b + f10, (this.f145470c + this.f145471d) - f11);
        path.lineTo(rectF.left + f10 + f10, this.f145471d + (this.f145470c / 2.0f));
        path.lineTo(rectF.left + this.f145469b + f10, this.f145471d + f11);
        path.lineTo(rectF.left + this.f145469b + f10, rectF.top + f10);
        path.close();
    }

    private void e(a aVar, Path path, float f10) {
        int a10 = aVar.a();
        if (a10 == 0) {
            float f11 = this.f145472e;
            if (f11 <= 0.0f) {
                d(this.f145468a, path, f10);
            } else if (f10 <= 0.0f || f10 <= f11) {
                c(this.f145468a, path, f10);
            } else {
                d(this.f145468a, path, f10);
            }
        } else if (a10 == 1) {
            float f12 = this.f145472e;
            if (f12 <= 0.0f) {
                g(this.f145468a, path, f10);
            } else if (f10 <= 0.0f || f10 <= f12) {
                f(this.f145468a, path, f10);
            } else {
                g(this.f145468a, path, f10);
            }
        } else if (a10 == 2) {
            float f13 = this.f145472e;
            if (f13 <= 0.0f) {
                i(this.f145468a, path, f10);
            } else if (f10 <= 0.0f || f10 <= f13) {
                h(this.f145468a, path, f10);
            } else {
                i(this.f145468a, path, f10);
            }
        } else if (a10 == 3) {
            float f14 = this.f145472e;
            if (f14 <= 0.0f) {
                b(this.f145468a, path, f10);
            } else if (f10 <= 0.0f || f10 <= f14) {
                a(this.f145468a, path, f10);
            } else {
                b(this.f145468a, path, f10);
            }
        }
    }

    private void f(RectF rectF, Path path, float f10) {
        path.moveTo(rectF.left + this.f145472e + f10, rectF.top + f10);
        path.lineTo(((rectF.width() - this.f145472e) - this.f145469b) - f10, rectF.top + f10);
        float f11 = rectF.right;
        float f12 = this.f145472e;
        float f13 = this.f145469b;
        float f14 = rectF.top;
        path.arcTo(new RectF((f11 - f12) - f13, f14 + f10, (f11 - f13) - f10, f12 + f14), 270.0f, 90.0f);
        float f15 = f10 / 2.0f;
        path.lineTo((rectF.right - this.f145469b) - f10, this.f145471d + f15);
        path.lineTo((rectF.right - f10) - f10, this.f145471d + (this.f145470c / 2.0f));
        path.lineTo((rectF.right - this.f145469b) - f10, (this.f145471d + this.f145470c) - f15);
        path.lineTo((rectF.right - this.f145469b) - f10, (rectF.bottom - this.f145472e) - f10);
        float f16 = rectF.right;
        float f17 = this.f145472e;
        float f18 = this.f145469b;
        float f19 = rectF.bottom;
        path.arcTo(new RectF((f16 - f17) - f18, f19 - f17, (f16 - f18) - f10, f19 - f10), 0.0f, 90.0f);
        path.lineTo(rectF.left + this.f145469b + f10, rectF.bottom - f10);
        float f20 = rectF.left;
        float f21 = rectF.bottom;
        float f22 = this.f145472e;
        path.arcTo(new RectF(f20 + f10, f21 - f22, f22 + f20, f21 - f10), 90.0f, 90.0f);
        float f23 = rectF.left;
        float f24 = rectF.top;
        float f25 = this.f145472e;
        path.arcTo(new RectF(f23 + f10, f10 + f24, f23 + f25, f25 + f24), 180.0f, 90.0f);
        path.close();
    }

    private void g(RectF rectF, Path path, float f10) {
        path.moveTo(rectF.left + f10, rectF.top + f10);
        path.lineTo((rectF.width() - this.f145469b) - f10, rectF.top + f10);
        float f11 = f10 / 2.0f;
        path.lineTo((rectF.right - this.f145469b) - f10, this.f145471d + f11);
        path.lineTo((rectF.right - f10) - f10, this.f145471d + (this.f145470c / 2.0f));
        path.lineTo((rectF.right - this.f145469b) - f10, (this.f145471d + this.f145470c) - f11);
        path.lineTo((rectF.right - this.f145469b) - f10, rectF.bottom - f10);
        path.lineTo(rectF.left + f10, rectF.bottom - f10);
        path.lineTo(rectF.left + f10, rectF.top + f10);
        path.close();
    }

    private void h(RectF rectF, Path path, float f10) {
        path.moveTo(rectF.left + Math.min(this.f145471d, this.f145472e) + f10, rectF.top + this.f145470c + f10);
        float f11 = f10 / 2.0f;
        path.lineTo(rectF.left + this.f145471d + f11, rectF.top + this.f145470c + f10);
        path.lineTo(rectF.left + (this.f145469b / 2.0f) + this.f145471d, rectF.top + f10 + f10);
        path.lineTo(((rectF.left + this.f145469b) + this.f145471d) - f11, rectF.top + this.f145470c + f10);
        path.lineTo((rectF.right - this.f145472e) - f10, rectF.top + this.f145470c + f10);
        float f12 = rectF.right;
        float f13 = this.f145472e;
        float f14 = rectF.top;
        float f15 = this.f145470c;
        path.arcTo(new RectF(f12 - f13, f14 + f15 + f10, f12 - f10, f13 + f14 + f15), 270.0f, 90.0f);
        path.lineTo(rectF.right - f10, (rectF.bottom - this.f145472e) - f10);
        float f16 = rectF.right;
        float f17 = this.f145472e;
        float f18 = rectF.bottom;
        path.arcTo(new RectF(f16 - f17, f18 - f17, f16 - f10, f18 - f10), 0.0f, 90.0f);
        path.lineTo(rectF.left + this.f145472e + f10, rectF.bottom - f10);
        float f19 = rectF.left;
        float f20 = rectF.bottom;
        float f21 = this.f145472e;
        path.arcTo(new RectF(f19 + f10, f20 - f21, f21 + f19, f20 - f10), 90.0f, 90.0f);
        path.lineTo(rectF.left + f10, rectF.top + this.f145470c + this.f145472e + f10);
        float f22 = rectF.left;
        float f23 = f22 + f10;
        float f24 = rectF.top;
        float f25 = this.f145470c;
        float f26 = f24 + f25 + f10;
        float f27 = this.f145472e;
        path.arcTo(new RectF(f23, f26, f22 + f27, f27 + f24 + f25), 180.0f, 90.0f);
        path.close();
    }

    private void i(RectF rectF, Path path, float f10) {
        path.moveTo(rectF.left + this.f145471d + f10, rectF.top + this.f145470c + f10);
        float f11 = f10 / 2.0f;
        path.lineTo(rectF.left + this.f145471d + f11, rectF.top + this.f145470c + f10);
        path.lineTo(rectF.left + (this.f145469b / 2.0f) + this.f145471d, rectF.top + f10 + f10);
        path.lineTo(((rectF.left + this.f145469b) + this.f145471d) - f11, rectF.top + this.f145470c + f10);
        path.lineTo(rectF.right - f10, rectF.top + this.f145470c + f10);
        path.lineTo(rectF.right - f10, rectF.bottom - f10);
        path.lineTo(rectF.left + f10, rectF.bottom - f10);
        path.lineTo(rectF.left + f10, rectF.top + this.f145470c + f10);
        path.lineTo(rectF.left + this.f145471d + f10, rectF.top + this.f145470c + f10);
        path.close();
    }

    public void draw(Canvas canvas) {
        if (this.f145474g > 0.0f) {
            canvas.drawPath(this.f145476i, this.f145475h);
        }
        canvas.drawPath(this.f145477j, this.f145473f);
    }

    public int getIntrinsicHeight() {
        return (int) this.f145468a.height();
    }

    public int getIntrinsicWidth() {
        return (int) this.f145468a.width();
    }

    public int getOpacity() {
        return -3;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
    }

    public void setAlpha(int i10) {
        this.f145473f.setAlpha(i10);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f145473f.setColorFilter(colorFilter);
    }
}
