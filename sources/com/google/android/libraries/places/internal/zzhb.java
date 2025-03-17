package com.google.android.libraries.places.internal;

import java.util.Locale;

public final class zzhb {
    private volatile String zza;
    private volatile Locale zzb;
    private volatile boolean zzc;

    public final synchronized String zza() {
        zzjp.zzk(zzf(), "ApiConfig must be initialized.");
        if (this.zza != null) {
        } else {
            throw null;
        }
        return this.zza;
    }

    public final synchronized Locale zzb() {
        try {
            zzjp.zzk(zzf(), "ApiConfig must be initialized.");
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.zzb == null ? Locale.getDefault() : this.zzb;
    }

    public final synchronized void zzc() {
        this.zza = null;
        this.zzb = null;
    }

    public final synchronized void zzd(String str, Locale locale, boolean z10) {
        zzjp.zzc(str, "API Key must not be null.");
        zzjp.zze(!str.isEmpty(), "API Key must not be empty.");
        this.zza = str;
        this.zzb = locale;
        this.zzc = false;
    }

    public final boolean zze() {
        return false;
    }

    public final synchronized boolean zzf() {
        return this.zza != null;
    }
}
