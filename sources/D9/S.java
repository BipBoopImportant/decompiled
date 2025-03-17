package d9;

import com.google.protobuf.C9592z;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.T;
import com.google.protobuf.a0;

public final class S extends GeneratedMessageLite<S, a> implements T {
    /* access modifiers changed from: private */
    public static final S DEFAULT_INSTANCE;
    public static final int IS_NEW_SESSION_FIELD_NUMBER = 3;
    private static volatile a0<S> PARSER = null;
    public static final int START_REASON_FIELD_NUMBER = 2;
    public static final int UNIX_TIMESTAMP_MS_FIELD_NUMBER = 1;
    private boolean isNewSession_;
    private int startReason_;
    private long unixTimestampMs_;

    public static final class a extends GeneratedMessageLite.a<S, a> implements T {
        private a() {
            super(S.DEFAULT_INSTANCE);
        }

        public a E(boolean z10) {
            u();
            ((S) this.f69206b).m(z10);
            return this;
        }

        public a G(b bVar) {
            u();
            ((S) this.f69206b).n(bVar);
            return this;
        }

        public a H(long j10) {
            u();
            ((S) this.f69206b).o(j10);
            return this;
        }
    }

    public enum b implements C9592z.c {
        START_REASON_UNSPECIFIED(0),
        START_REASON_REGULAR(1),
        START_REASON_FORCED(2),
        UNRECOGNIZED(-1);
        
        public static final int START_REASON_FORCED_VALUE = 2;
        public static final int START_REASON_REGULAR_VALUE = 1;
        public static final int START_REASON_UNSPECIFIED_VALUE = 0;
        private static final C9592z.d<b> internalValueMap = null;
        private final int value;

        public class a implements C9592z.d<b> {
            /* renamed from: b */
            public b a(int i10) {
                return b.b(i10);
            }
        }

        static {
            internalValueMap = new a();
        }

        private b(int i10) {
            this.value = i10;
        }

        public static b b(int i10) {
            if (i10 == 0) {
                return START_REASON_UNSPECIFIED;
            }
            if (i10 == 1) {
                return START_REASON_REGULAR;
            }
            if (i10 != 2) {
                return null;
            }
            return START_REASON_FORCED;
        }

        public final int d() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        S s10 = new S();
        DEFAULT_INSTANCE = s10;
        GeneratedMessageLite.registerDefaultInstance(S.class, s10);
    }

    private S() {
    }

    public static a l() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    /* access modifiers changed from: private */
    public void m(boolean z10) {
        this.isNewSession_ = z10;
    }

    /* access modifiers changed from: private */
    public void n(b bVar) {
        this.startReason_ = bVar.d();
    }

    /* access modifiers changed from: private */
    public void o(long j10) {
        this.unixTimestampMs_ = j10;
    }

    public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
        switch (C7777x.f50830a[fVar.ordinal()]) {
            case 1:
                return new S();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0003\u0002\f\u0003\u0007", new Object[]{"unixTimestampMs_", "startReason_", "isNewSession_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<S> a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (S.class) {
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
