package g4;

import N3.C6659E;
import N3.J;
import java.math.RoundingMode;
import t3.N;

/* renamed from: g4.b  reason: case insensitive filesystem */
final class C7866b implements C7871g {

    /* renamed from: a  reason: collision with root package name */
    private final long f51221a;

    /* renamed from: b  reason: collision with root package name */
    private final int f51222b;

    /* renamed from: c  reason: collision with root package name */
    private final C6659E f51223c;

    public C7866b(long j10, long j11, long j12) {
        long j13 = j12;
        this.f51223c = new C6659E(new long[]{j11}, new long[]{0}, j10);
        this.f51221a = j13;
        int i10 = -2147483647;
        if (j10 != -9223372036854775807L) {
            long b12 = N.b1(j11 - j13, 8, j10, RoundingMode.HALF_UP);
            if (b12 > 0 && b12 <= 2147483647L) {
                i10 = (int) b12;
            }
            this.f51222b = i10;
            return;
        }
        this.f51222b = -2147483647;
    }

    public boolean a(long j10) {
        return this.f51223c.b(j10, 100000);
    }

    public void b(long j10, long j11) {
        if (!a(j10)) {
            this.f51223c.a(j10, j11);
        }
    }

    public J.a c(long j10) {
        return this.f51223c.c(j10);
    }

    /* access modifiers changed from: package-private */
    public void d(long j10) {
        this.f51223c.d(j10);
    }

    public long e() {
        return this.f51221a;
    }

    public boolean f() {
        return this.f51223c.f();
    }

    public long g(long j10) {
        return this.f51223c.g(j10);
    }

    public int k() {
        return this.f51222b;
    }

    public long l() {
        return this.f51223c.l();
    }
}
