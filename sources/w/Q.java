package w;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import java.util.concurrent.Executor;

class Q extends P {
    Q(Context context) {
        super(context);
    }

    public CameraCharacteristics b(String str) {
        try {
            return this.f31056a.getCameraCharacteristics(str);
        } catch (CameraAccessException e10) {
            throw C6172g.e(e10);
        }
    }

    public void d(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        try {
            this.f31056a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e10) {
            throw C6172g.e(e10);
        }
    }
}
