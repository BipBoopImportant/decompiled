package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.L4;
import java.util.List;

public final class U2 extends L4<U2, a> implements C7422u5 {
    /* access modifiers changed from: private */
    public static final U2 zzc;
    private static volatile E5<U2> zzd;
    private int zze;
    private int zzf;
    private R4<U2> zzg = L4.E();
    private String zzh = "";
    private String zzi = "";
    private boolean zzj;
    private double zzk;

    public static final class a extends L4.a<U2, a> implements C7422u5 {
        private a() {
            super(U2.zzc);
        }
    }

    public enum b implements N4 {
        UNKNOWN(0),
        STRING(1),
        NUMBER(2),
        BOOLEAN(3),
        STATEMENT(4);
        
        private final int zzg;

        private b(int i10) {
            this.zzg = i10;
        }

        public static b a(int i10) {
            if (i10 == 0) {
                return UNKNOWN;
            }
            if (i10 == 1) {
                return STRING;
            }
            if (i10 == 2) {
                return NUMBER;
            }
            if (i10 == 3) {
                return BOOLEAN;
            }
            if (i10 != 4) {
                return null;
            }
            return STATEMENT;
        }

        public static Q4 b() {
            return V2.f48818a;
        }

        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzg + " name=" + name() + '>';
        }

        public final int zza() {
            return this.zzg;
        }
    }

    static {
        U2 u22 = new U2();
        zzc = u22;
        L4.v(U2.class, u22);
    }

    private U2() {
    }

    public final double J() {
        return this.zzk;
    }

    public final b K() {
        b a10 = b.a(this.zzf);
        return a10 == null ? b.UNKNOWN : a10;
    }

    public final String M() {
        return this.zzh;
    }

    public final String N() {
        return this.zzi;
    }

    public final List<U2> O() {
        return this.zzg;
    }

    public final boolean P() {
        return this.zzj;
    }

    public final boolean Q() {
        return (this.zze & 8) != 0;
    }

    public final boolean R() {
        return (this.zze & 16) != 0;
    }

    public final boolean S() {
        return (this.zze & 4) != 0;
    }

    /* access modifiers changed from: protected */
    public final Object r(int i10, Object obj, Object obj2) {
        switch (Q2.f48790a[i10 - 1]) {
            case 1:
                return new U2();
            case 2:
                return new a();
            case 3:
                return L4.t(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", b.b(), "zzg", U2.class, "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                E5<U2> e52 = zzd;
                if (e52 == null) {
                    synchronized (U2.class) {
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
