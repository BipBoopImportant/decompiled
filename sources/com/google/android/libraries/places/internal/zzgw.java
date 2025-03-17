package com.google.android.libraries.places.internal;

import android.content.Context;
import com.android.volley.o;
import com.android.volley.toolbox.n;
import com.google.android.libraries.places.api.net.PlacesClient;
import na.C8594c;
import na.g;

final class zzgw implements zzgz {
    private final zzhb zza;
    private final Context zzb;
    private final zzhi zzc;
    private final zzgw zzd = this;
    private final zzajv zze;

    /* synthetic */ zzgw(Context context, zzhb zzhb, zzhi zzhi, zzgv zzgv) {
        this.zza = zzhb;
        this.zzb = context;
        this.zzc = zzhi;
        this.zze = zzaju.zza(zzdg.zza());
    }

    private final zzdw zzb() {
        return zzdx.zza(new zzhm(this.zzb), this.zzc, this.zza);
    }

    public final PlacesClient zza() {
        zzhb zzhb = this.zza;
        zzho zzho = new zzho(this.zzb);
        Context applicationContext = this.zzb.getApplicationContext();
        zzajt.zza(applicationContext);
        o a10 = n.a(applicationContext);
        zzajt.zza(a10);
        zzee zza2 = zzef.zza(a10, new zzfs());
        Context applicationContext2 = this.zzb.getApplicationContext();
        zzajt.zza(applicationContext2);
        o a11 = n.a(applicationContext2);
        zzajt.zza(a11);
        zzgd zza3 = zzge.zza(zzhb, zzho, zza2, zzel.zza(a11), zzb(), (zzde) this.zze.zzb(), zzff.zza(), zzfj.zza(zzgh.zza()), zzfn.zza(), zzfr.zza(zzgh.zza()));
        Context applicationContext3 = this.zzb.getApplicationContext();
        zzajt.zza(applicationContext3);
        C8594c b10 = g.b(applicationContext3);
        zzajt.zza(b10);
        zzdp zza4 = zzdq.zza(b10, new zzgs(new zzgo()));
        Context applicationContext4 = this.zzb.getApplicationContext();
        zzajt.zza(applicationContext4);
        return zzey.zza(zza3, zza4, zzdv.zza(applicationContext4, (zzde) this.zze.zzb()), zzb(), (zzde) this.zze.zzb());
    }
}
