package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;
import com.adjust.sdk.Constants;
import w.B;

public final class YuvImageOnePixelShiftQuirk implements OnePixelShiftQuirk {
    private static boolean f() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "MotoG3".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean g() {
        return Constants.REFERRER_API_SAMSUNG.equalsIgnoreCase(Build.BRAND) && "SM-A920F".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean h() {
        return Constants.REFERRER_API_SAMSUNG.equalsIgnoreCase(Build.BRAND) && "SM-G532F".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean i() {
        return Constants.REFERRER_API_SAMSUNG.equalsIgnoreCase(Build.BRAND) && "SM-J415F".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean j() {
        return Constants.REFERRER_API_SAMSUNG.equalsIgnoreCase(Build.BRAND) && "SM-J700F".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean k() {
        return Constants.REFERRER_API_XIAOMI.equalsIgnoreCase(Build.BRAND) && "Mi A1".equalsIgnoreCase(Build.MODEL);
    }

    static boolean l(B b10) {
        return f() || h() || j() || g() || i() || k();
    }
}
