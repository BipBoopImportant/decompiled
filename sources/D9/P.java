package d9;

import com.google.protobuf.C9592z;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.T;
import com.google.protobuf.a0;

public final class P extends GeneratedMessageLite<P, a> implements T {
    /* access modifiers changed from: private */
    public static final P DEFAULT_INSTANCE;
    public static final int NETWORK_VALUES_FIELD_NUMBER = 4;
    private static volatile a0<P> PARSER = null;
    public static final int QUALITY_LEVELS_FIELD_NUMBER = 3;
    public static final int REASON_FIELD_NUMBER = 2;
    public static final int UNIX_TIMESTAMP_MS_FIELD_NUMBER = 1;
    private int bitField0_;
    private b networkValues_;
    private c qualityLevels_;
    private int reason_;
    private long unixTimestampMs_;

    public static final class a extends GeneratedMessageLite.a<P, a> implements T {
        private a() {
            super(P.DEFAULT_INSTANCE);
        }

        public a E(b bVar) {
            u();
            ((P) this.f69206b).n(bVar);
            return this;
        }

        public a G(c cVar) {
            u();
            ((P) this.f69206b).o(cVar);
            return this;
        }

        public a H(d dVar) {
            u();
            ((P) this.f69206b).p(dVar);
            return this;
        }

        public a I(long j10) {
            u();
            ((P) this.f69206b).r(j10);
            return this;
        }
    }

    public static final class b extends GeneratedMessageLite<b, a> implements T {
        public static final int CURRENT_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final b DEFAULT_INSTANCE;
        private static volatile a0<b> PARSER = null;
        public static final int PREVIOUS_FIELD_NUMBER = 1;
        private int bitField0_;
        private int current_;
        private int previous_;

        public static final class a extends GeneratedMessageLite.a<b, a> implements T {
            private a() {
                super(b.DEFAULT_INSTANCE);
            }

            public a E(N n10) {
                u();
                ((b) this.f69206b).l(n10);
                return this;
            }

            public a G(N n10) {
                u();
                ((b) this.f69206b).m(n10);
                return this;
            }
        }

        static {
            b bVar = new b();
            DEFAULT_INSTANCE = bVar;
            GeneratedMessageLite.registerDefaultInstance(b.class, bVar);
        }

        private b() {
        }

        public static a k() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        /* access modifiers changed from: private */
        public void l(N n10) {
            this.current_ = n10.d();
        }

        /* access modifiers changed from: private */
        public void m(N n10) {
            this.previous_ = n10.d();
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            switch (C7777x.f50830a[fVar.ordinal()]) {
                case 1:
                    return new b();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002\f", new Object[]{"bitField0_", "previous_", "current_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    a0<b> a0Var = PARSER;
                    if (a0Var == null) {
                        synchronized (b.class) {
                            try {
                                a0Var = PARSER;
                                if (a0Var == null) {
                                    a0Var = new GeneratedMessageLite.b<>(DEFAULT_INSTANCE);
                                    PARSER = a0Var;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    return a0Var;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class c extends GeneratedMessageLite<c, a> implements T {
        public static final int CURRENT_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final c DEFAULT_INSTANCE;
        private static volatile a0<c> PARSER = null;
        public static final int PREVIOUS_FIELD_NUMBER = 1;
        private int bitField0_;
        private int current_;
        private int previous_;

        public static final class a extends GeneratedMessageLite.a<c, a> implements T {
            private a() {
                super(c.DEFAULT_INSTANCE);
            }

            public a E(Q q10) {
                u();
                ((c) this.f69206b).l(q10);
                return this;
            }

            public a G(Q q10) {
                u();
                ((c) this.f69206b).m(q10);
                return this;
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            GeneratedMessageLite.registerDefaultInstance(c.class, cVar);
        }

        private c() {
        }

        public static a k() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        /* access modifiers changed from: private */
        public void l(Q q10) {
            this.current_ = q10.d();
        }

        /* access modifiers changed from: private */
        public void m(Q q10) {
            this.previous_ = q10.d();
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            switch (C7777x.f50830a[fVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002\f", new Object[]{"bitField0_", "previous_", "current_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    a0<c> a0Var = PARSER;
                    if (a0Var == null) {
                        synchronized (c.class) {
                            try {
                                a0Var = PARSER;
                                if (a0Var == null) {
                                    a0Var = new GeneratedMessageLite.b<>(DEFAULT_INSTANCE);
                                    PARSER = a0Var;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    return a0Var;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public enum d implements C9592z.c {
        REASON_UNSPECIFIED(0),
        REASON_CONFIG_APPLIED(1),
        REASON_NETWORK_CHANGED(2),
        REASON_CPU_USAGE_CHANGED(3),
        UNRECOGNIZED(-1);
        
        public static final int REASON_CONFIG_APPLIED_VALUE = 1;
        public static final int REASON_CPU_USAGE_CHANGED_VALUE = 3;
        public static final int REASON_NETWORK_CHANGED_VALUE = 2;
        public static final int REASON_UNSPECIFIED_VALUE = 0;
        private static final C9592z.d<d> internalValueMap = null;
        private final int value;

        public class a implements C9592z.d<d> {
            /* renamed from: b */
            public d a(int i10) {
                return d.b(i10);
            }
        }

        static {
            internalValueMap = new a();
        }

        private d(int i10) {
            this.value = i10;
        }

        public static d b(int i10) {
            if (i10 == 0) {
                return REASON_UNSPECIFIED;
            }
            if (i10 == 1) {
                return REASON_CONFIG_APPLIED;
            }
            if (i10 == 2) {
                return REASON_NETWORK_CHANGED;
            }
            if (i10 != 3) {
                return null;
            }
            return REASON_CPU_USAGE_CHANGED;
        }

        public final int d() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        P p10 = new P();
        DEFAULT_INSTANCE = p10;
        GeneratedMessageLite.registerDefaultInstance(P.class, p10);
    }

    private P() {
    }

    public static a m() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    /* access modifiers changed from: private */
    public void n(b bVar) {
        bVar.getClass();
        this.networkValues_ = bVar;
        this.bitField0_ |= 2;
    }

    /* access modifiers changed from: private */
    public void o(c cVar) {
        cVar.getClass();
        this.qualityLevels_ = cVar;
        this.bitField0_ |= 1;
    }

    /* access modifiers changed from: private */
    public void p(d dVar) {
        this.reason_ = dVar.d();
    }

    /* access modifiers changed from: private */
    public void r(long j10) {
        this.unixTimestampMs_ = j10;
    }

    public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
        switch (C7777x.f50830a[fVar.ordinal()]) {
            case 1:
                return new P();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0003\u0002\f\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"bitField0_", "unixTimestampMs_", "reason_", "qualityLevels_", "networkValues_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<P> a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (P.class) {
                        try {
                            a0Var = PARSER;
                            if (a0Var == null) {
                                a0Var = new GeneratedMessageLite.b<>(DEFAULT_INSTANCE);
                                PARSER = a0Var;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                return a0Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
