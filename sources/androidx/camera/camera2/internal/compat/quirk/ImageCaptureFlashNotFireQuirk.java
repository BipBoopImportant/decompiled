package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import w.B;

public class ImageCaptureFlashNotFireQuirk implements UseTorchAsFlashQuirk {

    /* renamed from: a  reason: collision with root package name */
    private static final List<String> f16632a = Arrays.asList(new String[]{"itel w6004"});

    /* renamed from: b  reason: collision with root package name */
    private static final List<String> f16633b = Arrays.asList(new String[]{"sm-j700f", "sm-j710f"});

    static boolean f(B b10) {
        List<String> list = f16633b;
        String str = Build.MODEL;
        Locale locale = Locale.US;
        return (list.contains(str.toLowerCase(locale)) && ((Integer) b10.a(CameraCharacteristics.LENS_FACING)).intValue() == 0) || f16632a.contains(str.toLowerCase(locale));
    }
}
