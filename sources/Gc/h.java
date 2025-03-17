package Gc;

import com.google.protobuf.C9568a;
import com.google.protobuf.C9592z;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.K;
import com.google.protobuf.L;
import com.google.protobuf.T;
import com.google.protobuf.a0;
import com.google.protobuf.u0;
import java.util.List;

public final class h extends GeneratedMessageLite<h, b> implements T {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 7;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 12;
    /* access modifiers changed from: private */
    public static final h DEFAULT_INSTANCE;
    public static final int HTTP_METHOD_FIELD_NUMBER = 2;
    public static final int HTTP_RESPONSE_CODE_FIELD_NUMBER = 5;
    public static final int NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER = 11;
    private static volatile a0<h> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 13;
    public static final int REQUEST_PAYLOAD_BYTES_FIELD_NUMBER = 3;
    public static final int RESPONSE_CONTENT_TYPE_FIELD_NUMBER = 6;
    public static final int RESPONSE_PAYLOAD_BYTES_FIELD_NUMBER = 4;
    public static final int TIME_TO_REQUEST_COMPLETED_US_FIELD_NUMBER = 8;
    public static final int TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER = 10;
    public static final int TIME_TO_RESPONSE_INITIATED_US_FIELD_NUMBER = 9;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private long clientStartTimeUs_;
    private L<String, String> customAttributes_ = L.d();
    private int httpMethod_;
    private int httpResponseCode_;
    private int networkClientErrorReason_;
    private C9592z.i<k> perfSessions_ = GeneratedMessageLite.emptyProtobufList();
    private long requestPayloadBytes_;
    private String responseContentType_ = "";
    private long responsePayloadBytes_;
    private long timeToRequestCompletedUs_;
    private long timeToResponseCompletedUs_;
    private long timeToResponseInitiatedUs_;
    private String url_ = "";

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f60590a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.GeneratedMessageLite$f[] r0 = com.google.protobuf.GeneratedMessageLite.f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f60590a = r0
                com.google.protobuf.GeneratedMessageLite$f r1 = com.google.protobuf.GeneratedMessageLite.f.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f60590a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$f r1 = com.google.protobuf.GeneratedMessageLite.f.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f60590a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$f r1 = com.google.protobuf.GeneratedMessageLite.f.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f60590a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$f r1 = com.google.protobuf.GeneratedMessageLite.f.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f60590a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$f r1 = com.google.protobuf.GeneratedMessageLite.f.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f60590a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$f r1 = com.google.protobuf.GeneratedMessageLite.f.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f60590a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$f r1 = com.google.protobuf.GeneratedMessageLite.f.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Gc.h.a.<clinit>():void");
        }
    }

    public static final class b extends GeneratedMessageLite.a<h, b> implements T {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b E(Iterable<? extends k> iterable) {
            u();
            ((h) this.f69206b).w(iterable);
            return this;
        }

        public b G() {
            u();
            ((h) this.f69206b).x();
            return this;
        }

        public long H() {
            return ((h) this.f69206b).J();
        }

        public boolean I() {
            return ((h) this.f69206b).L();
        }

        public boolean K() {
            return ((h) this.f69206b).N();
        }

        public boolean L() {
            return ((h) this.f69206b).R();
        }

        public b M(long j10) {
            u();
            ((h) this.f69206b).U(j10);
            return this;
        }

        public b N(d dVar) {
            u();
            ((h) this.f69206b).V(dVar);
            return this;
        }

        public b O(int i10) {
            u();
            ((h) this.f69206b).W(i10);
            return this;
        }

        public b P(e eVar) {
            u();
            ((h) this.f69206b).X(eVar);
            return this;
        }

        public b Q(long j10) {
            u();
            ((h) this.f69206b).Y(j10);
            return this;
        }

        public b R(String str) {
            u();
            ((h) this.f69206b).Z(str);
            return this;
        }

        public b S(long j10) {
            u();
            ((h) this.f69206b).a0(j10);
            return this;
        }

        public b T(long j10) {
            u();
            ((h) this.f69206b).b0(j10);
            return this;
        }

        public b V(long j10) {
            u();
            ((h) this.f69206b).c0(j10);
            return this;
        }

        public b W(long j10) {
            u();
            ((h) this.f69206b).d0(j10);
            return this;
        }

        public b X(String str) {
            u();
            ((h) this.f69206b).e0(str);
            return this;
        }

        private b() {
            super(h.DEFAULT_INSTANCE);
        }
    }

    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        static final K<String, String> f60591a;

        static {
            u0.b bVar = u0.b.STRING;
            f60591a = K.d(bVar, "", bVar, "");
        }
    }

    public enum d implements C9592z.c {
        HTTP_METHOD_UNKNOWN(0),
        GET(1),
        PUT(2),
        POST(3),
        DELETE(4),
        HEAD(5),
        PATCH(6),
        OPTIONS(7),
        TRACE(8),
        CONNECT(9);
        
        public static final int CONNECT_VALUE = 9;
        public static final int DELETE_VALUE = 4;
        public static final int GET_VALUE = 1;
        public static final int HEAD_VALUE = 5;
        public static final int HTTP_METHOD_UNKNOWN_VALUE = 0;
        public static final int OPTIONS_VALUE = 7;
        public static final int PATCH_VALUE = 6;
        public static final int POST_VALUE = 3;
        public static final int PUT_VALUE = 2;
        public static final int TRACE_VALUE = 8;
        private static final C9592z.d<d> internalValueMap = null;
        private final int value;

        class a implements C9592z.d<d> {
            a() {
            }

            /* renamed from: b */
            public d a(int i10) {
                return d.b(i10);
            }
        }

        private static final class b implements C9592z.e {

            /* renamed from: a  reason: collision with root package name */
            static final C9592z.e f60592a = null;

            static {
                f60592a = new b();
            }

            private b() {
            }

            public boolean a(int i10) {
                return d.b(i10) != null;
            }
        }

        static {
            internalValueMap = new a();
        }

        private d(int i10) {
            this.value = i10;
        }

        public static d b(int i10) {
            switch (i10) {
                case 0:
                    return HTTP_METHOD_UNKNOWN;
                case 1:
                    return GET;
                case 2:
                    return PUT;
                case 3:
                    return POST;
                case 4:
                    return DELETE;
                case 5:
                    return HEAD;
                case 6:
                    return PATCH;
                case 7:
                    return OPTIONS;
                case 8:
                    return TRACE;
                case 9:
                    return CONNECT;
                default:
                    return null;
            }
        }

        public static C9592z.e j() {
            return b.f60592a;
        }

        public final int d() {
            return this.value;
        }
    }

    public enum e implements C9592z.c {
        NETWORK_CLIENT_ERROR_REASON_UNKNOWN(0),
        GENERIC_CLIENT_ERROR(1);
        
        public static final int GENERIC_CLIENT_ERROR_VALUE = 1;
        public static final int NETWORK_CLIENT_ERROR_REASON_UNKNOWN_VALUE = 0;
        private static final C9592z.d<e> internalValueMap = null;
        private final int value;

        class a implements C9592z.d<e> {
            a() {
            }

            /* renamed from: b */
            public e a(int i10) {
                return e.b(i10);
            }
        }

        private static final class b implements C9592z.e {

            /* renamed from: a  reason: collision with root package name */
            static final C9592z.e f60593a = null;

            static {
                f60593a = new b();
            }

            private b() {
            }

            public boolean a(int i10) {
                return e.b(i10) != null;
            }
        }

        static {
            internalValueMap = new a();
        }

        private e(int i10) {
            this.value = i10;
        }

        public static e b(int i10) {
            if (i10 == 0) {
                return NETWORK_CLIENT_ERROR_REASON_UNKNOWN;
            }
            if (i10 != 1) {
                return null;
            }
            return GENERIC_CLIENT_ERROR;
        }

        public static C9592z.e j() {
            return b.f60593a;
        }

        public final int d() {
            return this.value;
        }
    }

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        GeneratedMessageLite.registerDefaultInstance(h.class, hVar);
    }

    private h() {
    }

    public static h A() {
        return DEFAULT_INSTANCE;
    }

    public static b T() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    /* access modifiers changed from: private */
    public void U(long j10) {
        this.bitField0_ |= 128;
        this.clientStartTimeUs_ = j10;
    }

    /* access modifiers changed from: private */
    public void V(d dVar) {
        this.httpMethod_ = dVar.d();
        this.bitField0_ |= 2;
    }

    /* access modifiers changed from: private */
    public void W(int i10) {
        this.bitField0_ |= 32;
        this.httpResponseCode_ = i10;
    }

    /* access modifiers changed from: private */
    public void X(e eVar) {
        this.networkClientErrorReason_ = eVar.d();
        this.bitField0_ |= 16;
    }

    /* access modifiers changed from: private */
    public void Y(long j10) {
        this.bitField0_ |= 4;
        this.requestPayloadBytes_ = j10;
    }

    /* access modifiers changed from: private */
    public void Z(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.responseContentType_ = str;
    }

    /* access modifiers changed from: private */
    public void a0(long j10) {
        this.bitField0_ |= 8;
        this.responsePayloadBytes_ = j10;
    }

    /* access modifiers changed from: private */
    public void b0(long j10) {
        this.bitField0_ |= 256;
        this.timeToRequestCompletedUs_ = j10;
    }

    /* access modifiers changed from: private */
    public void c0(long j10) {
        this.bitField0_ |= 1024;
        this.timeToResponseCompletedUs_ = j10;
    }

    /* access modifiers changed from: private */
    public void d0(long j10) {
        this.bitField0_ |= 512;
        this.timeToResponseInitiatedUs_ = j10;
    }

    /* access modifiers changed from: private */
    public void e0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.url_ = str;
    }

    /* access modifiers changed from: private */
    public void w(Iterable<? extends k> iterable) {
        y();
        C9568a.addAll(iterable, this.perfSessions_);
    }

    /* access modifiers changed from: private */
    public void x() {
        this.bitField0_ &= -65;
        this.responseContentType_ = A().F();
    }

    private void y() {
        C9592z.i<k> iVar = this.perfSessions_;
        if (!iVar.u()) {
            this.perfSessions_ = GeneratedMessageLite.mutableCopy(iVar);
        }
    }

    public d B() {
        d b10 = d.b(this.httpMethod_);
        return b10 == null ? d.HTTP_METHOD_UNKNOWN : b10;
    }

    public int C() {
        return this.httpResponseCode_;
    }

    public List<k> D() {
        return this.perfSessions_;
    }

    public long E() {
        return this.requestPayloadBytes_;
    }

    public String F() {
        return this.responseContentType_;
    }

    public long G() {
        return this.responsePayloadBytes_;
    }

    public long H() {
        return this.timeToRequestCompletedUs_;
    }

    public long I() {
        return this.timeToResponseCompletedUs_;
    }

    public long J() {
        return this.timeToResponseInitiatedUs_;
    }

    public String K() {
        return this.url_;
    }

    public boolean L() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean M() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean N() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean O() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean P() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean Q() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean R() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean S() {
        return (this.bitField0_ & 512) != 0;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
        switch (a.f60590a[fVar.ordinal()]) {
            case 1:
                return new h();
            case 2:
                return new b((a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0005\u0006ဈ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u000b᠌\u0004\f2\r\u001b", new Object[]{"bitField0_", "url_", "httpMethod_", d.j(), "requestPayloadBytes_", "responsePayloadBytes_", "httpResponseCode_", "responseContentType_", "clientStartTimeUs_", "timeToRequestCompletedUs_", "timeToResponseInitiatedUs_", "timeToResponseCompletedUs_", "networkClientErrorReason_", e.j(), "customAttributes_", c.f60591a, "perfSessions_", k.class});
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

    public long z() {
        return this.clientStartTimeUs_;
    }
}
