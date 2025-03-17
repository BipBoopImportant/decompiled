package oE;

import java.security.SecureRandom;
import org.json.JSONException;
import org.json.JSONObject;
import pE.C14918c;

/* renamed from: oE.l  reason: case insensitive filesystem */
class C14889l {

    /* renamed from: a  reason: collision with root package name */
    private long f130121a;

    /* renamed from: b  reason: collision with root package name */
    private long f130122b;

    /* renamed from: c  reason: collision with root package name */
    private long f130123c;

    /* renamed from: d  reason: collision with root package name */
    private String f130124d;

    /* renamed from: e  reason: collision with root package name */
    private final SecureRandom f130125e = new SecureRandom();

    C14889l() {
        d();
    }

    private JSONObject c(boolean z10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("$mp_event_id", Long.toHexString(this.f130125e.nextLong()));
            jSONObject.put("$mp_session_id", this.f130124d);
            jSONObject.put("$mp_session_seq_id", z10 ? this.f130121a : this.f130122b);
            jSONObject.put("$mp_session_start_sec", this.f130123c);
            if (z10) {
                this.f130121a++;
            } else {
                this.f130122b++;
            }
        } catch (JSONException e10) {
            C14918c.d(C14879b.f130022a, "Cannot create session metadata JSON object", e10);
        }
        return jSONObject;
    }

    public JSONObject a() {
        return c(true);
    }

    public JSONObject b() {
        return c(false);
    }

    /* access modifiers changed from: protected */
    public void d() {
        this.f130121a = 0;
        this.f130122b = 0;
        this.f130124d = Long.toHexString(new SecureRandom().nextLong());
        this.f130123c = System.currentTimeMillis() / 1000;
    }
}
