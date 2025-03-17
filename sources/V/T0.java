package v;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.core.impl.C5040p;

final class T0 extends C5040p {

    /* renamed from: a  reason: collision with root package name */
    private final CameraCaptureSession.CaptureCallback f30395a;

    private T0(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback != null) {
            this.f30395a = captureCallback;
            return;
        }
        throw new NullPointerException("captureCallback is null");
    }

    static T0 e(CameraCaptureSession.CaptureCallback captureCallback) {
        return new T0(captureCallback);
    }

    /* access modifiers changed from: package-private */
    public CameraCaptureSession.CaptureCallback f() {
        return this.f30395a;
    }
}
