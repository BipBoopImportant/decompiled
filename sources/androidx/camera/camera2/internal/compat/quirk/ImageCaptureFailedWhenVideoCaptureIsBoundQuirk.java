package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import com.adjust.sdk.Constants;

public class ImageCaptureFailedWhenVideoCaptureIsBoundQuirk implements CaptureIntentPreviewQuirk, SurfaceProcessingQuirk {
    public static boolean f() {
        return "blu".equalsIgnoreCase(Build.BRAND) && "studio x10".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean g() {
        return "itel".equalsIgnoreCase(Build.BRAND) && "itel w6004".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean h() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto e13".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean i() {
        return "pixel 4 xl".equalsIgnoreCase(Build.MODEL) && Build.VERSION.SDK_INT == 29;
    }

    public static boolean j() {
        return "positivo".equalsIgnoreCase(Build.BRAND) && "twist 2 pro".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean k() {
        if (Constants.REFERRER_API_SAMSUNG.equalsIgnoreCase(Build.BRAND)) {
            String str = Build.DEVICE;
            if ("gta8".equalsIgnoreCase(str) || "gta8wifi".equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean l() {
        return Constants.REFERRER_API_VIVO.equalsIgnoreCase(Build.BRAND) && "vivo 1805".equalsIgnoreCase(Build.MODEL);
    }

    static boolean m() {
        return f() || g() || l() || j() || i() || h() || k();
    }

    public boolean a() {
        return f() || g() || l() || j();
    }

    public boolean d() {
        return f() || g() || l() || j() || i() || h() || k();
    }
}
