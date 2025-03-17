package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.L4;

/* renamed from: com.google.android.gms.internal.measurement.r2  reason: case insensitive filesystem */
public final class C7395r2 extends L4<C7395r2, a> implements C7422u5 {
    /* access modifiers changed from: private */
    public static final C7395r2 zzc;
    private static volatile E5<C7395r2> zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";

    /* renamed from: com.google.android.gms.internal.measurement.r2$a */
    public static final class a extends L4.a<C7395r2, a> implements C7422u5 {
        private a() {
            super(C7395r2.zzc);
        }
    }

    static {
        C7395r2 r2Var = new C7395r2();
        zzc = r2Var;
        L4.v(C7395r2.class, r2Var);
    }

    private C7395r2() {
    }

    /* access modifiers changed from: protected */
    public final Object r(int i10, Object obj, Object obj2) {
        switch (I2.f48682a[i10 - 1]) {
            case 1:
                return new C7395r2();
            case 2:
                return new a();
            case 3:
                return L4.t(zzc, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
            case 4:
                return zzc;
            case 5:
                E5<C7395r2> e52 = zzd;
                if (e52 == null) {
                    synchronized (C7395r2.class) {
                        try {
                            e52 = zzd;
                            if (e52 == null) {
                                e52 = new L4.c<>(zzc);
                                zzd = e52;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                return e52;
            case 6:
                return (byte) 1;
            default:
                throw null;
        }
    }
}
