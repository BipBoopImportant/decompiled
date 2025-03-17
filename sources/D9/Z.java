package d9;

import com.google.protobuf.C9592z;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.T;
import com.google.protobuf.a0;

public final class Z extends GeneratedMessageLite<Z, a> implements T {
    public static final int CONTENT_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final Z DEFAULT_INSTANCE;
    public static final int FONT_NAMES_FIELD_NUMBER = 3;
    public static final int NUMBER_OF_LINES_FIELD_NUMBER = 2;
    private static volatile a0<Z> PARSER;
    private String content_ = "";
    private C9592z.i<String> fontNames_ = GeneratedMessageLite.emptyProtobufList();
    private int numberOfLines_;

    public static final class a extends GeneratedMessageLite.a<Z, a> implements T {
        private a() {
            super(Z.DEFAULT_INSTANCE);
        }
    }

    static {
        Z z10 = new Z();
        DEFAULT_INSTANCE = z10;
        GeneratedMessageLite.registerDefaultInstance(Z.class, z10);
    }

    private Z() {
    }

    public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
        switch (C7777x.f50830a[fVar.ordinal()]) {
            case 1:
                return new Z();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u000b\u0003Ț", new Object[]{"content_", "numberOfLines_", "fontNames_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<Z> a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (Z.class) {
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
