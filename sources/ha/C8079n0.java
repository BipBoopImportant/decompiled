package ha;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* renamed from: ha.n0  reason: case insensitive filesystem */
public abstract class C8079n0 implements Map, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private transient C8089o0 f52663a;

    /* renamed from: b  reason: collision with root package name */
    private transient C8089o0 f52664b;

    /* renamed from: c  reason: collision with root package name */
    private transient C8009g0 f52665c;

    C8079n0() {
    }

    public static C8079n0 c(Object obj, Object obj2) {
        Q.b("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return F0.i(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, (C8069m0) null);
    }

    /* access modifiers changed from: package-private */
    public abstract C8009g0 a();

    /* renamed from: b */
    public final C8009g0 values() {
        C8009g0 g0Var = this.f52665c;
        if (g0Var != null) {
            return g0Var;
        }
        C8009g0 a10 = a();
        this.f52665c = a10;
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
    public abstract C8089o0 d();

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
    public abstract C8089o0 f();

    public abstract Object get(Object obj);

    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    /* renamed from: h */
    public final C8089o0 entrySet() {
        C8089o0 o0Var = this.f52663a;
        if (o0Var != null) {
            return o0Var;
        }
        C8089o0 d10 = d();
        this.f52663a = d10;
        return d10;
    }

    public final int hashCode() {
        return H0.a(entrySet());
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final /* bridge */ /* synthetic */ Set keySet() {
        C8089o0 o0Var = this.f52664b;
        if (o0Var != null) {
            return o0Var;
        }
        C8089o0 f10 = f();
        this.f52664b = f10;
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
        Q.a(size, "size");
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
}
