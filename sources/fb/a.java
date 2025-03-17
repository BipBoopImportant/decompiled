package Fb;

final class a extends o {

    /* renamed from: a  reason: collision with root package name */
    private final long f60394a;

    /* renamed from: b  reason: collision with root package name */
    private final long f60395b;

    /* renamed from: c  reason: collision with root package name */
    private final long f60396c;

    a(long j10, long j11, long j12) {
        this.f60394a = j10;
        this.f60395b = j11;
        this.f60396c = j12;
    }

    public long b() {
        return this.f60395b;
    }

    public long c() {
        return this.f60394a;
    }

    public long d() {
        return this.f60396c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f60394a == oVar.c() && this.f60395b == oVar.b() && this.f60396c == oVar.d();
    }

    public int hashCode() {
        long j10 = this.f60394a;
        long j11 = this.f60395b;
        long j12 = this.f60396c;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12));
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f60394a + ", elapsedRealtime=" + this.f60395b + ", uptimeMillis=" + this.f60396c + "}";
    }
}
