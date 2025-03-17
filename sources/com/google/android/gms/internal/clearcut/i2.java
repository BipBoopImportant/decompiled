package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C7186g0;
import java.util.List;

public final class i2 extends C7186g0<i2, a> implements O0 {
    private static volatile W0<i2> zzbg;
    /* access modifiers changed from: private */
    public static final i2 zzbir;
    private C7201l0<b> zzbiq = C7186g0.j();

    public static final class a extends C7186g0.a<i2, a> implements O0 {
        private a() {
            super(i2.zzbir);
        }

        /* synthetic */ a(j2 j2Var) {
            this();
        }
    }

    public static final class b extends C7186g0<b, a> implements O0 {
        private static volatile W0<b> zzbg;
        /* access modifiers changed from: private */
        public static final b zzbiv;
        private int zzbb;
        private String zzbis = "";
        private long zzbit;
        private long zzbiu;
        private int zzya;

        public static final class a extends C7186g0.a<b, a> implements O0 {
            private a() {
                super(b.zzbiv);
            }

            public final a k(String str) {
                e();
                ((b) this.f48376b).C(str);
                return this;
            }

            public final a l(long j10) {
                e();
                ((b) this.f48376b).D(j10);
                return this;
            }

            public final a m(long j10) {
                e();
                ((b) this.f48376b).E(j10);
                return this;
            }

            /* synthetic */ a(j2 j2Var) {
                this();
            }
        }

        static {
            b bVar = new b();
            zzbiv = bVar;
            C7186g0.h(b.class, bVar);
        }

        private b() {
        }

        /* access modifiers changed from: private */
        public final void C(String str) {
            str.getClass();
            this.zzbb |= 2;
            this.zzbis = str;
        }

        /* access modifiers changed from: private */
        public final void D(long j10) {
            this.zzbb |= 4;
            this.zzbit = j10;
        }

        /* access modifiers changed from: private */
        public final void E(long j10) {
            this.zzbb |= 8;
            this.zzbiu = j10;
        }

        public static a t() {
            return (a) ((C7186g0.a) zzbiv.e(C7186g0.e.f48385e, (Object) null, (Object) null));
        }

        /* JADX WARNING: type inference failed for: r3v14, types: [com.google.android.gms.internal.clearcut.g0$b, com.google.android.gms.internal.clearcut.W0<com.google.android.gms.internal.clearcut.i2$b>] */
        /* access modifiers changed from: protected */
        public final Object e(int i10, Object obj, Object obj2) {
            W0<b> w02;
            switch (j2.f48417a[i10 - 1]) {
                case 1:
                    return new b();
                case 2:
                    return new a((j2) null);
                case 3:
                    return C7186g0.f(zzbiv, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0005\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\u0002\u0002\u0004\u0002\u0003", new Object[]{"zzbb", "zzya", "zzbis", "zzbit", "zzbiu"});
                case 4:
                    return zzbiv;
                case 5:
                    W0<b> w03 = zzbg;
                    W0<b> w04 = w03;
                    if (w03 == null) {
                        synchronized (b.class) {
                            try {
                                W0<b> w05 = zzbg;
                                w02 = w05;
                                if (w05 == null) {
                                    ? bVar = new C7186g0.b(zzbiv);
                                    zzbg = bVar;
                                    w02 = bVar;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        w04 = w02;
                    }
                    return w04;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final int l() {
            return this.zzya;
        }

        public final boolean p() {
            return (this.zzbb & 1) == 1;
        }

        public final String q() {
            return this.zzbis;
        }

        public final long r() {
            return this.zzbit;
        }

        public final long s() {
            return this.zzbiu;
        }
    }

    static {
        i2 i2Var = new i2();
        zzbir = i2Var;
        C7186g0.h(i2.class, i2Var);
    }

    private i2() {
    }

    public static i2 m() {
        return zzbir;
    }

    public static i2 o(byte[] bArr) {
        return (i2) C7186g0.i(zzbir, bArr);
    }

    /* JADX WARNING: type inference failed for: r1v14, types: [com.google.android.gms.internal.clearcut.g0$b, com.google.android.gms.internal.clearcut.W0<com.google.android.gms.internal.clearcut.i2>] */
    /* access modifiers changed from: protected */
    public final Object e(int i10, Object obj, Object obj2) {
        W0<i2> w02;
        switch (j2.f48417a[i10 - 1]) {
            case 1:
                return new i2();
            case 2:
                return new a((j2) null);
            case 3:
                return C7186g0.f(zzbir, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0002\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzbiq", b.class});
            case 4:
                return zzbir;
            case 5:
                W0<i2> w03 = zzbg;
                W0<i2> w04 = w03;
                if (w03 == null) {
                    synchronized (i2.class) {
                        try {
                            W0<i2> w05 = zzbg;
                            w02 = w05;
                            if (w05 == null) {
                                ? bVar = new C7186g0.b(zzbir);
                                zzbg = bVar;
                                w02 = bVar;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    w04 = w02;
                }
                return w04;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final List<b> l() {
        return this.zzbiq;
    }
}
