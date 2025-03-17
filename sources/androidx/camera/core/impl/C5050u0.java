package androidx.camera.core.impl;

import I.n;
import android.util.Size;
import android.view.Surface;
import ob.C10101e;

/* renamed from: androidx.camera.core.impl.u0  reason: case insensitive filesystem */
public final class C5050u0 extends C5019e0 {

    /* renamed from: o  reason: collision with root package name */
    private final Surface f17020o;

    public C5050u0(Surface surface, Size size, int i10) {
        super(size, i10);
        this.f17020o = surface;
    }

    public C10101e<Surface> r() {
        return n.p(this.f17020o);
    }

    public C5050u0(Surface surface) {
        this.f17020o = surface;
    }
}
