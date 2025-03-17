package Ua;

import Ia.C9122a;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;

public abstract class o {

    /* renamed from: a  reason: collision with root package name */
    boolean f64130a = false;

    /* renamed from: b  reason: collision with root package name */
    boolean f64131b = false;

    /* renamed from: c  reason: collision with root package name */
    k f64132c;

    /* renamed from: d  reason: collision with root package name */
    RectF f64133d = new RectF();

    /* renamed from: e  reason: collision with root package name */
    final Path f64134e = new Path();

    public static o a(View view) {
        return Build.VERSION.SDK_INT >= 33 ? new q(view) : new p(view);
    }

    private boolean c() {
        RectF rectF = this.f64133d;
        return rectF.left <= rectF.right && rectF.top <= rectF.bottom;
    }

    private void j() {
        if (c() && this.f64132c != null) {
            l.k().e(this.f64132c, 1.0f, this.f64133d, this.f64134e);
        }
    }

    /* access modifiers changed from: package-private */
    public abstract void b(View view);

    public void d(Canvas canvas, C9122a.C1002a aVar) {
        if (!i() || this.f64134e.isEmpty()) {
            aVar.a(canvas);
            return;
        }
        canvas.save();
        canvas.clipPath(this.f64134e);
        aVar.a(canvas);
        canvas.restore();
    }

    public void e(View view, RectF rectF) {
        this.f64133d = rectF;
        j();
        b(view);
    }

    public void f(View view, k kVar) {
        this.f64132c = kVar;
        j();
        b(view);
    }

    public void g(View view, boolean z10) {
        if (z10 != this.f64130a) {
            this.f64130a = z10;
            b(view);
        }
    }

    public void h(View view, boolean z10) {
        this.f64131b = z10;
        b(view);
    }

    /* access modifiers changed from: package-private */
    public abstract boolean i();
}
