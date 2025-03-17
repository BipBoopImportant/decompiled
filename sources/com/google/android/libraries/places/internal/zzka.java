package com.google.android.libraries.places.internal;

final class zzka extends zzkc {
    /* access modifiers changed from: private */
    public static final zzka zzb = new zzka();

    private zzka() {
        super("");
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((zzkc) obj);
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        return "-∞";
    }

    public final int zza(zzkc zzkc) {
        return zzkc == this ? 0 : -1;
    }

    /* access modifiers changed from: package-private */
    public final void zzc(StringBuilder sb2) {
        sb2.append("(-∞");
    }

    /* access modifiers changed from: package-private */
    public final void zzd(StringBuilder sb2) {
        throw new AssertionError();
    }

    /* access modifiers changed from: package-private */
    public final boolean zze(Comparable comparable) {
        return true;
    }
}
