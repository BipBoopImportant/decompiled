package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.Q0;

/* renamed from: com.google.android.gms.internal.vision.u  reason: case insensitive filesystem */
public final class C7537u extends Q0<C7537u, a> implements C1 {
    /* access modifiers changed from: private */
    public static final C7537u zzf;
    private static volatile M1<C7537u> zzg;
    private int zzc;
    private long zzd;
    private long zze;

    /* renamed from: com.google.android.gms.internal.vision.u$a */
    public static final class a extends Q0.b<C7537u, a> implements C1 {
        private a() {
            super(C7537u.zzf);
        }

        /* synthetic */ a(C7552z zVar) {
            this();
        }
    }

    static {
        C7537u uVar = new C7537u();
        zzf = uVar;
        Q0.q(C7537u.class, uVar);
    }

    private C7537u() {
    }

    /* JADX WARNING: type inference failed for: r1v14, types: [com.google.android.gms.internal.vision.Q0$a, com.google.android.gms.internal.vision.M1<com.google.android.gms.internal.vision.u>] */
    /* access modifiers changed from: protected */
    public final Object n(int i10, Object obj, Object obj2) {
        M1<C7537u> m12;
        switch (C7552z.f49420a[i10 - 1]) {
            case 1:
                return new C7537u();
            case 2:
                return new a((C7552z) null);
            case 3:
                return Q0.o(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                M1<C7537u> m13 = zzg;
                M1<C7537u> m14 = m13;
                if (m13 == null) {
                    synchronized (C7537u.class) {
                        try {
                            M1<C7537u> m15 = zzg;
                            m12 = m15;
                            if (m15 == null) {
                                ? aVar = new Q0.a(zzf);
                                zzg = aVar;
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
