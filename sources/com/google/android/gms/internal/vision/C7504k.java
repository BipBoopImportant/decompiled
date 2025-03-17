package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.Q0;

/* renamed from: com.google.android.gms.internal.vision.k  reason: case insensitive filesystem */
public final class C7504k extends Q0<C7504k, a> implements C1 {
    private static final X0<Integer, P> zzd = new A();
    /* access modifiers changed from: private */
    public static final C7504k zze;
    private static volatile M1<C7504k> zzf;
    private Y0 zzc = Q0.v();

    /* renamed from: com.google.android.gms.internal.vision.k$a */
    public static final class a extends Q0.b<C7504k, a> implements C1 {
        private a() {
            super(C7504k.zze);
        }

        /* synthetic */ a(C7552z zVar) {
            this();
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.android.gms.internal.vision.A, com.google.android.gms.internal.vision.X0<java.lang.Integer, com.google.android.gms.internal.vision.P>] */
    static {
        C7504k kVar = new C7504k();
        zze = kVar;
        Q0.q(C7504k.class, kVar);
    }

    private C7504k() {
    }

    /* JADX WARNING: type inference failed for: r1v14, types: [com.google.android.gms.internal.vision.Q0$a, com.google.android.gms.internal.vision.M1<com.google.android.gms.internal.vision.k>] */
    /* access modifiers changed from: protected */
    public final Object n(int i10, Object obj, Object obj2) {
        M1<C7504k> m12;
        switch (C7552z.f49420a[i10 - 1]) {
            case 1:
                return new C7504k();
            case 2:
                return new a((C7552z) null);
            case 3:
                return Q0.o(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"zzc", P.b()});
            case 4:
                return zze;
            case 5:
                M1<C7504k> m13 = zzf;
                M1<C7504k> m14 = m13;
                if (m13 == null) {
                    synchronized (C7504k.class) {
                        try {
                            M1<C7504k> m15 = zzf;
                            m12 = m15;
                            if (m15 == null) {
                                ? aVar = new Q0.a(zze);
                                zzf = aVar;
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
