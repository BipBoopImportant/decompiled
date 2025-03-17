package v;

import C.C4391e0;
import H2.i;
import I.d;
import I.n;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.core.impl.C5019e0;
import androidx.camera.core.impl.C5025h0;
import androidx.concurrent.futures.c;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import ob.C10101e;
import v.P1;
import w.C;
import w.C6173h;
import x.k;
import x.q;

class V1 extends P1.c implements P1, P1.a {

    /* renamed from: a  reason: collision with root package name */
    final Object f30402a = new Object();

    /* renamed from: b  reason: collision with root package name */
    final C6066f1 f30403b;

    /* renamed from: c  reason: collision with root package name */
    final Handler f30404c;

    /* renamed from: d  reason: collision with root package name */
    final Executor f30405d;

    /* renamed from: e  reason: collision with root package name */
    private final ScheduledExecutorService f30406e;

    /* renamed from: f  reason: collision with root package name */
    P1.c f30407f;

    /* renamed from: g  reason: collision with root package name */
    C6173h f30408g;

    /* renamed from: h  reason: collision with root package name */
    C10101e<Void> f30409h;

    /* renamed from: i  reason: collision with root package name */
    c.a<Void> f30410i;

    /* renamed from: j  reason: collision with root package name */
    private C10101e<List<Surface>> f30411j;

    /* renamed from: k  reason: collision with root package name */
    private List<C5019e0> f30412k = null;

    /* renamed from: l  reason: collision with root package name */
    private boolean f30413l = false;

    /* renamed from: m  reason: collision with root package name */
    private boolean f30414m = false;

    /* renamed from: n  reason: collision with root package name */
    private boolean f30415n = false;

    class a implements I.c<Void> {
        a() {
        }

        public void b(Throwable th2) {
            V1.this.d();
            V1 v12 = V1.this;
            v12.f30403b.i(v12);
        }

        /* renamed from: c */
        public void a(Void voidR) {
        }
    }

    class b extends CameraCaptureSession.StateCallback {
        b() {
        }

        public void onActive(CameraCaptureSession cameraCaptureSession) {
            V1.this.B(cameraCaptureSession);
            V1 v12 = V1.this;
            v12.o(v12);
        }

        public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
            V1.this.B(cameraCaptureSession);
            V1 v12 = V1.this;
            v12.p(v12);
        }

        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            V1.this.B(cameraCaptureSession);
            V1 v12 = V1.this;
            v12.q(v12);
        }

        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            c.a<Void> aVar;
            try {
                V1.this.B(cameraCaptureSession);
                V1 v12 = V1.this;
                v12.r(v12);
                synchronized (V1.this.f30402a) {
                    i.h(V1.this.f30410i, "OpenCaptureSession completer should not null");
                    V1 v13 = V1.this;
                    aVar = v13.f30410i;
                    v13.f30410i = null;
                }
                aVar.f(new IllegalStateException("onConfigureFailed"));
            } catch (Throwable th2) {
                synchronized (V1.this.f30402a) {
                    i.h(V1.this.f30410i, "OpenCaptureSession completer should not null");
                    V1 v14 = V1.this;
                    c.a<Void> aVar2 = v14.f30410i;
                    v14.f30410i = null;
                    aVar2.f(new IllegalStateException("onConfigureFailed"));
                    throw th2;
                }
            }
        }

        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            c.a<Void> aVar;
            try {
                V1.this.B(cameraCaptureSession);
                V1 v12 = V1.this;
                v12.s(v12);
                synchronized (V1.this.f30402a) {
                    i.h(V1.this.f30410i, "OpenCaptureSession completer should not null");
                    V1 v13 = V1.this;
                    aVar = v13.f30410i;
                    v13.f30410i = null;
                }
                aVar.c(null);
            } catch (Throwable th2) {
                synchronized (V1.this.f30402a) {
                    i.h(V1.this.f30410i, "OpenCaptureSession completer should not null");
                    V1 v14 = V1.this;
                    c.a<Void> aVar2 = v14.f30410i;
                    v14.f30410i = null;
                    aVar2.c(null);
                    throw th2;
                }
            }
        }

        public void onReady(CameraCaptureSession cameraCaptureSession) {
            V1.this.B(cameraCaptureSession);
            V1 v12 = V1.this;
            v12.t(v12);
        }

        public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
            V1.this.B(cameraCaptureSession);
            V1 v12 = V1.this;
            v12.v(v12, surface);
        }
    }

    V1(C6066f1 f1Var, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        this.f30403b = f1Var;
        this.f30404c = handler;
        this.f30405d = executor;
        this.f30406e = scheduledExecutorService;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void E() {
        u(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void F(P1 p12) {
        this.f30403b.g(this);
        u(p12);
        if (this.f30408g != null) {
            Objects.requireNonNull(this.f30407f);
            this.f30407f.q(p12);
            return;
        }
        C4391e0.l("SyncCaptureSessionBase", "[" + this + "] Cannot call onClosed() when the CameraCaptureSession is not correctly configured.");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void G(P1 p12) {
        Objects.requireNonNull(this.f30407f);
        this.f30407f.u(p12);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object H(List list, C c10, q qVar, c.a aVar) {
        String str;
        synchronized (this.f30402a) {
            C(list);
            i.j(this.f30410i == null, "The openCaptureSessionCompleter can only set once!");
            this.f30410i = aVar;
            c10.a(qVar);
            str = "openCaptureSession[session=" + this + "]";
        }
        return str;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C10101e I(List list, List list2) {
        C4391e0.a("SyncCaptureSessionBase", "[" + this + "] getSurface done with results: " + list2);
        return list2.isEmpty() ? n.n(new IllegalArgumentException("Unable to open capture session without surfaces")) : list2.contains((Object) null) ? n.n(new C5019e0.a("Surface closed", (C5019e0) list.get(list2.indexOf((Object) null)))) : n.p(list2);
    }

    /* access modifiers changed from: package-private */
    public void B(CameraCaptureSession cameraCaptureSession) {
        if (this.f30408g == null) {
            this.f30408g = C6173h.d(cameraCaptureSession, this.f30404c);
        }
    }

    /* access modifiers changed from: package-private */
    public void C(List<C5019e0> list) {
        synchronized (this.f30402a) {
            J();
            C5025h0.d(list);
            this.f30412k = list;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean D() {
        boolean z10;
        synchronized (this.f30402a) {
            z10 = this.f30409h != null;
        }
        return z10;
    }

    /* access modifiers changed from: package-private */
    public void J() {
        synchronized (this.f30402a) {
            try {
                List<C5019e0> list = this.f30412k;
                if (list != null) {
                    C5025h0.c(list);
                    this.f30412k = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a() {
        i.h(this.f30408g, "Need to call openCaptureSession before using this API.");
        this.f30408g.c().stopRepeating();
    }

    public Executor b() {
        return this.f30405d;
    }

    public P1.c c() {
        return this;
    }

    public void close() {
        i.h(this.f30408g, "Need to call openCaptureSession before using this API.");
        this.f30403b.h(this);
        this.f30408g.c().close();
        b().execute(new R1(this));
    }

    public void d() {
        J();
    }

    public C10101e<Void> e(CameraDevice cameraDevice, q qVar, List<C5019e0> list) {
        synchronized (this.f30402a) {
            try {
                if (this.f30414m) {
                    C10101e<Void> n10 = n.n(new CancellationException("Opener is disabled"));
                    return n10;
                }
                this.f30403b.k(this);
                C10101e<Void> a10 = c.a(new S1(this, list, C.b(cameraDevice, this.f30404c), qVar));
                this.f30409h = a10;
                n.j(a10, new a(), H.a.a());
                C10101e<Void> B10 = n.B(this.f30409h);
                return B10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void f(int i10) {
    }

    public void g() {
        i.h(this.f30408g, "Need to call openCaptureSession before using this API.");
        this.f30408g.c().abortCaptures();
    }

    public CameraDevice h() {
        i.g(this.f30408g);
        return this.f30408g.c().getDevice();
    }

    public int i(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        i.h(this.f30408g, "Need to call openCaptureSession before using this API.");
        return this.f30408g.b(captureRequest, b(), captureCallback);
    }

    public C10101e<List<Surface>> j(List<C5019e0> list, long j10) {
        synchronized (this.f30402a) {
            try {
                if (this.f30414m) {
                    C10101e<List<Surface>> n10 = n.n(new CancellationException("Opener is disabled"));
                    return n10;
                }
                d<T> f10 = d.b(C5025h0.g(list, false, j10, b(), this.f30406e)).f(new U1(this, list), b());
                this.f30411j = f10;
                C10101e<List<Surface>> B10 = n.B(f10);
                return B10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int k(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) {
        i.h(this.f30408g, "Need to call openCaptureSession before using this API.");
        return this.f30408g.a(list, b(), captureCallback);
    }

    public C6173h l() {
        i.g(this.f30408g);
        return this.f30408g;
    }

    public q m(int i10, List<k> list, P1.c cVar) {
        this.f30407f = cVar;
        return new q(i10, list, b(), new b());
    }

    public void o(P1 p12) {
        Objects.requireNonNull(this.f30407f);
        this.f30407f.o(p12);
    }

    public void p(P1 p12) {
        Objects.requireNonNull(this.f30407f);
        this.f30407f.p(p12);
    }

    public void q(P1 p12) {
        C10101e<Void> eVar;
        synchronized (this.f30402a) {
            try {
                if (!this.f30413l) {
                    this.f30413l = true;
                    i.h(this.f30409h, "Need to call openCaptureSession before using this API.");
                    eVar = this.f30409h;
                } else {
                    eVar = null;
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        d();
        if (eVar != null) {
            eVar.a(new T1(this, p12), H.a.a());
        }
    }

    public void r(P1 p12) {
        Objects.requireNonNull(this.f30407f);
        d();
        this.f30403b.i(this);
        this.f30407f.r(p12);
    }

    public void s(P1 p12) {
        Objects.requireNonNull(this.f30407f);
        this.f30403b.j(this);
        this.f30407f.s(p12);
    }

    public boolean stop() {
        boolean z10;
        C10101e<List<Surface>> eVar = null;
        try {
            synchronized (this.f30402a) {
                if (!this.f30414m) {
                    C10101e<List<Surface>> eVar2 = this.f30411j;
                    if (eVar2 != null) {
                        eVar = eVar2;
                    }
                    this.f30414m = true;
                }
                z10 = !D();
            }
            if (eVar != null) {
                eVar.cancel(true);
            }
            return z10;
        } catch (Throwable th2) {
            if (eVar != null) {
                eVar.cancel(true);
            }
            throw th2;
        }
    }

    public void t(P1 p12) {
        Objects.requireNonNull(this.f30407f);
        this.f30407f.t(p12);
    }

    /* access modifiers changed from: package-private */
    public void u(P1 p12) {
        C10101e<Void> eVar;
        synchronized (this.f30402a) {
            try {
                if (!this.f30415n) {
                    this.f30415n = true;
                    i.h(this.f30409h, "Need to call openCaptureSession before using this API.");
                    eVar = this.f30409h;
                } else {
                    eVar = null;
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        if (eVar != null) {
            eVar.a(new Q1(this, p12), H.a.a());
        }
    }

    public void v(P1 p12, Surface surface) {
        Objects.requireNonNull(this.f30407f);
        this.f30407f.v(p12, surface);
    }
}
