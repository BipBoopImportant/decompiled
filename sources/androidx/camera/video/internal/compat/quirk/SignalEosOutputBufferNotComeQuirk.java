package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.N0;

public class SignalEosOutputBufferNotComeQuirk implements N0 {
    private static boolean f() {
        return "Nokia".equalsIgnoreCase(Build.BRAND) && "Nokia 1".equalsIgnoreCase(Build.MODEL);
    }

    static boolean g() {
        return f();
    }
}
