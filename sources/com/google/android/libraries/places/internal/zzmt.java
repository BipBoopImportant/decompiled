package com.google.android.libraries.places.internal;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

public final class zzmt extends zzmi {
    /* access modifiers changed from: private */
    public static final Set zza;
    /* access modifiers changed from: private */
    public static final zzma zzb;
    private static final zzmq zzc = new zzmq();
    private final String zzd;
    private final Level zze;
    private final Set zzf;
    private final zzma zzg;

    static {
        Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(new zzlm[]{zzlj.zza, zzlo.zza})));
        zza = unmodifiableSet;
        zzb = zzmd.zza(unmodifiableSet).zzd();
    }

    /* synthetic */ zzmt(String str, String str2, boolean z10, boolean z11, Level level, Set set, zzma zzma, zzms zzms) {
        super(str2);
        if (str2.length() > 23) {
            int i10 = -1;
            int length = str2.length() - 1;
            while (true) {
                if (length < 0) {
                    break;
                }
                char charAt = str2.charAt(length);
                if (charAt == '.' || charAt == '$') {
                    i10 = length;
                } else {
                    length--;
                }
            }
            i10 = length;
            str2 = str2.substring(i10 + 1);
        }
        String concat = "".concat(String.valueOf(str2));
        this.zzd = concat.substring(0, Math.min(concat.length(), 23));
        this.zze = level;
        this.zzf = set;
        this.zzg = zzma;
    }
}
