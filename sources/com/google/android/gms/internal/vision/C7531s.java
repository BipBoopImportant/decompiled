package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.Q0;

/* renamed from: com.google.android.gms.internal.vision.s  reason: case insensitive filesystem */
public final class C7531s extends Q0<C7531s, b> implements C1 {
    /* access modifiers changed from: private */
    public static final C7531s zzi;
    private static volatile M1<C7531s> zzj;
    private int zzc;
    private int zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;

    /* renamed from: com.google.android.gms.internal.vision.s$a */
    public enum a implements T0 {
        FORMAT_UNKNOWN(0),
        FORMAT_LUMINANCE(1),
        FORMAT_RGB8(2),
        FORMAT_MONOCHROME(3);
        
        private static final W0<a> zze = null;
        private final int zzf;

        static {
            zze = new M();
        }

        private a(int i10) {
            this.zzf = i10;
        }

        public static a a(int i10) {
            if (i10 == 0) {
                return FORMAT_UNKNOWN;
            }
            if (i10 == 1) {
                return FORMAT_LUMINANCE;
            }
            if (i10 == 2) {
                return FORMAT_RGB8;
            }
            if (i10 != 3) {
                return null;
            }
            return FORMAT_MONOCHROME;
        }

        public static V0 b() {
            return L.f49215a;
        }

        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + '>';
        }

        public final int zza() {
            return this.zzf;
        }
    }

    /* renamed from: com.google.android.gms.internal.vision.s$b */
    public static final class b extends Q0.b<C7531s, b> implements C1 {
        private b() {
            super(C7531s.zzi);
        }

        public final b v(long j10) {
            if (this.f49245c) {
                n();
                this.f49245c = false;
            }
            ((C7531s) this.f49244b).y(j10);
            return this;
        }

        public final b w(long j10) {
            if (this.f49245c) {
                n();
                this.f49245c = false;
            }
            ((C7531s) this.f49244b).B(j10);
            return this;
        }

        public final b y(long j10) {
            if (this.f49245c) {
                n();
                this.f49245c = false;
            }
            ((C7531s) this.f49244b).D(j10);
            return this;
        }

        public final b z(long j10) {
            if (this.f49245c) {
                n();
                this.f49245c = false;
            }
            ((C7531s) this.f49244b).F(j10);
            return this;
        }

        /* synthetic */ b(C7552z zVar) {
            this();
        }
    }

    static {
        C7531s sVar = new C7531s();
        zzi = sVar;
        Q0.q(C7531s.class, sVar);
    }

    private C7531s() {
    }

    /* access modifiers changed from: private */
    public final void B(long j10) {
        this.zzc |= 4;
        this.zzf = j10;
    }

    /* access modifiers changed from: private */
    public final void D(long j10) {
        this.zzc |= 8;
        this.zzg = j10;
    }

    /* access modifiers changed from: private */
    public final void F(long j10) {
        this.zzc |= 16;
        this.zzh = j10;
    }

    public static b x() {
        return (b) zzi.t();
    }

    /* access modifiers changed from: private */
    public final void y(long j10) {
        this.zzc |= 2;
        this.zze = j10;
    }

    /* JADX WARNING: type inference failed for: r8v13, types: [com.google.android.gms.internal.vision.Q0$a, com.google.android.gms.internal.vision.M1<com.google.android.gms.internal.vision.s>] */
    /* access modifiers changed from: protected */
    public final Object n(int i10, Object obj, Object obj2) {
        M1<C7531s> m12;
        switch (C7552z.f49420a[i10 - 1]) {
            case 1:
                return new C7531s();
            case 2:
                return new b((C7552z) null);
            case 3:
                return Q0.o(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0004\u0005ဂ\u0003", new Object[]{"zzc", "zzd", a.b(), "zze", "zzf", "zzh", "zzg"});
            case 4:
                return zzi;
            case 5:
                M1<C7531s> m13 = zzj;
                M1<C7531s> m14 = m13;
                if (m13 == null) {
                    synchronized (C7531s.class) {
                        try {
                            M1<C7531s> m15 = zzj;
                            m12 = m15;
                            if (m15 == null) {
                                ? aVar = new Q0.a(zzi);
                                zzj = aVar;
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
