package com.google.android.libraries.places.internal;

import xa.C8962c;
import xa.C8971l;
import xa.C8972m;

public final /* synthetic */ class zzgq implements C8962c {
    public final /* synthetic */ zzgs zza;
    public final /* synthetic */ C8972m zzb;

    public /* synthetic */ zzgq(zzgs zzgs, C8972m mVar) {
        this.zza = zzgs;
        this.zzb = mVar;
    }

    public final Object then(C8971l lVar) {
        C8972m mVar = this.zzb;
        Exception l10 = lVar.l();
        if (lVar.q()) {
            mVar.c(lVar.m());
        } else if (!lVar.o() && l10 != null) {
            mVar.b(l10);
        }
        return mVar.a();
    }
}
