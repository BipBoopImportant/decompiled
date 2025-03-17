package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C7186g0;

/* renamed from: com.google.android.gms.internal.clearcut.b2  reason: case insensitive filesystem */
public final class C7172b2 extends C7186g0<C7172b2, a> implements O0 {
    private static volatile W0<C7172b2> zzbg;
    /* access modifiers changed from: private */
    public static final C7172b2 zztx;
    private int zzbb;
    private int zztu;
    private String zztv = "";
    private String zztw = "";

    /* renamed from: com.google.android.gms.internal.clearcut.b2$a */
    public static final class a extends C7186g0.a<C7172b2, a> implements O0 {
        private a() {
            super(C7172b2.zztx);
        }

        /* synthetic */ a(e2 e2Var) {
            this();
        }
    }

    static {
        C7172b2 b2Var = new C7172b2();
        zztx = b2Var;
        C7186g0.h(C7172b2.class, b2Var);
    }

    private C7172b2() {
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.clearcut.g0$b, com.google.android.gms.internal.clearcut.W0<com.google.android.gms.internal.clearcut.b2>] */
    /* access modifiers changed from: protected */
    public final Object e(int i10, Object obj, Object obj2) {
        W0<C7172b2> w02;
        switch (e2.f48355a[i10 - 1]) {
            case 1:
                return new C7172b2();
            case 2:
                return new a((e2) null);
            case 3:
                return C7186g0.f(zztx, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0004\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\b\u0002", new Object[]{"zzbb", "zztu", "zztv", "zztw"});
            case 4:
                return zztx;
            case 5:
                W0<C7172b2> w03 = zzbg;
                W0<C7172b2> w04 = w03;
                if (w03 == null) {
                    synchronized (C7172b2.class) {
                        try {
                            W0<C7172b2> w05 = zzbg;
                            w02 = w05;
                            if (w05 == null) {
                                ? bVar = new C7186g0.b(zztx);
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
}
