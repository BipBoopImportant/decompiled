package com.auth0.android.request.internal;

import YH.X;
import android.util.Base64;
import android.util.Log;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.l;
import com.optimizely.ab.config.FeatureVariable;
import java.lang.reflect.Type;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \r2\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/auth0/android/request/internal/JwksDeserializer;", "Lcom/google/gson/i;", "", "", "Ljava/security/PublicKey;", "<init>", "()V", "Lcom/google/gson/JsonElement;", "json", "Ljava/lang/reflect/Type;", "typeOfT", "Lcom/google/gson/h;", "context", "a", "(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/h;)Ljava/util/Map;", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class JwksDeserializer implements i<Map<String, ? extends PublicKey>> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f46413a = new a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/auth0/android/request/internal/JwksDeserializer$a;", "", "<init>", "()V", "", "RSA_ALGORITHM", "Ljava/lang/String;", "USE_SIGNING", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: a */
    public Map<String, PublicKey> deserialize(JsonElement jsonElement, Type type, h hVar) {
        Class<JwksDeserializer> cls = JwksDeserializer.class;
        C17542s.j(jsonElement, FeatureVariable.JSON_TYPE);
        C17542s.j(type, "typeOfT");
        C17542s.j(hVar, "context");
        if (!jsonElement.isJsonObject() || jsonElement.isJsonNull() || jsonElement.getAsJsonObject().entrySet().isEmpty()) {
            throw new l("jwks json must be a valid and non-empty json object");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<JsonElement> it = jsonElement.getAsJsonObject().getAsJsonArray("keys").iterator();
        while (it.hasNext()) {
            JsonObject asJsonObject = it.next().getAsJsonObject();
            Type type2 = String.class;
            String str = (String) hVar.a(asJsonObject.get("use"), type2);
            if (C17542s.e("RS256", (String) hVar.a(asJsonObject.get("alg"), type2)) && C17542s.e("sig", str)) {
                String str2 = (String) hVar.a(asJsonObject.get("kty"), type2);
                String str3 = (String) hVar.a(asJsonObject.get("kid"), type2);
                try {
                    PublicKey generatePublic = KeyFactory.getInstance(str2).generatePublic(new RSAPublicKeySpec(new BigInteger(1, Base64.decode((String) hVar.a(asJsonObject.get("n"), type2), 11)), new BigInteger(1, Base64.decode((String) hVar.a(asJsonObject.get("e"), type2), 11))));
                    C17542s.i(str3, "keyId");
                    C17542s.i(generatePublic, "pub");
                    linkedHashMap.put(str3, generatePublic);
                } catch (NoSuchAlgorithmException e10) {
                    String simpleName = cls.getSimpleName();
                    Log.e(simpleName, "Could not parse the JWK with ID " + str3, e10);
                } catch (InvalidKeySpecException e11) {
                    String simpleName2 = cls.getSimpleName();
                    Log.e(simpleName2, "Could not parse the JWK with ID " + str3, e11);
                }
            }
        }
        return X.x(linkedHashMap);
    }
}
