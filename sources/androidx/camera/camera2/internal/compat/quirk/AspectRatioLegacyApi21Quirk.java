package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.core.impl.N0;
import w.B;

public class AspectRatioLegacyApi21Quirk implements N0 {
    static boolean g(B b10) {
        Integer num = (Integer) b10.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return false;
    }

    public int f() {
        return 2;
    }
}
