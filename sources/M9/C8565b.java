package m9;

import m9.g;

/* renamed from: m9.b  reason: case insensitive filesystem */
final class C8565b extends g {

    /* renamed from: a  reason: collision with root package name */
    private final g.a f55032a;

    /* renamed from: b  reason: collision with root package name */
    private final long f55033b;

    C8565b(g.a aVar, long j10) {
        if (aVar != null) {
            this.f55032a = aVar;
            this.f55033b = j10;
            return;
        }
        throw new NullPointerException("Null status");
    }

    public long b() {
        return this.f55033b;
    }

    public g.a c() {
        return this.f55032a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f55032a.equals(gVar.c()) && this.f55033b == gVar.b();
    }

    public int hashCode() {
        long j10 = this.f55033b;
        return ((this.f55032a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f55032a + ", nextRequestWaitMillis=" + this.f55033b + "}";
    }
}
