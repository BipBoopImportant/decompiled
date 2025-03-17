package t4;

import N3.C6679q;
import N3.I;
import t3.B;
import t3.H;
import t3.N;

/* renamed from: t4.A  reason: case insensitive filesystem */
final class C8773A {

    /* renamed from: a  reason: collision with root package name */
    private final H f56152a = new H(0);

    /* renamed from: b  reason: collision with root package name */
    private final B f56153b = new B();

    /* renamed from: c  reason: collision with root package name */
    private boolean f56154c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f56155d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f56156e;

    /* renamed from: f  reason: collision with root package name */
    private long f56157f = -9223372036854775807L;

    /* renamed from: g  reason: collision with root package name */
    private long f56158g = -9223372036854775807L;

    /* renamed from: h  reason: collision with root package name */
    private long f56159h = -9223372036854775807L;

    C8773A() {
    }

    private static boolean a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    private int b(C6679q qVar) {
        this.f56153b.T(N.f29467f);
        this.f56154c = true;
        qVar.f();
        return 0;
    }

    private int f(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    private int h(C6679q qVar, I i10) {
        int min = (int) Math.min(20000, qVar.getLength());
        long j10 = (long) 0;
        if (qVar.getPosition() != j10) {
            i10.f38760a = j10;
            return 1;
        }
        this.f56153b.S(min);
        qVar.f();
        qVar.o(this.f56153b.e(), 0, min);
        this.f56157f = i(this.f56153b);
        this.f56155d = true;
        return 0;
    }

    private long i(B b10) {
        int g10 = b10.g();
        for (int f10 = b10.f(); f10 < g10 - 3; f10++) {
            if (f(b10.e(), f10) == 442) {
                b10.W(f10 + 4);
                long l10 = l(b10);
                if (l10 != -9223372036854775807L) {
                    return l10;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int j(C6679q qVar, I i10) {
        long length = qVar.getLength();
        int min = (int) Math.min(20000, length);
        long j10 = length - ((long) min);
        if (qVar.getPosition() != j10) {
            i10.f38760a = j10;
            return 1;
        }
        this.f56153b.S(min);
        qVar.f();
        qVar.o(this.f56153b.e(), 0, min);
        this.f56158g = k(this.f56153b);
        this.f56156e = true;
        return 0;
    }

    private long k(B b10) {
        int f10 = b10.f();
        for (int g10 = b10.g() - 4; g10 >= f10; g10--) {
            if (f(b10.e(), g10) == 442) {
                b10.W(g10 + 4);
                long l10 = l(b10);
                if (l10 != -9223372036854775807L) {
                    return l10;
                }
            }
        }
        return -9223372036854775807L;
    }

    public static long l(B b10) {
        int f10 = b10.f();
        if (b10.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        b10.l(bArr, 0, 9);
        b10.W(f10);
        if (!a(bArr)) {
            return -9223372036854775807L;
        }
        return m(bArr);
    }

    private static long m(byte[] bArr) {
        byte b10 = bArr[0];
        byte b11 = bArr[2];
        return (((((long) b10) & 56) >> 3) << 30) | ((((long) b10) & 3) << 28) | ((((long) bArr[1]) & 255) << 20) | (((((long) b11) & 248) >> 3) << 15) | ((((long) b11) & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }

    public long c() {
        return this.f56159h;
    }

    public H d() {
        return this.f56152a;
    }

    public boolean e() {
        return this.f56154c;
    }

    public int g(C6679q qVar, I i10) {
        if (!this.f56156e) {
            return j(qVar, i10);
        }
        if (this.f56158g == -9223372036854775807L) {
            return b(qVar);
        }
        if (!this.f56155d) {
            return h(qVar, i10);
        }
        long j10 = this.f56157f;
        if (j10 == -9223372036854775807L) {
            return b(qVar);
        }
        this.f56159h = this.f56152a.c(this.f56158g) - this.f56152a.b(j10);
        return b(qVar);
    }
}
