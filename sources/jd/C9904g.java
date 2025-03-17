package jd;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import oI.C17693a;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00028\u00008\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00028\u00018\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\n\u0010\b¨\u0006\f"}, d2 = {"Ljd/g;", "K", "V", "", "delegate", "<init>", "(Ljava/util/Map$Entry;)V", "getKey", "()Ljava/lang/Object;", "key", "getValue", "value", "java_kotlin-shared_runtime"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: jd.g  reason: case insensitive filesystem */
public final class C9904g<K, V> implements Map.Entry<K, V>, C17693a {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Map.Entry<K, V> f74827a;

    public C9904g(Map.Entry<? extends K, ? extends V> entry) {
        C17542s.j(entry, "delegate");
        this.f74827a = entry;
    }

    public K getKey() {
        return this.f74827a.getKey();
    }

    public V getValue() {
        return this.f74827a.getValue();
    }

    public V setValue(V v10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
