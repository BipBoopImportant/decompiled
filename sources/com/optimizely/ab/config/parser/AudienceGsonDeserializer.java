package com.optimizely.ab.config.parser;

import FE.C12870b;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.m;
import com.optimizely.ab.config.audience.Audience;
import com.optimizely.ab.config.audience.Condition;
import com.optimizely.ab.config.audience.UserAttribute;
import java.lang.reflect.Type;
import java.util.List;

public class AudienceGsonDeserializer implements i<Audience> {
    public Audience deserialize(JsonElement jsonElement, Type type, h hVar) {
        Condition condition;
        Gson gson = new Gson();
        m mVar = new m();
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        String asString = asJsonObject.get("id").getAsString();
        String asString2 = asJsonObject.get("name").getAsString();
        JsonElement jsonElement2 = asJsonObject.get("conditions");
        if (!type.toString().contains("TypedAudience")) {
            jsonElement2 = mVar.a(asJsonObject.get("conditions").getAsString());
        }
        Class<UserAttribute> cls = UserAttribute.class;
        if (jsonElement2.isJsonArray()) {
            condition = C12870b.d(cls, (List) gson.i(jsonElement2, List.class));
        } else {
            condition = jsonElement2.isJsonObject() ? C12870b.c(cls, gson.i(jsonElement2, Object.class)) : null;
        }
        return new Audience(asString, asString2, condition);
    }
}
