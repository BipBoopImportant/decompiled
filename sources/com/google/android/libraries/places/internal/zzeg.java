package com.google.android.libraries.places.internal;

import android.graphics.Bitmap;
import com.android.volley.p;
import xa.C8972m;

public final /* synthetic */ class zzeg implements p.b {
    public final /* synthetic */ C8972m zza;
    public final /* synthetic */ zzfb zzb;

    public /* synthetic */ zzeg(zzfb zzfb, C8972m mVar) {
        this.zzb = zzfb;
        this.zza = mVar;
    }

    public final void onResponse(Object obj) {
        zzek.zzc(this.zzb, this.zza, (Bitmap) obj);
    }
}
