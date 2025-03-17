package N3;

import N3.J;

/* renamed from: N3.h  reason: case insensitive filesystem */
public class C6670h implements J {

    /* renamed from: a  reason: collision with root package name */
    private final long f38880a;

    /* renamed from: b  reason: collision with root package name */
    private final long f38881b;

    /* renamed from: c  reason: collision with root package name */
    private final int f38882c;

    /* renamed from: d  reason: collision with root package name */
    private final long f38883d;

    /* renamed from: e  reason: collision with root package name */
    private final int f38884e;

    /* renamed from: f  reason: collision with root package name */
    private final long f38885f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f38886g;

    public C6670h(long j10, long j11, int i10, int i11, boolean z10) {
        this.f38880a = j10;
        this.f38881b = j11;
        this.f38882c = i11 == -1 ? 1 : i11;
        this.f38884e = i10;
        this.f38886g = z10;
        if (j10 == -1) {
            this.f38883d = -1;
            this.f38885f = -9223372036854775807L;
            return;
        }
        this.f38883d = j10 - j11;
        this.f38885f = d(j10, j11, i10);
    }

    private long a(long j10) {
        int i10 = this.f38882c;
        long j11 = (((j10 * ((long) this.f38884e)) / 8000000) / ((long) i10)) * ((long) i10);
        long j12 = this.f38883d;
        if (j12 != -1) {
            j11 = Math.min(j11, j12 - ((long) i10));
        }
        return this.f38881b + Math.max(j11, 0);
    }

    private static long d(long j10, long j11, int i10) {
        return (Math.max(0, j10 - j11) * 8000000) / ((long) i10);
    }

    public long b(long j10) {
        return d(j10, this.f38881b, this.f38884e);
    }

    public J.a c(long j10) {
        if (this.f38883d == -1 && !this.f38886g) {
            return new J.a(new K(0, this.f38881b));
        }
        long a10 = a(j10);
        long b10 = b(a10);
        K k10 = new K(b10, a10);
        if (this.f38883d != -1 && b10 < j10) {
            int i10 = this.f38882c;
            if (((long) i10) + a10 < this.f38880a) {
                long j11 = a10 + ((long) i10);
                return new J.a(k10, new K(b(j11), j11));
            }
        }
        return new J.a(k10);
    }

    public boolean f() {
        return this.f38883d != -1 || this.f38886g;
    }

    public long l() {
        return this.f38885f;
    }
}
