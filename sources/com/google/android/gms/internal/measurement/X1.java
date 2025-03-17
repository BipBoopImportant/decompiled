package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.L4;

public final class X1 extends L4<X1, a> implements C7422u5 {
    /* access modifiers changed from: private */
    public static final X1 zzc;
    private static volatile E5<X1> zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private V1 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    public static final class a extends L4.a<X1, a> implements C7422u5 {
        public final a z(String str) {
            v();
            X1.J((X1) this.f48734b, str);
            return this;
        }

        private a() {
            super(X1.zzc);
        }
    }

    static {
        X1 x12 = new X1();
        zzc = x12;
        L4.v(X1.class, x12);
    }

    private X1() {
    }

    static /* synthetic */ void J(X1 x12, String str) {
        str.getClass();
        x12.zze |= 2;
        x12.zzg = str;
    }

    public static a L() {
        return (a) zzc.z();
    }

    public final V1 K() {
        V1 v12 = this.zzh;
        return v12 == null ? V1.L() : v12;
    }

    public final String N() {
        return this.zzg;
    }

    public final boolean O() {
        return this.zzi;
    }

    public final boolean P() {
        return this.zzj;
    }

    public final boolean Q() {
        return this.zzk;
    }

    public final boolean R() {
        return (this.zze & 1) != 0;
    }

    public final boolean S() {
        return (this.zze & 32) != 0;
    }

    public final int m() {
        return this.zzf;
    }

    /* access modifiers changed from: protected */
    public final Object r(int i10, Object obj, Object obj2) {
        switch (Z1.f48836a[i10 - 1]) {
            case 1:
                return new X1();
            case 2:
                return new a();
            case 3:
                return L4.t(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                E5<X1> e52 = zzd;
                if (e52 == null) {
                    synchronized (X1.class) {
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
