package jd;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import oI.C17693a;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\b\b\u0002\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B\u001d\b\u0007\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00028\u0001H\u0001¢\u0006\u0004\b\u000e\u0010\fJ\u001a\u0010\u000f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\t\u001a\u00028\u0000H\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\nH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0014\u0010\fJ\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00158\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0017R&\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001f0\u001e8VX\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e8VX\u0004¢\u0006\u0006\u001a\u0004\b#\u0010!R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00010%8VX\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Ljd/b;", "K", "V", "", "P", "", "delegate", "<init>", "(Ljava/util/Map;)V", "key", "", "containsKey", "(Ljava/lang/Object;)Z", "value", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "isEmpty", "()Z", "other", "equals", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Ljava/util/Map;", "size", "", "", "b", "()Ljava/util/Set;", "entries", "c", "keys", "", "d", "()Ljava/util/Collection;", "values", "java_kotlin-shared_runtime"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: jd.b  reason: case insensitive filesystem */
public final class C9899b<K, V, P> implements Map<K, V>, C17693a {

    /* renamed from: a  reason: collision with root package name */
    private final Map<K, V> f74820a;

    public C9899b(Map<K, ? extends V> map) {
        C17542s.j(map, "delegate");
        this.f74820a = map;
    }

    public int a() {
        return this.f74820a.size();
    }

    public Set<Map.Entry<K, V>> b() {
        return new C9903f(this.f74820a.entrySet());
    }

    public Set<K> c() {
        return new C9905h(this.f74820a.keySet());
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public V compute(K k10, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public V computeIfAbsent(K k10, Function<? super K, ? extends V> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public V computeIfPresent(K k10, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(Object obj) {
        return this.f74820a.containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return this.f74820a.containsValue(obj);
    }

    public Collection<V> d() {
        return new C9900c(this.f74820a.values());
    }

    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return b();
    }

    public boolean equals(Object obj) {
        return C17542s.e(this.f74820a, obj);
    }

    public V get(Object obj) {
        return this.f74820a.get(obj);
    }

    public int hashCode() {
        return this.f74820a.hashCode();
    }

    public boolean isEmpty() {
        return this.f74820a.isEmpty();
    }

    public final /* bridge */ Set<K> keySet() {
        return c();
    }

    public V merge(K k10, V v10, BiFunction<? super V, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public V put(K k10, V v10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public V putIfAbsent(K k10, V v10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public V replace(K k10, V v10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return a();
    }

    public String toString() {
        return this.f74820a.toString();
    }

    public final /* bridge */ Collection<V> values() {
        return d();
    }

    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean replace(K k10, V v10, V v11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
