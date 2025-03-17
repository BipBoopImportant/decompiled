package w;

import H2.i;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import java.util.List;
import w.C6173h;
import w.K;
import x.j;
import x.k;
import x.q;

class I extends H {
    I(CameraDevice cameraDevice, Object obj) {
        super(cameraDevice, obj);
    }

    static I e(CameraDevice cameraDevice, Handler handler) {
        return new I(cameraDevice, new K.a(handler));
    }

    public void a(q qVar) {
        K.c(this.f31042a, qVar);
        C6173h.c cVar = new C6173h.c(qVar.a(), qVar.e());
        List<k> c10 = qVar.c();
        Handler handler = ((K.a) i.g((K.a) this.f31043b)).f31044a;
        j b10 = qVar.b();
        if (b10 != null) {
            try {
                InputConfiguration inputConfiguration = (InputConfiguration) b10.a();
                i.g(inputConfiguration);
                this.f31042a.createReprocessableCaptureSessionByConfigurations(inputConfiguration, q.h(c10), cVar, handler);
            } catch (CameraAccessException e10) {
                throw C6172g.e(e10);
            }
        } else if (qVar.d() == 1) {
            this.f31042a.createConstrainedHighSpeedCaptureSession(K.d(c10), cVar, handler);
        } else {
            this.f31042a.createCaptureSessionByOutputConfigurations(q.h(c10), cVar, handler);
        }
    }
}
