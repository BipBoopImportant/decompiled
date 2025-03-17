package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.L4;
import java.util.List;

public final class R2 extends L4<R2, a> implements C7422u5 {
    /* access modifiers changed from: private */
    public static final R2 zzc;
    private static volatile E5<R2> zzd;
    private R4<S2> zze = L4.E();

    public static final class a extends L4.a<R2, a> implements C7422u5 {
        private a() {
            super(R2.zzc);
        }
    }

    static {
        R2 r22 = new R2();
        zzc = r22;
        L4.v(R2.class, r22);
    }

    private R2() {
    }

    public static R2 K() {
        return zzc;
    }

    public final List<S2> L() {
        return this.zze;
    }

    public final int m() {
        return this.zze.size();
    }

    /* access modifiers changed from: protected */
    public final Object r(int i10, Object obj, Object obj2) {
        switch (Q2.f48790a[i10 - 1]) {
            case 1:
                return new R2();
            case 2:
                return new a();
            case 3:
                return L4.t(zzc, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", S2.class});
            case 4:
                return zzc;
            case 5:
                E5<R2> e52 = zzd;
                if (e52 == null) {
                    synchronized (R2.class) {
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
