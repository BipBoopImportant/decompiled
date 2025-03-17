package k0;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\fR0\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0011j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013R\u0011\u0010\u0018\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R#\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a0\u00198F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lk0/c;", "", "K", "V", "", "initialCapacity", "", "loadFactor", "<init>", "(IF)V", "key", "a", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "d", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "e", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "Ljava/util/LinkedHashMap;", "map", "", "c", "()Z", "isEmpty", "", "", "b", "()Ljava/util/Set;", "entries", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final LinkedHashMap<K, V> f24993a;

    public c(int i10, float f10) {
        this.f24993a = new LinkedHashMap<>(i10, f10, true);
    }

    public final V a(K k10) {
        C17542s.j(k10, "key");
        return this.f24993a.get(k10);
    }

    public final Set<Map.Entry<K, V>> b() {
        Set<Map.Entry<K, V>> entrySet = this.f24993a.entrySet();
        C17542s.i(entrySet, "map.entries");
        return entrySet;
    }

    public final boolean c() {
        return this.f24993a.isEmpty();
    }

    public final V d(K k10, V v10) {
        C17542s.j(k10, "key");
        C17542s.j(v10, "value");
        return this.f24993a.put(k10, v10);
    }

    public final V e(K k10) {
        C17542s.j(k10, "key");
        return this.f24993a.remove(k10);
    }
}
