package w;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: w.w  reason: case insensitive filesystem */
class C6187w extends x {
    C6187w(CameraCaptureSession cameraCaptureSession) {
        super(cameraCaptureSession, (Object) null);
    }

    public int b(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f31119a.captureBurstRequests(list, executor, captureCallback);
    }

    public int c(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f31119a.setSingleRepeatingRequest(captureRequest, executor, captureCallback);
    }
}
