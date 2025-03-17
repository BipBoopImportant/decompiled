package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import w.B;

public class JpegCaptureDownsizingQuirk implements SoftwareJpegEncodingPreferredQuirk {

    /* renamed from: a  reason: collision with root package name */
    private static final Set<String> f16640a = new HashSet(Arrays.asList(new String[]{"redmi note 8 pro"}));

    static boolean f(B b10) {
        return f16640a.contains(Build.MODEL.toLowerCase(Locale.US)) && ((Integer) b10.a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
