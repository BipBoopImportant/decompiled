package androidx.appcompat.widget;

import I2.C4600b0;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import i.C5430j;
import y2.C6260a;

/* renamed from: androidx.appcompat.widget.m  reason: case insensitive filesystem */
class C5001m extends C4999k {

    /* renamed from: d  reason: collision with root package name */
    private final SeekBar f16532d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f16533e;

    /* renamed from: f  reason: collision with root package name */
    private ColorStateList f16534f = null;

    /* renamed from: g  reason: collision with root package name */
    private PorterDuff.Mode f16535g = null;

    /* renamed from: h  reason: collision with root package name */
    private boolean f16536h = false;

    /* renamed from: i  reason: collision with root package name */
    private boolean f16537i = false;

    C5001m(SeekBar seekBar) {
        super(seekBar);
        this.f16532d = seekBar;
    }

    private void f() {
        Drawable drawable = this.f16533e;
        if (drawable == null) {
            return;
        }
        if (this.f16536h || this.f16537i) {
            Drawable r10 = C6260a.r(drawable.mutate());
            this.f16533e = r10;
            if (this.f16536h) {
                C6260a.o(r10, this.f16534f);
            }
            if (this.f16537i) {
                C6260a.p(this.f16533e, this.f16535g);
            }
            if (this.f16533e.isStateful()) {
                this.f16533e.setState(this.f16532d.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c(AttributeSet attributeSet, int i10) {
        super.c(attributeSet, i10);
        M v10 = M.v(this.f16532d.getContext(), attributeSet, C5430j.f24117T, i10, 0);
        SeekBar seekBar = this.f16532d;
        C4600b0.n0(seekBar, seekBar.getContext(), C5430j.f24117T, attributeSet, v10.r(), i10, 0);
        Drawable h10 = v10.h(C5430j.f24121U);
        if (h10 != null) {
            this.f16532d.setThumb(h10);
        }
        j(v10.g(C5430j.f24125V));
        if (v10.s(C5430j.f24133X)) {
            this.f16535g = y.e(v10.k(C5430j.f24133X, -1), this.f16535g);
            this.f16537i = true;
        }
        if (v10.s(C5430j.f24129W)) {
            this.f16534f = v10.c(C5430j.f24129W);
            this.f16536h = true;
        }
        v10.x();
        f();
    }

    /* access modifiers changed from: package-private */
    public void g(Canvas canvas) {
        if (this.f16533e != null) {
            int max = this.f16532d.getMax();
            int i10 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f16533e.getIntrinsicWidth();
                int intrinsicHeight = this.f16533e.getIntrinsicHeight();
                int i11 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i10 = intrinsicHeight / 2;
                }
                this.f16533e.setBounds(-i11, -i10, i11, i10);
                float width = ((float) ((this.f16532d.getWidth() - this.f16532d.getPaddingLeft()) - this.f16532d.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f16532d.getPaddingLeft(), (float) (this.f16532d.getHeight() / 2));
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f16533e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void h() {
        Drawable drawable = this.f16533e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f16532d.getDrawableState())) {
            this.f16532d.invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: package-private */
    public void i() {
        Drawable drawable = this.f16533e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: package-private */
    public void j(Drawable drawable) {
        Drawable drawable2 = this.f16533e;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f16533e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f16532d);
            C6260a.m(drawable, this.f16532d.getLayoutDirection());
            if (drawable.isStateful()) {
                drawable.setState(this.f16532d.getDrawableState());
            }
            f();
        }
        this.f16532d.invalidate();
    }
}
