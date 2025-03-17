package com.google.android.libraries.places.internal;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class zzni {
    private static final String[] zza;
    private static final zznm zzb;

    static {
        zznm zznn;
        String[] strArr = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
        zza = strArr;
        int i10 = 0;
        while (true) {
            if (i10 >= 2) {
                zznn = new zznn();
                break;
            }
            zznn = null;
            try {
                zznn = (zznm) Class.forName(strArr[i10]).asSubclass(zznm.class).getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
            } catch (Throwable unused) {
            }
            if (zznn != null) {
                break;
            }
            i10++;
        }
        zzb = zznn;
    }

    @NullableDecl
    public static StackTraceElement zza(Class cls, int i10) {
        zznj.zza(cls, "target");
        return zzb.zza(cls, 2);
    }
}
