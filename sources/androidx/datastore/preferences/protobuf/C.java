package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

public class C extends D {

    /* renamed from: e  reason: collision with root package name */
    private final S f21240e;

    static class b<K> implements Map.Entry<K, Object> {

        /* renamed from: a  reason: collision with root package name */
        private Map.Entry<K, C> f21241a;

        public C a() {
            return this.f21241a.getValue();
        }

        public K getKey() {
            return this.f21241a.getKey();
        }

        public Object getValue() {
            C value = this.f21241a.getValue();
            if (value == null) {
                return null;
            }
            return value.f();
        }

        public Object setValue(Object obj) {
            if (obj instanceof S) {
                return this.f21241a.getValue().d((S) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        private b(Map.Entry<K, C> entry) {
            this.f21241a = entry;
        }
    }

    static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: a  reason: collision with root package name */
        private Iterator<Map.Entry<K, Object>> f21242a;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f21242a = it;
        }

        /* renamed from: a */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f21242a.next();
            return next.getValue() instanceof C ? new b(next) : next;
        }

        public boolean hasNext() {
            return this.f21242a.hasNext();
        }

        public void remove() {
            this.f21242a.remove();
        }
    }

    public boolean equals(Object obj) {
        return f().equals(obj);
    }

    public S f() {
        return c(this.f21240e);
    }

    public int hashCode() {
        return f().hashCode();
    }

    public String toString() {
        return f().toString();
    }
}
