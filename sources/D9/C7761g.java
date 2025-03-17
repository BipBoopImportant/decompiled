package d9;

import com.google.protobuf.GeneratedMessageLite;
import d9.F;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR$\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8G@GX\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00118G@GX\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00178G@GX\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\"\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\u001d8G@GX\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010(\u001a\u00020#2\u0006\u0010\u000b\u001a\u00020#8G@GX\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010.\u001a\u00020)2\u0006\u0010\u000b\u001a\u00020)8G@GX\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u00104\u001a\u00020/2\u0006\u0010\u000b\u001a\u00020/8G@GX\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u0010:\u001a\u0002052\u0006\u0010\u000b\u001a\u0002058G@GX\u000e¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010@\u001a\u00020;2\u0006\u0010\u000b\u001a\u00020;8G@GX\u000e¢\u0006\f\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010F\u001a\u00020A2\u0006\u0010\u000b\u001a\u00020A8G@GX\u000e¢\u0006\f\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER$\u0010L\u001a\u00020G2\u0006\u0010\u000b\u001a\u00020G8G@GX\u000e¢\u0006\f\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR$\u0010R\u001a\u00020M2\u0006\u0010\u000b\u001a\u00020M8G@GX\u000e¢\u0006\f\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR$\u0010X\u001a\u00020S2\u0006\u0010\u000b\u001a\u00020S8G@GX\u000e¢\u0006\f\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR$\u0010^\u001a\u00020Y2\u0006\u0010\u000b\u001a\u00020Y8G@GX\u000e¢\u0006\f\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R$\u0010d\u001a\u00020_2\u0006\u0010\u000b\u001a\u00020_8G@GX\u000e¢\u0006\f\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR$\u0010j\u001a\u00020e2\u0006\u0010\u000b\u001a\u00020e8G@GX\u000e¢\u0006\f\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR$\u0010p\u001a\u00020k2\u0006\u0010\u000b\u001a\u00020k8G@GX\u000e¢\u0006\f\u001a\u0004\bl\u0010m\"\u0004\bn\u0010o¨\u0006q"}, d2 = {"Ld9/g;", "", "Ld9/F$a;", "_builder", "<init>", "(Ld9/F$a;)V", "Ld9/F;", "a", "()Ld9/F;", "Ld9/F$a;", "Ld9/J;", "value", "getInsertionMutation", "()Ld9/J;", "h", "(Ld9/J;)V", "insertionMutation", "Ld9/U;", "getRemovalMutation", "()Ld9/U;", "n", "(Ld9/U;)V", "removalMutation", "Ld9/W;", "getStyleMutation", "()Ld9/W;", "p", "(Ld9/W;)V", "styleMutation", "Ld9/X;", "getTouchGesture", "()Ld9/X;", "q", "(Ld9/X;)V", "touchGesture", "Ld9/y;", "getAppStateChange", "()Ld9/y;", "b", "(Ld9/y;)V", "appStateChange", "Ld9/V;", "getScreenView", "()Ld9/V;", "o", "(Ld9/V;)V", "screenView", "Ld9/D;", "getEndOfScreenView", "()Ld9/D;", "f", "(Ld9/D;)V", "endOfScreenView", "Ld9/S;", "getRecordingStart", "()Ld9/S;", "m", "(Ld9/S;)V", "recordingStart", "Ld9/P;", "getQualitySettingsApplied", "()Ld9/P;", "l", "(Ld9/P;)V", "qualitySettingsApplied", "Ld9/M;", "getNetworkRequestMetric", "()Ld9/M;", "j", "(Ld9/M;)V", "networkRequestMetric", "Ld9/d0;", "getWebviewEvent", "()Ld9/d0;", "r", "(Ld9/d0;)V", "webviewEvent", "Ld9/O;", "getOnlineAssets", "()Ld9/O;", "k", "(Ld9/O;)V", "onlineAssets", "Ld9/H;", "getGesture", "()Ld9/H;", "g", "(Ld9/H;)V", "gesture", "Ld9/B;", "getCrash", "()Ld9/B;", "d", "(Ld9/B;)V", "crash", "Ld9/A;", "getAssetHashes", "()Ld9/A;", "c", "(Ld9/A;)V", "assetHashes", "Ld9/K;", "getJsError", "()Ld9/K;", "i", "(Ld9/K;)V", "jsError", "Ld9/C;", "getCustomError", "()Ld9/C;", "e", "(Ld9/C;)V", "customError", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: d9.g  reason: case insensitive filesystem */
public final class C7761g {

    /* renamed from: b  reason: collision with root package name */
    public static final a f50784b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final F.a f50785a;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ld9/g$a;", "", "<init>", "()V", "Ld9/F$a;", "builder", "Ld9/g;", "a", "(Ld9/F$a;)Ld9/g;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: d9.g$a */
    public static final class a {
        private a() {
        }

        public final /* synthetic */ C7761g a(F.a aVar) {
            C17542s.j(aVar, "builder");
            return new C7761g(aVar, (DefaultConstructorMarker) null);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private C7761g(F.a aVar) {
        this.f50785a = aVar;
    }

    public final /* synthetic */ F a() {
        GeneratedMessageLite o10 = this.f50785a.g();
        C17542s.i(o10, "_builder.build()");
        return (F) o10;
    }

    public final void b(C7778y yVar) {
        C17542s.j(yVar, "value");
        this.f50785a.E(yVar);
    }

    public final void c(C7753A a10) {
        C17542s.j(a10, "value");
        this.f50785a.G(a10);
    }

    public final void d(C7754B b10) {
        C17542s.j(b10, "value");
        this.f50785a.H(b10);
    }

    public final void e(C c10) {
        C17542s.j(c10, "value");
        this.f50785a.I(c10);
    }

    public final void f(D d10) {
        C17542s.j(d10, "value");
        this.f50785a.K(d10);
    }

    public final void g(H h10) {
        C17542s.j(h10, "value");
        this.f50785a.L(h10);
    }

    public final void h(J j10) {
        C17542s.j(j10, "value");
        this.f50785a.M(j10);
    }

    public final void i(K k10) {
        C17542s.j(k10, "value");
        this.f50785a.N(k10);
    }

    public final void j(M m10) {
        C17542s.j(m10, "value");
        this.f50785a.O(m10);
    }

    public final void k(O o10) {
        C17542s.j(o10, "value");
        this.f50785a.P(o10);
    }

    public final void l(P p10) {
        C17542s.j(p10, "value");
        this.f50785a.Q(p10);
    }

    public final void m(S s10) {
        C17542s.j(s10, "value");
        this.f50785a.R(s10);
    }

    public final void n(U u10) {
        C17542s.j(u10, "value");
        this.f50785a.S(u10);
    }

    public final void o(V v10) {
        C17542s.j(v10, "value");
        this.f50785a.T(v10);
    }

    public final void p(W w10) {
        C17542s.j(w10, "value");
        this.f50785a.V(w10);
    }

    public final void q(X x10) {
        C17542s.j(x10, "value");
        this.f50785a.W(x10);
    }

    public final void r(d0 d0Var) {
        C17542s.j(d0Var, "value");
        this.f50785a.X(d0Var);
    }

    public /* synthetic */ C7761g(F.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }
}
