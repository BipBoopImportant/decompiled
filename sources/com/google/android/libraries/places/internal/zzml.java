package com.google.android.libraries.places.internal;

import android.os.Build;
import dalvik.system.VMStack;

public final class zzml extends zzmg {
    /* access modifiers changed from: private */
    public static final boolean zza = zza.zza();
    /* access modifiers changed from: private */
    public static final boolean zzb;
    private static final zzmf zzc = new zzmf() {
        public zzll zza(Class<?> cls, int i10) {
            return zzll.zza;
        }

        public String zzb(Class cls) {
            StackTraceElement zza;
            if (zzml.zza) {
                try {
                    if (cls.equals(zzml.zzp())) {
                        return VMStack.getStackClass2().getName();
                    }
                } catch (Throwable unused) {
                }
            }
            if (!zzml.zzb || (zza = zzni.zza(cls, 1)) == null) {
                return null;
            }
            return zza.getClassName();
        }
    };

    final class zza {
        zza() {
        }

        static boolean zza() {
            return zzml.zzt();
        }
    }

    static {
        String str = Build.FINGERPRINT;
        boolean z10 = true;
        if (str != null && !"robolectric".equals(str)) {
            z10 = false;
        }
        zzb = z10;
    }

    static Class<?> zzp() {
        return VMStack.getStackClass2();
    }

    static String zzq() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean zzt() {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", (Class[]) null);
            return zza.class.getName().equals(zzq());
        } catch (Throwable unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public zzlp zze(String str) {
        return zzmo.zzb(str);
    }

    /* access modifiers changed from: protected */
    public zzmf zzh() {
        return zzc;
    }

    /* access modifiers changed from: protected */
    public zzmu zzj() {
        return zzmp.zzb();
    }

    /* access modifiers changed from: protected */
    public String zzm() {
        return "platform: Android";
    }
}
