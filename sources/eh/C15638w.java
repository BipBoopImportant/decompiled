package EH;

import YH.C16877v;
import YH.X;
import com.adjust.sdk.Constants;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutActivity;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tI.C17978n;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\t¨\u0006\u001a"}, d2 = {"LEH/w;", "", "", "value", "", "description", "<init>", "(ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "w0", "(LEH/w;)I", "a", "I", "x0", "b", "Ljava/lang/String;", "getDescription", "c", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: EH.w  reason: case insensitive filesystem */
public final class C15638w implements Comparable<C15638w> {
    /* access modifiers changed from: private */

    /* renamed from: A  reason: collision with root package name */
    public static final C15638w f134159A = new C15638w(403, "Forbidden");
    /* access modifiers changed from: private */

    /* renamed from: A0  reason: collision with root package name */
    public static final C15638w f134160A0 = new C15638w(504, "Gateway Timeout");
    /* access modifiers changed from: private */

    /* renamed from: B  reason: collision with root package name */
    public static final C15638w f134161B = new C15638w(404, "Not Found");
    /* access modifiers changed from: private */

    /* renamed from: B0  reason: collision with root package name */
    public static final C15638w f134162B0 = new C15638w(505, "HTTP Version Not Supported");
    /* access modifiers changed from: private */

    /* renamed from: C  reason: collision with root package name */
    public static final C15638w f134163C = new C15638w(405, "Method Not Allowed");
    /* access modifiers changed from: private */

    /* renamed from: C0  reason: collision with root package name */
    public static final C15638w f134164C0 = new C15638w(506, "Variant Also Negotiates");
    /* access modifiers changed from: private */

    /* renamed from: D  reason: collision with root package name */
    public static final C15638w f134165D = new C15638w(406, "Not Acceptable");
    /* access modifiers changed from: private */

    /* renamed from: D0  reason: collision with root package name */
    public static final C15638w f134166D0 = new C15638w(507, "Insufficient Storage");
    /* access modifiers changed from: private */

    /* renamed from: E  reason: collision with root package name */
    public static final C15638w f134167E = new C15638w(407, "Proxy Authentication Required");

    /* renamed from: E0  reason: collision with root package name */
    private static final List<C15638w> f134168E0;
    /* access modifiers changed from: private */

    /* renamed from: F  reason: collision with root package name */
    public static final C15638w f134169F = new C15638w(408, "Request Timeout");

    /* renamed from: F0  reason: collision with root package name */
    private static final Map<Integer, C15638w> f134170F0;
    /* access modifiers changed from: private */

    /* renamed from: G  reason: collision with root package name */
    public static final C15638w f134171G = new C15638w(409, "Conflict");
    /* access modifiers changed from: private */

    /* renamed from: H  reason: collision with root package name */
    public static final C15638w f134172H = new C15638w(410, "Gone");
    /* access modifiers changed from: private */

    /* renamed from: I  reason: collision with root package name */
    public static final C15638w f134173I = new C15638w(411, "Length Required");
    /* access modifiers changed from: private */

    /* renamed from: J  reason: collision with root package name */
    public static final C15638w f134174J = new C15638w(412, "Precondition Failed");
    /* access modifiers changed from: private */

    /* renamed from: K  reason: collision with root package name */
    public static final C15638w f134175K = new C15638w(413, "Payload Too Large");
    /* access modifiers changed from: private */

    /* renamed from: L  reason: collision with root package name */
    public static final C15638w f134176L = new C15638w(414, "Request-URI Too Long");
    /* access modifiers changed from: private */

    /* renamed from: M  reason: collision with root package name */
    public static final C15638w f134177M = new C15638w(415, "Unsupported Media Type");
    /* access modifiers changed from: private */

    /* renamed from: N  reason: collision with root package name */
    public static final C15638w f134178N = new C15638w(416, "Requested Range Not Satisfiable");
    /* access modifiers changed from: private */

    /* renamed from: O  reason: collision with root package name */
    public static final C15638w f134179O = new C15638w(417, "Expectation Failed");
    /* access modifiers changed from: private */

    /* renamed from: P  reason: collision with root package name */
    public static final C15638w f134180P = new C15638w(422, "Unprocessable Entity");
    /* access modifiers changed from: private */

    /* renamed from: Q  reason: collision with root package name */
    public static final C15638w f134181Q = new C15638w(423, "Locked");
    /* access modifiers changed from: private */

    /* renamed from: R  reason: collision with root package name */
    public static final C15638w f134182R = new C15638w(424, "Failed Dependency");
    /* access modifiers changed from: private */

    /* renamed from: S  reason: collision with root package name */
    public static final C15638w f134183S = new C15638w(425, "Too Early");
    /* access modifiers changed from: private */

    /* renamed from: T  reason: collision with root package name */
    public static final C15638w f134184T = new C15638w(426, "Upgrade Required");
    /* access modifiers changed from: private */

    /* renamed from: U  reason: collision with root package name */
    public static final C15638w f134185U = new C15638w(429, "Too Many Requests");
    /* access modifiers changed from: private */

    /* renamed from: X  reason: collision with root package name */
    public static final C15638w f134186X = new C15638w(431, "Request Header Fields Too Large");
    /* access modifiers changed from: private */

    /* renamed from: Y  reason: collision with root package name */
    public static final C15638w f134187Y = new C15638w(500, "Internal Server Error");
    /* access modifiers changed from: private */

    /* renamed from: Z  reason: collision with root package name */
    public static final C15638w f134188Z = new C15638w(501, "Not Implemented");

    /* renamed from: c  reason: collision with root package name */
    public static final a f134189c = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final C15638w f134190d = new C15638w(100, "Continue");
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final C15638w f134191e = new C15638w(CheckoutActivity.RESULT_CANCELED, "Switching Protocols");
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final C15638w f134192f = new C15638w(CheckoutActivity.RESULT_ERROR, "Processing");
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final C15638w f134193g = new C15638w(200, "OK");
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final C15638w f134194h = new C15638w(201, "Created");
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final C15638w f134195i = new C15638w(202, "Accepted");
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final C15638w f134196j = new C15638w(203, "Non-Authoritative Information");
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final C15638w f134197k = new C15638w(204, "No Content");
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static final C15638w f134198l = new C15638w(205, "Reset Content");
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final C15638w f134199m = new C15638w(206, "Partial Content");
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public static final C15638w f134200n = new C15638w(207, "Multi-Status");
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public static final C15638w f134201o = new C15638w(300, "Multiple Choices");
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public static final C15638w f134202p = new C15638w(301, "Moved Permanently");
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public static final C15638w f134203q = new C15638w(302, "Found");
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public static final C15638w f134204r = new C15638w(303, "See Other");
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public static final C15638w f134205s = new C15638w(304, "Not Modified");
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public static final C15638w f134206t = new C15638w(305, "Use Proxy");
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public static final C15638w f134207u = new C15638w(306, "Switch Proxy");
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public static final C15638w f134208v = new C15638w(307, "Temporary Redirect");
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public static final C15638w f134209w = new C15638w(308, "Permanent Redirect");
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public static final C15638w f134210x = new C15638w(Constants.MINIMAL_ERROR_STATUS_CODE, "Bad Request");
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public static final C15638w f134211y = new C15638w(401, "Unauthorized");
    /* access modifiers changed from: private */

    /* renamed from: y0  reason: collision with root package name */
    public static final C15638w f134212y0 = new C15638w(502, "Bad Gateway");
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public static final C15638w f134213z = new C15638w(402, "Payment Required");
    /* access modifiers changed from: private */

    /* renamed from: z0  reason: collision with root package name */
    public static final C15638w f134214z0 = new C15638w(503, "Service Unavailable");

    /* renamed from: a  reason: collision with root package name */
    private final int f134215a;

    /* renamed from: b  reason: collision with root package name */
    private final String f134216b;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bl\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u0017\u0010\u001d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u0017\u0010\u001f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\bR\u0017\u0010!\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\bR\u0017\u0010#\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b$\u0010\bR\u0017\u0010%\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\bR\u0017\u0010'\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b(\u0010\bR\u0017\u0010)\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010\u0006\u001a\u0004\b*\u0010\bR\u0017\u0010+\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\bR\u0017\u0010-\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010\u0006\u001a\u0004\b.\u0010\bR\u0017\u0010/\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u0010\u0006\u001a\u0004\b0\u0010\bR\u0017\u00101\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b2\u0010\bR\u0017\u00103\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u0010\u0006\u001a\u0004\b4\u0010\bR\u0017\u00105\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b5\u0010\u0006\u001a\u0004\b6\u0010\bR\u0017\u00107\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b7\u0010\u0006\u001a\u0004\b8\u0010\bR\u0017\u00109\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b9\u0010\u0006\u001a\u0004\b:\u0010\bR\u0017\u0010;\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b;\u0010\u0006\u001a\u0004\b<\u0010\bR\u0017\u0010=\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b=\u0010\u0006\u001a\u0004\b>\u0010\bR\u0017\u0010?\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b?\u0010\u0006\u001a\u0004\b@\u0010\bR\u0017\u0010A\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bA\u0010\u0006\u001a\u0004\bB\u0010\bR\u0017\u0010C\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bC\u0010\u0006\u001a\u0004\bD\u0010\bR\u0017\u0010E\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bE\u0010\u0006\u001a\u0004\bF\u0010\bR\u0017\u0010G\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bG\u0010\u0006\u001a\u0004\bH\u0010\bR\u0017\u0010I\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bI\u0010\u0006\u001a\u0004\bJ\u0010\bR\u0017\u0010K\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bK\u0010\u0006\u001a\u0004\bL\u0010\bR\u0017\u0010M\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bM\u0010\u0006\u001a\u0004\bN\u0010\bR\u0017\u0010O\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bO\u0010\u0006\u001a\u0004\bP\u0010\bR\u0017\u0010Q\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bQ\u0010\u0006\u001a\u0004\bR\u0010\bR\u0017\u0010S\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bS\u0010\u0006\u001a\u0004\bT\u0010\bR\u0017\u0010U\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bU\u0010\u0006\u001a\u0004\bV\u0010\bR\u0017\u0010W\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bW\u0010\u0006\u001a\u0004\bX\u0010\bR\u0017\u0010Y\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bY\u0010\u0006\u001a\u0004\bZ\u0010\bR\u0017\u0010[\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b[\u0010\u0006\u001a\u0004\b\\\u0010\bR\u0017\u0010]\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b]\u0010\u0006\u001a\u0004\b^\u0010\bR\u0017\u0010_\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b_\u0010\u0006\u001a\u0004\b`\u0010\bR\u0017\u0010a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\ba\u0010\u0006\u001a\u0004\bb\u0010\bR\u0017\u0010c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bc\u0010\u0006\u001a\u0004\bd\u0010\bR\u0017\u0010e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\be\u0010\u0006\u001a\u0004\bf\u0010\bR\u0017\u0010g\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bg\u0010\u0006\u001a\u0004\bh\u0010\bR\u0017\u0010i\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bi\u0010\u0006\u001a\u0004\bj\u0010\bR\u0017\u0010k\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bk\u0010\u0006\u001a\u0004\bl\u0010\bR\u0017\u0010m\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bm\u0010\u0006\u001a\u0004\bn\u0010\bR\u0017\u0010o\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bo\u0010\u0006\u001a\u0004\bp\u0010\bR \u0010s\u001a\u000e\u0012\u0004\u0012\u00020r\u0012\u0004\u0012\u00020\u00040q8\u0002X\u0004¢\u0006\u0006\n\u0004\bs\u0010t¨\u0006u"}, d2 = {"LEH/w$a;", "", "<init>", "()V", "LEH/w;", "Continue", "LEH/w;", "e", "()LEH/w;", "SwitchingProtocols", "Q", "Processing", "G", "OK", "A", "Created", "f", "Accepted", "a", "NonAuthoritativeInformation", "v", "NoContent", "u", "ResetContent", "M", "PartialContent", "B", "MultiStatus", "s", "MultipleChoices", "t", "MovedPermanently", "r", "Found", "j", "SeeOther", "N", "NotModified", "z", "UseProxy", "Y", "SwitchProxy", "P", "TemporaryRedirect", "R", "PermanentRedirect", "E", "BadRequest", "c", "Unauthorized", "U", "PaymentRequired", "D", "Forbidden", "i", "NotFound", "x", "MethodNotAllowed", "q", "NotAcceptable", "w", "ProxyAuthenticationRequired", "H", "RequestTimeout", "J", "Conflict", "d", "Gone", "l", "LengthRequired", "o", "PreconditionFailed", "F", "PayloadTooLarge", "C", "RequestURITooLong", "K", "UnsupportedMediaType", "W", "RequestedRangeNotSatisfiable", "L", "ExpectationFailed", "g", "UnprocessableEntity", "V", "Locked", "p", "FailedDependency", "h", "TooEarly", "S", "UpgradeRequired", "X", "TooManyRequests", "T", "RequestHeaderFieldTooLarge", "I", "InternalServerError", "n", "NotImplemented", "y", "BadGateway", "b", "ServiceUnavailable", "O", "GatewayTimeout", "k", "VersionNotSupported", "a0", "VariantAlsoNegotiates", "Z", "InsufficientStorage", "m", "", "", "statusCodesMap", "Ljava/util/Map;", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: EH.w$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C15638w A() {
            return C15638w.f134193g;
        }

        public final C15638w B() {
            return C15638w.f134199m;
        }

        public final C15638w C() {
            return C15638w.f134175K;
        }

        public final C15638w D() {
            return C15638w.f134213z;
        }

        public final C15638w E() {
            return C15638w.f134209w;
        }

        public final C15638w F() {
            return C15638w.f134174J;
        }

        public final C15638w G() {
            return C15638w.f134192f;
        }

        public final C15638w H() {
            return C15638w.f134167E;
        }

        public final C15638w I() {
            return C15638w.f134186X;
        }

        public final C15638w J() {
            return C15638w.f134169F;
        }

        public final C15638w K() {
            return C15638w.f134176L;
        }

        public final C15638w L() {
            return C15638w.f134178N;
        }

        public final C15638w M() {
            return C15638w.f134198l;
        }

        public final C15638w N() {
            return C15638w.f134204r;
        }

        public final C15638w O() {
            return C15638w.f134214z0;
        }

        public final C15638w P() {
            return C15638w.f134207u;
        }

        public final C15638w Q() {
            return C15638w.f134191e;
        }

        public final C15638w R() {
            return C15638w.f134208v;
        }

        public final C15638w S() {
            return C15638w.f134183S;
        }

        public final C15638w T() {
            return C15638w.f134185U;
        }

        public final C15638w U() {
            return C15638w.f134211y;
        }

        public final C15638w V() {
            return C15638w.f134180P;
        }

        public final C15638w W() {
            return C15638w.f134177M;
        }

        public final C15638w X() {
            return C15638w.f134184T;
        }

        public final C15638w Y() {
            return C15638w.f134206t;
        }

        public final C15638w Z() {
            return C15638w.f134164C0;
        }

        public final C15638w a() {
            return C15638w.f134195i;
        }

        public final C15638w a0() {
            return C15638w.f134162B0;
        }

        public final C15638w b() {
            return C15638w.f134212y0;
        }

        public final C15638w c() {
            return C15638w.f134210x;
        }

        public final C15638w d() {
            return C15638w.f134171G;
        }

        public final C15638w e() {
            return C15638w.f134190d;
        }

        public final C15638w f() {
            return C15638w.f134194h;
        }

        public final C15638w g() {
            return C15638w.f134179O;
        }

        public final C15638w h() {
            return C15638w.f134182R;
        }

        public final C15638w i() {
            return C15638w.f134159A;
        }

        public final C15638w j() {
            return C15638w.f134203q;
        }

        public final C15638w k() {
            return C15638w.f134160A0;
        }

        public final C15638w l() {
            return C15638w.f134172H;
        }

        public final C15638w m() {
            return C15638w.f134166D0;
        }

        public final C15638w n() {
            return C15638w.f134187Y;
        }

        public final C15638w o() {
            return C15638w.f134173I;
        }

        public final C15638w p() {
            return C15638w.f134181Q;
        }

        public final C15638w q() {
            return C15638w.f134163C;
        }

        public final C15638w r() {
            return C15638w.f134202p;
        }

        public final C15638w s() {
            return C15638w.f134200n;
        }

        public final C15638w t() {
            return C15638w.f134201o;
        }

        public final C15638w u() {
            return C15638w.f134197k;
        }

        public final C15638w v() {
            return C15638w.f134196j;
        }

        public final C15638w w() {
            return C15638w.f134165D;
        }

        public final C15638w x() {
            return C15638w.f134161B;
        }

        public final C15638w y() {
            return C15638w.f134188Z;
        }

        public final C15638w z() {
            return C15638w.f134205s;
        }

        private a() {
        }
    }

    static {
        List<C15638w> a10 = C15639x.a();
        f134168E0 = a10;
        Iterable iterable = a10;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C17978n.e(X.e(C16877v.y(iterable, 10)), 16));
        for (Object next : iterable) {
            linkedHashMap.put(Integer.valueOf(((C15638w) next).f134215a), next);
        }
        f134170F0 = linkedHashMap;
    }

    public C15638w(int i10, String str) {
        C17542s.j(str, "description");
        this.f134215a = i10;
        this.f134216b = str;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C15638w) && ((C15638w) obj).f134215a == this.f134215a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f134215a);
    }

    public String toString() {
        return this.f134215a + ' ' + this.f134216b;
    }

    /* renamed from: w0 */
    public int compareTo(C15638w wVar) {
        C17542s.j(wVar, "other");
        return this.f134215a - wVar.f134215a;
    }

    public final int x0() {
        return this.f134215a;
    }
}
