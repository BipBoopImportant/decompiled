package androidx.camera.view;

import androidx.lifecycle.F;
import androidx.lifecycle.I;

/* renamed from: androidx.camera.view.e  reason: case insensitive filesystem */
final class C5065e<T> extends I<T> {

    /* renamed from: d  reason: collision with root package name */
    private F<T> f17173d;

    C5065e() {
    }

    /* access modifiers changed from: package-private */
    public void d(F<T> f10) {
        F<T> f11 = this.f17173d;
        if (f11 != null) {
            super.c(f11);
        }
        this.f17173d = f10;
        super.b(f10, new C5064d(this));
    }

    public T getValue() {
        F<T> f10 = this.f17173d;
        if (f10 == null) {
            return null;
        }
        return f10.getValue();
    }
}
