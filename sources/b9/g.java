package b9;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.T;
import com.google.protobuf.a0;

public final class g extends GeneratedMessageLite<g, a> implements T {
    /* access modifiers changed from: private */
    public static final g DEFAULT_INSTANCE;
    public static final int ERROR_SOURCE_FIELD_NUMBER = 5;
    private static volatile a0<g> PARSER = null;
    public static final int PROJECT_ID_FIELD_NUMBER = 1;
    public static final int SESSION_NUMBER_FIELD_NUMBER = 2;
    public static final int USER_ID_FIELD_NUMBER = 4;
    public static final int VIEW_NUMBER_FIELD_NUMBER = 3;
    private int bitField0_;
    private String errorSource_ = "";
    private int projectId_;
    private int sessionNumber_;
    private String userId_ = "";
    private int viewNumber_;

    public static final class a extends GeneratedMessageLite.a<g, a> implements T {
        private a() {
            super(g.DEFAULT_INSTANCE);
        }

        public a E(String str) {
            u();
            ((g) this.f69206b).u(str);
            return this;
        }

        public a G(int i10) {
            u();
            ((g) this.f69206b).v(i10);
            return this;
        }

        public a H(int i10) {
            u();
            ((g) this.f69206b).w(i10);
            return this;
        }

        public a I(String str) {
            u();
            ((g) this.f69206b).x(str);
            return this;
        }

        public a K(int i10) {
            u();
            ((g) this.f69206b).y(i10);
            return this;
        }
    }

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        GeneratedMessageLite.registerDefaultInstance(g.class, gVar);
    }

    private g() {
    }

    public static g n() {
        return DEFAULT_INSTANCE;
    }

    public static a t() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    /* access modifiers changed from: private */
    public void u(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.errorSource_ = str;
    }

    /* access modifiers changed from: private */
    public void v(int i10) {
        this.projectId_ = i10;
    }

    /* access modifiers changed from: private */
    public void w(int i10) {
        this.sessionNumber_ = i10;
    }

    /* access modifiers changed from: private */
    public void x(String str) {
        str.getClass();
        this.userId_ = str;
    }

    /* access modifiers changed from: private */
    public void y(int i10) {
        this.viewNumber_ = i10;
    }

    public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
        switch (C7083e.f45641a[fVar.ordinal()]) {
            case 1:
                return new g();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004Ȉ\u0005ለ\u0000", new Object[]{"bitField0_", "projectId_", "sessionNumber_", "viewNumber_", "userId_", "errorSource_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<g> a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (g.class) {
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

    public String o() {
        return this.errorSource_;
    }

    public int p() {
        return this.sessionNumber_;
    }

    public String r() {
        return this.userId_;
    }

    public int s() {
        return this.viewNumber_;
    }
}
