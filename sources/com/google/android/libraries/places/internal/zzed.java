package com.google.android.libraries.places.internal;

import com.android.volley.p;
import com.android.volley.toolbox.j;
import java.util.Map;
import org.json.JSONObject;

final class zzed extends j {
    final /* synthetic */ Map zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzed(zzee zzee, int i10, String str, JSONObject jSONObject, p.b bVar, p.a aVar, Map map) {
        super(0, str, (JSONObject) null, bVar, aVar);
        this.zza = map;
    }

    public final Map getHeaders() {
        return this.zza;
    }
}
