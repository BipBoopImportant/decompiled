package v;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.List;

public final class N0 {

    private static final class a extends CameraDevice.StateCallback {

        /* renamed from: a  reason: collision with root package name */
        private final List<CameraDevice.StateCallback> f30334a = new ArrayList();

        a(List<CameraDevice.StateCallback> list) {
            for (CameraDevice.StateCallback next : list) {
                if (!(next instanceof b)) {
                    this.f30334a.add(next);
                }
            }
        }

        public void onClosed(CameraDevice cameraDevice) {
            for (CameraDevice.StateCallback onClosed : this.f30334a) {
                onClosed.onClosed(cameraDevice);
            }
        }

        public void onDisconnected(CameraDevice cameraDevice) {
            for (CameraDevice.StateCallback onDisconnected : this.f30334a) {
                onDisconnected.onDisconnected(cameraDevice);
            }
        }

        public void onError(CameraDevice cameraDevice, int i10) {
            for (CameraDevice.StateCallback onError : this.f30334a) {
                onError.onError(cameraDevice, i10);
            }
        }

        public void onOpened(CameraDevice cameraDevice) {
            for (CameraDevice.StateCallback onOpened : this.f30334a) {
                onOpened.onOpened(cameraDevice);
            }
        }
    }

    static final class b extends CameraDevice.StateCallback {
        b() {
        }

        public void onClosed(CameraDevice cameraDevice) {
        }

        public void onDisconnected(CameraDevice cameraDevice) {
        }

        public void onError(CameraDevice cameraDevice, int i10) {
        }

        public void onOpened(CameraDevice cameraDevice) {
        }
    }

    public static CameraDevice.StateCallback a(List<CameraDevice.StateCallback> list) {
        return list.isEmpty() ? b() : list.size() == 1 ? list.get(0) : new a(list);
    }

    public static CameraDevice.StateCallback b() {
        return new b();
    }
}
