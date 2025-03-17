package com.google.android.material.internal;

import Ea.C9078l;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;

public class ForegroundLinearLayout extends LinearLayoutCompat {

    /* renamed from: p  reason: collision with root package name */
    private Drawable f66834p;

    /* renamed from: q  reason: collision with root package name */
    private final Rect f66835q;

    /* renamed from: r  reason: collision with root package name */
    private final Rect f66836r;

    /* renamed from: s  reason: collision with root package name */
    private int f66837s;

    /* renamed from: t  reason: collision with root package name */
    protected boolean f66838t;

    /* renamed from: u  reason: collision with root package name */
    boolean f66839u;

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f66834p;
        if (drawable != null) {
            if (this.f66839u) {
                this.f66839u = false;
                Rect rect = this.f66835q;
                Rect rect2 = this.f66836r;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f66838t) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f66837s, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @TargetApi(21)
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f66834p;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f66834p;
        if (drawable != null && drawable.isStateful()) {
            this.f66834p.setState(getDrawableState());
        }
    }

    public Drawable getForeground() {
        return this.f66834p;
    }

    public int getForegroundGravity() {
        return this.f66837s;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f66834p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f66839u = z10 | this.f66839u;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f66839u = true;
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f66834p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.f66834p);
            }
            this.f66834p = drawable;
            this.f66839u = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f66837s == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i10) {
        if (this.f66837s != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f66837s = i10;
            if (i10 == 119 && this.f66834p != null) {
                this.f66834p.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f66834p;
    }

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f66835q = new Rect();
        this.f66836r = new Rect();
        this.f66837s = 119;
        this.f66838t = true;
        this.f66839u = false;
        TypedArray i11 = s.i(context, attributeSet, C9078l.f59708I2, i10, 0, new int[0]);
        this.f66837s = i11.getInt(C9078l.f59730K2, this.f66837s);
        Drawable drawable = i11.getDrawable(C9078l.f59719J2);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f66838t = i11.getBoolean(C9078l.f59741L2, true);
        i11.recycle();
    }
}
