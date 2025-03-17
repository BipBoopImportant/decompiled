package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C5172z;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class L<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: b  reason: collision with root package name */
    private static final L<?, ?> f21263b;

    /* renamed from: a  reason: collision with root package name */
    private boolean f21264a = true;

    static {
        L<?, ?> l10 = new L<>();
        f21263b = l10;
        l10.n();
    }

    private L() {
    }

    static <K, V> int a(Map<K, V> map) {
        int i10 = 0;
        for (Map.Entry next : map.entrySet()) {
            i10 += b(next.getValue()) ^ b(next.getKey());
        }
        return i10;
    }

    private static int b(Object obj) {
        if (obj instanceof byte[]) {
            return C5172z.d((byte[]) obj);
        }
        if (!(obj instanceof C5172z.c)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    private static void c(Map<?, ?> map) {
        for (Object next : map.keySet()) {
            C5172z.a(next);
            C5172z.a(map.get(next));
        }
    }

    public static <K, V> L<K, V> d() {
        return f21263b;
    }

    private void f() {
        if (!m()) {
            throw new UnsupportedOperationException();
        }
    }

    private static boolean k(Object obj, Object obj2) {
        return (!(obj instanceof byte[]) || !(obj2 instanceof byte[])) ? obj.equals(obj2) : Arrays.equals((byte[]) obj, (byte[]) obj2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <K, V> boolean l(java.util.Map<K, V> r4, java.util.Map<K, V> r5) {
        /*
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r4.size()
            int r2 = r5.size()
            r3 = 0
            if (r1 == r2) goto L_0x0010
            return r3
        L_0x0010:
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0018:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0042
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            boolean r2 = r5.containsKey(r2)
            if (r2 != 0) goto L_0x002f
            return r3
        L_0x002f:
            java.lang.Object r2 = r1.getValue()
            java.lang.Object r1 = r1.getKey()
            java.lang.Object r1 = r5.get(r1)
            boolean r1 = k(r2, r1)
            if (r1 != 0) goto L_0x0018
            return r3
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.L.l(java.util.Map, java.util.Map):boolean");
    }

    public void clear() {
        f();
        super.clear();
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Map) && l(this, (Map) obj);
    }

    public int hashCode() {
        return a(this);
    }

    public boolean m() {
        return this.f21264a;
    }

    public void n() {
        this.f21264a = false;
    }

    public void o(L<K, V> l10) {
        f();
        if (!l10.isEmpty()) {
            putAll(l10);
        }
    }

    public L<K, V> p() {
        return isEmpty() ? new L<>() : new L<>(this);
    }

    public V put(K k10, V v10) {
        f();
        C5172z.a(k10);
        C5172z.a(v10);
        return super.put(k10, v10);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        f();
        c(map);
        super.putAll(map);
    }

    public V remove(Object obj) {
        f();
        return super.remove(obj);
    }

    private L(Map<K, V> map) {
        super(map);
    }
}
