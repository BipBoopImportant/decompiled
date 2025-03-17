package androidx.camera.video.internal.compat.quirk;

import V.C4927l;
import android.os.Build;
import androidx.camera.core.impl.I;

public class ExcludeStretchedVideoQualityQuirk implements VideoQualityQuirk {
    private static boolean f() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && "SM-J260F".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean g() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && "SM-J400G".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean h() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && "SM-J530F".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean i() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && "sm-j600g".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean j() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && "SM-J710MN".equalsIgnoreCase(Build.MODEL) && Build.VERSION.SDK_INT >= 27;
    }

    private static boolean k() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && "SM-J701F".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean l() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && "SM-G610M".equalsIgnoreCase(Build.MODEL) && Build.VERSION.SDK_INT >= 27;
    }

    static boolean m() {
        return f() || g() || h() || i() || k() || l() || j();
    }

    public boolean c(I i10, C4927l lVar) {
        if (g()) {
            return lVar == C4927l.f14461c || lVar == C4927l.f14462d;
        }
        if (f() || h() || i() || k() || l() || j()) {
            return lVar == C4927l.f14461c;
        }
        return false;
    }
}
