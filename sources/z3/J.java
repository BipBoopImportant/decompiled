package z3;

import t3.C5950a;
import t3.N;

public final class J {

    /* renamed from: c  reason: collision with root package name */
    public static final J f32391c;

    /* renamed from: d  reason: collision with root package name */
    public static final J f32392d = new J(Long.MAX_VALUE, Long.MAX_VALUE);

    /* renamed from: e  reason: collision with root package name */
    public static final J f32393e = new J(Long.MAX_VALUE, 0);

    /* renamed from: f  reason: collision with root package name */
    public static final J f32394f = new J(0, Long.MAX_VALUE);

    /* renamed from: g  reason: collision with root package name */
    public static final J f32395g;

    /* renamed from: a  reason: collision with root package name */
    public final long f32396a;

    /* renamed from: b  reason: collision with root package name */
    public final long f32397b;

    static {
        J j10 = new J(0, 0);
        f32391c = j10;
        f32395g = j10;
    }

    public J(long j10, long j11) {
        boolean z10 = false;
        C5950a.a(j10 >= 0);
        C5950a.a(j11 >= 0 ? true : z10);
        this.f32396a = j10;
        this.f32397b = j11;
    }

    public long a(long j10, long j11, long j12) {
        long j13 = this.f32396a;
        if (j13 == 0 && this.f32397b == 0) {
            return j10;
        }
        long k12 = N.k1(j10, j13, Long.MIN_VALUE);
        long c10 = N.c(j10, this.f32397b, Long.MAX_VALUE);
        boolean z10 = false;
        boolean z11 = k12 <= j11 && j11 <= c10;
        if (k12 <= j12 && j12 <= c10) {
            z10 = true;
        }
        return (!z11 || !z10) ? z11 ? j11 : z10 ? j12 : k12 : Math.abs(j11 - j10) <= Math.abs(j12 - j10) ? j11 : j12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || J.class != obj.getClass()) {
            return false;
        }
        J j10 = (J) obj;
        return this.f32396a == j10.f32396a && this.f32397b == j10.f32397b;
    }

    public int hashCode() {
        return (((int) this.f32396a) * 31) + ((int) this.f32397b);
    }
}
