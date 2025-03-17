package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.Place;
import java.util.List;

abstract class zze extends AutocompletePrediction {
    private final String zza;
    private final Integer zzb;
    private final List zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final List zzg;
    private final List zzh;
    private final List zzi;

    zze(String str, Integer num, List list, String str2, String str3, String str4, List list2, List list3, List list4) {
        if (str != null) {
            this.zza = str;
            this.zzb = num;
            if (list != null) {
                this.zzc = list;
                if (str2 != null) {
                    this.zzd = str2;
                    if (str3 != null) {
                        this.zze = str3;
                        if (str4 != null) {
                            this.zzf = str4;
                            this.zzg = list2;
                            this.zzh = list3;
                            this.zzi = list4;
                            return;
                        }
                        throw new NullPointerException("Null secondaryText");
                    }
                    throw new NullPointerException("Null primaryText");
                }
                throw new NullPointerException("Null fullText");
            }
            throw new NullPointerException("Null placeTypes");
        }
        throw new NullPointerException("Null placeId");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005c, code lost:
        r1 = r4.zzg;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0071, code lost:
        r1 = r4.zzh;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0086, code lost:
        r1 = r4.zzi;
     */
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
            boolean r1 = r5 instanceof com.google.android.libraries.places.api.model.AutocompletePrediction
            r2 = 0
            if (r1 == 0) goto L_0x009d
            com.google.android.libraries.places.api.model.AutocompletePrediction r5 = (com.google.android.libraries.places.api.model.AutocompletePrediction) r5
            java.lang.String r1 = r4.zza
            java.lang.String r3 = r5.getPlaceId()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x009d
            java.lang.Integer r1 = r4.zzb
            if (r1 != 0) goto L_0x0022
            java.lang.Integer r1 = r5.getDistanceMeters()
            if (r1 != 0) goto L_0x009d
            goto L_0x002c
        L_0x0022:
            java.lang.Integer r3 = r5.getDistanceMeters()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x009d
        L_0x002c:
            java.util.List r1 = r4.zzc
            java.util.List r3 = r5.getPlaceTypes()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x009d
            java.lang.String r1 = r4.zzd
            java.lang.String r3 = r5.zza()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x009d
            java.lang.String r1 = r4.zze
            java.lang.String r3 = r5.zzb()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x009d
            java.lang.String r1 = r4.zzf
            java.lang.String r3 = r5.zzc()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x009d
            java.util.List r1 = r4.zzg
            if (r1 != 0) goto L_0x0067
            java.util.List r1 = r5.zzd()
            if (r1 != 0) goto L_0x009d
            goto L_0x0071
        L_0x0067:
            java.util.List r3 = r5.zzd()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x009d
        L_0x0071:
            java.util.List r1 = r4.zzh
            if (r1 != 0) goto L_0x007c
            java.util.List r1 = r5.zze()
            if (r1 != 0) goto L_0x009d
            goto L_0x0086
        L_0x007c:
            java.util.List r3 = r5.zze()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x009d
        L_0x0086:
            java.util.List r1 = r4.zzi
            if (r1 != 0) goto L_0x0091
            java.util.List r5 = r5.zzf()
            if (r5 != 0) goto L_0x009d
            goto L_0x009c
        L_0x0091:
            java.util.List r5 = r5.zzf()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x009c
            goto L_0x009d
        L_0x009c:
            return r0
        L_0x009d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.api.model.zze.equals(java.lang.Object):boolean");
    }

    public final Integer getDistanceMeters() {
        return this.zzb;
    }

    public final String getPlaceId() {
        return this.zza;
    }

    public final List<Place.Type> getPlaceTypes() {
        return this.zzc;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() ^ 1000003;
        Integer num = this.zzb;
        int i10 = 0;
        int hashCode2 = ((((((((((hashCode * 1000003) ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.zzc.hashCode()) * 1000003) ^ this.zzd.hashCode()) * 1000003) ^ this.zze.hashCode()) * 1000003) ^ this.zzf.hashCode()) * 1000003;
        List list = this.zzg;
        int hashCode3 = (hashCode2 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.zzh;
        int hashCode4 = (hashCode3 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        List list3 = this.zzi;
        if (list3 != null) {
            i10 = list3.hashCode();
        }
        return hashCode4 ^ i10;
    }

    public final String toString() {
        String str = this.zza;
        Integer num = this.zzb;
        String obj = this.zzc.toString();
        String str2 = this.zzd;
        String str3 = this.zze;
        String str4 = this.zzf;
        String valueOf = String.valueOf(this.zzg);
        String valueOf2 = String.valueOf(this.zzh);
        String valueOf3 = String.valueOf(this.zzi);
        return "AutocompletePrediction{placeId=" + str + ", distanceMeters=" + num + ", placeTypes=" + obj + ", fullText=" + str2 + ", primaryText=" + str3 + ", secondaryText=" + str4 + ", fullTextMatchedSubstrings=" + valueOf + ", primaryTextMatchedSubstrings=" + valueOf2 + ", secondaryTextMatchedSubstrings=" + valueOf3 + "}";
    }

    /* access modifiers changed from: package-private */
    public final String zza() {
        return this.zzd;
    }

    /* access modifiers changed from: package-private */
    public final String zzb() {
        return this.zze;
    }

    /* access modifiers changed from: package-private */
    public final String zzc() {
        return this.zzf;
    }

    /* access modifiers changed from: package-private */
    public final List zzd() {
        return this.zzg;
    }

    /* access modifiers changed from: package-private */
    public final List zze() {
        return this.zzh;
    }

    /* access modifiers changed from: package-private */
    public final List zzf() {
        return this.zzi;
    }
}
