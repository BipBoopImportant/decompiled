package d9;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.T;
import com.google.protobuf.a0;

public final class c0 extends GeneratedMessageLite<c0, a> implements T {
    public static final int ALIGNMENT_FIELD_NUMBER = 5;
    public static final int COLOR_HEX_FIELD_NUMBER = 4;
    /* access modifiers changed from: private */
    public static final c0 DEFAULT_INSTANCE;
    public static final int FONT_FAMILY_FIELD_NUMBER = 1;
    public static final int FONT_FIELD_NUMBER = 2;
    public static final int NUMBER_OF_LINES_FIELD_NUMBER = 6;
    private static volatile a0<c0> PARSER = null;
    public static final int SIZE_FIELD_NUMBER = 3;
    public static final int TEXT_FIELD_NUMBER = 7;
    private int alignment_;
    private String colorHex_ = "";
    private String fontFamily_ = "";
    private String font_ = "";
    private int numberOfLines_;
    private float size_;
    private String text_ = "";

    public static final class a extends GeneratedMessageLite.a<c0, a> implements T {
        private a() {
            super(c0.DEFAULT_INSTANCE);
        }
    }

    static {
        c0 c0Var = new c0();
        DEFAULT_INSTANCE = c0Var;
        GeneratedMessageLite.registerDefaultInstance(c0.class, c0Var);
    }

    private c0() {
    }

    public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
        switch (C7777x.f50830a[fVar.ordinal()]) {
            case 1:
                return new c0();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0001\u0004Ȉ\u0005\f\u0006\u000b\u0007Ȉ", new Object[]{"fontFamily_", "font_", "size_", "colorHex_", "alignment_", "numberOfLines_", "text_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<c0> a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (c0.class) {
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
