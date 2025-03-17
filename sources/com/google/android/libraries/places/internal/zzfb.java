package com.google.android.libraries.places.internal;

import android.graphics.Bitmap;

public final class zzfb {
    private Bitmap zza;

    public final zzfd zza() {
        zzjp.zzk(this.zza != null, "Photo must be set to non-null value.");
        return new zzfd(this.zza, (zzfc) null);
    }

    public final zzfb zzb(Bitmap bitmap) {
        this.zza = bitmap;
        return this;
    }
}
