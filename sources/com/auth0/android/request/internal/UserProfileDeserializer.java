package com.auth0.android.request.internal;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.l;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.List;
import java.util.Map;
import x7.C8956a;

class UserProfileDeserializer implements i<C8956a> {

    /* renamed from: a  reason: collision with root package name */
    private final Gson f46430a = new Gson();

    /* renamed from: a */
    public C8956a deserialize(JsonElement jsonElement, Type type, h hVar) {
        h hVar2 = hVar;
        if (!jsonElement.isJsonObject() || jsonElement.isJsonNull() || jsonElement.getAsJsonObject().entrySet().isEmpty()) {
            throw new l("user profile json is not a valid json object");
        }
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        Type type2 = String.class;
        String str = (String) hVar2.a(asJsonObject.remove("user_id"), type2);
        String str2 = (String) hVar2.a(asJsonObject.remove("name"), type2);
        String str3 = (String) hVar2.a(asJsonObject.remove("nickname"), type2);
        String str4 = (String) hVar2.a(asJsonObject.remove("picture"), type2);
        String str5 = (String) hVar2.a(asJsonObject.remove("email"), type2);
        String str6 = (String) hVar2.a(asJsonObject.remove("given_name"), type2);
        String str7 = (String) hVar2.a(asJsonObject.remove("family_name"), type2);
        Boolean bool = asJsonObject.has("email_verified") ? (Boolean) hVar2.a(asJsonObject.remove("email_verified"), Boolean.class) : Boolean.FALSE;
        Type type3 = new TypeToken<List<Object>>() {
        }.getType();
        Type type4 = new TypeToken<Map<String, Object>>() {
        }.getType();
        return new C8956a(str, str2, str3, str4, str5, bool, str7, (Date) this.f46430a.i(asJsonObject.remove("created_at"), Date.class), (List) hVar2.a(asJsonObject.remove("identities"), type3), (Map) hVar2.a(asJsonObject, type4), (Map) hVar2.a(asJsonObject.remove("user_metadata"), type4), (Map) hVar2.a(asJsonObject.remove("app_metadata"), type4), str6);
    }
}
