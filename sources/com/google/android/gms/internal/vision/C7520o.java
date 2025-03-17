package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.Q0;

/* renamed from: com.google.android.gms.internal.vision.o  reason: case insensitive filesystem */
public final class C7520o extends Q0<C7520o, b> implements C1 {
    /* access modifiers changed from: private */
    public static final C7520o zzl;
    private static volatile M1<C7520o> zzm;
    private int zzc;
    private String zzd = "";
    private String zze = "";
    private C7466a1<String> zzf = Q0.w();
    private int zzg;
    private String zzh = "";
    private long zzi;
    private long zzj;
    private C7466a1<C7543w> zzk = Q0.w();

    /* renamed from: com.google.android.gms.internal.vision.o$a */
    public enum a implements T0 {
        RESULT_UNKNOWN(0),
        RESULT_SUCCESS(1),
        RESULT_FAIL(2),
        RESULT_SKIPPED(3);
        
        private static final W0<a> zze = null;
        private final int zzf;

        static {
            zze = new E();
        }

        private a(int i10) {
            this.zzf = i10;
        }

        public static a a(int i10) {
            if (i10 == 0) {
                return RESULT_UNKNOWN;
            }
            if (i10 == 1) {
                return RESULT_SUCCESS;
            }
            if (i10 == 2) {
                return RESULT_FAIL;
            }
            if (i10 != 3) {
                return null;
            }
            return RESULT_SKIPPED;
        }

        public static V0 b() {
            return D.f49174a;
        }

        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + '>';
        }

        public final int zza() {
            return this.zzf;
        }
    }

    /* renamed from: com.google.android.gms.internal.vision.o$b */
    public static final class b extends Q0.b<C7520o, b> implements C1 {
        private b() {
            super(C7520o.zzl);
        }

        public final b v(long j10) {
            if (this.f49245c) {
                n();
                this.f49245c = false;
            }
            ((C7520o) this.f49244b).y(j10);
            return this;
        }

        public final b w(Iterable<? extends C7543w> iterable) {
            if (this.f49245c) {
                n();
                this.f49245c = false;
            }
            ((C7520o) this.f49244b).C(iterable);
            return this;
        }

        public final b y(String str) {
            if (this.f49245c) {
                n();
                this.f49245c = false;
            }
            ((C7520o) this.f49244b).D(str);
            return this;
        }

        public final b z(long j10) {
            if (this.f49245c) {
                n();
                this.f49245c = false;
            }
            ((C7520o) this.f49244b).F(j10);
            return this;
        }

        /* synthetic */ b(C7552z zVar) {
            this();
        }
    }

    static {
        C7520o oVar = new C7520o();
        zzl = oVar;
        Q0.q(C7520o.class, oVar);
    }

    private C7520o() {
    }

    /* access modifiers changed from: private */
    public final void C(Iterable<? extends C7543w> iterable) {
        C7466a1<C7543w> a1Var = this.zzk;
        if (!a1Var.zza()) {
            this.zzk = Q0.m(a1Var);
        }
        X.d(iterable, this.zzk);
    }

    /* access modifiers changed from: private */
    public final void D(String str) {
        str.getClass();
        this.zzc |= 1;
        this.zzd = str;
    }

    /* access modifiers changed from: private */
    public final void F(long j10) {
        this.zzc |= 32;
        this.zzj = j10;
    }

    public static b x() {
        return (b) zzl.t();
    }

    /* access modifiers changed from: private */
    public final void y(long j10) {
        this.zzc |= 16;
        this.zzi = j10;
    }

    /* JADX WARNING: type inference failed for: r12v13, types: [com.google.android.gms.internal.vision.Q0$a, com.google.android.gms.internal.vision.M1<com.google.android.gms.internal.vision.o>] */
    /* access modifiers changed from: protected */
    public final Object n(int i10, Object obj, Object obj2) {
        M1<C7520o> m12;
        switch (C7552z.f49420a[i10 - 1]) {
            case 1:
                return new C7520o();
            case 2:
                return new b((C7552z) null);
            case 3:
                return Q0.o(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004ဌ\u0002\u0005ဈ\u0003\u0006ဂ\u0004\u0007ဂ\u0005\b\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", a.b(), "zzh", "zzi", "zzj", "zzk", C7543w.class});
            case 4:
                return zzl;
            case 5:
                M1<C7520o> m13 = zzm;
                M1<C7520o> m14 = m13;
                if (m13 == null) {
                    synchronized (C7520o.class) {
                        try {
                            M1<C7520o> m15 = zzm;
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
