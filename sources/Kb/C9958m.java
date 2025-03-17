package kb;

import java.io.Serializable;
import java.util.Comparator;
import jb.l;

/* renamed from: kb.m  reason: case insensitive filesystem */
final class C9958m<T> extends C9935O<T> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    final Comparator<T> f74994a;

    C9958m(Comparator<T> comparator) {
        this.f74994a = (Comparator) l.j(comparator);
    }

    public int compare(T t10, T t11) {
        return this.f74994a.compare(t10, t11);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9958m) {
            return this.f74994a.equals(((C9958m) obj).f74994a);
        }
        return false;
    }

    public int hashCode() {
        return this.f74994a.hashCode();
    }

    public String toString() {
        return this.f74994a.toString();
    }
}
