package androidx.camera.core.impl;

import android.util.ArrayMap;
import android.util.Pair;
import java.util.Map;
import java.util.Set;

public class g1 {

    /* renamed from: b  reason: collision with root package name */
    private static final g1 f16911b = new g1(new ArrayMap());

    /* renamed from: a  reason: collision with root package name */
    protected final Map<String, Object> f16912a;

    protected g1(Map<String, Object> map) {
        this.f16912a = map;
    }

    public static g1 a(Pair<String, Object> pair) {
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put((String) pair.first, pair.second);
        return new g1(arrayMap);
    }

    public static g1 b() {
        return f16911b;
    }

    public static g1 c(g1 g1Var) {
        ArrayMap arrayMap = new ArrayMap();
        for (String next : g1Var.e()) {
            arrayMap.put(next, g1Var.d(next));
        }
        return new g1(arrayMap);
    }

    public Object d(String str) {
        return this.f16912a.get(str);
    }

    public Set<String> e() {
        return this.f16912a.keySet();
    }

    public final String toString() {
        return "android.hardware.camera2.CaptureRequest.setTag.CX";
    }
}
