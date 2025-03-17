package com.google.android.material.internal;

import Ea.C9077k;
import Ea.C9078l;
import I2.C0;
import I2.C4600b0;
import I2.I;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public class ScrimInsetsFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    Drawable f66853a;

    /* renamed from: b  reason: collision with root package name */
    Rect f66854b;

    /* renamed from: c  reason: collision with root package name */
    private Rect f66855c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f66856d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f66857e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f66858f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f66859g;

    class a implements I {
        a() {
        }

        public C0 a(View view, C0 c02) {
            ScrimInsetsFrameLayout scrimInsetsFrameLayout = ScrimInsetsFrameLayout.this;
            if (scrimInsetsFrameLayout.f66854b == null) {
                scrimInsetsFrameLayout.f66854b = new Rect();
            }
            ScrimInsetsFrameLayout.this.f66854b.set(c02.k(), c02.m(), c02.l(), c02.j());
            ScrimInsetsFrameLayout.this.e(c02);
            ScrimInsetsFrameLayout.this.setWillNotDraw(!c02.n() || ScrimInsetsFrameLayout.this.f66853a == null);
            C4600b0.f0(ScrimInsetsFrameLayout.this);
            return c02.c();
        }
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f66854b != null && this.f66853a != null) {
            int save = canvas.save();
            canvas.translate((float) getScrollX(), (float) getScrollY());
            if (this.f66856d) {
                this.f66855c.set(0, 0, width, this.f66854b.top);
                this.f66853a.setBounds(this.f66855c);
                this.f66853a.draw(canvas);
            }
            if (this.f66857e) {
                this.f66855c.set(0, height - this.f66854b.bottom, width, height);
                this.f66853a.setBounds(this.f66855c);
                this.f66853a.draw(canvas);
            }
            if (this.f66858f) {
                Rect rect = this.f66855c;
                Rect rect2 = this.f66854b;
                rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
                this.f66853a.setBounds(this.f66855c);
                this.f66853a.draw(canvas);
            }
            if (this.f66859g) {
                Rect rect3 = this.f66855c;
                Rect rect4 = this.f66854b;
                rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
                this.f66853a.setBounds(this.f66855c);
                this.f66853a.draw(canvas);
            }
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    public void e(C0 c02) {
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f66853a;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f66853a;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z10) {
        this.f66857e = z10;
    }

    public void setDrawLeftInsetForeground(boolean z10) {
        this.f66858f = z10;
    }

    public void setDrawRightInsetForeground(boolean z10) {
        this.f66859g = z10;
    }

    public void setDrawTopInsetForeground(boolean z10) {
        this.f66856d = z10;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.f66853a = drawable;
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f66855c = new Rect();
        this.f66856d = true;
        this.f66857e = true;
        this.f66858f = true;
        this.f66859g = true;
        TypedArray i11 = s.i(context, attributeSet, C9078l.f60018l6, i10, C9077k.f59603m, new int[0]);
        this.f66853a = i11.getDrawable(C9078l.f60029m6);
        i11.recycle();
        setWillNotDraw(true);
        C4600b0.E0(this, new a());
    }
}
