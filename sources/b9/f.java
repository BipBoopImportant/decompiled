package b9;

import com.google.protobuf.C9568a;
import com.google.protobuf.C9592z;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.T;
import com.google.protobuf.a0;

public final class f extends GeneratedMessageLite<f, a> implements T {
    public static final int APPLICATION_VERSION_FIELD_NUMBER = 2;
    /* access modifiers changed from: private */
    public static final f DEFAULT_INSTANCE;
    public static final int ERROR_STACKTRACE_FIELD_NUMBER = 4;
    public static final int MAPPING_VERSION_FIELD_NUMBER = 3;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
    private static volatile a0<f> PARSER = null;
    public static final int THREADS_FIELD_NUMBER = 5;
    private String applicationVersion_ = "";
    private int bitField0_;
    private b errorStacktrace_;
    private String mappingVersion_ = "";
    private String packageName_ = "";
    private C9592z.i<e> threads_ = GeneratedMessageLite.emptyProtobufList();

    public static final class a extends GeneratedMessageLite.a<f, a> implements T {
        private a() {
            super(f.DEFAULT_INSTANCE);
        }

        public a E(Iterable<? extends e> iterable) {
            u();
            ((f) this.f69206b).n(iterable);
            return this;
        }

        public a G(String str) {
            u();
            ((f) this.f69206b).r(str);
            return this;
        }

        public a H(b bVar) {
            u();
            ((f) this.f69206b).s(bVar);
            return this;
        }

        public a I(String str) {
            u();
            ((f) this.f69206b).t(str);
            return this;
        }

        public a K(String str) {
            u();
            ((f) this.f69206b).u(str);
            return this;
        }
    }

    public static final class b extends GeneratedMessageLite<b, a> implements T {
        public static final int CAUSE_FIELD_NUMBER = 4;
        /* access modifiers changed from: private */
        public static final b DEFAULT_INSTANCE;
        public static final int EXCEPTION_FIELD_NUMBER = 3;
        public static final int FRAMES_FIELD_NUMBER = 5;
        public static final int OVERFLOW_COUNT_FIELD_NUMBER = 2;
        private static volatile a0<b> PARSER = null;
        public static final int THREAD_ID_FIELD_NUMBER = 1;
        private int bitField0_;
        private b cause_;
        private C0788b exception_;
        private C9592z.i<c> frames_ = GeneratedMessageLite.emptyProtobufList();
        private int overflowCount_;
        private int threadId_;

        public static final class a extends GeneratedMessageLite.a<b, a> implements T {
            private a() {
                super(b.DEFAULT_INSTANCE);
            }

            public a E(Iterable<? extends c> iterable) {
                u();
                ((b) this.f69206b).n(iterable);
                return this;
            }

            public a G(b bVar) {
                u();
                ((b) this.f69206b).r(bVar);
                return this;
            }

            public a H(C0788b bVar) {
                u();
                ((b) this.f69206b).s(bVar);
                return this;
            }

            public a I(int i10) {
                u();
                ((b) this.f69206b).t(i10);
                return this;
            }

            public a K(int i10) {
                u();
                ((b) this.f69206b).u(i10);
                return this;
            }
        }

        /* renamed from: b9.f$b$b  reason: collision with other inner class name */
        public static final class C0788b extends GeneratedMessageLite<C0788b, a> implements T {
            public static final int CLASS_FIELD_NUMBER = 2;
            /* access modifiers changed from: private */
            public static final C0788b DEFAULT_INSTANCE;
            public static final int MESSAGE_FIELD_NUMBER = 1;
            private static volatile a0<C0788b> PARSER;
            private String class__ = "";
            private String message_ = "";

            /* renamed from: b9.f$b$b$a */
            public static final class a extends GeneratedMessageLite.a<C0788b, a> implements T {
                private a() {
                    super(C0788b.DEFAULT_INSTANCE);
                }

                public a E(String str) {
                    u();
                    ((C0788b) this.f69206b).l(str);
                    return this;
                }

                public a G(String str) {
                    u();
                    ((C0788b) this.f69206b).m(str);
                    return this;
                }
            }

            static {
                C0788b bVar = new C0788b();
                DEFAULT_INSTANCE = bVar;
                GeneratedMessageLite.registerDefaultInstance(C0788b.class, bVar);
            }

            private C0788b() {
            }

            public static a k() {
                return (a) DEFAULT_INSTANCE.createBuilder();
            }

            /* access modifiers changed from: private */
            public void l(String str) {
                str.getClass();
                this.class__ = str;
            }

            /* access modifiers changed from: private */
            public void m(String str) {
                str.getClass();
                this.message_ = str;
            }

            public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
                switch (C7083e.f45641a[fVar.ordinal()]) {
                    case 1:
                        return new C0788b();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"message_", "class__"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        a0<C0788b> a0Var = PARSER;
                        if (a0Var == null) {
                            synchronized (C0788b.class) {
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
            b bVar = new b();
            DEFAULT_INSTANCE = bVar;
            GeneratedMessageLite.registerDefaultInstance(b.class, bVar);
        }

        private b() {
        }

        /* access modifiers changed from: private */
        public void n(Iterable<? extends c> iterable) {
            o();
            C9568a.addAll(iterable, this.frames_);
        }

        private void o() {
            C9592z.i<c> iVar = this.frames_;
            if (!iVar.u()) {
                this.frames_ = GeneratedMessageLite.mutableCopy(iVar);
            }
        }

        public static a p() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        /* access modifiers changed from: private */
        public void r(b bVar) {
            bVar.getClass();
            this.cause_ = bVar;
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void s(C0788b bVar) {
            bVar.getClass();
            this.exception_ = bVar;
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void t(int i10) {
            this.overflowCount_ = i10;
        }

        /* access modifiers changed from: private */
        public void u(int i10) {
            this.threadId_ = i10;
        }

        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            switch (C7083e.f45641a[fVar.ordinal()]) {
                case 1:
                    return new b();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u000b\u0002\u000b\u0003ဉ\u0000\u0004ဉ\u0001\u0005\u001b", new Object[]{"bitField0_", "threadId_", "overflowCount_", "exception_", "cause_", "frames_", c.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    a0<b> a0Var = PARSER;
                    if (a0Var == null) {
                        synchronized (b.class) {
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

    public static final class c extends GeneratedMessageLite<c, a> implements T {
        /* access modifiers changed from: private */
        public static final c DEFAULT_INSTANCE;
        public static final int JAVA_FRAME_FIELD_NUMBER = 1;
        private static volatile a0<c> PARSER;
        private int frameCase_ = 0;
        private Object frame_;

        public static final class a extends GeneratedMessageLite.a<c, a> implements T {
            private a() {
                super(c.DEFAULT_INSTANCE);
            }

            public a E(d dVar) {
                u();
                ((c) this.f69206b).l(dVar);
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

        public static a k() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        /* access modifiers changed from: private */
        public void l(d dVar) {
            dVar.getClass();
            this.frame_ = dVar;
            this.frameCase_ = 1;
        }

        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            switch (C7083e.f45641a[fVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"frame_", "frameCase_", d.class});
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

        public d j() {
            return this.frameCase_ == 1 ? (d) this.frame_ : d.p();
        }
    }

    public static final class d extends GeneratedMessageLite<d, a> implements T {
        public static final int CLASS_FIELD_NUMBER = 3;
        public static final int C_FRAME_TYPE_FIELD_NUMBER = 6;
        /* access modifiers changed from: private */
        public static final d DEFAULT_INSTANCE;
        public static final int FILE_FIELD_NUMBER = 2;
        public static final int FRAME_ID_FIELD_NUMBER = 1;
        public static final int LINE_FIELD_NUMBER = 5;
        public static final int METHOD_FIELD_NUMBER = 4;
        private static volatile a0<d> PARSER = null;
        public static final int REPEATED_COUNT_FIELD_NUMBER = 7;
        private int cFrameType_;
        private String class__ = "";
        private String file_ = "";
        private int frameId_;
        private int line_;
        private String method_ = "";
        private int repeatedCount_;

        public static final class a extends GeneratedMessageLite.a<d, a> implements T {
            private a() {
                super(d.DEFAULT_INSTANCE);
            }

            public a E(String str) {
                u();
                ((d) this.f69206b).w(str);
                return this;
            }

            public a G(String str) {
                u();
                ((d) this.f69206b).x(str);
                return this;
            }

            public a H(int i10) {
                u();
                ((d) this.f69206b).y(i10);
                return this;
            }

            public a I(int i10) {
                u();
                ((d) this.f69206b).z(i10);
                return this;
            }

            public a K(String str) {
                u();
                ((d) this.f69206b).A(str);
                return this;
            }

            public a L(int i10) {
                u();
                ((d) this.f69206b).B(i10);
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

        /* access modifiers changed from: private */
        public void A(String str) {
            str.getClass();
            this.method_ = str;
        }

        /* access modifiers changed from: private */
        public void B(int i10) {
            this.repeatedCount_ = i10;
        }

        public static d p() {
            return DEFAULT_INSTANCE;
        }

        public static a v() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        /* access modifiers changed from: private */
        public void w(String str) {
            str.getClass();
            this.class__ = str;
        }

        /* access modifiers changed from: private */
        public void x(String str) {
            str.getClass();
            this.file_ = str;
        }

        /* access modifiers changed from: private */
        public void y(int i10) {
            this.frameId_ = i10;
        }

        /* access modifiers changed from: private */
        public void z(int i10) {
            this.line_ = i10;
        }

        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            switch (C7083e.f45641a[fVar.ordinal()]) {
                case 1:
                    return new d();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u000b\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u000b\u0006\f\u0007\u000b", new Object[]{"frameId_", "file_", "class__", "method_", "line_", "cFrameType_", "repeatedCount_"});
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

        public String o() {
            return this.class__;
        }

        public String r() {
            return this.file_;
        }

        public int s() {
            return this.line_;
        }

        public String t() {
            return this.method_;
        }

        public int u() {
            return this.repeatedCount_;
        }
    }

    public static final class e extends GeneratedMessageLite<e, a> implements T {
        /* access modifiers changed from: private */
        public static final e DEFAULT_INSTANCE;
        public static final int FRAMES_FIELD_NUMBER = 3;
        private static volatile a0<e> PARSER = null;
        public static final int THREAD_ID_FIELD_NUMBER = 1;
        public static final int THREAD_NAME_FIELD_NUMBER = 2;
        private C9592z.i<c> frames_ = GeneratedMessageLite.emptyProtobufList();
        private int threadId_;
        private String threadName_ = "";

        public static final class a extends GeneratedMessageLite.a<e, a> implements T {
            private a() {
                super(e.DEFAULT_INSTANCE);
            }

            public a E(Iterable<? extends c> iterable) {
                u();
                ((e) this.f69206b).l(iterable);
                return this;
            }

            public a G(int i10) {
                u();
                ((e) this.f69206b).o(i10);
                return this;
            }

            public a H(String str) {
                u();
                ((e) this.f69206b).p(str);
                return this;
            }
        }

        static {
            e eVar = new e();
            DEFAULT_INSTANCE = eVar;
            GeneratedMessageLite.registerDefaultInstance(e.class, eVar);
        }

        private e() {
        }

        /* access modifiers changed from: private */
        public void l(Iterable<? extends c> iterable) {
            m();
            C9568a.addAll(iterable, this.frames_);
        }

        private void m() {
            C9592z.i<c> iVar = this.frames_;
            if (!iVar.u()) {
                this.frames_ = GeneratedMessageLite.mutableCopy(iVar);
            }
        }

        public static a n() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        /* access modifiers changed from: private */
        public void o(int i10) {
            this.threadId_ = i10;
        }

        /* access modifiers changed from: private */
        public void p(String str) {
            str.getClass();
            this.threadName_ = str;
        }

        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            switch (C7083e.f45641a[fVar.ordinal()]) {
                case 1:
                    return new e();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u000b\u0002Ȉ\u0003\u001b", new Object[]{"threadId_", "threadName_", "frames_", c.class});
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

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        GeneratedMessageLite.registerDefaultInstance(f.class, fVar);
    }

    private f() {
    }

    /* access modifiers changed from: private */
    public void n(Iterable<? extends e> iterable) {
        o();
        C9568a.addAll(iterable, this.threads_);
    }

    private void o() {
        C9592z.i<e> iVar = this.threads_;
        if (!iVar.u()) {
            this.threads_ = GeneratedMessageLite.mutableCopy(iVar);
        }
    }

    public static a p() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    /* access modifiers changed from: private */
    public void r(String str) {
        str.getClass();
        this.applicationVersion_ = str;
    }

    /* access modifiers changed from: private */
    public void s(b bVar) {
        bVar.getClass();
        this.errorStacktrace_ = bVar;
        this.bitField0_ |= 1;
    }

    /* access modifiers changed from: private */
    public void t(String str) {
        str.getClass();
        this.mappingVersion_ = str;
    }

    /* access modifiers changed from: private */
    public void u(String str) {
        str.getClass();
        this.packageName_ = str;
    }

    public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
        switch (C7083e.f45641a[fVar.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004ဉ\u0000\u0005\u001b", new Object[]{"bitField0_", "packageName_", "applicationVersion_", "mappingVersion_", "errorStacktrace_", "threads_", e.class});
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
