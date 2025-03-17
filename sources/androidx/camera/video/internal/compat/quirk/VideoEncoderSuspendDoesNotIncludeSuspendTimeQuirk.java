package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.N0;

public class VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk implements N0 {
    static boolean f() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && Build.VERSION.SDK_INT < 29;
    }
}
