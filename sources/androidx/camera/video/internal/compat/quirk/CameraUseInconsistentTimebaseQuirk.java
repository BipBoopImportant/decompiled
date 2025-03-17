package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.N0;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CameraUseInconsistentTimebaseQuirk implements N0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Set<String> f17078a = new HashSet(Arrays.asList(new String[]{"samsungexynos7570", "samsungexynos7870", "qcom"}));

    /* renamed from: b  reason: collision with root package name */
    private static final Set<String> f17079b = new HashSet(Arrays.asList(new String[]{"sm4350", "sm6375", "sm7325"}));

    /* renamed from: c  reason: collision with root package name */
    private static final Set<String> f17080c = new HashSet(Arrays.asList(new String[]{"m2007j20cg", "m2007j20ct"}));

    private static boolean f() {
        return f17080c.contains(Build.MODEL.toLowerCase());
    }

    private static boolean g() {
        return "SAMSUNG".equalsIgnoreCase(Build.BRAND) && f17078a.contains(Build.HARDWARE.toLowerCase());
    }

    static boolean h() {
        return i() || g() || f();
    }

    private static boolean i() {
        return Build.VERSION.SDK_INT >= 31 && f17079b.contains(Build.SOC_MODEL.toLowerCase());
    }
}
