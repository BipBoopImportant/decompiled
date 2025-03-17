package ha;

import java.util.Iterator;
import java.util.Map;

final class C0 extends C8089o0 {

    /* renamed from: c  reason: collision with root package name */
    private final transient C8079n0 f51820c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final transient Object[] f51821d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final transient int f51822e;

    C0(C8079n0 n0Var, Object[] objArr, int i10, int i11) {
        this.f51820c = n0Var;
        this.f51821d = objArr;
        this.f51822e = i11;
    }

    /* access modifiers changed from: package-private */
    public final int b(Object[] objArr, int i10) {
        return p().b(objArr, i10);
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f51820c.get(key));
        }
    }

    public final /* synthetic */ Iterator iterator() {
        return p().listIterator(0);
    }

    public final J0 k() {
        return p().listIterator(0);
    }

    /* access modifiers changed from: package-private */
    public final C8059l0 q() {
        return new B0(this);
    }

    public final int size() {
        return this.f51822e;
    }
}
