package d9;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.T;
import com.google.protobuf.a0;

public final class J extends GeneratedMessageLite<J, a> implements T {
    /* access modifiers changed from: private */
    public static final J DEFAULT_INSTANCE;
    public static final int INDEX_IN_PARENT_FIELD_NUMBER = 3;
    public static final int PARENT_VIEW_ID_FIELD_NUMBER = 2;
    private static volatile a0<J> PARSER = null;
    public static final int UNIX_TIMESTAMP_MS_FIELD_NUMBER = 1;
    public static final int VIEW_FIELD_NUMBER = 4;
    private int bitField0_;
    private int indexInParent_;
    private long parentViewId_;
    private long unixTimestampMs_;
    private Y view_;

    public static final class a extends GeneratedMessageLite.a<J, a> implements T {
        private a() {
            super(J.DEFAULT_INSTANCE);
        }

        public a E(int i10) {
            u();
            ((J) this.f69206b).n(i10);
            return this;
        }

        public a G(long j10) {
            u();
            ((J) this.f69206b).o(j10);
            return this;
        }

        public a H(long j10) {
            u();
            ((J) this.f69206b).p(j10);
            return this;
        }

        public a I(Y y10) {
            u();
            ((J) this.f69206b).r(y10);
            return this;
        }
    }

    static {
        J j10 = new J();
        DEFAULT_INSTANCE = j10;
        GeneratedMessageLite.registerDefaultInstance(J.class, j10);
    }

    private J() {
    }

    public static a m() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    /* access modifiers changed from: private */
    public void n(int i10) {
        this.bitField0_ |= 2;
        this.indexInParent_ = i10;
    }

    /* access modifiers changed from: private */
    public void o(long j10) {
        this.bitField0_ |= 1;
        this.parentViewId_ = j10;
    }

    /* access modifiers changed from: private */
    public void p(long j10) {
        this.unixTimestampMs_ = j10;
    }

    /* access modifiers changed from: private */
    public void r(Y y10) {
        y10.getClass();
        this.view_ = y10;
        this.bitField0_ |= 4;
    }

    public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
        switch (C7777x.f50830a[fVar.ordinal()]) {
            case 1:
                return new J();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0003\u0002တ\u0000\u0003ဋ\u0001\u0004ဉ\u0002", new Object[]{"bitField0_", "unixTimestampMs_", "parentViewId_", "indexInParent_", "view_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<J> a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (J.class) {
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
