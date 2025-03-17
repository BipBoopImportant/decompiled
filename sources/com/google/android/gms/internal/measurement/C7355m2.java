package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.L4;

/* renamed from: com.google.android.gms.internal.measurement.m2  reason: case insensitive filesystem */
public final class C7355m2 extends L4<C7355m2, a> implements C7422u5 {
    /* access modifiers changed from: private */
    public static final C7355m2 zzc;
    private static volatile E5<C7355m2> zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    /* renamed from: com.google.android.gms.internal.measurement.m2$a */
    public static final class a extends L4.a<C7355m2, a> implements C7422u5 {
        private a() {
            super(C7355m2.zzc);
        }
    }

    static {
        C7355m2 m2Var = new C7355m2();
        zzc = m2Var;
        L4.v(C7355m2.class, m2Var);
    }

    private C7355m2() {
    }

    public final String K() {
        return this.zzf;
    }

    public final String L() {
        return this.zzg;
    }

    /* access modifiers changed from: protected */
    public final Object r(int i10, Object obj, Object obj2) {
        switch (C7283e2.f48908a[i10 - 1]) {
            case 1:
                return new C7355m2();
            case 2:
                return new a();
            case 3:
                return L4.t(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                E5<C7355m2> e52 = zzd;
                if (e52 == null) {
                    synchronized (C7355m2.class) {
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
