package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import w.B;

public class ImageCaptureWithFlashUnderexposureQuirk implements UseTorchAsFlashQuirk {

    /* renamed from: a  reason: collision with root package name */
    public static final List<String> f16636a = Arrays.asList(new String[]{"sm-a260f", "sm-j530f", "sm-j600g", "sm-j701f", "sm-g610f", "sm-j710mn"});

    static boolean f(B b10) {
        return f16636a.contains(Build.MODEL.toLowerCase(Locale.US)) && ((Integer) b10.a(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
