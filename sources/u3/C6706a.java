package U3;

import N3.C6678p;
import N3.C6679q;
import N3.I;
import N3.L;
import N3.r;
import t3.B;

/* renamed from: U3.a  reason: case insensitive filesystem */
public final class C6706a implements C6678p {

    /* renamed from: a  reason: collision with root package name */
    private final B f40163a = new B(4);

    /* renamed from: b  reason: collision with root package name */
    private final L f40164b = new L(-1, -1, "image/heif");

    private boolean c(C6679q qVar, int i10) {
        this.f40163a.S(4);
        qVar.o(this.f40163a.e(), 0, 4);
        return this.f40163a.J() == ((long) i10);
    }

    public void a(long j10, long j11) {
        this.f40164b.a(j10, j11);
    }

    public void b(r rVar) {
        this.f40164b.b(rVar);
    }

    public boolean h(C6679q qVar) {
        qVar.i(4);
        return c(qVar, 1718909296) && c(qVar, 1751476579);
    }

    public int j(C6679q qVar, I i10) {
        return this.f40164b.j(qVar, i10);
    }

    public void release() {
    }
}
