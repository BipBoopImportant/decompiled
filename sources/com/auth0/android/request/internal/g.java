package com.auth0.android.request.internal;

import com.auth0.android.result.Credentials;
import com.google.gson.Gson;
import com.google.gson.f;
import com.google.gson.reflect.TypeToken;
import java.security.PublicKey;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import x7.C8956a;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/auth0/android/request/internal/g;", "", "<init>", "()V", "Lcom/google/gson/Gson;", "b", "Lcom/google/gson/Gson;", "a", "()Lcom/google/gson/Gson;", "gson", "Ljava/text/SimpleDateFormat;", "c", "Ljava/text/SimpleDateFormat;", "sdf", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f46454a = new g();

    /* renamed from: b  reason: collision with root package name */
    private static final Gson f46455b;

    /* renamed from: c  reason: collision with root package name */
    private static SimpleDateFormat f46456c = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);

    static {
        Class<Credentials> cls = Credentials.class;
        Gson b10 = new f().e(new JsonRequiredTypeAdapterFactory()).d(C8956a.class, new UserProfileDeserializer()).d(cls, new CredentialsDeserializer()).d(TypeToken.getParameterized(Map.class, String.class, PublicKey.class).getType(), new JwksDeserializer()).f("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").b();
        C17542s.i(b10, "GsonBuilder()\n          …AT)\n            .create()");
        f46455b = b10;
    }

    private g() {
    }

    public final Gson a() {
        return f46455b;
    }
}
