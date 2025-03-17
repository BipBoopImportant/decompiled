package b9;

import com.google.protobuf.C9592z;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.T;
import com.google.protobuf.a0;

public final class j extends GeneratedMessageLite<j, a> implements T {
    public static final int APP_INFO_FIELD_NUMBER = 1;
    public static final int CONTEXT_FIELD_NUMBER = 4;
    /* access modifiers changed from: private */
    public static final j DEFAULT_INSTANCE;
    public static final int EXCEPTION_FIELD_NUMBER = 2;
    public static final int LIBRARY_FIELD_NUMBER = 5;
    private static volatile a0<j> PARSER = null;
    public static final int SUMMARY_FIELD_NUMBER = 6;
    public static final int THREADS_FIELD_NUMBER = 3;
    public static final int TIMESTAMP_FIELD_NUMBER = 7;
    private b appInfo_;
    private int bitField0_;
    private String context_ = "";
    private c exception_;
    private String library_ = "";
    private String summary_ = "";
    private C9592z.i<e> threads_ = GeneratedMessageLite.emptyProtobufList();
    private long timestamp_;

    public static final class a extends GeneratedMessageLite.a<j, a> implements T {
        private a() {
            super(j.DEFAULT_INSTANCE);
        }
    }

    public static final class b extends GeneratedMessageLite<b, a> implements T {
        public static final int BUILD_NUMBER_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final b DEFAULT_INSTANCE;
        public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
        private static volatile a0<b> PARSER = null;
        public static final int PUB_NAME_FIELD_NUMBER = 5;
        public static final int SYMBOL_FILE_ID_FIELD_NUMBER = 4;
        public static final int VERSION_FIELD_NUMBER = 2;
        private int bitField0_;
        private String buildNumber_ = "";
        private String packageName_ = "";
        private String pubName_ = "";
        private String symbolFileId_ = "";
        private String version_ = "";

        public static final class a extends GeneratedMessageLite.a<b, a> implements T {
            private a() {
                super(b.DEFAULT_INSTANCE);
            }
        }

        static {
            b bVar = new b();
            DEFAULT_INSTANCE = bVar;
            GeneratedMessageLite.registerDefaultInstance(b.class, bVar);
        }

        private b() {
        }

        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            switch (C7083e.f45641a[fVar.ordinal()]) {
                case 1:
                    return new b();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004ለ\u0000\u0005Ȉ", new Object[]{"bitField0_", "packageName_", "version_", "buildNumber_", "symbolFileId_", "pubName_"});
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
        public static final int DESCRIPTION_FIELD_NUMBER = 2;
        public static final int FRAMES_FIELD_NUMBER = 3;
        private static volatile a0<c> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
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
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b", new Object[]{"type_", "description_", "frames_", d.class});
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
        public static final int CLASS_NAME_FIELD_NUMBER = 5;
        public static final int COLUMN_FIELD_NUMBER = 2;
        public static final int C_FRAME_TYPE_FIELD_NUMBER = 11;
        /* access modifiers changed from: private */
        public static final d DEFAULT_INSTANCE;
        public static final int IS_CONSTRUCTOR_FIELD_NUMBER = 3;
        public static final int LINE_FIELD_NUMBER = 1;
        public static final int METHOD_FIELD_NUMBER = 4;
        public static final int NUMBER_FIELD_NUMBER = 10;
        public static final int PACKAGE_FIELD_NUMBER = 6;
        public static final int PACKAGE_PATH_FIELD_NUMBER = 7;
        public static final int PACKAGE_SCHEME_FIELD_NUMBER = 8;
        private static volatile a0<d> PARSER = null;
        public static final int SOURCE_FIELD_NUMBER = 9;
        private int bitField0_;
        private int cFrameType_;
        private String className_ = "";
        private int column_;
        private boolean isConstructor_;
        private int line_;
        private String method_ = "";
        private int number_;
        private String packagePath_ = "";
        private String packageScheme_ = "";
        private String package_ = "";
        private String source_ = "";

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
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u0007\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\n\u000b\u000bဌ\u0000", new Object[]{"bitField0_", "line_", "column_", "isConstructor_", "method_", "className_", "package_", "packagePath_", "packageScheme_", "source_", "number_", "cFrameType_"});
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
        j jVar = new j();
        DEFAULT_INSTANCE = jVar;
        GeneratedMessageLite.registerDefaultInstance(j.class, jVar);
    }

    private j() {
    }

    public static j j(byte[] bArr) {
        return (j) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
        switch (C7083e.f45641a[fVar.ordinal()]) {
            case 1:
                return new j();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007\u0003", new Object[]{"bitField0_", "appInfo_", "exception_", "threads_", e.class, "context_", "library_", "summary_", "timestamp_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<j> a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (j.class) {
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

    public long i() {
        return this.timestamp_;
    }
}
