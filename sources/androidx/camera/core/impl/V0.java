package androidx.camera.core.impl;

import C.K0;
import G.o;
import J.g;
import androidx.lifecycle.F;
import androidx.lifecycle.K;

public class V0 extends C5037n0 {

    /* renamed from: b  reason: collision with root package name */
    private final I f16798b;

    /* renamed from: c  reason: collision with root package name */
    private final Z0 f16799c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f16800d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f16801e = false;

    /* renamed from: f  reason: collision with root package name */
    private final B f16802f;

    public V0(I i10, B b10) {
        super(i10);
        this.f16798b = i10;
        this.f16802f = b10;
        this.f16799c = b10.W((Z0) null);
        t(b10.M());
        s(b10.R());
    }

    public I a() {
        return this.f16798b;
    }

    public F<Integer> l() {
        return !o.b(this.f16799c, 6) ? new K(0) : this.f16798b.l();
    }

    public F<K0> q() {
        return !o.b(this.f16799c, 0) ? new K(g.e(1.0f, 1.0f, 1.0f, 0.0f)) : this.f16798b.q();
    }

    public B r() {
        return this.f16802f;
    }

    public void s(boolean z10) {
        this.f16801e = z10;
    }

    public void t(boolean z10) {
        this.f16800d = z10;
    }
}
