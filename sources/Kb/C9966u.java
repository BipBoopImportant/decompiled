package kb;

import java.io.Serializable;

/* renamed from: kb.u  reason: case insensitive filesystem */
class C9966u<K, V> extends C9950e<K, V> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    final K f75005a;

    /* renamed from: b  reason: collision with root package name */
    final V f75006b;

    C9966u(K k10, V v10) {
        this.f75005a = k10;
        this.f75006b = v10;
    }

    public final K getKey() {
        return this.f75005a;
    }

    public final V getValue() {
        return this.f75006b;
    }

    public final V setValue(V v10) {
        throw new UnsupportedOperationException();
    }
}
