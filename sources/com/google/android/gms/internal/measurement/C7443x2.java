package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.L4;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.x2  reason: case insensitive filesystem */
public final class C7443x2 extends L4<C7443x2, a> implements C7422u5 {
    /* access modifiers changed from: private */
    public static final C7443x2 zzc;
    private static volatile E5<C7443x2> zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private float zzi;
    private double zzj;
    /* access modifiers changed from: private */
    public R4<C7443x2> zzk = L4.E();

    /* renamed from: com.google.android.gms.internal.measurement.x2$a */
    public static final class a extends L4.a<C7443x2, a> implements C7422u5 {
        public final a A(double d10) {
            v();
            C7443x2.L((C7443x2) this.f48734b, d10);
            return this;
        }

        public final a C(long j10) {
            v();
            C7443x2.M((C7443x2) this.f48734b, j10);
            return this;
        }

        public final a D(a aVar) {
            v();
            C7443x2.N((C7443x2) this.f48734b, (C7443x2) ((L4) aVar.s()));
            return this;
        }

        public final a E(Iterable<? extends C7443x2> iterable) {
            v();
            C7443x2.O((C7443x2) this.f48734b, iterable);
            return this;
        }

        public final a G(String str) {
            v();
            C7443x2.P((C7443x2) this.f48734b, str);
            return this;
        }

        public final a H() {
            v();
            C7443x2.K((C7443x2) this.f48734b);
            return this;
        }

        public final a I(String str) {
            v();
            C7443x2.S((C7443x2) this.f48734b, str);
            return this;
        }

        public final a K() {
            v();
            C7443x2.R((C7443x2) this.f48734b);
            return this;
        }

        public final a L() {
            v();
            ((C7443x2) this.f48734b).zzk = L4.E();
            return this;
        }

        public final a M() {
            v();
            C7443x2.W((C7443x2) this.f48734b);
            return this;
        }

        public final String N() {
            return ((C7443x2) this.f48734b).Z();
        }

        public final String O() {
            return ((C7443x2) this.f48734b).a0();
        }

        public final int z() {
            return ((C7443x2) this.f48734b).T();
        }

        private a() {
            super(C7443x2.zzc);
        }
    }

    static {
        C7443x2 x2Var = new C7443x2();
        zzc = x2Var;
        L4.v(C7443x2.class, x2Var);
    }

    private C7443x2() {
    }

    static /* synthetic */ void K(C7443x2 x2Var) {
        x2Var.zze &= -17;
        x2Var.zzj = 0.0d;
    }

    static /* synthetic */ void L(C7443x2 x2Var, double d10) {
        x2Var.zze |= 16;
        x2Var.zzj = d10;
    }

    static /* synthetic */ void M(C7443x2 x2Var, long j10) {
        x2Var.zze |= 4;
        x2Var.zzh = j10;
    }

    static /* synthetic */ void N(C7443x2 x2Var, C7443x2 x2Var2) {
        x2Var2.getClass();
        x2Var.h0();
        x2Var.zzk.add(x2Var2);
    }

    static /* synthetic */ void O(C7443x2 x2Var, Iterable iterable) {
        x2Var.h0();
        T3.h(iterable, x2Var.zzk);
    }

    static /* synthetic */ void P(C7443x2 x2Var, String str) {
        str.getClass();
        x2Var.zze |= 1;
        x2Var.zzf = str;
    }

    static /* synthetic */ void R(C7443x2 x2Var) {
        x2Var.zze &= -5;
        x2Var.zzh = 0;
    }

    static /* synthetic */ void S(C7443x2 x2Var, String str) {
        str.getClass();
        x2Var.zze |= 2;
        x2Var.zzg = str;
    }

    static /* synthetic */ void W(C7443x2 x2Var) {
        x2Var.zze &= -3;
        x2Var.zzg = zzc.zzg;
    }

    public static a X() {
        return (a) zzc.z();
    }

    private final void h0() {
        R4<C7443x2> r42 = this.zzk;
        if (!r42.zzc()) {
            this.zzk = L4.p(r42);
        }
    }

    public final double J() {
        return this.zzj;
    }

    public final float Q() {
        return this.zzi;
    }

    public final int T() {
        return this.zzk.size();
    }

    public final long V() {
        return this.zzh;
    }

    public final String Z() {
        return this.zzf;
    }

    public final String a0() {
        return this.zzg;
    }

    public final List<C7443x2> b0() {
        return this.zzk;
    }

    public final boolean c0() {
        return (this.zze & 16) != 0;
    }

    public final boolean d0() {
        return (this.zze & 8) != 0;
    }

    public final boolean e0() {
        return (this.zze & 4) != 0;
    }

    public final boolean f0() {
        return (this.zze & 1) != 0;
    }

    public final boolean g0() {
        return (this.zze & 2) != 0;
    }

    /* access modifiers changed from: protected */
    public final Object r(int i10, Object obj, Object obj2) {
        switch (I2.f48682a[i10 - 1]) {
            case 1:
                return new C7443x2();
            case 2:
                return new a();
            case 3:
                return L4.t(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", C7443x2.class});
            case 4:
                return zzc;
            case 5:
                E5<C7443x2> e52 = zzd;
                if (e52 == null) {
                    synchronized (C7443x2.class) {
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
