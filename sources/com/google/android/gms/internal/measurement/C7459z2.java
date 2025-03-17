package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.A2;
import com.google.android.gms.internal.measurement.L4;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.z2  reason: case insensitive filesystem */
public final class C7459z2 extends L4<C7459z2, b> implements C7422u5 {
    /* access modifiers changed from: private */
    public static final C7459z2 zzc;
    private static volatile E5<C7459z2> zzd;
    private int zze;
    /* access modifiers changed from: private */
    public R4<A2> zzf = L4.E();
    private String zzg = "";
    private String zzh = "";
    private int zzi;

    /* renamed from: com.google.android.gms.internal.measurement.z2$a */
    public enum a implements N4 {
        SDK(0),
        SGTM(1);
        
        private final int zzd;

        private a(int i10) {
            this.zzd = i10;
        }

        public static a a(int i10) {
            if (i10 == 0) {
                return SDK;
            }
            if (i10 != 1) {
                return null;
            }
            return SGTM;
        }

        public static Q4 b() {
            return K2.f48704a;
        }

        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzd + " name=" + name() + '>';
        }

        public final int zza() {
            return this.zzd;
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.z2$b */
    public static final class b extends L4.a<C7459z2, b> implements C7422u5 {
        public final b A(int i10, A2.a aVar) {
            v();
            C7459z2.L((C7459z2) this.f48734b, i10, (A2) ((L4) aVar.s()));
            return this;
        }

        public final b C(A2.a aVar) {
            v();
            C7459z2.M((C7459z2) this.f48734b, (A2) ((L4) aVar.s()));
            return this;
        }

        public final b D(Iterable<? extends A2> iterable) {
            v();
            C7459z2.N((C7459z2) this.f48734b, iterable);
            return this;
        }

        public final b E(String str) {
            v();
            C7459z2.O((C7459z2) this.f48734b, str);
            return this;
        }

        public final A2 G(int i10) {
            return ((C7459z2) this.f48734b).K(i10);
        }

        public final b H() {
            v();
            ((C7459z2) this.f48734b).zzf = L4.E();
            return this;
        }

        public final b I(String str) {
            v();
            C7459z2.R((C7459z2) this.f48734b, str);
            return this;
        }

        public final String K() {
            return ((C7459z2) this.f48734b).T();
        }

        public final List<A2> L() {
            return Collections.unmodifiableList(((C7459z2) this.f48734b).V());
        }

        public final int z() {
            return ((C7459z2) this.f48734b).m();
        }

        private b() {
            super(C7459z2.zzc);
        }
    }

    static {
        C7459z2 z2Var = new C7459z2();
        zzc = z2Var;
        L4.v(C7459z2.class, z2Var);
    }

    private C7459z2() {
    }

    public static b J(C7459z2 z2Var) {
        return (b) zzc.n(z2Var);
    }

    static /* synthetic */ void L(C7459z2 z2Var, int i10, A2 a22) {
        a22.getClass();
        z2Var.Y();
        z2Var.zzf.set(i10, a22);
    }

    static /* synthetic */ void M(C7459z2 z2Var, A2 a22) {
        a22.getClass();
        z2Var.Y();
        z2Var.zzf.add(a22);
    }

    static /* synthetic */ void N(C7459z2 z2Var, Iterable iterable) {
        z2Var.Y();
        T3.h(iterable, z2Var.zzf);
    }

    static /* synthetic */ void O(C7459z2 z2Var, String str) {
        str.getClass();
        z2Var.zze |= 1;
        z2Var.zzg = str;
    }

    public static b P() {
        return (b) zzc.z();
    }

    static /* synthetic */ void R(C7459z2 z2Var, String str) {
        str.getClass();
        z2Var.zze |= 2;
        z2Var.zzh = str;
    }

    private final void Y() {
        R4<A2> r42 = this.zzf;
        if (!r42.zzc()) {
            this.zzf = L4.p(r42);
        }
    }

    public final A2 K(int i10) {
        return this.zzf.get(i10);
    }

    public final String T() {
        return this.zzg;
    }

    public final String U() {
        return this.zzh;
    }

    public final List<A2> V() {
        return this.zzf;
    }

    public final boolean W() {
        return (this.zze & 1) != 0;
    }

    public final boolean X() {
        return (this.zze & 2) != 0;
    }

    public final int m() {
        return this.zzf.size();
    }

    /* access modifiers changed from: protected */
    public final Object r(int i10, Object obj, Object obj2) {
        switch (I2.f48682a[i10 - 1]) {
            case 1:
                return new C7459z2();
            case 2:
                return new b();
            case 3:
                return L4.t(zzc, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zze", "zzf", A2.class, "zzg", "zzh", "zzi", a.b()});
            case 4:
                return zzc;
            case 5:
                E5<C7459z2> e52 = zzd;
                if (e52 == null) {
                    synchronized (C7459z2.class) {
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
