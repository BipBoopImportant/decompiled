package com.google.android.libraries.places.internal;

import com.android.volley.o;
import com.android.volley.u;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import java.util.Map;
import org.json.JSONObject;
import xa.C8960a;
import xa.C8971l;
import xa.C8972m;

public final class zzee {
    private final o zza;
    private final zzfs zzb;

    zzee(o oVar, zzfs zzfs) {
        this.zza = oVar;
        this.zzb = zzfs;
    }

    static /* synthetic */ void zzc(C8972m mVar, u uVar) {
        try {
            mVar.d(zzdy.zza(uVar));
        } catch (Error | RuntimeException e10) {
            zzhk.zzb(e10);
            throw e10;
        }
    }

    public final C8971l zza(zzem zzem, Class cls) {
        String zzc = zzem.zzc();
        Map zzd = zzem.zzd();
        C8960a zza2 = zzem.zza();
        C8972m mVar = zza2 != null ? new C8972m(zza2) : new C8972m();
        zzed zzed = new zzed(this, 0, zzc, (JSONObject) null, new zzea(this, cls, mVar), new zzeb(mVar), zzd);
        if (zza2 != null) {
            zza2.b(new zzec(zzed));
        }
        this.zza.a(zzed);
        return mVar.a();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(Class cls, C8972m mVar, JSONObject jSONObject) {
        try {
            mVar.e((zzen) this.zzb.zza(jSONObject.toString(), cls));
        } catch (zzeo e10) {
            try {
                mVar.d(new b(new Status(8, e10.getMessage())));
            } catch (Error | RuntimeException e11) {
                zzhk.zzb(e11);
                throw e11;
            }
        }
    }
}
