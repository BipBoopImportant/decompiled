package ia;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

public abstract class P5 implements Map, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private transient Q5 f53385a;

    /* renamed from: b  reason: collision with root package name */
    private transient Q5 f53386b;

    /* renamed from: c  reason: collision with root package name */
    private transient M4 f53387c;

    P5() {
    }

    public static P5 c(Object obj, Object obj2) {
        C8287j3.a("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return X5.i(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, (O5) null);
    }

    /* access modifiers changed from: package-private */
    public abstract M4 a();

    /* renamed from: b */
    public final M4 values() {
        M4 m42 = this.f53387c;
        if (m42 != null) {
            return m42;
        }
        M4 a10 = a();
        this.f53387c = a10;
        return a10;
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    /* access modifiers changed from: package-private */
    public abstract Q5 d();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return entrySet().equals(((Map) obj).entrySet());
    }

    /* access modifiers changed from: package-private */
    public abstract Q5 f();

    public abstract Object get(Object obj);

    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    /* renamed from: h */
    public final Q5 entrySet() {
        Q5 q52 = this.f53385a;
        if (q52 != null) {
            return q52;
        }
        Q5 d10 = d();
        this.f53385a = d10;
        return d10;
    }

    public final int hashCode() {
        return C8227b.a(entrySet());
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final /* bridge */ /* synthetic */ Set keySet() {
        Q5 q52 = this.f53386b;
        if (q52 != null) {
            return q52;
        }
        Q5 f10 = f();
        this.f53386b = f10;
        return f10;
    }

    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        if (size >= 0) {
            StringBuilder sb2 = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824));
            sb2.append('{');
            boolean z10 = true;
            for (Map.Entry entry : entrySet()) {
                if (!z10) {
                    sb2.append(", ");
                }
                sb2.append(entry.getKey());
                sb2.append('=');
                sb2.append(entry.getValue());
                z10 = false;
            }
            sb2.append('}');
            return sb2.toString();
        }
        throw new IllegalArgumentException("size cannot be negative but was: " + size);
    }
}
