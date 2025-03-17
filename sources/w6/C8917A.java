package w6;

import java.util.Arrays;

/* renamed from: w6.A  reason: case insensitive filesystem */
public final class C8917A<V> {

    /* renamed from: a  reason: collision with root package name */
    private final V f57201a;

    /* renamed from: b  reason: collision with root package name */
    private final Throwable f57202b;

    public C8917A(V v10) {
        this.f57201a = v10;
        this.f57202b = null;
    }

    public Throwable a() {
        return this.f57202b;
    }

    public V b() {
        return this.f57201a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8917A)) {
            return false;
        }
        C8917A a10 = (C8917A) obj;
        if (b() != null && b().equals(a10.b())) {
            return true;
        }
        if (a() == null || a10.a() == null) {
            return false;
        }
        return a().toString().equals(a().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{b(), a()});
    }

    public C8917A(Throwable th2) {
        this.f57202b = th2;
        this.f57201a = null;
    }
}
