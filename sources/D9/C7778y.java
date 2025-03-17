package d9;

import com.google.protobuf.C9592z;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.T;
import com.google.protobuf.a0;

/* renamed from: d9.y  reason: case insensitive filesystem */
public final class C7778y extends GeneratedMessageLite<C7778y, a> implements T {
    /* access modifiers changed from: private */
    public static final C7778y DEFAULT_INSTANCE;
    private static volatile a0<C7778y> PARSER = null;
    public static final int STATE_TRANSITION_FIELD_NUMBER = 2;
    public static final int UNIX_TIMESTAMP_MS_FIELD_NUMBER = 1;
    private int stateTransition_;
    private long unixTimestampMs_;

    /* renamed from: d9.y$a */
    public static final class a extends GeneratedMessageLite.a<C7778y, a> implements T {
        private a() {
            super(C7778y.DEFAULT_INSTANCE);
        }

        public a E(b bVar) {
            u();
            ((C7778y) this.f69206b).l(bVar);
            return this;
        }

        public a G(long j10) {
            u();
            ((C7778y) this.f69206b).m(j10);
            return this;
        }
    }

    /* renamed from: d9.y$b */
    public enum b implements C9592z.c {
        TRANSITION_UNSPECIFIED(0),
        TRANSITION_INACTIVE(1),
        TRANSITION_BACKGROUND(2),
        TRANSITION_FOREGROUND(3),
        TRANSITION_ACTIVE(4),
        UNRECOGNIZED(-1);
        
        public static final int TRANSITION_ACTIVE_VALUE = 4;
        public static final int TRANSITION_BACKGROUND_VALUE = 2;
        public static final int TRANSITION_FOREGROUND_VALUE = 3;
        public static final int TRANSITION_INACTIVE_VALUE = 1;
        public static final int TRANSITION_UNSPECIFIED_VALUE = 0;
        private static final C9592z.d<b> internalValueMap = null;
        private final int value;

        /* renamed from: d9.y$b$a */
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
                return TRANSITION_UNSPECIFIED;
            }
            if (i10 == 1) {
                return TRANSITION_INACTIVE;
            }
            if (i10 == 2) {
                return TRANSITION_BACKGROUND;
            }
            if (i10 == 3) {
                return TRANSITION_FOREGROUND;
            }
            if (i10 != 4) {
                return null;
            }
            return TRANSITION_ACTIVE;
        }

        public final int d() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        C7778y yVar = new C7778y();
        DEFAULT_INSTANCE = yVar;
        GeneratedMessageLite.registerDefaultInstance(C7778y.class, yVar);
    }

    private C7778y() {
    }

    public static a k() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    /* access modifiers changed from: private */
    public void l(b bVar) {
        this.stateTransition_ = bVar.d();
    }

    /* access modifiers changed from: private */
    public void m(long j10) {
        this.unixTimestampMs_ = j10;
    }

    public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
        switch (C7777x.f50830a[fVar.ordinal()]) {
            case 1:
                return new C7778y();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0003\u0002\f", new Object[]{"unixTimestampMs_", "stateTransition_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<C7778y> a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (C7778y.class) {
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
