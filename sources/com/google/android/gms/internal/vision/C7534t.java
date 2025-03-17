package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.Q0;

/* renamed from: com.google.android.gms.internal.vision.t  reason: case insensitive filesystem */
public final class C7534t extends Q0<C7534t, a> implements C1 {
    /* access modifiers changed from: private */
    public static final C7534t zzj;
    private static volatile M1<C7534t> zzk;
    private int zzc;
    private String zzd = "";
    private long zze;
    private C7500j zzf;
    private String zzg = "";
    private C7523p zzh;
    private C7504k zzi;

    /* renamed from: com.google.android.gms.internal.vision.t$a */
    public static final class a extends Q0.b<C7534t, a> implements C1 {
        private a() {
            super(C7534t.zzj);
        }

        /* synthetic */ a(C7552z zVar) {
            this();
        }
    }

    static {
        C7534t tVar = new C7534t();
        zzj = tVar;
        Q0.q(C7534t.class, tVar);
    }

    private C7534t() {
    }

    /* JADX WARNING: type inference failed for: r8v13, types: [com.google.android.gms.internal.vision.Q0$a, com.google.android.gms.internal.vision.M1<com.google.android.gms.internal.vision.t>] */
    /* access modifiers changed from: protected */
    public final Object n(int i10, Object obj, Object obj2) {
        M1<C7534t> m12;
        switch (C7552z.f49420a[i10 - 1]) {
            case 1:
                return new C7534t();
            case 2:
                return new a((C7552z) null);
            case 3:
                return Q0.o(zzj, "\u0001\u0006\u0000\u0001\u0001\u0011\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဉ\u0002\u0006ဈ\u0003\u0010ဉ\u0004\u0011ဉ\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                M1<C7534t> m13 = zzk;
                M1<C7534t> m14 = m13;
                if (m13 == null) {
                    synchronized (C7534t.class) {
                        try {
                            M1<C7534t> m15 = zzk;
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
