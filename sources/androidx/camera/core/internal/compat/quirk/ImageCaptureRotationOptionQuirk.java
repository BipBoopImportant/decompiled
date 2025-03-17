package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.N0;
import androidx.camera.core.impl.V;
import androidx.camera.core.impl.X;

public final class ImageCaptureRotationOptionQuirk implements N0 {
    private static boolean f() {
        String str = Build.FINGERPRINT;
        if (!str.startsWith("generic") && !str.startsWith("unknown")) {
            String str2 = Build.MODEL;
            return str2.contains("google_sdk") || str2.contains("Emulator") || str2.contains("Cuttlefish") || str2.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion") || (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) || Build.PRODUCT.equals("google_sdk") || Build.HARDWARE.contains("ranchu");
        }
    }

    private static boolean g() {
        f();
        return false;
    }

    private static boolean h() {
        return "HONOR".equalsIgnoreCase(Build.BRAND) && "STK-LX1".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean i() {
        return "HUAWEI".equalsIgnoreCase(Build.BRAND) && "SNE-LX1".equalsIgnoreCase(Build.MODEL);
    }

    static boolean k() {
        return i() || h() || g();
    }

    public boolean j(X.a<?> aVar) {
        return aVar != V.f16779i;
    }
}
