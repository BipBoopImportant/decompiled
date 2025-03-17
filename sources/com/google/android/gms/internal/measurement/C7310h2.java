package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.L4;

/* renamed from: com.google.android.gms.internal.measurement.h2  reason: case insensitive filesystem */
public final class C7310h2 extends L4<C7310h2, a> implements C7422u5 {
    /* access modifiers changed from: private */
    public static final C7310h2 zzc;
    private static volatile E5<C7310h2> zzd;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    /* renamed from: com.google.android.gms.internal.measurement.h2$a */
    public static final class a extends L4.a<C7310h2, a> implements C7422u5 {
        public final a A(String str) {
            v();
            C7310h2.J((C7310h2) this.f48734b, str);
            return this;
        }

        public final String C() {
            return ((C7310h2) this.f48734b).L();
        }

        public final boolean D() {
            return ((C7310h2) this.f48734b).M();
        }

        public final boolean E() {
            return ((C7310h2) this.f48734b).N();
        }

        public final boolean G() {
            return ((C7310h2) this.f48734b).O();
        }

        public final boolean H() {
            return ((C7310h2) this.f48734b).P();
        }

        public final boolean I() {
            return ((C7310h2) this.f48734b).Q();
        }

        public final int z() {
            return ((C7310h2) this.f48734b).m();
        }

        private a() {
            super(C7310h2.zzc);
        }
    }

    static {
        C7310h2 h2Var = new C7310h2();
        zzc = h2Var;
        L4.v(C7310h2.class, h2Var);
    }

    private C7310h2() {
    }

    static /* synthetic */ void J(C7310h2 h2Var, String str) {
        str.getClass();
        h2Var.zze |= 1;
        h2Var.zzf = str;
    }

    public final String L() {
        return this.zzf;
    }

    public final boolean M() {
        return this.zzg;
    }

    public final boolean N() {
        return this.zzh;
    }

    public final boolean O() {
        return (this.zze & 2) != 0;
    }

    public final boolean P() {
        return (this.zze & 4) != 0;
    }

    public final boolean Q() {
        return (this.zze & 8) != 0;
    }

    public final int m() {
        return this.zzi;
    }

    /* access modifiers changed from: protected */
    public final Object r(int i10, Object obj, Object obj2) {
        switch (C7283e2.f48908a[i10 - 1]) {
            case 1:
                return new C7310h2();
            case 2:
                return new a();
            case 3:
                return L4.t(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                E5<C7310h2> e52 = zzd;
                if (e52 == null) {
                    synchronized (C7310h2.class) {
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
