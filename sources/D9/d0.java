package d9;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.T;
import com.google.protobuf.a0;

public final class d0 extends GeneratedMessageLite<d0, a> implements T {
    /* access modifiers changed from: private */
    public static final d0 DEFAULT_INSTANCE;
    public static final int EVENT_FIELD_NUMBER = 2;
    private static volatile a0<d0> PARSER = null;
    public static final int WEBVIEW_ID_FIELD_NUMBER = 1;
    private String event_ = "";
    private long webviewId_;

    public static final class a extends GeneratedMessageLite.a<d0, a> implements T {
        private a() {
            super(d0.DEFAULT_INSTANCE);
        }

        public a E(String str) {
            u();
            ((d0) this.f69206b).l(str);
            return this;
        }

        public a G(long j10) {
            u();
            ((d0) this.f69206b).m(j10);
            return this;
        }
    }

    static {
        d0 d0Var = new d0();
        DEFAULT_INSTANCE = d0Var;
        GeneratedMessageLite.registerDefaultInstance(d0.class, d0Var);
    }

    private d0() {
    }

    public static a k() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    /* access modifiers changed from: private */
    public void l(String str) {
        str.getClass();
        this.event_ = str;
    }

    /* access modifiers changed from: private */
    public void m(long j10) {
        this.webviewId_ = j10;
    }

    public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
        switch (C7777x.f50830a[fVar.ordinal()]) {
            case 1:
                return new d0();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0010\u0002Ȉ", new Object[]{"webviewId_", "event_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<d0> a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (d0.class) {
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
