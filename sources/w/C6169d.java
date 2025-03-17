package w;

import android.hardware.camera2.CameraCaptureSession;

/* renamed from: w.d  reason: case insensitive filesystem */
public class C6169d {
    public static void a(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession) {
        stateCallback.onCaptureQueueEmpty(cameraCaptureSession);
    }
}
