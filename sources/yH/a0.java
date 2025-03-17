package YH;

import XH.v;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000:\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u001a\u001a%\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001aQ\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\u0007\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\b\u0010\t\u001aQ\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\u0007\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\u000b\u0010\t\u001aa\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\fj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\r\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\u0007\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\u000e\u0010\u000f\u001a3\u0010\u0011\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0010\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001aI\u0010\u0014\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\n2\u001a\u0010\u0007\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005¢\u0006\u0004\b\u0014\u0010\u0015\u001aG\u0010\u0017\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\n2\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0016¢\u0006\u0004\b\u0017\u0010\u0018\u001a;\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0016¢\u0006\u0004\b\u0019\u0010\u001a\u001aQ\u0010\u001d\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0018\b\u0002\u0010\u001b*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\n*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u00162\u0006\u0010\u001c\u001a\u00028\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001aS\u0010\u001f\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0018\b\u0002\u0010\u001b*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\n*\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u00052\u0006\u0010\u001c\u001a\u00028\u0002¢\u0006\u0004\b\u001f\u0010 \u001a9\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0007¢\u0006\u0004\b!\u0010\"\u001a9\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0007¢\u0006\u0004\b#\u0010\"\u001aN\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006H\u0002¢\u0006\u0004\b%\u0010&\u001aP\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0014\u0010'\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0002¢\u0006\u0004\b(\u0010)\u001aB\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0010\u001a\u00028\u0000H\u0002¢\u0006\u0004\b*\u0010+\u001aH\u0010-\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0002¢\u0006\u0004\b-\u0010.\u001a7\u0010/\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0000¢\u0006\u0004\b/\u0010\"¨\u00060"}, d2 = {"K", "V", "", "j", "()Ljava/util/Map;", "", "LXH/v;", "pairs", "m", "([LXH/v;)Ljava/util/Map;", "", "p", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "l", "([LXH/v;)Ljava/util/HashMap;", "key", "k", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "LXH/N;", "u", "(Ljava/util/Map;[LXH/v;)V", "", "t", "(Ljava/util/Map;Ljava/lang/Iterable;)V", "v", "(Ljava/lang/Iterable;)Ljava/util/Map;", "M", "destination", "w", "(Ljava/lang/Iterable;Ljava/util/Map;)Ljava/util/Map;", "y", "([LXH/v;Ljava/util/Map;)Ljava/util/Map;", "x", "(Ljava/util/Map;)Ljava/util/Map;", "z", "pair", "r", "(Ljava/util/Map;LXH/v;)Ljava/util/Map;", "map", "s", "(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;", "o", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/util/Map;", "keys", "n", "(Ljava/util/Map;Ljava/lang/Iterable;)Ljava/util/Map;", "q", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/MapsKt")
class a0 extends Z {
    public static <K, V> Map<K, V> j() {
        C16854K k10 = C16854K.f140419a;
        C17542s.h(k10, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return k10;
    }

    public static <K, V> V k(Map<K, ? extends V> map, K k10) {
        C17542s.j(map, "<this>");
        return Y.a(map, k10);
    }

    public static <K, V> HashMap<K, V> l(v<? extends K, ? extends V>... vVarArr) {
        C17542s.j(vVarArr, "pairs");
        HashMap<K, V> hashMap = new HashMap<>(X.e(vVarArr.length));
        X.u(hashMap, vVarArr);
        return hashMap;
    }

    public static <K, V> Map<K, V> m(v<? extends K, ? extends V>... vVarArr) {
        C17542s.j(vVarArr, "pairs");
        return vVarArr.length > 0 ? y(vVarArr, new LinkedHashMap(X.e(vVarArr.length))) : X.j();
    }

    public static <K, V> Map<K, V> n(Map<? extends K, ? extends V> map, Iterable<? extends K> iterable) {
        C17542s.j(map, "<this>");
        C17542s.j(iterable, "keys");
        Map<? extends K, ? extends V> z10 = X.z(map);
        C16846C.K(z10.keySet(), iterable);
        return q(z10);
    }

    public static <K, V> Map<K, V> o(Map<? extends K, ? extends V> map, K k10) {
        C17542s.j(map, "<this>");
        Map<? extends K, ? extends V> z10 = X.z(map);
        z10.remove(k10);
        return q(z10);
    }

    public static <K, V> Map<K, V> p(v<? extends K, ? extends V>... vVarArr) {
        C17542s.j(vVarArr, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(X.e(vVarArr.length));
        X.u(linkedHashMap, vVarArr);
        return linkedHashMap;
    }

    public static final <K, V> Map<K, V> q(Map<K, ? extends V> map) {
        C17542s.j(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : Z.g(map) : X.j();
    }

    public static <K, V> Map<K, V> r(Map<? extends K, ? extends V> map, v<? extends K, ? extends V> vVar) {
        C17542s.j(map, "<this>");
        C17542s.j(vVar, "pair");
        if (map.isEmpty()) {
            return X.f(vVar);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(vVar.c(), vVar.d());
        return linkedHashMap;
    }

    public static <K, V> Map<K, V> s(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2) {
        C17542s.j(map, "<this>");
        C17542s.j(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static <K, V> void t(Map<? super K, ? super V> map, Iterable<? extends v<? extends K, ? extends V>> iterable) {
        C17542s.j(map, "<this>");
        C17542s.j(iterable, "pairs");
        for (v vVar : iterable) {
            map.put(vVar.a(), vVar.b());
        }
    }

    public static <K, V> void u(Map<? super K, ? super V> map, v<? extends K, ? extends V>[] vVarArr) {
        C17542s.j(map, "<this>");
        C17542s.j(vVarArr, "pairs");
        for (v<? extends K, ? extends V> vVar : vVarArr) {
            map.put(vVar.a(), vVar.b());
        }
    }

    public static <K, V> Map<K, V> v(Iterable<? extends v<? extends K, ? extends V>> iterable) {
        C17542s.j(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return q(w(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return X.j();
        }
        if (size != 1) {
            return w(iterable, new LinkedHashMap(X.e(collection.size())));
        }
        return X.f((v) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M w(Iterable<? extends v<? extends K, ? extends V>> iterable, M m10) {
        C17542s.j(iterable, "<this>");
        C17542s.j(m10, "destination");
        X.t(m10, iterable);
        return m10;
    }

    public static <K, V> Map<K, V> x(Map<? extends K, ? extends V> map) {
        C17542s.j(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? X.z(map) : Z.g(map) : X.j();
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M y(v<? extends K, ? extends V>[] vVarArr, M m10) {
        C17542s.j(vVarArr, "<this>");
        C17542s.j(m10, "destination");
        X.u(m10, vVarArr);
        return m10;
    }

    public static <K, V> Map<K, V> z(Map<? extends K, ? extends V> map) {
        C17542s.j(map, "<this>");
        return new LinkedHashMap(map);
    }
}
