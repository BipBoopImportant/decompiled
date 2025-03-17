package com.google.android.libraries.places.internal;

import android.location.Location;
import java.util.concurrent.TimeUnit;
import na.C8592a;
import na.C8594c;
import xa.C8960a;
import xa.C8971l;
import xa.C8972m;

public final class zzdp {
    private static final long zza = TimeUnit.SECONDS.toMillis(30);
    private final C8594c zzb;
    private final zzgs zzc;

    zzdp(C8594c cVar, zzgs zzgs) {
        this.zzb = cVar;
        this.zzc = zzgs;
    }

    public final C8971l zza(C8960a aVar) {
        C8971l<Location> lVar;
        C8592a.C0880a c10 = new C8592a.C0880a().c(100);
        long j10 = zza;
        C8592a a10 = c10.b(j10).a();
        Class<C8594c> cls = C8594c.class;
        if (cls.isInterface()) {
            lVar = this.zzb.h(a10, aVar);
        } else {
            try {
                lVar = (C8971l) cls.getMethod("h", new Class[]{C8592a.class, C8960a.class}).invoke(this.zzb, new Object[]{a10, aVar});
            } catch (ReflectiveOperationException e10) {
                throw new IllegalStateException(e10);
            }
        }
        zzgs zzgs = this.zzc;
        C8972m mVar = aVar == null ? new C8972m() : new C8972m(aVar);
        zzgs.zza(mVar, j10, "Location timeout.");
        lVar.k(new zzgq(zzgs, mVar));
        mVar.a().c(new zzgr(zzgs, mVar));
        return mVar.a().k(new zzdo(this));
    }
}
