package zE;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: zE.c  reason: case insensitive filesystem */
public class C15339c {
    public static Map<String, Map<String, Object>> a(JSONObject jSONObject) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
            ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
            JSONObject jSONObject3 = jSONObject2.getJSONObject("experiment_bucket_map");
            Iterator<String> keys2 = jSONObject3.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                String string = jSONObject3.getJSONObject(next2).getString("variation_id");
                ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap();
                concurrentHashMap3.put("variation_id", string);
                concurrentHashMap2.put(next2, concurrentHashMap3);
            }
            ConcurrentHashMap concurrentHashMap4 = new ConcurrentHashMap();
            concurrentHashMap4.put("user_id", next);
            concurrentHashMap4.put("experiment_bucket_map", concurrentHashMap2);
            concurrentHashMap.put(next, concurrentHashMap4);
        }
        return concurrentHashMap;
    }

    public static JSONObject b(Map<String, Map<String, Object>> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Map<String, Object>> value : map.entrySet()) {
            Map map2 = (Map) value.getValue();
            String str = (String) map2.get("user_id");
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry entry : ((Map) map2.get("experiment_bucket_map")).entrySet()) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("variation_id", ((Map) entry.getValue()).get("variation_id"));
                jSONObject2.put((String) entry.getKey(), jSONObject3);
            }
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("user_id", str);
            jSONObject4.put("experiment_bucket_map", jSONObject2);
            jSONObject.put(str, jSONObject4);
        }
        return jSONObject;
    }
}
