package GK;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\b&\u0018\u0000 L2\u00020\u0001:\u0002IJB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001f\u0010\bJ!\u0010\"\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#J1\u0010&\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u000e2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'J9\u0010*\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u000e2\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u001f\u00100\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b0\u0010/J\u0017\u00101\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b1\u0010\bJ\u001f\u00104\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b6\u0010\bJ\u001f\u00109\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:J\u001f\u0010;\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b=\u0010\bJ\u001f\u0010@\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\bB\u0010\bJ\u001f\u0010C\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\bC\u0010:J\u001f\u0010D\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\bD\u0010<J\u0017\u0010E\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\bE\u0010\bJ\u001f\u0010F\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\bF\u0010<J\u0017\u0010G\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\bG\u0010\bJ\u001f\u0010H\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\bH\u0010AJ\u001f\u0010I\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\bI\u0010AJ\u0017\u0010J\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\bJ\u0010\bJ\u001f\u0010L\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010K\u001a\u00020>H\u0016¢\u0006\u0004\bL\u0010A¨\u0006M"}, d2 = {"LGK/r;", "", "<init>", "()V", "LGK/e;", "call", "LXH/N;", "f", "(LGK/e;)V", "LGK/v;", "url", "p", "(LGK/e;LGK/v;)V", "", "Ljava/net/Proxy;", "proxies", "o", "(LGK/e;LGK/v;Ljava/util/List;)V", "", "domainName", "n", "(LGK/e;Ljava/lang/String;)V", "Ljava/net/InetAddress;", "inetAddressList", "m", "(LGK/e;Ljava/lang/String;Ljava/util/List;)V", "Ljava/net/InetSocketAddress;", "inetSocketAddress", "proxy", "j", "(LGK/e;Ljava/net/InetSocketAddress;Ljava/net/Proxy;)V", "C", "LGK/t;", "handshake", "B", "(LGK/e;LGK/t;)V", "LGK/A;", "protocol", "h", "(LGK/e;Ljava/net/InetSocketAddress;Ljava/net/Proxy;LGK/A;)V", "Ljava/io/IOException;", "ioe", "i", "(LGK/e;Ljava/net/InetSocketAddress;Ljava/net/Proxy;LGK/A;Ljava/io/IOException;)V", "LGK/j;", "connection", "k", "(LGK/e;LGK/j;)V", "l", "u", "LGK/B;", "request", "t", "(LGK/e;LGK/B;)V", "r", "", "byteCount", "q", "(LGK/e;J)V", "s", "(LGK/e;Ljava/io/IOException;)V", "z", "LGK/D;", "response", "y", "(LGK/e;LGK/D;)V", "w", "v", "x", "d", "e", "g", "A", "b", "c", "cachedResponse", "a", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: GK.r  reason: case insensitive filesystem */
public abstract class C15799r {

    /* renamed from: a  reason: collision with root package name */
    public static final b f135089a = new b((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    public static final C15799r f135090b = new a();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"GK/r$a", "LGK/r;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: GK.r$a */
    public static final class a extends C15799r {
        a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LGK/r$b;", "", "<init>", "()V", "LGK/r;", "NONE", "LGK/r;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: GK.r$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LGK/r$c;", "", "LGK/e;", "call", "LGK/r;", "a", "(LGK/e;)LGK/r;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: GK.r$c */
    public interface c {
        C15799r a(C15786e eVar);
    }

    public void A(C15786e eVar, C15776D d10) {
        C17542s.j(eVar, "call");
        C17542s.j(d10, "response");
    }

    public void B(C15786e eVar, C15801t tVar) {
        C17542s.j(eVar, "call");
    }

    public void C(C15786e eVar) {
        C17542s.j(eVar, "call");
    }

    public void a(C15786e eVar, C15776D d10) {
        C17542s.j(eVar, "call");
        C17542s.j(d10, "cachedResponse");
    }

    public void b(C15786e eVar, C15776D d10) {
        C17542s.j(eVar, "call");
        C17542s.j(d10, "response");
    }

    public void c(C15786e eVar) {
        C17542s.j(eVar, "call");
    }

    public void d(C15786e eVar) {
        C17542s.j(eVar, "call");
    }

    public void e(C15786e eVar, IOException iOException) {
        C17542s.j(eVar, "call");
        C17542s.j(iOException, "ioe");
    }

    public void f(C15786e eVar) {
        C17542s.j(eVar, "call");
    }

    public void g(C15786e eVar) {
        C17542s.j(eVar, "call");
    }

    public void h(C15786e eVar, InetSocketAddress inetSocketAddress, Proxy proxy, C15773A a10) {
        C17542s.j(eVar, "call");
        C17542s.j(inetSocketAddress, "inetSocketAddress");
        C17542s.j(proxy, "proxy");
    }

    public void i(C15786e eVar, InetSocketAddress inetSocketAddress, Proxy proxy, C15773A a10, IOException iOException) {
        C17542s.j(eVar, "call");
        C17542s.j(inetSocketAddress, "inetSocketAddress");
        C17542s.j(proxy, "proxy");
        C17542s.j(iOException, "ioe");
    }

    public void j(C15786e eVar, InetSocketAddress inetSocketAddress, Proxy proxy) {
        C17542s.j(eVar, "call");
        C17542s.j(inetSocketAddress, "inetSocketAddress");
        C17542s.j(proxy, "proxy");
    }

    public void k(C15786e eVar, C15791j jVar) {
        C17542s.j(eVar, "call");
        C17542s.j(jVar, "connection");
    }

    public void l(C15786e eVar, C15791j jVar) {
        C17542s.j(eVar, "call");
        C17542s.j(jVar, "connection");
    }

    public void m(C15786e eVar, String str, List<InetAddress> list) {
        C17542s.j(eVar, "call");
        C17542s.j(str, "domainName");
        C17542s.j(list, "inetAddressList");
    }

    public void n(C15786e eVar, String str) {
        C17542s.j(eVar, "call");
        C17542s.j(str, "domainName");
    }

    public void o(C15786e eVar, C15803v vVar, List<Proxy> list) {
        C17542s.j(eVar, "call");
        C17542s.j(vVar, "url");
        C17542s.j(list, "proxies");
    }

    public void p(C15786e eVar, C15803v vVar) {
        C17542s.j(eVar, "call");
        C17542s.j(vVar, "url");
    }

    public void q(C15786e eVar, long j10) {
        C17542s.j(eVar, "call");
    }

    public void r(C15786e eVar) {
        C17542s.j(eVar, "call");
    }

    public void s(C15786e eVar, IOException iOException) {
        C17542s.j(eVar, "call");
        C17542s.j(iOException, "ioe");
    }

    public void t(C15786e eVar, C15774B b10) {
        C17542s.j(eVar, "call");
        C17542s.j(b10, "request");
    }

    public void u(C15786e eVar) {
        C17542s.j(eVar, "call");
    }

    public void v(C15786e eVar, long j10) {
        C17542s.j(eVar, "call");
    }

    public void w(C15786e eVar) {
        C17542s.j(eVar, "call");
    }

    public void x(C15786e eVar, IOException iOException) {
        C17542s.j(eVar, "call");
        C17542s.j(iOException, "ioe");
    }

    public void y(C15786e eVar, C15776D d10) {
        C17542s.j(eVar, "call");
        C17542s.j(d10, "response");
    }

    public void z(C15786e eVar) {
        C17542s.j(eVar, "call");
    }
}
