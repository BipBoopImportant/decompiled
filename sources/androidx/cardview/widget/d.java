package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

class d extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    private float f17260a;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f17261b;

    /* renamed from: c  reason: collision with root package name */
    private final RectF f17262c;

    /* renamed from: d  reason: collision with root package name */
    private final Rect f17263d;

    /* renamed from: e  reason: collision with root package name */
    private float f17264e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f17265f = false;

    /* renamed from: g  reason: collision with root package name */
    private boolean f17266g = true;

    /* renamed from: h  reason: collision with root package name */
    private ColorStateList f17267h;

    /* renamed from: i  reason: collision with root package name */
    private PorterDuffColorFilter f17268i;

    /* renamed from: j  reason: collision with root package name */
    private ColorStateList f17269j;

    /* renamed from: k  reason: collision with root package name */
    private PorterDuff.Mode f17270k = PorterDuff.Mode.SRC_IN;

    d(ColorStateList colorStateList, float f10) {
        this.f17260a = f10;
        this.f17261b = new Paint(5);
        e(colorStateList);
        this.f17262c = new RectF();
        this.f17263d = new Rect();
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    private void e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f17267h = colorStateList;
        this.f17261b.setColor(colorStateList.getColorForState(getState(), this.f17267h.getDefaultColor()));
    }

    private void i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f17262c.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.f17263d.set(rect);
        if (this.f17265f) {
            float b10 = e.b(this.f17264e, this.f17260a, this.f17266g);
            this.f17263d.inset((int) Math.ceil((double) e.a(this.f17264e, this.f17260a, this.f17266g)), (int) Math.ceil((double) b10));
            this.f17262c.set(this.f17263d);
        }
    }

    public ColorStateList b() {
        return this.f17267h;
    }

    /* access modifiers changed from: package-private */
    public float c() {
        return this.f17264e;
    }

    public float d() {
        return this.f17260a;
    }

    public void draw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f17261b;
        if (this.f17268i == null || paint.getColorFilter() != null) {
            z10 = false;
        } else {
            paint.setColorFilter(this.f17268i);
            z10 = true;
        }
        RectF rectF = this.f17262c;
        float f10 = this.f17260a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z10) {
            paint.setColorFilter((ColorFilter) null);
        }
    }

    public void f(ColorStateList colorStateList) {
        e(colorStateList);
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    public void g(float f10, boolean z10, boolean z11) {
        if (f10 != this.f17264e || this.f17265f != z10 || this.f17266g != z11) {
            this.f17264e = f10;
            this.f17265f = z10;
            this.f17266g = z11;
            i((Rect) null);
            invalidateSelf();
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f17263d, this.f17260a);
    }

    /* access modifiers changed from: package-private */
    public void h(float f10) {
        if (f10 != this.f17260a) {
            this.f17260a = f10;
            i((Rect) null);
            invalidateSelf();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f17267h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f17269j
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x000a:
            android.content.res.ColorStateList r0 = r1.f17267h
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x0014:
            boolean r0 = super.isStateful()
            if (r0 == 0) goto L_0x001c
        L_0x001a:
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.cardview.widget.d.isStateful():boolean");
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        i(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f17267h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z10 = colorForState != this.f17261b.getColor();
        if (z10) {
            this.f17261b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f17269j;
        if (colorStateList2 == null || (mode = this.f17270k) == null) {
            return z10;
        }
        this.f17268i = a(colorStateList2, mode);
        return true;
    }

    public void setAlpha(int i10) {
        this.f17261b.setAlpha(i10);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f17261b.setColorFilter(colorFilter);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f17269j = colorStateList;
        this.f17268i = a(colorStateList, this.f17270k);
        invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f17270k = mode;
        this.f17268i = a(this.f17269j, mode);
        invalidateSelf();
    }
}
