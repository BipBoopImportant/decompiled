package ha;

import java.util.Map;
import java.util.Set;

abstract class M implements C8178x0 {

    /* renamed from: a  reason: collision with root package name */
    private transient Set f52029a;

    /* renamed from: b  reason: collision with root package name */
    private transient Map f52030b;

    M() {
    }

    /* access modifiers changed from: package-private */
    public abstract Map c();

    /* access modifiers changed from: package-private */
    public abstract Set d();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8178x0)) {
            return false;
        }
        return zzv().equals(((C8178x0) obj).zzv());
    }

    public final int hashCode() {
        return zzv().hashCode();
    }

    public final Set o() {
        Set set = this.f52029a;
        if (set != null) {
            return set;
        }
        Set d10 = d();
        this.f52029a = d10;
        return d10;
    }

    public final String toString() {
        return zzv().toString();
    }

    public final Map zzv() {
        Map map = this.f52030b;
        if (map != null) {
            return map;
        }
        Map c10 = c();
        this.f52030b = c10;
        return c10;
    }
}
