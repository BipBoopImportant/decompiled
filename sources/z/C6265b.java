package z;

import androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.camera2.internal.compat.quirk.b;
import androidx.camera.core.impl.R0;

/* renamed from: z.b  reason: case insensitive filesystem */
public class C6265b {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f32314a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f32315b;

    public C6265b(R0 r02) {
        this.f32314a = r02.a(ImageCaptureFailWithAutoFlashQuirk.class);
        this.f32315b = b.b(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) != null;
    }

    public int a(int i10) {
        if ((this.f32314a || this.f32315b) && i10 == 2) {
            return 1;
        }
        return i10;
    }
}
