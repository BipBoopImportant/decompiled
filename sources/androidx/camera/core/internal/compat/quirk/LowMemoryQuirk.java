package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.N0;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class LowMemoryQuirk implements N0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Set<String> f17037a = new HashSet(Arrays.asList(new String[]{"SM-A520W", "MOTOG3"}));

    static boolean f() {
        return f17037a.contains(Build.MODEL.toUpperCase(Locale.US));
    }
}
