package d9;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.T;

public final class a0 extends GeneratedMessageLite<a0, a> implements T {
    /* access modifiers changed from: private */
    public static final a0 DEFAULT_INSTANCE;
    public static final int OFFSET_X_FIELD_NUMBER = 1;
    public static final int OFFSET_Y_FIELD_NUMBER = 2;
    public static final int OPACITY_FIELD_NUMBER = 3;
    private static volatile com.google.protobuf.a0<a0> PARSER = null;
    public static final int RADIUS_FIELD_NUMBER = 4;
    private float offsetX_;
    private float offsetY_;
    private float opacity_;
    private float radius_;

    public static final class a extends GeneratedMessageLite.a<a0, a> implements T {
        private a() {
            super(a0.DEFAULT_INSTANCE);
        }
    }

    static {
        a0 a0Var = new a0();
        DEFAULT_INSTANCE = a0Var;
        GeneratedMessageLite.registerDefaultInstance(a0.class, a0Var);
    }

    private a0() {
    }

    public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
        switch (C7777x.f50830a[fVar.ordinal()]) {
            case 1:
                return new a0();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0001\u0002\u0001\u0003\u0001\u0004\u0001", new Object[]{"offsetX_", "offsetY_", "opacity_", "radius_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.a0<a0> a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (a0.class) {
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
