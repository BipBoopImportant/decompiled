package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.N0;
import com.adjust.sdk.Constants;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class ZslDisablerQuirk implements N0 {

    /* renamed from: a  reason: collision with root package name */
    private static final List<String> f16648a = Arrays.asList(new String[]{"SM-F936", "SM-S901U", "SM-S908U", "SM-S908U1"});

    /* renamed from: b  reason: collision with root package name */
    private static final List<String> f16649b = Arrays.asList(new String[]{"MI 8"});

    private static boolean f(List<String> list) {
        for (String startsWith : list) {
            if (Build.MODEL.toUpperCase(Locale.US).startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    private static boolean g() {
        return Constants.REFERRER_API_SAMSUNG.equalsIgnoreCase(Build.BRAND) && f(f16648a);
    }

    private static boolean h() {
        return Constants.REFERRER_API_XIAOMI.equalsIgnoreCase(Build.BRAND) && f(f16649b);
    }

    static boolean i() {
        return g() || h();
    }
}
