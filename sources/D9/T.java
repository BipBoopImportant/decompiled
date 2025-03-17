package d9;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.a0;

public final class T extends GeneratedMessageLite<T, a> implements com.google.protobuf.T {
    /* access modifiers changed from: private */
    public static final T DEFAULT_INSTANCE;
    private static volatile a0<T> PARSER = null;
    public static final int STOP_REASON_FIELD_NUMBER = 2;
    public static final int UNIX_TIMESTAMP_MS_FIELD_NUMBER = 1;
    private int stopReason_;
    private long unixTimestampMs_;

    public static final class a extends GeneratedMessageLite.a<T, a> implements com.google.protobuf.T {
        private a() {
            super(T.DEFAULT_INSTANCE);
        }
    }

    static {
        T t10 = new T();
        DEFAULT_INSTANCE = t10;
        GeneratedMessageLite.registerDefaultInstance(T.class, t10);
    }

    private T() {
    }

    public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
        switch (C7777x.f50830a[fVar.ordinal()]) {
            case 1:
                return new T();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0003\u0002\f", new Object[]{"unixTimestampMs_", "stopReason_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<T> a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (T.class) {
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
