package a9;

import XH.C16801H;

/* renamed from: a9.b1  reason: case insensitive filesystem */
public final class C6791b1 {

    /* renamed from: a  reason: collision with root package name */
    public final long f42459a;

    /* renamed from: b  reason: collision with root package name */
    public final long f42460b;

    /* renamed from: c  reason: collision with root package name */
    public final int f42461c;

    public C6791b1(long j10, long j11, int i10) {
        this.f42459a = j10;
        this.f42460b = j11;
        this.f42461c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6791b1)) {
            return false;
        }
        C6791b1 b1Var = (C6791b1) obj;
        return this.f42459a == b1Var.f42459a && this.f42460b == b1Var.f42460b && this.f42461c == b1Var.f42461c;
    }

    public final int hashCode() {
        int n10 = C16801H.n(this.f42460b);
        return Integer.hashCode(this.f42461c) + ((n10 + (C16801H.n(this.f42459a) * 31)) * 31);
    }

    public final String toString() {
        return "PerceptualHash(alphaHash=" + C16801H.v(this.f42459a) + ", grayscaleHash=" + C16801H.v(this.f42460b) + ", averageColor=" + this.f42461c + ')';
    }
}
