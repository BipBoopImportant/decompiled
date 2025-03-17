package androidx.camera.core.impl;

import android.util.ArrayMap;
import java.util.Map;

public class G0 extends g1 {
    private G0(Map<String, Object> map) {
        super(map);
    }

    public static G0 g() {
        return new G0(new ArrayMap());
    }

    public static G0 h(g1 g1Var) {
        ArrayMap arrayMap = new ArrayMap();
        for (String next : g1Var.e()) {
            arrayMap.put(next, g1Var.d(next));
        }
        return new G0(arrayMap);
    }

    public void f(g1 g1Var) {
        Map<String, Object> map;
        Map<String, Object> map2 = this.f16912a;
        if (map2 != null && (map = g1Var.f16912a) != null) {
            map2.putAll(map);
        }
    }

    public void i(String str, Object obj) {
        this.f16912a.put(str, obj);
    }
}
