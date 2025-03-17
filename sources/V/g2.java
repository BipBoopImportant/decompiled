package v;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import w.B;

public final class g2 {
    public static boolean a(B b10) {
        int[] iArr;
        if (!(Build.VERSION.SDK_INT < 33 || (iArr = (int[]) b10.a(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) == null || iArr.length == 0)) {
            for (int i10 : iArr) {
                if (i10 == 2) {
                    return true;
                }
            }
        }
        return false;
    }
}
