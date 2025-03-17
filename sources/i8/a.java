package I8;

import HJ.C15838d;
import HJ.C15850p;
import HJ.C15852r;
import XH.C16796C;
import YH.X;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0005\u0010\u0014R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\f\u0010\u001a¨\u0006\u001c"}, d2 = {"LI8/a;", "", "<init>", "()V", "", "b", "[B", "d", "()[B", "SUPPRESSED_MESSAGE_MARKER", "", "", "c", "Ljava/util/Map;", "e", "()Ljava/util/Map;", "TRUNCATED_MAP", "LHJ/p;", "LHJ/p;", "a", "()LHJ/p;", "EMAIL_REGEX", "FAST_LOOKUP_EMAIL_REGEX", "", "f", "[Ljava/lang/String;", "()[Ljava/lang/String;", "STANDARD_HEADERS_MAP", "error-analysis_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f37083a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f37084b;

    /* renamed from: c  reason: collision with root package name */
    private static final Map<String, String> f37085c = X.f(C16796C.a("…", "…"));

    /* renamed from: d  reason: collision with root package name */
    private static final C15850p f37086d;

    /* renamed from: e  reason: collision with root package name */
    private static final C15850p f37087e;

    /* renamed from: f  reason: collision with root package name */
    private static final String[] f37088f = {"Age", "Cache-Control", "Clear-Site-Data", "Expires", "Pragma", "Warning", "Downlink", "ECT", "RTT", "Last-Modified", "Connection", "Keep-Alive", "Accept", "Accept-Encoding", "Accept-Language", "Expect", "Access-Control-Allow-Origin", "Access-Control-Allow-Credentials", "Access-Control-Allow-Headers", "Access-Control-Allow-Methods", "Access-Control-Expose-Headers", "Access-Control-Max-Age", "Access-Control-Request-Headers", "Access-Control-Request-Method", "Origin", "Timing-Allow-Origin", "Content-Length", "Content-Type", "Content-Encoding", "Content-Language", "Via", "Host", "Referrer-Policy", "User-Agent", "Allow", "Server", "Accept-Ranges", "Range", "If-Range", "Content-Range", "Cross-Origin-Embedder-Policy", "Cross-Origin-Opener-Policy", "Cross-Origin-Resource-Policy", "Content-Security-Policy", "Content-Security-Policy-Report-Only", "Expect-CT", "Feature-Policy", "Strict-Transport-Policy", "Upgrade-Insecure-Requests", "X-Content-Type-Options", "X-Download-Options", "X-Frame-Options", "X-Permitted-Cross-Domain-Policies", "X-Powered-By", "X-XSS-Protection", "Sec_Fetch-Site", "Sec-Fetch-Mode", "Sec-Fetch-User", "Sec-Fetch-Dest"};

    static {
        byte[] bytes = "…".getBytes(C15838d.f135279b);
        C17542s.i(bytes, "this as java.lang.String).getBytes(charset)");
        f37084b = bytes;
        C15852r rVar = C15852r.IGNORE_CASE;
        f37086d = new C15850p("[a-zA-Z0-9._%+-]+(?:@|%40)[a-zA-Z0-9.%+-]+", rVar);
        f37087e = new C15850p("[a-zA-Z0-9+_-](?:@|%40)", rVar);
    }

    private a() {
    }

    public final C15850p a() {
        return f37086d;
    }

    public final C15850p b() {
        return f37087e;
    }

    public final String[] c() {
        return f37088f;
    }

    public final byte[] d() {
        return f37084b;
    }

    public final Map<String, String> e() {
        return f37085c;
    }
}
