package ha;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

final class V extends AbstractSet {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C7959b0 f52284a;

    V(C7959b0 b0Var) {
        this.f52284a = b0Var;
    }

    public final void clear() {
        this.f52284a.clear();
    }

    public final boolean contains(Object obj) {
        Map m10 = this.f52284a.m();
        if (m10 != null) {
            return m10.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int d10 = this.f52284a.u(entry.getKey());
            if (d10 != -1) {
                Object[] objArr = this.f52284a.f52428d;
                objArr.getClass();
                if (r.a(objArr[d10], entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Iterator iterator() {
        C7959b0 b0Var = this.f52284a;
        Map m10 = b0Var.m();
        return m10 != null ? m10.entrySet().iterator() : new T(b0Var);
    }

    public final boolean remove(Object obj) {
        Map m10 = this.f52284a.m();
        if (m10 != null) {
            return m10.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C7959b0 b0Var = this.f52284a;
        if (b0Var.s()) {
            return false;
        }
        int c10 = b0Var.t();
        Object key = entry.getKey();
        Object value = entry.getValue();
        Object k10 = C7959b0.k(this.f52284a);
        C7959b0 b0Var2 = this.f52284a;
        int[] iArr = b0Var2.f52426b;
        iArr.getClass();
        Object[] objArr = b0Var2.f52427c;
        objArr.getClass();
        Object[] objArr2 = b0Var2.f52428d;
        objArr2.getClass();
        int b10 = C7969c0.b(key, value, c10, k10, iArr, objArr, objArr2);
        if (b10 == -1) {
            return false;
        }
        this.f52284a.q(b10, c10);
        C7959b0 b0Var3 = this.f52284a;
        b0Var3.f52430f = b0Var3.f52430f - 1;
        this.f52284a.o();
        return true;
    }

    public final int size() {
        return this.f52284a.size();
    }
}
