package com.google.android.libraries.places.internal;

import android.os.SystemClock;

public final class zzdn {
    private static final zzde zza = new zzdh();
    private static final zzdn zzb = new zzdn(SystemClock.elapsedRealtime());

    private zzdn(long j10) {
    }

    public static zzdn zza() {
        return new zzdn(SystemClock.elapsedRealtime());
    }

    private zzdn() {
        SystemClock.elapsedRealtime();
    }
}
