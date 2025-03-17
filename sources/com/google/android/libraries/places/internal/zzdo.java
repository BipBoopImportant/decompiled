package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import xa.C8962c;
import xa.C8971l;
import xa.C8972m;

final class zzdo implements C8962c {
    final /* synthetic */ zzdp zza;

    zzdo(zzdp zzdp) {
        this.zza = zzdp;
    }

    public final /* synthetic */ Object then(C8971l lVar) {
        C8972m mVar = new C8972m();
        if (lVar.o()) {
            mVar.d(new b(new Status(16, "Location request was cancelled. Please try again.")));
        } else if (lVar.l() == null && lVar.m() == null) {
            mVar.d(new b(new Status(8, "Location unavailable.")));
        }
        return mVar.a().l() != null ? mVar.a() : lVar;
    }
}
