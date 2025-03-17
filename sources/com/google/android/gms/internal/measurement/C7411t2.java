package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C2;
import com.google.android.gms.internal.measurement.L4;

/* renamed from: com.google.android.gms.internal.measurement.t2  reason: case insensitive filesystem */
public final class C7411t2 extends L4<C7411t2, a> implements C7422u5 {
    /* access modifiers changed from: private */
    public static final C7411t2 zzc;
    private static volatile E5<C7411t2> zzd;
    private int zze;
    private int zzf;
    private C2 zzg;
    private C2 zzh;
    private boolean zzi;

    /* renamed from: com.google.android.gms.internal.measurement.t2$a */
    public static final class a extends L4.a<C7411t2, a> implements C7422u5 {
        public final a A(C2.a aVar) {
            v();
            C7411t2.K((C7411t2) this.f48734b, (C2) ((L4) aVar.s()));
            return this;
        }

        public final a C(C2 c22) {
            v();
            C7411t2.N((C7411t2) this.f48734b, c22);
            return this;
        }

        public final a D(boolean z10) {
            v();
            C7411t2.L((C7411t2) this.f48734b, z10);
            return this;
        }

        public final a z(int i10) {
            v();
            C7411t2.J((C7411t2) this.f48734b, i10);
            return this;
        }

        private a() {
            super(C7411t2.zzc);
        }
    }

    static {
        C7411t2 t2Var = new C7411t2();
        zzc = t2Var;
        L4.v(C7411t2.class, t2Var);
    }

    private C7411t2() {
    }

    static /* synthetic */ void J(C7411t2 t2Var, int i10) {
        t2Var.zze |= 1;
        t2Var.zzf = i10;
    }

    static /* synthetic */ void K(C7411t2 t2Var, C2 c22) {
        c22.getClass();
        t2Var.zzg = c22;
        t2Var.zze |= 2;
    }

    static /* synthetic */ void L(C7411t2 t2Var, boolean z10) {
        t2Var.zze |= 8;
        t2Var.zzi = z10;
    }

    public static a M() {
        return (a) zzc.z();
    }

    static /* synthetic */ void N(C7411t2 t2Var, C2 c22) {
        c22.getClass();
        t2Var.zzh = c22;
        t2Var.zze |= 4;
    }

    public final C2 P() {
        C2 c22 = this.zzg;
        return c22 == null ? C2.W() : c22;
    }

    public final C2 Q() {
        C2 c22 = this.zzh;
        return c22 == null ? C2.W() : c22;
    }

    public final boolean R() {
        return this.zzi;
    }

    public final boolean S() {
        return (this.zze & 1) != 0;
    }

    public final boolean T() {
        return (this.zze & 8) != 0;
    }

    public final boolean U() {
        return (this.zze & 4) != 0;
    }

    public final int m() {
        return this.zzf;
    }

    /* access modifiers changed from: protected */
    public final Object r(int i10, Object obj, Object obj2) {
        switch (I2.f48682a[i10 - 1]) {
            case 1:
                return new C7411t2();
            case 2:
                return new a();
            case 3:
                return L4.t(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                E5<C7411t2> e52 = zzd;
                if (e52 == null) {
                    synchronized (C7411t2.class) {
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
