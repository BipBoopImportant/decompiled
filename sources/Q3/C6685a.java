package Q3;

import N3.C6678p;
import N3.C6679q;
import N3.I;
import N3.L;
import N3.r;
import t3.B;

/* renamed from: Q3.a  reason: case insensitive filesystem */
public final class C6685a implements C6678p {

    /* renamed from: a  reason: collision with root package name */
    private final B f39561a = new B(4);

    /* renamed from: b  reason: collision with root package name */
    private final L f39562b = new L(-1, -1, "image/avif");

    private boolean c(C6679q qVar, int i10) {
        this.f39561a.S(4);
        qVar.o(this.f39561a.e(), 0, 4);
        return this.f39561a.J() == ((long) i10);
    }

    public void a(long j10, long j11) {
        this.f39562b.a(j10, j11);
    }

    public void b(r rVar) {
        this.f39562b.b(rVar);
    }

    public boolean h(C6679q qVar) {
        qVar.i(4);
        return c(qVar, 1718909296) && c(qVar, 1635150182);
    }

    public int j(C6679q qVar, I i10) {
        return this.f39562b.j(qVar, i10);
    }

    public void release() {
    }
}
