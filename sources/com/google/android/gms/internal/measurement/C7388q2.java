package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.L4;

/* renamed from: com.google.android.gms.internal.measurement.q2  reason: case insensitive filesystem */
public final class C7388q2 extends L4<C7388q2, a> implements C7422u5 {
    /* access modifiers changed from: private */
    public static final C7388q2 zzc;
    private static volatile E5<C7388q2> zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private long zzi;
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";
    private long zzm;

    /* renamed from: com.google.android.gms.internal.measurement.q2$a */
    public static final class a extends L4.a<C7388q2, a> implements C7422u5 {
        public final a A(long j10) {
            v();
            C7388q2.L((C7388q2) this.f48734b, j10);
            return this;
        }

        public final a C(String str) {
            v();
            C7388q2.M((C7388q2) this.f48734b, str);
            return this;
        }

        public final long D() {
            return ((C7388q2) this.f48734b).N();
        }

        public final a E(long j10) {
            v();
            C7388q2.P((C7388q2) this.f48734b, j10);
            return this;
        }

        public final a G(String str) {
            v();
            C7388q2.Q((C7388q2) this.f48734b, str);
            return this;
        }

        public final a H() {
            v();
            C7388q2.K((C7388q2) this.f48734b);
            return this;
        }

        public final a I(String str) {
            v();
            C7388q2.T((C7388q2) this.f48734b, str);
            return this;
        }

        public final a K() {
            v();
            C7388q2.O((C7388q2) this.f48734b);
            return this;
        }

        public final a L(String str) {
            v();
            C7388q2.W((C7388q2) this.f48734b, str);
            return this;
        }

        public final a M() {
            v();
            C7388q2.S((C7388q2) this.f48734b);
            return this;
        }

        public final a N(String str) {
            v();
            C7388q2.Z((C7388q2) this.f48734b, str);
            return this;
        }

        public final a O() {
            v();
            C7388q2.V((C7388q2) this.f48734b);
            return this;
        }

        public final a P(String str) {
            v();
            C7388q2.c0((C7388q2) this.f48734b, str);
            return this;
        }

        public final a Q() {
            v();
            C7388q2.Y((C7388q2) this.f48734b);
            return this;
        }

        public final a R() {
            v();
            C7388q2.b0((C7388q2) this.f48734b);
            return this;
        }

        public final long z() {
            return ((C7388q2) this.f48734b).J();
        }

        private a() {
            super(C7388q2.zzc);
        }
    }

    static {
        C7388q2 q2Var = new C7388q2();
        zzc = q2Var;
        L4.v(C7388q2.class, q2Var);
    }

    private C7388q2() {
    }

    static /* synthetic */ void K(C7388q2 q2Var) {
        q2Var.zze &= -5;
        q2Var.zzh = zzc.zzh;
    }

    static /* synthetic */ void L(C7388q2 q2Var, long j10) {
        q2Var.zze |= 8;
        q2Var.zzi = j10;
    }

    static /* synthetic */ void M(C7388q2 q2Var, String str) {
        str.getClass();
        q2Var.zze |= 4;
        q2Var.zzh = str;
    }

    static /* synthetic */ void O(C7388q2 q2Var) {
        q2Var.zze &= -3;
        q2Var.zzg = zzc.zzg;
    }

    static /* synthetic */ void P(C7388q2 q2Var, long j10) {
        q2Var.zze |= 128;
        q2Var.zzm = j10;
    }

    static /* synthetic */ void Q(C7388q2 q2Var, String str) {
        str.getClass();
        q2Var.zze |= 2;
        q2Var.zzg = str;
    }

    public static a R() {
        return (a) zzc.z();
    }

    static /* synthetic */ void S(C7388q2 q2Var) {
        q2Var.zze &= -2;
        q2Var.zzf = zzc.zzf;
    }

    static /* synthetic */ void T(C7388q2 q2Var, String str) {
        str.getClass();
        q2Var.zze |= 1;
        q2Var.zzf = str;
    }

    static /* synthetic */ void V(C7388q2 q2Var) {
        q2Var.zze &= -65;
        q2Var.zzl = zzc.zzl;
    }

    static /* synthetic */ void W(C7388q2 q2Var, String str) {
        str.getClass();
        q2Var.zze |= 64;
        q2Var.zzl = str;
    }

    public static C7388q2 X() {
        return zzc;
    }

    static /* synthetic */ void Y(C7388q2 q2Var) {
        q2Var.zze &= -33;
        q2Var.zzk = zzc.zzk;
    }

    static /* synthetic */ void Z(C7388q2 q2Var, String str) {
        str.getClass();
        q2Var.zze |= 32;
        q2Var.zzk = str;
    }

    static /* synthetic */ void b0(C7388q2 q2Var) {
        q2Var.zze &= -17;
        q2Var.zzj = zzc.zzj;
    }

    static /* synthetic */ void c0(C7388q2 q2Var, String str) {
        str.getClass();
        q2Var.zze |= 16;
        q2Var.zzj = str;
    }

    public final long J() {
        return this.zzi;
    }

    public final long N() {
        return this.zzm;
    }

    public final String a0() {
        return this.zzh;
    }

    public final String d0() {
        return this.zzg;
    }

    public final String e0() {
        return this.zzf;
    }

    public final String f0() {
        return this.zzl;
    }

    public final String g0() {
        return this.zzk;
    }

    public final String h0() {
        return this.zzj;
    }

    public final boolean i0() {
        return (this.zze & 4) != 0;
    }

    public final boolean j0() {
        return (this.zze & 2) != 0;
    }

    public final boolean k0() {
        return (this.zze & 1) != 0;
    }

    public final boolean l0() {
        return (this.zze & 8) != 0;
    }

    public final boolean m0() {
        return (this.zze & 128) != 0;
    }

    public final boolean n0() {
        return (this.zze & 64) != 0;
    }

    public final boolean o0() {
        return (this.zze & 32) != 0;
    }

    public final boolean p0() {
        return (this.zze & 16) != 0;
    }

    /* access modifiers changed from: protected */
    public final Object r(int i10, Object obj, Object obj2) {
        switch (I2.f48682a[i10 - 1]) {
            case 1:
                return new C7388q2();
            case 2:
                return new a();
            case 3:
                return L4.t(zzc, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
            case 4:
                return zzc;
            case 5:
                E5<C7388q2> e52 = zzd;
                if (e52 == null) {
                    synchronized (C7388q2.class) {
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
