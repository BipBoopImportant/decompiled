package v;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import v.P1;
import w.C6167b;
import w.C6169d;

final class a2 extends P1.c {

    /* renamed from: a  reason: collision with root package name */
    private final List<P1.c> f30490a;

    a2(List<P1.c> list) {
        ArrayList arrayList = new ArrayList();
        this.f30490a = arrayList;
        arrayList.addAll(list);
    }

    static P1.c w(P1.c... cVarArr) {
        return new a2(Arrays.asList(cVarArr));
    }

    public void o(P1 p12) {
        for (P1.c o10 : this.f30490a) {
            o10.o(p12);
        }
    }

    public void p(P1 p12) {
        for (P1.c p10 : this.f30490a) {
            p10.p(p12);
        }
    }

    public void q(P1 p12) {
        for (P1.c q10 : this.f30490a) {
            q10.q(p12);
        }
    }

    public void r(P1 p12) {
        for (P1.c r10 : this.f30490a) {
            r10.r(p12);
        }
    }

    public void s(P1 p12) {
        for (P1.c s10 : this.f30490a) {
            s10.s(p12);
        }
    }

    public void t(P1 p12) {
        for (P1.c t10 : this.f30490a) {
            t10.t(p12);
        }
    }

    /* access modifiers changed from: package-private */
    public void u(P1 p12) {
        for (P1.c u10 : this.f30490a) {
            u10.u(p12);
        }
    }

    public void v(P1 p12, Surface surface) {
        for (P1.c v10 : this.f30490a) {
            v10.v(p12, surface);
        }
    }

    static class a extends P1.c {

        /* renamed from: a  reason: collision with root package name */
        private final CameraCaptureSession.StateCallback f30491a;

        a(CameraCaptureSession.StateCallback stateCallback) {
            this.f30491a = stateCallback;
        }

        public void o(P1 p12) {
            this.f30491a.onActive(p12.l().c());
        }

        public void p(P1 p12) {
            C6169d.a(this.f30491a, p12.l().c());
        }

        public void q(P1 p12) {
            this.f30491a.onClosed(p12.l().c());
        }

        public void r(P1 p12) {
            this.f30491a.onConfigureFailed(p12.l().c());
        }

        public void s(P1 p12) {
            this.f30491a.onConfigured(p12.l().c());
        }

        public void t(P1 p12) {
            this.f30491a.onReady(p12.l().c());
        }

        /* access modifiers changed from: package-private */
        public void u(P1 p12) {
        }

        public void v(P1 p12, Surface surface) {
            C6167b.a(this.f30491a, p12.l().c(), surface);
        }

        a(List<CameraCaptureSession.StateCallback> list) {
            this(M0.a(list));
        }
    }
}
