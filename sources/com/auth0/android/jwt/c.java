package com.auth0.android.jwt;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.p;
import java.lang.reflect.Array;

class c extends a {

    /* renamed from: a  reason: collision with root package name */
    private final JsonElement f46304a;

    c(JsonElement jsonElement) {
        this.f46304a = jsonElement;
    }

    public String a() {
        if (!this.f46304a.isJsonPrimitive()) {
            return null;
        }
        return this.f46304a.getAsString();
    }

    public <T> T[] b(Class<T> cls) {
        try {
            if (this.f46304a.isJsonArray()) {
                if (!this.f46304a.isJsonNull()) {
                    Gson gson = new Gson();
                    JsonArray asJsonArray = this.f46304a.getAsJsonArray();
                    T[] tArr = (Object[]) Array.newInstance(cls, asJsonArray.size());
                    for (int i10 = 0; i10 < asJsonArray.size(); i10++) {
                        tArr[i10] = gson.i(asJsonArray.get(i10), cls);
                    }
                    return tArr;
                }
            }
            return (Object[]) Array.newInstance(cls, 0);
        } catch (p e10) {
            throw new d("Failed to decode claim as array", e10);
        }
    }
}
