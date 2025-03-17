package N3;

import N3.J;
import t3.C5950a;
import t3.N;
import t3.r;

/* renamed from: N3.E  reason: case insensitive filesystem */
public final class C6659E implements J {

    /* renamed from: a  reason: collision with root package name */
    private final r f38743a;

    /* renamed from: b  reason: collision with root package name */
    private final r f38744b;

    /* renamed from: c  reason: collision with root package name */
    private long f38745c;

    public C6659E(long[] jArr, long[] jArr2, long j10) {
        C5950a.a(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.f38743a = new r(length);
            this.f38744b = new r(length);
        } else {
            int i10 = length + 1;
            r rVar = new r(i10);
            this.f38743a = rVar;
            r rVar2 = new r(i10);
            this.f38744b = rVar2;
            rVar.a(0);
            rVar2.a(0);
        }
        this.f38743a.b(jArr);
        this.f38744b.b(jArr2);
        this.f38745c = j10;
    }

    public void a(long j10, long j11) {
        if (this.f38744b.d() == 0 && j10 > 0) {
            this.f38743a.a(0);
            this.f38744b.a(0);
        }
        this.f38743a.a(j11);
        this.f38744b.a(j10);
    }

    public boolean b(long j10, long j11) {
        if (this.f38744b.d() == 0) {
            return false;
        }
        r rVar = this.f38744b;
        return j10 - rVar.c(rVar.d() - 1) < j11;
    }

    public J.a c(long j10) {
        if (this.f38744b.d() == 0) {
            return new J.a(K.f38765c);
        }
        int f10 = N.f(this.f38744b, j10, true, true);
        K k10 = new K(this.f38744b.c(f10), this.f38743a.c(f10));
        if (k10.f38766a == j10 || f10 == this.f38744b.d() - 1) {
            return new J.a(k10);
        }
        int i10 = f10 + 1;
        return new J.a(k10, new K(this.f38744b.c(i10), this.f38743a.c(i10)));
    }

    public void d(long j10) {
        this.f38745c = j10;
    }

    public boolean f() {
        return this.f38744b.d() > 0;
    }

    public long g(long j10) {
        if (this.f38744b.d() == 0) {
            return -9223372036854775807L;
        }
        return this.f38744b.c(N.f(this.f38743a, j10, true, true));
    }

    public long l() {
        return this.f38745c;
    }
}
