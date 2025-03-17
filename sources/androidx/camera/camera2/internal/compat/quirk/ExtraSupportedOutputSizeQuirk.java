package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Size;
import androidx.camera.core.impl.N0;

public class ExtraSupportedOutputSizeQuirk implements N0 {
    private Size[] g() {
        return new Size[]{new Size(1440, 1080), new Size(960, 720)};
    }

    private static boolean h() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL);
    }

    static boolean i() {
        return h();
    }

    public Size[] f(int i10) {
        return (i10 != 34 || !h()) ? new Size[0] : g();
    }
}
