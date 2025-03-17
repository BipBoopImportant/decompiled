package EJ;

import YH.C16877v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C17542s;

/* renamed from: EJ.a  reason: case insensitive filesystem */
public final class C15660a {
    public static final <T> void a(Collection<T> collection, T t10) {
        C17542s.j(collection, "<this>");
        if (t10 != null) {
            collection.add(t10);
        }
    }

    private static final int b(int i10) {
        if (i10 < 3) {
            return 3;
        }
        return i10 + (i10 / 3) + 1;
    }

    public static final <T> List<T> c(ArrayList<T> arrayList) {
        C17542s.j(arrayList, "<this>");
        int size = arrayList.size();
        if (size == 0) {
            return C16877v.n();
        }
        if (size == 1) {
            return C16877v.e(C16877v.w0(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    public static final <K> Map<K, Integer> d(Iterable<? extends K> iterable) {
        C17542s.j(iterable, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i10 = 0;
        for (Object put : iterable) {
            linkedHashMap.put(put, Integer.valueOf(i10));
            i10++;
        }
        return linkedHashMap;
    }

    public static final <K, V> HashMap<K, V> e(int i10) {
        return new HashMap<>(b(i10));
    }

    public static final <E> HashSet<E> f(int i10) {
        return new HashSet<>(b(i10));
    }

    public static final <E> LinkedHashSet<E> g(int i10) {
        return new LinkedHashSet<>(b(i10));
    }
}
