package androidx.appcompat.widget;

import I2.C4600b0;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import i.C5430j;

/* renamed from: androidx.appcompat.widget.b  reason: case insensitive filesystem */
class C4990b {

    /* renamed from: a  reason: collision with root package name */
    private final View f16491a;

    /* renamed from: b  reason: collision with root package name */
    private final C4993e f16492b;

    /* renamed from: c  reason: collision with root package name */
    private int f16493c = -1;

    /* renamed from: d  reason: collision with root package name */
    private K f16494d;

    /* renamed from: e  reason: collision with root package name */
    private K f16495e;

    /* renamed from: f  reason: collision with root package name */
    private K f16496f;

    C4990b(View view) {
        this.f16491a = view;
        this.f16492b = C4993e.b();
    }

    private boolean a(Drawable drawable) {
        if (this.f16496f == null) {
            this.f16496f = new K();
        }
        K k10 = this.f16496f;
        k10.a();
        ColorStateList r10 = C4600b0.r(this.f16491a);
        if (r10 != null) {
            k10.f16253d = true;
            k10.f16250a = r10;
        }
        PorterDuff.Mode s10 = C4600b0.s(this.f16491a);
        if (s10 != null) {
            k10.f16252c = true;
            k10.f16251b = s10;
        }
        if (!k10.f16253d && !k10.f16252c) {
            return false;
        }
        C4993e.i(drawable, k10, this.f16491a.getDrawableState());
        return true;
    }

    private boolean k() {
        return this.f16494d != null;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        Drawable background = this.f16491a.getBackground();
        if (background == null) {
            return;
        }
        if (!k() || !a(background)) {
            K k10 = this.f16495e;
            if (k10 != null) {
                C4993e.i(background, k10, this.f16491a.getDrawableState());
                return;
            }
            K k11 = this.f16494d;
            if (k11 != null) {
                C4993e.i(background, k11, this.f16491a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public ColorStateList c() {
        K k10 = this.f16495e;
        if (k10 != null) {
            return k10.f16250a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode d() {
        K k10 = this.f16495e;
        if (k10 != null) {
            return k10.f16251b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void e(AttributeSet attributeSet, int i10) {
        M v10 = M.v(this.f16491a.getContext(), attributeSet, C5430j.f24244t3, i10, 0);
        View view = this.f16491a;
        C4600b0.n0(view, view.getContext(), C5430j.f24244t3, attributeSet, v10.r(), i10, 0);
        try {
            if (v10.s(C5430j.f24249u3)) {
                this.f16493c = v10.n(C5430j.f24249u3, -1);
                ColorStateList f10 = this.f16492b.f(this.f16491a.getContext(), this.f16493c);
                if (f10 != null) {
                    h(f10);
                }
            }
            if (v10.s(C5430j.f24254v3)) {
                C4600b0.u0(this.f16491a, v10.c(C5430j.f24254v3));
            }
            if (v10.s(C5430j.f24259w3)) {
                C4600b0.v0(this.f16491a, y.e(v10.k(C5430j.f24259w3, -1), (PorterDuff.Mode) null));
            }
            v10.x();
        } catch (Throwable th2) {
            v10.x();
            throw th2;
        }
    }

    /* access modifiers changed from: package-private */
    public void f(Drawable drawable) {
        this.f16493c = -1;
        h((ColorStateList) null);
        b();
    }

    /* access modifiers changed from: package-private */
    public void g(int i10) {
        this.f16493c = i10;
        C4993e eVar = this.f16492b;
        h(eVar != null ? eVar.f(this.f16491a.getContext(), i10) : null);
        b();
    }

    /* access modifiers changed from: package-private */
    public void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f16494d == null) {
                this.f16494d = new K();
            }
            K k10 = this.f16494d;
            k10.f16250a = colorStateList;
            k10.f16253d = true;
        } else {
            this.f16494d = null;
        }
        b();
    }

    /* access modifiers changed from: package-private */
    public void i(ColorStateList colorStateList) {
        if (this.f16495e == null) {
            this.f16495e = new K();
        }
        K k10 = this.f16495e;
        k10.f16250a = colorStateList;
        k10.f16253d = true;
        b();
    }

    /* access modifiers changed from: package-private */
    public void j(PorterDuff.Mode mode) {
        if (this.f16495e == null) {
            this.f16495e = new K();
        }
        K k10 = this.f16495e;
        k10.f16251b = mode;
        k10.f16252c = true;
        b();
    }
}
