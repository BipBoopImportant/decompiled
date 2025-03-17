package Gc;

import com.google.protobuf.A;
import com.google.protobuf.C9592z;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.T;
import com.google.protobuf.a0;

public final class k extends GeneratedMessageLite<k, c> implements T {
    /* access modifiers changed from: private */
    public static final k DEFAULT_INSTANCE;
    private static volatile a0<k> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private static final A<Integer, l> sessionVerbosity_converter_ = new a();
    private int bitField0_;
    private String sessionId_ = "";
    private C9592z.g sessionVerbosity_ = GeneratedMessageLite.emptyIntList();

    class a implements A<Integer, l> {
        a() {
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f60595a;

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
                f60595a = r0
                com.google.protobuf.GeneratedMessageLite$f r1 = com.google.protobuf.GeneratedMessageLite.f.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f60595a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$f r1 = com.google.protobuf.GeneratedMessageLite.f.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f60595a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$f r1 = com.google.protobuf.GeneratedMessageLite.f.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f60595a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$f r1 = com.google.protobuf.GeneratedMessageLite.f.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f60595a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$f r1 = com.google.protobuf.GeneratedMessageLite.f.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f60595a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$f r1 = com.google.protobuf.GeneratedMessageLite.f.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f60595a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$f r1 = com.google.protobuf.GeneratedMessageLite.f.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Gc.k.b.<clinit>():void");
        }
    }

    public static final class c extends GeneratedMessageLite.a<k, c> implements T {
        /* synthetic */ c(a aVar) {
            this();
        }

        public c E(l lVar) {
            u();
            ((k) this.f69206b).k(lVar);
            return this;
        }

        public c G(String str) {
            u();
            ((k) this.f69206b).p(str);
            return this;
        }

        private c() {
            super(k.DEFAULT_INSTANCE);
        }
    }

    static {
        k kVar = new k();
        DEFAULT_INSTANCE = kVar;
        GeneratedMessageLite.registerDefaultInstance(k.class, kVar);
    }

    private k() {
    }

    /* access modifiers changed from: private */
    public void k(l lVar) {
        lVar.getClass();
        l();
        this.sessionVerbosity_.P1(lVar.d());
    }

    private void l() {
        C9592z.g gVar = this.sessionVerbosity_;
        if (!gVar.u()) {
            this.sessionVerbosity_ = GeneratedMessageLite.mutableCopy(gVar);
        }
    }

    public static c o() {
        return (c) DEFAULT_INSTANCE.createBuilder();
    }

    /* access modifiers changed from: private */
    public void p(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
        switch (b.f60595a[fVar.ordinal()]) {
            case 1:
                return new k();
            case 2:
                return new c((a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002ࠞ", new Object[]{"bitField0_", "sessionId_", "sessionVerbosity_", l.j()});
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

    public l m(int i10) {
        l b10 = l.b(this.sessionVerbosity_.getInt(i10));
        return b10 == null ? l.SESSION_VERBOSITY_NONE : b10;
    }

    public int n() {
        return this.sessionVerbosity_.size();
    }
}
