package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.N0;
import java.util.Arrays;
import java.util.List;

public class Nexus4AndroidLTargetAspectRatioQuirk implements N0 {

    /* renamed from: a  reason: collision with root package name */
    private static final List<String> f16642a = Arrays.asList(new String[]{"NEXUS 4"});

    static boolean g() {
        "GOOGLE".equalsIgnoreCase(Build.BRAND);
        return false;
    }

    public int f() {
        return 2;
    }
}
