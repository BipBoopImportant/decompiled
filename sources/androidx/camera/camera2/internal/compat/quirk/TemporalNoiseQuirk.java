package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import w.B;

public class TemporalNoiseQuirk implements CaptureIntentPreviewQuirk {
    private static boolean f() {
        return "Pixel 8".equalsIgnoreCase(Build.MODEL);
    }

    static boolean g(B b10) {
        return f() && ((Integer) b10.a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
