package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.N0;
import com.adjust.sdk.Constants;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class AudioTimestampFramePositionIncorrectQuirk implements N0 {

    /* renamed from: a  reason: collision with root package name */
    private static final List<String> f17077a = Arrays.asList(new String[]{"cph1920", "cph1923", "cph2015", "cph2083"});

    private static boolean f() {
        return "oppo".equalsIgnoreCase(Build.BRAND) && f17077a.contains(Build.MODEL.toLowerCase(Locale.ROOT));
    }

    private static boolean g() {
        return "lge".equalsIgnoreCase(Build.BRAND) && "lg-m250".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean h() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean i() {
        return "realme".equalsIgnoreCase(Build.BRAND) && "rmx1941".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean j() {
        return "Xiaomi".equalsIgnoreCase(Build.BRAND) && "Redmi 6A".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean k() {
        return Constants.REFERRER_API_VIVO.equalsIgnoreCase(Build.BRAND) && "vivo 1820".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean l() {
        return Constants.REFERRER_API_VIVO.equalsIgnoreCase(Build.BRAND) && "VIVO Y17".equalsIgnoreCase(Build.MODEL);
    }

    static boolean m() {
        return f() || g() || h() || i() || j() || k() || l();
    }
}
