package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C7186g0;

public final class c2 extends C7186g0<c2, a> implements O0 {
    /* access modifiers changed from: private */
    public static final c2 zzbfc;
    private static volatile W0<c2> zzbg;
    private int zzbb;
    private int zzbfa = -1;
    private int zzbfb;

    public static final class a extends C7186g0.a<c2, a> implements O0 {
        private a() {
            super(c2.zzbfc);
        }

        /* synthetic */ a(e2 e2Var) {
            this();
        }
    }

    public enum b implements C7195j0 {
        UNKNOWN_MOBILE_SUBTYPE(0),
        GPRS(1),
        EDGE(2),
        UMTS(3),
        CDMA(4),
        EVDO_0(5),
        EVDO_A(6),
        RTT(7),
        HSDPA(8),
        HSUPA(9),
        HSPA(10),
        IDEN(11),
        EVDO_B(12),
        LTE(13),
        EHRPD(14),
        HSPAP(15),
        GSM(16),
        TD_SCDMA(17),
        IWLAN(18),
        LTE_CA(19),
        COMBINED(100);
        
        private static final C7198k0<b> zzbq = null;
        private final int value;

        static {
            zzbq = new f2();
        }

        private b(int i10) {
            this.value = i10;
        }

        public static b a(int i10) {
            if (i10 == 100) {
                return COMBINED;
            }
            switch (i10) {
                case 0:
                    return UNKNOWN_MOBILE_SUBTYPE;
                case 1:
                    return GPRS;
                case 2:
                    return EDGE;
                case 3:
                    return UMTS;
                case 4:
                    return CDMA;
                case 5:
                    return EVDO_0;
                case 6:
                    return EVDO_A;
                case 7:
                    return RTT;
                case 8:
                    return HSDPA;
                case 9:
                    return HSUPA;
                case 10:
                    return HSPA;
                case 11:
                    return IDEN;
                case 12:
                    return EVDO_B;
                case 13:
                    return LTE;
                case 14:
                    return EHRPD;
                case 15:
                    return HSPAP;
                case 16:
                    return GSM;
                case 17:
                    return TD_SCDMA;
                case 18:
                    return IWLAN;
                case 19:
                    return LTE_CA;
                default:
                    return null;
            }
        }

        public static C7198k0<b> b() {
            return zzbq;
        }

        public final int zzc() {
            return this.value;
        }
    }

    public enum c implements C7195j0 {
        NONE(-1),
        MOBILE(0),
        WIFI(1),
        MOBILE_MMS(2),
        MOBILE_SUPL(3),
        MOBILE_DUN(4),
        MOBILE_HIPRI(5),
        WIMAX(6),
        BLUETOOTH(7),
        DUMMY(8),
        ETHERNET(9),
        MOBILE_FOTA(10),
        MOBILE_IMS(11),
        MOBILE_CBS(12),
        WIFI_P2P(13),
        MOBILE_IA(14),
        MOBILE_EMERGENCY(15),
        PROXY(16),
        VPN(17);
        
        private static final C7198k0<c> zzbq = null;
        private final int value;

        static {
            zzbq = new g2();
        }

        private c(int i10) {
            this.value = i10;
        }

        public static c a(int i10) {
            switch (i10) {
                case -1:
                    return NONE;
                case 0:
                    return MOBILE;
                case 1:
                    return WIFI;
                case 2:
                    return MOBILE_MMS;
                case 3:
                    return MOBILE_SUPL;
                case 4:
                    return MOBILE_DUN;
                case 5:
                    return MOBILE_HIPRI;
                case 6:
                    return WIMAX;
                case 7:
                    return BLUETOOTH;
                case 8:
                    return DUMMY;
                case 9:
                    return ETHERNET;
                case 10:
                    return MOBILE_FOTA;
                case 11:
                    return MOBILE_IMS;
                case 12:
                    return MOBILE_CBS;
                case 13:
                    return WIFI_P2P;
                case 14:
                    return MOBILE_IA;
                case 15:
                    return MOBILE_EMERGENCY;
                case 16:
                    return PROXY;
                case 17:
                    return VPN;
                default:
                    return null;
            }
        }

        public static C7198k0<c> b() {
            return zzbq;
        }

        public final int zzc() {
            return this.value;
        }
    }

    static {
        c2 c2Var = new c2();
        zzbfc = c2Var;
        C7186g0.h(c2.class, c2Var);
    }

    private c2() {
    }

    /* JADX WARNING: type inference failed for: r3v14, types: [com.google.android.gms.internal.clearcut.g0$b, com.google.android.gms.internal.clearcut.W0<com.google.android.gms.internal.clearcut.c2>] */
    /* access modifiers changed from: protected */
    public final Object e(int i10, Object obj, Object obj2) {
        W0<c2> w02;
        switch (e2.f48355a[i10 - 1]) {
            case 1:
                return new c2();
            case 2:
                return new a((e2) null);
            case 3:
                return C7186g0.f(zzbfc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001", new Object[]{"zzbb", "zzbfa", c.b(), "zzbfb", b.b()});
            case 4:
                return zzbfc;
            case 5:
                W0<c2> w03 = zzbg;
                W0<c2> w04 = w03;
                if (w03 == null) {
                    synchronized (c2.class) {
                        try {
                            W0<c2> w05 = zzbg;
                            w02 = w05;
                            if (w05 == null) {
                                ? bVar = new C7186g0.b(zzbfc);
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
