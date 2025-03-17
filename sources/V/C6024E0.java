package v;

import B.j;
import C.C4391e0;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.camera.core.impl.C5019e0;
import androidx.camera.core.impl.C5059z;
import androidx.camera.core.impl.V;
import androidx.camera.core.impl.X;
import androidx.camera.core.impl.c1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import z.y;

/* renamed from: v.E0  reason: case insensitive filesystem */
class C6024E0 {

    /* renamed from: v.E0$a */
    static class a {
        static CaptureRequest.Builder a(CameraDevice cameraDevice, TotalCaptureResult totalCaptureResult) {
            return cameraDevice.createReprocessCaptureRequest(totalCaptureResult);
        }
    }

    private static void a(V v10, CaptureRequest.Builder builder) {
        if (!v10.e().equals(c1.f16864a)) {
            builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, v10.e());
        }
    }

    private static void b(CaptureRequest.Builder builder, X x10) {
        j c10 = j.a.d(x10).c();
        for (X.a next : c10.e()) {
            CaptureRequest.Key key = (CaptureRequest.Key) next.d();
            try {
                builder.set(key, c10.a(next));
            } catch (IllegalArgumentException unused) {
                C4391e0.c("Camera2CaptureRequestBuilder", "CaptureRequest.Key is not supported: " + key);
            }
        }
    }

    private static void c(CaptureRequest.Builder builder, int i10, y yVar) {
        for (Map.Entry next : yVar.a(i10).entrySet()) {
            builder.set((CaptureRequest.Key) next.getKey(), next.getValue());
        }
    }

    static void d(V v10, CaptureRequest.Builder builder) {
        if (v10.h() == 1 || v10.l() == 1) {
            builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
        } else if (v10.h() == 2) {
            builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 2);
        } else if (v10.l() == 2) {
            builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
        }
    }

    public static CaptureRequest e(V v10, CameraDevice cameraDevice, Map<C5019e0, Surface> map, boolean z10, y yVar) {
        CaptureRequest.Builder builder;
        if (cameraDevice == null) {
            return null;
        }
        List<Surface> g10 = g(v10.i(), map);
        if (g10.isEmpty()) {
            return null;
        }
        C5059z d10 = v10.d();
        if (v10.k() != 5 || d10 == null || !(d10.f() instanceof TotalCaptureResult)) {
            C4391e0.a("Camera2CaptureRequestBuilder", "createCaptureRequest");
            if (v10.k() == 5) {
                builder = cameraDevice.createCaptureRequest(z10 ? 1 : 2);
            } else {
                builder = cameraDevice.createCaptureRequest(v10.k());
            }
        } else {
            C4391e0.a("Camera2CaptureRequestBuilder", "createReprocessCaptureRequest");
            builder = a.a(cameraDevice, (TotalCaptureResult) d10.f());
        }
        c(builder, v10.k(), yVar);
        a(v10, builder);
        d(v10, builder);
        X g11 = v10.g();
        X.a<Integer> aVar = V.f16779i;
        if (g11.b(aVar)) {
            builder.set(CaptureRequest.JPEG_ORIENTATION, (Integer) v10.g().a(aVar));
        }
        X g12 = v10.g();
        X.a<Integer> aVar2 = V.f16780j;
        if (g12.b(aVar2)) {
            builder.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) v10.g().a(aVar2)).byteValue()));
        }
        b(builder, v10.g());
        for (Surface addTarget : g10) {
            builder.addTarget(addTarget);
        }
        builder.setTag(v10.j());
        return builder.build();
    }

    public static CaptureRequest f(V v10, CameraDevice cameraDevice, y yVar) {
        if (cameraDevice == null) {
            return null;
        }
        C4391e0.a("Camera2CaptureRequestBuilder", "template type = " + v10.k());
        CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(v10.k());
        c(createCaptureRequest, v10.k(), yVar);
        b(createCaptureRequest, v10.g());
        return createCaptureRequest.build();
    }

    private static List<Surface> g(List<C5019e0> list, Map<C5019e0, Surface> map) {
        ArrayList arrayList = new ArrayList();
        for (C5019e0 e0Var : list) {
            Surface surface = map.get(e0Var);
            if (surface != null) {
                arrayList.add(surface);
            } else {
                throw new IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
            }
        }
        return arrayList;
    }
}
