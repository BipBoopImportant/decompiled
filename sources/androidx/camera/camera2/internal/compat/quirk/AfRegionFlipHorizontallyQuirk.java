package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.core.impl.N0;
import w.B;

public class AfRegionFlipHorizontallyQuirk implements N0 {
    static boolean f(B b10) {
        return Build.BRAND.equalsIgnoreCase("SAMSUNG") && Build.VERSION.SDK_INT < 33 && ((Integer) b10.a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
