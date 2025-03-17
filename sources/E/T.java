package E;

import C.U;
import C.V;
import E.f0;
import G.p;
import H2.i;
import android.graphics.Bitmap;
import androidx.camera.core.n;
import androidx.concurrent.futures.c;
import java.util.Objects;
import ob.C10101e;

public class T implements V {

    /* renamed from: a  reason: collision with root package name */
    private final f0 f5565a;

    /* renamed from: b  reason: collision with root package name */
    private final f0.a f5566b;

    /* renamed from: c  reason: collision with root package name */
    private final C10101e<Void> f5567c;

    /* renamed from: d  reason: collision with root package name */
    private final C10101e<Void> f5568d;

    /* renamed from: e  reason: collision with root package name */
    private c.a<Void> f5569e;

    /* renamed from: f  reason: collision with root package name */
    private c.a<Void> f5570f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f5571g = false;

    /* renamed from: h  reason: collision with root package name */
    private boolean f5572h = false;

    /* renamed from: i  reason: collision with root package name */
    private C10101e<Void> f5573i;

    T(f0 f0Var, f0.a aVar) {
        this.f5565a = f0Var;
        this.f5566b = aVar;
        this.f5567c = c.a(new Q(this));
        this.f5568d = c.a(new S(this));
    }

    private void l(V v10) {
        p.a();
        this.f5571g = true;
        C10101e<Void> eVar = this.f5573i;
        Objects.requireNonNull(eVar);
        eVar.cancel(true);
        this.f5569e.f(v10);
        this.f5570f.c(null);
    }

    private void o() {
        i.j(this.f5567c.isDone(), "onImageCaptured() must be called before onFinalResult()");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object r(c.a aVar) {
        this.f5569e = aVar;
        return "CaptureCompleteFuture";
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object s(c.a aVar) {
        this.f5570f = aVar;
        return "RequestCompleteFuture";
    }

    private void t() {
        i.j(!this.f5568d.isDone(), "The callback can only complete once.");
        this.f5570f.c(null);
    }

    private void u(V v10) {
        p.a();
        this.f5565a.x(v10);
    }

    public void a(int i10) {
        p.a();
        if (!this.f5571g) {
            this.f5565a.w(i10);
        }
    }

    public void b(Bitmap bitmap) {
        p.a();
        if (!this.f5571g) {
            this.f5565a.y(bitmap);
        }
    }

    public void c() {
        p.a();
        if (!this.f5571g && !this.f5572h) {
            this.f5572h = true;
            U.e j10 = this.f5565a.j();
            if (j10 != null) {
                j10.b();
            }
            U.f l10 = this.f5565a.l();
            if (l10 != null) {
                l10.c();
            }
        }
    }

    public void d(n nVar) {
        p.a();
        if (this.f5571g) {
            nVar.close();
            return;
        }
        o();
        t();
        this.f5565a.A(nVar);
    }

    public boolean e() {
        return this.f5571g;
    }

    public void f(V v10) {
        p.a();
        if (!this.f5571g) {
            o();
            t();
            u(v10);
        }
    }

    public void g() {
        p.a();
        if (!this.f5571g) {
            if (!this.f5572h) {
                c();
            }
            this.f5569e.c(null);
        }
    }

    public void h(V v10) {
        p.a();
        if (!this.f5571g) {
            boolean f10 = this.f5565a.f();
            if (!f10) {
                u(v10);
            }
            t();
            this.f5569e.f(v10);
            if (f10) {
                this.f5566b.b(this.f5565a);
            }
        }
    }

    public void i(U.h hVar) {
        p.a();
        if (!this.f5571g) {
            o();
            t();
            this.f5565a.z(hVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void m(V v10) {
        p.a();
        if (!this.f5568d.isDone()) {
            l(v10);
            u(v10);
        }
    }

    /* access modifiers changed from: package-private */
    public void n() {
        p.a();
        if (!this.f5568d.isDone()) {
            l(new V(3, "The request is aborted silently and retried.", (Throwable) null));
            this.f5566b.b(this.f5565a);
        }
    }

    /* access modifiers changed from: package-private */
    public C10101e<Void> p() {
        p.a();
        return this.f5567c;
    }

    /* access modifiers changed from: package-private */
    public C10101e<Void> q() {
        p.a();
        return this.f5568d;
    }

    public void v(C10101e<Void> eVar) {
        p.a();
        i.j(this.f5573i == null, "CaptureRequestFuture can only be set once.");
        this.f5573i = eVar;
    }
}
