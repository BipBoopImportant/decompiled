package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.core.impl.N0;
import w.B;

public class CaptureNoResponseQuirk implements N0 {
    static boolean f(B b10) {
        String str = Build.HARDWARE;
        return ("samsungexynos7420".equalsIgnoreCase(str) || "universal7420".equalsIgnoreCase(str)) && ((Integer) b10.a(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
