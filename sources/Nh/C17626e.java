package nH;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: nH.e  reason: case insensitive filesystem */
public final class C17626e<V> implements Map<Class<?>, V> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, V> f144812a;

    private C17626e(Map<String, V> map) {
        this.f144812a = map;
    }

    public static <V> Map<Class<?>, V> a(Map<String, V> map) {
        return new C17626e(map);
    }

    /* renamed from: b */
    public V put(Class<?> cls, V v10) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    public void clear() {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    public boolean containsKey(Object obj) {
        if (obj instanceof Class) {
            return this.f144812a.containsKey(((Class) obj).getName());
        }
        throw new IllegalArgumentException("Key must be a class");
    }

    public boolean containsValue(Object obj) {
        return this.f144812a.containsValue(obj);
    }

    public Set<Map.Entry<Class<?>, V>> entrySet() {
        throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of entrySet(). Consider @ClassKey instead.");
    }

    public V get(Object obj) {
        if (obj instanceof Class) {
            return this.f144812a.get(((Class) obj).getName());
        }
        throw new IllegalArgumentException("Key must be a class");
    }

    public boolean isEmpty() {
        return this.f144812a.isEmpty();
    }

    public Set<Class<?>> keySet() {
        throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of keySet(). Consider @ClassKey instead.");
    }

    public void putAll(Map<? extends Class<?>, ? extends V> map) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    public V remove(Object obj) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    public int size() {
        return this.f144812a.size();
    }

    public Collection<V> values() {
        return this.f144812a.values();
    }
}
