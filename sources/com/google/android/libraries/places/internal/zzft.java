package com.google.android.libraries.places.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

abstract class zzft extends zzem {
    private final Locale zza;
    private final String zzb;
    private final zzho zzc;

    protected zzft(zzhc zzhc, Locale locale, String str, boolean z10, zzho zzho) {
        super(zzhc);
        this.zza = locale;
        this.zzb = str;
        this.zzc = zzho;
    }

    protected static void zzg(Map map, String str, Object obj, Object obj2) {
        String obj3 = obj != null ? obj.toString() : null;
        if (!TextUtils.isEmpty(obj3)) {
            map.put(str, obj3);
        }
    }

    /* access modifiers changed from: protected */
    public final String zzc() {
        zzgf zzgf = new zzgf(zze(), this.zzb);
        zzgf.zza(this.zza);
        zzgf.zzb(zzf());
        return zzgf.zzc();
    }

    /* access modifiers changed from: protected */
    public final Map zzd() {
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.zzc.zza());
        hashMap.put("X-Places-Android-Sdk", "3.2.0");
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public abstract String zze();

    /* access modifiers changed from: protected */
    public abstract Map zzf();
}
