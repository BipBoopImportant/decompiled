package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.N0;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class CrashWhenTakingPhotoWithAutoFlashAEModeQuirk implements N0 {

    /* renamed from: a  reason: collision with root package name */
    static final List<String> f16621a = Arrays.asList(new String[]{"SM-A3000", "SM-A3009", "SM-A300F", "SM-A300FU", "SM-A300G", "SM-A300H", "SM-A300M", "SM-A300X", "SM-A300XU", "SM-A300XZ", "SM-A300Y", "SM-A300YZ", "SM-J510FN", "5059X"});

    static boolean f() {
        return f16621a.contains(Build.MODEL.toUpperCase(Locale.US));
    }
}
