package a9;

import kotlin.jvm.internal.C17542s;
import org.json.JSONObject;

/* renamed from: a9.j5  reason: case insensitive filesystem */
public final class C6859j5 {

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f42638a;

    public C6859j5(JSONObject jSONObject, long j10, long j11, String str) {
        C17542s.j(jSONObject, "content");
        C17542s.j(str, "reportType");
        this.f42638a = jSONObject;
        jSONObject.put("type", str);
        jSONObject.put("from", j10);
        jSONObject.put("to", j11);
    }
}
