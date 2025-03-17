package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.core.impl.N0;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import v.C6109u;
import w.B;

public class TorchFlashRequiredFor3aUpdateQuirk implements N0 {

    /* renamed from: b  reason: collision with root package name */
    private static final List<String> f16645b = Arrays.asList(new String[]{"PIXEL 6A", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7A", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO"});

    /* renamed from: a  reason: collision with root package name */
    private final B f16646a;

    public TorchFlashRequiredFor3aUpdateQuirk(B b10) {
        this.f16646a = b10;
    }

    private static boolean f(B b10) {
        return g() && j(b10);
    }

    private static boolean g() {
        for (String equals : f16645b) {
            if (Build.MODEL.toUpperCase(Locale.US).equals(equals)) {
                return true;
            }
        }
        return false;
    }

    private static boolean h(B b10) {
        return Build.VERSION.SDK_INT >= 28 && C6109u.P(b10, 5) == 5;
    }

    private static boolean j(B b10) {
        return ((Integer) b10.a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }

    static boolean k(B b10) {
        return f(b10);
    }

    public boolean i() {
        return !h(this.f16646a);
    }
}
