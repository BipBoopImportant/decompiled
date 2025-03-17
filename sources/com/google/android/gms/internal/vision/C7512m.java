package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.Q0;

/* renamed from: com.google.android.gms.internal.vision.m  reason: case insensitive filesystem */
public final class C7512m extends Q0<C7512m, a> implements C1 {
    /* access modifiers changed from: private */
    public static final C7512m zzd;
    private static volatile M1<C7512m> zze;
    private C7466a1<C7540v> zzc = Q0.w();

    /* renamed from: com.google.android.gms.internal.vision.m$a */
    public static final class a extends Q0.b<C7512m, a> implements C1 {
        private a() {
            super(C7512m.zzd);
        }

        /* synthetic */ a(C7552z zVar) {
            this();
        }
    }

    static {
        C7512m mVar = new C7512m();
        zzd = mVar;
        Q0.q(C7512m.class, mVar);
    }

    private C7512m() {
    }

    /* JADX WARNING: type inference failed for: r1v14, types: [com.google.android.gms.internal.vision.Q0$a, com.google.android.gms.internal.vision.M1<com.google.android.gms.internal.vision.m>] */
    /* access modifiers changed from: protected */
    public final Object n(int i10, Object obj, Object obj2) {
        M1<C7512m> m12;
        switch (C7552z.f49420a[i10 - 1]) {
            case 1:
                return new C7512m();
            case 2:
                return new a((C7552z) null);
            case 3:
                return Q0.o(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", C7540v.class});
            case 4:
                return zzd;
            case 5:
                M1<C7512m> m13 = zze;
                M1<C7512m> m14 = m13;
                if (m13 == null) {
                    synchronized (C7512m.class) {
                        try {
                            M1<C7512m> m15 = zze;
                            m12 = m15;
                            if (m15 == null) {
                                ? aVar = new Q0.a(zzd);
                                zze = aVar;
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
