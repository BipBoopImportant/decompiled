package B;

import C.C4402k;
import H2.i;
import I.n;
import androidx.camera.core.impl.F;
import androidx.camera.core.impl.X;
import androidx.concurrent.futures.c;
import java.util.concurrent.Executor;
import ob.C10101e;
import u.C5965a;
import v.C6109u;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private boolean f4467a = false;

    /* renamed from: b  reason: collision with root package name */
    private boolean f4468b = false;

    /* renamed from: c  reason: collision with root package name */
    private final C6109u f4469c;

    /* renamed from: d  reason: collision with root package name */
    final Executor f4470d;

    /* renamed from: e  reason: collision with root package name */
    final Object f4471e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private C5965a.C0464a f4472f = new C5965a.C0464a();

    /* renamed from: g  reason: collision with root package name */
    c.a<Void> f4473g;

    public g(C6109u uVar, Executor executor) {
        this.f4469c = uVar;
        this.f4470d = executor;
    }

    private void h(j jVar) {
        synchronized (this.f4471e) {
            this.f4472f.c(jVar);
        }
    }

    private void k() {
        synchronized (this.f4471e) {
            this.f4472f = new C5965a.C0464a();
        }
    }

    /* access modifiers changed from: private */
    public void l() {
        c.a<Void> aVar = this.f4473g;
        if (aVar != null) {
            aVar.c(null);
            this.f4473g = null;
        }
    }

    private void m(Exception exc) {
        c.a<Void> aVar = this.f4473g;
        if (aVar != null) {
            if (exc == null) {
                exc = new Exception("Camera2CameraControl failed with unknown error.");
            }
            aVar.f(exc);
            this.f4473g = null;
        }
    }

    public static g n(C4402k kVar) {
        F a10 = ((F) kVar).a();
        i.b(a10 instanceof C6109u, "CameraControl doesn't contain Camera2 implementation.");
        return ((C6109u) a10).E();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object q(c.a aVar) {
        this.f4470d.execute(new f(this, aVar));
        return "addCaptureRequestOptions";
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object s(c.a aVar) {
        this.f4470d.execute(new d(this, aVar));
        return "clearCaptureRequestOptions";
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public void t(boolean z10) {
        if (this.f4467a != z10) {
            this.f4467a = z10;
            if (!z10) {
                m(new C4402k.a("The camera control has became inactive."));
            } else if (this.f4468b) {
                x();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public void r(c.a<Void> aVar) {
        this.f4468b = true;
        m(new C4402k.a("Camera2CameraControl was updated with new options."));
        this.f4473g = aVar;
        if (this.f4467a) {
            x();
        }
    }

    private void x() {
        this.f4469c.u0().a(new a(this), this.f4470d);
        this.f4468b = false;
    }

    public C10101e<Void> g(j jVar) {
        h(jVar);
        return n.B(c.a(new b(this)));
    }

    public void i(C5965a.C0464a aVar) {
        synchronized (this.f4471e) {
            aVar.d(this.f4472f.a(), X.c.ALWAYS_OVERRIDE);
        }
    }

    public C10101e<Void> j() {
        k();
        return n.B(c.a(new c(this)));
    }

    public C5965a o() {
        C5965a b10;
        synchronized (this.f4471e) {
            b10 = this.f4472f.b();
        }
        return b10;
    }

    public void u(boolean z10) {
        this.f4470d.execute(new e(this, z10));
    }
}
