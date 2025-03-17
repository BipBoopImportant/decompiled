package androidx.camera.view;

import C.G0;
import android.graphics.Bitmap;
import android.util.Size;
import android.view.View;
import android.widget.FrameLayout;
import ob.C10101e;

abstract class q {

    /* renamed from: a  reason: collision with root package name */
    Size f17214a;

    /* renamed from: b  reason: collision with root package name */
    FrameLayout f17215b;

    /* renamed from: c  reason: collision with root package name */
    private final m f17216c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f17217d = false;

    interface a {
        void a();
    }

    q(FrameLayout frameLayout, m mVar) {
        this.f17215b = frameLayout;
        this.f17216c = mVar;
    }

    /* access modifiers changed from: package-private */
    public Bitmap a() {
        Bitmap c10 = c();
        if (c10 == null) {
            return null;
        }
        return this.f17216c.a(c10, new Size(this.f17215b.getWidth(), this.f17215b.getHeight()), this.f17215b.getLayoutDirection());
    }

    /* access modifiers changed from: package-private */
    public abstract View b();

    /* access modifiers changed from: package-private */
    public abstract Bitmap c();

    /* access modifiers changed from: package-private */
    public abstract void d();

    /* access modifiers changed from: package-private */
    public abstract void e();

    /* access modifiers changed from: package-private */
    public void f() {
        this.f17217d = true;
        h();
    }

    /* access modifiers changed from: package-private */
    public abstract void g(G0 g02, a aVar);

    /* access modifiers changed from: package-private */
    public void h() {
        View b10 = b();
        if (b10 != null && this.f17217d) {
            this.f17216c.s(new Size(this.f17215b.getWidth(), this.f17215b.getHeight()), this.f17215b.getLayoutDirection(), b10);
        }
    }

    /* access modifiers changed from: package-private */
    public abstract C10101e<Void> i();
}
