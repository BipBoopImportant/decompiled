package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.Map;

public class D extends E {

    /* renamed from: f  reason: collision with root package name */
    private final S f67914f;

    static class b<K> implements Map.Entry<K, Object> {

        /* renamed from: a  reason: collision with root package name */
        private Map.Entry<K, D> f67915a;

        public D a() {
            return this.f67915a.getValue();
        }

        public K getKey() {
            return this.f67915a.getKey();
        }

        public Object getValue() {
            D value = this.f67915a.getValue();
            if (value == null) {
                return null;
            }
            return value.f();
        }

        public Object setValue(Object obj) {
            if (obj instanceof S) {
                return this.f67915a.getValue().d((S) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        private b(Map.Entry<K, D> entry) {
            this.f67915a = entry;
        }
    }

    static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: a  reason: collision with root package name */
        private Iterator<Map.Entry<K, Object>> f67916a;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f67916a = it;
        }

        /* renamed from: a */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f67916a.next();
            return next.getValue() instanceof D ? new b(next) : next;
        }

        public boolean hasNext() {
            return this.f67916a.hasNext();
        }

        public void remove() {
            this.f67916a.remove();
        }
    }

    public boolean equals(Object obj) {
        return f().equals(obj);
    }

    public S f() {
        return c(this.f67914f);
    }

    public int hashCode() {
        return f().hashCode();
    }

    public String toString() {
        return f().toString();
    }
}
