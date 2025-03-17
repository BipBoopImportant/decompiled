package N3;

import N3.O;
import q3.C5807s;
import t3.B;
import t3.C5950a;

public final class L implements C6678p {

    /* renamed from: a  reason: collision with root package name */
    private final int f38768a;

    /* renamed from: b  reason: collision with root package name */
    private final int f38769b;

    /* renamed from: c  reason: collision with root package name */
    private final String f38770c;

    /* renamed from: d  reason: collision with root package name */
    private int f38771d;

    /* renamed from: e  reason: collision with root package name */
    private int f38772e;

    /* renamed from: f  reason: collision with root package name */
    private r f38773f;

    /* renamed from: g  reason: collision with root package name */
    private O f38774g;

    public L(int i10, int i11, String str) {
        this.f38768a = i10;
        this.f38769b = i11;
        this.f38770c = str;
    }

    private void c(String str) {
        O t10 = this.f38773f.t(1024, 4);
        this.f38774g = t10;
        t10.e(new C5807s.b().s0(str).M());
        this.f38773f.r();
        this.f38773f.n(new M(-9223372036854775807L));
        this.f38772e = 1;
    }

    private void e(C6679q qVar) {
        int d10 = ((O) C5950a.e(this.f38774g)).d(qVar, 1024, true);
        if (d10 == -1) {
            this.f38772e = 2;
            this.f38774g.c(0, 1, this.f38771d, 0, (O.a) null);
            this.f38771d = 0;
            return;
        }
        this.f38771d += d10;
    }

    public void a(long j10, long j11) {
        if (j10 == 0 || this.f38772e == 1) {
            this.f38772e = 1;
            this.f38771d = 0;
        }
    }

    public void b(r rVar) {
        this.f38773f = rVar;
        c(this.f38770c);
    }

    public boolean h(C6679q qVar) {
        C5950a.g((this.f38768a == -1 || this.f38769b == -1) ? false : true);
        B b10 = new B(this.f38769b);
        qVar.o(b10.e(), 0, this.f38769b);
        return b10.P() == this.f38768a;
    }

    public int j(C6679q qVar, I i10) {
        int i11 = this.f38772e;
        if (i11 == 1) {
            e(qVar);
            return 0;
        } else if (i11 == 2) {
            return -1;
        } else {
            throw new IllegalStateException();
        }
    }

    public void release() {
    }
}
