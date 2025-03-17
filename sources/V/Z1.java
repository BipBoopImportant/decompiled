package v;

import C.C4391e0;
import I.d;
import I.n;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
import androidx.camera.core.impl.C5019e0;
import androidx.camera.core.impl.R0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import ob.C10101e;
import x.q;
import z.h;
import z.i;
import z.s;
import z.u;

class Z1 extends V1 {

    /* renamed from: o  reason: collision with root package name */
    private final ScheduledExecutorService f30433o;

    /* renamed from: p  reason: collision with root package name */
    private final Object f30434p = new Object();

    /* renamed from: q  reason: collision with root package name */
    private List<C5019e0> f30435q;

    /* renamed from: r  reason: collision with root package name */
    C10101e<List<Void>> f30436r;

    /* renamed from: s  reason: collision with root package name */
    private final i f30437s;

    /* renamed from: t  reason: collision with root package name */
    private final h f30438t;

    /* renamed from: u  reason: collision with root package name */
    private final s f30439u;

    /* renamed from: v  reason: collision with root package name */
    private final u f30440v;

    /* renamed from: w  reason: collision with root package name */
    private final AtomicBoolean f30441w;

    Z1(R0 r02, R0 r03, C6066f1 f1Var, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        super(f1Var, executor, scheduledExecutorService, handler);
        boolean z10 = false;
        this.f30441w = new AtomicBoolean(false);
        this.f30437s = new i(r02, r03);
        this.f30439u = new s((r02.a(CaptureSessionStuckQuirk.class) || r02.a(IncorrectCaptureStateQuirk.class)) ? true : z10);
        this.f30438t = new h(r03);
        this.f30440v = new u(r03);
        this.f30433o = scheduledExecutorService;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void E() {
        O("Session call super.close()");
        super.close();
    }

    private void N() {
        for (P1 close : this.f30403b.d()) {
            close.close();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void P(P1 p12) {
        super.s(p12);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C10101e Q(CameraDevice cameraDevice, q qVar, List list, List list2) {
        if (this.f30440v.a()) {
            N();
        }
        O("start openCaptureSession");
        return super.e(cameraDevice, qVar, list);
    }

    /* access modifiers changed from: package-private */
    public void O(String str) {
        C4391e0.a("SyncCaptureSessionImpl", "[" + this + "] " + str);
    }

    public void close() {
        if (!this.f30441w.compareAndSet(false, true)) {
            O("close() has been called. Skip this invocation.");
            return;
        }
        if (this.f30440v.a()) {
            try {
                O("Call abortCaptures() before closing session.");
                g();
            } catch (Exception e10) {
                O("Exception when calling abortCaptures()" + e10);
            }
        }
        O("Session call close()");
        this.f30439u.e().a(new X1(this), b());
    }

    public void d() {
        super.d();
        this.f30439u.i();
    }

    public C10101e<Void> e(CameraDevice cameraDevice, q qVar, List<C5019e0> list) {
        C10101e<Void> B10;
        synchronized (this.f30434p) {
            try {
                List<P1> d10 = this.f30403b.d();
                ArrayList arrayList = new ArrayList();
                for (P1 n10 : d10) {
                    arrayList.add(n10.n());
                }
                C10101e<List<Void>> F10 = n.F(arrayList);
                this.f30436r = F10;
                B10 = n.B(d.b(F10).f(new Y1(this, cameraDevice, qVar, list), b()));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return B10;
    }

    public void f(int i10) {
        super.f(i10);
        if (i10 == 5) {
            synchronized (this.f30434p) {
                try {
                    if (D() && this.f30435q != null) {
                        O("Close DeferrableSurfaces for CameraDevice error.");
                        for (C5019e0 d10 : this.f30435q) {
                            d10.d();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public int i(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        return super.i(captureRequest, this.f30439u.d(captureCallback));
    }

    public C10101e<List<Surface>> j(List<C5019e0> list, long j10) {
        C10101e<List<Surface>> j11;
        synchronized (this.f30434p) {
            this.f30435q = list;
            j11 = super.j(list, j10);
        }
        return j11;
    }

    public int k(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) {
        return super.k(list, this.f30439u.d(captureCallback));
    }

    public C10101e<Void> n() {
        return n.A(1500, this.f30433o, this.f30439u.e());
    }

    public void q(P1 p12) {
        synchronized (this.f30434p) {
            this.f30437s.a(this.f30435q);
        }
        O("onClosed()");
        super.q(p12);
    }

    public void s(P1 p12) {
        O("Session onConfigured()");
        this.f30438t.c(p12, this.f30403b.e(), this.f30403b.d(), new W1(this));
    }

    public boolean stop() {
        boolean stop;
        synchronized (this.f30434p) {
            try {
                if (D()) {
                    this.f30437s.a(this.f30435q);
                } else {
                    C10101e<List<Void>> eVar = this.f30436r;
                    if (eVar != null) {
                        eVar.cancel(true);
                    }
                }
                stop = super.stop();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return stop;
    }
}
