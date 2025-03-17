package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Pair;
import androidx.camera.core.impl.N0;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class FlashAvailabilityBufferUnderflowQuirk implements N0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Set<Pair<String, String>> f16628a = new HashSet();

    static {
        f("sprd", "lemp");
        f("sprd", "DM20C");
    }

    private static void f(String str, String str2) {
        Set<Pair<String, String>> set = f16628a;
        Locale locale = Locale.US;
        set.add(new Pair(str.toLowerCase(locale), str2.toLowerCase(locale)));
    }

    static boolean g() {
        Set<Pair<String, String>> set = f16628a;
        String str = Build.MANUFACTURER;
        Locale locale = Locale.US;
        return set.contains(new Pair(str.toLowerCase(locale), Build.MODEL.toLowerCase(locale)));
    }
}
