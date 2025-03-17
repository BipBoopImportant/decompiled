package d9;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.T;
import com.google.protobuf.a0;

public final class F extends GeneratedMessageLite<F, a> implements T {
    public static final int APP_STATE_CHANGE_FIELD_NUMBER = 7;
    public static final int ASSET_HASHES_FIELD_NUMBER = 18;
    public static final int CRASH_FIELD_NUMBER = 17;
    public static final int CUSTOM_ERROR_FIELD_NUMBER = 20;
    /* access modifiers changed from: private */
    public static final F DEFAULT_INSTANCE;
    public static final int END_OF_SCREEN_VIEW_FIELD_NUMBER = 9;
    public static final int ETR_SCREEN_FIELD_NUMBER = 21;
    public static final int ETR_SESSION_FIELD_NUMBER = 22;
    public static final int GESTURE_FIELD_NUMBER = 16;
    public static final int INSERTION_MUTATION_FIELD_NUMBER = 1;
    public static final int JS_ERROR_FIELD_NUMBER = 19;
    public static final int MOVE_MUTATION_FIELD_NUMBER = 3;
    public static final int NETWORK_REQUEST_METRIC_FIELD_NUMBER = 13;
    public static final int ONLINE_ASSETS_FIELD_NUMBER = 15;
    private static volatile a0<F> PARSER = null;
    public static final int QUALITY_SETTINGS_APPLIED_FIELD_NUMBER = 12;
    public static final int RECORDING_START_FIELD_NUMBER = 10;
    public static final int RECORDING_STOP_FIELD_NUMBER = 11;
    public static final int REMOVAL_MUTATION_FIELD_NUMBER = 2;
    public static final int SCREEN_VIEW_FIELD_NUMBER = 8;
    public static final int STYLE_MUTATION_FIELD_NUMBER = 4;
    public static final int TOUCH_GESTURE_FIELD_NUMBER = 5;
    public static final int WEBVIEW_EVENT_FIELD_NUMBER = 14;
    public static final int WINDOW_RESIZE_FIELD_NUMBER = 6;
    private int eventCase_ = 0;
    private Object event_;

    public static final class a extends GeneratedMessageLite.a<F, a> implements T {
        private a() {
            super(F.DEFAULT_INSTANCE);
        }

        public a E(C7778y yVar) {
            u();
            ((F) this.f69206b).C(yVar);
            return this;
        }

        public a G(C7753A a10) {
            u();
            ((F) this.f69206b).D(a10);
            return this;
        }

        public a H(C7754B b10) {
            u();
            ((F) this.f69206b).E(b10);
            return this;
        }

        public a I(C c10) {
            u();
            ((F) this.f69206b).F(c10);
            return this;
        }

        public a K(D d10) {
            u();
            ((F) this.f69206b).G(d10);
            return this;
        }

        public a L(H h10) {
            u();
            ((F) this.f69206b).H(h10);
            return this;
        }

        public a M(J j10) {
            u();
            ((F) this.f69206b).I(j10);
            return this;
        }

        public a N(K k10) {
            u();
            ((F) this.f69206b).J(k10);
            return this;
        }

        public a O(M m10) {
            u();
            ((F) this.f69206b).K(m10);
            return this;
        }

        public a P(O o10) {
            u();
            ((F) this.f69206b).L(o10);
            return this;
        }

        public a Q(P p10) {
            u();
            ((F) this.f69206b).M(p10);
            return this;
        }

        public a R(S s10) {
            u();
            ((F) this.f69206b).N(s10);
            return this;
        }

        public a S(U u10) {
            u();
            ((F) this.f69206b).O(u10);
            return this;
        }

        public a T(V v10) {
            u();
            ((F) this.f69206b).P(v10);
            return this;
        }

        public a V(W w10) {
            u();
            ((F) this.f69206b).Q(w10);
            return this;
        }

        public a W(X x10) {
            u();
            ((F) this.f69206b).R(x10);
            return this;
        }

        public a X(d0 d0Var) {
            u();
            ((F) this.f69206b).S(d0Var);
            return this;
        }
    }

    public enum b {
        INSERTION_MUTATION(1),
        REMOVAL_MUTATION(2),
        MOVE_MUTATION(3),
        STYLE_MUTATION(4),
        TOUCH_GESTURE(5),
        WINDOW_RESIZE(6),
        APP_STATE_CHANGE(7),
        SCREEN_VIEW(8),
        END_OF_SCREEN_VIEW(9),
        RECORDING_START(10),
        RECORDING_STOP(11),
        QUALITY_SETTINGS_APPLIED(12),
        NETWORK_REQUEST_METRIC(13),
        WEBVIEW_EVENT(14),
        ONLINE_ASSETS(15),
        GESTURE(16),
        CRASH(17),
        ASSET_HASHES(18),
        JS_ERROR(19),
        CUSTOM_ERROR(20),
        ETR_SCREEN(21),
        ETR_SESSION(22),
        EVENT_NOT_SET(0);
        
        private final int value;

        private b(int i10) {
            this.value = i10;
        }

        public int d() {
            return this.value;
        }
    }

    static {
        F f10 = new F();
        DEFAULT_INSTANCE = f10;
        GeneratedMessageLite.registerDefaultInstance(F.class, f10);
    }

    private F() {
    }

    public static a A() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static F B(byte[] bArr) {
        return (F) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    /* access modifiers changed from: private */
    public void C(C7778y yVar) {
        yVar.getClass();
        this.event_ = yVar;
        this.eventCase_ = 7;
    }

    /* access modifiers changed from: private */
    public void D(C7753A a10) {
        a10.getClass();
        this.event_ = a10;
        this.eventCase_ = 18;
    }

    /* access modifiers changed from: private */
    public void E(C7754B b10) {
        b10.getClass();
        this.event_ = b10;
        this.eventCase_ = 17;
    }

    /* access modifiers changed from: private */
    public void F(C c10) {
        c10.getClass();
        this.event_ = c10;
        this.eventCase_ = 20;
    }

    /* access modifiers changed from: private */
    public void G(D d10) {
        d10.getClass();
        this.event_ = d10;
        this.eventCase_ = 9;
    }

    /* access modifiers changed from: private */
    public void H(H h10) {
        h10.getClass();
        this.event_ = h10;
        this.eventCase_ = 16;
    }

    /* access modifiers changed from: private */
    public void I(J j10) {
        j10.getClass();
        this.event_ = j10;
        this.eventCase_ = 1;
    }

    /* access modifiers changed from: private */
    public void J(K k10) {
        k10.getClass();
        this.event_ = k10;
        this.eventCase_ = 19;
    }

    /* access modifiers changed from: private */
    public void K(M m10) {
        m10.getClass();
        this.event_ = m10;
        this.eventCase_ = 13;
    }

    /* access modifiers changed from: private */
    public void L(O o10) {
        o10.getClass();
        this.event_ = o10;
        this.eventCase_ = 15;
    }

    /* access modifiers changed from: private */
    public void M(P p10) {
        p10.getClass();
        this.event_ = p10;
        this.eventCase_ = 12;
    }

    /* access modifiers changed from: private */
    public void N(S s10) {
        s10.getClass();
        this.event_ = s10;
        this.eventCase_ = 10;
    }

    /* access modifiers changed from: private */
    public void O(U u10) {
        u10.getClass();
        this.event_ = u10;
        this.eventCase_ = 2;
    }

    /* access modifiers changed from: private */
    public void P(V v10) {
        v10.getClass();
        this.event_ = v10;
        this.eventCase_ = 8;
    }

    /* access modifiers changed from: private */
    public void Q(W w10) {
        w10.getClass();
        this.event_ = w10;
        this.eventCase_ = 4;
    }

    /* access modifiers changed from: private */
    public void R(X x10) {
        x10.getClass();
        this.event_ = x10;
        this.eventCase_ = 5;
    }

    /* access modifiers changed from: private */
    public void S(d0 d0Var) {
        d0Var.getClass();
        this.event_ = d0Var;
        this.eventCase_ = 14;
    }

    public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
        switch (C7777x.f50830a[fVar.ordinal()]) {
            case 1:
                return new F();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0016\u0001\u0000\u0001\u0016\u0016\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\u0011<\u0000\u0012<\u0000\u0013<\u0000\u0014<\u0000\u0015<\u0000\u0016<\u0000", new Object[]{"event_", "eventCase_", J.class, U.class, L.class, W.class, X.class, e0.class, C7778y.class, V.class, D.class, S.class, T.class, P.class, M.class, d0.class, O.class, H.class, C7754B.class, C7753A.class, K.class, C.class, E.class, E.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<F> a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (F.class) {
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
