package d9;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.T;
import com.google.protobuf.a0;

public final class L extends GeneratedMessageLite<L, a> implements T {
    /* access modifiers changed from: private */
    public static final L DEFAULT_INSTANCE;
    public static final int INDEX_IN_PARENT_FIELD_NUMBER = 4;
    public static final int NEW_PARENT_VIEW_ID_FIELD_NUMBER = 3;
    private static volatile a0<L> PARSER = null;
    public static final int UNIX_TIMESTAMP_MS_FIELD_NUMBER = 1;
    public static final int VIEW_ID_FIELD_NUMBER = 2;
    private int indexInParent_;
    private long newParentViewId_;
    private long unixTimestampMs_;
    private long viewId_;

    public static final class a extends GeneratedMessageLite.a<L, a> implements T {
        private a() {
            super(L.DEFAULT_INSTANCE);
        }
    }

    static {
        L l10 = new L();
        DEFAULT_INSTANCE = l10;
        GeneratedMessageLite.registerDefaultInstance(L.class, l10);
    }

    private L() {
    }

    public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
        switch (C7777x.f50830a[fVar.ordinal()]) {
            case 1:
                return new L();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0003\u0002\u0010\u0003\u0010\u0004\u000b", new Object[]{"unixTimestampMs_", "viewId_", "newParentViewId_", "indexInParent_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<L> a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (L.class) {
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
