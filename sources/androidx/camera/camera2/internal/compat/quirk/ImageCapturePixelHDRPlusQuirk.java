package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.N0;
import java.util.Arrays;
import java.util.List;

public class ImageCapturePixelHDRPlusQuirk implements N0 {

    /* renamed from: a  reason: collision with root package name */
    public static final List<String> f16634a = Arrays.asList(new String[]{"Pixel 2", "Pixel 2 XL", "Pixel 3", "Pixel 3 XL"});

    static boolean f() {
        return f16634a.contains(Build.MODEL) && "Google".equals(Build.MANUFACTURER);
    }
}
