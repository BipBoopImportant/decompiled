package w;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import java.util.Set;

class S extends Q {
    S(Context context) {
        super(context);
    }

    public Set<Set<String>> c() {
        try {
            return this.f31056a.getConcurrentCameraIds();
        } catch (CameraAccessException e10) {
            throw C6172g.e(e10);
        }
    }
}
