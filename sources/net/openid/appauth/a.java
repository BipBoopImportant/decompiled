package net.openid.appauth;

import AK.g;
import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

class a {
    static Set<String> a(String... strArr) {
        return (strArr == null || strArr.length == 0) ? Collections.emptySet() : Collections.unmodifiableSet(new HashSet(Arrays.asList(strArr)));
    }

    static Map<String, String> b(Map<String, String> map, Set<String> set) {
        if (map == null) {
            return Collections.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            String str2 = (String) next.getValue();
            g.e(str, "additional parameter keys cannot be null");
            g.e(str2, "additional parameter values cannot be null");
            g.b(!set.contains(str), "Parameter %s is directly supported via the authorization request builder, use the builder method instead", str);
            linkedHashMap.put(str, str2);
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    static Map<String, String> c(Uri uri, Set<String> set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String next : uri.getQueryParameterNames()) {
            if (!set.contains(next)) {
                linkedHashMap.put(next, uri.getQueryParameter(next));
            }
        }
        return linkedHashMap;
    }

    static Map<String, String> d(JSONObject jSONObject, Set<String> set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!set.contains(next)) {
                linkedHashMap.put(next, jSONObject.get(next).toString());
            }
        }
        return linkedHashMap;
    }
}
