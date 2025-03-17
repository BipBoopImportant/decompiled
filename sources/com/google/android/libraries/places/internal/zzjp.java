package com.google.android.libraries.places.internal;

public final class zzjp {
    public static int zza(int i10, int i11, String str) {
        String str2;
        if (i10 >= 0 && i10 < i11) {
            return i10;
        }
        if (i10 < 0) {
            str2 = zzju.zza("%s (%s) must not be negative", "index", Integer.valueOf(i10));
        } else if (i11 < 0) {
            throw new IllegalArgumentException("negative size: " + i11);
        } else {
            str2 = zzju.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IndexOutOfBoundsException(str2);
    }

    public static int zzb(int i10, int i11, String str) {
        if (i10 >= 0 && i10 <= i11) {
            return i10;
        }
        throw new IndexOutOfBoundsException(zzn(i10, i11, "index"));
    }

    public static Object zzc(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static void zzd(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void zze(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void zzf(boolean z10, String str, char c10) {
        if (!z10) {
            throw new IllegalArgumentException(zzju.zza(str, Character.valueOf(c10)));
        }
    }

    public static void zzg(boolean z10, String str, int i10) {
        if (!z10) {
            throw new IllegalArgumentException(zzju.zza(str, Integer.valueOf(i10)));
        }
    }

    public static void zzh(boolean z10, String str, Object obj, Object obj2, Object obj3) {
        if (!z10) {
            throw new IllegalArgumentException(zzju.zza(str, obj, obj2, obj3));
        }
    }

    public static void zzi(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            throw new IndexOutOfBoundsException((i10 < 0 || i10 > i12) ? zzn(i10, i12, "start index") : (i11 < 0 || i11 > i12) ? zzn(i11, i12, "end index") : zzju.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10)));
        }
    }

    public static void zzj(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static void zzk(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException((String) obj);
        }
    }

    public static void zzl(boolean z10, String str, int i10) {
        if (!z10) {
            throw new IllegalStateException(zzju.zza(str, Integer.valueOf(i10)));
        }
    }

    public static void zzm(boolean z10, String str, Object obj, Object obj2, Object obj3) {
        if (!z10) {
            throw new IllegalStateException(zzju.zza(str, obj, obj2, obj3));
        }
    }

    private static String zzn(int i10, int i11, String str) {
        if (i10 < 0) {
            return zzju.zza("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return zzju.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException("negative size: " + i11);
    }
}
