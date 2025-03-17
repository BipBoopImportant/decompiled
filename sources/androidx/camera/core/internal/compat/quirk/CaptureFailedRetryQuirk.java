package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import android.util.Pair;
import androidx.camera.core.impl.N0;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class CaptureFailedRetryQuirk implements N0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Set<Pair<String, String>> f17033a = new HashSet(Collections.singletonList(Pair.create("SAMSUNG", "SM-G981U1")));

    static boolean g() {
        String str = Build.BRAND;
        Locale locale = Locale.US;
        return f17033a.contains(Pair.create(str.toUpperCase(locale), Build.MODEL.toUpperCase(locale)));
    }

    public int f() {
        return 1;
    }
}
