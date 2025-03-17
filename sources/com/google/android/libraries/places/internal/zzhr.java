package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;

abstract class zzhr extends zzia {
    private final AutocompleteActivityMode zza;
    private final zzkh zzb;
    private final zzhy zzc;
    private final String zzd;
    private final String zze;
    private final LocationBias zzf;
    private final LocationRestriction zzg;
    private final zzkh zzh;
    private final TypeFilter zzi;
    private final zzkh zzj;
    private final int zzk;
    private final int zzl;

    zzhr(AutocompleteActivityMode autocompleteActivityMode, zzkh zzkh, zzhy zzhy, String str, String str2, LocationBias locationBias, LocationRestriction locationRestriction, zzkh zzkh2, TypeFilter typeFilter, zzkh zzkh3, int i10, int i11) {
        if (autocompleteActivityMode != null) {
            this.zza = autocompleteActivityMode;
            if (zzkh != null) {
                this.zzb = zzkh;
                if (zzhy != null) {
                    this.zzc = zzhy;
                    this.zzd = str;
                    this.zze = str2;
                    this.zzf = locationBias;
                    this.zzg = locationRestriction;
                    if (zzkh2 != null) {
                        this.zzh = zzkh2;
                        this.zzi = typeFilter;
                        if (zzkh3 != null) {
                            this.zzj = zzkh3;
                            this.zzk = i10;
                            this.zzl = i11;
                            return;
                        }
                        throw new NullPointerException("Null typesFilter");
                    }
                    throw new NullPointerException("Null countries");
                }
                throw new NullPointerException("Null origin");
            }
            throw new NullPointerException("Null placeFields");
        }
        throw new NullPointerException("Null mode");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        r1 = r4.zzd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        r1 = r4.zze;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0059, code lost:
        r1 = r4.zzf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006e, code lost:
        r1 = r4.zzg;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008f, code lost:
        r1 = r4.zzi;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.places.internal.zzia
            r2 = 0
            if (r1 == 0) goto L_0x00c2
            com.google.android.libraries.places.internal.zzia r5 = (com.google.android.libraries.places.internal.zzia) r5
            com.google.android.libraries.places.widget.model.AutocompleteActivityMode r1 = r4.zza
            com.google.android.libraries.places.widget.model.AutocompleteActivityMode r3 = r5.zzh()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c2
            com.google.android.libraries.places.internal.zzkh r1 = r4.zzb
            com.google.android.libraries.places.internal.zzkh r3 = r5.zzj()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c2
            com.google.android.libraries.places.internal.zzhy r1 = r4.zzc
            com.google.android.libraries.places.internal.zzhy r3 = r5.zzf()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c2
            java.lang.String r1 = r4.zzd
            if (r1 != 0) goto L_0x003a
            java.lang.String r1 = r5.zzm()
            if (r1 != 0) goto L_0x00c2
            goto L_0x0044
        L_0x003a:
            java.lang.String r3 = r5.zzm()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c2
        L_0x0044:
            java.lang.String r1 = r4.zze
            if (r1 != 0) goto L_0x004f
            java.lang.String r1 = r5.zzl()
            if (r1 != 0) goto L_0x00c2
            goto L_0x0059
        L_0x004f:
            java.lang.String r3 = r5.zzl()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c2
        L_0x0059:
            com.google.android.libraries.places.api.model.LocationBias r1 = r4.zzf
            if (r1 != 0) goto L_0x0064
            com.google.android.libraries.places.api.model.LocationBias r1 = r5.zzc()
            if (r1 != 0) goto L_0x00c2
            goto L_0x006e
        L_0x0064:
            com.google.android.libraries.places.api.model.LocationBias r3 = r5.zzc()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c2
        L_0x006e:
            com.google.android.libraries.places.api.model.LocationRestriction r1 = r4.zzg
            if (r1 != 0) goto L_0x0079
            com.google.android.libraries.places.api.model.LocationRestriction r1 = r5.zzd()
            if (r1 != 0) goto L_0x00c2
            goto L_0x0083
        L_0x0079:
            com.google.android.libraries.places.api.model.LocationRestriction r3 = r5.zzd()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c2
        L_0x0083:
            com.google.android.libraries.places.internal.zzkh r1 = r4.zzh
            com.google.android.libraries.places.internal.zzkh r3 = r5.zzi()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c2
            com.google.android.libraries.places.api.model.TypeFilter r1 = r4.zzi
            if (r1 != 0) goto L_0x009a
            com.google.android.libraries.places.api.model.TypeFilter r1 = r5.zze()
            if (r1 != 0) goto L_0x00c2
            goto L_0x00a5
        L_0x009a:
            com.google.android.libraries.places.api.model.TypeFilter r3 = r5.zze()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x00a5
            goto L_0x00c2
        L_0x00a5:
            com.google.android.libraries.places.internal.zzkh r1 = r4.zzj
            com.google.android.libraries.places.internal.zzkh r3 = r5.zzk()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c2
            int r1 = r4.zzk
            int r3 = r5.zza()
            if (r1 != r3) goto L_0x00c2
            int r1 = r4.zzl
            int r5 = r5.zzb()
            if (r1 != r5) goto L_0x00c2
            return r0
        L_0x00c2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzhr.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = ((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ this.zzc.hashCode();
        String str = this.zzd;
        int i10 = 0;
        int hashCode2 = ((hashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.zze;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        LocationBias locationBias = this.zzf;
        int hashCode4 = (hashCode3 ^ (locationBias == null ? 0 : locationBias.hashCode())) * 1000003;
        LocationRestriction locationRestriction = this.zzg;
        int hashCode5 = (((hashCode4 ^ (locationRestriction == null ? 0 : locationRestriction.hashCode())) * 1000003) ^ this.zzh.hashCode()) * 1000003;
        TypeFilter typeFilter = this.zzi;
        if (typeFilter != null) {
            i10 = typeFilter.hashCode();
        }
        return ((((((hashCode5 ^ i10) * 1000003) ^ this.zzj.hashCode()) * 1000003) ^ this.zzk) * 1000003) ^ this.zzl;
    }

    public final String toString() {
        String obj = this.zza.toString();
        String obj2 = this.zzb.toString();
        String obj3 = this.zzc.toString();
        String str = this.zzd;
        String str2 = this.zze;
        String valueOf = String.valueOf(this.zzf);
        String valueOf2 = String.valueOf(this.zzg);
        String obj4 = this.zzh.toString();
        String valueOf3 = String.valueOf(this.zzi);
        String obj5 = this.zzj.toString();
        int i10 = this.zzk;
        int i11 = this.zzl;
        return "AutocompleteOptions{mode=" + obj + ", placeFields=" + obj2 + ", origin=" + obj3 + ", initialQuery=" + str + ", hint=" + str2 + ", locationBias=" + valueOf + ", locationRestriction=" + valueOf2 + ", countries=" + obj4 + ", typeFilter=" + valueOf3 + ", typesFilter=" + obj5 + ", primaryColor=" + i10 + ", primaryColorDark=" + i11 + "}";
    }

    public final int zza() {
        return this.zzk;
    }

    public final int zzb() {
        return this.zzl;
    }

    public final LocationBias zzc() {
        return this.zzf;
    }

    public final LocationRestriction zzd() {
        return this.zzg;
    }

    @Deprecated
    public final TypeFilter zze() {
        return this.zzi;
    }

    public final zzhy zzf() {
        return this.zzc;
    }

    public final zzhz zzg() {
        return new zzhq(this, (zzhp) null);
    }

    public final AutocompleteActivityMode zzh() {
        return this.zza;
    }

    public final zzkh zzi() {
        return this.zzh;
    }

    public final zzkh zzj() {
        return this.zzb;
    }

    public final zzkh zzk() {
        return this.zzj;
    }

    public final String zzl() {
        return this.zze;
    }

    public final String zzm() {
        return this.zzd;
    }
}
