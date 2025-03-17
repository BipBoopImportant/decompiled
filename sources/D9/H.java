package d9;

import com.google.protobuf.C9592z;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.T;
import com.google.protobuf.a0;

public final class H extends GeneratedMessageLite<H, a> implements T {
    /* access modifiers changed from: private */
    public static final H DEFAULT_INSTANCE;
    public static final int DRAG_FIELD_NUMBER = 5;
    public static final int FLICK_FIELD_NUMBER = 6;
    public static final int LONG_PRESS_FIELD_NUMBER = 4;
    private static volatile a0<H> PARSER = null;
    public static final int TAP_FIELD_NUMBER = 3;
    public static final int UNIX_TIMESTAMP_MS_FIELD_NUMBER = 2;
    public static final int VIEW_ID_FIELD_NUMBER = 1;
    private int gestureCase_ = 0;
    private Object gesture_;
    private long unixTimestampMs_;
    private long viewId_;

    public static final class a extends GeneratedMessageLite.a<H, a> implements T {
        private a() {
            super(H.DEFAULT_INSTANCE);
        }

        public a E(c cVar) {
            u();
            ((H) this.f69206b).p(cVar);
            return this;
        }

        public a G(d dVar) {
            u();
            ((H) this.f69206b).r(dVar);
            return this;
        }

        public a H(e eVar) {
            u();
            ((H) this.f69206b).s(eVar);
            return this;
        }

        public a I(f fVar) {
            u();
            ((H) this.f69206b).t(fVar);
            return this;
        }

        public a K(long j10) {
            u();
            ((H) this.f69206b).u(j10);
            return this;
        }

        public a L(long j10) {
            u();
            ((H) this.f69206b).v(j10);
            return this;
        }
    }

    public enum b implements C9592z.c {
        DIRECTION_UNSPECIFIED(0),
        DIRECTION_UP(1),
        DIRECTION_DOWN(2),
        DIRECTION_LEFT(3),
        DIRECTION_RIGHT(4),
        UNRECOGNIZED(-1);
        
        public static final int DIRECTION_DOWN_VALUE = 2;
        public static final int DIRECTION_LEFT_VALUE = 3;
        public static final int DIRECTION_RIGHT_VALUE = 4;
        public static final int DIRECTION_UNSPECIFIED_VALUE = 0;
        public static final int DIRECTION_UP_VALUE = 1;
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
                return DIRECTION_UNSPECIFIED;
            }
            if (i10 == 1) {
                return DIRECTION_UP;
            }
            if (i10 == 2) {
                return DIRECTION_DOWN;
            }
            if (i10 == 3) {
                return DIRECTION_LEFT;
            }
            if (i10 != 4) {
                return null;
            }
            return DIRECTION_RIGHT;
        }

        public final int d() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public static final class c extends GeneratedMessageLite<c, a> implements T {
        /* access modifiers changed from: private */
        public static final c DEFAULT_INSTANCE;
        public static final int DIRECTION_FIELD_NUMBER = 1;
        private static volatile a0<c> PARSER;
        private int direction_;

        public static final class a extends GeneratedMessageLite.a<c, a> implements T {
            private a() {
                super(c.DEFAULT_INSTANCE);
            }

            public a E(b bVar) {
                u();
                ((c) this.f69206b).k(bVar);
                return this;
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            GeneratedMessageLite.registerDefaultInstance(c.class, cVar);
        }

        private c() {
        }

        public static a j() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        /* access modifiers changed from: private */
        public void k(b bVar) {
            this.direction_ = bVar.d();
        }

        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            switch (C7777x.f50830a[fVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"direction_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    a0<c> a0Var = PARSER;
                    if (a0Var == null) {
                        synchronized (c.class) {
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

    public static final class d extends GeneratedMessageLite<d, a> implements T {
        /* access modifiers changed from: private */
        public static final d DEFAULT_INSTANCE;
        public static final int DIRECTION_FIELD_NUMBER = 1;
        private static volatile a0<d> PARSER;
        private int direction_;

        public static final class a extends GeneratedMessageLite.a<d, a> implements T {
            private a() {
                super(d.DEFAULT_INSTANCE);
            }

            public a E(b bVar) {
                u();
                ((d) this.f69206b).k(bVar);
                return this;
            }
        }

        static {
            d dVar = new d();
            DEFAULT_INSTANCE = dVar;
            GeneratedMessageLite.registerDefaultInstance(d.class, dVar);
        }

        private d() {
        }

        public static a j() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        /* access modifiers changed from: private */
        public void k(b bVar) {
            this.direction_ = bVar.d();
        }

        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            switch (C7777x.f50830a[fVar.ordinal()]) {
                case 1:
                    return new d();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"direction_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    a0<d> a0Var = PARSER;
                    if (a0Var == null) {
                        synchronized (d.class) {
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

    public static final class e extends GeneratedMessageLite<e, a> implements T {
        /* access modifiers changed from: private */
        public static final e DEFAULT_INSTANCE;
        private static volatile a0<e> PARSER;

        public static final class a extends GeneratedMessageLite.a<e, a> implements T {
            private a() {
                super(e.DEFAULT_INSTANCE);
            }
        }

        static {
            e eVar = new e();
            DEFAULT_INSTANCE = eVar;
            GeneratedMessageLite.registerDefaultInstance(e.class, eVar);
        }

        private e() {
        }

        public static a i() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            switch (C7777x.f50830a[fVar.ordinal()]) {
                case 1:
                    return new e();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", (Object[]) null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    a0<e> a0Var = PARSER;
                    if (a0Var == null) {
                        synchronized (e.class) {
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

    public static final class f extends GeneratedMessageLite<f, a> implements T {
        /* access modifiers changed from: private */
        public static final f DEFAULT_INSTANCE;
        private static volatile a0<f> PARSER = null;
        public static final int X_FIELD_NUMBER = 1;
        public static final int Y_FIELD_NUMBER = 2;
        private int x_;
        private int y_;

        public static final class a extends GeneratedMessageLite.a<f, a> implements T {
            private a() {
                super(f.DEFAULT_INSTANCE);
            }

            public a E(int i10) {
                u();
                ((f) this.f69206b).l(i10);
                return this;
            }

            public a G(int i10) {
                u();
                ((f) this.f69206b).m(i10);
                return this;
            }
        }

        static {
            f fVar = new f();
            DEFAULT_INSTANCE = fVar;
            GeneratedMessageLite.registerDefaultInstance(f.class, fVar);
        }

        private f() {
        }

        public static a k() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        /* access modifiers changed from: private */
        public void l(int i10) {
            this.x_ = i10;
        }

        /* access modifiers changed from: private */
        public void m(int i10) {
            this.y_ = i10;
        }

        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            switch (C7777x.f50830a[fVar.ordinal()]) {
                case 1:
                    return new f();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000f\u0002\u000f", new Object[]{"x_", "y_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    a0<f> a0Var = PARSER;
                    if (a0Var == null) {
                        synchronized (f.class) {
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

    static {
        H h10 = new H();
        DEFAULT_INSTANCE = h10;
        GeneratedMessageLite.registerDefaultInstance(H.class, h10);
    }

    private H() {
    }

    public static a o() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    /* access modifiers changed from: private */
    public void p(c cVar) {
        cVar.getClass();
        this.gesture_ = cVar;
        this.gestureCase_ = 5;
    }

    /* access modifiers changed from: private */
    public void r(d dVar) {
        dVar.getClass();
        this.gesture_ = dVar;
        this.gestureCase_ = 6;
    }

    /* access modifiers changed from: private */
    public void s(e eVar) {
        eVar.getClass();
        this.gesture_ = eVar;
        this.gestureCase_ = 4;
    }

    /* access modifiers changed from: private */
    public void t(f fVar) {
        fVar.getClass();
        this.gesture_ = fVar;
        this.gestureCase_ = 3;
    }

    /* access modifiers changed from: private */
    public void u(long j10) {
        this.unixTimestampMs_ = j10;
    }

    /* access modifiers changed from: private */
    public void v(long j10) {
        this.viewId_ = j10;
    }

    public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
        switch (C7777x.f50830a[fVar.ordinal()]) {
            case 1:
                return new H();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0010\u0002\u0003\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"gesture_", "gestureCase_", "viewId_", "unixTimestampMs_", f.class, e.class, c.class, d.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<H> a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (H.class) {
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
