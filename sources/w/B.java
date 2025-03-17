package w;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;
import z.m;

public class B {

    /* renamed from: a  reason: collision with root package name */
    private final Map<CameraCharacteristics.Key<?>, Object> f31026a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final a f31027b;

    /* renamed from: c  reason: collision with root package name */
    private final String f31028c;

    /* renamed from: d  reason: collision with root package name */
    private U f31029d = null;

    public interface a {
        <T> T a(CameraCharacteristics.Key<T> key);
    }

    private B(CameraCharacteristics cameraCharacteristics, String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f31027b = new y(cameraCharacteristics);
        } else {
            this.f31027b = new z(cameraCharacteristics);
        }
        this.f31028c = str;
    }

    private boolean c(CameraCharacteristics.Key<?> key) {
        return key.equals(CameraCharacteristics.SENSOR_ORIENTATION);
    }

    public static B e(CameraCharacteristics cameraCharacteristics, String str) {
        return new B(cameraCharacteristics, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T a(android.hardware.camera2.CameraCharacteristics.Key<T> r3) {
        /*
            r2 = this;
            boolean r0 = r2.c(r3)
            if (r0 == 0) goto L_0x000d
            w.B$a r0 = r2.f31027b
            java.lang.Object r3 = r0.a(r3)
            return r3
        L_0x000d:
            monitor-enter(r2)
            java.util.Map<android.hardware.camera2.CameraCharacteristics$Key<?>, java.lang.Object> r0 = r2.f31026a     // Catch:{ all -> 0x0018 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0018 }
            if (r0 == 0) goto L_0x001a
            monitor-exit(r2)     // Catch:{ all -> 0x0018 }
            return r0
        L_0x0018:
            r3 = move-exception
            goto L_0x0029
        L_0x001a:
            w.B$a r0 = r2.f31027b     // Catch:{ all -> 0x0018 }
            java.lang.Object r0 = r0.a(r3)     // Catch:{ all -> 0x0018 }
            if (r0 == 0) goto L_0x0027
            java.util.Map<android.hardware.camera2.CameraCharacteristics$Key<?>, java.lang.Object> r1 = r2.f31026a     // Catch:{ all -> 0x0018 }
            r1.put(r3, r0)     // Catch:{ all -> 0x0018 }
        L_0x0027:
            monitor-exit(r2)     // Catch:{ all -> 0x0018 }
            return r0
        L_0x0029:
            monitor-exit(r2)     // Catch:{ all -> 0x0018 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: w.B.a(android.hardware.camera2.CameraCharacteristics$Key):java.lang.Object");
    }

    public U b() {
        if (this.f31029d == null) {
            try {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (streamConfigurationMap != null) {
                    this.f31029d = U.e(streamConfigurationMap, new m(this.f31028c));
                } else {
                    throw new IllegalArgumentException("StreamConfigurationMap is null!");
                }
            } catch (AssertionError | NullPointerException e10) {
                throw new IllegalArgumentException(e10.getMessage());
            }
        }
        return this.f31029d;
    }

    public boolean d() {
        int[] iArr;
        if (Build.VERSION.SDK_INT >= 34 && (iArr = (int[]) this.f31027b.a(CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES)) != null) {
            for (int i10 : iArr) {
                if (i10 == 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
