package d9;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.T;
import com.google.protobuf.a0;

public final class I extends GeneratedMessageLite<I, a> implements T {
    public static final int CLASS_NAME_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final I DEFAULT_INSTANCE;
    public static final int INCREMENTAL_PATH_FIELD_NUMBER = 2;
    private static volatile a0<I> PARSER = null;
    public static final int RELIABLE_PATH_FIELD_NUMBER = 3;
    private int bitField0_;
    private String className_ = "";
    private String incrementalPath_ = "";
    private String reliablePath_ = "";

    public static final class a extends GeneratedMessageLite.a<I, a> implements T {
        private a() {
            super(I.DEFAULT_INSTANCE);
        }

        public a E(String str) {
            u();
            ((I) this.f69206b).l(str);
            return this;
        }

        public a G(String str) {
            u();
            ((I) this.f69206b).m(str);
            return this;
        }
    }

    static {
        I i10 = new I();
        DEFAULT_INSTANCE = i10;
        GeneratedMessageLite.registerDefaultInstance(I.class, i10);
    }

    private I() {
    }

    public static a k() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    /* access modifiers changed from: private */
    public void l(String str) {
        str.getClass();
        this.className_ = str;
    }

    /* access modifiers changed from: private */
    public void m(String str) {
        str.getClass();
        this.incrementalPath_ = str;
    }

    public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
        switch (C7777x.f50830a[fVar.ordinal()]) {
            case 1:
                return new I();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ለ\u0000", new Object[]{"bitField0_", "className_", "incrementalPath_", "reliablePath_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<I> a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (I.class) {
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
