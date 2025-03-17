package v4;

import N3.C6678p;
import N3.C6679q;
import N3.I;
import N3.L;
import N3.r;
import t3.B;

/* renamed from: v4.a  reason: case insensitive filesystem */
public final class C8889a implements C6678p {

    /* renamed from: a  reason: collision with root package name */
    private final B f56900a = new B(4);

    /* renamed from: b  reason: collision with root package name */
    private final L f56901b = new L(-1, -1, "image/webp");

    public void a(long j10, long j11) {
        this.f56901b.a(j10, j11);
    }

    public void b(r rVar) {
        this.f56901b.b(rVar);
    }

    public boolean h(C6679q qVar) {
        this.f56900a.S(4);
        qVar.o(this.f56900a.e(), 0, 4);
        if (this.f56900a.J() != 1380533830) {
            return false;
        }
        qVar.i(4);
        this.f56900a.S(4);
        qVar.o(this.f56900a.e(), 0, 4);
        return this.f56900a.J() == 1464156752;
    }

    public int j(C6679q qVar, I i10) {
        return this.f56901b.j(qVar, i10);
    }

    public void release() {
    }
}
