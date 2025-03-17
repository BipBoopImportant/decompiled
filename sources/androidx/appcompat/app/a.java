package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.b;
import i.C5430j;

public abstract class a {

    public interface b {
        void a(boolean z10);
    }

    @Deprecated
    public static abstract class c {
        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract CharSequence d();

        public abstract void e();
    }

    public abstract void A(CharSequence charSequence);

    public void B(CharSequence charSequence) {
    }

    public abstract void C();

    public androidx.appcompat.view.b D(b.a aVar) {
        return null;
    }

    public boolean g() {
        return false;
    }

    public boolean h() {
        return false;
    }

    public void i(boolean z10) {
    }

    public abstract int j();

    public Context k() {
        return null;
    }

    public abstract void l();

    public boolean m() {
        return false;
    }

    public void n(Configuration configuration) {
    }

    /* access modifiers changed from: package-private */
    public void o() {
    }

    public boolean p(int i10, KeyEvent keyEvent) {
        return false;
    }

    public boolean q(KeyEvent keyEvent) {
        return false;
    }

    public boolean r() {
        return false;
    }

    public void s(boolean z10) {
    }

    public abstract void t(boolean z10);

    public abstract void u(boolean z10);

    public abstract void v(boolean z10);

    public void w(int i10) {
    }

    public void x(int i10) {
    }

    public void y(boolean z10) {
    }

    public void z(boolean z10) {
    }

    /* renamed from: androidx.appcompat.app.a$a  reason: collision with other inner class name */
    public static class C0226a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f15537a = 8388627;

        public C0226a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5430j.f24240t);
            this.f15537a = obtainStyledAttributes.getInt(C5430j.f24245u, 0);
            obtainStyledAttributes.recycle();
        }

        public C0226a(int i10, int i11) {
            super(i10, i11);
        }

        public C0226a(C0226a aVar) {
            super(aVar);
            this.f15537a = aVar.f15537a;
        }

        public C0226a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
