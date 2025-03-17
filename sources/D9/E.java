package d9;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.T;
import com.google.protobuf.a0;

public final class E extends GeneratedMessageLite<E, a> implements T {
    /* access modifiers changed from: private */
    public static final E DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile a0<E> PARSER = null;
    public static final int UNIX_TIMESTAMP_MS_FIELD_NUMBER = 2;
    private String name_ = "";
    private long unixTimestampMs_;

    public static final class a extends GeneratedMessageLite.a<E, a> implements T {
        private a() {
            super(E.DEFAULT_INSTANCE);
        }
    }

    static {
        E e10 = new E();
        DEFAULT_INSTANCE = e10;
        GeneratedMessageLite.registerDefaultInstance(E.class, e10);
    }

    private E() {
    }

    public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
        switch (C7777x.f50830a[fVar.ordinal()]) {
            case 1:
                return new E();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0003", new Object[]{"name_", "unixTimestampMs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<E> a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (E.class) {
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
