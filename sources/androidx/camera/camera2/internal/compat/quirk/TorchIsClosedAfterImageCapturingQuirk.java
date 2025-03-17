package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.N0;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class TorchIsClosedAfterImageCapturingQuirk implements N0 {

    /* renamed from: a  reason: collision with root package name */
    public static final List<String> f16647a = Arrays.asList(new String[]{"mi a1", "mi a2", "mi a2 lite", "redmi 4x", "redmi 5a", "redmi note 5", "redmi note 5 pro", "redmi 6 pro"});

    static boolean f() {
        return f16647a.contains(Build.MODEL.toLowerCase(Locale.US));
    }
}
