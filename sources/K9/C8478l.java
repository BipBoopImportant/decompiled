package k9;

/* renamed from: k9.l  reason: case insensitive filesystem */
final class C8478l extends C8488v {

    /* renamed from: a  reason: collision with root package name */
    private final long f54491a;

    C8478l(long j10) {
        this.f54491a = j10;
    }

    public long c() {
        return this.f54491a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8488v) {
            return this.f54491a == ((C8488v) obj).c();
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f54491a;
        return ((int) (j10 ^ (j10 >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f54491a + "}";
    }
}
