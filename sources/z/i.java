package z;

import C.C4391e0;
import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk;
import androidx.camera.core.impl.C5019e0;
import androidx.camera.core.impl.R0;
import java.util.List;

public class i {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f32320a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f32321b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f32322c;

    public i(R0 r02, R0 r03) {
        this.f32320a = r03.a(TextureViewIsClosedQuirk.class);
        this.f32321b = r02.a(PreviewOrientationIncorrectQuirk.class);
        this.f32322c = r02.a(ConfigureSurfaceToSecondarySessionFailQuirk.class);
    }

    public void a(List<C5019e0> list) {
        if (b() && list != null) {
            for (C5019e0 d10 : list) {
                d10.d();
            }
            C4391e0.a("ForceCloseDeferrableSurface", "deferrableSurface closed");
        }
    }

    public boolean b() {
        return this.f32320a || this.f32321b || this.f32322c;
    }
}
