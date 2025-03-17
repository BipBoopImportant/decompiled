package M;

import androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final CaptureFailedRetryQuirk f9063a = ((CaptureFailedRetryQuirk) androidx.camera.core.internal.compat.quirk.a.b(CaptureFailedRetryQuirk.class));

    public int a() {
        CaptureFailedRetryQuirk captureFailedRetryQuirk = this.f9063a;
        if (captureFailedRetryQuirk == null) {
            return 0;
        }
        return captureFailedRetryQuirk.f();
    }
}
