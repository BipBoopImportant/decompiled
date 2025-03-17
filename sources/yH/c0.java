package YH;

import GJ.C15765h;
import XH.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0003\u001a=\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a=\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b0\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"K", "V", "", "", "LXH/v;", "B", "(Ljava/util/Map;)Ljava/util/List;", "LGJ/h;", "", "A", "(Ljava/util/Map;)LGJ/h;", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/MapsKt")
class c0 extends b0 {
    public static <K, V> C15765h<Map.Entry<K, V>> A(Map<? extends K, ? extends V> map) {
        C17542s.j(map, "<this>");
        return C16877v.h0(map.entrySet());
    }

    public static <K, V> List<v<K, V>> B(Map<? extends K, ? extends V> map) {
        C17542s.j(map, "<this>");
        if (map.size() == 0) {
            return C16877v.n();
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return C16877v.n();
        }
        Map.Entry next = it.next();
        if (!it.hasNext()) {
            return C16877v.e(new v(next.getKey(), next.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new v(next.getKey(), next.getValue()));
        do {
            Map.Entry next2 = it.next();
            arrayList.add(new v(next2.getKey(), next2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }
}
