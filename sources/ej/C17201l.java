package eJ;

import java.util.Iterator;
import java.util.Map;

/* renamed from: eJ.l  reason: case insensitive filesystem */
public class C17201l extends C17202m {

    /* renamed from: e  reason: collision with root package name */
    private final C17206q f143072e;

    /* renamed from: eJ.l$b */
    static class b<K> implements Map.Entry<K, Object> {

        /* renamed from: a  reason: collision with root package name */
        private Map.Entry<K, C17201l> f143073a;

        public K getKey() {
            return this.f143073a.getKey();
        }

        public Object getValue() {
            C17201l value = this.f143073a.getValue();
            if (value == null) {
                return null;
            }
            return value.e();
        }

        public Object setValue(Object obj) {
            if (obj instanceof C17206q) {
                return this.f143073a.getValue().d((C17206q) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        private b(Map.Entry<K, C17201l> entry) {
            this.f143073a = entry;
        }
    }

    /* renamed from: eJ.l$c */
    static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: a  reason: collision with root package name */
        private Iterator<Map.Entry<K, Object>> f143074a;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f143074a = it;
        }

        /* renamed from: a */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f143074a.next();
            return next.getValue() instanceof C17201l ? new b(next) : next;
        }

        public boolean hasNext() {
            return this.f143074a.hasNext();
        }

        public void remove() {
            this.f143074a.remove();
        }
    }

    public C17206q e() {
        return c(this.f143072e);
    }

    public boolean equals(Object obj) {
        return e().equals(obj);
    }

    public int hashCode() {
        return e().hashCode();
    }

    public String toString() {
        return e().toString();
    }
}
