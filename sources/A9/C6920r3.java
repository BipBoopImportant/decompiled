package a9;

import A8.b;
import C8.a;
import C8.d;
import D8.c;
import F8.g;
import G8.v;
import java.util.Map;
import kotlin.jvm.internal.C17542s;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: a9.r3  reason: case insensitive filesystem */
public final class C6920r3 extends Z5 {

    /* renamed from: c  reason: collision with root package name */
    public final a f42828c;

    /* renamed from: d  reason: collision with root package name */
    public final c f42829d = new c("TelemetryDCMonitorSubscriber");

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6920r3(a aVar, g gVar, b bVar) {
        super(gVar, bVar);
        C17542s.j(aVar, "httpConnection");
        C17542s.j(gVar, "deviceInfo");
        C17542s.j(bVar, "configuration");
        this.f42828c = aVar;
    }

    public final JSONObject b(C6859j5 j5Var) {
        C17542s.j(j5Var, "telemetryReport");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject = a(j5Var);
            c(jSONObject);
            return jSONObject;
        } catch (JSONException e10) {
            H1.a(this.f42829d, "cannot add header to telemetry report", e10);
            return jSONObject;
        }
    }

    public final void c(JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        C17542s.i(jSONObject2, "subscriberData.toString()");
        d g10 = a.g(this.f42828c, v.d(v.f36295a, (String) null, false, 3, (Object) null), jSONObject2, (Map) null, 4, (Object) null);
        if (g10.p()) {
            c cVar = this.f42829d;
            cVar.f("Telemetry report successfully sent to DC monitor: " + jSONObject);
            return;
        }
        c cVar2 = this.f42829d;
        cVar2.f("Could not send the telemetry report to DC monitor: " + g10.f() + '|' + g10.g());
    }
}
