package w;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;

/* renamed from: w.b  reason: case insensitive filesystem */
public class C6167b {
    public static void a(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession, Surface surface) {
        stateCallback.onSurfacePrepared(cameraCaptureSession, surface);
    }
}
