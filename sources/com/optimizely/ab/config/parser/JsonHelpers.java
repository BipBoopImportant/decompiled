package com.optimizely.ab.config.parser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

final class JsonHelpers {
    JsonHelpers() {
    }

    static Object convertToJsonObject(Object obj) {
        if (obj instanceof Map) {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                jSONObject.put(entry.getKey().toString(), convertToJsonObject(entry.getValue()));
            }
            return jSONObject;
        } else if (!(obj instanceof List)) {
            return obj;
        } else {
            JSONArray jSONArray = new JSONArray();
            for (Object convertToJsonObject : (List) obj) {
                jSONArray.put(convertToJsonObject(convertToJsonObject));
            }
            return jSONArray;
        }
    }

    static List<Object> jsonArrayToList(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        Iterator it = jSONArray.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof JSONArray) {
                next = jsonArrayToList((JSONArray) next);
            } else if (next instanceof JSONObject) {
                next = jsonObjectToMap((JSONObject) next);
            }
            arrayList.add(next);
        }
        return arrayList;
    }

    static Map<String, Object> jsonObjectToMap(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = jsonArrayToList((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = jsonObjectToMap((JSONObject) obj);
            }
            hashMap.put(next, obj);
        }
        return hashMap;
    }
}
