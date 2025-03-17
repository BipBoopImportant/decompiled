package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.L4;

public final class E2 extends L4<E2, b> implements C7422u5 {
    /* access modifiers changed from: private */
    public static final E2 zzc;
    private static volatile E5<E2> zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    public enum a implements N4 {
        CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN(0),
        CLIENT_UPLOAD_ELIGIBLE(1),
        MEASUREMENT_SERVICE_NOT_ENABLED(2),
        ANDROID_TOO_OLD(3),
        NON_PLAY_MODE(4),
        SDK_TOO_OLD(5),
        MISSING_JOB_SCHEDULER(6),
        NOT_ENABLED_IN_MANIFEST(7),
        CLIENT_FLAG_OFF(8),
        SERVICE_FLAG_OFF(20),
        PINNED_TO_SERVICE_UPLOAD(21),
        MISSING_SGTM_SERVER_URL(22);
        
        private final int zzn;

        private a(int i10) {
            this.zzn = i10;
        }

        public static a a(int i10) {
            switch (i10) {
                case 0:
                    return CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN;
                case 1:
                    return CLIENT_UPLOAD_ELIGIBLE;
                case 2:
                    return MEASUREMENT_SERVICE_NOT_ENABLED;
                case 3:
                    return ANDROID_TOO_OLD;
                case 4:
                    return NON_PLAY_MODE;
                case 5:
                    return SDK_TOO_OLD;
                case 6:
                    return MISSING_JOB_SCHEDULER;
                case 7:
                    return NOT_ENABLED_IN_MANIFEST;
                case 8:
                    return CLIENT_FLAG_OFF;
                default:
                    switch (i10) {
                        case 20:
                            return SERVICE_FLAG_OFF;
                        case 21:
                            return PINNED_TO_SERVICE_UPLOAD;
                        case 22:
                            return MISSING_SGTM_SERVER_URL;
                        default:
                            return null;
                    }
            }
        }

        public static Q4 b() {
            return M2.f48748a;
        }

        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzn + " name=" + name() + '>';
        }

        public final int zza() {
            return this.zzn;
        }
    }

    public static final class b extends L4.a<E2, b> implements C7422u5 {
        public final b A(c cVar) {
            v();
            E2.L((E2) this.f48734b, cVar);
            return this;
        }

        public final b C(d dVar) {
            v();
            E2.M((E2) this.f48734b, dVar);
            return this;
        }

        public final b z(a aVar) {
            v();
            E2.K((E2) this.f48734b, aVar);
            return this;
        }

        private b() {
            super(E2.zzc);
        }
    }

    public enum c implements N4 {
        SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN(0),
        SERVICE_UPLOAD_ELIGIBLE(1),
        NOT_IN_ROLLOUT(2),
        MISSING_SGTM_SETTINGS(3),
        MISSING_SGTM_PROXY_INFO(4),
        NON_PLAY_MISSING_SGTM_SERVER_URL(5);
        
        private final int zzh;

        private c(int i10) {
            this.zzh = i10;
        }

        public static c a(int i10) {
            if (i10 == 0) {
                return SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN;
            }
            if (i10 == 1) {
                return SERVICE_UPLOAD_ELIGIBLE;
            }
            if (i10 == 2) {
                return NOT_IN_ROLLOUT;
            }
            if (i10 == 3) {
                return MISSING_SGTM_SETTINGS;
            }
            if (i10 == 4) {
                return MISSING_SGTM_PROXY_INFO;
            }
            if (i10 != 5) {
                return null;
            }
            return NON_PLAY_MISSING_SGTM_SERVER_URL;
        }

        public static Q4 b() {
            return N2.f48760a;
        }

        public final String toString() {
            return "<" + c.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzh + " name=" + name() + '>';
        }

        public final int zza() {
            return this.zzh;
        }
    }

    public enum d implements N4 {
        UPLOAD_TYPE_UNKNOWN(0),
        GA_UPLOAD(1),
        SDK_CLIENT_UPLOAD(2),
        PACKAGE_SERVICE_UPLOAD(3),
        SDK_SERVICE_UPLOAD(4);
        
        private final int zzg;

        private d(int i10) {
            this.zzg = i10;
        }

        public static d a(int i10) {
            if (i10 == 0) {
                return UPLOAD_TYPE_UNKNOWN;
            }
            if (i10 == 1) {
                return GA_UPLOAD;
            }
            if (i10 == 2) {
                return SDK_CLIENT_UPLOAD;
            }
            if (i10 == 3) {
                return PACKAGE_SERVICE_UPLOAD;
            }
            if (i10 != 4) {
                return null;
            }
            return SDK_SERVICE_UPLOAD;
        }

        public static Q4 b() {
            return O2.f48767a;
        }

        public final String toString() {
            return "<" + d.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzg + " name=" + name() + '>';
        }

        public final int zza() {
            return this.zzg;
        }
    }

    static {
        E2 e22 = new E2();
        zzc = e22;
        L4.v(E2.class, e22);
    }

    private E2() {
    }

    public static b J() {
        return (b) zzc.z();
    }

    static /* synthetic */ void K(E2 e22, a aVar) {
        e22.zzg = aVar.zza();
        e22.zze |= 2;
    }

    static /* synthetic */ void L(E2 e22, c cVar) {
        e22.zzh = cVar.zza();
        e22.zze |= 4;
    }

    static /* synthetic */ void M(E2 e22, d dVar) {
        e22.zzf = dVar.zza();
        e22.zze |= 1;
    }

    public static E2 R() {
        return zzc;
    }

    public final a N() {
        a a10 = a.a(this.zzg);
        return a10 == null ? a.CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN : a10;
    }

    public final c O() {
        c a10 = c.a(this.zzh);
        return a10 == null ? c.SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN : a10;
    }

    public final d P() {
        d a10 = d.a(this.zzf);
        return a10 == null ? d.UPLOAD_TYPE_UNKNOWN : a10;
    }

    /* access modifiers changed from: protected */
    public final Object r(int i10, Object obj, Object obj2) {
        switch (I2.f48682a[i10 - 1]) {
            case 1:
                return new E2();
            case 2:
                return new b();
            case 3:
                return L4.t(zzc, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zze", "zzf", d.b(), "zzg", a.b(), "zzh", c.b()});
            case 4:
                return zzc;
            case 5:
                E5<E2> e52 = zzd;
                if (e52 == null) {
                    synchronized (E2.class) {
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
