package com.google.android.libraries.places.api.net;

import com.google.android.libraries.places.api.model.Place;
import xa.C8960a;

final class zzs extends IsOpenRequest {
    private final Place zza;
    private final String zzb;
    private final long zzc;
    private final C8960a zzd;

    /* synthetic */ zzs(Place place, String str, long j10, C8960a aVar, zzr zzr) {
        this.zza = place;
        this.zzb = str;
        this.zzc = j10;
        this.zzd = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003f, code lost:
        r1 = r7.zzd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof com.google.android.libraries.places.api.net.IsOpenRequest
            r2 = 0
            if (r1 == 0) goto L_0x0056
            com.google.android.libraries.places.api.net.IsOpenRequest r8 = (com.google.android.libraries.places.api.net.IsOpenRequest) r8
            com.google.android.libraries.places.api.model.Place r1 = r7.zza
            if (r1 != 0) goto L_0x0016
            com.google.android.libraries.places.api.model.Place r1 = r8.getPlace()
            if (r1 != 0) goto L_0x0056
            goto L_0x0020
        L_0x0016:
            com.google.android.libraries.places.api.model.Place r3 = r8.getPlace()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
        L_0x0020:
            java.lang.String r1 = r7.zzb
            if (r1 != 0) goto L_0x002b
            java.lang.String r1 = r8.getPlaceId()
            if (r1 != 0) goto L_0x0056
            goto L_0x0035
        L_0x002b:
            java.lang.String r3 = r8.getPlaceId()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
        L_0x0035:
            long r3 = r7.zzc
            long r5 = r8.getUtcTimeMillis()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0056
            xa.a r1 = r7.zzd
            if (r1 != 0) goto L_0x004a
            xa.a r8 = r8.getCancellationToken()
            if (r8 != 0) goto L_0x0056
            goto L_0x0055
        L_0x004a:
            xa.a r8 = r8.getCancellationToken()
            boolean r8 = r1.equals(r8)
            if (r8 != 0) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            return r0
        L_0x0056:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.api.net.zzs.equals(java.lang.Object):boolean");
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
        return this.zzc;
    }

    public final int hashCode() {
        Place place = this.zza;
        int i10 = 0;
        int hashCode = place == null ? 0 : place.hashCode();
        String str = this.zzb;
        int hashCode2 = str == null ? 0 : str.hashCode();
        int i11 = hashCode ^ 1000003;
        long j10 = this.zzc;
        long j11 = j10 ^ (j10 >>> 32);
        C8960a aVar = this.zzd;
        if (aVar != null) {
            i10 = aVar.hashCode();
        }
        return (((((i11 * 1000003) ^ hashCode2) * 1000003) ^ ((int) j11)) * 1000003) ^ i10;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String str = this.zzb;
        long j10 = this.zzc;
        String valueOf2 = String.valueOf(this.zzd);
        return "IsOpenRequest{place=" + valueOf + ", placeId=" + str + ", utcTimeMillis=" + j10 + ", cancellationToken=" + valueOf2 + "}";
    }
}
