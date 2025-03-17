package com.google.android.libraries.places.internal;

import java.util.List;

final class zzaij {
    public static final /* synthetic */ int zza = 0;
    private static final Class zzb;
    private static final zzaiy zzc;
    private static final zzaiy zzd = new zzaja();

    static {
        Class<?> cls;
        Class<?> cls2;
        zzaiy zzaiy = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zzb = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                zzaiy = (zzaiy) cls2.getConstructor((Class[]) null).newInstance((Object[]) null);
            } catch (Throwable unused3) {
            }
        }
        zzc = zzaiy;
    }

    static void zzA(zzaiy zzaiy, Object obj, Object obj2) {
        zzaiy.zzf(obj, zzaiy.zzd(zzaiy.zzc(obj), zzaiy.zzc(obj2)));
    }

    public static void zzB(Class cls) {
        Class cls2;
        if (!zzago.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzC(int i10, List list, zzajp zzajp, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzajp.zzc(i10, list, z10);
        }
    }

    public static void zzD(int i10, List list, zzajp zzajp) {
        if (list != null && !list.isEmpty()) {
            zzajp.zze(i10, list);
        }
    }

    public static void zzE(int i10, List list, zzajp zzajp, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzajp.zzg(i10, list, z10);
        }
    }

    public static void zzF(int i10, List list, zzajp zzajp, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzajp.zzi(i10, list, z10);
        }
    }

    public static void zzG(int i10, List list, zzajp zzajp, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzajp.zzk(i10, list, z10);
        }
    }

    public static void zzH(int i10, List list, zzajp zzajp, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzajp.zzm(i10, list, z10);
        }
    }

    public static void zzI(int i10, List list, zzajp zzajp, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzajp.zzo(i10, list, z10);
        }
    }

    public static void zzJ(int i10, List list, zzajp zzajp, zzaih zzaih) {
        if (list != null && !list.isEmpty()) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((zzagc) zzajp).zzp(i10, list.get(i11), zzaih);
            }
        }
    }

    public static void zzK(int i10, List list, zzajp zzajp, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzajp.zzr(i10, list, z10);
        }
    }

    public static void zzL(int i10, List list, zzajp zzajp, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzajp.zzt(i10, list, z10);
        }
    }

    public static void zzM(int i10, List list, zzajp zzajp, zzaih zzaih) {
        if (list != null && !list.isEmpty()) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((zzagc) zzajp).zzu(i10, list.get(i11), zzaih);
            }
        }
    }

    public static void zzN(int i10, List list, zzajp zzajp, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzajp.zzw(i10, list, z10);
        }
    }

    public static void zzO(int i10, List list, zzajp zzajp, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzajp.zzy(i10, list, z10);
        }
    }

    public static void zzP(int i10, List list, zzajp zzajp, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzajp.zzA(i10, list, z10);
        }
    }

    public static void zzQ(int i10, List list, zzajp zzajp, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzajp.zzC(i10, list, z10);
        }
    }

    public static void zzR(int i10, List list, zzajp zzajp) {
        if (list != null && !list.isEmpty()) {
            zzajp.zzE(i10, list);
        }
    }

    public static void zzS(int i10, List list, zzajp zzajp, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzajp.zzG(i10, list, z10);
        }
    }

    public static void zzT(int i10, List list, zzajp zzajp, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzajp.zzI(i10, list, z10);
        }
    }

    static boolean zzU(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null) {
            return obj.equals(obj2);
        }
        return false;
    }

    static int zza(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzagb.zzx(i10 << 3) + 1);
    }

    static int zzb(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzx = size * zzagb.zzx(i10 << 3);
        for (int i11 = 0; i11 < list.size(); i11++) {
            int zzd2 = ((zzaft) list.get(i11)).zzd();
            zzx += zzagb.zzx(zzd2) + zzd2;
        }
        return zzx;
    }

    static int zzc(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzd(list) + (size * zzagb.zzx(i10 << 3));
    }

    static int zzd(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzagp) {
            zzagp zzagp = (zzagp) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzagb.zzu(zzagp.zzd(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzagb.zzu(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int zze(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzagb.zzx(i10 << 3) + 4);
    }

    static int zzf(List list) {
        return list.size() * 4;
    }

    static int zzg(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzagb.zzx(i10 << 3) + 8);
    }

    static int zzh(List list) {
        return list.size() * 8;
    }

    static int zzi(int i10, List list, zzaih zzaih) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += zzagb.zzt(i10, (zzahw) list.get(i12), zzaih);
        }
        return i11;
    }

    static int zzj(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzk(list) + (size * zzagb.zzx(i10 << 3));
    }

    static int zzk(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzagp) {
            zzagp zzagp = (zzagp) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzagb.zzu(zzagp.zzd(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzagb.zzu(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int zzl(int i10, List list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return zzm(list) + (list.size() * zzagb.zzx(i10 << 3));
    }

    static int zzm(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzahl) {
            zzahl zzahl = (zzahl) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzagb.zzy(zzahl.zzd(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzagb.zzy(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    static int zzn(int i10, Object obj, zzaih zzaih) {
        if (obj instanceof zzahc) {
            int i11 = zzagb.zzb;
            int zza2 = ((zzahc) obj).zza();
            return zzagb.zzx(i10 << 3) + zzagb.zzx(zza2) + zza2;
        }
        return zzagb.zzx(i10 << 3) + zzagb.zzv((zzahw) obj, zzaih);
    }

    static int zzo(int i10, List list, zzaih zzaih) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzx = zzagb.zzx(i10 << 3) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof zzahc) {
                int zza2 = ((zzahc) obj).zza();
                zzx += zzagb.zzx(zza2) + zza2;
            } else {
                zzx += zzagb.zzv((zzahw) obj, zzaih);
            }
        }
        return zzx;
    }

    static int zzp(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzq(list) + (size * zzagb.zzx(i10 << 3));
    }

    static int zzq(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzagp) {
            zzagp zzagp = (zzagp) list;
            i10 = 0;
            while (i11 < size) {
                int zzd2 = zzagp.zzd(i11);
                i10 += zzagb.zzx((zzd2 >> 31) ^ (zzd2 + zzd2));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                int intValue = ((Integer) list.get(i11)).intValue();
                i12 = i10 + zzagb.zzx((intValue >> 31) ^ (intValue + intValue));
                i11++;
            }
        }
        return i10;
    }

    static int zzr(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzs(list) + (size * zzagb.zzx(i10 << 3));
    }

    static int zzs(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzahl) {
            zzahl zzahl = (zzahl) list;
            i10 = 0;
            while (i11 < size) {
                long zzd2 = zzahl.zzd(i11);
                i10 += zzagb.zzy((zzd2 >> 63) ^ (zzd2 + zzd2));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                long longValue = ((Long) list.get(i11)).longValue();
                i12 = i10 + zzagb.zzy((longValue >> 63) ^ (longValue + longValue));
                i11++;
            }
        }
        return i10;
    }

    static int zzt(int i10, List list) {
        int zzw;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        boolean z10 = list instanceof zzahe;
        int zzx = zzagb.zzx(i10 << 3) * size;
        if (z10) {
            zzahe zzahe = (zzahe) list;
            while (i11 < size) {
                Object zze = zzahe.zze(i11);
                if (zze instanceof zzaft) {
                    int zzd2 = ((zzaft) zze).zzd();
                    zzx += zzagb.zzx(zzd2) + zzd2;
                } else {
                    zzx += zzagb.zzw((String) zze);
                }
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof zzaft) {
                    int zzd3 = ((zzaft) obj).zzd();
                    zzw = zzx + zzagb.zzx(zzd3) + zzd3;
                } else {
                    zzw = zzx + zzagb.zzw((String) obj);
                }
                i11++;
            }
        }
        return zzx;
    }

    static int zzu(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzv(list) + (size * zzagb.zzx(i10 << 3));
    }

    static int zzv(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzagp) {
            zzagp zzagp = (zzagp) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzagb.zzx(zzagp.zzd(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzagb.zzx(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int zzw(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzx(list) + (size * zzagb.zzx(i10 << 3));
    }

    static int zzx(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzahl) {
            zzahl zzahl = (zzahl) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzagb.zzy(zzahl.zzd(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzagb.zzy(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static zzaiy zzy() {
        return zzc;
    }

    public static zzaiy zzz() {
        return zzd;
    }
}
