package Ic;

import java.util.Set;

final class a extends b {

    /* renamed from: a  reason: collision with root package name */
    private final Set<String> f61014a;

    a(Set<String> set) {
        if (set != null) {
            this.f61014a = set;
            return;
        }
        throw new NullPointerException("Null updatedKeys");
    }

    public Set<String> b() {
        return this.f61014a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            return this.f61014a.equals(((b) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f61014a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ConfigUpdate{updatedKeys=" + this.f61014a + "}";
    }
}
