package com.google.android.gms.internal.clearcut;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class G0<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: b  reason: collision with root package name */
    private static final G0 f48193b;

    /* renamed from: a  reason: collision with root package name */
    private boolean f48194a = true;

    static {
        G0 g02 = new G0();
        f48193b = g02;
        g02.f48194a = false;
    }

    private G0() {
    }

    public static <K, V> G0<K, V> c() {
        return f48193b;
    }

    private final void f() {
        if (!this.f48194a) {
            throw new UnsupportedOperationException();
        }
    }

    private static int k(Object obj) {
        if (obj instanceof byte[]) {
            return C7192i0.b((byte[]) obj);
        }
        if (!(obj instanceof C7195j0)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    public final boolean a() {
        return this.f48194a;
    }

    public final void b(G0<K, V> g02) {
        f();
        if (!g02.isEmpty()) {
            putAll(g02);
        }
    }

    public final void clear() {
        f();
        super.clear();
    }

    public final G0<K, V> d() {
        return isEmpty() ? new G0<>() : new G0<>(this);
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L_0x005d
            java.util.Map r7 = (java.util.Map) r7
            r0 = 1
            if (r6 == r7) goto L_0x0059
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L_0x0016
        L_0x0014:
            r7 = r1
            goto L_0x005a
        L_0x0016:
            java.util.Set r2 = r6.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x001e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0059
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r7.containsKey(r4)
            if (r4 != 0) goto L_0x0035
            goto L_0x0014
        L_0x0035:
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r7.get(r3)
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L_0x0052
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L_0x0052
            byte[] r4 = (byte[]) r4
            byte[] r3 = (byte[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L_0x0056
        L_0x0052:
            boolean r3 = r4.equals(r3)
        L_0x0056:
            if (r3 != 0) goto L_0x001e
            goto L_0x0014
        L_0x0059:
            r7 = r0
        L_0x005a:
            if (r7 == 0) goto L_0x005d
            return r0
        L_0x005d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.G0.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i10 = 0;
        for (Map.Entry entry : entrySet()) {
            i10 += k(entry.getValue()) ^ k(entry.getKey());
        }
        return i10;
    }

    public final void l() {
        this.f48194a = false;
    }

    public final V put(K k10, V v10) {
        f();
        C7192i0.a(k10);
        C7192i0.a(v10);
        return super.put(k10, v10);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        f();
        for (Object next : map.keySet()) {
            C7192i0.a(next);
            C7192i0.a(map.get(next));
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        f();
        return super.remove(obj);
    }

    private G0(Map<K, V> map) {
        super(map);
    }
}
