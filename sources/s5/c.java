package S5;

import YH.C16877v;
import YH.X;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\u001a7\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a%\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"K", "V", "", "b", "(Ljava/util/Map;)Ljava/util/Map;", "T", "", "a", "(Ljava/util/List;)Ljava/util/List;", "coil-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class c {
    public static final <T> List<T> a(List<? extends T> list) {
        int size = list.size();
        return size != 0 ? size != 1 ? Collections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(C16877v.w0(list)) : C16877v.n();
    }

    public static final <K, V> Map<K, V> b(Map<K, ? extends V> map) {
        int size = map.size();
        if (size == 0) {
            return X.j();
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) C16877v.v0(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }
}
