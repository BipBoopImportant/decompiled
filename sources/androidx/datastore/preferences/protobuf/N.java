package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.K;
import java.util.Map;

final class N implements M {
    N() {
    }

    private static <K, V> int i(int i10, Object obj, Object obj2) {
        L l10 = (L) obj;
        K k10 = (K) obj2;
        int i11 = 0;
        if (l10.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : l10.entrySet()) {
            i11 += k10.a(i10, entry.getKey(), entry.getValue());
        }
        return i11;
    }

    private static <K, V> L<K, V> j(Object obj, Object obj2) {
        L<K, V> l10 = (L) obj;
        L l11 = (L) obj2;
        if (!l11.isEmpty()) {
            if (!l10.m()) {
                l10 = l10.p();
            }
            l10.o(l11);
        }
        return l10;
    }

    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    public K.a<?, ?> b(Object obj) {
        return ((K) obj).c();
    }

    public Map<?, ?> c(Object obj) {
        return (L) obj;
    }

    public Object d(Object obj) {
        return L.d().p();
    }

    public Map<?, ?> e(Object obj) {
        return (L) obj;
    }

    public Object f(Object obj) {
        ((L) obj).n();
        return obj;
    }

    public int g(int i10, Object obj, Object obj2) {
        return i(i10, obj, obj2);
    }

    public boolean h(Object obj) {
        return !((L) obj).m();
    }
}
