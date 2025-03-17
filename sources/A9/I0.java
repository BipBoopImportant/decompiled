package a9;

import E8.b;
import E8.c;
import kotlin.jvm.internal.C17542s;
import org.json.JSONException;
import org.json.JSONObject;

public final class I0 {

    /* renamed from: a  reason: collision with root package name */
    public final c f42063a;

    /* renamed from: b  reason: collision with root package name */
    public final D8.c f42064b = new D8.c("UserConfigurationHelper");

    public I0(c cVar) {
        C17542s.j(cVar, "preferencesStore");
        this.f42063a = cVar;
    }

    public final String a() {
        this.f42064b.l("retrieving last USER ID config from preferences");
        c cVar = this.f42063a;
        b bVar = b.USER_ID;
        String f10 = cVar.f(bVar, (String) null);
        if (f10 == null || f10.length() == 0) {
            this.f42064b.l("last USER ID config is null");
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(f10);
            if (System.currentTimeMillis() - jSONObject.getLong("timestamp") > 33696000000L) {
                this.f42064b.l("last USER ID is outdated, returning null");
                this.f42063a.o(bVar, b.SESSION_ID, b.SCREEN_NUMBER, b.LAST_SEGMENT, b.IS_TRACKABLE);
                return null;
            }
            String string = jSONObject.getString("uid");
            D8.c cVar2 = this.f42064b;
            cVar2.l("last USER ID is valid, returning USER ID from preferences " + string);
            return string;
        } catch (JSONException e10) {
            H1.a(this.f42064b, "failed to deserialize last USER ID config with an exception", e10);
            return null;
        }
    }
}
