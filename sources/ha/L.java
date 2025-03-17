package ha;

import java.util.Map;

abstract class L implements Map.Entry {
    L() {
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return r.a(getKey(), entry.getKey()) && r.a(getValue(), entry.getValue());
        }
    }

    public abstract Object getKey();

    public abstract Object getValue();

    public final int hashCode() {
        Object key = getKey();
        Object value = getValue();
        int i10 = 0;
        int hashCode = key == null ? 0 : key.hashCode();
        if (value != null) {
            i10 = value.hashCode();
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        String valueOf = String.valueOf(getKey());
        String valueOf2 = String.valueOf(getValue());
        return valueOf + "=" + valueOf2;
    }
}
