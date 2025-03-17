package W2;

import YH.C16877v;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0004\u001a;\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a)\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"K", "V", "", "map", "b", "(Ljava/util/Map;)Ljava/util/Map;", "T", "", "set", "a", "(Ljava/util/Set;)Ljava/util/Set;", "datastore-preferences-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a {
    public static final <T> Set<T> a(Set<? extends T> set) {
        C17542s.j(set, "set");
        Set<T> unmodifiableSet = Collections.unmodifiableSet(C16877v.y1(set));
        C17542s.i(unmodifiableSet, "unmodifiableSet(set.toSet())");
        return unmodifiableSet;
    }

    public static final <K, V> Map<K, V> b(Map<K, ? extends V> map) {
        C17542s.j(map, "map");
        Map<K, V> unmodifiableMap = Collections.unmodifiableMap(map);
        C17542s.i(unmodifiableMap, "unmodifiableMap(map)");
        return unmodifiableMap;
    }
}
