package com.google.android.libraries.places.internal;

import java.util.Collections;
import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class zznh {
    /* access modifiers changed from: private */
    public static final Comparator zza = new zzmz();
    private static final Comparator zzb = new zzna();
    private static final zznh zzc = new zznh(new zznf(Collections.emptyList()));
    private final zznf zzd;

    private zznh(zznf zznf) {
        this.zzd = zznf;
    }

    public static zznh zza() {
        return zzc;
    }

    public final boolean equals(@NullableDecl Object obj) {
        return (obj instanceof zznh) && ((zznh) obj).zzd.equals(this.zzd);
    }

    public final int hashCode() {
        return ~this.zzd.hashCode();
    }

    public final String toString() {
        return this.zzd.toString();
    }
}
