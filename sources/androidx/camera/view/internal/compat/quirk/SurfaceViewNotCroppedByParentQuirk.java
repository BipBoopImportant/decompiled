package androidx.camera.view.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.N0;

public class SurfaceViewNotCroppedByParentQuirk implements N0 {
    static boolean f() {
        return "XIAOMI".equalsIgnoreCase(Build.MANUFACTURER) && "M2101K7AG".equalsIgnoreCase(Build.MODEL);
    }
}
