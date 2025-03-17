package w;

import android.hardware.camera2.CameraCharacteristics;
import w.B;

class z implements B.a {

    /* renamed from: a  reason: collision with root package name */
    protected final CameraCharacteristics f31122a;

    z(CameraCharacteristics cameraCharacteristics) {
        this.f31122a = cameraCharacteristics;
    }

    public <T> T a(CameraCharacteristics.Key<T> key) {
        return this.f31122a.get(key);
    }
}
