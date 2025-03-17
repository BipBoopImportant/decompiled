package d9;

import com.google.protobuf.C9575h;
import com.google.protobuf.GeneratedMessageLite;
import d9.M;
import java.util.Map;
import jd.C9899b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b,\b\u0007\u0018\u0000 T2\u00020\u0001:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ9\u0010\u000e\u001a\u00020\r*\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ9\u0010\u0010\u001a\u00020\r*\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u000fJ9\u0010\u0011\u001a\u00020\r*\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u000bH\u0007¢\u0006\u0004\b\u0011\u0010\u000fJ9\u0010\u0012\u001a\u00020\r*\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u000bH\u0007¢\u0006\u0004\b\u0012\u0010\u000fJ9\u0010\u0013\u001a\u00020\r*\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u000bH\u0007¢\u0006\u0004\b\u0013\u0010\u000fJ9\u0010\u0014\u001a\u00020\r*\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u000bH\u0007¢\u0006\u0004\b\u0014\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R$\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168G@GX\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010!\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n8G@GX\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010$\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n8G@GX\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R$\u0010'\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168G@GX\u000e¢\u0006\f\u001a\u0004\b%\u0010\u0019\"\u0004\b&\u0010\u001bR$\u0010*\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168G@GX\u000e¢\u0006\f\u001a\u0004\b(\u0010\u0019\"\u0004\b)\u0010\u001bR$\u00100\u001a\u00020+2\u0006\u0010\u0017\u001a\u00020+8G@GX\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R#\u00103\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t8G¢\u0006\u0006\u001a\u0004\b1\u00102R#\u00105\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t8G¢\u0006\u0006\u001a\u0004\b4\u00102R$\u0010;\u001a\u0002062\u0006\u0010\u0017\u001a\u0002068G@GX\u000e¢\u0006\f\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010>\u001a\u0002062\u0006\u0010\u0017\u001a\u0002068G@GX\u000e¢\u0006\f\u001a\u0004\b<\u00108\"\u0004\b=\u0010:R$\u0010A\u001a\u0002062\u0006\u0010\u0017\u001a\u0002068G@GX\u000e¢\u0006\f\u001a\u0004\b?\u00108\"\u0004\b@\u0010:R$\u0010D\u001a\u0002062\u0006\u0010\u0017\u001a\u0002068G@GX\u000e¢\u0006\f\u001a\u0004\bB\u00108\"\u0004\bC\u0010:R$\u0010G\u001a\u0002062\u0006\u0010\u0017\u001a\u0002068G@GX\u000e¢\u0006\f\u001a\u0004\bE\u00108\"\u0004\bF\u0010:R$\u0010J\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168G@GX\u000e¢\u0006\f\u001a\u0004\bH\u0010\u0019\"\u0004\bI\u0010\u001bR$\u0010M\u001a\u0002062\u0006\u0010\u0017\u001a\u0002068G@GX\u000e¢\u0006\f\u001a\u0004\bK\u00108\"\u0004\bL\u0010:R$\u0010P\u001a\u0002062\u0006\u0010\u0017\u001a\u0002068G@GX\u000e¢\u0006\f\u001a\u0004\bN\u00108\"\u0004\bO\u0010:R$\u0010S\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n8G@GX\u000e¢\u0006\f\u001a\u0004\bQ\u0010\u001e\"\u0004\bR\u0010 R#\u0010U\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t8G¢\u0006\u0006\u001a\u0004\bT\u00102R#\u0010W\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t8G¢\u0006\u0006\u001a\u0004\bV\u00102R#\u0010Y\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t8G¢\u0006\u0006\u001a\u0004\bX\u00102R$\u0010\\\u001a\u0002062\u0006\u0010\u0017\u001a\u0002068G@GX\u000e¢\u0006\f\u001a\u0004\bZ\u00108\"\u0004\b[\u0010:R#\u0010^\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t8G¢\u0006\u0006\u001a\u0004\b]\u00102R$\u0010a\u001a\u0002062\u0006\u0010\u0017\u001a\u0002068G@GX\u000e¢\u0006\f\u001a\u0004\b_\u00108\"\u0004\b`\u0010:¨\u0006b"}, d2 = {"Ld9/p;", "", "Ld9/M$a;", "_builder", "<init>", "(Ld9/M$a;)V", "Ld9/M;", "a", "()Ld9/M;", "Ljd/b;", "", "", "map", "LXH/N;", "l", "(Ljd/b;Ljava/util/Map;)V", "m", "h", "i", "j", "k", "Ld9/M$a;", "", "value", "getUnixTimestampMs", "()J", "C", "(J)V", "unixTimestampMs", "getUrl", "()Ljava/lang/String;", "D", "(Ljava/lang/String;)V", "url", "getHttpMethod", "r", "httpMethod", "getRequestTime", "w", "requestTime", "getResponseTime", "z", "responseTime", "", "getStatusCode", "()I", "B", "(I)V", "statusCode", "f", "()Ljd/b;", "standardRequestHeaders", "g", "standardResponseHeaders", "Lcom/google/protobuf/h;", "getCustomRequestHeaders", "()Lcom/google/protobuf/h;", "n", "(Lcom/google/protobuf/h;)V", "customRequestHeaders", "getCustomResponseHeaders", "o", "customResponseHeaders", "getQueryParameters", "t", "queryParameters", "getInitializationVector", "s", "initializationVector", "getEncryptedSymmetricKey", "p", "encryptedSymmetricKey", "getEncyptionPublicKeyId", "q", "encyptionPublicKeyId", "getRequestBody", "u", "requestBody", "getResponseBody", "x", "responseBody", "getSource", "A", "source", "b", "plainCustomRequestHeaders", "c", "plainCustomResponseHeaders", "d", "plainRequestBodyAttributes", "getRequestBodyAttributes", "v", "requestBodyAttributes", "e", "plainResponseBodyAttributes", "getResponseBodyAttributes", "y", "responseBodyAttributes", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: d9.p  reason: case insensitive filesystem */
public final class C7770p {

    /* renamed from: b  reason: collision with root package name */
    public static final a f50813b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final M.a f50814a;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ld9/p$a;", "", "<init>", "()V", "Ld9/M$a;", "builder", "Ld9/p;", "a", "(Ld9/M$a;)Ld9/p;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: d9.p$a */
    public static final class a {
        private a() {
        }

        public final /* synthetic */ C7770p a(M.a aVar) {
            C17542s.j(aVar, "builder");
            return new C7770p(aVar, (DefaultConstructorMarker) null);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private C7770p(M.a aVar) {
        this.f50814a = aVar;
    }

    public final void A(String str) {
        C17542s.j(str, "value");
        this.f50814a.g0(str);
    }

    public final void B(int i10) {
        this.f50814a.h0(i10);
    }

    public final void C(long j10) {
        this.f50814a.i0(j10);
    }

    public final void D(String str) {
        C17542s.j(str, "value");
        this.f50814a.j0(str);
    }

    public final /* synthetic */ M a() {
        GeneratedMessageLite o10 = this.f50814a.g();
        C17542s.i(o10, "_builder.build()");
        return (M) o10;
    }

    public final /* synthetic */ C9899b b() {
        Map<String, String> E10 = this.f50814a.E();
        C17542s.i(E10, "_builder.getPlainCustomRequestHeadersMap()");
        return new C9899b(E10);
    }

    public final /* synthetic */ C9899b c() {
        Map<String, String> G10 = this.f50814a.G();
        C17542s.i(G10, "_builder.getPlainCustomResponseHeadersMap()");
        return new C9899b(G10);
    }

    public final /* synthetic */ C9899b d() {
        Map<String, String> H10 = this.f50814a.H();
        C17542s.i(H10, "_builder.getPlainRequestBodyAttributesMap()");
        return new C9899b(H10);
    }

    public final /* synthetic */ C9899b e() {
        Map<String, String> I10 = this.f50814a.I();
        C17542s.i(I10, "_builder.getPlainResponseBodyAttributesMap()");
        return new C9899b(I10);
    }

    public final /* synthetic */ C9899b f() {
        Map<String, String> K10 = this.f50814a.K();
        C17542s.i(K10, "_builder.getStandardRequestHeadersMap()");
        return new C9899b(K10);
    }

    public final /* synthetic */ C9899b g() {
        Map<String, String> L10 = this.f50814a.L();
        C17542s.i(L10, "_builder.getStandardResponseHeadersMap()");
        return new C9899b(L10);
    }

    public final /* synthetic */ void h(C9899b bVar, Map map) {
        C17542s.j(bVar, "<this>");
        C17542s.j(map, "map");
        this.f50814a.M(map);
    }

    public final /* synthetic */ void i(C9899b bVar, Map map) {
        C17542s.j(bVar, "<this>");
        C17542s.j(map, "map");
        this.f50814a.N(map);
    }

    public final /* synthetic */ void j(C9899b bVar, Map map) {
        C17542s.j(bVar, "<this>");
        C17542s.j(map, "map");
        this.f50814a.O(map);
    }

    public final /* synthetic */ void k(C9899b bVar, Map map) {
        C17542s.j(bVar, "<this>");
        C17542s.j(map, "map");
        this.f50814a.P(map);
    }

    public final /* synthetic */ void l(C9899b bVar, Map map) {
        C17542s.j(bVar, "<this>");
        C17542s.j(map, "map");
        this.f50814a.Q(map);
    }

    public final /* synthetic */ void m(C9899b bVar, Map map) {
        C17542s.j(bVar, "<this>");
        C17542s.j(map, "map");
        this.f50814a.R(map);
    }

    public final void n(C9575h hVar) {
        C17542s.j(hVar, "value");
        this.f50814a.S(hVar);
    }

    public final void o(C9575h hVar) {
        C17542s.j(hVar, "value");
        this.f50814a.T(hVar);
    }

    public final void p(C9575h hVar) {
        C17542s.j(hVar, "value");
        this.f50814a.V(hVar);
    }

    public final void q(long j10) {
        this.f50814a.W(j10);
    }

    public final void r(String str) {
        C17542s.j(str, "value");
        this.f50814a.X(str);
    }

    public final void s(C9575h hVar) {
        C17542s.j(hVar, "value");
        this.f50814a.Y(hVar);
    }

    public final void t(C9575h hVar) {
        C17542s.j(hVar, "value");
        this.f50814a.Z(hVar);
    }

    public final void u(C9575h hVar) {
        C17542s.j(hVar, "value");
        this.f50814a.a0(hVar);
    }

    public final void v(C9575h hVar) {
        C17542s.j(hVar, "value");
        this.f50814a.b0(hVar);
    }

    public final void w(long j10) {
        this.f50814a.c0(j10);
    }

    public final void x(C9575h hVar) {
        C17542s.j(hVar, "value");
        this.f50814a.d0(hVar);
    }

    public final void y(C9575h hVar) {
        C17542s.j(hVar, "value");
        this.f50814a.e0(hVar);
    }

    public final void z(long j10) {
        this.f50814a.f0(j10);
    }

    public /* synthetic */ C7770p(M.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }
}
