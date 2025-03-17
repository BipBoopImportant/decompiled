package androidx.camera.video.internal.compat.quirk;

import V.C4927l;
import android.os.Build;
import androidx.camera.core.impl.I;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import java.util.Arrays;
import java.util.Locale;

public class ReportedVideoQualityNotSupportedQuirk implements VideoQualityQuirk, SurfaceProcessingQuirk {
    private static boolean f() {
        return "Huawei".equalsIgnoreCase(Build.BRAND) && "HMA-L29".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean g() {
        return "Huawei".equalsIgnoreCase(Build.BRAND) && "LYA-AL00".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean h() {
        return "Huawei".equalsIgnoreCase(Build.MANUFACTURER) && Arrays.asList(new String[]{"JNY-L21A", "JNY-L01A", "JNY-L21B", "JNY-L22A", "JNY-L02A", "JNY-L22B", "JNY-LX1"}).contains(Build.MODEL.toUpperCase(Locale.US));
    }

    private static boolean i() {
        return "OPPO".equalsIgnoreCase(Build.BRAND) && "PHT110".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean j() {
        return "Vivo".equalsIgnoreCase(Build.BRAND) && "vivo 1820".equalsIgnoreCase(Build.MODEL);
    }

    static boolean k() {
        return f() || g() || j() || h() || i();
    }

    public boolean c(I i10, C4927l lVar) {
        if (f() || g()) {
            return lVar == C4927l.f14462d;
        }
        if (j()) {
            return lVar == C4927l.f14460b || lVar == C4927l.f14461c;
        }
        if (h()) {
            return i10.f() == 0 && (lVar == C4927l.f14461c || lVar == C4927l.f14460b);
        }
        if (i()) {
            return i10.f() == 1 && lVar == C4927l.f14462d;
        }
        return false;
    }

    public boolean d() {
        return f() || g() || h() || i();
    }
}
