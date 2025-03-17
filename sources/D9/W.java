package d9;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.T;
import com.google.protobuf.a0;

public final class W extends GeneratedMessageLite<W, a> implements T {
    /* access modifiers changed from: private */
    public static final W DEFAULT_INSTANCE;
    private static volatile a0<W> PARSER = null;
    public static final int STYLE_CHANGES_FIELD_NUMBER = 3;
    public static final int UNIX_TIMESTAMP_MS_FIELD_NUMBER = 1;
    public static final int VIEW_ID_FIELD_NUMBER = 2;
    private int bitField0_;
    private b0 styleChanges_;
    private long unixTimestampMs_;
    private long viewId_;

    public static final class a extends GeneratedMessageLite.a<W, a> implements T {
        private a() {
            super(W.DEFAULT_INSTANCE);
        }

        public a E(b0 b0Var) {
            u();
            ((W) this.f69206b).m(b0Var);
            return this;
        }

        public a G(long j10) {
            u();
            ((W) this.f69206b).n(j10);
            return this;
        }

        public a H(long j10) {
            u();
            ((W) this.f69206b).o(j10);
            return this;
        }
    }

    static {
        W w10 = new W();
        DEFAULT_INSTANCE = w10;
        GeneratedMessageLite.registerDefaultInstance(W.class, w10);
    }

    private W() {
    }

    public static a l() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    /* access modifiers changed from: private */
    public void m(b0 b0Var) {
        b0Var.getClass();
        this.styleChanges_ = b0Var;
        this.bitField0_ |= 1;
    }

    /* access modifiers changed from: private */
    public void n(long j10) {
        this.unixTimestampMs_ = j10;
    }

    /* access modifiers changed from: private */
    public void o(long j10) {
        this.viewId_ = j10;
    }

    public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
        switch (C7777x.f50830a[fVar.ordinal()]) {
            case 1:
                return new W();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0003\u0002\u0010\u0003ဉ\u0000", new Object[]{"bitField0_", "unixTimestampMs_", "viewId_", "styleChanges_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<W> a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (W.class) {
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
