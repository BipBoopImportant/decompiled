package z;

import android.annotation.SuppressLint;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk;
import androidx.camera.camera2.internal.compat.quirk.b;
import u.C5965a;

public class j {
    @SuppressLint({"NewApi"})
    public void a(int i10, C5965a.C0464a aVar) {
        if (((ImageCapturePixelHDRPlusQuirk) b.b(ImageCapturePixelHDRPlusQuirk.class)) != null) {
            if (i10 == 0) {
                aVar.f(CaptureRequest.CONTROL_ENABLE_ZSL, Boolean.TRUE);
            } else if (i10 == 1) {
                aVar.f(CaptureRequest.CONTROL_ENABLE_ZSL, Boolean.FALSE);
            }
        }
    }
}
