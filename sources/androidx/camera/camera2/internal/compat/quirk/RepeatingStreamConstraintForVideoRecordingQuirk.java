package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.N0;

public class RepeatingStreamConstraintForVideoRecordingQuirk implements N0 {
    public static boolean f() {
        return "Huawei".equalsIgnoreCase(Build.BRAND) && "mha-l29".equalsIgnoreCase(Build.MODEL);
    }

    static boolean g() {
        return f();
    }
}
