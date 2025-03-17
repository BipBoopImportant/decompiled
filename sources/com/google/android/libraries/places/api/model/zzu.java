package com.google.android.libraries.places.api.model;

abstract class zzu extends PlaceLikelihood {
    private final Place zza;
    private final double zzb;

    zzu(Place place, double d10) {
        if (place != null) {
            this.zza = place;
            this.zzb = d10;
            return;
        }
        throw new NullPointerException("Null place");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlaceLikelihood) {
            PlaceLikelihood placeLikelihood = (PlaceLikelihood) obj;
            return this.zza.equals(placeLikelihood.getPlace()) && Double.doubleToLongBits(this.zzb) == Double.doubleToLongBits(placeLikelihood.getLikelihood());
        }
    }

    public final double getLikelihood() {
        return this.zzb;
    }

    public final Place getPlace() {
        return this.zza;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.zzb) >>> 32) ^ Double.doubleToLongBits(this.zzb)));
    }

    public final String toString() {
        String obj = this.zza.toString();
        double d10 = this.zzb;
        return "PlaceLikelihood{place=" + obj + ", likelihood=" + d10 + "}";
    }
}
