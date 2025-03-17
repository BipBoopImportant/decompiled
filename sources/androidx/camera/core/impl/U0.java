package androidx.camera.core.impl;

import C.B;
import C.C;
import G.o;
import I.n;
import ob.C10101e;

public class U0 extends C5035m0 {

    /* renamed from: c  reason: collision with root package name */
    private final F f16777c;

    /* renamed from: d  reason: collision with root package name */
    private final Z0 f16778d;

    public U0(F f10, Z0 z02) {
        super(f10);
        this.f16777c = f10;
        this.f16778d = z02;
    }

    public F a() {
        return this.f16777c;
    }

    public C10101e<Void> d(float f10) {
        return !o.b(this.f16778d, 0) ? n.n(new IllegalStateException("Zoom is not supported")) : this.f16777c.d(f10);
    }

    public C10101e<Void> f(float f10) {
        return !o.b(this.f16778d, 0) ? n.n(new IllegalStateException("Zoom is not supported")) : this.f16777c.f(f10);
    }

    public C10101e<Void> i(boolean z10) {
        return !o.b(this.f16778d, 6) ? n.n(new IllegalStateException("Torch is not supported")) : this.f16777c.i(z10);
    }

    public C10101e<C> k(B b10) {
        B a10 = o.a(this.f16778d, b10);
        return a10 == null ? n.n(new IllegalStateException("FocusMetering is not supported")) : this.f16777c.k(a10);
    }
}
