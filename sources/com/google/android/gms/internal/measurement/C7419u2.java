package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.L4;

/* renamed from: com.google.android.gms.internal.measurement.u2  reason: case insensitive filesystem */
public final class C7419u2 extends L4<C7419u2, a> implements C7422u5 {
    /* access modifiers changed from: private */
    public static final C7419u2 zzc;
    private static volatile E5<C7419u2> zzd;
    private int zze;
    private int zzf;
    private long zzg;

    /* renamed from: com.google.android.gms.internal.measurement.u2$a */
    public static final class a extends L4.a<C7419u2, a> implements C7422u5 {
        public final a A(long j10) {
            v();
            C7419u2.K((C7419u2) this.f48734b, j10);
            return this;
        }

        public final a z(int i10) {
            v();
            C7419u2.J((C7419u2) this.f48734b, i10);
            return this;
        }

        private a() {
            super(C7419u2.zzc);
        }
    }

    static {
        C7419u2 u2Var = new C7419u2();
        zzc = u2Var;
        L4.v(C7419u2.class, u2Var);
    }

    private C7419u2() {
    }

    static /* synthetic */ void J(C7419u2 u2Var, int i10) {
        u2Var.zze |= 1;
        u2Var.zzf = i10;
    }

    static /* synthetic */ void K(C7419u2 u2Var, long j10) {
        u2Var.zze |= 2;
        u2Var.zzg = j10;
    }

    public static a M() {
        return (a) zzc.z();
    }

    public final long L() {
        return this.zzg;
    }

    public final boolean O() {
        return (this.zze & 2) != 0;
    }

    public final boolean P() {
        return (this.zze & 1) != 0;
    }

    public final int m() {
        return this.zzf;
    }

    /* access modifiers changed from: protected */
    public final Object r(int i10, Object obj, Object obj2) {
        switch (I2.f48682a[i10 - 1]) {
            case 1:
                return new C7419u2();
            case 2:
                return new a();
            case 3:
                return L4.t(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                E5<C7419u2> e52 = zzd;
                if (e52 == null) {
                    synchronized (C7419u2.class) {
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
