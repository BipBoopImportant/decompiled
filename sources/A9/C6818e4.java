package a9;

import A8.b;
import D8.c;
import F8.g;
import kotlin.jvm.internal.C17542s;
import org.json.JSONObject;

/* renamed from: a9.e4  reason: case insensitive filesystem */
public final class C6818e4 extends Z5 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6818e4(g gVar, b bVar) {
        super(gVar, bVar);
        C17542s.j(gVar, "deviceInfo");
        C17542s.j(bVar, "configuration");
        new c("TelemetryLocalSubscriber");
    }

    public final JSONObject b(C6859j5 j5Var) {
        C17542s.j(j5Var, "telemetryReport");
        return new JSONObject();
    }
}
