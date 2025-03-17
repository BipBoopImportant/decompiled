package v;

import android.hardware.camera2.CameraCharacteristics;
import w.B;

final class v2 {
    public static boolean a(B b10, int i10) {
        int[] iArr = (int[]) b10.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
        }
        return false;
    }
}
