package ga;

import java.util.Set;

public abstract class r extends C7909k implements Set {

    /* renamed from: b  reason: collision with root package name */
    private transient C7912n f51411b;

    r() {
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
        return C7923z.a(this);
    }

    public final C7912n m() {
        C7912n nVar = this.f51411b;
        if (nVar != null) {
            return nVar;
        }
        C7912n p10 = p();
        this.f51411b = p10;
        return p10;
    }

    /* access modifiers changed from: package-private */
    public C7912n p() {
        Object[] array = toArray();
        int i10 = C7912n.f51401c;
        return C7912n.p(array, array.length);
    }
}
