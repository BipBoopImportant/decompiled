package w;

import C.C4391e0;
import H2.i;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;
import w.C;
import x.k;
import x.q;

class K implements C.a {

    /* renamed from: a  reason: collision with root package name */
    final CameraDevice f31042a;

    /* renamed from: b  reason: collision with root package name */
    final Object f31043b;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        final Handler f31044a;

        a(Handler handler) {
            this.f31044a = handler;
        }
    }

    K(CameraDevice cameraDevice, Object obj) {
        this.f31042a = (CameraDevice) i.g(cameraDevice);
        this.f31043b = obj;
    }

    private static void b(CameraDevice cameraDevice, List<k> list) {
        String id2 = cameraDevice.getId();
        for (k c10 : list) {
            String c11 = c10.c();
            if (c11 != null && !c11.isEmpty()) {
                C4391e0.l("CameraDeviceCompat", "Camera " + id2 + ": Camera doesn't support physicalCameraId " + c11 + ". Ignoring.");
            }
        }
    }

    static void c(CameraDevice cameraDevice, q qVar) {
        i.g(cameraDevice);
        i.g(qVar);
        i.g(qVar.e());
        List<k> c10 = qVar.c();
        if (c10 == null) {
            throw new IllegalArgumentException("Invalid output configurations");
        } else if (qVar.a() != null) {
            b(cameraDevice, c10);
        } else {
            throw new IllegalArgumentException("Invalid executor");
        }
    }

    static List<Surface> d(List<k> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (k d10 : list) {
            arrayList.add(d10.d());
        }
        return arrayList;
    }
}
