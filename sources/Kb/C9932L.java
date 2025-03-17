package kb;

import java.io.Serializable;
import jb.l;

/* renamed from: kb.L  reason: case insensitive filesystem */
final class C9932L extends C9935O<Comparable<?>> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    static final C9932L f74881a = new C9932L();

    private C9932L() {
    }

    public <S extends Comparable<?>> C9935O<S> g() {
        return C9941V.f74908a;
    }

    /* renamed from: h */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        l.j(comparable);
        l.j(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
