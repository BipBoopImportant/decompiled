package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C7435w2;
import com.google.android.gms.internal.measurement.L4;

public final class B2 extends L4<B2, b> implements C7422u5 {
    /* access modifiers changed from: private */
    public static final B2 zzc;
    private static volatile E5<B2> zzd;
    private int zze;
    private int zzf = 1;
    private R4<C7435w2> zzg = L4.E();

    public enum a implements N4 {
        RADS(1),
        PROVISIONING(2);
        
        private final int zzd;

        private a(int i10) {
            this.zzd = i10;
        }

        public static a a(int i10) {
            if (i10 == 1) {
                return RADS;
            }
            if (i10 != 2) {
                return null;
            }
            return PROVISIONING;
        }

        public static Q4 b() {
            return L2.f48725a;
        }

        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzd + " name=" + name() + '>';
        }

        public final int zza() {
            return this.zzd;
        }
    }

    public static final class b extends L4.a<B2, b> implements C7422u5 {
        public final b z(C7435w2.a aVar) {
            v();
            B2.K((B2) this.f48734b, (C7435w2) ((L4) aVar.s()));
            return this;
        }

        private b() {
            super(B2.zzc);
        }
    }

    static {
        B2 b22 = new B2();
        zzc = b22;
        L4.v(B2.class, b22);
    }

    private B2() {
    }

    public static b J() {
        return (b) zzc.z();
    }

    static /* synthetic */ void K(B2 b22, C7435w2 w2Var) {
        w2Var.getClass();
        R4<C7435w2> r42 = b22.zzg;
        if (!r42.zzc()) {
            b22.zzg = L4.p(r42);
        }
        b22.zzg.add(w2Var);
    }

    /* access modifiers changed from: protected */
    public final Object r(int i10, Object obj, Object obj2) {
        switch (I2.f48682a[i10 - 1]) {
            case 1:
                return new B2();
            case 2:
                return new b();
            case 3:
                return L4.t(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zze", "zzf", a.b(), "zzg", C7435w2.class});
            case 4:
                return zzc;
            case 5:
                E5<B2> e52 = zzd;
                if (e52 == null) {
                    synchronized (B2.class) {
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
