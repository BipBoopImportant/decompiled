package com.google.android.libraries.places.internal;

import java.io.Closeable;

public final class zznl implements Closeable {
    private static final ThreadLocal zza = new zznk();
    private int zzb = 0;

    public static int zza() {
        return ((zznl) zza.get()).zzb;
    }

    public final void close() {
        int i10 = this.zzb;
        if (i10 > 0) {
            this.zzb = i10 - 1;
            return;
        }
        throw new AssertionError("Mismatched calls to RecursionDepth (possible error in core library)");
    }
}
