package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C7310h2;
import com.google.android.gms.internal.measurement.L4;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.i2  reason: case insensitive filesystem */
public final class C7319i2 extends L4<C7319i2, a> implements C7422u5 {
    /* access modifiers changed from: private */
    public static final C7319i2 zzc;
    private static volatile E5<C7319i2> zzd;
    private int zze;
    private long zzf;
    private String zzg = "";
    private int zzh;
    private R4<C7355m2> zzi = L4.E();
    private R4<C7310h2> zzj = L4.E();
    /* access modifiers changed from: private */
    public R4<T1> zzk = L4.E();
    private String zzl = "";
    private boolean zzm;
    private R4<T2> zzn = L4.E();
    private R4<C7301g2> zzo = L4.E();
    private String zzp = "";
    private String zzq = "";
    private C7292f2 zzr;
    private C7337k2 zzs;
    private C7364n2 zzt;
    private C7346l2 zzu;
    private C7328j2 zzv;

    /* renamed from: com.google.android.gms.internal.measurement.i2$a */
    public static final class a extends L4.a<C7319i2, a> implements C7422u5 {
        public final C7310h2 A(int i10) {
            return ((C7319i2) this.f48734b).J(i10);
        }

        public final a C(int i10, C7310h2.a aVar) {
            v();
            C7319i2.L((C7319i2) this.f48734b, i10, (C7310h2) ((L4) aVar.s()));
            return this;
        }

        public final a D() {
            v();
            ((C7319i2) this.f48734b).zzk = L4.E();
            return this;
        }

        public final String E() {
            return ((C7319i2) this.f48734b).U();
        }

        public final List<T1> G() {
            return Collections.unmodifiableList(((C7319i2) this.f48734b).V());
        }

        public final List<C7301g2> H() {
            return Collections.unmodifiableList(((C7319i2) this.f48734b).W());
        }

        public final int z() {
            return ((C7319i2) this.f48734b).M();
        }

        private a() {
            super(C7319i2.zzc);
        }
    }

    static {
        C7319i2 i2Var = new C7319i2();
        zzc = i2Var;
        L4.v(C7319i2.class, i2Var);
    }

    private C7319i2() {
    }

    static /* synthetic */ void L(C7319i2 i2Var, int i10, C7310h2 h2Var) {
        h2Var.getClass();
        R4<C7310h2> r42 = i2Var.zzj;
        if (!r42.zzc()) {
            i2Var.zzj = L4.p(r42);
        }
        i2Var.zzj.set(i10, h2Var);
    }

    public static a P() {
        return (a) zzc.z();
    }

    public static C7319i2 R() {
        return zzc;
    }

    public final C7310h2 J(int i10) {
        return this.zzj.get(i10);
    }

    public final int M() {
        return this.zzj.size();
    }

    public final long N() {
        return this.zzf;
    }

    public final C7292f2 O() {
        C7292f2 f2Var = this.zzr;
        return f2Var == null ? C7292f2.K() : f2Var;
    }

    public final C7364n2 S() {
        C7364n2 n2Var = this.zzt;
        return n2Var == null ? C7364n2.K() : n2Var;
    }

    public final String T() {
        return this.zzg;
    }

    public final String U() {
        return this.zzp;
    }

    public final List<T1> V() {
        return this.zzk;
    }

    public final List<C7301g2> W() {
        return this.zzo;
    }

    public final List<T2> X() {
        return this.zzn;
    }

    public final List<C7355m2> Y() {
        return this.zzi;
    }

    public final boolean Z() {
        return (this.zze & 128) != 0;
    }

    public final boolean a0() {
        return (this.zze & 2) != 0;
    }

    public final boolean b0() {
        return (this.zze & 512) != 0;
    }

    public final boolean c0() {
        return (this.zze & 1) != 0;
    }

    public final int m() {
        return this.zzn.size();
    }

    /* access modifiers changed from: protected */
    public final Object r(int i10, Object obj, Object obj2) {
        switch (C7283e2.f48908a[i10 - 1]) {
            case 1:
                return new C7319i2();
            case 2:
                return new a();
            case 3:
                return L4.t(zzc, "\u0004\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", C7355m2.class, "zzj", C7310h2.class, "zzk", T1.class, "zzl", "zzm", "zzn", T2.class, "zzo", C7301g2.class, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv"});
            case 4:
                return zzc;
            case 5:
                E5<C7319i2> e52 = zzd;
                if (e52 == null) {
                    synchronized (C7319i2.class) {
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
