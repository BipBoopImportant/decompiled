package Tb;

import Tb.F;
import java.util.List;

final class y extends F.e.d.f {

    /* renamed from: a  reason: collision with root package name */
    private final List<F.e.d.C1109e> f63847a;

    static final class b extends F.e.d.f.a {

        /* renamed from: a  reason: collision with root package name */
        private List<F.e.d.C1109e> f63848a;

        b() {
        }

        public F.e.d.f a() {
            List<F.e.d.C1109e> list = this.f63848a;
            if (list != null) {
                return new y(list);
            }
            throw new IllegalStateException("Missing required properties:" + " rolloutAssignments");
        }

        public F.e.d.f.a b(List<F.e.d.C1109e> list) {
            if (list != null) {
                this.f63848a = list;
                return this;
            }
            throw new NullPointerException("Null rolloutAssignments");
        }
    }

    public List<F.e.d.C1109e> b() {
        return this.f63847a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.f) {
            return this.f63847a.equals(((F.e.d.f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f63847a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f63847a + "}";
    }

    private y(List<F.e.d.C1109e> list) {
        this.f63847a = list;
    }
}
