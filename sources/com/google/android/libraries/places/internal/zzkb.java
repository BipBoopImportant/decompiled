package com.google.android.libraries.places.internal;

final class zzkb extends zzkc {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzkb(Comparable comparable) {
        super(comparable);
        comparable.getClass();
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        String obj = this.zza.toString();
        return "\\" + obj + "/";
    }

    /* access modifiers changed from: package-private */
    public final void zzc(StringBuilder sb2) {
        sb2.append('[');
        sb2.append(this.zza);
    }

    /* access modifiers changed from: package-private */
    public final void zzd(StringBuilder sb2) {
        sb2.append(this.zza);
        sb2.append(')');
    }

    /* access modifiers changed from: package-private */
    public final boolean zze(Comparable comparable) {
        Comparable comparable2 = this.zza;
        int i10 = zzkt.zzc;
        return comparable2.compareTo(comparable) <= 0;
    }
}
