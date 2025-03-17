package t4;

import N3.C6679q;
import t3.B;
import t3.H;
import t3.N;

final class I {

    /* renamed from: a  reason: collision with root package name */
    private final int f56194a;

    /* renamed from: b  reason: collision with root package name */
    private final H f56195b = new H(0);

    /* renamed from: c  reason: collision with root package name */
    private final B f56196c = new B();

    /* renamed from: d  reason: collision with root package name */
    private boolean f56197d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f56198e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f56199f;

    /* renamed from: g  reason: collision with root package name */
    private long f56200g = -9223372036854775807L;

    /* renamed from: h  reason: collision with root package name */
    private long f56201h = -9223372036854775807L;

    /* renamed from: i  reason: collision with root package name */
    private long f56202i = -9223372036854775807L;

    I(int i10) {
        this.f56194a = i10;
    }

    private int a(C6679q qVar) {
        this.f56196c.T(N.f29467f);
        this.f56197d = true;
        qVar.f();
        return 0;
    }

    private int f(C6679q qVar, N3.I i10, int i11) {
        int min = (int) Math.min((long) this.f56194a, qVar.getLength());
        long j10 = (long) 0;
        if (qVar.getPosition() != j10) {
            i10.f38760a = j10;
            return 1;
        }
        this.f56196c.S(min);
        qVar.f();
        qVar.o(this.f56196c.e(), 0, min);
        this.f56200g = g(this.f56196c, i11);
        this.f56198e = true;
        return 0;
    }

    private long g(B b10, int i10) {
        int g10 = b10.g();
        for (int f10 = b10.f(); f10 < g10; f10++) {
            if (b10.e()[f10] == 71) {
                long c10 = M.c(b10, f10, i10);
                if (c10 != -9223372036854775807L) {
                    return c10;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int h(C6679q qVar, N3.I i10, int i11) {
        long length = qVar.getLength();
        int min = (int) Math.min((long) this.f56194a, length);
        long j10 = length - ((long) min);
        if (qVar.getPosition() != j10) {
            i10.f38760a = j10;
            return 1;
        }
        this.f56196c.S(min);
        qVar.f();
        qVar.o(this.f56196c.e(), 0, min);
        this.f56201h = i(this.f56196c, i11);
        this.f56199f = true;
        return 0;
    }

    private long i(B b10, int i10) {
        int f10 = b10.f();
        int g10 = b10.g();
        for (int i11 = g10 - 188; i11 >= f10; i11--) {
            if (M.b(b10.e(), f10, g10, i11)) {
                long c10 = M.c(b10, i11, i10);
                if (c10 != -9223372036854775807L) {
                    return c10;
                }
            }
        }
        return -9223372036854775807L;
    }

    public long b() {
        return this.f56202i;
    }

    public H c() {
        return this.f56195b;
    }

    public boolean d() {
        return this.f56197d;
    }

    public int e(C6679q qVar, N3.I i10, int i11) {
        if (i11 <= 0) {
            return a(qVar);
        }
        if (!this.f56199f) {
            return h(qVar, i10, i11);
        }
        if (this.f56201h == -9223372036854775807L) {
            return a(qVar);
        }
        if (!this.f56198e) {
            return f(qVar, i10, i11);
        }
        long j10 = this.f56200g;
        if (j10 == -9223372036854775807L) {
            return a(qVar);
        }
        this.f56202i = this.f56195b.c(this.f56201h) - this.f56195b.b(j10);
        return a(qVar);
    }
}
