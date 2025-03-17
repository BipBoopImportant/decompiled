package androidx.appcompat.widget;

import I2.C4600b0;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.widget.e;
import i.C5430j;
import j.C5443a;

/* renamed from: androidx.appcompat.widget.i  reason: case insensitive filesystem */
public class C4997i {

    /* renamed from: a  reason: collision with root package name */
    private final ImageView f16522a;

    /* renamed from: b  reason: collision with root package name */
    private K f16523b;

    /* renamed from: c  reason: collision with root package name */
    private K f16524c;

    /* renamed from: d  reason: collision with root package name */
    private K f16525d;

    /* renamed from: e  reason: collision with root package name */
    private int f16526e = 0;

    public C4997i(ImageView imageView) {
        this.f16522a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.f16525d == null) {
            this.f16525d = new K();
        }
        K k10 = this.f16525d;
        k10.a();
        ColorStateList a10 = e.a(this.f16522a);
        if (a10 != null) {
            k10.f16253d = true;
            k10.f16250a = a10;
        }
        PorterDuff.Mode b10 = e.b(this.f16522a);
        if (b10 != null) {
            k10.f16252c = true;
            k10.f16251b = b10;
        }
        if (!k10.f16253d && !k10.f16252c) {
            return false;
        }
        C4993e.i(drawable, k10, this.f16522a.getDrawableState());
        return true;
    }

    private boolean l() {
        return this.f16523b != null;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (this.f16522a.getDrawable() != null) {
            this.f16522a.getDrawable().setLevel(this.f16526e);
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        Drawable drawable = this.f16522a.getDrawable();
        if (drawable != null) {
            y.b(drawable);
        }
        if (drawable == null) {
            return;
        }
        if (!l() || !a(drawable)) {
            K k10 = this.f16524c;
            if (k10 != null) {
                C4993e.i(drawable, k10, this.f16522a.getDrawableState());
                return;
            }
            K k11 = this.f16523b;
            if (k11 != null) {
                C4993e.i(drawable, k11, this.f16522a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public ColorStateList d() {
        K k10 = this.f16524c;
        if (k10 != null) {
            return k10.f16250a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode e() {
        K k10 = this.f16524c;
        if (k10 != null) {
            return k10.f16251b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        return !(this.f16522a.getBackground() instanceof RippleDrawable);
    }

    public void g(AttributeSet attributeSet, int i10) {
        int n10;
        M v10 = M.v(this.f16522a.getContext(), attributeSet, C5430j.f24101P, i10, 0);
        ImageView imageView = this.f16522a;
        C4600b0.n0(imageView, imageView.getContext(), C5430j.f24101P, attributeSet, v10.r(), i10, 0);
        try {
            Drawable drawable = this.f16522a.getDrawable();
            if (!(drawable != null || (n10 = v10.n(C5430j.f24105Q, -1)) == -1 || (drawable = C5443a.b(this.f16522a.getContext(), n10)) == null)) {
                this.f16522a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                y.b(drawable);
            }
            if (v10.s(C5430j.f24109R)) {
                e.c(this.f16522a, v10.c(C5430j.f24109R));
            }
            if (v10.s(C5430j.f24113S)) {
                e.d(this.f16522a, y.e(v10.k(C5430j.f24113S, -1), (PorterDuff.Mode) null));
            }
            v10.x();
        } catch (Throwable th2) {
            v10.x();
            throw th2;
        }
    }

    /* access modifiers changed from: package-private */
    public void h(Drawable drawable) {
        this.f16526e = drawable.getLevel();
    }

    public void i(int i10) {
        if (i10 != 0) {
            Drawable b10 = C5443a.b(this.f16522a.getContext(), i10);
            if (b10 != null) {
                y.b(b10);
            }
            this.f16522a.setImageDrawable(b10);
        } else {
            this.f16522a.setImageDrawable((Drawable) null);
        }
        c();
    }

    /* access modifiers changed from: package-private */
    public void j(ColorStateList colorStateList) {
        if (this.f16524c == null) {
            this.f16524c = new K();
        }
        K k10 = this.f16524c;
        k10.f16250a = colorStateList;
        k10.f16253d = true;
        c();
    }

    /* access modifiers changed from: package-private */
    public void k(PorterDuff.Mode mode) {
        if (this.f16524c == null) {
            this.f16524c = new K();
        }
        K k10 = this.f16524c;
        k10.f16251b = mode;
        k10.f16252c = true;
        c();
    }
}
