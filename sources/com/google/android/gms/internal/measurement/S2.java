package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.L4;
import java.util.List;

public final class S2 extends L4<S2, a> implements C7422u5 {
    /* access modifiers changed from: private */
    public static final S2 zzc;
    private static volatile E5<S2> zzd;
    private int zze;
    private String zzf = "";
    private R4<U2> zzg = L4.E();

    public static final class a extends L4.a<S2, a> implements C7422u5 {
        private a() {
            super(S2.zzc);
        }
    }

    static {
        S2 s22 = new S2();
        zzc = s22;
        L4.v(S2.class, s22);
    }

    private S2() {
    }

    public final String K() {
        return this.zzf;
    }

    public final List<U2> L() {
        return this.zzg;
    }

    /* access modifiers changed from: protected */
    public final Object r(int i10, Object obj, Object obj2) {
        switch (Q2.f48790a[i10 - 1]) {
            case 1:
                return new S2();
            case 2:
                return new a();
            case 3:
                return L4.t(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", U2.class});
            case 4:
                return zzc;
            case 5:
                E5<S2> e52 = zzd;
                if (e52 == null) {
                    synchronized (S2.class) {
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
