package com.google.android.libraries.places.internal;

import com.android.volley.p;
import org.json.JSONObject;
import xa.C8972m;

public final /* synthetic */ class zzea implements p.b {
    public final /* synthetic */ zzee zza;
    public final /* synthetic */ Class zzb;
    public final /* synthetic */ C8972m zzc;

    public /* synthetic */ zzea(zzee zzee, Class cls, C8972m mVar) {
        this.zza = zzee;
        this.zzb = cls;
        this.zzc = mVar;
    }

    public final void onResponse(Object obj) {
        this.zza.zzb(this.zzb, this.zzc, (JSONObject) obj);
    }
}
