package b9;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.T;
import com.google.protobuf.a0;

public final class n extends GeneratedMessageLite<n, a> implements T {
    public static final int ANDROID_FIELD_NUMBER = 2;
    /* access modifiers changed from: private */
    public static final n DEFAULT_INSTANCE;
    public static final int EMPTY_REPORT_FIELD_NUMBER = 3;
    public static final int FLUTTER_FIELD_NUMBER = 4;
    public static final int IOS_FIELD_NUMBER = 1;
    private static volatile a0<n> PARSER = null;
    public static final int REACT_NATIVE_FIELD_NUMBER = 5;
    private int reportCase_ = 0;
    private Object report_;

    public static final class a extends GeneratedMessageLite.a<n, a> implements T {
        private a() {
            super(n.DEFAULT_INSTANCE);
        }

        public a E(f fVar) {
            u();
            ((n) this.f69206b).l(fVar);
            return this;
        }

        public a G(j jVar) {
            u();
            ((n) this.f69206b).m(jVar);
            return this;
        }
    }

    static {
        n nVar = new n();
        DEFAULT_INSTANCE = nVar;
        GeneratedMessageLite.registerDefaultInstance(n.class, nVar);
    }

    private n() {
    }

    public static a k() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    /* access modifiers changed from: private */
    public void l(f fVar) {
        fVar.getClass();
        this.report_ = fVar;
        this.reportCase_ = 2;
    }

    /* access modifiers changed from: private */
    public void m(j jVar) {
        jVar.getClass();
        this.report_ = jVar;
        this.reportCase_ = 4;
    }

    public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
        switch (C7083e.f45641a[fVar.ordinal()]) {
            case 1:
                return new n();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"report_", "reportCase_", k.class, f.class, i.class, j.class, m.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<n> a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (n.class) {
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
