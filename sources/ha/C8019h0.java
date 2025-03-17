package ha;

import java.io.Serializable;

/* renamed from: ha.h0  reason: case insensitive filesystem */
final class C8019h0 extends L implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    final Object f52551a;

    /* renamed from: b  reason: collision with root package name */
    final Object f52552b;

    C8019h0(Object obj, Object obj2) {
        this.f52551a = obj;
        this.f52552b = obj2;
    }

    public final Object getKey() {
        return this.f52551a;
    }

    public final Object getValue() {
        return this.f52552b;
    }

    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
