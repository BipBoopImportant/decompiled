package com.google.android.libraries.places.api.model;

abstract class zzw extends PlusCode {
    private final String zza;
    private final String zzb;

    zzw(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlusCode) {
            PlusCode plusCode = (PlusCode) obj;
            String str = this.zza;
            if (str != null ? str.equals(plusCode.getCompoundCode()) : plusCode.getCompoundCode() == null) {
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(plusCode.getGlobalCode()) : plusCode.getGlobalCode() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String getCompoundCode() {
        return this.zza;
    }

    public final String getGlobalCode() {
        return this.zzb;
    }

    public final int hashCode() {
        String str = this.zza;
        int i10 = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.zzb;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return ((hashCode ^ 1000003) * 1000003) ^ i10;
    }

    public final String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        return "PlusCode{compoundCode=" + str + ", globalCode=" + str2 + "}";
    }
}
