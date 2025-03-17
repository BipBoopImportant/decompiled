package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.L4;
import java.util.List;

public final class Y1 extends L4<Y1, b> implements C7422u5 {
    /* access modifiers changed from: private */
    public static final Y1 zzc;
    private static volatile E5<Y1> zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private boolean zzh;
    private R4<String> zzi = L4.E();

    public enum a implements N4 {
        UNKNOWN_MATCH_TYPE(0),
        REGEXP(1),
        BEGINS_WITH(2),
        ENDS_WITH(3),
        PARTIAL(4),
        EXACT(5),
        IN_LIST(6);
        
        private final int zzi;

        private a(int i10) {
            this.zzi = i10;
        }

        public static a a(int i10) {
            switch (i10) {
                case 0:
                    return UNKNOWN_MATCH_TYPE;
                case 1:
                    return REGEXP;
                case 2:
                    return BEGINS_WITH;
                case 3:
                    return ENDS_WITH;
                case 4:
                    return PARTIAL;
                case 5:
                    return EXACT;
                case 6:
                    return IN_LIST;
                default:
                    return null;
            }
        }

        public static Q4 b() {
            return C7274d2.f48887a;
        }

        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzi + " name=" + name() + '>';
        }

        public final int zza() {
            return this.zzi;
        }
    }

    public static final class b extends L4.a<Y1, b> implements C7422u5 {
        private b() {
            super(Y1.zzc);
        }
    }

    static {
        Y1 y12 = new Y1();
        zzc = y12;
        L4.v(Y1.class, y12);
    }

    private Y1() {
    }

    public static Y1 L() {
        return zzc;
    }

    public final a J() {
        a a10 = a.a(this.zzf);
        return a10 == null ? a.UNKNOWN_MATCH_TYPE : a10;
    }

    public final String M() {
        return this.zzg;
    }

    public final List<String> N() {
        return this.zzi;
    }

    public final boolean O() {
        return this.zzh;
    }

    public final boolean P() {
        return (this.zze & 4) != 0;
    }

    public final boolean Q() {
        return (this.zze & 2) != 0;
    }

    public final boolean R() {
        return (this.zze & 1) != 0;
    }

    public final int m() {
        return this.zzi.size();
    }

    /* access modifiers changed from: protected */
    public final Object r(int i10, Object obj, Object obj2) {
        switch (Z1.f48836a[i10 - 1]) {
            case 1:
                return new Y1();
            case 2:
                return new b();
            case 3:
                return L4.t(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zze", "zzf", a.b(), "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                E5<Y1> e52 = zzd;
                if (e52 == null) {
                    synchronized (Y1.class) {
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
