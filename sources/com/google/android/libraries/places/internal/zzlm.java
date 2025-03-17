package com.google.android.libraries.places.internal;

public class zzlm {
    private final String zza;
    private final Class zzb;
    private final boolean zzc;

    protected zzlm(String str, Class cls, boolean z10) {
        this(str, cls, z10, true);
    }

    public static zzlm zza(String str, Class cls) {
        return new zzlm(str, cls, false, false);
    }

    public final String toString() {
        String name = getClass().getName();
        String str = this.zza;
        String name2 = this.zzb.getName();
        return name + "/" + str + "[" + name2 + "]";
    }

    public final boolean zzb() {
        return this.zzc;
    }

    private zzlm(String str, Class cls, boolean z10, boolean z11) {
        zznj.zzb(str);
        this.zza = str;
        this.zzb = cls;
        this.zzc = z10;
        System.identityHashCode(this);
        for (int i10 = 0; i10 < 5; i10++) {
        }
    }
}
