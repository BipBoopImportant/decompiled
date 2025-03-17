package C6;

import J6.a;
import java.util.Arrays;
import java.util.List;

abstract class n<V, O> implements m<V, O> {

    /* renamed from: a  reason: collision with root package name */
    final List<a<V>> f33747a;

    n(List<a<V>> list) {
        this.f33747a = list;
    }

    public boolean g() {
        if (!this.f33747a.isEmpty()) {
            return this.f33747a.size() == 1 && this.f33747a.get(0).i();
        }
        return true;
    }

    public List<a<V>> i() {
        return this.f33747a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (!this.f33747a.isEmpty()) {
            sb2.append("values=");
            sb2.append(Arrays.toString(this.f33747a.toArray()));
        }
        return sb2.toString();
    }
}
