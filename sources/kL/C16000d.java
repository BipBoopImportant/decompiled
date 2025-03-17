package KL;

import com.google.gson.JsonArray;

/* renamed from: KL.d  reason: case insensitive filesystem */
class C16000d {
    static JsonArray a(Float[] fArr) {
        if (fArr == null) {
            return null;
        }
        JsonArray jsonArray = new JsonArray();
        for (Float add : fArr) {
            jsonArray.add((Number) add);
        }
        return jsonArray;
    }

    static JsonArray b(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        JsonArray jsonArray = new JsonArray();
        for (String add : strArr) {
            jsonArray.add(add);
        }
        return jsonArray;
    }
}
