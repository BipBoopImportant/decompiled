package Ob;

import Nb.g;
import Pb.a;
import Pb.b;
import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

public class d implements b, b {

    /* renamed from: a  reason: collision with root package name */
    private a f62056a;

    private static String b(String str, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String next : bundle.keySet()) {
            jSONObject2.put(next, bundle.get(next));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    public void a(a aVar) {
        this.f62056a = aVar;
        g.f().b("Registered Firebase Analytics event receiver for breadcrumbs");
    }

    public void w(String str, Bundle bundle) {
        a aVar = this.f62056a;
        if (aVar != null) {
            try {
                aVar.a("$A$:" + b(str, bundle));
            } catch (JSONException unused) {
                g.f().k("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }
}
