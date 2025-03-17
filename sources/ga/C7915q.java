package ga;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* renamed from: ga.q  reason: case insensitive filesystem */
public abstract class C7915q implements Map, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private transient r f51408a;

    /* renamed from: b  reason: collision with root package name */
    private transient r f51409b;

    /* renamed from: c  reason: collision with root package name */
    private transient C7909k f51410c;

    C7915q() {
    }

    public static C7915q c(Object obj, Object obj2) {
        C7905g.a("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return C7922y.i(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, (C7914p) null);
    }

    /* access modifiers changed from: package-private */
    public abstract C7909k a();

    /* renamed from: b */
    public final C7909k values() {
        C7909k kVar = this.f51410c;
        if (kVar != null) {
            return kVar;
        }
        C7909k a10 = a();
        this.f51410c = a10;
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
    public abstract r d();

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
    public abstract r f();

    public abstract Object get(Object obj);

    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    /* renamed from: h */
    public final r entrySet() {
        r rVar = this.f51408a;
        if (rVar != null) {
            return rVar;
        }
        r d10 = d();
        this.f51408a = d10;
        return d10;
    }

    public final int hashCode() {
        return C7923z.a(entrySet());
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final /* bridge */ /* synthetic */ Set keySet() {
        r rVar = this.f51409b;
        if (rVar != null) {
            return rVar;
        }
        r f10 = f();
        this.f51409b = f10;
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
