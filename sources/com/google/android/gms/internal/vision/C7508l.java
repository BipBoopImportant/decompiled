package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.Q0;

/* renamed from: com.google.android.gms.internal.vision.l  reason: case insensitive filesystem */
public final class C7508l extends Q0<C7508l, a> implements C1 {
    /* access modifiers changed from: private */
    public static final C7508l zzg;
    private static volatile M1<C7508l> zzh;
    private int zzc;
    private int zzd;
    private int zze;
    private String zzf = "";

    /* renamed from: com.google.android.gms.internal.vision.l$a */
    public static final class a extends Q0.b<C7508l, a> implements C1 {
        private a() {
            super(C7508l.zzg);
        }

        /* synthetic */ a(C7552z zVar) {
            this();
        }
    }

    static {
        C7508l lVar = new C7508l();
        zzg = lVar;
        Q0.q(C7508l.class, lVar);
    }

    private C7508l() {
    }

    /* JADX WARNING: type inference failed for: r7v13, types: [com.google.android.gms.internal.vision.Q0$a, com.google.android.gms.internal.vision.M1<com.google.android.gms.internal.vision.l>] */
    /* access modifiers changed from: protected */
    public final Object n(int i10, Object obj, Object obj2) {
        M1<C7508l> m12;
        switch (C7552z.f49420a[i10 - 1]) {
            case 1:
                return new C7508l();
            case 2:
                return new a((C7552z) null);
            case 3:
                return Q0.o(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"zzc", "zzd", P.b(), "zze", S.b(), "zzf"});
            case 4:
                return zzg;
            case 5:
                M1<C7508l> m13 = zzh;
                M1<C7508l> m14 = m13;
                if (m13 == null) {
                    synchronized (C7508l.class) {
                        try {
                            M1<C7508l> m15 = zzh;
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
