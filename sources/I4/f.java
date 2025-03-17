package i4;

import N3.C6679q;
import N3.C6680s;
import t3.B;
import t3.C5950a;

final class f {

    /* renamed from: a  reason: collision with root package name */
    public int f53101a;

    /* renamed from: b  reason: collision with root package name */
    public int f53102b;

    /* renamed from: c  reason: collision with root package name */
    public long f53103c;

    /* renamed from: d  reason: collision with root package name */
    public long f53104d;

    /* renamed from: e  reason: collision with root package name */
    public long f53105e;

    /* renamed from: f  reason: collision with root package name */
    public long f53106f;

    /* renamed from: g  reason: collision with root package name */
    public int f53107g;

    /* renamed from: h  reason: collision with root package name */
    public int f53108h;

    /* renamed from: i  reason: collision with root package name */
    public int f53109i;

    /* renamed from: j  reason: collision with root package name */
    public final int[] f53110j = new int[255];

    /* renamed from: k  reason: collision with root package name */
    private final B f53111k = new B(255);

    f() {
    }

    public boolean a(C6679q qVar, boolean z10) {
        b();
        this.f53111k.S(27);
        if (!C6680s.b(qVar, this.f53111k.e(), 0, 27, z10) || this.f53111k.J() != 1332176723) {
            return false;
        }
        int H10 = this.f53111k.H();
        this.f53101a = H10;
        if (H10 == 0) {
            this.f53102b = this.f53111k.H();
            this.f53103c = this.f53111k.v();
            this.f53104d = this.f53111k.x();
            this.f53105e = this.f53111k.x();
            this.f53106f = this.f53111k.x();
            int H11 = this.f53111k.H();
            this.f53107g = H11;
            this.f53108h = H11 + 27;
            this.f53111k.S(H11);
            if (!C6680s.b(qVar, this.f53111k.e(), 0, this.f53107g, z10)) {
                return false;
            }
            for (int i10 = 0; i10 < this.f53107g; i10++) {
                this.f53110j[i10] = this.f53111k.H();
                this.f53109i += this.f53110j[i10];
            }
            return true;
        } else if (z10) {
            return false;
        } else {
            throw q3.B.c("unsupported bit stream revision");
        }
    }

    public void b() {
        this.f53101a = 0;
        this.f53102b = 0;
        this.f53103c = 0;
        this.f53104d = 0;
        this.f53105e = 0;
        this.f53106f = 0;
        this.f53107g = 0;
        this.f53108h = 0;
        this.f53109i = 0;
    }

    public boolean c(C6679q qVar) {
        return d(qVar, -1);
    }

    public boolean d(C6679q qVar, long j10) {
        int i10;
        C5950a.a(qVar.getPosition() == qVar.h());
        this.f53111k.S(4);
        while (true) {
            i10 = (j10 > -1 ? 1 : (j10 == -1 ? 0 : -1));
            if ((i10 == 0 || qVar.getPosition() + 4 < j10) && C6680s.b(qVar, this.f53111k.e(), 0, 4, true)) {
                this.f53111k.W(0);
                if (this.f53111k.J() == 1332176723) {
                    qVar.f();
                    return true;
                }
                qVar.k(1);
            }
        }
        do {
            if ((i10 != 0 && qVar.getPosition() >= j10) || qVar.a(1) == -1) {
                return false;
            }
            break;
        } while (qVar.a(1) == -1);
        return false;
    }
}
