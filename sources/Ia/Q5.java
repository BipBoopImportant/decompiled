package ia;

import java.util.Set;

public abstract class Q5 extends M4 implements Set {

    /* renamed from: b  reason: collision with root package name */
    private transient N5 f53395b;

    Q5() {
    }

    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size() && containsAll(set)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public final int hashCode() {
        return C8227b.a(this);
    }

    public final N5 m() {
        N5 n52 = this.f53395b;
        if (n52 != null) {
            return n52;
        }
        N5 p10 = p();
        this.f53395b = p10;
        return p10;
    }

    /* access modifiers changed from: package-private */
    public N5 p() {
        return N5.p(toArray());
    }
}
