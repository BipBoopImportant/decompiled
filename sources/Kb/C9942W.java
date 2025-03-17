package kb;

import java.io.Serializable;
import jb.l;

/* renamed from: kb.W  reason: case insensitive filesystem */
final class C9942W<T> extends C9935O<T> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    final C9935O<? super T> f74909a;

    C9942W(C9935O<? super T> o10) {
        this.f74909a = (C9935O) l.j(o10);
    }

    public int compare(T t10, T t11) {
        return this.f74909a.compare(t11, t10);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9942W) {
            return this.f74909a.equals(((C9942W) obj).f74909a);
        }
        return false;
    }

    public <S extends T> C9935O<S> g() {
        return this.f74909a;
    }

    public int hashCode() {
        return -this.f74909a.hashCode();
    }

    public String toString() {
        return this.f74909a + ".reverse()";
    }
}
