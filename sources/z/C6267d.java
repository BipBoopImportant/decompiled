package z;

import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;
import androidx.camera.camera2.internal.compat.quirk.b;

/* renamed from: z.d  reason: case insensitive filesystem */
public class C6267d {

    /* renamed from: a  reason: collision with root package name */
    private final SmallDisplaySizeQuirk f32316a = ((SmallDisplaySizeQuirk) b.b(SmallDisplaySizeQuirk.class));

    public Size a() {
        SmallDisplaySizeQuirk smallDisplaySizeQuirk = this.f32316a;
        if (smallDisplaySizeQuirk != null) {
            return smallDisplaySizeQuirk.f();
        }
        return null;
    }
}
