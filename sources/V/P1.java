package v;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.core.impl.C5019e0;
import androidx.camera.core.impl.R0;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import ob.C10101e;
import w.C6173h;
import x.k;
import x.q;

public interface P1 {

    public interface a {
        Executor b();

        C10101e<Void> e(CameraDevice cameraDevice, q qVar, List<C5019e0> list);

        C10101e<List<Surface>> j(List<C5019e0> list, long j10);

        q m(int i10, List<k> list, c cVar);

        boolean stop();
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final Executor f30362a;

        /* renamed from: b  reason: collision with root package name */
        private final ScheduledExecutorService f30363b;

        /* renamed from: c  reason: collision with root package name */
        private final Handler f30364c;

        /* renamed from: d  reason: collision with root package name */
        private final C6066f1 f30365d;

        /* renamed from: e  reason: collision with root package name */
        private final R0 f30366e;

        /* renamed from: f  reason: collision with root package name */
        private final R0 f30367f;

        b(Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler, C6066f1 f1Var, R0 r02, R0 r03) {
            this.f30362a = executor;
            this.f30363b = scheduledExecutorService;
            this.f30364c = handler;
            this.f30365d = f1Var;
            this.f30366e = r02;
            this.f30367f = r03;
        }

        /* access modifiers changed from: package-private */
        public a a() {
            return new Z1(this.f30366e, this.f30367f, this.f30365d, this.f30362a, this.f30363b, this.f30364c);
        }
    }

    public static abstract class c {
        /* access modifiers changed from: package-private */
        public void o(P1 p12) {
        }

        /* access modifiers changed from: package-private */
        public void p(P1 p12) {
        }

        public void q(P1 p12) {
        }

        public void r(P1 p12) {
        }

        /* access modifiers changed from: package-private */
        public void s(P1 p12) {
        }

        /* access modifiers changed from: package-private */
        public void t(P1 p12) {
        }

        /* access modifiers changed from: package-private */
        public void u(P1 p12) {
        }

        /* access modifiers changed from: package-private */
        public void v(P1 p12, Surface surface) {
        }
    }

    void a();

    c c();

    void close();

    void d();

    void f(int i10);

    void g();

    CameraDevice h();

    int i(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback);

    int k(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback);

    C6173h l();

    C10101e<Void> n();
}
