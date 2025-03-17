package b9;

import com.google.protobuf.C9575h;
import com.google.protobuf.C9592z;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.K;
import com.google.protobuf.L;
import com.google.protobuf.T;
import com.google.protobuf.a0;
import com.google.protobuf.u0;

public final class k extends GeneratedMessageLite<k, d> implements T {
    public static final int APPLICATION_INFO_FIELD_NUMBER = 2;
    public static final int BINARIES_FIELD_NUMBER = 8;
    /* access modifiers changed from: private */
    public static final k DEFAULT_INSTANCE;
    public static final int LAST_EXCEPTION_BACKTRACE_FIELD_NUMBER = 6;
    public static final int MACHINE_INFO_FIELD_NUMBER = 5;
    private static volatile a0<k> PARSER = null;
    public static final int PROCESS_INFO_FIELD_NUMBER = 4;
    public static final int SIGNAL_FIELD_NUMBER = 3;
    public static final int SYSTEM_INFO_FIELD_NUMBER = 1;
    public static final int THREADS_FIELD_NUMBER = 7;
    private a applicationInfo_;
    private L<Integer, c> binaries_ = L.d();
    private int bitField0_;
    private e lastExceptionBacktrace_;
    private g machineInfo_;
    private h processInfo_;
    private j signal_;
    private C0791k systemInfo_;
    private C9592z.i<l> threads_ = GeneratedMessageLite.emptyProtobufList();

    public static final class a extends GeneratedMessageLite<a, C0789a> implements T {
        /* access modifiers changed from: private */
        public static final a DEFAULT_INSTANCE;
        public static final int IDENTIFIER_FIELD_NUMBER = 1;
        public static final int MARKETING_VERSION_FIELD_NUMBER = 3;
        private static volatile a0<a> PARSER = null;
        public static final int VERSION_FIELD_NUMBER = 2;
        private int bitField0_;
        private String identifier_ = "";
        private String marketingVersion_ = "";
        private String version_ = "";

        /* renamed from: b9.k$a$a  reason: collision with other inner class name */
        public static final class C0789a extends GeneratedMessageLite.a<a, C0789a> implements T {
            private C0789a() {
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
                    return new C0789a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ለ\u0000", new Object[]{"bitField0_", "identifier_", "version_", "marketingVersion_"});
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

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        static final K<Integer, c> f45642a = K.d(u0.b.UINT32, 0, u0.b.MESSAGE, c.i());
    }

    public static final class c extends GeneratedMessageLite<c, a> implements T {
        public static final int BASE_ADDRESS_FIELD_NUMBER = 2;
        public static final int CODE_TYPE_FIELD_NUMBER = 6;
        public static final int C_ARCHITECTURE_FIELD_NUMBER = 8;
        public static final int C_TYPE_FIELD_NUMBER = 7;
        /* access modifiers changed from: private */
        public static final c DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int NAME_FIELD_NUMBER = 5;
        private static volatile a0<c> PARSER = null;
        public static final int SIZE_FIELD_NUMBER = 3;
        public static final int UUID_FIELD_NUMBER = 4;
        private long baseAddress_;
        private int bitField0_;
        private int cArchitecture_;
        private int cType_;
        private i codeType_;
        private int id_;
        private String name_ = "";
        private long size_;
        private C9575h uuid_ = C9575h.f69286b;

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

        public static c i() {
            return DEFAULT_INSTANCE;
        }

        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            switch (C7083e.f45641a[fVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002\u0003\u0003\u0003\u0004ည\u0000\u0005Ȉ\u0006ဉ\u0001\u0007\f\b\f", new Object[]{"bitField0_", "id_", "baseAddress_", "size_", "uuid_", "name_", "codeType_", "cType_", "cArchitecture_"});
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

    public static final class d extends GeneratedMessageLite.a<k, d> implements T {
        private d() {
            super(k.DEFAULT_INSTANCE);
        }
    }

    public static final class e extends GeneratedMessageLite<e, a> implements T {
        /* access modifiers changed from: private */
        public static final e DEFAULT_INSTANCE;
        public static final int FRAMES_FIELD_NUMBER = 3;
        public static final int NAME_FIELD_NUMBER = 1;
        private static volatile a0<e> PARSER = null;
        public static final int REASON_FIELD_NUMBER = 2;
        private C9592z.i<f> frames_ = GeneratedMessageLite.emptyProtobufList();
        private String name_ = "";
        private String reason_ = "";

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
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b", new Object[]{"name_", "reason_", "frames_", f.class});
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

    public static final class f extends GeneratedMessageLite<f, b> implements T {
        public static final int BINARY_ID_FIELD_NUMBER = 2;
        public static final int C_BINARY_INFORMATION_FIELD_NUMBER = 5;
        public static final int C_BYTE_OFFSET_FIELD_NUMBER = 6;
        public static final int C_SOURCE_LOCATION_FIELD_NUMBER = 4;
        /* access modifiers changed from: private */
        public static final f DEFAULT_INSTANCE;
        public static final int FRAME_ID_FIELD_NUMBER = 1;
        public static final int INSTRUCTION_ADDRESS_FIELD_NUMBER = 3;
        private static volatile a0<f> PARSER = null;
        public static final int REPEATED_COUNT_FIELD_NUMBER = 7;
        private int binaryId_;
        private int bitField0_;
        private a cBinaryInformation_;
        private long cByteOffset_;
        private c cSourceLocation_;
        private int frameId_;
        private long instructionAddress_;
        private int repeatedCount_;

        public static final class a extends GeneratedMessageLite<a, C0790a> implements T {
            /* access modifiers changed from: private */
            public static final a DEFAULT_INSTANCE;
            public static final int NAME_FIELD_NUMBER = 1;
            private static volatile a0<a> PARSER = null;
            public static final int TYPE_FIELD_NUMBER = 2;
            private String name_ = "";
            private int type_;

            /* renamed from: b9.k$f$a$a  reason: collision with other inner class name */
            public static final class C0790a extends GeneratedMessageLite.a<a, C0790a> implements T {
                private C0790a() {
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
                        return new C0790a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"name_", "type_"});
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

        public static final class b extends GeneratedMessageLite.a<f, b> implements T {
            private b() {
                super(f.DEFAULT_INSTANCE);
            }
        }

        public static final class c extends GeneratedMessageLite<c, a> implements T {
            public static final int C_FILE_FIELD_NUMBER = 1;
            public static final int C_FUNCTION_NAME_FIELD_NUMBER = 2;
            public static final int C_LINE_FIELD_NUMBER = 3;
            /* access modifiers changed from: private */
            public static final c DEFAULT_INSTANCE;
            private static volatile a0<c> PARSER;
            private String cFile_ = "";
            private String cFunctionName_ = "";
            private int cLine_;

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
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b", new Object[]{"cFile_", "cFunctionName_", "cLine_"});
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

        static {
            f fVar = new f();
            DEFAULT_INSTANCE = fVar;
            GeneratedMessageLite.registerDefaultInstance(f.class, fVar);
        }

        private f() {
        }

        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            switch (C7083e.f45641a[fVar.ordinal()]) {
                case 1:
                    return new f();
                case 2:
                    return new b();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u0003\u0004ဉ\u0000\u0005ဉ\u0001\u0006ဃ\u0002\u0007\u000b", new Object[]{"bitField0_", "frameId_", "binaryId_", "instructionAddress_", "cSourceLocation_", "cBinaryInformation_", "cByteOffset_", "repeatedCount_"});
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

    public static final class g extends GeneratedMessageLite<g, a> implements T {
        public static final int C_ARCHITECTURE_FIELD_NUMBER = 5;
        /* access modifiers changed from: private */
        public static final g DEFAULT_INSTANCE;
        public static final int LOGICAL_PROCESSOR_COUNT_FIELD_NUMBER = 4;
        public static final int MODEL_FIELD_NUMBER = 1;
        private static volatile a0<g> PARSER = null;
        public static final int PROCESSOR_COUNT_FIELD_NUMBER = 3;
        public static final int PROCESSOR_FIELD_NUMBER = 2;
        private int bitField0_;
        private int cArchitecture_;
        private int logicalProcessorCount_;
        private String model_ = "";
        private int processorCount_;
        private i processor_;

        public static final class a extends GeneratedMessageLite.a<g, a> implements T {
            private a() {
                super(g.DEFAULT_INSTANCE);
            }
        }

        static {
            g gVar = new g();
            DEFAULT_INSTANCE = gVar;
            GeneratedMessageLite.registerDefaultInstance(g.class, gVar);
        }

        private g() {
        }

        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            switch (C7083e.f45641a[fVar.ordinal()]) {
                case 1:
                    return new g();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ለ\u0000\u0002ဉ\u0001\u0003\u000b\u0004\u000b\u0005\f", new Object[]{"bitField0_", "model_", "processor_", "processorCount_", "logicalProcessorCount_", "cArchitecture_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    a0<g> a0Var = PARSER;
                    if (a0Var == null) {
                        synchronized (g.class) {
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

    public static final class h extends GeneratedMessageLite<h, a> implements T {
        /* access modifiers changed from: private */
        public static final h DEFAULT_INSTANCE;
        public static final int NATIVE_FIELD_NUMBER = 6;
        public static final int PARENT_PROCESS_ID_FIELD_NUMBER = 5;
        public static final int PARENT_PROCESS_NAME_FIELD_NUMBER = 4;
        private static volatile a0<h> PARSER = null;
        public static final int PROCESS_ID_FIELD_NUMBER = 2;
        public static final int PROCESS_NAME_FIELD_NUMBER = 1;
        public static final int PROCESS_PATH_FIELD_NUMBER = 3;
        public static final int START_TIME_FIELD_NUMBER = 7;
        private int bitField0_;
        private boolean native_;
        private int parentProcessId_;
        private String parentProcessName_ = "";
        private int processId_;
        private String processName_ = "";
        private String processPath_ = "";
        private long startTime_;

        public static final class a extends GeneratedMessageLite.a<h, a> implements T {
            private a() {
                super(h.DEFAULT_INSTANCE);
            }
        }

        static {
            h hVar = new h();
            DEFAULT_INSTANCE = hVar;
            GeneratedMessageLite.registerDefaultInstance(h.class, hVar);
        }

        private h() {
        }

        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            switch (C7083e.f45641a[fVar.ordinal()]) {
                case 1:
                    return new h();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ለ\u0000\u0002\u000b\u0003ለ\u0001\u0004ለ\u0002\u0005\u000b\u0006\u0007\u0007ဃ\u0003", new Object[]{"bitField0_", "processName_", "processId_", "processPath_", "parentProcessName_", "parentProcessId_", "native_", "startTime_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    a0<h> a0Var = PARSER;
                    if (a0Var == null) {
                        synchronized (h.class) {
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

    public static final class i extends GeneratedMessageLite<i, a> implements T {
        /* access modifiers changed from: private */
        public static final i DEFAULT_INSTANCE;
        public static final int ENCODING_FIELD_NUMBER = 1;
        private static volatile a0<i> PARSER = null;
        public static final int SUBTYPE_FIELD_NUMBER = 3;
        public static final int TYPE_FIELD_NUMBER = 2;
        private int encoding_;
        private long subtype_;
        private long type_;

        public static final class a extends GeneratedMessageLite.a<i, a> implements T {
            private a() {
                super(i.DEFAULT_INSTANCE);
            }
        }

        static {
            i iVar = new i();
            DEFAULT_INSTANCE = iVar;
            GeneratedMessageLite.registerDefaultInstance(i.class, iVar);
        }

        private i() {
        }

        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            switch (C7083e.f45641a[fVar.ordinal()]) {
                case 1:
                    return new i();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\u0003\u0003\u0003", new Object[]{"encoding_", "type_", "subtype_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    a0<i> a0Var = PARSER;
                    if (a0Var == null) {
                        synchronized (i.class) {
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

    public static final class j extends GeneratedMessageLite<j, a> implements T {
        public static final int ADDRESS_FIELD_NUMBER = 3;
        public static final int CODE_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final j DEFAULT_INSTANCE;
        public static final int MACH_EXCEPTION_FIELD_NUMBER = 4;
        public static final int NAME_FIELD_NUMBER = 1;
        private static volatile a0<j> PARSER;
        private long address_;
        private int bitField0_;
        private String code_ = "";
        private b machException_;
        private String name_ = "";

        public static final class a extends GeneratedMessageLite.a<j, a> implements T {
            private a() {
                super(j.DEFAULT_INSTANCE);
            }
        }

        public static final class b extends GeneratedMessageLite<b, a> implements T {
            public static final int CODES_FIELD_NUMBER = 2;
            /* access modifiers changed from: private */
            public static final b DEFAULT_INSTANCE;
            private static volatile a0<b> PARSER = null;
            public static final int TYPE_FIELD_NUMBER = 1;
            private int codesMemoizedSerializedSize = -1;
            private C9592z.h codes_ = GeneratedMessageLite.emptyLongList();
            private long type_;

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
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0003\u0002&", new Object[]{"type_", "codes_"});
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

        static {
            j jVar = new j();
            DEFAULT_INSTANCE = jVar;
            GeneratedMessageLite.registerDefaultInstance(j.class, jVar);
        }

        private j() {
        }

        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            switch (C7083e.f45641a[fVar.ordinal()]) {
                case 1:
                    return new j();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0003\u0004ဉ\u0000", new Object[]{"bitField0_", "name_", "code_", "address_", "machException_"});
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
    }

    /* renamed from: b9.k$k  reason: collision with other inner class name */
    public static final class C0791k extends GeneratedMessageLite<C0791k, a> implements T {
        /* access modifiers changed from: private */
        public static final C0791k DEFAULT_INSTANCE;
        public static final int OPERATING_SYSTEM_FIELD_NUMBER = 1;
        public static final int OS_BUILD_FIELD_NUMBER = 4;
        public static final int OS_VERSION_FIELD_NUMBER = 2;
        private static volatile a0<C0791k> PARSER = null;
        public static final int TIMESTAMP_FIELD_NUMBER = 3;
        private int bitField0_;
        private int operatingSystem_;
        private String osBuild_ = "";
        private String osVersion_ = "";
        private long timestamp_;

        /* renamed from: b9.k$k$a */
        public static final class a extends GeneratedMessageLite.a<C0791k, a> implements T {
            private a() {
                super(C0791k.DEFAULT_INSTANCE);
            }
        }

        static {
            C0791k kVar = new C0791k();
            DEFAULT_INSTANCE = kVar;
            GeneratedMessageLite.registerDefaultInstance(C0791k.class, kVar);
        }

        private C0791k() {
        }

        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            switch (C7083e.f45641a[fVar.ordinal()]) {
                case 1:
                    return new C0791k();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\u0003\u0004ለ\u0000", new Object[]{"bitField0_", "operatingSystem_", "osVersion_", "timestamp_", "osBuild_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    a0<C0791k> a0Var = PARSER;
                    if (a0Var == null) {
                        synchronized (C0791k.class) {
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

    public static final class l extends GeneratedMessageLite<l, a> implements T {
        /* access modifiers changed from: private */
        public static final l DEFAULT_INSTANCE;
        public static final int FRAMES_FIELD_NUMBER = 2;
        public static final int IS_CRASHING_THREAD_FIELD_NUMBER = 3;
        private static volatile a0<l> PARSER = null;
        public static final int REGISTERS_FIELD_NUMBER = 4;
        public static final int THREAD_ID_FIELD_NUMBER = 1;
        private C9592z.i<f> frames_ = GeneratedMessageLite.emptyProtobufList();
        private boolean isCrashingThread_;
        private C9592z.i<b> registers_ = GeneratedMessageLite.emptyProtobufList();
        private int threadId_;

        public static final class a extends GeneratedMessageLite.a<l, a> implements T {
            private a() {
                super(l.DEFAULT_INSTANCE);
            }
        }

        public static final class b extends GeneratedMessageLite<b, a> implements T {
            /* access modifiers changed from: private */
            public static final b DEFAULT_INSTANCE;
            public static final int NAME_FIELD_NUMBER = 1;
            private static volatile a0<b> PARSER = null;
            public static final int VALUE_FIELD_NUMBER = 2;
            private String name_ = "";
            private long value_;

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
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0003", new Object[]{"name_", "value_"});
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

        static {
            l lVar = new l();
            DEFAULT_INSTANCE = lVar;
            GeneratedMessageLite.registerDefaultInstance(l.class, lVar);
        }

        private l() {
        }

        public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
            switch (C7083e.f45641a[fVar.ordinal()]) {
                case 1:
                    return new l();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u000b\u0002\u001b\u0003\u0007\u0004\u001b", new Object[]{"threadId_", "frames_", f.class, "isCrashingThread_", "registers_", b.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    a0<l> a0Var = PARSER;
                    if (a0Var == null) {
                        synchronized (l.class) {
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
        k kVar = new k();
        DEFAULT_INSTANCE = kVar;
        GeneratedMessageLite.registerDefaultInstance(k.class, kVar);
    }

    private k() {
    }

    public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
        switch (C7083e.f45641a[fVar.ordinal()]) {
            case 1:
                return new k();
            case 2:
                return new d();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0001\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007\u001b\b2", new Object[]{"bitField0_", "systemInfo_", "applicationInfo_", "signal_", "processInfo_", "machineInfo_", "lastExceptionBacktrace_", "threads_", l.class, "binaries_", b.f45642a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<k> a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (k.class) {
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
