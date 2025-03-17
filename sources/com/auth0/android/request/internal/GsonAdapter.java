package com.auth0.android.request.internal;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import java.io.Reader;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w7.C8931d;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u0014*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0015B\u0017\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006B!\b\u0010\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0005\u0010\u000bB!\b\u0010\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0005\u0010\u000eJ\u0017\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/auth0/android/request/internal/GsonAdapter;", "T", "Lw7/d;", "Lcom/google/gson/TypeAdapter;", "adapter", "<init>", "(Lcom/google/gson/TypeAdapter;)V", "Ljava/lang/Class;", "tClass", "Lcom/google/gson/Gson;", "gson", "(Ljava/lang/Class;Lcom/google/gson/Gson;)V", "Lcom/google/gson/reflect/TypeToken;", "tTypeToken", "(Lcom/google/gson/reflect/TypeToken;Lcom/google/gson/Gson;)V", "Ljava/io/Reader;", "reader", "a", "(Ljava/io/Reader;)Ljava/lang/Object;", "Lcom/google/gson/TypeAdapter;", "b", "Companion", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GsonAdapter<T> implements C8931d<T> {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f46409b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final TypeAdapter<T> f46410a;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00070\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ=\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00010\u00070\u0006\"\u0004\b\u0001\u0010\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\f2\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/auth0/android/request/internal/GsonAdapter$Companion;", "", "<init>", "()V", "Lcom/google/gson/Gson;", "gson", "Lcom/auth0/android/request/internal/GsonAdapter;", "", "", "a", "(Lcom/google/gson/Gson;)Lcom/auth0/android/request/internal/GsonAdapter;", "T", "Ljava/lang/Class;", "tClass", "b", "(Ljava/lang/Class;Lcom/google/gson/Gson;)Lcom/auth0/android/request/internal/GsonAdapter;", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final GsonAdapter<Map<String, Object>> a(Gson gson) {
            C17542s.j(gson, "gson");
            return new GsonAdapter<>(new GsonAdapter$Companion$forMap$1(), gson);
        }

        public final <T> GsonAdapter<Map<String, T>> b(Class<T> cls, Gson gson) {
            C17542s.j(cls, "tClass");
            C17542s.j(gson, "gson");
            TypeToken<?> parameterized = TypeToken.getParameterized(Map.class, String.class, cls);
            C17542s.h(parameterized, "null cannot be cast to non-null type com.google.gson.reflect.TypeToken<kotlin.collections.Map<kotlin.String, T of com.auth0.android.request.internal.GsonAdapter.Companion.forMapOf>>");
            return new GsonAdapter<>(parameterized, gson);
        }

        private Companion() {
        }
    }

    private GsonAdapter(TypeAdapter<T> typeAdapter) {
        this.f46410a = typeAdapter;
    }

    public T a(Reader reader) {
        C17542s.j(reader, "reader");
        return this.f46410a.fromJson(reader);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GsonAdapter(java.lang.Class<T> r2, com.google.gson.Gson r3) {
        /*
            r1 = this;
            java.lang.String r0 = "tClass"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            java.lang.String r0 = "gson"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            com.google.gson.TypeAdapter r2 = r3.q(r2)
            java.lang.String r3 = "gson.getAdapter(tClass)"
            kotlin.jvm.internal.C17542s.i(r2, r3)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.auth0.android.request.internal.GsonAdapter.<init>(java.lang.Class, com.google.gson.Gson):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GsonAdapter(com.google.gson.reflect.TypeToken<T> r2, com.google.gson.Gson r3) {
        /*
            r1 = this;
            java.lang.String r0 = "tTypeToken"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            java.lang.String r0 = "gson"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            com.google.gson.TypeAdapter r2 = r3.p(r2)
            java.lang.String r3 = "gson.getAdapter(tTypeToken)"
            kotlin.jvm.internal.C17542s.i(r2, r3)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.auth0.android.request.internal.GsonAdapter.<init>(com.google.gson.reflect.TypeToken, com.google.gson.Gson):void");
    }
}
