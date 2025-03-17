package com.google.android.libraries.places.internal;

import xa.C8961b;

final class zzig extends zzil {
    private final C8961b zza;
    private final String zzb;

    zzig(C8961b bVar, String str) {
        this.zza = bVar;
        if (str != null) {
            this.zzb = str;
            return;
        }
        throw new NullPointerException("Null placeId");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzil) {
            zzil zzil = (zzil) obj;
            return this.zza.equals(zzil.zza()) && this.zzb.equals(zzil.zzb());
        }
    }

    public final int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
    }

    public final String toString() {
        String obj = this.zza.toString();
        String str = this.zzb;
        return "PlaceRequest{source=" + obj + ", placeId=" + str + "}";
    }

    public final C8961b zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }
}
