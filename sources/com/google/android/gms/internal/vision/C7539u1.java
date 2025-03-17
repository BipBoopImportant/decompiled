package com.google.android.gms.internal.vision;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.vision.u1  reason: case insensitive filesystem */
public final class C7539u1<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: b  reason: collision with root package name */
    private static final C7539u1 f49401b;

    /* renamed from: a  reason: collision with root package name */
    private boolean f49402a = true;

    static {
        C7539u1 u1Var = new C7539u1();
        f49401b = u1Var;
        u1Var.f49402a = false;
    }

    private C7539u1() {
    }

    private static int a(Object obj) {
        if (obj instanceof byte[]) {
            return U0.j((byte[]) obj);
        }
        if (!(obj instanceof T0)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    public static <K, V> C7539u1<K, V> b() {
        return f49401b;
    }

    private final void l() {
        if (!this.f49402a) {
            throw new UnsupportedOperationException();
        }
    }

    public final void c(C7539u1<K, V> u1Var) {
        l();
        if (!u1Var.isEmpty()) {
            putAll(u1Var);
        }
    }

    public final void clear() {
        l();
        super.clear();
    }

    public final C7539u1<K, V> d() {
        return isEmpty() ? new C7539u1<>() : new C7539u1<>(this);
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C7539u1.equals(java.lang.Object):boolean");
    }

    public final void f() {
        this.f49402a = false;
    }

    public final int hashCode() {
        int i10 = 0;
        for (Map.Entry entry : entrySet()) {
            i10 += a(entry.getValue()) ^ a(entry.getKey());
        }
        return i10;
    }

    public final boolean k() {
        return this.f49402a;
    }

    public final V put(K k10, V v10) {
        l();
        U0.d(k10);
        U0.d(v10);
        return super.put(k10, v10);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        l();
        for (Object next : map.keySet()) {
            U0.d(next);
            U0.d(map.get(next));
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        l();
        return super.remove(obj);
    }

    private C7539u1(Map<K, V> map) {
        super(map);
    }
}
