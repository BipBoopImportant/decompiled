package w;

import H2.i;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import java.util.List;
import java.util.concurrent.Executor;
import w.C6173h;

class x implements C6173h.a {

    /* renamed from: a  reason: collision with root package name */
    final CameraCaptureSession f31119a;

    /* renamed from: b  reason: collision with root package name */
    final Object f31120b;

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        final Handler f31121a;

        a(Handler handler) {
            this.f31121a = handler;
        }
    }

    x(CameraCaptureSession cameraCaptureSession, Object obj) {
        this.f31119a = (CameraCaptureSession) i.g(cameraCaptureSession);
        this.f31120b = obj;
    }

    static C6173h.a d(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new x(cameraCaptureSession, new a(handler));
    }

    public CameraCaptureSession a() {
        return this.f31119a;
    }

    public int b(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f31119a.captureBurst(list, new C6173h.b(executor, captureCallback), ((a) this.f31120b).f31121a);
    }

    public int c(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f31119a.setRepeatingRequest(captureRequest, new C6173h.b(executor, captureCallback), ((a) this.f31120b).f31121a);
    }
}
