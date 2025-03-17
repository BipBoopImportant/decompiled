package kb;

import java.util.Collection;
import java.util.Map;

/* renamed from: kb.H  reason: case insensitive filesystem */
public interface C9928H<K, V> {
    Collection<Map.Entry<K, V>> a();

    Map<K, Collection<V>> b();

    boolean c(Object obj, Object obj2);

    void clear();

    Collection<V> get(K k10);

    boolean put(K k10, V v10);

    boolean remove(Object obj, Object obj2);

    int size();

    Collection<V> values();
}
