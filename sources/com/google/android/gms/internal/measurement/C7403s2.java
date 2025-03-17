package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.L4;

/* renamed from: com.google.android.gms.internal.measurement.s2  reason: case insensitive filesystem */
public final class C7403s2 extends L4<C7403s2, a> implements C7422u5 {
    /* access modifiers changed from: private */
    public static final C7403s2 zzc;
    private static volatile E5<C7403s2> zzd;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    /* renamed from: com.google.android.gms.internal.measurement.s2$a */
    public static final class a extends L4.a<C7403s2, a> implements C7422u5 {
        public final a A(boolean z10) {
            v();
            C7403s2.M((C7403s2) this.f48734b, z10);
            return this;
        }

        public final a C(boolean z10) {
            v();
            C7403s2.O((C7403s2) this.f48734b, z10);
            return this;
        }

        public final a D(boolean z10) {
            v();
            C7403s2.P((C7403s2) this.f48734b, z10);
            return this;
        }

        public final a E(boolean z10) {
            v();
            C7403s2.R((C7403s2) this.f48734b, z10);
            return this;
        }

        public final a G(boolean z10) {
            v();
            C7403s2.T((C7403s2) this.f48734b, z10);
            return this;
        }

        public final a H(boolean z10) {
            v();
            C7403s2.V((C7403s2) this.f48734b, z10);
            return this;
        }

        public final a z(boolean z10) {
            v();
            C7403s2.K((C7403s2) this.f48734b, z10);
            return this;
        }

        private a() {
            super(C7403s2.zzc);
        }
    }

    static {
        C7403s2 s2Var = new C7403s2();
        zzc = s2Var;
        L4.v(C7403s2.class, s2Var);
    }

    private C7403s2() {
    }

    public static a J() {
        return (a) zzc.z();
    }

    static /* synthetic */ void K(C7403s2 s2Var, boolean z10) {
        s2Var.zze |= 32;
        s2Var.zzk = z10;
    }

    static /* synthetic */ void M(C7403s2 s2Var, boolean z10) {
        s2Var.zze |= 16;
        s2Var.zzj = z10;
    }

    public static C7403s2 N() {
        return zzc;
    }

    static /* synthetic */ void O(C7403s2 s2Var, boolean z10) {
        s2Var.zze |= 1;
        s2Var.zzf = z10;
    }

    static /* synthetic */ void P(C7403s2 s2Var, boolean z10) {
        s2Var.zze |= 64;
        s2Var.zzl = z10;
    }

    static /* synthetic */ void R(C7403s2 s2Var, boolean z10) {
        s2Var.zze |= 2;
        s2Var.zzg = z10;
    }

    static /* synthetic */ void T(C7403s2 s2Var, boolean z10) {
        s2Var.zze |= 4;
        s2Var.zzh = z10;
    }

    static /* synthetic */ void V(C7403s2 s2Var, boolean z10) {
        s2Var.zze |= 8;
        s2Var.zzi = z10;
    }

    public final boolean Q() {
        return this.zzk;
    }

    public final boolean S() {
        return this.zzj;
    }

    public final boolean U() {
        return this.zzf;
    }

    public final boolean W() {
        return this.zzl;
    }

    public final boolean X() {
        return this.zzg;
    }

    public final boolean Y() {
        return this.zzh;
    }

    public final boolean Z() {
        return this.zzi;
    }

    /* access modifiers changed from: protected */
    public final Object r(int i10, Object obj, Object obj2) {
        switch (I2.f48682a[i10 - 1]) {
            case 1:
                return new C7403s2();
            case 2:
                return new a();
            case 3:
                return L4.t(zzc, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
            case 4:
                return zzc;
            case 5:
                E5<C7403s2> e52 = zzd;
                if (e52 == null) {
                    synchronized (C7403s2.class) {
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
