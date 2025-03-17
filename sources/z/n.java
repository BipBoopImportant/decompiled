package z;

import androidx.camera.camera2.internal.compat.quirk.AutoFlashUnderExposedQuirk;
import androidx.camera.core.impl.R0;

public class n {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f32328a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f32329b = false;

    public n(R0 r02) {
        boolean z10 = false;
        this.f32328a = r02.b(AutoFlashUnderExposedQuirk.class) != null ? true : z10;
    }

    public void a() {
        this.f32329b = false;
    }

    public void b() {
        this.f32329b = true;
    }

    public boolean c(int i10) {
        return this.f32329b && i10 == 0 && this.f32328a;
    }
}
