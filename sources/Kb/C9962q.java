package kb;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: kb.q  reason: case insensitive filesystem */
public abstract class C9962q<K, V> extends C9963r implements Map<K, V> {
    protected C9962q() {
    }

    /* access modifiers changed from: protected */
    public abstract Map<K, V> b();

    /* access modifiers changed from: protected */
    public boolean c(Object obj) {
        return C9927G.b(this, obj);
    }

    public void clear() {
        b().clear();
    }

    public boolean containsKey(Object obj) {
        return b().containsKey(obj);
    }

    /* access modifiers changed from: protected */
    public boolean d(Object obj) {
        return C9927G.c(this, obj);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return b().entrySet();
    }

    /* access modifiers changed from: protected */
    public int f() {
        return C9944Y.d(entrySet());
    }

    public V get(Object obj) {
        return b().get(obj);
    }

    public boolean isEmpty() {
        return b().isEmpty();
    }

    public Set<K> keySet() {
        return b().keySet();
    }

    public V put(K k10, V v10) {
        return b().put(k10, v10);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        b().putAll(map);
    }

    public V remove(Object obj) {
        return b().remove(obj);
    }

    public int size() {
        return b().size();
    }

    public Collection<V> values() {
        return b().values();
    }
}
