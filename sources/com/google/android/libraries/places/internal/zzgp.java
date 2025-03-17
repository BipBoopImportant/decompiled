package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import xa.C8972m;

public final /* synthetic */ class zzgp implements Runnable {
    public final /* synthetic */ C8972m zza;
    public final /* synthetic */ String zzb = "Location timeout.";

    public /* synthetic */ zzgp(C8972m mVar, String str) {
        this.zza = mVar;
    }

    public final void run() {
        this.zza.d(new b(new Status(15, this.zzb)));
    }
}
