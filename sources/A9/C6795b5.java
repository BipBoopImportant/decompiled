package a9;

import A8.b;
import C8.a;
import C8.d;
import D8.c;
import F8.g;
import G8.v;
import java.util.Map;
import kotlin.jvm.internal.C17542s;
import org.json.JSONObject;

/* renamed from: a9.b5  reason: case insensitive filesystem */
public final class C6795b5 extends Z5 {

    /* renamed from: c  reason: collision with root package name */
    public final a f42470c;

    /* renamed from: d  reason: collision with root package name */
    public final c f42471d = new c("TelemetryQASubscriber");

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6795b5(g gVar, b bVar) {
        super(gVar, bVar);
        a aVar = new a();
        C17542s.j(aVar, "httpConnection");
        C17542s.j(gVar, "deviceInfo");
        C17542s.j(bVar, "configuration");
        this.f42470c = aVar;
    }

    public final JSONObject a(C6859j5 j5Var) {
        C17542s.j(j5Var, "telemetryReport");
        return j5Var.f42638a;
    }

    public final JSONObject b(C6859j5 j5Var) {
        C17542s.j(j5Var, "telemetryReport");
        C17542s.j(j5Var, "telemetryReport");
        JSONObject jSONObject = j5Var.f42638a;
        String jSONObject2 = jSONObject.toString();
        C17542s.i(jSONObject2, "subscriberData.toString()");
        d g10 = a.g(this.f42470c, v.d(v.f36295a, (String) null, true, 1, (Object) null), jSONObject2, (Map) null, 4, (Object) null);
        if (g10.p()) {
            c cVar = this.f42471d;
            cVar.k("Telemetry report successfully sent to Qa server: " + jSONObject);
        } else {
            c cVar2 = this.f42471d;
            cVar2.k("Could not send the telemetry report to Qa server: " + g10.f() + '|' + g10.g());
        }
        return jSONObject;
    }
}
