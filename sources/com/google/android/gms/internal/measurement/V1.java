package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.L4;

public final class V1 extends L4<V1, a> implements C7422u5 {
    /* access modifiers changed from: private */
    public static final V1 zzc;
    private static volatile E5<V1> zzd;
    private int zze;
    private Y1 zzf;
    private W1 zzg;
    private boolean zzh;
    private String zzi = "";

    public static final class a extends L4.a<V1, a> implements C7422u5 {
        public final a z(String str) {
            v();
            V1.K((V1) this.f48734b, str);
            return this;
        }

        private a() {
            super(V1.zzc);
        }
    }

    static {
        V1 v12 = new V1();
        zzc = v12;
        L4.v(V1.class, v12);
    }

    private V1() {
    }

    static /* synthetic */ void K(V1 v12, String str) {
        str.getClass();
        v12.zze |= 8;
        v12.zzi = str;
    }

    public static V1 L() {
        return zzc;
    }

    public final W1 M() {
        W1 w12 = this.zzg;
        return w12 == null ? W1.L() : w12;
    }

    public final Y1 N() {
        Y1 y12 = this.zzf;
        return y12 == null ? Y1.L() : y12;
    }

    public final String O() {
        return this.zzi;
    }

    public final boolean P() {
        return this.zzh;
    }

    public final boolean Q() {
        return (this.zze & 4) != 0;
    }

    public final boolean R() {
        return (this.zze & 2) != 0;
    }

    public final boolean S() {
        return (this.zze & 8) != 0;
    }

    public final boolean T() {
        return (this.zze & 1) != 0;
    }

    /* access modifiers changed from: protected */
    public final Object r(int i10, Object obj, Object obj2) {
        switch (Z1.f48836a[i10 - 1]) {
            case 1:
                return new V1();
            case 2:
                return new a();
            case 3:
                return L4.t(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                E5<V1> e52 = zzd;
                if (e52 == null) {
                    synchronized (V1.class) {
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
