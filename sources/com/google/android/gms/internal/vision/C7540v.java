package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.Q0;

/* renamed from: com.google.android.gms.internal.vision.v  reason: case insensitive filesystem */
public final class C7540v extends Q0<C7540v, a> implements C1 {
    /* access modifiers changed from: private */
    public static final C7540v zzf;
    private static volatile M1<C7540v> zzg;
    private int zzc;
    private int zzd;
    private int zze;

    /* renamed from: com.google.android.gms.internal.vision.v$a */
    public static final class a extends Q0.b<C7540v, a> implements C1 {
        private a() {
            super(C7540v.zzf);
        }

        /* synthetic */ a(C7552z zVar) {
            this();
        }
    }

    static {
        C7540v vVar = new C7540v();
        zzf = vVar;
        Q0.q(C7540v.class, vVar);
    }

    private C7540v() {
    }

    /* JADX WARNING: type inference failed for: r1v14, types: [com.google.android.gms.internal.vision.Q0$a, com.google.android.gms.internal.vision.M1<com.google.android.gms.internal.vision.v>] */
    /* access modifiers changed from: protected */
    public final Object n(int i10, Object obj, Object obj2) {
        M1<C7540v> m12;
        switch (C7552z.f49420a[i10 - 1]) {
            case 1:
                return new C7540v();
            case 2:
                return new a((C7552z) null);
            case 3:
                return Q0.o(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                M1<C7540v> m13 = zzg;
                M1<C7540v> m14 = m13;
                if (m13 == null) {
                    synchronized (C7540v.class) {
                        try {
                            M1<C7540v> m15 = zzg;
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
