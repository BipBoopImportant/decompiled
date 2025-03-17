package Zc;

import java.util.HashMap;
import java.util.Map;

/* renamed from: Zc.e  reason: case insensitive filesystem */
public abstract class C9396e<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final Map f65090a = new HashMap();

    /* access modifiers changed from: protected */
    public abstract V a(K k10);

    public V b(K k10) {
        synchronized (this.f65090a) {
            try {
                if (this.f65090a.containsKey(k10)) {
                    V v10 = this.f65090a.get(k10);
                    return v10;
                }
                V a10 = a(k10);
                this.f65090a.put(k10, a10);
                return a10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
