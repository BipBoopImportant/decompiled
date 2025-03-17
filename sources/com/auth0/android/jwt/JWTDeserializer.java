package com.auth0.android.jwt;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.h;
import com.google.gson.i;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class JWTDeserializer implements i<e> {
    JWTDeserializer() {
    }

    private Date b(JsonObject jsonObject, String str) {
        if (!jsonObject.has(str)) {
            return null;
        }
        return new Date(jsonObject.get(str).getAsLong() * 1000);
    }

    private String c(JsonObject jsonObject, String str) {
        if (!jsonObject.has(str)) {
            return null;
        }
        return jsonObject.get(str).getAsString();
    }

    private List<String> d(JsonObject jsonObject, String str) {
        List<String> emptyList = Collections.emptyList();
        if (!jsonObject.has(str)) {
            return emptyList;
        }
        JsonElement jsonElement = jsonObject.get(str);
        if (!jsonElement.isJsonArray()) {
            return Collections.singletonList(jsonElement.getAsString());
        }
        JsonArray asJsonArray = jsonElement.getAsJsonArray();
        ArrayList arrayList = new ArrayList(asJsonArray.size());
        for (int i10 = 0; i10 < asJsonArray.size(); i10++) {
            arrayList.add(asJsonArray.get(i10).getAsString());
        }
        return arrayList;
    }

    /* renamed from: a */
    public e deserialize(JsonElement jsonElement, Type type, h hVar) {
        if (jsonElement.isJsonNull() || !jsonElement.isJsonObject()) {
            throw new d("The token's payload had an invalid JSON format.");
        }
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        String c10 = c(asJsonObject, "iss");
        String c11 = c(asJsonObject, "sub");
        Date b10 = b(asJsonObject, "exp");
        Date b11 = b(asJsonObject, "nbf");
        Date b12 = b(asJsonObject, "iat");
        String c12 = c(asJsonObject, "jti");
        List<String> d10 = d(asJsonObject, "aud");
        HashMap hashMap = new HashMap();
        for (Map.Entry next : asJsonObject.entrySet()) {
            hashMap.put(next.getKey(), new c((JsonElement) next.getValue()));
        }
        return new e(c10, c11, b10, b11, b12, c12, d10, hashMap);
    }
}
