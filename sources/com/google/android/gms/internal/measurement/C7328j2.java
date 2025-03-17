package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.L4;

/* renamed from: com.google.android.gms.internal.measurement.j2  reason: case insensitive filesystem */
public final class C7328j2 extends L4<C7328j2, a> implements C7422u5 {
    /* access modifiers changed from: private */
    public static final C7328j2 zzc;
    private static volatile E5<C7328j2> zzd;
    private R4<String> zze = L4.E();

    /* renamed from: com.google.android.gms.internal.measurement.j2$a */
    public static final class a extends L4.a<C7328j2, a> implements C7422u5 {
        private a() {
            super(C7328j2.zzc);
        }
    }

    static {
        C7328j2 j2Var = new C7328j2();
        zzc = j2Var;
        L4.v(C7328j2.class, j2Var);
    }

    private C7328j2() {
    }

    /* access modifiers changed from: protected */
    public final Object r(int i10, Object obj, Object obj2) {
        switch (C7283e2.f48908a[i10 - 1]) {
            case 1:
                return new C7328j2();
            case 2:
                return new a();
            case 3:
                return L4.t(zzc, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                E5<C7328j2> e52 = zzd;
                if (e52 == null) {
                    synchronized (C7328j2.class) {
                        try {
                            e52 = zzd;
                            if (e52 == null) {
                                e52 = new L4.c<>(zzc);
                                zzd = e52;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                return e52;
            case 6:
                return (byte) 1;
            default:
                throw null;
        }
    }
}
