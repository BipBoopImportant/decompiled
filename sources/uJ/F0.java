package uJ;

import org.slf4j.Marker;

public abstract class F0 implements E0 {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E0)) {
            return false;
        }
        E0 e02 = (E0) obj;
        return a() == e02.a() && c() == e02.c() && getType().equals(e02.getType());
    }

    public int hashCode() {
        int hashCode = c().hashCode();
        if (M0.w(getType())) {
            return (hashCode * 31) + 19;
        }
        return (hashCode * 31) + (a() ? 17 : getType().hashCode());
    }

    public String toString() {
        if (a()) {
            return Marker.ANY_MARKER;
        }
        if (c() == Q0.INVARIANT) {
            return getType().toString();
        }
        return c() + " " + getType();
    }
}
