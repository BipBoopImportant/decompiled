package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.L4;
import java.util.List;

public final class D2 extends L4<D2, a> implements C7422u5 {
    /* access modifiers changed from: private */
    public static final D2 zzc;
    private static volatile E5<D2> zzd;
    private int zze;
    private int zzf;
    private S4 zzg = L4.D();

    public static final class a extends L4.a<D2, a> implements C7422u5 {
        public final a A(Iterable<? extends Long> iterable) {
            v();
            D2.L((D2) this.f48734b, iterable);
            return this;
        }

        public final a z(int i10) {
            v();
            D2.K((D2) this.f48734b, i10);
            return this;
        }

        private a() {
            super(D2.zzc);
        }
    }

    static {
        D2 d22 = new D2();
        zzc = d22;
        L4.v(D2.class, d22);
    }

    private D2() {
    }

    static /* synthetic */ void K(D2 d22, int i10) {
        d22.zze |= 1;
        d22.zzf = i10;
    }

    static /* synthetic */ void L(D2 d22, Iterable iterable) {
        S4 s42 = d22.zzg;
        if (!s42.zzc()) {
            d22.zzg = L4.q(s42);
        }
        T3.h(iterable, d22.zzg);
    }

    public static a N() {
        return (a) zzc.z();
    }

    public final long J(int i10) {
        return this.zzg.d(i10);
    }

    public final int M() {
        return this.zzf;
    }

    public final List<Long> P() {
        return this.zzg;
    }

    public final boolean Q() {
        return (this.zze & 1) != 0;
    }

    public final int m() {
        return this.zzg.size();
    }

    /* access modifiers changed from: protected */
    public final Object r(int i10, Object obj, Object obj2) {
        switch (I2.f48682a[i10 - 1]) {
            case 1:
                return new D2();
            case 2:
                return new a();
            case 3:
                return L4.t(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                E5<D2> e52 = zzd;
                if (e52 == null) {
                    synchronized (D2.class) {
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
