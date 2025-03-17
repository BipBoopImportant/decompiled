package com.google.android.libraries.places.api.net;

import com.google.android.libraries.places.api.model.PhotoMetadata;
import xa.C8960a;

final class zzc extends FetchPhotoRequest {
    private final Integer zza;
    private final Integer zzb;
    private final PhotoMetadata zzc;
    private final C8960a zzd;

    /* synthetic */ zzc(Integer num, Integer num2, PhotoMetadata photoMetadata, C8960a aVar, zzb zzb2) {
        this.zza = num;
        this.zzb = num2;
        this.zzc = photoMetadata;
        this.zzd = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        r1 = r4.zzd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.places.api.net.FetchPhotoRequest
            r2 = 0
            if (r1 == 0) goto L_0x0058
            com.google.android.libraries.places.api.net.FetchPhotoRequest r5 = (com.google.android.libraries.places.api.net.FetchPhotoRequest) r5
            java.lang.Integer r1 = r4.zza
            if (r1 != 0) goto L_0x0016
            java.lang.Integer r1 = r5.getMaxWidth()
            if (r1 != 0) goto L_0x0058
            goto L_0x0020
        L_0x0016:
            java.lang.Integer r3 = r5.getMaxWidth()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0058
        L_0x0020:
            java.lang.Integer r1 = r4.zzb
            if (r1 != 0) goto L_0x002b
            java.lang.Integer r1 = r5.getMaxHeight()
            if (r1 != 0) goto L_0x0058
            goto L_0x0035
        L_0x002b:
            java.lang.Integer r3 = r5.getMaxHeight()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0058
        L_0x0035:
            com.google.android.libraries.places.api.model.PhotoMetadata r1 = r4.zzc
            com.google.android.libraries.places.api.model.PhotoMetadata r3 = r5.getPhotoMetadata()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0058
            xa.a r1 = r4.zzd
            if (r1 != 0) goto L_0x004c
            xa.a r5 = r5.getCancellationToken()
            if (r5 != 0) goto L_0x0058
            goto L_0x0057
        L_0x004c:
            xa.a r5 = r5.getCancellationToken()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            return r0
        L_0x0058:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.api.net.zzc.equals(java.lang.Object):boolean");
    }

    public final C8960a getCancellationToken() {
        return this.zzd;
    }

    public final Integer getMaxHeight() {
        return this.zzb;
    }

    public final Integer getMaxWidth() {
        return this.zza;
    }

    public final PhotoMetadata getPhotoMetadata() {
        return this.zzc;
    }

    public final int hashCode() {
        Integer num = this.zza;
        int i10 = 0;
        int hashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.zzb;
        int hashCode2 = ((((hashCode ^ 1000003) * 1000003) ^ (num2 == null ? 0 : num2.hashCode())) * 1000003) ^ this.zzc.hashCode();
        C8960a aVar = this.zzd;
        if (aVar != null) {
            i10 = aVar.hashCode();
        }
        return (hashCode2 * 1000003) ^ i10;
    }

    public final String toString() {
        Integer num = this.zza;
        Integer num2 = this.zzb;
        String obj = this.zzc.toString();
        String valueOf = String.valueOf(this.zzd);
        return "FetchPhotoRequest{maxWidth=" + num + ", maxHeight=" + num2 + ", photoMetadata=" + obj + ", cancellationToken=" + valueOf + "}";
    }
}
