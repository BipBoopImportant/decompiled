package androidx.camera.core.impl;

import android.util.Size;
import android.view.Surface;

public abstract class K0 {
    public static K0 a(Surface surface, Size size, int i10) {
        return new C5026i(surface, size, i10);
    }

    public abstract int b();

    public abstract Size c();

    public abstract Surface d();
}
