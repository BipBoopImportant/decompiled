package Y7;

import j0.C5445a;
import j0.b0;

public final class b<K, V> extends C5445a<K, V> {

    /* renamed from: g  reason: collision with root package name */
    private int f41001g;

    public void clear() {
        this.f41001g = 0;
        super.clear();
    }

    public int hashCode() {
        if (this.f41001g == 0) {
            this.f41001g = super.hashCode();
        }
        return this.f41001g;
    }

    public void i(b0<? extends K, ? extends V> b0Var) {
        this.f41001g = 0;
        super.i(b0Var);
    }

    public V k(int i10) {
        this.f41001g = 0;
        return super.k(i10);
    }

    public V l(int i10, V v10) {
        this.f41001g = 0;
        return super.l(i10, v10);
    }

    public V put(K k10, V v10) {
        this.f41001g = 0;
        return super.put(k10, v10);
    }
}
