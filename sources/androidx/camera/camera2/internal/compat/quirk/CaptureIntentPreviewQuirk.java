package androidx.camera.camera2.internal.compat.quirk;

import androidx.camera.core.impl.N0;
import androidx.camera.core.impl.R0;

public interface CaptureIntentPreviewQuirk extends N0 {
    static boolean b(R0 r02) {
        for (CaptureIntentPreviewQuirk a10 : r02.c(CaptureIntentPreviewQuirk.class)) {
            if (a10.a()) {
                return true;
            }
        }
        return false;
    }

    boolean a() {
        return true;
    }
}
