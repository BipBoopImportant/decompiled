package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.L4;
import java.util.List;

public final class C2 extends L4<C2, a> implements C7422u5 {
    /* access modifiers changed from: private */
    public static final C2 zzc;
    private static volatile E5<C2> zzd;
    /* access modifiers changed from: private */
    public S4 zze = L4.D();
    /* access modifiers changed from: private */
    public S4 zzf = L4.D();
    /* access modifiers changed from: private */
    public R4<C7419u2> zzg = L4.E();
    /* access modifiers changed from: private */
    public R4<D2> zzh = L4.E();

    public static final class a extends L4.a<C2, a> implements C7422u5 {
        public final a A(Iterable<? extends C7419u2> iterable) {
            v();
            C2.K((C2) this.f48734b, iterable);
            return this;
        }

        public final a C() {
            v();
            ((C2) this.f48734b).zzf = L4.D();
            return this;
        }

        public final a D(Iterable<? extends Long> iterable) {
            v();
            C2.N((C2) this.f48734b, iterable);
            return this;
        }

        public final a E() {
            v();
            ((C2) this.f48734b).zzh = L4.E();
            return this;
        }

        public final a G(Iterable<? extends D2> iterable) {
            v();
            C2.Q((C2) this.f48734b, iterable);
            return this;
        }

        public final a H() {
            v();
            ((C2) this.f48734b).zze = L4.D();
            return this;
        }

        public final a I(Iterable<? extends Long> iterable) {
            v();
            C2.T((C2) this.f48734b, iterable);
            return this;
        }

        public final a z() {
            v();
            ((C2) this.f48734b).zzg = L4.E();
            return this;
        }

        private a() {
            super(C2.zzc);
        }
    }

    static {
        C2 c22 = new C2();
        zzc = c22;
        L4.v(C2.class, c22);
    }

    private C2() {
    }

    static /* synthetic */ void K(C2 c22, Iterable iterable) {
        R4<C7419u2> r42 = c22.zzg;
        if (!r42.zzc()) {
            c22.zzg = L4.p(r42);
        }
        T3.h(iterable, c22.zzg);
    }

    static /* synthetic */ void N(C2 c22, Iterable iterable) {
        S4 s42 = c22.zzf;
        if (!s42.zzc()) {
            c22.zzf = L4.q(s42);
        }
        T3.h(iterable, c22.zzf);
    }

    static /* synthetic */ void Q(C2 c22, Iterable iterable) {
        R4<D2> r42 = c22.zzh;
        if (!r42.zzc()) {
            c22.zzh = L4.p(r42);
        }
        T3.h(iterable, c22.zzh);
    }

    static /* synthetic */ void T(C2 c22, Iterable iterable) {
        S4 s42 = c22.zze;
        if (!s42.zzc()) {
            c22.zze = L4.q(s42);
        }
        T3.h(iterable, c22.zze);
    }

    public static a U() {
        return (a) zzc.z();
    }

    public static C2 W() {
        return zzc;
    }

    public final int L() {
        return this.zzf.size();
    }

    public final int O() {
        return this.zzh.size();
    }

    public final int R() {
        return this.zze.size();
    }

    public final List<C7419u2> X() {
        return this.zzg;
    }

    public final List<Long> Y() {
        return this.zzf;
    }

    public final List<D2> Z() {
        return this.zzh;
    }

    public final List<Long> a0() {
        return this.zze;
    }

    public final int m() {
        return this.zzg.size();
    }

    /* access modifiers changed from: protected */
    public final Object r(int i10, Object obj, Object obj2) {
        switch (I2.f48682a[i10 - 1]) {
            case 1:
                return new C2();
            case 2:
                return new a();
            case 3:
                return L4.t(zzc, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", C7419u2.class, "zzh", D2.class});
            case 4:
                return zzc;
            case 5:
                E5<C2> e52 = zzd;
                if (e52 == null) {
                    synchronized (C2.class) {
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
