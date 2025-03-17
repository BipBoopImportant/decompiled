package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.Place;

final class zzhw extends zzic {
    private final String zza;
    private final zzkh zzb;
    private final Place zzc;
    private final AutocompletePrediction zzd;
    private final Status zze;
    private final int zzf;

    /* synthetic */ zzhw(int i10, String str, zzkh zzkh, Place place, AutocompletePrediction autocompletePrediction, Status status, zzhv zzhv) {
        this.zzf = i10;
        this.zza = str;
        this.zzb = zzkh;
        this.zzc = place;
        this.zzd = autocompletePrediction;
        this.zze = status;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        r1 = r4.zzb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        r1 = r4.zzc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0052, code lost:
        r1 = r4.zzd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0067, code lost:
        r1 = r4.zze;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r1 = r4.zza;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.places.internal.zzic
            r2 = 0
            if (r1 == 0) goto L_0x007e
            com.google.android.libraries.places.internal.zzic r5 = (com.google.android.libraries.places.internal.zzic) r5
            int r1 = r4.zzf
            int r3 = r5.zzf()
            if (r1 != r3) goto L_0x007e
            java.lang.String r1 = r4.zza
            if (r1 != 0) goto L_0x001e
            java.lang.String r1 = r5.zze()
            if (r1 != 0) goto L_0x007e
            goto L_0x0028
        L_0x001e:
            java.lang.String r3 = r5.zze()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x007e
        L_0x0028:
            com.google.android.libraries.places.internal.zzkh r1 = r4.zzb
            if (r1 != 0) goto L_0x0033
            com.google.android.libraries.places.internal.zzkh r1 = r5.zzd()
            if (r1 != 0) goto L_0x007e
            goto L_0x003d
        L_0x0033:
            com.google.android.libraries.places.internal.zzkh r3 = r5.zzd()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x007e
        L_0x003d:
            com.google.android.libraries.places.api.model.Place r1 = r4.zzc
            if (r1 != 0) goto L_0x0048
            com.google.android.libraries.places.api.model.Place r1 = r5.zzc()
            if (r1 != 0) goto L_0x007e
            goto L_0x0052
        L_0x0048:
            com.google.android.libraries.places.api.model.Place r3 = r5.zzc()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x007e
        L_0x0052:
            com.google.android.libraries.places.api.model.AutocompletePrediction r1 = r4.zzd
            if (r1 != 0) goto L_0x005d
            com.google.android.libraries.places.api.model.AutocompletePrediction r1 = r5.zzb()
            if (r1 != 0) goto L_0x007e
            goto L_0x0067
        L_0x005d:
            com.google.android.libraries.places.api.model.AutocompletePrediction r3 = r5.zzb()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x007e
        L_0x0067:
            com.google.android.gms.common.api.Status r1 = r4.zze
            if (r1 != 0) goto L_0x0072
            com.google.android.gms.common.api.Status r5 = r5.zza()
            if (r5 != 0) goto L_0x007e
            goto L_0x007d
        L_0x0072:
            com.google.android.gms.common.api.Status r5 = r5.zza()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x007d
            goto L_0x007e
        L_0x007d:
            return r0
        L_0x007e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzhw.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i10 = this.zzf ^ 1000003;
        String str = this.zza;
        int i11 = 0;
        int hashCode = ((i10 * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        zzkh zzkh = this.zzb;
        int hashCode2 = (hashCode ^ (zzkh == null ? 0 : zzkh.hashCode())) * 1000003;
        Place place = this.zzc;
        int hashCode3 = (hashCode2 ^ (place == null ? 0 : place.hashCode())) * 1000003;
        AutocompletePrediction autocompletePrediction = this.zzd;
        int hashCode4 = (hashCode3 ^ (autocompletePrediction == null ? 0 : autocompletePrediction.hashCode())) * 1000003;
        Status status = this.zze;
        if (status != null) {
            i11 = status.hashCode();
        }
        return hashCode4 ^ i11;
    }

    public final String toString() {
        String str;
        switch (this.zzf) {
            case 1:
                str = "START";
                break;
            case 2:
                str = "RESET";
                break;
            case 3:
                str = "LOADING";
                break;
            case 4:
                str = "TRY_AGAIN_PROGRESS_LOADING";
                break;
            case 5:
                str = "SUCCESS_PREDICTIONS";
                break;
            case 6:
                str = "FAILURE_NO_PREDICTIONS";
                break;
            case 7:
                str = "FAILURE_PREDICTIONS";
                break;
            case 8:
                str = "SUCCESS_SELECTION";
                break;
            case 9:
                str = "FAILURE_SELECTION";
                break;
            default:
                str = "FAILURE_UNRESOLVABLE";
                break;
        }
        String str2 = this.zza;
        String valueOf = String.valueOf(this.zzb);
        String valueOf2 = String.valueOf(this.zzc);
        String valueOf3 = String.valueOf(this.zzd);
        String valueOf4 = String.valueOf(this.zze);
        return "AutocompleteState{type=" + str + ", query=" + str2 + ", predictions=" + valueOf + ", place=" + valueOf2 + ", prediction=" + valueOf3 + ", status=" + valueOf4 + "}";
    }

    public final Status zza() {
        return this.zze;
    }

    public final AutocompletePrediction zzb() {
        return this.zzd;
    }

    public final Place zzc() {
        return this.zzc;
    }

    public final zzkh zzd() {
        return this.zzb;
    }

    public final String zze() {
        return this.zza;
    }

    public final int zzf() {
        return this.zzf;
    }
}
