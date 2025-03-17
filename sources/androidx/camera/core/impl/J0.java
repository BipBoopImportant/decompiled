package androidx.camera.core.impl;

import android.util.ArrayMap;
import androidx.camera.core.impl.X;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class J0 implements X {

    /* renamed from: J  reason: collision with root package name */
    protected static final Comparator<X.a<?>> f16737J;

    /* renamed from: K  reason: collision with root package name */
    private static final J0 f16738K;

    /* renamed from: I  reason: collision with root package name */
    protected final TreeMap<X.a<?>, Map<X.c, Object>> f16739I;

    static {
        I0 i02 = new I0();
        f16737J = i02;
        f16738K = new J0(new TreeMap(i02));
    }

    J0(TreeMap<X.a<?>, Map<X.c, Object>> treeMap) {
        this.f16739I = treeMap;
    }

    public static J0 Y() {
        return f16738K;
    }

    public static J0 Z(X x10) {
        if (J0.class.equals(x10.getClass())) {
            return (J0) x10;
        }
        TreeMap treeMap = new TreeMap(f16737J);
        for (X.a next : x10.e()) {
            Set<X.c> f10 = x10.f(next);
            ArrayMap arrayMap = new ArrayMap();
            for (X.c next2 : f10) {
                arrayMap.put(next2, x10.d(next, next2));
            }
            treeMap.put(next, arrayMap);
        }
        return new J0(treeMap);
    }

    public <ValueT> ValueT a(X.a<ValueT> aVar) {
        Map map = this.f16739I.get(aVar);
        if (map != null) {
            return map.get((X.c) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }

    public boolean b(X.a<?> aVar) {
        return this.f16739I.containsKey(aVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(java.lang.String r4, androidx.camera.core.impl.X.b r5) {
        /*
            r3 = this;
            java.lang.Class<java.lang.Void> r0 = java.lang.Void.class
            androidx.camera.core.impl.X$a r0 = androidx.camera.core.impl.X.a.a(r4, r0)
            java.util.TreeMap<androidx.camera.core.impl.X$a<?>, java.util.Map<androidx.camera.core.impl.X$c, java.lang.Object>> r1 = r3.f16739I
            java.util.SortedMap r0 = r1.tailMap(r0)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0014:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x003d
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            androidx.camera.core.impl.X$a r2 = (androidx.camera.core.impl.X.a) r2
            java.lang.String r2 = r2.c()
            boolean r2 = r2.startsWith(r4)
            if (r2 != 0) goto L_0x0031
            goto L_0x003d
        L_0x0031:
            java.lang.Object r1 = r1.getKey()
            androidx.camera.core.impl.X$a r1 = (androidx.camera.core.impl.X.a) r1
            boolean r1 = r5.a(r1)
            if (r1 != 0) goto L_0x0014
        L_0x003d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.J0.c(java.lang.String, androidx.camera.core.impl.X$b):void");
    }

    public <ValueT> ValueT d(X.a<ValueT> aVar, X.c cVar) {
        Map map = this.f16739I.get(aVar);
        if (map == null) {
            throw new IllegalArgumentException("Option does not exist: " + aVar);
        } else if (map.containsKey(cVar)) {
            return map.get(cVar);
        } else {
            throw new IllegalArgumentException("Option does not exist: " + aVar + " with priority=" + cVar);
        }
    }

    public Set<X.a<?>> e() {
        return Collections.unmodifiableSet(this.f16739I.keySet());
    }

    public Set<X.c> f(X.a<?> aVar) {
        Map map = this.f16739I.get(aVar);
        return map == null ? Collections.emptySet() : Collections.unmodifiableSet(map.keySet());
    }

    public <ValueT> ValueT g(X.a<ValueT> aVar, ValueT valuet) {
        try {
            return a(aVar);
        } catch (IllegalArgumentException unused) {
            return valuet;
        }
    }

    public X.c h(X.a<?> aVar) {
        Map map = this.f16739I.get(aVar);
        if (map != null) {
            return (X.c) Collections.min(map.keySet());
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }
}
