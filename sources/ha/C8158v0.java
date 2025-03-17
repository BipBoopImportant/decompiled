package ha;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* renamed from: ha.v0  reason: case insensitive filesystem */
abstract class C8158v0 extends AbstractMap {

    /* renamed from: a  reason: collision with root package name */
    private transient Set f52834a;

    /* renamed from: b  reason: collision with root package name */
    private transient Collection f52835b;

    C8158v0() {
    }

    /* access modifiers changed from: package-private */
    public abstract Set a();

    public final Set entrySet() {
        Set set = this.f52834a;
        if (set != null) {
            return set;
        }
        Set a10 = a();
        this.f52834a = a10;
        return a10;
    }

    public final Collection values() {
        Collection collection = this.f52835b;
        if (collection != null) {
            return collection;
        }
        C8148u0 u0Var = new C8148u0(this);
        this.f52835b = u0Var;
        return u0Var;
    }
}
