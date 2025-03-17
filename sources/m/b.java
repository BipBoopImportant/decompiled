package M;

import androidx.camera.core.impl.V;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import androidx.camera.core.internal.compat.quirk.a;
import androidx.camera.core.n;

public class b {
    public boolean a() {
        ImageCaptureRotationOptionQuirk imageCaptureRotationOptionQuirk = (ImageCaptureRotationOptionQuirk) a.b(ImageCaptureRotationOptionQuirk.class);
        return imageCaptureRotationOptionQuirk == null || imageCaptureRotationOptionQuirk.j(V.f16779i);
    }

    public boolean b(n nVar) {
        return a() && N.b.j(nVar.getFormat());
    }
}
