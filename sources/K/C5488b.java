package k;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import y2.C6260a;

/* renamed from: k.b  reason: case insensitive filesystem */
public class C5488b extends Drawable {

    /* renamed from: m  reason: collision with root package name */
    private static final float f24977m = ((float) Math.toRadians(45.0d));

    /* renamed from: a  reason: collision with root package name */
    private final Paint f24978a;

    /* renamed from: b  reason: collision with root package name */
    private float f24979b;

    /* renamed from: c  reason: collision with root package name */
    private float f24980c;

    /* renamed from: d  reason: collision with root package name */
    private float f24981d;

    /* renamed from: e  reason: collision with root package name */
    private float f24982e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f24983f;

    /* renamed from: g  reason: collision with root package name */
    private final Path f24984g;

    /* renamed from: h  reason: collision with root package name */
    private final int f24985h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f24986i;

    /* renamed from: j  reason: collision with root package name */
    private float f24987j;

    /* renamed from: k  reason: collision with root package name */
    private float f24988k;

    /* renamed from: l  reason: collision with root package name */
    private int f24989l;

    private static float a(float f10, float f11, float f12) {
        return f10 + ((f11 - f10) * f12);
    }

    public void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        int i10 = this.f24989l;
        boolean z10 = false;
        if (i10 != 0 && (i10 == 1 || (i10 == 3 ? C6260a.f(this) == 0 : C6260a.f(this) == 1))) {
            z10 = true;
        }
        float f10 = this.f24979b;
        float a10 = a(this.f24980c, (float) Math.sqrt((double) (f10 * f10 * 2.0f)), this.f24987j);
        float a11 = a(this.f24980c, this.f24981d, this.f24987j);
        float round = (float) Math.round(a(0.0f, this.f24988k, this.f24987j));
        float a12 = a(0.0f, f24977m, this.f24987j);
        double d10 = (double) a10;
        float a13 = a(z10 ? 0.0f : -180.0f, z10 ? 180.0f : 0.0f, this.f24987j);
        double d11 = (double) a12;
        boolean z11 = z10;
        float round2 = (float) Math.round(Math.cos(d11) * d10);
        float round3 = (float) Math.round(d10 * Math.sin(d11));
        this.f24984g.rewind();
        float a14 = a(this.f24982e + this.f24978a.getStrokeWidth(), -this.f24988k, this.f24987j);
        float f11 = (-a11) / 2.0f;
        this.f24984g.moveTo(f11 + round, 0.0f);
        this.f24984g.rLineTo(a11 - (round * 2.0f), 0.0f);
        this.f24984g.moveTo(f11, a14);
        this.f24984g.rLineTo(round2, round3);
        this.f24984g.moveTo(f11, -a14);
        this.f24984g.rLineTo(round2, -round3);
        this.f24984g.close();
        canvas.save();
        float strokeWidth = this.f24978a.getStrokeWidth();
        float height = ((float) bounds.height()) - (3.0f * strokeWidth);
        float f12 = this.f24982e;
        canvas2.translate((float) bounds.centerX(), ((float) ((((int) (height - (2.0f * f12))) / 4) * 2)) + (strokeWidth * 1.5f) + f12);
        if (this.f24983f) {
            canvas2.rotate(a13 * ((float) (this.f24986i ^ z11 ? -1 : 1)));
        } else if (z11) {
            canvas2.rotate(180.0f);
        }
        canvas2.drawPath(this.f24984g, this.f24978a);
        canvas.restore();
    }

    public int getIntrinsicHeight() {
        return this.f24985h;
    }

    public int getIntrinsicWidth() {
        return this.f24985h;
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i10) {
        if (i10 != this.f24978a.getAlpha()) {
            this.f24978a.setAlpha(i10);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f24978a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setProgress(float f10) {
        if (this.f24987j != f10) {
            this.f24987j = f10;
            invalidateSelf();
        }
    }
}
