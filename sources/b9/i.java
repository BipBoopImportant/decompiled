package b9;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.T;
import com.google.protobuf.a0;

public final class i extends GeneratedMessageLite<i, a> implements T {
    /* access modifiers changed from: private */
    public static final i DEFAULT_INSTANCE;
    private static volatile a0<i> PARSER;

    public static final class a extends GeneratedMessageLite.a<i, a> implements T {
        private a() {
            super(i.DEFAULT_INSTANCE);
        }
    }

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        GeneratedMessageLite.registerDefaultInstance(i.class, iVar);
    }

    private i() {
    }

    public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
        switch (C7083e.f45641a[fVar.ordinal()]) {
            case 1:
                return new i();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", (Object[]) null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<i> a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (i.class) {
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
