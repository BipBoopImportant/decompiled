package a9;

import A8.b;
import F8.g;
import com.contentsquare.android.core.features.config.model.JsonConfig;
import kotlin.jvm.internal.C17542s;
import org.json.JSONObject;

public abstract class Z5 {

    /* renamed from: a  reason: collision with root package name */
    public final g f42421a;

    /* renamed from: b  reason: collision with root package name */
    public final b f42422b;

    public Z5(g gVar, b bVar) {
        C17542s.j(gVar, "deviceInfo");
        C17542s.j(bVar, "configuration");
        this.f42421a = gVar;
        this.f42422b = bVar;
    }

    public JSONObject a(C6859j5 j5Var) {
        C17542s.j(j5Var, "telemetryReport");
        JSONObject jSONObject = new JSONObject();
        JsonConfig.ProjectConfiguration b10 = this.f42422b.b();
        if (b10 != null) {
            jSONObject.put("pid", b10.g());
        }
        jSONObject.put("application", this.f42421a.c().c());
        jSONObject.put("level", "info");
        jSONObject.put("version", this.f42421a.c().i());
        jSONObject.put("date", System.currentTimeMillis());
        String f10 = this.f42421a.f();
        if (f10 == null) {
            f10 = "";
        }
        jSONObject.put("device_model", f10);
        jSONObject.put("os_type", "android");
        jSONObject.put("os_version", this.f42421a.g());
        jSONObject.put("os_api", this.f42421a.h());
        jSONObject.put("bundle_id", this.f42421a.c().b());
        jSONObject.put("app_version", this.f42421a.c().d());
        jSONObject.put("app_build_version", this.f42421a.c().e());
        jSONObject.put("report", j5Var.f42638a);
        return jSONObject;
    }

    public abstract JSONObject b(C6859j5 j5Var);
}
