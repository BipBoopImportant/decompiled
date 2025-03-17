package k9;

import java.util.List;

/* renamed from: k9.d  reason: case insensitive filesystem */
final class C8470d extends C8480n {

    /* renamed from: a  reason: collision with root package name */
    private final List<C8487u> f54442a;

    C8470d(List<C8487u> list) {
        if (list != null) {
            this.f54442a = list;
            return;
        }
        throw new NullPointerException("Null logRequests");
    }

    public List<C8487u> c() {
        return this.f54442a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8480n) {
            return this.f54442a.equals(((C8480n) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.f54442a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f54442a + "}";
    }
}
