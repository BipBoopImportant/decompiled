package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.L4;

/* renamed from: com.google.android.gms.internal.measurement.k2  reason: case insensitive filesystem */
public final class C7337k2 extends L4<C7337k2, a> implements C7422u5 {
    /* access modifiers changed from: private */
    public static final C7337k2 zzc;
    private static volatile E5<C7337k2> zzd;
    private int zze;
    private int zzf = 14;
    private int zzg = 11;
    private int zzh = 60;

    /* renamed from: com.google.android.gms.internal.measurement.k2$a */
    public static final class a extends L4.a<C7337k2, a> implements C7422u5 {
        private a() {
            super(C7337k2.zzc);
        }
    }

    static {
        C7337k2 k2Var = new C7337k2();
        zzc = k2Var;
        L4.v(C7337k2.class, k2Var);
    }

    private C7337k2() {
    }

    /* access modifiers changed from: protected */
    public final Object r(int i10, Object obj, Object obj2) {
        switch (C7283e2.f48908a[i10 - 1]) {
            case 1:
                return new C7337k2();
            case 2:
                return new a();
            case 3:
                return L4.t(zzc, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                E5<C7337k2> e52 = zzd;
                if (e52 == null) {
                    synchronized (C7337k2.class) {
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
