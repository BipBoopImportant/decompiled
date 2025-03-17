package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.L4;
import com.google.android.gms.internal.measurement.U1;
import com.google.android.gms.internal.measurement.X1;
import java.util.List;

public final class T1 extends L4<T1, a> implements C7422u5 {
    /* access modifiers changed from: private */
    public static final T1 zzc;
    private static volatile E5<T1> zzd;
    private int zze;
    private int zzf;
    private R4<X1> zzg = L4.E();
    private R4<U1> zzh = L4.E();
    private boolean zzi;
    private boolean zzj;

    public static final class a extends L4.a<T1, a> implements C7422u5 {
        public final a A(int i10, U1.a aVar) {
            v();
            T1.K((T1) this.f48734b, i10, (U1) ((L4) aVar.s()));
            return this;
        }

        public final a C(int i10, X1.a aVar) {
            v();
            T1.L((T1) this.f48734b, i10, (X1) ((L4) aVar.s()));
            return this;
        }

        public final U1 D(int i10) {
            return ((T1) this.f48734b).J(i10);
        }

        public final int E() {
            return ((T1) this.f48734b).O();
        }

        public final X1 G(int i10) {
            return ((T1) this.f48734b).N(i10);
        }

        public final int z() {
            return ((T1) this.f48734b).M();
        }

        private a() {
            super(T1.zzc);
        }
    }

    static {
        T1 t12 = new T1();
        zzc = t12;
        L4.v(T1.class, t12);
    }

    private T1() {
    }

    static /* synthetic */ void K(T1 t12, int i10, U1 u12) {
        u12.getClass();
        R4<U1> r42 = t12.zzh;
        if (!r42.zzc()) {
            t12.zzh = L4.p(r42);
        }
        t12.zzh.set(i10, u12);
    }

    static /* synthetic */ void L(T1 t12, int i10, X1 x12) {
        x12.getClass();
        R4<X1> r42 = t12.zzg;
        if (!r42.zzc()) {
            t12.zzg = L4.p(r42);
        }
        t12.zzg.set(i10, x12);
    }

    public final U1 J(int i10) {
        return this.zzh.get(i10);
    }

    public final int M() {
        return this.zzh.size();
    }

    public final X1 N(int i10) {
        return this.zzg.get(i10);
    }

    public final int O() {
        return this.zzg.size();
    }

    public final List<U1> Q() {
        return this.zzh;
    }

    public final List<X1> R() {
        return this.zzg;
    }

    public final boolean S() {
        return (this.zze & 1) != 0;
    }

    public final int m() {
        return this.zzf;
    }

    /* access modifiers changed from: protected */
    public final Object r(int i10, Object obj, Object obj2) {
        switch (Z1.f48836a[i10 - 1]) {
            case 1:
                return new T1();
            case 2:
                return new a();
            case 3:
                return L4.t(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", X1.class, "zzh", U1.class, "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                E5<T1> e52 = zzd;
                if (e52 == null) {
                    synchronized (T1.class) {
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
