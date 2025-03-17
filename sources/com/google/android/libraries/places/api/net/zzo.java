package com.google.android.libraries.places.api.net;

import com.google.android.libraries.places.api.model.Place;
import java.util.List;
import xa.C8960a;

final class zzo extends FindCurrentPlaceRequest {
    private final List zza;
    private final C8960a zzb;

    /* synthetic */ zzo(List list, C8960a aVar, zzn zzn) {
        this.zza = list;
        this.zzb = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.zzb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.places.api.net.FindCurrentPlaceRequest
            r2 = 0
            if (r1 == 0) goto L_0x002e
            com.google.android.libraries.places.api.net.FindCurrentPlaceRequest r5 = (com.google.android.libraries.places.api.net.FindCurrentPlaceRequest) r5
            java.util.List r1 = r4.zza
            java.util.List r3 = r5.getPlaceFields()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x002e
            xa.a r1 = r4.zzb
            if (r1 != 0) goto L_0x0022
            xa.a r5 = r5.getCancellationToken()
            if (r5 != 0) goto L_0x002e
            goto L_0x002d
        L_0x0022:
            xa.a r5 = r5.getCancellationToken()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            return r0
        L_0x002e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.api.net.zzo.equals(java.lang.Object):boolean");
    }

    public final C8960a getCancellationToken() {
        return this.zzb;
    }

    public final List<Place.Field> getPlaceFields() {
        return this.zza;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() ^ 1000003;
        C8960a aVar = this.zzb;
        return (hashCode * 1000003) ^ (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        String obj = this.zza.toString();
        String valueOf = String.valueOf(this.zzb);
        return "FindCurrentPlaceRequest{placeFields=" + obj + ", cancellationToken=" + valueOf + "}";
    }
}
