package a9;

import E8.b;
import E8.c;
import java.util.UUID;
import kotlin.jvm.internal.C17542s;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: a9.e1  reason: case insensitive filesystem */
public final class C6815e1 implements c.b {

    /* renamed from: a  reason: collision with root package name */
    public final c f42518a;

    /* renamed from: b  reason: collision with root package name */
    public final I0 f42519b;

    /* renamed from: c  reason: collision with root package name */
    public String f42520c;

    public C6815e1(c cVar, I0 i02) {
        C17542s.j(cVar, "preferencesStore");
        C17542s.j(i02, "userConfigurationHelper");
        this.f42518a = cVar;
        this.f42519b = i02;
        cVar.n(this);
    }

    public final String a() {
        if (this.f42520c == null) {
            String a10 = this.f42519b.a();
            if (a10 == null || a10.length() == 0) {
                a10 = UUID.randomUUID().toString();
                I0 i02 = this.f42519b;
                i02.getClass();
                C17542s.j(a10, "userId");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("uid", a10);
                jSONObject.put("timestamp", System.currentTimeMillis());
                try {
                    i02.f42063a.l(b.USER_ID, jSONObject.toString());
                    i02.f42064b.f("Saving USER ID config to sharedPrefs.");
                } catch (JSONException e10) {
                    H1.a(i02.f42064b, "Failed to serialize and store the USER ID config.", e10);
                }
            }
            this.f42520c = a10;
        }
        if (!this.f42518a.b(b.IS_OPT_OUT, false)) {
            return this.f42520c;
        }
        return null;
    }

    public final void o(b bVar) {
        C17542s.j(bVar, "key");
        b bVar2 = b.USER_ID;
        if (bVar == bVar2 && !this.f42518a.a(bVar2)) {
            this.f42520c = null;
        }
    }
}
