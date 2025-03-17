package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.N0;

public class NegativeLatLongSavesIncorrectlyQuirk implements N0 {
    static boolean f() {
        return Build.VERSION.SDK_INT < 34;
    }
}
