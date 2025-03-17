package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.Q0;

/* renamed from: com.google.android.gms.internal.vision.p  reason: case insensitive filesystem */
public final class C7523p extends Q0<C7523p, a> implements C1 {
    /* access modifiers changed from: private */
    public static final C7523p zzj;
    private static volatile M1<C7523p> zzk;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private float zzi;

    /* renamed from: com.google.android.gms.internal.vision.p$a */
    public static final class a extends Q0.b<C7523p, a> implements C1 {
        private a() {
            super(C7523p.zzj);
        }

        /* synthetic */ a(C7552z zVar) {
            this();
        }
    }

    /* renamed from: com.google.android.gms.internal.vision.p$b */
    public enum b implements T0 {
        CLASSIFICATION_UNKNOWN(0),
        CLASSIFICATION_NONE(1),
        CLASSIFICATION_ALL(2);
        
        private static final W0<b> zzd = null;
        private final int zze;

        static {
            zzd = new F();
        }

        private b(int i10) {
            this.zze = i10;
        }

        public static b a(int i10) {
            if (i10 == 0) {
                return CLASSIFICATION_UNKNOWN;
            }
            if (i10 == 1) {
                return CLASSIFICATION_NONE;
            }
            if (i10 != 2) {
                return null;
            }
            return CLASSIFICATION_ALL;
        }

        public static V0 b() {
            return G.f49196a;
        }

        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zze + " name=" + name() + '>';
        }

        public final int zza() {
            return this.zze;
        }
    }

    /* renamed from: com.google.android.gms.internal.vision.p$c */
    public enum c implements T0 {
        LANDMARK_UNKNOWN(0),
        LANDMARK_NONE(1),
        LANDMARK_ALL(2),
        LANDMARK_CONTOUR(3);
        
        private static final W0<c> zze = null;
        private final int zzf;

        static {
            zze = new I();
        }

        private c(int i10) {
            this.zzf = i10;
        }

        public static c a(int i10) {
            if (i10 == 0) {
                return LANDMARK_UNKNOWN;
            }
            if (i10 == 1) {
                return LANDMARK_NONE;
            }
            if (i10 == 2) {
                return LANDMARK_ALL;
            }
            if (i10 != 3) {
                return null;
            }
            return LANDMARK_CONTOUR;
        }

        public static V0 b() {
            return H.f49205a;
        }

        public final String toString() {
            return "<" + c.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + '>';
        }

        public final int zza() {
            return this.zzf;
        }
    }

    /* renamed from: com.google.android.gms.internal.vision.p$d */
    public enum d implements T0 {
        MODE_UNKNOWN(0),
        MODE_ACCURATE(1),
        MODE_FAST(2),
        MODE_SELFIE(3);
        
        private static final W0<d> zze = null;
        private final int zzf;

        static {
            zze = new J();
        }

        private d(int i10) {
            this.zzf = i10;
        }

        public static d a(int i10) {
            if (i10 == 0) {
                return MODE_UNKNOWN;
            }
            if (i10 == 1) {
                return MODE_ACCURATE;
            }
            if (i10 == 2) {
                return MODE_FAST;
            }
            if (i10 != 3) {
                return null;
            }
            return MODE_SELFIE;
        }

        public static V0 b() {
            return K.f49214a;
        }

        public final String toString() {
            return "<" + d.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + '>';
        }

        public final int zza() {
            return this.zzf;
        }
    }

    static {
        C7523p pVar = new C7523p();
        zzj = pVar;
        Q0.q(C7523p.class, pVar);
    }

    private C7523p() {
    }

    /* JADX WARNING: type inference failed for: r11v13, types: [com.google.android.gms.internal.vision.Q0$a, com.google.android.gms.internal.vision.M1<com.google.android.gms.internal.vision.p>] */
    /* access modifiers changed from: protected */
    public final Object n(int i10, Object obj, Object obj2) {
        M1<C7523p> m12;
        switch (C7552z.f49420a[i10 - 1]) {
            case 1:
                return new C7523p();
            case 2:
                return new a((C7552z) null);
            case 3:
                return Q0.o(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ခ\u0005", new Object[]{"zzc", "zzd", d.b(), "zze", c.b(), "zzf", b.b(), "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                M1<C7523p> m13 = zzk;
                M1<C7523p> m14 = m13;
                if (m13 == null) {
                    synchronized (C7523p.class) {
                        try {
                            M1<C7523p> m15 = zzk;
                            m12 = m15;
                            if (m15 == null) {
                                ? aVar = new Q0.a(zzj);
                                zzk = aVar;
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
