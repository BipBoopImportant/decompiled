package com.google.android.material.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

public class f extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    private final Drawable f66945a;

    /* renamed from: b  reason: collision with root package name */
    private final Drawable f66946b;

    /* renamed from: c  reason: collision with root package name */
    private final float[] f66947c;

    /* renamed from: d  reason: collision with root package name */
    private float f66948d;

    public void a(float f10) {
        if (this.f66948d != f10) {
            this.f66948d = f10;
            g.a(f10, this.f66947c);
            this.f66945a.setAlpha((int) (this.f66947c[0] * 255.0f));
            this.f66946b.setAlpha((int) (this.f66947c[1] * 255.0f));
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        this.f66945a.draw(canvas);
        this.f66946b.draw(canvas);
    }

    public int getIntrinsicHeight() {
        return Math.max(this.f66945a.getIntrinsicHeight(), this.f66946b.getIntrinsicHeight());
    }

    public int getIntrinsicWidth() {
        return Math.max(this.f66945a.getIntrinsicWidth(), this.f66946b.getIntrinsicWidth());
    }

    public int getMinimumHeight() {
        return Math.max(this.f66945a.getMinimumHeight(), this.f66946b.getMinimumHeight());
    }

    public int getMinimumWidth() {
        return Math.max(this.f66945a.getMinimumWidth(), this.f66946b.getMinimumWidth());
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isStateful() {
        return this.f66945a.isStateful() || this.f66946b.isStateful();
    }

    public void setAlpha(int i10) {
        if (this.f66948d <= 0.5f) {
            this.f66945a.setAlpha(i10);
            this.f66946b.setAlpha(0);
        } else {
            this.f66945a.setAlpha(0);
            this.f66946b.setAlpha(i10);
        }
        invalidateSelf();
    }

    public void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.f66945a.setBounds(i10, i11, i12, i13);
        this.f66946b.setBounds(i10, i11, i12, i13);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f66945a.setColorFilter(colorFilter);
        this.f66946b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public boolean setState(int[] iArr) {
        return this.f66945a.setState(iArr) || this.f66946b.setState(iArr);
    }
}
