package com.google.android.libraries.places.internal;

final class zzez {
    private String description;
    private Integer distanceMeters;
    private zzb[] matchedSubstrings;
    private String placeId;
    private zza structuredFormatting;
    private String[] types;

    class zza {
        private String mainText;
        private zzb[] mainTextMatchedSubstrings;
        private String secondaryText;
        private zzb[] secondaryTextMatchedSubstrings;

        zza() {
        }

        /* access modifiers changed from: package-private */
        public final zzkh zza() {
            zzb[] zzbArr = this.mainTextMatchedSubstrings;
            if (zzbArr != null) {
                return zzkh.zzk(zzbArr);
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public final zzkh zzb() {
            zzb[] zzbArr = this.secondaryTextMatchedSubstrings;
            if (zzbArr != null) {
                return zzkh.zzk(zzbArr);
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public final String zzc() {
            return this.mainText;
        }

        /* access modifiers changed from: package-private */
        public final String zzd() {
            return this.secondaryText;
        }
    }

    class zzb {
        Integer length;
        Integer offset;

        zzb() {
        }
    }

    zzez() {
    }

    /* access modifiers changed from: package-private */
    public final zza zza() {
        return this.structuredFormatting;
    }

    /* access modifiers changed from: package-private */
    public final zzkh zzb() {
        zzb[] zzbArr = this.matchedSubstrings;
        if (zzbArr != null) {
            return zzkh.zzk(zzbArr);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final zzkh zzc() {
        String[] strArr = this.types;
        if (strArr != null) {
            return zzkh.zzk(strArr);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final Integer zzd() {
        return this.distanceMeters;
    }

    /* access modifiers changed from: package-private */
    public final String zze() {
        return this.description;
    }

    /* access modifiers changed from: package-private */
    public final String zzf() {
        return this.placeId;
    }
}
