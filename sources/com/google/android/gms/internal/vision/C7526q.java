package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.Q0;

/* renamed from: com.google.android.gms.internal.vision.q  reason: case insensitive filesystem */
public final class C7526q extends Q0<C7526q, a> implements C1 {
    /* access modifiers changed from: private */
    public static final C7526q zzj;
    private static volatile M1<C7526q> zzk;
    private int zzc;
    private float zzd;
    private float zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private float zzi;

    /* renamed from: com.google.android.gms.internal.vision.q$a */
    public static final class a extends Q0.b<C7526q, a> implements C1 {
        private a() {
            super(C7526q.zzj);
        }

        /* synthetic */ a(C7552z zVar) {
            this();
        }
    }

    static {
        C7526q qVar = new C7526q();
        zzj = qVar;
        Q0.q(C7526q.class, qVar);
    }

    private C7526q() {
    }

    /* JADX WARNING: type inference failed for: r8v13, types: [com.google.android.gms.internal.vision.Q0$a, com.google.android.gms.internal.vision.M1<com.google.android.gms.internal.vision.q>] */
    /* access modifiers changed from: protected */
    public final Object n(int i10, Object obj, Object obj2) {
        M1<C7526q> m12;
        switch (C7552z.f49420a[i10 - 1]) {
            case 1:
                return new C7526q();
            case 2:
                return new a((C7552z) null);
            case 3:
                return Q0.o(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                M1<C7526q> m13 = zzk;
                M1<C7526q> m14 = m13;
                if (m13 == null) {
                    synchronized (C7526q.class) {
                        try {
                            M1<C7526q> m15 = zzk;
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
