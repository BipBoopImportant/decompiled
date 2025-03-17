package kb;

import java.io.Serializable;
import jb.l;

/* renamed from: kb.V  reason: case insensitive filesystem */
final class C9941V extends C9935O<Comparable<?>> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    static final C9941V f74908a = new C9941V();

    private C9941V() {
    }

    public <S extends Comparable<?>> C9935O<S> g() {
        return C9935O.d();
    }

    /* renamed from: h */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        l.j(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
