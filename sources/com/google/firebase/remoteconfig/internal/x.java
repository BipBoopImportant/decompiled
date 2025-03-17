package com.google.firebase.remoteconfig.internal;

import Ib.a;
import android.os.Bundle;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import mc.C10036b;
import org.json.JSONObject;

public class x {

    /* renamed from: a  reason: collision with root package name */
    private final C10036b<a> f68851a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, String> f68852b = Collections.synchronizedMap(new HashMap());

    public x(C10036b<a> bVar) {
        this.f68851a = bVar;
    }

    public void a(String str, g gVar) {
        JSONObject optJSONObject;
        a aVar = this.f68851a.get();
        if (aVar != null) {
            JSONObject i10 = gVar.i();
            if (i10.length() >= 1) {
                JSONObject g10 = gVar.g();
                if (g10.length() >= 1 && (optJSONObject = i10.optJSONObject(str)) != null) {
                    String optString = optJSONObject.optString("choiceId");
                    if (!optString.isEmpty()) {
                        synchronized (this.f68852b) {
                            try {
                                if (!optString.equals(this.f68852b.get(str))) {
                                    this.f68852b.put(str, optString);
                                    Bundle bundle = new Bundle();
                                    bundle.putString("arm_key", str);
                                    bundle.putString("arm_value", g10.optString(str));
                                    bundle.putString("personalization_id", optJSONObject.optString("personalizationId"));
                                    bundle.putInt("arm_index", optJSONObject.optInt("armIndex", -1));
                                    bundle.putString("group", optJSONObject.optString("group"));
                                    aVar.c("fp", "personalization_assignment", bundle);
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString("_fpid", optString);
                                    aVar.c("fp", "_fpc", bundle2);
                                }
                            } catch (Throwable th2) {
                                while (true) {
                                    throw th2;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
