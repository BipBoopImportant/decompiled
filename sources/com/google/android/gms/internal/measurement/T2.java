package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.L4;
import java.util.List;

public final class T2 extends L4<T2, a> implements C7422u5 {
    /* access modifiers changed from: private */
    public static final T2 zzc;
    private static volatile E5<T2> zzd;
    private int zze;
    private R4<U2> zzf = L4.E();
    private R2 zzg;

    public static final class a extends L4.a<T2, a> implements C7422u5 {
        private a() {
            super(T2.zzc);
        }
    }

    static {
        T2 t22 = new T2();
        zzc = t22;
        L4.v(T2.class, t22);
    }

    private T2() {
    }

    public final R2 J() {
        R2 r22 = this.zzg;
        return r22 == null ? R2.K() : r22;
    }

    public final List<U2> L() {
        return this.zzf;
    }

    /* access modifiers changed from: protected */
    public final Object r(int i10, Object obj, Object obj2) {
        switch (Q2.f48790a[i10 - 1]) {
            case 1:
                return new T2();
            case 2:
                return new a();
            case 3:
                return L4.t(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", U2.class, "zzg"});
            case 4:
                return zzc;
            case 5:
                E5<T2> e52 = zzd;
                if (e52 == null) {
                    synchronized (T2.class) {
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
