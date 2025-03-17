package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.L4;

/* renamed from: com.google.android.gms.internal.measurement.y2  reason: case insensitive filesystem */
public final class C7451y2 extends L4<C7451y2, a> implements C7422u5 {
    /* access modifiers changed from: private */
    public static final C7451y2 zzc;
    private static volatile E5<C7451y2> zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private C7395r2 zzh;

    /* renamed from: com.google.android.gms.internal.measurement.y2$a */
    public static final class a extends L4.a<C7451y2, a> implements C7422u5 {
        private a() {
            super(C7451y2.zzc);
        }
    }

    static {
        C7451y2 y2Var = new C7451y2();
        zzc = y2Var;
        L4.v(C7451y2.class, y2Var);
    }

    private C7451y2() {
    }

    /* access modifiers changed from: protected */
    public final Object r(int i10, Object obj, Object obj2) {
        switch (I2.f48682a[i10 - 1]) {
            case 1:
                return new C7451y2();
            case 2:
                return new a();
            case 3:
                return L4.t(zzc, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                E5<C7451y2> e52 = zzd;
                if (e52 == null) {
                    synchronized (C7451y2.class) {
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
