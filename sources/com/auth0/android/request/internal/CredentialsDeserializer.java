package com.auth0.android.request.internal;

import com.auth0.android.result.Credentials;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.l;
import com.optimizely.ab.config.FeatureVariable;
import java.lang.reflect.Type;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\b\u0010\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJM\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\rH\u0017¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188WX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/auth0/android/request/internal/CredentialsDeserializer;", "Lcom/google/gson/i;", "Lcom/auth0/android/result/Credentials;", "<init>", "()V", "Lcom/google/gson/JsonElement;", "json", "Ljava/lang/reflect/Type;", "typeOfT", "Lcom/google/gson/h;", "context", "b", "(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/h;)Lcom/auth0/android/result/Credentials;", "", "idToken", "accessToken", "type", "refreshToken", "Ljava/util/Date;", "expiresAt", "scope", "recoveryCode", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;)Lcom/auth0/android/result/Credentials;", "", "c", "()J", "currentTimeInMillis", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class CredentialsDeserializer implements i<Credentials> {
    public Credentials a(String str, String str2, String str3, String str4, Date date, String str5, String str6) {
        C17542s.j(str, "idToken");
        C17542s.j(str2, "accessToken");
        C17542s.j(str3, "type");
        C17542s.j(date, "expiresAt");
        Credentials credentials = new Credentials(str, str2, str3, str4, date, str5);
        credentials.e(str6);
        return credentials;
    }

    /* renamed from: b */
    public Credentials deserialize(JsonElement jsonElement, Type type, h hVar) {
        C17542s.j(jsonElement, FeatureVariable.JSON_TYPE);
        C17542s.j(type, "typeOfT");
        C17542s.j(hVar, "context");
        if (!jsonElement.isJsonObject() || jsonElement.isJsonNull() || jsonElement.getAsJsonObject().entrySet().isEmpty()) {
            throw new l("credentials json is not a valid json object");
        }
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        Type type2 = String.class;
        String str = (String) hVar.a(asJsonObject.remove("id_token"), type2);
        String str2 = (String) hVar.a(asJsonObject.remove("access_token"), type2);
        String str3 = (String) hVar.a(asJsonObject.remove("token_type"), type2);
        String str4 = (String) hVar.a(asJsonObject.remove("refresh_token"), type2);
        Long l10 = (Long) hVar.a(asJsonObject.remove("expires_in"), Long.TYPE);
        String str5 = (String) hVar.a(asJsonObject.remove("scope"), type2);
        String str6 = (String) hVar.a(asJsonObject.remove("recovery_code"), type2);
        Date date = (Date) hVar.a(asJsonObject.remove("expires_at"), Date.class);
        if (date == null && l10 != null) {
            date = new Date(c() + (l10.longValue() * ((long) 1000)));
        }
        Date date2 = date;
        C17542s.i(str, "idToken");
        C17542s.i(str2, "accessToken");
        C17542s.i(str3, "type");
        C17542s.i(date2, "expiresAt");
        return a(str, str2, str3, str4, date2, str5, str6);
    }

    public long c() {
        return System.currentTimeMillis();
    }
}
