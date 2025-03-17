package Gc;

import Gc.c;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.a0;

public final class i extends GeneratedMessageLite<i, b> implements j {
    public static final int APPLICATION_INFO_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final i DEFAULT_INSTANCE;
    public static final int GAUGE_METRIC_FIELD_NUMBER = 4;
    public static final int NETWORK_REQUEST_METRIC_FIELD_NUMBER = 3;
    private static volatile a0<i> PARSER = null;
    public static final int TRACE_METRIC_FIELD_NUMBER = 2;
    public static final int TRANSPORT_INFO_FIELD_NUMBER = 5;
    private c applicationInfo_;
    private int bitField0_;
    private g gaugeMetric_;
    private h networkRequestMetric_;
    private m traceMetric_;
    private n transportInfo_;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f60594a;

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
                f60594a = r0
                com.google.protobuf.GeneratedMessageLite$f r1 = com.google.protobuf.GeneratedMessageLite.f.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f60594a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$f r1 = com.google.protobuf.GeneratedMessageLite.f.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f60594a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$f r1 = com.google.protobuf.GeneratedMessageLite.f.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f60594a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$f r1 = com.google.protobuf.GeneratedMessageLite.f.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f60594a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$f r1 = com.google.protobuf.GeneratedMessageLite.f.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f60594a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$f r1 = com.google.protobuf.GeneratedMessageLite.f.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f60594a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$f r1 = com.google.protobuf.GeneratedMessageLite.f.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Gc.i.a.<clinit>():void");
        }
    }

    public static final class b extends GeneratedMessageLite.a<i, b> implements j {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b E(c.b bVar) {
            u();
            ((i) this.f69206b).p((c) bVar.g());
            return this;
        }

        public b G(g gVar) {
            u();
            ((i) this.f69206b).r(gVar);
            return this;
        }

        public b H(h hVar) {
            u();
            ((i) this.f69206b).s(hVar);
            return this;
        }

        public b I(m mVar) {
            u();
            ((i) this.f69206b).t(mVar);
            return this;
        }

        public boolean a() {
            return ((i) this.f69206b).a();
        }

        public boolean b() {
            return ((i) this.f69206b).b();
        }

        public h c() {
            return ((i) this.f69206b).c();
        }

        public boolean d() {
            return ((i) this.f69206b).d();
        }

        public m e() {
            return ((i) this.f69206b).e();
        }

        public g f() {
            return ((i) this.f69206b).f();
        }

        private b() {
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

    public static b o() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    /* access modifiers changed from: private */
    public void p(c cVar) {
        cVar.getClass();
        this.applicationInfo_ = cVar;
        this.bitField0_ |= 1;
    }

    /* access modifiers changed from: private */
    public void r(g gVar) {
        gVar.getClass();
        this.gaugeMetric_ = gVar;
        this.bitField0_ |= 8;
    }

    /* access modifiers changed from: private */
    public void s(h hVar) {
        hVar.getClass();
        this.networkRequestMetric_ = hVar;
        this.bitField0_ |= 4;
    }

    /* access modifiers changed from: private */
    public void t(m mVar) {
        mVar.getClass();
        this.traceMetric_ = mVar;
        this.bitField0_ |= 2;
    }

    public boolean a() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean b() {
        return (this.bitField0_ & 4) != 0;
    }

    public h c() {
        h hVar = this.networkRequestMetric_;
        return hVar == null ? h.A() : hVar;
    }

    public boolean d() {
        return (this.bitField0_ & 2) != 0;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
        switch (a.f60594a[fVar.ordinal()]) {
            case 1:
                return new i();
            case 2:
                return new b((a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "applicationInfo_", "traceMetric_", "networkRequestMetric_", "gaugeMetric_", "transportInfo_"});
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

    public m e() {
        m mVar = this.traceMetric_;
        return mVar == null ? m.C() : mVar;
    }

    public g f() {
        g gVar = this.gaugeMetric_;
        return gVar == null ? g.t() : gVar;
    }

    public c m() {
        c cVar = this.applicationInfo_;
        return cVar == null ? c.o() : cVar;
    }

    public boolean n() {
        return (this.bitField0_ & 1) != 0;
    }
}
