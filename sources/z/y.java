package z;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import androidx.camera.core.impl.R0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class y {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f32345a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f32346b;

    public y(R0 r02) {
        this.f32345a = CaptureIntentPreviewQuirk.b(r02);
        this.f32346b = r02.a(ImageCaptureFailedForVideoSnapshotQuirk.class);
    }

    public Map<CaptureRequest.Key<?>, Object> a(int i10) {
        if (i10 == 3 && this.f32345a) {
            HashMap hashMap = new HashMap();
            hashMap.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 1);
            return Collections.unmodifiableMap(hashMap);
        } else if (i10 != 4 || !this.f32346b) {
            return Collections.emptyMap();
        } else {
            HashMap hashMap2 = new HashMap();
            hashMap2.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 2);
            return Collections.unmodifiableMap(hashMap2);
        }
    }
}
