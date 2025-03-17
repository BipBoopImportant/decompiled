package v;

import C.C4387c0;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import w.C6172g;
import w.O;

public final class O0 {
    public static boolean a(O o10, String str) {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return true;
        }
        try {
            int[] iArr = (int[]) o10.c(str).a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i10 : iArr) {
                    if (i10 == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (C6172g e10) {
            throw new C4387c0(R0.a(e10));
        }
    }
}
