package com.google.android.libraries.places.api.net;

import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.Place;
import java.util.List;
import xa.C8960a;

final class zzg extends FetchPlaceRequest {
    private final String zza;
    private final List zzb;
    private final AutocompleteSessionToken zzc;
    private final C8960a zzd;

    /* synthetic */ zzg(String str, List list, AutocompleteSessionToken autocompleteSessionToken, C8960a aVar, zzf zzf) {
        this.zza = str;
        this.zzb = list;
        this.zzc = autocompleteSessionToken;
        this.zzd = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        r1 = r4.zzd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        r1 = r4.zzc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.places.api.net.FetchPlaceRequest
            r2 = 0
            if (r1 == 0) goto L_0x004f
            com.google.android.libraries.places.api.net.FetchPlaceRequest r5 = (com.google.android.libraries.places.api.net.FetchPlaceRequest) r5
            java.lang.String r1 = r4.zza
            java.lang.String r3 = r5.getPlaceId()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004f
            java.util.List r1 = r4.zzb
            java.util.List r3 = r5.getPlaceFields()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004f
            com.google.android.libraries.places.api.model.AutocompleteSessionToken r1 = r4.zzc
            if (r1 != 0) goto L_0x002e
            com.google.android.libraries.places.api.model.AutocompleteSessionToken r1 = r5.getSessionToken()
            if (r1 != 0) goto L_0x004f
            goto L_0x0038
        L_0x002e:
            com.google.android.libraries.places.api.model.AutocompleteSessionToken r3 = r5.getSessionToken()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004f
        L_0x0038:
            xa.a r1 = r4.zzd
            if (r1 != 0) goto L_0x0043
            xa.a r5 = r5.getCancellationToken()
            if (r5 != 0) goto L_0x004f
            goto L_0x004e
        L_0x0043:
            xa.a r5 = r5.getCancellationToken()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x004e
            goto L_0x004f
        L_0x004e:
            return r0
        L_0x004f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.api.net.zzg.equals(java.lang.Object):boolean");
    }

    public final C8960a getCancellationToken() {
        return this.zzd;
    }

    public final List<Place.Field> getPlaceFields() {
        return this.zzb;
    }

    public final String getPlaceId() {
        return this.zza;
    }

    public final AutocompleteSessionToken getSessionToken() {
        return this.zzc;
    }

    public final int hashCode() {
        int hashCode = ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
        AutocompleteSessionToken autocompleteSessionToken = this.zzc;
        int i10 = 0;
        int hashCode2 = ((hashCode * 1000003) ^ (autocompleteSessionToken == null ? 0 : autocompleteSessionToken.hashCode())) * 1000003;
        C8960a aVar = this.zzd;
        if (aVar != null) {
            i10 = aVar.hashCode();
        }
        return hashCode2 ^ i10;
    }

    public final String toString() {
        String str = this.zza;
        String obj = this.zzb.toString();
        String valueOf = String.valueOf(this.zzc);
        String valueOf2 = String.valueOf(this.zzd);
        return "FetchPlaceRequest{placeId=" + str + ", placeFields=" + obj + ", sessionToken=" + valueOf + ", cancellationToken=" + valueOf2 + "}";
    }
}
