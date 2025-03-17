package YH;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.W;

@Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0003\u001a7\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00040\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "K", "LYH/M;", "", "", "a", "(LYH/M;)Ljava/util/Map;", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/GroupingKt")
class O {
    public static <T, K> Map<K, Integer> a(C16856M<T, ? extends K> m10) {
        C17542s.j(m10, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> b10 = m10.b();
        while (b10.hasNext()) {
            Object a10 = m10.a(b10.next());
            Object obj = linkedHashMap.get(a10);
            if (obj == null && !linkedHashMap.containsKey(a10)) {
                obj = new M();
            }
            M m11 = (M) obj;
            m11.f144346a++;
            linkedHashMap.put(a10, m11);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            C17542s.h(entry, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace>");
            W.e(entry).setValue(Integer.valueOf(((M) entry.getValue()).f144346a));
        }
        return W.d(linkedHashMap);
    }
}
