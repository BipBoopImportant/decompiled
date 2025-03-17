package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

public class D extends E {

    /* renamed from: f  reason: collision with root package name */
    private final S f69194f;

    static class b<K> implements Map.Entry<K, Object> {

        /* renamed from: a  reason: collision with root package name */
        private Map.Entry<K, D> f69195a;

        public D a() {
            return this.f69195a.getValue();
        }

        public K getKey() {
            return this.f69195a.getKey();
        }

        public Object getValue() {
            D value = this.f69195a.getValue();
            if (value == null) {
                return null;
            }
            return value.f();
        }

        public Object setValue(Object obj) {
            if (obj instanceof S) {
                return this.f69195a.getValue().d((S) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        private b(Map.Entry<K, D> entry) {
            this.f69195a = entry;
        }
    }

    static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: a  reason: collision with root package name */
        private Iterator<Map.Entry<K, Object>> f69196a;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f69196a = it;
        }

        /* renamed from: a */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f69196a.next();
            return next.getValue() instanceof D ? new b(next) : next;
        }

        public boolean hasNext() {
            return this.f69196a.hasNext();
        }

        public void remove() {
            this.f69196a.remove();
        }
    }

    public boolean equals(Object obj) {
        return f().equals(obj);
    }

    public S f() {
        return c(this.f69194f);
    }

    public int hashCode() {
        return f().hashCode();
    }

    public String toString() {
        return f().toString();
    }
}
