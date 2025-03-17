package androidx.media3.exoplayer;

import G3.C6479C;
import t3.C5950a;
import t3.N;

/* renamed from: androidx.media3.exoplayer.a0  reason: case insensitive filesystem */
final class C5224a0 {

    /* renamed from: a  reason: collision with root package name */
    public final C6479C.b f22647a;

    /* renamed from: b  reason: collision with root package name */
    public final long f22648b;

    /* renamed from: c  reason: collision with root package name */
    public final long f22649c;

    /* renamed from: d  reason: collision with root package name */
    public final long f22650d;

    /* renamed from: e  reason: collision with root package name */
    public final long f22651e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f22652f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f22653g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f22654h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f22655i;

    C5224a0(C6479C.b bVar, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = z10;
        boolean z15 = z11;
        boolean z16 = z12;
        boolean z17 = z13;
        boolean z18 = true;
        C5950a.a(!z17 || z15);
        C5950a.a(!z16 || z15);
        if (z14 && (z15 || z16 || z17)) {
            z18 = false;
        }
        C5950a.a(z18);
        this.f22647a = bVar;
        this.f22648b = j10;
        this.f22649c = j11;
        this.f22650d = j12;
        this.f22651e = j13;
        this.f22652f = z14;
        this.f22653g = z15;
        this.f22654h = z16;
        this.f22655i = z17;
    }

    public C5224a0 a(long j10) {
        if (j10 == this.f22649c) {
            return this;
        }
        return new C5224a0(this.f22647a, this.f22648b, j10, this.f22650d, this.f22651e, this.f22652f, this.f22653g, this.f22654h, this.f22655i);
    }

    public C5224a0 b(long j10) {
        if (j10 == this.f22648b) {
            return this;
        }
        return new C5224a0(this.f22647a, j10, this.f22649c, this.f22650d, this.f22651e, this.f22652f, this.f22653g, this.f22654h, this.f22655i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5224a0.class != obj.getClass()) {
            return false;
        }
        C5224a0 a0Var = (C5224a0) obj;
        return this.f22648b == a0Var.f22648b && this.f22649c == a0Var.f22649c && this.f22650d == a0Var.f22650d && this.f22651e == a0Var.f22651e && this.f22652f == a0Var.f22652f && this.f22653g == a0Var.f22653g && this.f22654h == a0Var.f22654h && this.f22655i == a0Var.f22655i && N.d(this.f22647a, a0Var.f22647a);
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f22647a.hashCode()) * 31) + ((int) this.f22648b)) * 31) + ((int) this.f22649c)) * 31) + ((int) this.f22650d)) * 31) + ((int) this.f22651e)) * 31) + (this.f22652f ? 1 : 0)) * 31) + (this.f22653g ? 1 : 0)) * 31) + (this.f22654h ? 1 : 0)) * 31) + (this.f22655i ? 1 : 0);
    }
}
