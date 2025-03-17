package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.core.impl.N0;
import w.B;

public class LegacyCameraSurfaceCleanupQuirk implements N0 {
    static boolean f(B b10) {
        Integer num = (Integer) b10.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }

    static boolean g(B b10) {
        return Build.VERSION.SDK_INT < 29 && f(b10);
    }
}
