package r6;

import YH.C16877v;
import YH.X;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\u001aC\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\u001a7\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"", "K", "V", "", "initialCapacity", "", "loadFactor", "", "a", "(IF)Ljava/util/Map;", "", "d", "(Ljava/util/Map;)Ljava/util/Map;", "T", "", "c", "(Ljava/util/List;)Ljava/util/List;", "coil-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: r6.c  reason: case insensitive filesystem */
public final class C8695c {
    public static final <K, V> Map<K, V> a(int i10, float f10) {
        return new LinkedHashMap(i10, f10, true);
    }

    public static /* synthetic */ Map b(int i10, float f10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            f10 = 0.75f;
        }
        return a(i10, f10);
    }

    public static final <T> List<T> c(List<? extends T> list) {
        int size = list.size();
        return size != 0 ? size != 1 ? Collections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(C16877v.w0(list)) : C16877v.n();
    }

    public static final <K, V> Map<K, V> d(Map<K, ? extends V> map) {
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
