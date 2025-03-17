package Gc;

import Gc.a;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.K;
import com.google.protobuf.L;
import com.google.protobuf.T;
import com.google.protobuf.a0;
import com.google.protobuf.u0;
import java.util.Map;

public final class c extends GeneratedMessageLite<c, b> implements T {
    public static final int ANDROID_APP_INFO_FIELD_NUMBER = 3;
    public static final int APPLICATION_PROCESS_STATE_FIELD_NUMBER = 5;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 6;
    /* access modifiers changed from: private */
    public static final c DEFAULT_INSTANCE;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile a0<c> PARSER;
    private a androidAppInfo_;
    private String appInstanceId_ = "";
    private int applicationProcessState_;
    private int bitField0_;
    private L<String, String> customAttributes_ = L.d();
    private String googleAppId_ = "";

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f60584a;

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
                f60584a = r0
                com.google.protobuf.GeneratedMessageLite$f r1 = com.google.protobuf.GeneratedMessageLite.f.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f60584a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$f r1 = com.google.protobuf.GeneratedMessageLite.f.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f60584a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$f r1 = com.google.protobuf.GeneratedMessageLite.f.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f60584a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$f r1 = com.google.protobuf.GeneratedMessageLite.f.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f60584a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$f r1 = com.google.protobuf.GeneratedMessageLite.f.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f60584a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$f r1 = com.google.protobuf.GeneratedMessageLite.f.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f60584a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$f r1 = com.google.protobuf.GeneratedMessageLite.f.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Gc.c.a.<clinit>():void");
        }
    }

    public static final class b extends GeneratedMessageLite.a<c, b> implements T {
        /* synthetic */ b(a aVar) {
            this();
        }

        public boolean E() {
            return ((c) this.f69206b).s();
        }

        public b G(Map<String, String> map) {
            u();
            ((c) this.f69206b).p().putAll(map);
            return this;
        }

        public b H(a.b bVar) {
            u();
            ((c) this.f69206b).x((a) bVar.g());
            return this;
        }

        public b I(String str) {
            u();
            ((c) this.f69206b).y(str);
            return this;
        }

        public b K(d dVar) {
            u();
            ((c) this.f69206b).z(dVar);
            return this;
        }

        public b L(String str) {
            u();
            ((c) this.f69206b).A(str);
            return this;
        }

        private b() {
            super(c.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: Gc.c$c  reason: collision with other inner class name */
    private static final class C0995c {

        /* renamed from: a  reason: collision with root package name */
        static final K<String, String> f60585a;

        static {
            u0.b bVar = u0.b.STRING;
            f60585a = K.d(bVar, "", bVar, "");
        }
    }

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        GeneratedMessageLite.registerDefaultInstance(c.class, cVar);
    }

    private c() {
    }

    /* access modifiers changed from: private */
    public void A(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.googleAppId_ = str;
    }

    public static c o() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    public Map<String, String> p() {
        return v();
    }

    private L<String, String> v() {
        if (!this.customAttributes_.m()) {
            this.customAttributes_ = this.customAttributes_.p();
        }
        return this.customAttributes_;
    }

    public static b w() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    /* access modifiers changed from: private */
    public void x(a aVar) {
        aVar.getClass();
        this.androidAppInfo_ = aVar;
        this.bitField0_ |= 4;
    }

    /* access modifiers changed from: private */
    public void y(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.appInstanceId_ = str;
    }

    /* access modifiers changed from: private */
    public void z(d dVar) {
        this.applicationProcessState_ = dVar.d();
        this.bitField0_ |= 8;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
        switch (a.f60584a[fVar.ordinal()]) {
            case 1:
                return new c();
            case 2:
                return new b((a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0005᠌\u0003\u00062", new Object[]{"bitField0_", "googleAppId_", "appInstanceId_", "androidAppInfo_", "applicationProcessState_", d.j(), "customAttributes_", C0995c.f60585a});
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

    public a n() {
        a aVar = this.androidAppInfo_;
        return aVar == null ? a.l() : aVar;
    }

    public boolean r() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean s() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean t() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean u() {
        return (this.bitField0_ & 1) != 0;
    }
}
