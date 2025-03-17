package com.android.volley.toolbox;

import com.android.volley.k;
import com.android.volley.m;
import com.android.volley.p;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

public class j extends k<JSONObject> {
    public j(String str, p.b<JSONObject> bVar, p.a aVar) {
        super(0, str, (String) null, bVar, aVar);
    }

    /* access modifiers changed from: protected */
    public p<JSONObject> parseNetworkResponse(k kVar) {
        try {
            return p.c(new JSONObject(new String(kVar.f46226b, e.f(kVar.f46227c, "utf-8"))), e.e(kVar));
        } catch (UnsupportedEncodingException e10) {
            return p.a(new m((Throwable) e10));
        } catch (JSONException e11) {
            return p.a(new m((Throwable) e11));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Deprecated
    public j(String str, JSONObject jSONObject, p.b<JSONObject> bVar, p.a aVar) {
        super(jSONObject == null ? 0 : 1, str, jSONObject != null ? jSONObject.toString() : null, bVar, aVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(int i10, String str, JSONObject jSONObject, p.b<JSONObject> bVar, p.a aVar) {
        super(i10, str, jSONObject != null ? jSONObject.toString() : null, bVar, aVar);
    }
}
