package d9;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.K;
import com.google.protobuf.L;
import com.google.protobuf.T;
import com.google.protobuf.a0;
import com.google.protobuf.u0;
import java.util.Collections;
import java.util.Map;

public final class C extends GeneratedMessageLite<C, a> implements T {
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 3;
    /* access modifiers changed from: private */
    public static final C DEFAULT_INSTANCE;
    public static final int ERROR_SOURCE_FIELD_NUMBER = 4;
    public static final int MESSAGE_FIELD_NUMBER = 1;
    private static volatile a0<C> PARSER = null;
    public static final int RELATIVE_TIME_FIELD_NUMBER = 2;
    public static final int UNIX_TIMESTAMP_MS_FIELD_NUMBER = 5;
    private int bitField0_;
    private L<String, String> customAttributes_ = L.d();
    private String errorSource_ = "";
    private String message_ = "";
    private long relativeTime_;
    private long unixTimestampMs_;

    public static final class a extends GeneratedMessageLite.a<C, a> implements T {
        private a() {
            super(C.DEFAULT_INSTANCE);
        }

        public Map<String, String> E() {
            return Collections.unmodifiableMap(((C) this.f69206b).n());
        }

        public a G(Map<String, String> map) {
            u();
            ((C) this.f69206b).o().putAll(map);
            return this;
        }

        public a H(String str) {
            u();
            ((C) this.f69206b).t(str);
            return this;
        }

        public a I(String str) {
            u();
            ((C) this.f69206b).u(str);
            return this;
        }

        public a K(long j10) {
            u();
            ((C) this.f69206b).v(j10);
            return this;
        }

        public a L(long j10) {
            u();
            ((C) this.f69206b).w(j10);
            return this;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        static final K<String, String> f50765a;

        static {
            u0.b bVar = u0.b.STRING;
            f50765a = K.d(bVar, "", bVar, "");
        }
    }

    static {
        C c10 = new C();
        DEFAULT_INSTANCE = c10;
        GeneratedMessageLite.registerDefaultInstance(C.class, c10);
    }

    private C() {
    }

    /* access modifiers changed from: private */
    public Map<String, String> o() {
        return r();
    }

    private L<String, String> p() {
        return this.customAttributes_;
    }

    private L<String, String> r() {
        if (!this.customAttributes_.m()) {
            this.customAttributes_ = this.customAttributes_.p();
        }
        return this.customAttributes_;
    }

    public static a s() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    /* access modifiers changed from: private */
    public void t(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.errorSource_ = str;
    }

    /* access modifiers changed from: private */
    public void u(String str) {
        str.getClass();
        this.message_ = str;
    }

    /* access modifiers changed from: private */
    public void v(long j10) {
        this.relativeTime_ = j10;
    }

    /* access modifiers changed from: private */
    public void w(long j10) {
        this.unixTimestampMs_ = j10;
    }

    public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
        switch (C7777x.f50830a[fVar.ordinal()]) {
            case 1:
                return new C();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001Ȉ\u0002\u0003\u00032\u0004ለ\u0000\u0005\u0003", new Object[]{"bitField0_", "message_", "relativeTime_", "customAttributes_", b.f50765a, "errorSource_", "unixTimestampMs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<C> a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (C.class) {
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

    public Map<String, String> n() {
        return Collections.unmodifiableMap(p());
    }
}
