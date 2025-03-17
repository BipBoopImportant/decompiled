package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.L4;

public final class W1 extends L4<W1, b> implements C7422u5 {
    /* access modifiers changed from: private */
    public static final W1 zzc;
    private static volatile E5<W1> zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    public enum a implements N4 {
        UNKNOWN_COMPARISON_TYPE(0),
        LESS_THAN(1),
        GREATER_THAN(2),
        EQUAL(3),
        BETWEEN(4);
        
        private final int zzg;

        private a(int i10) {
            this.zzg = i10;
        }

        public static a a(int i10) {
            if (i10 == 0) {
                return UNKNOWN_COMPARISON_TYPE;
            }
            if (i10 == 1) {
                return LESS_THAN;
            }
            if (i10 == 2) {
                return GREATER_THAN;
            }
            if (i10 == 3) {
                return EQUAL;
            }
            if (i10 != 4) {
                return null;
            }
            return BETWEEN;
        }

        public static Q4 b() {
            return C7247a2.f48849a;
        }

        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzg + " name=" + name() + '>';
        }

        public final int zza() {
            return this.zzg;
        }
    }

    public static final class b extends L4.a<W1, b> implements C7422u5 {
        private b() {
            super(W1.zzc);
        }
    }

    static {
        W1 w12 = new W1();
        zzc = w12;
        L4.v(W1.class, w12);
    }

    private W1() {
    }

    public static W1 L() {
        return zzc;
    }

    public final a J() {
        a a10 = a.a(this.zzf);
        return a10 == null ? a.UNKNOWN_COMPARISON_TYPE : a10;
    }

    public final String M() {
        return this.zzh;
    }

    public final String N() {
        return this.zzj;
    }

    public final String O() {
        return this.zzi;
    }

    public final boolean P() {
        return this.zzg;
    }

    public final boolean Q() {
        return (this.zze & 1) != 0;
    }

    public final boolean R() {
        return (this.zze & 4) != 0;
    }

    public final boolean S() {
        return (this.zze & 2) != 0;
    }

    public final boolean T() {
        return (this.zze & 16) != 0;
    }

    public final boolean U() {
        return (this.zze & 8) != 0;
    }

    /* access modifiers changed from: protected */
    public final Object r(int i10, Object obj, Object obj2) {
        switch (Z1.f48836a[i10 - 1]) {
            case 1:
                return new W1();
            case 2:
                return new b();
            case 3:
                return L4.t(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", a.b(), "zzg", "zzh", "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                E5<W1> e52 = zzd;
                if (e52 == null) {
                    synchronized (W1.class) {
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
