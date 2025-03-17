package d9;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.T;
import com.google.protobuf.a0;

public final class U extends GeneratedMessageLite<U, a> implements T {
    /* access modifiers changed from: private */
    public static final U DEFAULT_INSTANCE;
    private static volatile a0<U> PARSER = null;
    public static final int UNIX_TIMESTAMP_MS_FIELD_NUMBER = 1;
    public static final int VIEW_ID_FIELD_NUMBER = 2;
    private long unixTimestampMs_;
    private long viewId_;

    public static final class a extends GeneratedMessageLite.a<U, a> implements T {
        private a() {
            super(U.DEFAULT_INSTANCE);
        }

        public a E(long j10) {
            u();
            ((U) this.f69206b).l(j10);
            return this;
        }

        public a G(long j10) {
            u();
            ((U) this.f69206b).m(j10);
            return this;
        }
    }

    static {
        U u10 = new U();
        DEFAULT_INSTANCE = u10;
        GeneratedMessageLite.registerDefaultInstance(U.class, u10);
    }

    private U() {
    }

    public static a k() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    /* access modifiers changed from: private */
    public void l(long j10) {
        this.unixTimestampMs_ = j10;
    }

    /* access modifiers changed from: private */
    public void m(long j10) {
        this.viewId_ = j10;
    }

    public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
        switch (C7777x.f50830a[fVar.ordinal()]) {
            case 1:
                return new U();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0003\u0002\u0010", new Object[]{"unixTimestampMs_", "viewId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<U> a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (U.class) {
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
