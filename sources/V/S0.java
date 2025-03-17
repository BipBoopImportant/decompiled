package v;

import H2.i;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.impl.C5040p;
import androidx.camera.core.impl.g1;
import androidx.camera.core.impl.r;

final class S0 extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a  reason: collision with root package name */
    private final C5040p f30376a;

    S0(C5040p pVar) {
        if (pVar != null) {
            this.f30376a = pVar;
            return;
        }
        throw new NullPointerException("cameraCaptureCallback is null");
    }

    private int a(CaptureRequest captureRequest) {
        Integer num;
        if ((captureRequest.getTag() instanceof g1) && (num = (Integer) ((g1) captureRequest.getTag()).d("CAPTURE_CONFIG_ID_KEY")) != null) {
            return num.intValue();
        }
        return -1;
    }

    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        g1 g1Var;
        super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        Object tag = captureRequest.getTag();
        if (tag != null) {
            i.b(tag instanceof g1, "The tagBundle object from the CaptureResult is not a TagBundle object.");
            g1Var = (g1) tag;
        } else {
            g1Var = g1.b();
        }
        this.f30376a.b(a(captureRequest), new C6067g(g1Var, totalCaptureResult));
    }

    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        this.f30376a.c(a(captureRequest), new r(r.a.ERROR));
    }

    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j10, long j11) {
        super.onCaptureStarted(cameraCaptureSession, captureRequest, j10, j11);
        this.f30376a.d(a(captureRequest));
    }
}
