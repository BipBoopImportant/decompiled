package P;

import O.N;
import P.r;
import java.util.List;

final class b extends r.b {

    /* renamed from: a  reason: collision with root package name */
    private final N f11767a;

    /* renamed from: b  reason: collision with root package name */
    private final N f11768b;

    /* renamed from: c  reason: collision with root package name */
    private final List<d> f11769c;

    b(N n10, N n11, List<d> list) {
        if (n10 != null) {
            this.f11767a = n10;
            if (n11 != null) {
                this.f11768b = n11;
                if (list != null) {
                    this.f11769c = list;
                    return;
                }
                throw new NullPointerException("Null outConfigs");
            }
            throw new NullPointerException("Null secondarySurfaceEdge");
        }
        throw new NullPointerException("Null primarySurfaceEdge");
    }

    public List<d> a() {
        return this.f11769c;
    }

    public N b() {
        return this.f11767a;
    }

    public N c() {
        return this.f11768b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r.b)) {
            return false;
        }
        r.b bVar = (r.b) obj;
        return this.f11767a.equals(bVar.b()) && this.f11768b.equals(bVar.c()) && this.f11769c.equals(bVar.a());
    }

    public int hashCode() {
        return ((((this.f11767a.hashCode() ^ 1000003) * 1000003) ^ this.f11768b.hashCode()) * 1000003) ^ this.f11769c.hashCode();
    }

    public String toString() {
        return "In{primarySurfaceEdge=" + this.f11767a + ", secondarySurfaceEdge=" + this.f11768b + ", outConfigs=" + this.f11769c + "}";
    }
}
