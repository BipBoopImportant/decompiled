package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.L4;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.f2  reason: case insensitive filesystem */
public final class C7292f2 extends L4<C7292f2, a> implements C7422u5 {
    /* access modifiers changed from: private */
    public static final C7292f2 zzc;
    private static volatile E5<C7292f2> zzd;
    private int zze;
    private R4<b> zzf = L4.E();
    private R4<c> zzg = L4.E();
    private R4<f> zzh = L4.E();
    private boolean zzi;
    private R4<b> zzj = L4.E();

    /* renamed from: com.google.android.gms.internal.measurement.f2$a */
    public static final class a extends L4.a<C7292f2, a> implements C7422u5 {
        private a() {
            super(C7292f2.zzc);
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.f2$b */
    public static final class b extends L4<b, a> implements C7422u5 {
        /* access modifiers changed from: private */
        public static final b zzc;
        private static volatile E5<b> zzd;
        private int zze;
        private int zzf;
        private int zzg;

        /* renamed from: com.google.android.gms.internal.measurement.f2$b$a */
        public static final class a extends L4.a<b, a> implements C7422u5 {
            private a() {
                super(b.zzc);
            }
        }

        static {
            b bVar = new b();
            zzc = bVar;
            L4.v(b.class, bVar);
        }

        private b() {
        }

        public final d K() {
            d a10 = d.a(this.zzg);
            return a10 == null ? d.CONSENT_STATUS_UNSPECIFIED : a10;
        }

        public final e L() {
            e a10 = e.a(this.zzf);
            return a10 == null ? e.CONSENT_TYPE_UNSPECIFIED : a10;
        }

        /* access modifiers changed from: protected */
        public final Object r(int i10, Object obj, Object obj2) {
            switch (C7283e2.f48908a[i10 - 1]) {
                case 1:
                    return new b();
                case 2:
                    return new a();
                case 3:
                    return L4.t(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", e.b(), "zzg", d.b()});
                case 4:
                    return zzc;
                case 5:
                    E5<b> e52 = zzd;
                    if (e52 == null) {
                        synchronized (b.class) {
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

    /* renamed from: com.google.android.gms.internal.measurement.f2$c */
    public static final class c extends L4<c, a> implements C7422u5 {
        /* access modifiers changed from: private */
        public static final c zzc;
        private static volatile E5<c> zzd;
        private int zze;
        private int zzf;
        private int zzg;

        /* renamed from: com.google.android.gms.internal.measurement.f2$c$a */
        public static final class a extends L4.a<c, a> implements C7422u5 {
            private a() {
                super(c.zzc);
            }
        }

        static {
            c cVar = new c();
            zzc = cVar;
            L4.v(c.class, cVar);
        }

        private c() {
        }

        public final e K() {
            e a10 = e.a(this.zzg);
            return a10 == null ? e.CONSENT_TYPE_UNSPECIFIED : a10;
        }

        public final e L() {
            e a10 = e.a(this.zzf);
            return a10 == null ? e.CONSENT_TYPE_UNSPECIFIED : a10;
        }

        /* access modifiers changed from: protected */
        public final Object r(int i10, Object obj, Object obj2) {
            switch (C7283e2.f48908a[i10 - 1]) {
                case 1:
                    return new c();
                case 2:
                    return new a();
                case 3:
                    return L4.t(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", e.b(), "zzg", e.b()});
                case 4:
                    return zzc;
                case 5:
                    E5<c> e52 = zzd;
                    if (e52 == null) {
                        synchronized (c.class) {
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

    /* renamed from: com.google.android.gms.internal.measurement.f2$d */
    public enum d implements N4 {
        CONSENT_STATUS_UNSPECIFIED(0),
        GRANTED(1),
        DENIED(2);
        
        private final int zze;

        private d(int i10) {
            this.zze = i10;
        }

        public static d a(int i10) {
            if (i10 == 0) {
                return CONSENT_STATUS_UNSPECIFIED;
            }
            if (i10 == 1) {
                return GRANTED;
            }
            if (i10 != 2) {
                return null;
            }
            return DENIED;
        }

        public static Q4 b() {
            return C7372o2.f49028a;
        }

        public final String toString() {
            return "<" + d.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zze + " name=" + name() + '>';
        }

        public final int zza() {
            return this.zze;
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.f2$e */
    public enum e implements N4 {
        CONSENT_TYPE_UNSPECIFIED(0),
        AD_STORAGE(1),
        ANALYTICS_STORAGE(2),
        AD_USER_DATA(3),
        AD_PERSONALIZATION(4);
        
        private final int zzg;

        private e(int i10) {
            this.zzg = i10;
        }

        public static e a(int i10) {
            if (i10 == 0) {
                return CONSENT_TYPE_UNSPECIFIED;
            }
            if (i10 == 1) {
                return AD_STORAGE;
            }
            if (i10 == 2) {
                return ANALYTICS_STORAGE;
            }
            if (i10 == 3) {
                return AD_USER_DATA;
            }
            if (i10 != 4) {
                return null;
            }
            return AD_PERSONALIZATION;
        }

        public static Q4 b() {
            return C7380p2.f49033a;
        }

        public final String toString() {
            return "<" + e.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzg + " name=" + name() + '>';
        }

        public final int zza() {
            return this.zzg;
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.f2$f */
    public static final class f extends L4<f, a> implements C7422u5 {
        /* access modifiers changed from: private */
        public static final f zzc;
        private static volatile E5<f> zzd;
        private int zze;
        private String zzf = "";
        private String zzg = "";

        /* renamed from: com.google.android.gms.internal.measurement.f2$f$a */
        public static final class a extends L4.a<f, a> implements C7422u5 {
            private a() {
                super(f.zzc);
            }
        }

        static {
            f fVar = new f();
            zzc = fVar;
            L4.v(f.class, fVar);
        }

        private f() {
        }

        public final String K() {
            return this.zzf;
        }

        /* access modifiers changed from: protected */
        public final Object r(int i10, Object obj, Object obj2) {
            switch (C7283e2.f48908a[i10 - 1]) {
                case 1:
                    return new f();
                case 2:
                    return new a();
                case 3:
                    return L4.t(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
                case 4:
                    return zzc;
                case 5:
                    E5<f> e52 = zzd;
                    if (e52 == null) {
                        synchronized (f.class) {
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

    static {
        C7292f2 f2Var = new C7292f2();
        zzc = f2Var;
        L4.v(C7292f2.class, f2Var);
    }

    private C7292f2() {
    }

    public static C7292f2 K() {
        return zzc;
    }

    public final List<f> L() {
        return this.zzh;
    }

    public final List<b> M() {
        return this.zzf;
    }

    public final List<c> N() {
        return this.zzg;
    }

    public final List<b> O() {
        return this.zzj;
    }

    public final boolean P() {
        return this.zzi;
    }

    public final boolean Q() {
        return (this.zze & 1) != 0;
    }

    /* access modifiers changed from: protected */
    public final Object r(int i10, Object obj, Object obj2) {
        switch (C7283e2.f48908a[i10 - 1]) {
            case 1:
                return new C7292f2();
            case 2:
                return new a();
            case 3:
                return L4.t(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zze", "zzf", b.class, "zzg", c.class, "zzh", f.class, "zzi", "zzj", b.class});
            case 4:
                return zzc;
            case 5:
                E5<C7292f2> e52 = zzd;
                if (e52 == null) {
                    synchronized (C7292f2.class) {
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
