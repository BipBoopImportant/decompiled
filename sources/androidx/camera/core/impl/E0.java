package androidx.camera.core.impl;

import android.util.ArrayMap;
import androidx.camera.core.impl.X;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

public final class E0 extends J0 implements D0 {

    /* renamed from: L  reason: collision with root package name */
    private static final X.c f16733L = X.c.OPTIONAL;

    private E0(TreeMap<X.a<?>, Map<X.c, Object>> treeMap) {
        super(treeMap);
    }

    public static E0 b0() {
        return new E0(new TreeMap(J0.f16737J));
    }

    public static E0 c0(X x10) {
        TreeMap treeMap = new TreeMap(J0.f16737J);
        for (X.a next : x10.e()) {
            Set<X.c> f10 = x10.f(next);
            ArrayMap arrayMap = new ArrayMap();
            for (X.c next2 : f10) {
                arrayMap.put(next2, x10.d(next, next2));
            }
            treeMap.put(next, arrayMap);
        }
        return new E0(treeMap);
    }

    public <ValueT> ValueT d0(X.a<ValueT> aVar) {
        return this.f16739I.remove(aVar);
    }

    public <ValueT> void o(X.a<ValueT> aVar, X.c cVar, ValueT valuet) {
        Map map = this.f16739I.get(aVar);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            this.f16739I.put(aVar, arrayMap);
            arrayMap.put(cVar, valuet);
            return;
        }
        X.c cVar2 = (X.c) Collections.min(map.keySet());
        if (Objects.equals(map.get(cVar2), valuet) || !X.z(cVar2, cVar)) {
            map.put(cVar, valuet);
            return;
        }
        throw new IllegalArgumentException("Option values conflicts: " + aVar.c() + ", existing value (" + cVar2 + ")=" + map.get(cVar2) + ", conflicting (" + cVar + ")=" + valuet);
    }

    public <ValueT> void q(X.a<ValueT> aVar, ValueT valuet) {
        o(aVar, f16733L, valuet);
    }
}
