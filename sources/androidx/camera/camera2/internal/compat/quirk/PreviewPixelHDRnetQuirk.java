package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.N0;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class PreviewPixelHDRnetQuirk implements N0 {

    /* renamed from: a  reason: collision with root package name */
    private static final List<String> f16643a = Arrays.asList(new String[]{"sunfish", "bramble", "redfin", "barbet"});

    static boolean f() {
        return "Google".equals(Build.MANUFACTURER) && f16643a.contains(Build.DEVICE.toLowerCase(Locale.getDefault()));
    }
}
