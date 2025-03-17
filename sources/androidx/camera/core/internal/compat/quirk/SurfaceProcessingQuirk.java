package androidx.camera.core.internal.compat.quirk;

import androidx.camera.core.impl.N0;
import androidx.camera.core.impl.R0;

public interface SurfaceProcessingQuirk extends N0 {
    static boolean e(R0 r02) {
        for (SurfaceProcessingQuirk d10 : r02.c(SurfaceProcessingQuirk.class)) {
            if (d10.d()) {
                return true;
            }
        }
        return false;
    }

    boolean d() {
        return true;
    }
}
