package d9;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.T;
import com.google.protobuf.a0;

public final class e0 extends GeneratedMessageLite<e0, a> implements T {
    /* access modifiers changed from: private */
    public static final e0 DEFAULT_INSTANCE;
    public static final int HEIGHT_FIELD_NUMBER = 3;
    private static volatile a0<e0> PARSER = null;
    public static final int UNIX_TIMESTAMP_MS_FIELD_NUMBER = 1;
    public static final int WIDTH_FIELD_NUMBER = 2;
    private int height_;
    private long unixTimestampMs_;
    private int width_;

    public static final class a extends GeneratedMessageLite.a<e0, a> implements T {
        private a() {
            super(e0.DEFAULT_INSTANCE);
        }
    }

    static {
        e0 e0Var = new e0();
        DEFAULT_INSTANCE = e0Var;
        GeneratedMessageLite.registerDefaultInstance(e0.class, e0Var);
    }

    private e0() {
    }

    public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
        switch (C7777x.f50830a[fVar.ordinal()]) {
            case 1:
                return new e0();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0003\u0002\u000b\u0003\u000b", new Object[]{"unixTimestampMs_", "width_", "height_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<e0> a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (e0.class) {
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
