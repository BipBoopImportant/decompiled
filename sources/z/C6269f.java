package z;

import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.camera.camera2.internal.compat.quirk.b;
import androidx.camera.core.impl.d1;
import java.util.ArrayList;
import java.util.List;

/* renamed from: z.f  reason: case insensitive filesystem */
public class C6269f {

    /* renamed from: a  reason: collision with root package name */
    private final ExtraSupportedSurfaceCombinationsQuirk f32318a = ((ExtraSupportedSurfaceCombinationsQuirk) b.b(ExtraSupportedSurfaceCombinationsQuirk.class));

    public List<d1> a(String str) {
        ExtraSupportedSurfaceCombinationsQuirk extraSupportedSurfaceCombinationsQuirk = this.f32318a;
        return extraSupportedSurfaceCombinationsQuirk == null ? new ArrayList() : extraSupportedSurfaceCombinationsQuirk.h(str);
    }
}
