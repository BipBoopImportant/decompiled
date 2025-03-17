package a9;

import java.util.LinkedHashMap;
import java.util.Map;
import kK.j;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;

public final class Y6 {
    public static final JsonElement a(Object obj) {
        String obj2;
        if (obj == null) {
            return JsonNull.INSTANCE;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            C17542s.j(map, "<this>");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                C17542s.h(key, "null cannot be cast to non-null type kotlin.String");
                String str = (String) key;
                linkedHashMap.put(key, a(value));
            }
            return new JsonObject(linkedHashMap);
        } else if (obj instanceof Boolean) {
            return j.a((Boolean) obj);
        } else {
            if (obj instanceof Number) {
                return j.b((Number) obj);
            }
            if (obj instanceof String) {
                obj2 = (String) obj;
            } else if (obj instanceof Enum) {
                obj2 = obj.toString();
            } else {
                throw new IllegalStateException("Can't serialize unknown type: " + obj);
            }
            return j.c(obj2);
        }
    }
}
