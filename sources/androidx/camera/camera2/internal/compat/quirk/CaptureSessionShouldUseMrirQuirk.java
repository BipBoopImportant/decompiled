package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.N0;
import com.adjust.sdk.Constants;

public class CaptureSessionShouldUseMrirQuirk implements N0 {
    static boolean f() {
        return Constants.REFERRER_API_GOOGLE.equalsIgnoreCase(Build.BRAND) && Build.VERSION.SDK_INT >= 35;
    }
}
