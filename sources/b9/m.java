package b9;

import com.google.protobuf.C9592z;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.T;
import com.google.protobuf.a0;

public final class m extends GeneratedMessageLite<m, b> implements T {
    public static final int APP_INFO_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final m DEFAULT_INSTANCE;
    public static final int EXCEPTION_FIELD_NUMBER = 2;
    public static final int MAPPING_FILE_ID_FIELD_NUMBER = 5;
    private static volatile a0<m> PARSER = null;
    public static final int THREADS_FIELD_NUMBER = 3;
    public static final int TIMESTAMP_FIELD_NUMBER = 4;
    private a appInfo_;
    private int bitField0_;
    private c exception_;
    private String mappingFileId_ = "";
    private C9592z.i<e> threads_ = GeneratedMessageLite.emptyProtobufList();
    private long timestamp_;

    public static final class a extends GeneratedMessageLite<a, C0792a> implements T {
        public static final int BUILD_NUMBER_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final a DEFAULT_INSTANCE;
        public static final int JS_VERSION_FIELD_NUMBER = 2;
        public static final int PACKAGE_NAME_FIELD_NUMBER = 3;
        private static volatile a0<a> PARSER = null;
        public static final int VERSION_FIELD_NUMBER = 4;
        private int bitField0_;
        private String buildNumber_ = "";
        private String jsVersion_ = "";
        private String packageName_ = "";
        private String version_ = "";

        /* renamed from: b9.m$a$a  reason: collision with other inner class name */
        public static final class C0792a extends GeneratedMessageLite.a<a, C0792a> implements T {
            private C0792a() {
                super(a.DEFAULT_INSTANCE);
            }
        }

        static {
            a aVar = new a();
            DEFAULT_INSTANCE = aVar;
            GeneratedMessageLite.registerDefaultInstance(a.class, aVar);
        }

        private a() {
        }

        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            switch (C7083e.f45641a[fVar.ordinal()]) {
                case 1:
                    return new a();
                case 2:
                    return new C0792a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000\u0003Ȉ\u0004Ȉ", new Object[]{"bitField0_", "buildNumber_", "jsVersion_", "packageName_", "version_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    a0<a> a0Var = PARSER;
                    if (a0Var == null) {
                        synchronized (a.class) {
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

    public static final class b extends GeneratedMessageLite.a<m, b> implements T {
        private b() {
            super(m.DEFAULT_INSTANCE);
        }
    }

    public static final class c extends GeneratedMessageLite<c, a> implements T {
        /* access modifiers changed from: private */
        public static final c DEFAULT_INSTANCE;
        public static final int DESCRIPTION_FIELD_NUMBER = 1;
        public static final int FRAMES_FIELD_NUMBER = 2;
        private static volatile a0<c> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 3;
        private String description_ = "";
        private C9592z.i<d> frames_ = GeneratedMessageLite.emptyProtobufList();
        private String type_ = "";

        public static final class a extends GeneratedMessageLite.a<c, a> implements T {
            private a() {
                super(c.DEFAULT_INSTANCE);
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            GeneratedMessageLite.registerDefaultInstance(c.class, cVar);
        }

        private c() {
        }

        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            switch (C7083e.f45641a[fVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003Ȉ", new Object[]{"description_", "frames_", d.class, "type_"});
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
        public static final int COLUMN_FIELD_NUMBER = 1;
        public static final int C_CONTEXT_LINE_FIELD_NUMBER = 6;
        /* access modifiers changed from: private */
        public static final d DEFAULT_INSTANCE;
        public static final int FILE_FIELD_NUMBER = 2;
        public static final int FRAME_ID_FIELD_NUMBER = 3;
        public static final int LINE_NUMBER_FIELD_NUMBER = 4;
        public static final int METHOD_NAME_FIELD_NUMBER = 5;
        private static volatile a0<d> PARSER;
        private int bitField0_;
        private String cContextLine_ = "";
        private int column_;
        private String file_ = "";
        private int frameId_;
        private int lineNumber_;
        private String methodName_ = "";

        public static final class a extends GeneratedMessageLite.a<d, a> implements T {
            private a() {
                super(d.DEFAULT_INSTANCE);
            }
        }

        static {
            d dVar = new d();
            DEFAULT_INSTANCE = dVar;
            GeneratedMessageLite.registerDefaultInstance(d.class, dVar);
        }

        private d() {
        }

        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            switch (C7083e.f45641a[fVar.ordinal()]) {
                case 1:
                    return new d();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u000b\u0002Ȉ\u0003\u000b\u0004\u000b\u0005Ȉ\u0006ለ\u0000", new Object[]{"bitField0_", "column_", "file_", "frameId_", "lineNumber_", "methodName_", "cContextLine_"});
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
        public static final int FRAMES_FIELD_NUMBER = 1;
        private static volatile a0<e> PARSER;
        private C9592z.i<d> frames_ = GeneratedMessageLite.emptyProtobufList();

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

        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            switch (C7083e.f45641a[fVar.ordinal()]) {
                case 1:
                    return new e();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"frames_", d.class});
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
        m mVar = new m();
        DEFAULT_INSTANCE = mVar;
        GeneratedMessageLite.registerDefaultInstance(m.class, mVar);
    }

    private m() {
    }

    public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
        switch (C7083e.f45641a[fVar.ordinal()]) {
            case 1:
                return new m();
            case 2:
                return new b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004\u0003\u0005ለ\u0002", new Object[]{"bitField0_", "appInfo_", "exception_", "threads_", e.class, "timestamp_", "mappingFileId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<m> a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (m.class) {
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
