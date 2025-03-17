package com.google.android.libraries.places.api.net;

import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.IsOpenRequest;
import xa.C8960a;

final class zzq extends IsOpenRequest.Builder {
    private Place zza;
    private String zzb;
    private long zzc;
    private C8960a zzd;
    private byte zze;

    zzq() {
    }

    public final C8960a getCancellationToken() {
        return this.zzd;
    }

    public final Place getPlace() {
        return this.zza;
    }

    public final String getPlaceId() {
        return this.zzb;
    }

    public final long getUtcTimeMillis() {
        if (this.zze != 0) {
            return this.zzc;
        }
        throw new IllegalStateException("Property \"utcTimeMillis\" has not been set");
    }

    public final IsOpenRequest.Builder setCancellationToken(C8960a aVar) {
        this.zzd = aVar;
        return this;
    }

    public final IsOpenRequest.Builder setPlace(Place place) {
        this.zza = place;
        return this;
    }

    public final IsOpenRequest.Builder setPlaceId(String str) {
        this.zzb = str;
        return this;
    }

    public final IsOpenRequest.Builder setUtcTimeMillis(long j10) {
        this.zzc = j10;
        this.zze = 1;
        return this;
    }

    /* access modifiers changed from: package-private */
    public final IsOpenRequest zza() {
        if (this.zze == 1) {
            return new zzs(this.zza, this.zzb, this.zzc, this.zzd, (zzr) null);
        }
        throw new IllegalStateException("Missing required properties: utcTimeMillis");
    }
}
