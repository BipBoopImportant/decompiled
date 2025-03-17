package androidx.camera.core.impl;

import C.C4417z;
import H2.i;
import androidx.camera.core.impl.X;

/* renamed from: androidx.camera.core.impl.r0  reason: case insensitive filesystem */
public interface C5044r0 extends S0 {

    /* renamed from: l  reason: collision with root package name */
    public static final X.a<Integer> f17008l = X.a.a("camerax.core.imageInput.inputFormat", Integer.TYPE);

    /* renamed from: m  reason: collision with root package name */
    public static final X.a<C4417z> f17009m = X.a.a("camerax.core.imageInput.inputDynamicRange", C4417z.class);

    C4417z G() {
        return (C4417z) i.g((C4417z) g(f17009m, C4417z.f5464c));
    }

    boolean I() {
        return b(f17009m);
    }

    int m() {
        return ((Integer) a(f17008l)).intValue();
    }
}
