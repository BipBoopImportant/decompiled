package androidx.camera.core.impl;

import C.s0;
import H2.i;

public final class i1 implements s0 {

    /* renamed from: d  reason: collision with root package name */
    private final long f16920d;

    /* renamed from: e  reason: collision with root package name */
    private final s0 f16921e;

    public i1(long j10, s0 s0Var) {
        i.b(j10 >= 0, "Timeout must be non-negative.");
        this.f16920d = j10;
        this.f16921e = s0Var;
    }

    public long a() {
        return this.f16920d;
    }

    public s0.c c(s0.b bVar) {
        s0.c c10 = this.f16921e.c(bVar);
        return (a() <= 0 || bVar.k() < a() - c10.b()) ? c10 : s0.c.f5407d;
    }
}
