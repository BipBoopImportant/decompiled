package com.google.android.libraries.places.internal;

import java.lang.reflect.InvocationTargetException;

final class zzme {
    /* access modifiers changed from: private */
    public static final zzmg zza = zzb(zzmg.zzd);

    private static zzmg zzb(String[] strArr) {
        zzmg zzmg;
        try {
            zzmg = zzmh.zza();
        } catch (NoClassDefFoundError unused) {
            zzmg = null;
        }
        if (zzmg != null) {
            return zzmg;
        }
        StringBuilder sb2 = new StringBuilder();
        int length = strArr.length;
        int i10 = 0;
        while (i10 < length) {
            String str = strArr[i10];
            try {
                return (zzmg) Class.forName(str).getConstructor((Class[]) null).newInstance((Object[]) null);
            } catch (Throwable th2) {
                th = th2;
                if (th instanceof InvocationTargetException) {
                    th = th.getCause();
                }
                sb2.append(10);
                sb2.append(str);
                sb2.append(": ");
                sb2.append(th);
                i10++;
            }
        }
        throw new IllegalStateException(sb2.insert(0, "No logging platforms found:").toString());
    }
}
