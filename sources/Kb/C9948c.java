package kb;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: kb.c  reason: case insensitive filesystem */
abstract class C9948c<K, V> extends C9949d<K, V> implements C9924D<K, V> {
    protected C9948c(Map<K, Collection<V>> map) {
        super(map);
    }

    /* renamed from: B */
    public List<V> get(K k10) {
        return (List) super.get(k10);
    }

    public Map<K, Collection<V>> b() {
        return super.b();
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public boolean put(K k10, V v10) {
        return super.put(k10, v10);
    }

    /* access modifiers changed from: package-private */
    public <E> Collection<E> y(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    /* access modifiers changed from: package-private */
    public Collection<V> z(K k10, Collection<V> collection) {
        return A(k10, (List) collection, (C9949d<K, V>.k) null);
    }
}
