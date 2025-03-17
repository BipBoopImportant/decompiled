package com.google.android.libraries.places.internal;

import xa.C8961b;

final class zzif extends zzik {
    private final C8961b zza;
    private final String zzb;

    zzif(C8961b bVar, String str) {
        this.zza = bVar;
        if (str != null) {
            this.zzb = str;
            return;
        }
        throw new NullPointerException("Null query");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzik) {
            zzik zzik = (zzik) obj;
            return this.zza.equals(zzik.zza()) && this.zzb.equals(zzik.zzb());
        }
    }

    public final int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
    }

    public final String toString() {
        String obj = this.zza.toString();
        String str = this.zzb;
        return "AutocompleteRequest{source=" + obj + ", query=" + str + "}";
    }

    public final C8961b zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }
}
