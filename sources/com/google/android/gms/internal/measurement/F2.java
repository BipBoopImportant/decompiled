package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.L4;

public final class F2 extends L4<F2, a> implements C7422u5 {
    /* access modifiers changed from: private */
    public static final F2 zzc;
    private static volatile E5<F2> zzd;
    private int zze;
    private long zzf;
    private String zzg = "";
    private String zzh = "";
    private long zzi;
    private float zzj;
    private double zzk;

    public static final class a extends L4.a<F2, a> implements C7422u5 {
        public final a A(double d10) {
            v();
            F2.L((F2) this.f48734b, d10);
            return this;
        }

        public final a C(long j10) {
            v();
            F2.M((F2) this.f48734b, j10);
            return this;
        }

        public final a D(String str) {
            v();
            F2.N((F2) this.f48734b, str);
            return this;
        }

        public final a E() {
            v();
            F2.P((F2) this.f48734b);
            return this;
        }

        public final a G(long j10) {
            v();
            F2.Q((F2) this.f48734b, j10);
            return this;
        }

        public final a H(String str) {
            v();
            F2.R((F2) this.f48734b, str);
            return this;
        }

        public final a I() {
            v();
            F2.T((F2) this.f48734b);
            return this;
        }

        public final a z() {
            v();
            F2.K((F2) this.f48734b);
            return this;
        }

        private a() {
            super(F2.zzc);
        }
    }

    static {
        F2 f22 = new F2();
        zzc = f22;
        L4.v(F2.class, f22);
    }

    private F2() {
    }

    static /* synthetic */ void K(F2 f22) {
        f22.zze &= -33;
        f22.zzk = 0.0d;
    }

    static /* synthetic */ void L(F2 f22, double d10) {
        f22.zze |= 32;
        f22.zzk = d10;
    }

    static /* synthetic */ void M(F2 f22, long j10) {
        f22.zze |= 8;
        f22.zzi = j10;
    }

    static /* synthetic */ void N(F2 f22, String str) {
        str.getClass();
        f22.zze |= 2;
        f22.zzg = str;
    }

    static /* synthetic */ void P(F2 f22) {
        f22.zze &= -9;
        f22.zzi = 0;
    }

    static /* synthetic */ void Q(F2 f22, long j10) {
        f22.zze |= 1;
        f22.zzf = j10;
    }

    static /* synthetic */ void R(F2 f22, String str) {
        str.getClass();
        f22.zze |= 4;
        f22.zzh = str;
    }

    static /* synthetic */ void T(F2 f22) {
        f22.zze &= -5;
        f22.zzh = zzc.zzh;
    }

    public static a V() {
        return (a) zzc.z();
    }

    public final double J() {
        return this.zzk;
    }

    public final float O() {
        return this.zzj;
    }

    public final long S() {
        return this.zzi;
    }

    public final long U() {
        return this.zzf;
    }

    public final String X() {
        return this.zzg;
    }

    public final String Y() {
        return this.zzh;
    }

    public final boolean Z() {
        return (this.zze & 32) != 0;
    }

    public final boolean a0() {
        return (this.zze & 16) != 0;
    }

    public final boolean b0() {
        return (this.zze & 8) != 0;
    }

    public final boolean c0() {
        return (this.zze & 1) != 0;
    }

    public final boolean d0() {
        return (this.zze & 4) != 0;
    }

    /* access modifiers changed from: protected */
    public final Object r(int i10, Object obj, Object obj2) {
        switch (I2.f48682a[i10 - 1]) {
            case 1:
                return new F2();
            case 2:
                return new a();
            case 3:
                return L4.t(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                E5<F2> e52 = zzd;
                if (e52 == null) {
                    synchronized (F2.class) {
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
