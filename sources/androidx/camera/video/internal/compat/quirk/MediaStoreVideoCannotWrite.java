package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.N0;

public class MediaStoreVideoCannotWrite implements N0 {
    public static boolean f() {
        return "itel".equalsIgnoreCase(Build.BRAND) && "itel w6004".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean g() {
        return "positivo".equalsIgnoreCase(Build.BRAND) && "twist 2 pro".equalsIgnoreCase(Build.MODEL);
    }

    static boolean h() {
        return g() || f();
    }
}
