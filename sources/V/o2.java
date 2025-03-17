package v;

import C.C4391e0;
import C.C4402k;
import C.K0;
import I.n;
import J.g;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Looper;
import android.util.Range;
import androidx.concurrent.futures.c;
import androidx.lifecycle.F;
import androidx.lifecycle.K;
import java.util.concurrent.Executor;
import ob.C10101e;
import u.C5965a;
import v.C6109u;
import w.B;

final class o2 {

    /* renamed from: a  reason: collision with root package name */
    private final C6109u f30633a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f30634b;

    /* renamed from: c  reason: collision with root package name */
    private final p2 f30635c;

    /* renamed from: d  reason: collision with root package name */
    private final K<K0> f30636d;

    /* renamed from: e  reason: collision with root package name */
    final b f30637e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f30638f = false;

    /* renamed from: g  reason: collision with root package name */
    private C6109u.c f30639g = new a();

    class a implements C6109u.c {
        a() {
        }

        public boolean a(TotalCaptureResult totalCaptureResult) {
            o2.this.f30637e.a(totalCaptureResult);
            return false;
        }
    }

    interface b {
        void a(TotalCaptureResult totalCaptureResult);

        void b(float f10, c.a<Void> aVar);

        void c();

        void d(C5965a.C0464a aVar);

        Rect e();

        float getMaxZoom();

        float getMinZoom();
    }

    o2(C6109u uVar, B b10, Executor executor) {
        this.f30633a = uVar;
        this.f30634b = executor;
        b f10 = f(b10);
        this.f30637e = f10;
        p2 p2Var = new p2(f10.getMaxZoom(), f10.getMinZoom());
        this.f30635c = p2Var;
        p2Var.h(1.0f);
        this.f30636d = new K<>(g.f(p2Var));
        uVar.A(this.f30639g);
    }

    private static b f(B b10) {
        return k(b10) ? new C6055c(b10) : new C6069g1(b10);
    }

    static K0 h(B b10) {
        b f10 = f(b10);
        p2 p2Var = new p2(f10.getMaxZoom(), f10.getMinZoom());
        p2Var.h(1.0f);
        return g.f(p2Var);
    }

    private static Range<Float> i(B b10) {
        try {
            return (Range) b10.a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        } catch (AssertionError e10) {
            C4391e0.m("ZoomControl", "AssertionError, fail to get camera characteristic.", e10);
            return null;
        }
    }

    static boolean k(B b10) {
        return Build.VERSION.SDK_INT >= 30 && i(b10) != null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object m(K0 k02, c.a aVar) {
        this.f30634b.execute(new l2(this, aVar, k02));
        return "setLinearZoom";
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object o(K0 k02, c.a aVar) {
        this.f30634b.execute(new n2(this, aVar, k02));
        return "setZoomRatio";
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public void n(c.a<Void> aVar, K0 k02) {
        K0 f10;
        if (!this.f30638f) {
            synchronized (this.f30635c) {
                this.f30635c.h(1.0f);
                f10 = g.f(this.f30635c);
            }
            t(f10);
            aVar.f(new C4402k.a("Camera is not active."));
            return;
        }
        this.f30637e.b(k02.d(), aVar);
        this.f30633a.v0();
    }

    private void t(K0 k02) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f30636d.setValue(k02);
        } else {
            this.f30636d.postValue(k02);
        }
    }

    /* access modifiers changed from: package-private */
    public void e(C5965a.C0464a aVar) {
        this.f30637e.d(aVar);
    }

    /* access modifiers changed from: package-private */
    public Rect g() {
        return this.f30637e.e();
    }

    /* access modifiers changed from: package-private */
    public F<K0> j() {
        return this.f30636d;
    }

    /* access modifiers changed from: package-private */
    public void p(boolean z10) {
        K0 f10;
        if (this.f30638f != z10) {
            this.f30638f = z10;
            if (!z10) {
                synchronized (this.f30635c) {
                    this.f30635c.h(1.0f);
                    f10 = g.f(this.f30635c);
                }
                t(f10);
                this.f30637e.c();
                this.f30633a.v0();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public C10101e<Void> q(float f10) {
        K0 f11;
        synchronized (this.f30635c) {
            try {
                this.f30635c.g(f10);
                f11 = g.f(this.f30635c);
            } catch (IllegalArgumentException e10) {
                return n.n(e10);
            }
        }
        t(f11);
        return c.a(new k2(this, f11));
    }

    /* access modifiers changed from: package-private */
    public C10101e<Void> r(float f10) {
        K0 f11;
        synchronized (this.f30635c) {
            try {
                this.f30635c.h(f10);
                f11 = g.f(this.f30635c);
            } catch (IllegalArgumentException e10) {
                return n.n(e10);
            }
        }
        t(f11);
        return c.a(new m2(this, f11));
    }
}
