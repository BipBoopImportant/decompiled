package p;

import java.util.HashMap;
import java.util.Map;
import p.C5677b;

/* renamed from: p.a  reason: case insensitive filesystem */
public class C5676a<K, V> extends C5677b<K, V> {

    /* renamed from: e  reason: collision with root package name */
    private final HashMap<K, C5677b.c<K, V>> f26773e = new HashMap<>();

    public boolean contains(K k10) {
        return this.f26773e.containsKey(k10);
    }

    /* access modifiers changed from: protected */
    public C5677b.c<K, V> i(K k10) {
        return this.f26773e.get(k10);
    }

    public V p(K k10, V v10) {
        C5677b.c i10 = i(k10);
        if (i10 != null) {
            return i10.f26779b;
        }
        this.f26773e.put(k10, m(k10, v10));
        return null;
    }

    public V q(K k10) {
        V q10 = super.q(k10);
        this.f26773e.remove(k10);
        return q10;
    }

    public Map.Entry<K, V> r(K k10) {
        if (contains(k10)) {
            return this.f26773e.get(k10).f26781d;
        }
        return null;
    }
}
