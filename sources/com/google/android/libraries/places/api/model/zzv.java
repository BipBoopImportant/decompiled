package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.PlusCode;

final class zzv extends PlusCode.Builder {
    private String zza;
    private String zzb;

    zzv() {
    }

    public final PlusCode build() {
        return new zzbc(this.zza, this.zzb);
    }

    public final String getCompoundCode() {
        return this.zza;
    }

    public final String getGlobalCode() {
        return this.zzb;
    }

    public final PlusCode.Builder setCompoundCode(String str) {
        this.zza = str;
        return this;
    }

    public final PlusCode.Builder setGlobalCode(String str) {
        this.zzb = str;
        return this;
    }
}
