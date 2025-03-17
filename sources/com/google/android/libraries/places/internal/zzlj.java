package com.google.android.libraries.places.internal;

public final class zzlj {
    public static final zzlm zza = zzlm.zza("cause", Throwable.class);
    public static final zzlm zzb;
    public static final zzlm zzc;
    public static final zzlm zzd = zzlm.zza("ratelimit_period", zzlg.class);
    public static final zzlm zze;
    public static final zzlm zzf = new zzlh("group_by", Object.class, true);
    public static final zzlm zzg = zzlm.zza("forced", Boolean.class);
    public static final zzlm zzh = new zzli("tags", zznh.class, false);
    public static final zzlm zzi = zzlm.zza("stack_size", zzln.class);

    static {
        Class<Integer> cls = Integer.class;
        zzb = zzlm.zza("ratelimit_count", cls);
        zzc = zzlm.zza("sampling_count", cls);
        zze = zzlm.zza("skipped", cls);
    }
}
