package Lc;

import java.util.Set;

final class c extends e {

    /* renamed from: a  reason: collision with root package name */
    private final Set<d> f61594a;

    c(Set<d> set) {
        if (set != null) {
            this.f61594a = set;
            return;
        }
        throw new NullPointerException("Null rolloutAssignments");
    }

    public Set<d> b() {
        return this.f61594a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            return this.f61594a.equals(((e) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f61594a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f61594a + "}";
    }
}
