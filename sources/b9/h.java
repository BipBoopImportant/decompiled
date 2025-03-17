package b9;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.T;
import com.google.protobuf.a0;

public final class h extends GeneratedMessageLite<h, a> implements T {
    public static final int CONTEXT_FIELD_NUMBER = 1;
    public static final int CRASH_ID_FIELD_NUMBER = 3;
    /* access modifiers changed from: private */
    public static final h DEFAULT_INSTANCE;
    public static final int OS_FIELD_NUMBER = 2;
    private static volatile a0<h> PARSER = null;
    public static final int RELATIVE_TIME_FIELD_NUMBER = 4;
    public static final int THREAD_REPORT_FIELD_NUMBER = 5;
    private int bitField0_;
    private g context_;
    private long crashId_;
    private int os_;
    private long relativeTime_;
    private n threadReport_;

    public static final class a extends GeneratedMessageLite.a<h, a> implements T {
        private a() {
            super(h.DEFAULT_INSTANCE);
        }

        public a E(g gVar) {
            u();
            ((h) this.f69206b).t(gVar);
            return this;
        }

        public a G(long j10) {
            u();
            ((h) this.f69206b).u(j10);
            return this;
        }

        public a H(l lVar) {
            u();
            ((h) this.f69206b).v(lVar);
            return this;
        }

        public a I(long j10) {
            u();
            ((h) this.f69206b).w(j10);
            return this;
        }

        public a K(n nVar) {
            u();
            ((h) this.f69206b).x(nVar);
            return this;
        }
    }

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        GeneratedMessageLite.registerDefaultInstance(h.class, hVar);
    }

    private h() {
    }

    public static a r() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static h s(byte[] bArr) {
        return (h) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    /* access modifiers changed from: private */
    public void t(g gVar) {
        gVar.getClass();
        this.context_ = gVar;
        this.bitField0_ |= 1;
    }

    /* access modifiers changed from: private */
    public void u(long j10) {
        this.crashId_ = j10;
    }

    /* access modifiers changed from: private */
    public void v(l lVar) {
        this.os_ = lVar.d();
    }

    /* access modifiers changed from: private */
    public void w(long j10) {
        this.relativeTime_ = j10;
    }

    /* access modifiers changed from: private */
    public void x(n nVar) {
        nVar.getClass();
        this.threadReport_ = nVar;
        this.bitField0_ |= 2;
    }

    public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
        switch (C7083e.f45641a[fVar.ordinal()]) {
            case 1:
                return new h();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u0003\u0004\u0003\u0005ဉ\u0001", new Object[]{"bitField0_", "context_", "os_", "crashId_", "relativeTime_", "threadReport_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<h> a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (h.class) {
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

    public g n() {
        g gVar = this.context_;
        return gVar == null ? g.n() : gVar;
    }

    public long o() {
        return this.crashId_;
    }

    public long p() {
        return this.relativeTime_;
    }
}
