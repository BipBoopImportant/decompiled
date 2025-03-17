package com.optimizely.ab.bucketing;

import java.util.HashMap;
import java.util.Map;

public class f {
    public static d a(Map<String, Object> map) {
        String str = (String) map.get("user_id");
        Map map2 = (Map) map.get("experiment_bucket_map");
        HashMap hashMap = new HashMap(map2.size());
        for (Map.Entry entry : map2.entrySet()) {
            hashMap.put(entry.getKey(), new b((String) ((Map) entry.getValue()).get("variation_id")));
        }
        return new d(str, hashMap);
    }

    public static boolean b(Map<String, Object> map) {
        if (!map.containsKey("user_id") || !map.containsKey("experiment_bucket_map") || !(map.get("experiment_bucket_map") instanceof Map)) {
            return false;
        }
        try {
            for (Map containsKey : ((Map) map.get("experiment_bucket_map")).values()) {
                if (!containsKey.containsKey("variation_id")) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }
}
