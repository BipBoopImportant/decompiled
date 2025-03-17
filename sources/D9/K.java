package d9;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.T;
import com.google.protobuf.a0;

public final class K extends GeneratedMessageLite<K, a> implements T {
    public static final int COL_NUMBER_FIELD_NUMBER = 5;
    /* access modifiers changed from: private */
    public static final K DEFAULT_INSTANCE;
    public static final int ERROR_SOURCE_FIELD_NUMBER = 6;
    public static final int FILENAME_FIELD_NUMBER = 3;
    public static final int LINE_NUMBER_FIELD_NUMBER = 4;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    public static final int PAGE_URL_FIELD_NUMBER = 8;
    private static volatile a0<K> PARSER = null;
    public static final int RELATIVE_TIME_FIELD_NUMBER = 1;
    public static final int UNIX_TIMESTAMP_MS_FIELD_NUMBER = 7;
    private int bitField0_;
    private int colNumber_;
    private String errorSource_ = "";
    private String filename_ = "";
    private int lineNumber_;
    private String message_ = "";
    private String pageUrl_ = "";
    private long relativeTime_;
    private long unixTimestampMs_;

    public static final class a extends GeneratedMessageLite.a<K, a> implements T {
        private a() {
            super(K.DEFAULT_INSTANCE);
        }

        public a E(int i10) {
            u();
            ((K) this.f69206b).s(i10);
            return this;
        }

        public a G(String str) {
            u();
            ((K) this.f69206b).t(str);
            return this;
        }

        public a H(String str) {
            u();
            ((K) this.f69206b).u(str);
            return this;
        }

        public a I(int i10) {
            u();
            ((K) this.f69206b).v(i10);
            return this;
        }

        public a K(String str) {
            u();
            ((K) this.f69206b).w(str);
            return this;
        }

        public a L(String str) {
            u();
            ((K) this.f69206b).x(str);
            return this;
        }

        public a M(long j10) {
            u();
            ((K) this.f69206b).y(j10);
            return this;
        }

        public a N(long j10) {
            u();
            ((K) this.f69206b).z(j10);
            return this;
        }
    }

    static {
        K k10 = new K();
        DEFAULT_INSTANCE = k10;
        GeneratedMessageLite.registerDefaultInstance(K.class, k10);
    }

    private K() {
    }

    public static a r() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    /* access modifiers changed from: private */
    public void s(int i10) {
        this.colNumber_ = i10;
    }

    /* access modifiers changed from: private */
    public void t(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.errorSource_ = str;
    }

    /* access modifiers changed from: private */
    public void u(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.filename_ = str;
    }

    /* access modifiers changed from: private */
    public void v(int i10) {
        this.lineNumber_ = i10;
    }

    /* access modifiers changed from: private */
    public void w(String str) {
        str.getClass();
        this.message_ = str;
    }

    /* access modifiers changed from: private */
    public void x(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.pageUrl_ = str;
    }

    /* access modifiers changed from: private */
    public void y(long j10) {
        this.relativeTime_ = j10;
    }

    /* access modifiers changed from: private */
    public void z(long j10) {
        this.unixTimestampMs_ = j10;
    }

    public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
        switch (C7777x.f50830a[fVar.ordinal()]) {
            case 1:
                return new K();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u0003\u0002Ȉ\u0003ለ\u0000\u0004\u000b\u0005\u000b\u0006ለ\u0001\u0007\u0003\bለ\u0002", new Object[]{"bitField0_", "relativeTime_", "message_", "filename_", "lineNumber_", "colNumber_", "errorSource_", "unixTimestampMs_", "pageUrl_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<K> a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (K.class) {
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
