package kb;

import java.io.Serializable;
import jb.f;
import jb.j;
import jb.l;

/* renamed from: kb.h  reason: case insensitive filesystem */
final class C9953h<F, T> extends C9935O<F> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    final f<F, ? extends T> f74967a;

    /* renamed from: b  reason: collision with root package name */
    final C9935O<T> f74968b;

    C9953h(f<F, ? extends T> fVar, C9935O<T> o10) {
        this.f74967a = (f) l.j(fVar);
        this.f74968b = (C9935O) l.j(o10);
    }

    public int compare(F f10, F f11) {
        return this.f74968b.compare(this.f74967a.apply(f10), this.f74967a.apply(f11));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9953h)) {
            return false;
        }
        C9953h hVar = (C9953h) obj;
        return this.f74967a.equals(hVar.f74967a) && this.f74968b.equals(hVar.f74968b);
    }

    public int hashCode() {
        return j.b(this.f74967a, this.f74968b);
    }

    public String toString() {
        return this.f74968b + ".onResultOf(" + this.f74967a + ")";
    }
}
