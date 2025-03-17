package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.core.impl.N0;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import w.B;

public class ImageCaptureFailWithAutoFlashQuirk implements N0 {

    /* renamed from: a  reason: collision with root package name */
    private static final List<String> f16630a = Arrays.asList(new String[]{"sm-j700f", "sm-j710f"});

    static boolean f(B b10) {
        return f16630a.contains(Build.MODEL.toLowerCase(Locale.US)) && ((Integer) b10.a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
