package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.Q0;

/* renamed from: com.google.android.gms.internal.vision.w  reason: case insensitive filesystem */
public final class C7543w extends Q0<C7543w, a> implements C1 {
    /* access modifiers changed from: private */
    public static final C7543w zzh;
    private static volatile M1<C7543w> zzi;
    private int zzc;
    private C7512m zzd;
    private int zze;
    private C7526q zzf;
    private C7508l zzg;

    /* renamed from: com.google.android.gms.internal.vision.w$a */
    public static final class a extends Q0.b<C7543w, a> implements C1 {
        private a() {
            super(C7543w.zzh);
        }

        /* synthetic */ a(C7552z zVar) {
            this();
        }
    }

    static {
        C7543w wVar = new C7543w();
        zzh = wVar;
        Q0.q(C7543w.class, wVar);
    }

    private C7543w() {
    }

    /* JADX WARNING: type inference failed for: r3v14, types: [com.google.android.gms.internal.vision.Q0$a, com.google.android.gms.internal.vision.M1<com.google.android.gms.internal.vision.w>] */
    /* access modifiers changed from: protected */
    public final Object n(int i10, Object obj, Object obj2) {
        M1<C7543w> m12;
        switch (C7552z.f49420a[i10 - 1]) {
            case 1:
                return new C7543w();
            case 2:
                return new a((C7552z) null);
            case 3:
                return Q0.o(zzh, "\u0001\u0004\u0000\u0001\u0001\u0011\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0010ဉ\u0002\u0011ဉ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                M1<C7543w> m13 = zzi;
                M1<C7543w> m14 = m13;
                if (m13 == null) {
                    synchronized (C7543w.class) {
                        try {
                            M1<C7543w> m15 = zzi;
                            m12 = m15;
                            if (m15 == null) {
                                ? aVar = new Q0.a(zzh);
                                zzi = aVar;
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
