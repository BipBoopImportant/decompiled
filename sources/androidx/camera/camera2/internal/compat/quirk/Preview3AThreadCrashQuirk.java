package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.N0;

public class Preview3AThreadCrashQuirk implements N0 {
    static boolean f() {
        return "samsungexynos7870".equalsIgnoreCase(Build.HARDWARE);
    }
}
