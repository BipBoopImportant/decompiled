package V3;

import N3.C6678p;
import N3.C6679q;
import N3.I;
import N3.L;
import N3.r;

/* renamed from: V3.a  reason: case insensitive filesystem */
public final class C6707a implements C6678p {

    /* renamed from: a  reason: collision with root package name */
    private final C6678p f40398a;

    public C6707a(int i10) {
        if ((i10 & 1) != 0) {
            this.f40398a = new L(65496, 2, "image/jpeg");
        } else {
            this.f40398a = new C6708b();
        }
    }

    public void a(long j10, long j11) {
        this.f40398a.a(j10, j11);
    }

    public void b(r rVar) {
        this.f40398a.b(rVar);
    }

    public boolean h(C6679q qVar) {
        return this.f40398a.h(qVar);
    }

    public int j(C6679q qVar, I i10) {
        return this.f40398a.j(qVar, i10);
    }

    public void release() {
        this.f40398a.release();
    }
}
