package V3;

import N3.C6655A;
import N3.J;
import N3.K;
import N3.O;
import N3.r;

public final class e implements r {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final long f40416a;

    /* renamed from: b  reason: collision with root package name */
    private final r f40417b;

    class a extends C6655A {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ J f40418b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(J j10, J j11) {
            super(j10);
            this.f40418b = j11;
        }

        public J.a c(long j10) {
            J.a c10 = this.f40418b.c(j10);
            K k10 = c10.f38761a;
            K k11 = new K(k10.f38766a, k10.f38767b + e.this.f40416a);
            K k12 = c10.f38762b;
            return new J.a(k11, new K(k12.f38766a, k12.f38767b + e.this.f40416a));
        }
    }

    public e(long j10, r rVar) {
        this.f40416a = j10;
        this.f40417b = rVar;
    }

    public void n(J j10) {
        this.f40417b.n(new a(j10, j10));
    }

    public void r() {
        this.f40417b.r();
    }

    public O t(int i10, int i11) {
        return this.f40417b.t(i10, i11);
    }
}
