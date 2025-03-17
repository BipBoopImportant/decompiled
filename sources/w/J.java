package w;

import H2.i;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;
import x.q;

class J extends I {
    J(CameraDevice cameraDevice) {
        super((CameraDevice) i.g(cameraDevice), (Object) null);
    }

    public void a(q qVar) {
        SessionConfiguration sessionConfiguration = (SessionConfiguration) qVar.j();
        i.g(sessionConfiguration);
        try {
            this.f31042a.createCaptureSession(sessionConfiguration);
        } catch (CameraAccessException e10) {
            throw C6172g.e(e10);
        }
    }
}
