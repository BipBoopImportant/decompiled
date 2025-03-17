package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.Q0;

/* renamed from: com.google.android.gms.internal.vision.x  reason: case insensitive filesystem */
public final class C7546x extends Q0<C7546x, a> implements C1 {
    /* access modifiers changed from: private */
    public static final C7546x zzi;
    private static volatile M1<C7546x> zzj;
    private int zzc;
    private C7516n zzd;
    private C7534t zze;
    private r zzf;
    private int zzg;
    private boolean zzh;

    /* renamed from: com.google.android.gms.internal.vision.x$a */
    public static final class a extends Q0.b<C7546x, a> implements C1 {
        private a() {
            super(C7546x.zzi);
        }

        public final a v(r rVar) {
            if (this.f49245c) {
                n();
                this.f49245c = false;
            }
            ((C7546x) this.f49244b).y(rVar);
            return this;
        }

        /* synthetic */ a(C7552z zVar) {
            this();
        }
    }

    static {
        C7546x xVar = new C7546x();
        zzi = xVar;
        Q0.q(C7546x.class, xVar);
    }

    private C7546x() {
    }

    public static a x() {
        return (a) zzi.t();
    }

    /* access modifiers changed from: private */
    public final void y(r rVar) {
        rVar.getClass();
        this.zzf = rVar;
        this.zzc |= 4;
    }

    /* JADX WARNING: type inference failed for: r7v13, types: [com.google.android.gms.internal.vision.Q0$a, com.google.android.gms.internal.vision.M1<com.google.android.gms.internal.vision.x>] */
    /* access modifiers changed from: protected */
    public final Object n(int i10, Object obj, Object obj2) {
        M1<C7546x> m12;
        switch (C7552z.f49420a[i10 - 1]) {
            case 1:
                return new C7546x();
            case 2:
                return new a((C7552z) null);
            case 3:
                return Q0.o(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004င\u0003\u0005ဇ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                M1<C7546x> m13 = zzj;
                M1<C7546x> m14 = m13;
                if (m13 == null) {
                    synchronized (C7546x.class) {
                        try {
                            M1<C7546x> m15 = zzj;
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
