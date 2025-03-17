package com.google.android.libraries.places.api.model;

abstract class zzr extends PhotoMetadata {
    private final String zza;
    private final int zzb;
    private final int zzc;
    private final String zzd;

    zzr(String str, int i10, int i11, String str2) {
        if (str != null) {
            this.zza = str;
            this.zzb = i10;
            this.zzc = i11;
            if (str2 != null) {
                this.zzd = str2;
                return;
            }
            throw new NullPointerException("Null photoReference");
        }
        throw new NullPointerException("Null attributions");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PhotoMetadata) {
            PhotoMetadata photoMetadata = (PhotoMetadata) obj;
            return this.zza.equals(photoMetadata.getAttributions()) && this.zzb == photoMetadata.getHeight() && this.zzc == photoMetadata.getWidth() && this.zzd.equals(photoMetadata.zza());
        }
    }

    public String getAttributions() {
        return this.zza;
    }

    public int getHeight() {
        return this.zzb;
    }

    public int getWidth() {
        return this.zzc;
    }

    public final int hashCode() {
        return ((((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb) * 1000003) ^ this.zzc) * 1000003) ^ this.zzd.hashCode();
    }

    public final String toString() {
        String str = this.zza;
        int i10 = this.zzb;
        int i11 = this.zzc;
        String str2 = this.zzd;
        return "PhotoMetadata{attributions=" + str + ", height=" + i10 + ", width=" + i11 + ", photoReference=" + str2 + "}";
    }

    public final String zza() {
        return this.zzd;
    }
}
