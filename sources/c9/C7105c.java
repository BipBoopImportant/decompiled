package c9;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.T;
import com.google.protobuf.a0;

/* renamed from: c9.c  reason: case insensitive filesystem */
public final class C7105c extends GeneratedMessageLite<C7105c, a> implements T {
    /* access modifiers changed from: private */
    public static final C7105c DEFAULT_INSTANCE;
    public static final int PAGEVIEW_NUMBER_FIELD_NUMBER = 5;
    private static volatile a0<C7105c> PARSER = null;
    public static final int PROJECT_ID_FIELD_NUMBER = 2;
    public static final int RELATIVE_TIME_MS_FIELD_NUMBER = 6;
    public static final int SCHEMA_VERSION_FIELD_NUMBER = 1;
    public static final int SESSION_NUMBER_FIELD_NUMBER = 4;
    public static final int VISITOR_ID_FIELD_NUMBER = 3;
    private int pageviewNumber_;
    private int projectId_;
    private long relativeTimeMs_;
    private String schemaVersion_ = "";
    private int sessionNumber_;
    private String visitorId_ = "";

    /* renamed from: c9.c$a */
    public static final class a extends GeneratedMessageLite.a<C7105c, a> implements T {
        private a() {
            super(C7105c.DEFAULT_INSTANCE);
        }

        public a E(int i10) {
            u();
            ((C7105c) this.f69206b).s(i10);
            return this;
        }

        public a G(int i10) {
            u();
            ((C7105c) this.f69206b).t(i10);
            return this;
        }

        public a H(long j10) {
            u();
            ((C7105c) this.f69206b).u(j10);
            return this;
        }

        public a I(int i10) {
            u();
            ((C7105c) this.f69206b).v(i10);
            return this;
        }

        public a K(String str) {
            u();
            ((C7105c) this.f69206b).w(str);
            return this;
        }
    }

    static {
        C7105c cVar = new C7105c();
        DEFAULT_INSTANCE = cVar;
        GeneratedMessageLite.registerDefaultInstance(C7105c.class, cVar);
    }

    private C7105c() {
    }

    public static a r() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    /* access modifiers changed from: private */
    public void s(int i10) {
        this.pageviewNumber_ = i10;
    }

    /* access modifiers changed from: private */
    public void t(int i10) {
        this.projectId_ = i10;
    }

    /* access modifiers changed from: private */
    public void u(long j10) {
        this.relativeTimeMs_ = j10;
    }

    /* access modifiers changed from: private */
    public void v(int i10) {
        this.sessionNumber_ = i10;
    }

    /* access modifiers changed from: private */
    public void w(String str) {
        str.getClass();
        this.visitorId_ = str;
    }

    public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
        switch (C7104b.f45771a[fVar.ordinal()]) {
            case 1:
                return new C7105c();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u000b\u0003Ȉ\u0004\u000b\u0005\u000b\u0006\u0003", new Object[]{"schemaVersion_", "projectId_", "visitorId_", "sessionNumber_", "pageviewNumber_", "relativeTimeMs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<C7105c> a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (C7105c.class) {
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

    public int n() {
        return this.projectId_;
    }

    public int o() {
        return this.sessionNumber_;
    }

    public String p() {
        return this.visitorId_;
    }
}
