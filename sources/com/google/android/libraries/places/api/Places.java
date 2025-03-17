package com.google.android.libraries.places.api;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.google.android.libraries.places.internal.zzgx;
import com.google.android.libraries.places.internal.zzgy;
import com.google.android.libraries.places.internal.zzgz;
import com.google.android.libraries.places.internal.zzhb;
import com.google.android.libraries.places.internal.zzhi;
import com.google.android.libraries.places.internal.zzhk;
import com.google.android.libraries.places.internal.zzjp;
import java.util.Locale;

public final class Places {
    private static final zzhb zza = new zzhb();
    private static volatile zzgz zzb;

    private Places() {
    }

    @RecentlyNonNull
    public static synchronized PlacesClient createClient(@RecentlyNonNull Context context) {
        PlacesClient zza2;
        synchronized (Places.class) {
            try {
                zzjp.zzc(context, "Context must not be null.");
                zza2 = zza(context, zzhi.zzd(context).zze());
            } catch (Error | RuntimeException e10) {
                zzhk.zzb(e10);
                throw e10;
            }
        }
        return zza2;
    }

    public static synchronized void deinitialize() {
        synchronized (Places.class) {
            zza.zzc();
        }
    }

    public static void initialize(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
        try {
            zzb(context, str, (Locale) null, false);
        } catch (Error | RuntimeException e10) {
            zzhk.zzb(e10);
            throw e10;
        }
    }

    public static synchronized boolean isInitialized() {
        boolean zzf;
        synchronized (Places.class) {
            try {
                zzf = zza.zzf();
            } catch (Error | RuntimeException e10) {
                zzhk.zzb(e10);
                throw e10;
            }
        }
        return zzf;
    }

    public static synchronized PlacesClient zza(Context context, zzhi zzhi) {
        PlacesClient zza2;
        synchronized (Places.class) {
            try {
                zzjp.zzc(context, "Context must not be null.");
                zzjp.zzk(isInitialized(), "Places must be initialized first.");
                zzgy zza3 = zzgx.zza();
                zza3.zzc(context);
                zza3.zza(zza);
                zza3.zzb(zzhi);
                zza2 = zza3.zzd().zza();
            } catch (Error | RuntimeException e10) {
                zzhk.zzb(e10);
                throw e10;
            }
        }
        return zza2;
    }

    public static synchronized void zzb(@RecentlyNonNull Context context, @RecentlyNonNull String str, Locale locale, boolean z10) {
        synchronized (Places.class) {
            try {
                zzjp.zzc(context, "Application context must not be null.");
                zzjp.zzc(str, "API Key must not be null.");
                zzjp.zze(!str.isEmpty(), "API Key must not be empty.");
                zzhk.zza(context.getApplicationContext(), false);
                zza.zzd(str, locale, false);
            } catch (Error | RuntimeException e10) {
                zzhk.zzb(e10);
                throw e10;
            }
        }
    }

    public static synchronized zzhb zzc() {
        zzhb zzhb;
        synchronized (Places.class) {
            zzhb = zza;
        }
        return zzhb;
    }

    public static synchronized void initialize(@RecentlyNonNull Context context, @RecentlyNonNull String str, Locale locale) {
        synchronized (Places.class) {
            try {
                zzb(context, str, locale, false);
            } catch (Error | RuntimeException e10) {
                zzhk.zzb(e10);
                throw e10;
            }
        }
    }
}
