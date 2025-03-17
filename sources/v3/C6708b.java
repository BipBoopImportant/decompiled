package V3;

import N3.C6678p;
import N3.C6679q;
import N3.I;
import N3.J;
import N3.r;
import c4.C7090a;
import h4.m;
import k4.s;
import q3.C5807s;
import q3.z;
import t3.B;
import t3.C5950a;

/* renamed from: V3.b  reason: case insensitive filesystem */
final class C6708b implements C6678p {

    /* renamed from: a  reason: collision with root package name */
    private final B f40399a = new B(6);

    /* renamed from: b  reason: collision with root package name */
    private r f40400b;

    /* renamed from: c  reason: collision with root package name */
    private int f40401c;

    /* renamed from: d  reason: collision with root package name */
    private int f40402d;

    /* renamed from: e  reason: collision with root package name */
    private int f40403e;

    /* renamed from: f  reason: collision with root package name */
    private long f40404f = -1;

    /* renamed from: g  reason: collision with root package name */
    private C7090a f40405g;

    /* renamed from: h  reason: collision with root package name */
    private C6679q f40406h;

    /* renamed from: i  reason: collision with root package name */
    private C6710d f40407i;

    /* renamed from: j  reason: collision with root package name */
    private m f40408j;

    private void c(C6679q qVar) {
        this.f40399a.S(2);
        qVar.o(this.f40399a.e(), 0, 2);
        qVar.i(this.f40399a.P() - 2);
    }

    private void e() {
        ((r) C5950a.e(this.f40400b)).r();
        this.f40400b.n(new J.b(-9223372036854775807L));
        this.f40401c = 6;
    }

    private static C7090a f(String str, long j10) {
        C6709c a10;
        if (j10 == -1 || (a10 = f.a(str)) == null) {
            return null;
        }
        return a10.a(j10);
    }

    private void g(C7090a aVar) {
        ((r) C5950a.e(this.f40400b)).t(1024, 4).e(new C5807s.b().T("image/jpeg").l0(new z(aVar)).M());
    }

    private int k(C6679q qVar) {
        this.f40399a.S(2);
        qVar.o(this.f40399a.e(), 0, 2);
        return this.f40399a.P();
    }

    private void l(C6679q qVar) {
        this.f40399a.S(2);
        qVar.readFully(this.f40399a.e(), 0, 2);
        int P10 = this.f40399a.P();
        this.f40402d = P10;
        if (P10 == 65498) {
            if (this.f40404f != -1) {
                this.f40401c = 4;
            } else {
                e();
            }
        } else if ((P10 < 65488 || P10 > 65497) && P10 != 65281) {
            this.f40401c = 1;
        }
    }

    private void m(C6679q qVar) {
        String B10;
        if (this.f40402d == 65505) {
            B b10 = new B(this.f40403e);
            qVar.readFully(b10.e(), 0, this.f40403e);
            if (this.f40405g == null && "http://ns.adobe.com/xap/1.0/".equals(b10.B()) && (B10 = b10.B()) != null) {
                C7090a f10 = f(B10, qVar.getLength());
                this.f40405g = f10;
                if (f10 != null) {
                    this.f40404f = f10.f45652d;
                }
            }
        } else {
            qVar.k(this.f40403e);
        }
        this.f40401c = 0;
    }

    private void n(C6679q qVar) {
        this.f40399a.S(2);
        qVar.readFully(this.f40399a.e(), 0, 2);
        this.f40403e = this.f40399a.P() - 2;
        this.f40401c = 2;
    }

    private void o(C6679q qVar) {
        if (!qVar.d(this.f40399a.e(), 0, 1, true)) {
            e();
            return;
        }
        qVar.f();
        if (this.f40408j == null) {
            this.f40408j = new m(s.a.f54127a, 8);
        }
        C6710d dVar = new C6710d(qVar, this.f40404f);
        this.f40407i = dVar;
        if (this.f40408j.h(dVar)) {
            this.f40408j.b(new e(this.f40404f, (r) C5950a.e(this.f40400b)));
            p();
            return;
        }
        e();
    }

    private void p() {
        g((C7090a) C5950a.e(this.f40405g));
        this.f40401c = 5;
    }

    public void a(long j10, long j11) {
        if (j10 == 0) {
            this.f40401c = 0;
            this.f40408j = null;
        } else if (this.f40401c == 5) {
            ((m) C5950a.e(this.f40408j)).a(j10, j11);
        }
    }

    public void b(r rVar) {
        this.f40400b = rVar;
    }

    public boolean h(C6679q qVar) {
        if (k(qVar) != 65496) {
            return false;
        }
        int k10 = k(qVar);
        this.f40402d = k10;
        if (k10 == 65504) {
            c(qVar);
            this.f40402d = k(qVar);
        }
        if (this.f40402d != 65505) {
            return false;
        }
        qVar.i(2);
        this.f40399a.S(6);
        qVar.o(this.f40399a.e(), 0, 6);
        return this.f40399a.J() == 1165519206 && this.f40399a.P() == 0;
    }

    public int j(C6679q qVar, I i10) {
        int i11 = this.f40401c;
        if (i11 == 0) {
            l(qVar);
            return 0;
        } else if (i11 == 1) {
            n(qVar);
            return 0;
        } else if (i11 == 2) {
            m(qVar);
            return 0;
        } else if (i11 == 4) {
            long position = qVar.getPosition();
            long j10 = this.f40404f;
            if (position != j10) {
                i10.f38760a = j10;
                return 1;
            }
            o(qVar);
            return 0;
        } else if (i11 == 5) {
            if (this.f40407i == null || qVar != this.f40406h) {
                this.f40406h = qVar;
                this.f40407i = new C6710d(qVar, this.f40404f);
            }
            int j11 = ((m) C5950a.e(this.f40408j)).j(this.f40407i, i10);
            if (j11 == 1) {
                i10.f38760a += this.f40404f;
            }
            return j11;
        } else if (i11 == 6) {
            return -1;
        } else {
            throw new IllegalStateException();
        }
    }

    public void release() {
        m mVar = this.f40408j;
        if (mVar != null) {
            mVar.release();
        }
    }
}
