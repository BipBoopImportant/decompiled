package v;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;
import w.C6167b;
import w.C6169d;

public final class M0 {

    static final class a extends CameraCaptureSession.StateCallback {

        /* renamed from: a  reason: collision with root package name */
        private final List<CameraCaptureSession.StateCallback> f30329a = new ArrayList();

        a(List<CameraCaptureSession.StateCallback> list) {
            for (CameraCaptureSession.StateCallback next : list) {
                if (!(next instanceof b)) {
                    this.f30329a.add(next);
                }
            }
        }

        public void onActive(CameraCaptureSession cameraCaptureSession) {
            for (CameraCaptureSession.StateCallback onActive : this.f30329a) {
                onActive.onActive(cameraCaptureSession);
            }
        }

        public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
            for (CameraCaptureSession.StateCallback a10 : this.f30329a) {
                C6169d.a(a10, cameraCaptureSession);
            }
        }

        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            for (CameraCaptureSession.StateCallback onClosed : this.f30329a) {
                onClosed.onClosed(cameraCaptureSession);
            }
        }

        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            for (CameraCaptureSession.StateCallback onConfigureFailed : this.f30329a) {
                onConfigureFailed.onConfigureFailed(cameraCaptureSession);
            }
        }

        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            for (CameraCaptureSession.StateCallback onConfigured : this.f30329a) {
                onConfigured.onConfigured(cameraCaptureSession);
            }
        }

        public void onReady(CameraCaptureSession cameraCaptureSession) {
            for (CameraCaptureSession.StateCallback onReady : this.f30329a) {
                onReady.onReady(cameraCaptureSession);
            }
        }

        public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
            for (CameraCaptureSession.StateCallback a10 : this.f30329a) {
                C6167b.a(a10, cameraCaptureSession, surface);
            }
        }
    }

    static final class b extends CameraCaptureSession.StateCallback {
        b() {
        }

        public void onActive(CameraCaptureSession cameraCaptureSession) {
        }

        public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        }

        public void onClosed(CameraCaptureSession cameraCaptureSession) {
        }

        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        }

        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
        }

        public void onReady(CameraCaptureSession cameraCaptureSession) {
        }

        public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        }
    }

    public static CameraCaptureSession.StateCallback a(List<CameraCaptureSession.StateCallback> list) {
        return list.isEmpty() ? b() : list.size() == 1 ? list.get(0) : new a(list);
    }

    public static CameraCaptureSession.StateCallback b() {
        return new b();
    }
}
