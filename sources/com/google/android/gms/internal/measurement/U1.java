package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.L4;
import java.util.List;

public final class U1 extends L4<U1, a> implements C7422u5 {
    /* access modifiers changed from: private */
    public static final U1 zzc;
    private static volatile E5<U1> zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private R4<V1> zzh = L4.E();
    private boolean zzi;
    private W1 zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;

    public static final class a extends L4.a<U1, a> implements C7422u5 {
        public final a A(int i10, V1 v12) {
            v();
            U1.K((U1) this.f48734b, i10, v12);
            return this;
        }

        public final a C(String str) {
            v();
            U1.L((U1) this.f48734b, str);
            return this;
        }

        public final V1 D(int i10) {
            return ((U1) this.f48734b).J(i10);
        }

        public final String E() {
            return ((U1) this.f48734b).Q();
        }

        public final int z() {
            return ((U1) this.f48734b).m();
        }

        private a() {
            super(U1.zzc);
        }
    }

    static {
        U1 u12 = new U1();
        zzc = u12;
        L4.v(U1.class, u12);
    }

    private U1() {
    }

    static /* synthetic */ void K(U1 u12, int i10, V1 v12) {
        v12.getClass();
        R4<V1> r42 = u12.zzh;
        if (!r42.zzc()) {
            u12.zzh = L4.p(r42);
        }
        u12.zzh.set(i10, v12);
    }

    static /* synthetic */ void L(U1 u12, String str) {
        str.getClass();
        u12.zze |= 2;
        u12.zzg = str;
    }

    public static a N() {
        return (a) zzc.z();
    }

    public final V1 J(int i10) {
        return this.zzh.get(i10);
    }

    public final int M() {
        return this.zzf;
    }

    public final W1 P() {
        W1 w12 = this.zzj;
        return w12 == null ? W1.L() : w12;
    }

    public final String Q() {
        return this.zzg;
    }

    public final List<V1> R() {
        return this.zzh;
    }

    public final boolean S() {
        return this.zzk;
    }

    public final boolean T() {
        return this.zzl;
    }

    public final boolean U() {
        return this.zzm;
    }

    public final boolean V() {
        return (this.zze & 8) != 0;
    }

    public final boolean W() {
        return (this.zze & 1) != 0;
    }

    public final boolean X() {
        return (this.zze & 64) != 0;
    }

    public final int m() {
        return this.zzh.size();
    }

    /* access modifiers changed from: protected */
    public final Object r(int i10, Object obj, Object obj2) {
        switch (Z1.f48836a[i10 - 1]) {
            case 1:
                return new U1();
            case 2:
                return new a();
            case 3:
                return L4.t(zzc, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", V1.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
            case 4:
                return zzc;
            case 5:
                E5<U1> e52 = zzd;
                if (e52 == null) {
                    synchronized (U1.class) {
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
