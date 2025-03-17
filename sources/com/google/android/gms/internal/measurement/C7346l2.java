package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.L4;

/* renamed from: com.google.android.gms.internal.measurement.l2  reason: case insensitive filesystem */
public final class C7346l2 extends L4<C7346l2, a> implements C7422u5 {
    /* access modifiers changed from: private */
    public static final C7346l2 zzc;
    private static volatile E5<C7346l2> zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    /* renamed from: com.google.android.gms.internal.measurement.l2$a */
    public static final class a extends L4.a<C7346l2, a> implements C7422u5 {
        private a() {
            super(C7346l2.zzc);
        }
    }

    static {
        C7346l2 l2Var = new C7346l2();
        zzc = l2Var;
        L4.v(C7346l2.class, l2Var);
    }

    private C7346l2() {
    }

    /* access modifiers changed from: protected */
    public final Object r(int i10, Object obj, Object obj2) {
        switch (C7283e2.f48908a[i10 - 1]) {
            case 1:
                return new C7346l2();
            case 2:
                return new a();
            case 3:
                return L4.t(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                E5<C7346l2> e52 = zzd;
                if (e52 == null) {
                    synchronized (C7346l2.class) {
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
