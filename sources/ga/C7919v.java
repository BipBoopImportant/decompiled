package ga;

import java.util.Iterator;
import java.util.Map;

/* renamed from: ga.v  reason: case insensitive filesystem */
final class C7919v extends r {

    /* renamed from: c  reason: collision with root package name */
    private final transient C7915q f51416c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final transient Object[] f51417d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final transient int f51418e;

    C7919v(C7915q qVar, Object[] objArr, int i10, int i11) {
        this.f51416c = qVar;
        this.f51417d = objArr;
        this.f51418e = i11;
    }

    /* access modifiers changed from: package-private */
    public final int b(Object[] objArr, int i10) {
        return m().b(objArr, 0);
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f51416c.get(key));
        }
    }

    public final /* synthetic */ Iterator iterator() {
        return m().listIterator(0);
    }

    /* access modifiers changed from: package-private */
    public final C7912n p() {
        return new C7918u(this);
    }

    public final int size() {
        return this.f51418e;
    }
}
