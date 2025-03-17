package Yb;

import Qb.E;
import Yb.d;
import org.json.JSONObject;

class m implements i {
    m() {
    }

    private static d.a b(JSONObject jSONObject) {
        return new d.a(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false), jSONObject.optBoolean("collect_build_ids", false));
    }

    private static d.b c(JSONObject jSONObject) {
        return new d.b(jSONObject.optInt("max_custom_exception_events", 8), 4);
    }

    private static long d(E e10, long j10, JSONObject jSONObject) {
        return jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : e10.a() + (j10 * 1000);
    }

    public d a(E e10, JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        int optInt = jSONObject2.optInt("settings_version", 0);
        int optInt2 = jSONObject2.optInt("cache_duration", 3600);
        return new d(d(e10, (long) optInt2, jSONObject2), jSONObject2.has("session") ? c(jSONObject2.getJSONObject("session")) : c(new JSONObject()), b(jSONObject2.getJSONObject("features")), optInt, optInt2, jSONObject2.optDouble("on_demand_upload_rate_per_minute", 10.0d), jSONObject2.optDouble("on_demand_backoff_base", 1.2d), jSONObject2.optInt("on_demand_backoff_step_duration_seconds", 60));
    }
}
