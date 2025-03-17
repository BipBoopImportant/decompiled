package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.Q0;

public final class r extends Q0<r, a> implements C1 {
    /* access modifiers changed from: private */
    public static final r zzg;
    private static volatile M1<r> zzh;
    private int zzc;
    private C7531s zzd;
    private C7537u zze;
    private C7466a1<C7520o> zzf = Q0.w();

    public static final class a extends Q0.b<r, a> implements C1 {
        private a() {
            super(r.zzg);
        }

        public final a v(C7531s sVar) {
            if (this.f49245c) {
                n();
                this.f49245c = false;
            }
            ((r) this.f49244b).A(sVar);
            return this;
        }

        public final a w(Iterable<? extends C7520o> iterable) {
            if (this.f49245c) {
                n();
                this.f49245c = false;
            }
            ((r) this.f49244b).B(iterable);
            return this;
        }

        /* synthetic */ a(C7552z zVar) {
            this();
        }
    }

    static {
        r rVar = new r();
        zzg = rVar;
        Q0.q(r.class, rVar);
    }

    private r() {
    }

    /* access modifiers changed from: private */
    public final void A(C7531s sVar) {
        sVar.getClass();
        this.zzd = sVar;
        this.zzc |= 1;
    }

    /* access modifiers changed from: private */
    public final void B(Iterable<? extends C7520o> iterable) {
        D();
        X.d(iterable, this.zzf);
    }

    private final void D() {
        C7466a1<C7520o> a1Var = this.zzf;
        if (!a1Var.zza()) {
            this.zzf = Q0.m(a1Var);
        }
    }

    public static a x() {
        return (a) zzg.t();
    }

    /* JADX WARNING: type inference failed for: r3v14, types: [com.google.android.gms.internal.vision.Q0$a, com.google.android.gms.internal.vision.M1<com.google.android.gms.internal.vision.r>] */
    /* access modifiers changed from: protected */
    public final Object n(int i10, Object obj, Object obj2) {
        M1<r> m12;
        switch (C7552z.f49420a[i10 - 1]) {
            case 1:
                return new r();
            case 2:
                return new a((C7552z) null);
            case 3:
                return Q0.o(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", C7520o.class});
            case 4:
                return zzg;
            case 5:
                M1<r> m13 = zzh;
                M1<r> m14 = m13;
                if (m13 == null) {
                    synchronized (r.class) {
                        try {
                            M1<r> m15 = zzh;
                            m12 = m15;
                            if (m15 == null) {
                                ? aVar = new Q0.a(zzg);
                                zzh = aVar;
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
