package kb;

import java.util.Map;
import jb.j;

/* renamed from: kb.e  reason: case insensitive filesystem */
abstract class C9950e<K, V> implements Map.Entry<K, V> {
    C9950e() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return j.a(getKey(), entry.getKey()) && j.a(getValue(), entry.getValue());
    }

    public abstract K getKey();

    public abstract V getValue();

    public int hashCode() {
        Object key = getKey();
        Object value = getValue();
        int i10 = 0;
        int hashCode = key == null ? 0 : key.hashCode();
        if (value != null) {
            i10 = value.hashCode();
        }
        return hashCode ^ i10;
    }

    public String toString() {
        return getKey() + "=" + getValue();
    }
}
