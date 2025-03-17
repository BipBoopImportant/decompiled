package PJ;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0010&\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bH\u0000¢\u0006\u0004\b\u000b\u0010\fJ?\u0010\u000f\u001a\u00020\n\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00062\u000e\u0010\u000e\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006H\u0000¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0012\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006H\u0000¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LPJ/e;", "", "<init>", "()V", "K", "V", "", "map", "", "element", "", "a", "(Ljava/util/Map;Ljava/util/Map$Entry;)Z", "thisMap", "otherMap", "b", "(Ljava/util/Map;Ljava/util/Map;)Z", "", "c", "(Ljava/util/Map;)I", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: PJ.e  reason: case insensitive filesystem */
public final class C16211e {

    /* renamed from: a  reason: collision with root package name */
    public static final C16211e f137203a = new C16211e();

    private C16211e() {
    }

    public final <K, V> boolean a(Map<K, ? extends V> map, Map.Entry<? extends K, ? extends V> entry) {
        C17542s.j(map, "map");
        C17542s.j(entry, "element");
        Object obj = map.get(entry.getKey());
        return obj != null ? C17542s.e(obj, entry.getValue()) : entry.getValue() == null && map.containsKey(entry.getKey());
    }

    public final <K, V> boolean b(Map<K, ? extends V> map, Map<?, ?> map2) {
        C17542s.j(map, "thisMap");
        C17542s.j(map2, "otherMap");
        if (map.size() != map2.size()) {
            throw new IllegalArgumentException("Failed requirement.");
        } else if (map2.isEmpty()) {
            return true;
        } else {
            for (Map.Entry<?, ?> a10 : map2.entrySet()) {
                if (!f137203a.a(map, a10)) {
                    return false;
                }
            }
            return true;
        }
    }

    public final <K, V> int c(Map<K, ? extends V> map) {
        C17542s.j(map, "map");
        return map.entrySet().hashCode();
    }
}
