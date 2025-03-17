package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C7443x2;
import com.google.android.gms.internal.measurement.L4;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.v2  reason: case insensitive filesystem */
public final class C7427v2 extends L4<C7427v2, a> implements C7422u5 {
    /* access modifiers changed from: private */
    public static final C7427v2 zzc;
    private static volatile E5<C7427v2> zzd;
    private int zze;
    /* access modifiers changed from: private */
    public R4<C7443x2> zzf = L4.E();
    private String zzg = "";
    private long zzh;
    private long zzi;
    private int zzj;

    /* renamed from: com.google.android.gms.internal.measurement.v2$a */
    public static final class a extends L4.a<C7427v2, a> implements C7422u5 {
        public final a A(int i10) {
            v();
            C7427v2.L((C7427v2) this.f48734b, i10);
            return this;
        }

        public final a C(int i10, C7443x2.a aVar) {
            v();
            C7427v2.M((C7427v2) this.f48734b, i10, (C7443x2) ((L4) aVar.s()));
            return this;
        }

        public final a D(int i10, C7443x2 x2Var) {
            v();
            C7427v2.M((C7427v2) this.f48734b, i10, x2Var);
            return this;
        }

        public final a E(long j10) {
            v();
            C7427v2.N((C7427v2) this.f48734b, j10);
            return this;
        }

        public final a G(C7443x2.a aVar) {
            v();
            C7427v2.O((C7427v2) this.f48734b, (C7443x2) ((L4) aVar.s()));
            return this;
        }

        public final a H(C7443x2 x2Var) {
            v();
            C7427v2.O((C7427v2) this.f48734b, x2Var);
            return this;
        }

        public final a I(Iterable<? extends C7443x2> iterable) {
            v();
            C7427v2.P((C7427v2) this.f48734b, iterable);
            return this;
        }

        public final a K(String str) {
            v();
            C7427v2.Q((C7427v2) this.f48734b, str);
            return this;
        }

        public final long L() {
            return ((C7427v2) this.f48734b).T();
        }

        public final a M(long j10) {
            v();
            C7427v2.S((C7427v2) this.f48734b, j10);
            return this;
        }

        public final C7443x2 N(int i10) {
            return ((C7427v2) this.f48734b).J(i10);
        }

        public final long O() {
            return ((C7427v2) this.f48734b).U();
        }

        public final a P() {
            v();
            ((C7427v2) this.f48734b).zzf = L4.E();
            return this;
        }

        public final String Q() {
            return ((C7427v2) this.f48734b).X();
        }

        public final List<C7443x2> R() {
            return Collections.unmodifiableList(((C7427v2) this.f48734b).Y());
        }

        public final boolean S() {
            return ((C7427v2) this.f48734b).b0();
        }

        public final int z() {
            return ((C7427v2) this.f48734b).R();
        }

        private a() {
            super(C7427v2.zzc);
        }
    }

    static {
        C7427v2 v2Var = new C7427v2();
        zzc = v2Var;
        L4.v(C7427v2.class, v2Var);
    }

    private C7427v2() {
    }

    static /* synthetic */ void L(C7427v2 v2Var, int i10) {
        v2Var.c0();
        v2Var.zzf.remove(i10);
    }

    static /* synthetic */ void M(C7427v2 v2Var, int i10, C7443x2 x2Var) {
        x2Var.getClass();
        v2Var.c0();
        v2Var.zzf.set(i10, x2Var);
    }

    static /* synthetic */ void N(C7427v2 v2Var, long j10) {
        v2Var.zze |= 4;
        v2Var.zzi = j10;
    }

    static /* synthetic */ void O(C7427v2 v2Var, C7443x2 x2Var) {
        x2Var.getClass();
        v2Var.c0();
        v2Var.zzf.add(x2Var);
    }

    static /* synthetic */ void P(C7427v2 v2Var, Iterable iterable) {
        v2Var.c0();
        T3.h(iterable, v2Var.zzf);
    }

    static /* synthetic */ void Q(C7427v2 v2Var, String str) {
        str.getClass();
        v2Var.zze |= 1;
        v2Var.zzg = str;
    }

    static /* synthetic */ void S(C7427v2 v2Var, long j10) {
        v2Var.zze |= 2;
        v2Var.zzh = j10;
    }

    public static a V() {
        return (a) zzc.z();
    }

    private final void c0() {
        R4<C7443x2> r42 = this.zzf;
        if (!r42.zzc()) {
            this.zzf = L4.p(r42);
        }
    }

    public final C7443x2 J(int i10) {
        return this.zzf.get(i10);
    }

    public final int R() {
        return this.zzf.size();
    }

    public final long T() {
        return this.zzi;
    }

    public final long U() {
        return this.zzh;
    }

    public final String X() {
        return this.zzg;
    }

    public final List<C7443x2> Y() {
        return this.zzf;
    }

    public final boolean Z() {
        return (this.zze & 8) != 0;
    }

    public final boolean a0() {
        return (this.zze & 4) != 0;
    }

    public final boolean b0() {
        return (this.zze & 2) != 0;
    }

    public final int m() {
        return this.zzj;
    }

    /* access modifiers changed from: protected */
    public final Object r(int i10, Object obj, Object obj2) {
        switch (I2.f48682a[i10 - 1]) {
            case 1:
                return new C7427v2();
            case 2:
                return new a();
            case 3:
                return L4.t(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", C7443x2.class, "zzg", "zzh", "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                E5<C7427v2> e52 = zzd;
                if (e52 == null) {
                    synchronized (C7427v2.class) {
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
