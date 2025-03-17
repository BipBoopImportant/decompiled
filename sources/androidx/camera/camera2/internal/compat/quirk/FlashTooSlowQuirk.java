package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import w.B;

public class FlashTooSlowQuirk implements UseTorchAsFlashQuirk {

    /* renamed from: a  reason: collision with root package name */
    private static final List<String> f16629a = Arrays.asList(new String[]{"PIXEL 3A", "PIXEL 3A XL", "PIXEL 4", "PIXEL 5", "SM-A320", "MOTO G(20)", "ITEL L6006", "RMX3231"});

    private static boolean f() {
        for (String startsWith : f16629a) {
            if (Build.MODEL.toUpperCase(Locale.US).startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    static boolean g(B b10) {
        return f() && ((Integer) b10.a(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
