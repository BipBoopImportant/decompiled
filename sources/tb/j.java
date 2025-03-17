package Tb;

import Tb.F;

final class j extends F.e.a.b {

    /* renamed from: a  reason: collision with root package name */
    private final String f63707a;

    public String a() {
        return this.f63707a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.a.b) {
            return this.f63707a.equals(((F.e.a.b) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.f63707a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Organization{clsId=" + this.f63707a + "}";
    }
}
