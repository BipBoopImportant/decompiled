package kK;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0001¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000e¨\u0006\u0010"}, d2 = {"LkK/C;", "", "<init>", "()V", "", "key", "Lkotlinx/serialization/json/JsonElement;", "element", "b", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;", "Lkotlinx/serialization/json/JsonObject;", "a", "()Lkotlinx/serialization/json/JsonObject;", "", "Ljava/util/Map;", "content", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: kK.C  reason: case insensitive filesystem */
public final class C17509C {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, JsonElement> f144271a = new LinkedHashMap();

    public final JsonObject a() {
        return new JsonObject(this.f144271a);
    }

    public final JsonElement b(String str, JsonElement jsonElement) {
        C17542s.j(str, "key");
        C17542s.j(jsonElement, "element");
        return this.f144271a.put(str, jsonElement);
    }
}
