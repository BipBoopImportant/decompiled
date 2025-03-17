package z;

import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk;
import androidx.camera.camera2.internal.compat.quirk.b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: z.e  reason: case insensitive filesystem */
public class C6268e {

    /* renamed from: a  reason: collision with root package name */
    private final String f32317a;

    public C6268e(String str) {
        this.f32317a = str;
    }

    public List<Size> a(int i10) {
        ExcludedSupportedSizesQuirk excludedSupportedSizesQuirk = (ExcludedSupportedSizesQuirk) b.b(ExcludedSupportedSizesQuirk.class);
        return excludedSupportedSizesQuirk == null ? new ArrayList() : excludedSupportedSizesQuirk.f(this.f32317a, i10);
    }
}
