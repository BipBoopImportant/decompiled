package d9;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.T;
import com.google.protobuf.a0;

/* renamed from: d9.B  reason: case insensitive filesystem */
public final class C7754B extends GeneratedMessageLite<C7754B, a> implements T {
    public static final int CRASH_ID_FIELD_NUMBER = 2;
    /* access modifiers changed from: private */
    public static final C7754B DEFAULT_INSTANCE;
    public static final int ERROR_SOURCE_FIELD_NUMBER = 4;
    private static volatile a0<C7754B> PARSER = null;
    public static final int RELATIVE_TIME_FIELD_NUMBER = 3;
    public static final int UNIX_TIMESTAMP_MS_FIELD_NUMBER = 1;
    private int bitField0_;
    private long crashId_;
    private String errorSource_ = "";
    private long relativeTime_;
    private long unixTimestampMs_;

    /* renamed from: d9.B$a */
    public static final class a extends GeneratedMessageLite.a<C7754B, a> implements T {
        private a() {
            super(C7754B.DEFAULT_INSTANCE);
        }

        public a E(long j10) {
            u();
            ((C7754B) this.f69206b).n(j10);
            return this;
        }

        public a G(String str) {
            u();
            ((C7754B) this.f69206b).o(str);
            return this;
        }

        public a H(long j10) {
            u();
            ((C7754B) this.f69206b).p(j10);
            return this;
        }

        public a I(long j10) {
            u();
            ((C7754B) this.f69206b).r(j10);
            return this;
        }
    }

    static {
        C7754B b10 = new C7754B();
        DEFAULT_INSTANCE = b10;
        GeneratedMessageLite.registerDefaultInstance(C7754B.class, b10);
    }

    private C7754B() {
    }

    public static a m() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    /* access modifiers changed from: private */
    public void n(long j10) {
        this.crashId_ = j10;
    }

    /* access modifiers changed from: private */
    public void o(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.errorSource_ = str;
    }

    /* access modifiers changed from: private */
    public void p(long j10) {
        this.relativeTime_ = j10;
    }

    /* access modifiers changed from: private */
    public void r(long j10) {
        this.unixTimestampMs_ = j10;
    }

    public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
        switch (C7777x.f50830a[fVar.ordinal()]) {
            case 1:
                return new C7754B();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0003\u0002\u0003\u0003\u0003\u0004ለ\u0000", new Object[]{"bitField0_", "unixTimestampMs_", "crashId_", "relativeTime_", "errorSource_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<C7754B> a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (C7754B.class) {
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
