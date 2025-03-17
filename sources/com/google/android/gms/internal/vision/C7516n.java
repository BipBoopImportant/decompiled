package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.Q0;

/* renamed from: com.google.android.gms.internal.vision.n  reason: case insensitive filesystem */
public final class C7516n extends Q0<C7516n, a> implements C1 {
    /* access modifiers changed from: private */
    public static final C7516n zzl;
    private static volatile M1<C7516n> zzm;
    private int zzc;
    private String zzd = "";
    private boolean zze;
    private int zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private String zzj = "";
    private boolean zzk;

    /* renamed from: com.google.android.gms.internal.vision.n$a */
    public static final class a extends Q0.b<C7516n, a> implements C1 {
        private a() {
            super(C7516n.zzl);
        }

        /* synthetic */ a(C7552z zVar) {
            this();
        }
    }

    /* renamed from: com.google.android.gms.internal.vision.n$b */
    public enum b implements T0 {
        REASON_UNKNOWN(0),
        REASON_MISSING(1),
        REASON_UPGRADE(2),
        REASON_INVALID(3);
        
        private static final W0<b> zze = null;
        private final int zzf;

        static {
            zze = new B();
        }

        private b(int i10) {
            this.zzf = i10;
        }

        public static b a(int i10) {
            if (i10 == 0) {
                return REASON_UNKNOWN;
            }
            if (i10 == 1) {
                return REASON_MISSING;
            }
            if (i10 == 2) {
                return REASON_UPGRADE;
            }
            if (i10 != 3) {
                return null;
            }
            return REASON_INVALID;
        }

        public static V0 b() {
            return C.f49167a;
        }

        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + '>';
        }

        public final int zza() {
            return this.zzf;
        }
    }

    static {
        C7516n nVar = new C7516n();
        zzl = nVar;
        Q0.q(C7516n.class, nVar);
    }

    private C7516n() {
    }

    /* JADX WARNING: type inference failed for: r11v13, types: [com.google.android.gms.internal.vision.Q0$a, com.google.android.gms.internal.vision.M1<com.google.android.gms.internal.vision.n>] */
    /* access modifiers changed from: protected */
    public final Object n(int i10, Object obj, Object obj2) {
        M1<C7516n> m12;
        switch (C7552z.f49420a[i10 - 1]) {
            case 1:
                return new C7516n();
            case 2:
                return new a((C7552z) null);
            case 3:
                return Q0.o(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဈ\u0006\bဇ\u0007", new Object[]{"zzc", "zzd", "zze", "zzf", b.b(), "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzl;
            case 5:
                M1<C7516n> m13 = zzm;
                M1<C7516n> m14 = m13;
                if (m13 == null) {
                    synchronized (C7516n.class) {
                        try {
                            M1<C7516n> m15 = zzm;
                            m12 = m15;
                            if (m15 == null) {
                                ? aVar = new Q0.a(zzl);
                                zzm = aVar;
                                m12 = aVar;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    m14 = m12;
                }
                return m14;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
