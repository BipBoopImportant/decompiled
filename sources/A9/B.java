package a9;

import D8.c;
import kotlin.jvm.internal.C17542s;
import org.json.JSONException;
import org.json.JSONObject;

public final class B {

    /* renamed from: a  reason: collision with root package name */
    public final String f41919a;

    /* renamed from: b  reason: collision with root package name */
    public final String f41920b;

    /* renamed from: c  reason: collision with root package name */
    public final int f41921c;

    /* renamed from: d  reason: collision with root package name */
    public final c f41922d = new c("JsonMetadataView");

    public B(int i10, String str, String str2) {
        C17542s.j(str, "className");
        C17542s.j(str2, "fullPath");
        this.f41919a = str;
        this.f41920b = str2;
        this.f41921c = i10;
    }

    public final JSONObject a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("class_name", this.f41919a);
            jSONObject.put("fullpath", this.f41920b);
            jSONObject.put("child_order", this.f41921c);
            return jSONObject;
        } catch (JSONException e10) {
            c cVar = this.f41922d;
            H1.a(cVar, "Failed to build metadata object " + e10.getMessage(), e10);
            return new JSONObject();
        }
    }
}
