package O;

import O.W;
import Q.f;
import java.util.List;

/* renamed from: O.c  reason: case insensitive filesystem */
final class C4693c extends W.b {

    /* renamed from: a  reason: collision with root package name */
    private final N f9607a;

    /* renamed from: b  reason: collision with root package name */
    private final List<f> f9608b;

    C4693c(N n10, List<f> list) {
        if (n10 != null) {
            this.f9607a = n10;
            if (list != null) {
                this.f9608b = list;
                return;
            }
            throw new NullPointerException("Null outConfigs");
        }
        throw new NullPointerException("Null surfaceEdge");
    }

    public List<f> a() {
        return this.f9608b;
    }

    public N b() {
        return this.f9607a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof W.b)) {
            return false;
        }
        W.b bVar = (W.b) obj;
        return this.f9607a.equals(bVar.b()) && this.f9608b.equals(bVar.a());
    }

    public int hashCode() {
        return ((this.f9607a.hashCode() ^ 1000003) * 1000003) ^ this.f9608b.hashCode();
    }

    public String toString() {
        return "In{surfaceEdge=" + this.f9607a + ", outConfigs=" + this.f9608b + "}";
    }
}
