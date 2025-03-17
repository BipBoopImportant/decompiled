package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.L4;

/* renamed from: com.google.android.gms.internal.measurement.w2  reason: case insensitive filesystem */
public final class C7435w2 extends L4<C7435w2, a> implements C7422u5 {
    /* access modifiers changed from: private */
    public static final C7435w2 zzc;
    private static volatile E5<C7435w2> zzd;
    private int zze;
    private String zzf = "";
    private long zzg;

    /* renamed from: com.google.android.gms.internal.measurement.w2$a */
    public static final class a extends L4.a<C7435w2, a> implements C7422u5 {
        public final a A(String str) {
            v();
            C7435w2.L((C7435w2) this.f48734b, str);
            return this;
        }

        public final a z(long j10) {
            v();
            C7435w2.K((C7435w2) this.f48734b, j10);
            return this;
        }

        private a() {
            super(C7435w2.zzc);
        }
    }

    static {
        C7435w2 w2Var = new C7435w2();
        zzc = w2Var;
        L4.v(C7435w2.class, w2Var);
    }

    private C7435w2() {
    }

    public static a J() {
        return (a) zzc.z();
    }

    static /* synthetic */ void K(C7435w2 w2Var, long j10) {
        w2Var.zze |= 2;
        w2Var.zzg = j10;
    }

    static /* synthetic */ void L(C7435w2 w2Var, String str) {
        str.getClass();
        w2Var.zze |= 1;
        w2Var.zzf = str;
    }

    /* access modifiers changed from: protected */
    public final Object r(int i10, Object obj, Object obj2) {
        switch (I2.f48682a[i10 - 1]) {
            case 1:
                return new C7435w2();
            case 2:
                return new a();
            case 3:
                return L4.t(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                E5<C7435w2> e52 = zzd;
                if (e52 == null) {
                    synchronized (C7435w2.class) {
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
