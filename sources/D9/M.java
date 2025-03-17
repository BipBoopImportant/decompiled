package d9;

import com.google.protobuf.C9575h;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.K;
import com.google.protobuf.L;
import com.google.protobuf.T;
import com.google.protobuf.a0;
import com.google.protobuf.u0;
import java.util.Collections;
import java.util.Map;

public final class M extends GeneratedMessageLite<M, a> implements T {
    public static final int CUSTOM_REQUEST_HEADERS_FIELD_NUMBER = 9;
    public static final int CUSTOM_RESPONSE_HEADERS_FIELD_NUMBER = 10;
    /* access modifiers changed from: private */
    public static final M DEFAULT_INSTANCE;
    public static final int ENCRYPTED_SYMMETRIC_KEY_FIELD_NUMBER = 13;
    public static final int ENCYPTION_PUBLIC_KEY_ID_FIELD_NUMBER = 14;
    public static final int HTTP_METHOD_FIELD_NUMBER = 3;
    public static final int INITIALIZATION_VECTOR_FIELD_NUMBER = 12;
    private static volatile a0<M> PARSER = null;
    public static final int PLAIN_CUSTOM_REQUEST_HEADERS_FIELD_NUMBER = 18;
    public static final int PLAIN_CUSTOM_RESPONSE_HEADERS_FIELD_NUMBER = 19;
    public static final int PLAIN_REQUEST_BODY_ATTRIBUTES_FIELD_NUMBER = 20;
    public static final int PLAIN_RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER = 22;
    public static final int QUERY_PARAMETERS_FIELD_NUMBER = 11;
    public static final int REQUEST_BODY_ATTRIBUTES_FIELD_NUMBER = 21;
    public static final int REQUEST_BODY_FIELD_NUMBER = 15;
    public static final int REQUEST_TIME_FIELD_NUMBER = 4;
    public static final int RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER = 23;
    public static final int RESPONSE_BODY_FIELD_NUMBER = 16;
    public static final int RESPONSE_TIME_FIELD_NUMBER = 5;
    public static final int SOURCE_FIELD_NUMBER = 17;
    public static final int STANDARD_REQUEST_HEADERS_FIELD_NUMBER = 7;
    public static final int STANDARD_RESPONSE_HEADERS_FIELD_NUMBER = 8;
    public static final int STATUS_CODE_FIELD_NUMBER = 6;
    public static final int UNIX_TIMESTAMP_MS_FIELD_NUMBER = 1;
    public static final int URL_FIELD_NUMBER = 2;
    private int bitField0_;
    private C9575h customRequestHeaders_;
    private C9575h customResponseHeaders_;
    private C9575h encryptedSymmetricKey_;
    private long encyptionPublicKeyId_;
    private String httpMethod_ = "";
    private C9575h initializationVector_;
    private L<String, String> plainCustomRequestHeaders_ = L.d();
    private L<String, String> plainCustomResponseHeaders_ = L.d();
    private L<String, String> plainRequestBodyAttributes_ = L.d();
    private L<String, String> plainResponseBodyAttributes_ = L.d();
    private C9575h queryParameters_;
    private C9575h requestBodyAttributes_;
    private C9575h requestBody_;
    private long requestTime_;
    private C9575h responseBodyAttributes_;
    private C9575h responseBody_;
    private long responseTime_;
    private String source_;
    private L<String, String> standardRequestHeaders_ = L.d();
    private L<String, String> standardResponseHeaders_ = L.d();
    private int statusCode_;
    private long unixTimestampMs_;
    private String url_ = "";

    public static final class a extends GeneratedMessageLite.a<M, a> implements T {
        private a() {
            super(M.DEFAULT_INSTANCE);
        }

        public Map<String, String> E() {
            return Collections.unmodifiableMap(((M) this.f69206b).M());
        }

        public Map<String, String> G() {
            return Collections.unmodifiableMap(((M) this.f69206b).N());
        }

        public Map<String, String> H() {
            return Collections.unmodifiableMap(((M) this.f69206b).O());
        }

        public Map<String, String> I() {
            return Collections.unmodifiableMap(((M) this.f69206b).P());
        }

        public Map<String, String> K() {
            return Collections.unmodifiableMap(((M) this.f69206b).Q());
        }

        public Map<String, String> L() {
            return Collections.unmodifiableMap(((M) this.f69206b).R());
        }

        public a M(Map<String, String> map) {
            u();
            ((M) this.f69206b).G().putAll(map);
            return this;
        }

        public a N(Map<String, String> map) {
            u();
            ((M) this.f69206b).H().putAll(map);
            return this;
        }

        public a O(Map<String, String> map) {
            u();
            ((M) this.f69206b).I().putAll(map);
            return this;
        }

        public a P(Map<String, String> map) {
            u();
            ((M) this.f69206b).J().putAll(map);
            return this;
        }

        public a Q(Map<String, String> map) {
            u();
            ((M) this.f69206b).K().putAll(map);
            return this;
        }

        public a R(Map<String, String> map) {
            u();
            ((M) this.f69206b).L().putAll(map);
            return this;
        }

        public a S(C9575h hVar) {
            u();
            ((M) this.f69206b).f0(hVar);
            return this;
        }

        public a T(C9575h hVar) {
            u();
            ((M) this.f69206b).g0(hVar);
            return this;
        }

        public a V(C9575h hVar) {
            u();
            ((M) this.f69206b).h0(hVar);
            return this;
        }

        public a W(long j10) {
            u();
            ((M) this.f69206b).i0(j10);
            return this;
        }

        public a X(String str) {
            u();
            ((M) this.f69206b).j0(str);
            return this;
        }

        public a Y(C9575h hVar) {
            u();
            ((M) this.f69206b).k0(hVar);
            return this;
        }

        public a Z(C9575h hVar) {
            u();
            ((M) this.f69206b).l0(hVar);
            return this;
        }

        public a a0(C9575h hVar) {
            u();
            ((M) this.f69206b).m0(hVar);
            return this;
        }

        public a b0(C9575h hVar) {
            u();
            ((M) this.f69206b).n0(hVar);
            return this;
        }

        public a c0(long j10) {
            u();
            ((M) this.f69206b).o0(j10);
            return this;
        }

        public a d0(C9575h hVar) {
            u();
            ((M) this.f69206b).p0(hVar);
            return this;
        }

        public a e0(C9575h hVar) {
            u();
            ((M) this.f69206b).q0(hVar);
            return this;
        }

        public a f0(long j10) {
            u();
            ((M) this.f69206b).r0(j10);
            return this;
        }

        public a g0(String str) {
            u();
            ((M) this.f69206b).s0(str);
            return this;
        }

        public a h0(int i10) {
            u();
            ((M) this.f69206b).t0(i10);
            return this;
        }

        public a i0(long j10) {
            u();
            ((M) this.f69206b).u0(j10);
            return this;
        }

        public a j0(String str) {
            u();
            ((M) this.f69206b).v0(str);
            return this;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        static final K<String, String> f50766a;

        static {
            u0.b bVar = u0.b.STRING;
            f50766a = K.d(bVar, "", bVar, "");
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        static final K<String, String> f50767a;

        static {
            u0.b bVar = u0.b.STRING;
            f50767a = K.d(bVar, "", bVar, "");
        }
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        static final K<String, String> f50768a;

        static {
            u0.b bVar = u0.b.STRING;
            f50768a = K.d(bVar, "", bVar, "");
        }
    }

    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        static final K<String, String> f50769a;

        static {
            u0.b bVar = u0.b.STRING;
            f50769a = K.d(bVar, "", bVar, "");
        }
    }

    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        static final K<String, String> f50770a;

        static {
            u0.b bVar = u0.b.STRING;
            f50770a = K.d(bVar, "", bVar, "");
        }
    }

    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        static final K<String, String> f50771a;

        static {
            u0.b bVar = u0.b.STRING;
            f50771a = K.d(bVar, "", bVar, "");
        }
    }

    static {
        M m10 = new M();
        DEFAULT_INSTANCE = m10;
        GeneratedMessageLite.registerDefaultInstance(M.class, m10);
    }

    private M() {
        C9575h hVar = C9575h.f69286b;
        this.customRequestHeaders_ = hVar;
        this.customResponseHeaders_ = hVar;
        this.queryParameters_ = hVar;
        this.initializationVector_ = hVar;
        this.encryptedSymmetricKey_ = hVar;
        this.requestBody_ = hVar;
        this.responseBody_ = hVar;
        this.source_ = "";
        this.requestBodyAttributes_ = hVar;
        this.responseBodyAttributes_ = hVar;
    }

    /* access modifiers changed from: private */
    public Map<String, String> G() {
        return S();
    }

    /* access modifiers changed from: private */
    public Map<String, String> H() {
        return T();
    }

    /* access modifiers changed from: private */
    public Map<String, String> I() {
        return U();
    }

    /* access modifiers changed from: private */
    public Map<String, String> J() {
        return V();
    }

    /* access modifiers changed from: private */
    public Map<String, String> K() {
        return W();
    }

    /* access modifiers changed from: private */
    public Map<String, String> L() {
        return X();
    }

    private L<String, String> S() {
        if (!this.plainCustomRequestHeaders_.m()) {
            this.plainCustomRequestHeaders_ = this.plainCustomRequestHeaders_.p();
        }
        return this.plainCustomRequestHeaders_;
    }

    private L<String, String> T() {
        if (!this.plainCustomResponseHeaders_.m()) {
            this.plainCustomResponseHeaders_ = this.plainCustomResponseHeaders_.p();
        }
        return this.plainCustomResponseHeaders_;
    }

    private L<String, String> U() {
        if (!this.plainRequestBodyAttributes_.m()) {
            this.plainRequestBodyAttributes_ = this.plainRequestBodyAttributes_.p();
        }
        return this.plainRequestBodyAttributes_;
    }

    private L<String, String> V() {
        if (!this.plainResponseBodyAttributes_.m()) {
            this.plainResponseBodyAttributes_ = this.plainResponseBodyAttributes_.p();
        }
        return this.plainResponseBodyAttributes_;
    }

    private L<String, String> W() {
        if (!this.standardRequestHeaders_.m()) {
            this.standardRequestHeaders_ = this.standardRequestHeaders_.p();
        }
        return this.standardRequestHeaders_;
    }

    private L<String, String> X() {
        if (!this.standardResponseHeaders_.m()) {
            this.standardResponseHeaders_ = this.standardResponseHeaders_.p();
        }
        return this.standardResponseHeaders_;
    }

    private L<String, String> Y() {
        return this.plainCustomRequestHeaders_;
    }

    private L<String, String> Z() {
        return this.plainCustomResponseHeaders_;
    }

    private L<String, String> a0() {
        return this.plainRequestBodyAttributes_;
    }

    private L<String, String> b0() {
        return this.plainResponseBodyAttributes_;
    }

    private L<String, String> c0() {
        return this.standardRequestHeaders_;
    }

    private L<String, String> d0() {
        return this.standardResponseHeaders_;
    }

    public static a e0() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    /* access modifiers changed from: private */
    public void f0(C9575h hVar) {
        hVar.getClass();
        this.bitField0_ |= 1;
        this.customRequestHeaders_ = hVar;
    }

    /* access modifiers changed from: private */
    public void g0(C9575h hVar) {
        hVar.getClass();
        this.bitField0_ |= 2;
        this.customResponseHeaders_ = hVar;
    }

    /* access modifiers changed from: private */
    public void h0(C9575h hVar) {
        hVar.getClass();
        this.bitField0_ |= 16;
        this.encryptedSymmetricKey_ = hVar;
    }

    /* access modifiers changed from: private */
    public void i0(long j10) {
        this.bitField0_ |= 32;
        this.encyptionPublicKeyId_ = j10;
    }

    /* access modifiers changed from: private */
    public void j0(String str) {
        str.getClass();
        this.httpMethod_ = str;
    }

    /* access modifiers changed from: private */
    public void k0(C9575h hVar) {
        hVar.getClass();
        this.bitField0_ |= 8;
        this.initializationVector_ = hVar;
    }

    /* access modifiers changed from: private */
    public void l0(C9575h hVar) {
        hVar.getClass();
        this.bitField0_ |= 4;
        this.queryParameters_ = hVar;
    }

    /* access modifiers changed from: private */
    public void m0(C9575h hVar) {
        hVar.getClass();
        this.bitField0_ |= 64;
        this.requestBody_ = hVar;
    }

    /* access modifiers changed from: private */
    public void n0(C9575h hVar) {
        hVar.getClass();
        this.bitField0_ |= 512;
        this.requestBodyAttributes_ = hVar;
    }

    /* access modifiers changed from: private */
    public void o0(long j10) {
        this.requestTime_ = j10;
    }

    /* access modifiers changed from: private */
    public void p0(C9575h hVar) {
        hVar.getClass();
        this.bitField0_ |= 128;
        this.responseBody_ = hVar;
    }

    /* access modifiers changed from: private */
    public void q0(C9575h hVar) {
        hVar.getClass();
        this.bitField0_ |= 1024;
        this.responseBodyAttributes_ = hVar;
    }

    /* access modifiers changed from: private */
    public void r0(long j10) {
        this.responseTime_ = j10;
    }

    /* access modifiers changed from: private */
    public void s0(String str) {
        str.getClass();
        this.bitField0_ |= 256;
        this.source_ = str;
    }

    /* access modifiers changed from: private */
    public void t0(int i10) {
        this.statusCode_ = i10;
    }

    /* access modifiers changed from: private */
    public void u0(long j10) {
        this.unixTimestampMs_ = j10;
    }

    /* access modifiers changed from: private */
    public void v0(String str) {
        str.getClass();
        this.url_ = str;
    }

    public Map<String, String> M() {
        return Collections.unmodifiableMap(Y());
    }

    public Map<String, String> N() {
        return Collections.unmodifiableMap(Z());
    }

    public Map<String, String> O() {
        return Collections.unmodifiableMap(a0());
    }

    public Map<String, String> P() {
        return Collections.unmodifiableMap(b0());
    }

    public Map<String, String> Q() {
        return Collections.unmodifiableMap(c0());
    }

    public Map<String, String> R() {
        return Collections.unmodifiableMap(d0());
    }

    public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
        switch (C7777x.f50830a[fVar.ordinal()]) {
            case 1:
                return new M();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0017\u0000\u0001\u0001\u0017\u0017\u0006\u0000\u0000\u0001\u0003\u0002Ȉ\u0003Ȉ\u0004\u0003\u0005\u0003\u0006\u000b\u00072\b2\tည\u0000\nည\u0001\u000bည\u0002\fည\u0003\rည\u0004\u000eတ\u0005\u000fည\u0006\u0010ည\u0007\u0011ለ\b\u00122\u00132\u00142\u0015ည\t\u00162\u0017ည\n", new Object[]{"bitField0_", "unixTimestampMs_", "url_", "httpMethod_", "requestTime_", "responseTime_", "statusCode_", "standardRequestHeaders_", f.f50770a, "standardResponseHeaders_", g.f50771a, "customRequestHeaders_", "customResponseHeaders_", "queryParameters_", "initializationVector_", "encryptedSymmetricKey_", "encyptionPublicKeyId_", "requestBody_", "responseBody_", "source_", "plainCustomRequestHeaders_", b.f50766a, "plainCustomResponseHeaders_", c.f50767a, "plainRequestBodyAttributes_", d.f50768a, "requestBodyAttributes_", "plainResponseBodyAttributes_", e.f50769a, "responseBodyAttributes_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<M> a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (M.class) {
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
