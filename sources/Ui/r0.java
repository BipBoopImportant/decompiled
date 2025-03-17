package UI;

import YH.X;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C17542s;

public final class r0 {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Integer, C16587h> f139070a;

    public r0(Map<Integer, C16587h> map) {
        C17542s.j(map, "map");
        this.f139070a = map;
    }

    public final r0 a() {
        Map<Integer, C16587h> map = this.f139070a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(X.e(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), C16587h.c((C16587h) entry.getValue(), (C16590k) null, (C16588i) null, false, true, 7, (Object) null));
        }
        return new r0(linkedHashMap);
    }

    public final Map<Integer, C16587h> b() {
        return this.f139070a;
    }
}
