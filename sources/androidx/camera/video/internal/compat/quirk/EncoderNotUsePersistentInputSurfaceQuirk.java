package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.N0;
import java.util.Arrays;
import java.util.List;

public class EncoderNotUsePersistentInputSurfaceQuirk implements N0 {

    /* renamed from: a  reason: collision with root package name */
    private static final List<String> f17081a = Arrays.asList(new String[]{"SM-N9208", "SM-G920V"});

    static boolean f() {
        return f17081a.contains(Build.MODEL.toUpperCase());
    }
}
