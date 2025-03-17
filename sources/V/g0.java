package V;

import C.C4391e0;
import C.C4417z;
import C.G0;
import I.n;
import X.g;
import a0.C4965i;
import a0.C4968l;
import a0.d0;
import android.view.Surface;
import androidx.camera.core.impl.h1;
import androidx.concurrent.futures.c;
import java.util.Objects;
import java.util.concurrent.Executor;
import ob.C10101e;

final class g0 {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f14429a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f14430b;

    /* renamed from: c  reason: collision with root package name */
    private final C4968l f14431c;

    /* renamed from: d  reason: collision with root package name */
    private C4965i f14432d = null;

    /* renamed from: e  reason: collision with root package name */
    private Surface f14433e = null;

    /* renamed from: f  reason: collision with root package name */
    private G0 f14434f = null;

    /* renamed from: g  reason: collision with root package name */
    private Executor f14435g = null;

    /* renamed from: h  reason: collision with root package name */
    private C4965i.b.a f14436h = null;

    /* renamed from: i  reason: collision with root package name */
    private b f14437i = b.NOT_INITIALIZED;

    /* renamed from: j  reason: collision with root package name */
    private C10101e<Void> f14438j = n.n(new IllegalStateException("Cannot close the encoder before configuring."));

    /* renamed from: k  reason: collision with root package name */
    private c.a<Void> f14439k = null;

    /* renamed from: l  reason: collision with root package name */
    private C10101e<C4965i> f14440l = n.n(new IllegalStateException("Cannot close the encoder before configuring."));

    /* renamed from: m  reason: collision with root package name */
    private c.a<C4965i> f14441m = null;

    class a implements I.c<C4965i> {
        a() {
        }

        public void b(Throwable th2) {
            C4391e0.m("VideoEncoderSession", "VideoEncoder configuration failed.", th2);
            g0.this.x();
        }

        /* renamed from: c */
        public void a(C4965i iVar) {
        }
    }

    private enum b {
        NOT_INITIALIZED,
        INITIALIZING,
        PENDING_RELEASE,
        READY,
        RELEASED
    }

    g0(C4968l lVar, Executor executor, Executor executor2) {
        this.f14429a = executor2;
        this.f14430b = executor;
        this.f14431c = lVar;
    }

    private void h() {
        int ordinal = this.f14437i.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            x();
        } else if (ordinal == 2 || ordinal == 3) {
            C4391e0.a("VideoEncoderSession", "closeInternal in " + this.f14437i + " state");
            this.f14437i = b.PENDING_RELEASE;
        } else if (ordinal == 4) {
            C4391e0.a("VideoEncoderSession", "closeInternal in RELEASED state, No-op");
        } else {
            throw new IllegalStateException("State " + this.f14437i + " is not handled");
        }
    }

    private void j(G0 g02, h1 h1Var, g gVar, C4926k kVar, c.a<C4965i> aVar) {
        C4417z n10 = g02.n();
        try {
            C4965i a10 = this.f14431c.a(this.f14429a, Z.c.c(Z.c.d(kVar, n10, gVar), h1Var, kVar.d(), g02.p(), n10, g02.o()));
            this.f14432d = a10;
            C4965i.a a11 = a10.a();
            if (!(a11 instanceof C4965i.b)) {
                aVar.f(new AssertionError("The EncoderInput of video isn't a SurfaceInput."));
            } else {
                ((C4965i.b) a11).b(this.f14430b, new d0(this, aVar, g02));
            }
        } catch (d0 e10) {
            C4391e0.d("VideoEncoderSession", "Unable to initialize video encoder.", e10);
            aVar.f(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object o(c.a aVar) {
        this.f14439k = aVar;
        return "ReleasedFuture " + this;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object p(c.a aVar) {
        this.f14441m = aVar;
        return "ReadyToReleaseFuture " + this;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object q(G0 g02, h1 h1Var, g gVar, C4926k kVar, c.a aVar) {
        j(g02, h1Var, gVar, kVar, aVar);
        return "ConfigureVideoEncoderFuture " + this;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void r(Surface surface) {
        this.f14436h.a(surface);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void s(c.a aVar, G0 g02, Surface surface) {
        Executor executor;
        int ordinal = this.f14437i.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        if (!(this.f14436h == null || (executor = this.f14435g) == null)) {
                            executor.execute(new f0(this, surface));
                        }
                        C4391e0.l("VideoEncoderSession", "Surface is updated in READY state: " + surface);
                        return;
                    } else if (ordinal != 4) {
                        throw new IllegalStateException("State " + this.f14437i + " is not handled");
                    }
                }
            } else if (g02.t()) {
                C4391e0.a("VideoEncoderSession", "Not provide surface, " + Objects.toString(g02, "EMPTY") + " is already serviced.");
                aVar.c(null);
                h();
                return;
            } else {
                this.f14433e = surface;
                C4391e0.a("VideoEncoderSession", "provide surface: " + surface);
                g02.D(surface, this.f14430b, new e0(this));
                this.f14437i = b.READY;
                aVar.c(this.f14432d);
                return;
            }
        }
        C4391e0.a("VideoEncoderSession", "Not provide surface in " + this.f14437i);
        aVar.c(null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void t() {
        this.f14439k.c(null);
    }

    /* access modifiers changed from: private */
    public void u(G0.g gVar) {
        C4391e0.a("VideoEncoderSession", "Surface can be closed: " + gVar.b().hashCode());
        Surface b10 = gVar.b();
        if (b10 == this.f14433e) {
            this.f14433e = null;
            this.f14441m.c(this.f14432d);
            h();
            return;
        }
        b10.release();
    }

    /* access modifiers changed from: package-private */
    public C10101e<C4965i> i(G0 g02, h1 h1Var, C4926k kVar, g gVar) {
        if (this.f14437i.ordinal() != 0) {
            return n.n(new IllegalStateException("configure() shouldn't be called in " + this.f14437i));
        }
        this.f14437i = b.INITIALIZING;
        this.f14434f = g02;
        C4391e0.a("VideoEncoderSession", "Create VideoEncoderSession: " + this);
        this.f14438j = c.a(new a0(this));
        this.f14440l = c.a(new b0(this));
        C10101e a10 = c.a(new c0(this, g02, h1Var, gVar, kVar));
        n.j(a10, new a(), this.f14430b);
        return n.B(a10);
    }

    /* access modifiers changed from: package-private */
    public Surface k() {
        if (this.f14437i != b.READY) {
            return null;
        }
        return this.f14433e;
    }

    /* access modifiers changed from: package-private */
    public C10101e<C4965i> l() {
        return n.B(this.f14440l);
    }

    /* access modifiers changed from: package-private */
    public C4965i m() {
        return this.f14432d;
    }

    /* access modifiers changed from: package-private */
    public boolean n(G0 g02) {
        int ordinal = this.f14437i.ordinal();
        if (ordinal == 0) {
            return false;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                return false;
            }
            if (ordinal != 3) {
                if (ordinal == 4) {
                    return false;
                }
                throw new IllegalStateException("State " + this.f14437i + " is not handled");
            }
        }
        return this.f14434f == g02;
    }

    public String toString() {
        return "VideoEncoderSession@" + hashCode() + " for " + Objects.toString(this.f14434f, "SURFACE_REQUEST_NOT_CONFIGURED");
    }

    /* access modifiers changed from: package-private */
    public void v(Executor executor, C4965i.b.a aVar) {
        this.f14435g = executor;
        this.f14436h = aVar;
    }

    /* access modifiers changed from: package-private */
    public C10101e<Void> w() {
        h();
        return n.B(this.f14438j);
    }

    /* access modifiers changed from: package-private */
    public void x() {
        int ordinal = this.f14437i.ordinal();
        if (ordinal == 0) {
            this.f14437i = b.RELEASED;
        } else if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
            this.f14437i = b.RELEASED;
            this.f14441m.c(this.f14432d);
            this.f14434f = null;
            if (this.f14432d != null) {
                C4391e0.a("VideoEncoderSession", "VideoEncoder is releasing: " + this.f14432d);
                this.f14432d.release();
                this.f14432d.f().a(new Z(this), this.f14430b);
                this.f14432d = null;
                return;
            }
            C4391e0.l("VideoEncoderSession", "There's no VideoEncoder to release! Finish release completer.");
            this.f14439k.c(null);
        } else if (ordinal == 4) {
            C4391e0.a("VideoEncoderSession", "terminateNow in " + this.f14437i + ", No-op");
        } else {
            throw new IllegalStateException("State " + this.f14437i + " is not handled");
        }
    }
}
