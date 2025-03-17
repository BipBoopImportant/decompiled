package d9;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.T;
import com.google.protobuf.a0;

public final class V extends GeneratedMessageLite<V, a> implements T {
    /* access modifiers changed from: private */
    public static final V DEFAULT_INSTANCE;
    private static volatile a0<V> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int UNIX_TIMESTAMP_MS_FIELD_NUMBER = 1;
    private String title_ = "";
    private long unixTimestampMs_;

    public static final class a extends GeneratedMessageLite.a<V, a> implements T {
        private a() {
            super(V.DEFAULT_INSTANCE);
        }

        public a E(long j10) {
            u();
            ((V) this.f69206b).k(j10);
            return this;
        }
    }

    static {
        V v10 = new V();
        DEFAULT_INSTANCE = v10;
        GeneratedMessageLite.registerDefaultInstance(V.class, v10);
    }

    private V() {
    }

    public static a j() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    /* access modifiers changed from: private */
    public void k(long j10) {
        this.unixTimestampMs_ = j10;
    }

    public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
        switch (C7777x.f50830a[fVar.ordinal()]) {
            case 1:
                return new V();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0003\u0002Ȉ", new Object[]{"unixTimestampMs_", "title_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<V> a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (V.class) {
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
