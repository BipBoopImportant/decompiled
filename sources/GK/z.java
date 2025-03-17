package GK;

import GK.C15780H;
import GK.C15786e;
import GK.C15799r;
import HK.C15864d;
import KK.e;
import LK.h;
import QK.C16354j;
import SK.C16451a;
import TK.C16554c;
import TK.C16555d;
import UK.C16637d;
import UK.C16638e;
import YH.C16877v;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0013\u000eB\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001b\u001a\u00020\u00178G¢\u0006\f\n\u0004\b\u0013\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010 \u001a\u00020\u001c8G¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\"0!8G¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020\"0!8G¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010&R\u0017\u00100\u001a\u00020+8G¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u00106\u001a\u0002018G¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010;\u001a\u0002078G¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b2\u0010:R\u0017\u0010>\u001a\u0002018G¢\u0006\f\n\u0004\b<\u00103\u001a\u0004\b=\u00105R\u0017\u0010A\u001a\u0002018G¢\u0006\f\n\u0004\b?\u00103\u001a\u0004\b@\u00105R\u0017\u0010G\u001a\u00020B8G¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0019\u0010L\u001a\u0004\u0018\u00010H8G¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bC\u0010KR\u0017\u0010R\u001a\u00020M8G¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0019\u0010X\u001a\u0004\u0018\u00010S8G¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0017\u0010^\u001a\u00020Y8G¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u0017\u0010`\u001a\u0002078G¢\u0006\f\n\u0004\b\u001e\u00109\u001a\u0004\b_\u0010:R\u0017\u0010f\u001a\u00020a8G¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\u0016\u0010j\u001a\u0004\u0018\u00010g8\u0002X\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0019\u0010o\u001a\u0004\u0018\u00010k8G¢\u0006\f\n\u0004\bE\u0010l\u001a\u0004\bm\u0010nR\u001d\u0010r\u001a\b\u0012\u0004\u0012\u00020p0!8G¢\u0006\f\n\u0004\bq\u0010$\u001a\u0004\bb\u0010&R\u001d\u0010v\u001a\b\u0012\u0004\u0012\u00020s0!8G¢\u0006\f\n\u0004\bt\u0010$\u001a\u0004\bu\u0010&R\u0017\u0010{\u001a\u00020w8G¢\u0006\f\n\u0004\b\u0019\u0010x\u001a\u0004\by\u0010zR\u0017\u0010\u001a\u00020|8G¢\u0006\f\n\u0004\bP\u0010}\u001a\u0004\bT\u0010~R\u001d\u0010\u0001\u001a\u0005\u0018\u00010\u00018G¢\u0006\u000e\n\u0005\b.\u0010\u0001\u001a\u0005\bN\u0010\u0001R\u001c\u0010\u0001\u001a\u00030\u00018G¢\u0006\u000f\n\u0006\b\u0001\u0010\u0001\u001a\u0005\bI\u0010\u0001R\u001b\u0010\u0001\u001a\u00030\u00018G¢\u0006\u000e\n\u0005\b=\u0010\u0001\u001a\u0005\bZ\u0010\u0001R\u001c\u0010\u0001\u001a\u00030\u00018G¢\u0006\u000f\n\u0005\b@\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u001d\u0010\u0001\u001a\u00030\u00018G¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u001d\u0010\u0001\u001a\u00030\u00018G¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u001c\u0010\u0001\u001a\u00030\u00018G¢\u0006\u000f\n\u0005\by\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u001c\u0010\u0001\u001a\u00030\u00018\u0006¢\u0006\u000f\n\u0005\b%\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u0014\u0010\u0001\u001a\u00020g8G¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001¨\u0006\u0001"}, d2 = {"LGK/z;", "", "LGK/e$a;", "LGK/H$a;", "LGK/z$a;", "builder", "<init>", "(LGK/z$a;)V", "()V", "LXH/N;", "S", "LGK/B;", "request", "LGK/e;", "b", "(LGK/B;)LGK/e;", "LGK/I;", "listener", "LGK/H;", "a", "(LGK/B;LGK/I;)LGK/H;", "H", "()LGK/z$a;", "LGK/p;", "LGK/p;", "u", "()LGK/p;", "dispatcher", "LGK/k;", "LGK/k;", "o", "()LGK/k;", "connectionPool", "", "LGK/w;", "c", "Ljava/util/List;", "D", "()Ljava/util/List;", "interceptors", "d", "G", "networkInterceptors", "LGK/r$c;", "e", "LGK/r$c;", "w", "()LGK/r$c;", "eventListenerFactory", "", "f", "Z", "P", "()Z", "retryOnConnectionFailure", "LGK/b;", "g", "LGK/b;", "()LGK/b;", "authenticator", "h", "y", "followRedirects", "i", "z", "followSslRedirects", "LGK/n;", "j", "LGK/n;", "r", "()LGK/n;", "cookieJar", "LGK/c;", "k", "LGK/c;", "()LGK/c;", "cache", "LGK/q;", "l", "LGK/q;", "v", "()LGK/q;", "dns", "Ljava/net/Proxy;", "m", "Ljava/net/Proxy;", "L", "()Ljava/net/Proxy;", "proxy", "Ljava/net/ProxySelector;", "n", "Ljava/net/ProxySelector;", "N", "()Ljava/net/ProxySelector;", "proxySelector", "M", "proxyAuthenticator", "Ljavax/net/SocketFactory;", "p", "Ljavax/net/SocketFactory;", "Q", "()Ljavax/net/SocketFactory;", "socketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "q", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactoryOrNull", "Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/X509TrustManager;", "V", "()Ljavax/net/ssl/X509TrustManager;", "x509TrustManager", "LGK/l;", "s", "connectionSpecs", "LGK/A;", "t", "K", "protocols", "Ljavax/net/ssl/HostnameVerifier;", "Ljavax/net/ssl/HostnameVerifier;", "C", "()Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "LGK/g;", "LGK/g;", "()LGK/g;", "certificatePinner", "LTK/c;", "LTK/c;", "()LTK/c;", "certificateChainCleaner", "", "x", "I", "()I", "callTimeoutMillis", "connectTimeoutMillis", "O", "readTimeoutMillis", "A", "T", "writeTimeoutMillis", "B", "pingIntervalMillis", "", "J", "E", "()J", "minWebSocketMessageToCompress", "LLK/h;", "LLK/h;", "()LLK/h;", "routeDatabase", "R", "()Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class z implements Cloneable, C15786e.a, C15780H.a {

    /* renamed from: E  reason: collision with root package name */
    public static final b f135157E = new b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: F  reason: collision with root package name */
    public static final List<C15773A> f135158F = C15864d.w(C15773A.HTTP_2, C15773A.HTTP_1_1);
    /* access modifiers changed from: private */

    /* renamed from: G  reason: collision with root package name */
    public static final List<C15793l> f135159G = C15864d.w(C15793l.f135050i, C15793l.f135052k);

    /* renamed from: A  reason: collision with root package name */
    private final int f135160A;

    /* renamed from: B  reason: collision with root package name */
    private final int f135161B;

    /* renamed from: C  reason: collision with root package name */
    private final long f135162C;

    /* renamed from: D  reason: collision with root package name */
    private final h f135163D;

    /* renamed from: a  reason: collision with root package name */
    private final C15797p f135164a;

    /* renamed from: b  reason: collision with root package name */
    private final C15792k f135165b;

    /* renamed from: c  reason: collision with root package name */
    private final List<C15804w> f135166c;

    /* renamed from: d  reason: collision with root package name */
    private final List<C15804w> f135167d;

    /* renamed from: e  reason: collision with root package name */
    private final C15799r.c f135168e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f135169f;

    /* renamed from: g  reason: collision with root package name */
    private final C15783b f135170g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f135171h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f135172i;

    /* renamed from: j  reason: collision with root package name */
    private final C15795n f135173j;

    /* renamed from: k  reason: collision with root package name */
    private final C15784c f135174k;

    /* renamed from: l  reason: collision with root package name */
    private final C15798q f135175l;

    /* renamed from: m  reason: collision with root package name */
    private final Proxy f135176m;

    /* renamed from: n  reason: collision with root package name */
    private final ProxySelector f135177n;

    /* renamed from: o  reason: collision with root package name */
    private final C15783b f135178o;

    /* renamed from: p  reason: collision with root package name */
    private final SocketFactory f135179p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final SSLSocketFactory f135180q;

    /* renamed from: r  reason: collision with root package name */
    private final X509TrustManager f135181r;

    /* renamed from: s  reason: collision with root package name */
    private final List<C15793l> f135182s;

    /* renamed from: t  reason: collision with root package name */
    private final List<C15773A> f135183t;

    /* renamed from: u  reason: collision with root package name */
    private final HostnameVerifier f135184u;

    /* renamed from: v  reason: collision with root package name */
    private final C15788g f135185v;

    /* renamed from: w  reason: collision with root package name */
    private final C16554c f135186w;

    /* renamed from: x  reason: collision with root package name */
    private final int f135187x;

    /* renamed from: y  reason: collision with root package name */
    private final int f135188y;

    /* renamed from: z  reason: collision with root package name */
    private final int f135189z;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0000X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"LGK/z$b;", "", "<init>", "()V", "", "LGK/A;", "DEFAULT_PROTOCOLS", "Ljava/util/List;", "b", "()Ljava/util/List;", "LGK/l;", "DEFAULT_CONNECTION_SPECS", "a", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<C15793l> a() {
            return z.f135159G;
        }

        public final List<C15773A> b() {
            return z.f135158F;
        }

        private b() {
        }
    }

    public z(a aVar) {
        ProxySelector proxySelector;
        C17542s.j(aVar, "builder");
        this.f135164a = aVar.u();
        this.f135165b = aVar.r();
        this.f135166c = C15864d.W(aVar.A());
        this.f135167d = C15864d.W(aVar.C());
        this.f135168e = aVar.w();
        this.f135169f = aVar.J();
        this.f135170g = aVar.l();
        this.f135171h = aVar.x();
        this.f135172i = aVar.y();
        this.f135173j = aVar.t();
        this.f135174k = aVar.m();
        this.f135175l = aVar.v();
        this.f135176m = aVar.F();
        if (aVar.F() != null) {
            proxySelector = C16451a.f138349a;
        } else {
            proxySelector = aVar.H();
            proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
            if (proxySelector == null) {
                proxySelector = C16451a.f138349a;
            }
        }
        this.f135177n = proxySelector;
        this.f135178o = aVar.G();
        this.f135179p = aVar.L();
        List<C15793l> s10 = aVar.s();
        this.f135182s = s10;
        this.f135183t = aVar.E();
        this.f135184u = aVar.z();
        this.f135187x = aVar.n();
        this.f135188y = aVar.q();
        this.f135189z = aVar.I();
        this.f135160A = aVar.N();
        this.f135161B = aVar.D();
        this.f135162C = aVar.B();
        h K10 = aVar.K();
        this.f135163D = K10 == null ? new h() : K10;
        Iterable iterable = s10;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((C15793l) it.next()).f()) {
                    if (aVar.M() != null) {
                        this.f135180q = aVar.M();
                        C16554c o10 = aVar.o();
                        C17542s.g(o10);
                        this.f135186w = o10;
                        X509TrustManager O10 = aVar.O();
                        C17542s.g(O10);
                        this.f135181r = O10;
                        C15788g p10 = aVar.p();
                        C17542s.g(o10);
                        this.f135185v = p10.e(o10);
                    } else {
                        C16354j.a aVar2 = C16354j.f137719a;
                        X509TrustManager p11 = aVar2.g().p();
                        this.f135181r = p11;
                        C16354j g10 = aVar2.g();
                        C17542s.g(p11);
                        this.f135180q = g10.o(p11);
                        C16554c.a aVar3 = C16554c.f138918a;
                        C17542s.g(p11);
                        C16554c a10 = aVar3.a(p11);
                        this.f135186w = a10;
                        C15788g p12 = aVar.p();
                        C17542s.g(a10);
                        this.f135185v = p12.e(a10);
                    }
                }
            }
        }
        this.f135180q = null;
        this.f135186w = null;
        this.f135181r = null;
        this.f135185v = C15788g.f134910d;
        S();
    }

    private final void S() {
        List<C15804w> list = this.f135166c;
        C17542s.h(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!list.contains((Object) null)) {
            List<C15804w> list2 = this.f135167d;
            C17542s.h(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
            if (!list2.contains((Object) null)) {
                Iterable<C15793l> iterable = this.f135182s;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    for (C15793l f10 : iterable) {
                        if (f10.f()) {
                            if (this.f135180q == null) {
                                throw new IllegalStateException("sslSocketFactory == null");
                            } else if (this.f135186w == null) {
                                throw new IllegalStateException("certificateChainCleaner == null");
                            } else if (this.f135181r == null) {
                                throw new IllegalStateException("x509TrustManager == null");
                            } else {
                                return;
                            }
                        }
                    }
                }
                if (this.f135180q != null) {
                    throw new IllegalStateException("Check failed.");
                } else if (this.f135186w != null) {
                    throw new IllegalStateException("Check failed.");
                } else if (this.f135181r != null) {
                    throw new IllegalStateException("Check failed.");
                } else if (!C17542s.e(this.f135185v, C15788g.f134910d)) {
                    throw new IllegalStateException("Check failed.");
                }
            } else {
                throw new IllegalStateException(("Null network interceptor: " + this.f135167d).toString());
            }
        } else {
            throw new IllegalStateException(("Null interceptor: " + this.f135166c).toString());
        }
    }

    public final h A() {
        return this.f135163D;
    }

    public final HostnameVerifier C() {
        return this.f135184u;
    }

    public final List<C15804w> D() {
        return this.f135166c;
    }

    public final long E() {
        return this.f135162C;
    }

    public final List<C15804w> G() {
        return this.f135167d;
    }

    public a H() {
        return new a(this);
    }

    public final int I() {
        return this.f135161B;
    }

    public final List<C15773A> K() {
        return this.f135183t;
    }

    public final Proxy L() {
        return this.f135176m;
    }

    public final C15783b M() {
        return this.f135178o;
    }

    public final ProxySelector N() {
        return this.f135177n;
    }

    public final int O() {
        return this.f135189z;
    }

    public final boolean P() {
        return this.f135169f;
    }

    public final SocketFactory Q() {
        return this.f135179p;
    }

    public final SSLSocketFactory R() {
        SSLSocketFactory sSLSocketFactory = this.f135180q;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    public final int T() {
        return this.f135160A;
    }

    public final X509TrustManager V() {
        return this.f135181r;
    }

    public C15780H a(C15774B b10, C15781I i10) {
        C17542s.j(b10, "request");
        C17542s.j(i10, "listener");
        C16637d dVar = new C16637d(e.f135927i, b10, i10, new Random(), (long) this.f135161B, (C16638e) null, this.f135162C);
        dVar.o(this);
        return dVar;
    }

    public C15786e b(C15774B b10) {
        C17542s.j(b10, "request");
        return new LK.e(this, b10, false);
    }

    public Object clone() {
        return super.clone();
    }

    public final C15783b f() {
        return this.f135170g;
    }

    public final C15784c j() {
        return this.f135174k;
    }

    public final int k() {
        return this.f135187x;
    }

    public final C16554c l() {
        return this.f135186w;
    }

    public final C15788g m() {
        return this.f135185v;
    }

    public final int n() {
        return this.f135188y;
    }

    public final C15792k o() {
        return this.f135165b;
    }

    public final List<C15793l> p() {
        return this.f135182s;
    }

    public final C15795n r() {
        return this.f135173j;
    }

    public final C15797p u() {
        return this.f135164a;
    }

    public final C15798q v() {
        return this.f135175l;
    }

    public final C15799r.c w() {
        return this.f135168e;
    }

    public final boolean y() {
        return this.f135171h;
    }

    public final boolean z() {
        return this.f135172i;
    }

    @Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u0017J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u0017J\u0017\u0010\u001e\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00002\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u001d\u0010(\u001a\u00020\u00002\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u001b\u0010-\u001a\u00020\u00002\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*¢\u0006\u0004\b-\u0010.J\u001b\u00101\u001a\u00020\u00002\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0*¢\u0006\u0004\b1\u0010.J\u001d\u00106\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J\u001d\u00108\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204¢\u0006\u0004\b8\u00107J\u001d\u00109\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204¢\u0006\u0004\b9\u00107J\u001d\u0010:\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204¢\u0006\u0004\b:\u00107J\r\u0010;\u001a\u00020\u0004¢\u0006\u0004\b;\u0010<R\"\u0010\b\u001a\u00020\u00078\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\r\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010H\u001a\u00020B8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR \u0010M\u001a\b\u0012\u0004\u0012\u00020\u000b0I8\u0000X\u0004¢\u0006\f\n\u0004\b;\u0010J\u001a\u0004\bK\u0010LR \u0010O\u001a\b\u0012\u0004\u0012\u00020\u000b0I8\u0000X\u0004¢\u0006\f\n\u0004\b\u001e\u0010J\u001a\u0004\bN\u0010LR\"\u0010V\u001a\u00020P8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b6\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010\u0015\u001a\u00020\u00148\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b8\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\"\u0010b\u001a\u00020\\8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b-\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\"\u0010\u0018\u001a\u00020\u00148\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\t\u0010W\u001a\u0004\bc\u0010Y\"\u0004\bd\u0010[R\"\u0010g\u001a\u00020\u00148\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010W\u001a\u0004\be\u0010Y\"\u0004\bf\u0010[R\"\u0010n\u001a\u00020h8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR$\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\"\u0010z\u001a\u00020t8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b^\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR$\u0010!\u001a\u0004\u0018\u00010 8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bp\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010R,\u0010\u0001\u001a\u0005\u0018\u00010\u00018\u0000@\u0000X\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R&\u0010\u0001\u001a\u00020\\8\u0000@\u0000X\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010]\u001a\u0005\b\u0001\u0010_\"\u0005\b\u0001\u0010aR*\u0010\u0001\u001a\u00030\u00018\u0000@\u0000X\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R+\u0010\u0001\u001a\u0004\u0018\u00010$8\u0000@\u0000X\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R*\u0010 \u0001\u001a\u0004\u0018\u00010&8\u0000@\u0000X\u000e¢\u0006\u0017\n\u0005\bD\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R,\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*8\u0000@\u0000X\u000e¢\u0006\u0016\n\u0005\b¡\u0001\u0010J\u001a\u0005\b¡\u0001\u0010L\"\u0006\b¢\u0001\u0010£\u0001R+\u00100\u001a\b\u0012\u0004\u0012\u00020/0*8\u0000@\u0000X\u000e¢\u0006\u0015\n\u0004\bj\u0010J\u001a\u0005\b¤\u0001\u0010L\"\u0006\b¥\u0001\u0010£\u0001R)\u0010¬\u0001\u001a\u00030¦\u00018\u0000@\u0000X\u000e¢\u0006\u0017\n\u0005\b>\u0010§\u0001\u001a\u0006\b¨\u0001\u0010©\u0001\"\u0006\bª\u0001\u0010«\u0001R)\u0010²\u0001\u001a\u00030­\u00018\u0000@\u0000X\u000e¢\u0006\u0017\n\u0005\bv\u0010®\u0001\u001a\u0006\b\u0001\u0010¯\u0001\"\u0006\b°\u0001\u0010±\u0001R+\u0010¸\u0001\u001a\u0005\u0018\u00010³\u00018\u0000@\u0000X\u000e¢\u0006\u0017\n\u0005\bR\u0010´\u0001\u001a\u0006\b\u0001\u0010µ\u0001\"\u0006\b¶\u0001\u0010·\u0001R)\u0010¾\u0001\u001a\u00030¹\u00018\u0000@\u0000X\u000e¢\u0006\u0017\n\u0005\bc\u0010º\u0001\u001a\u0006\b\u0001\u0010»\u0001\"\u0006\b¼\u0001\u0010½\u0001R)\u0010À\u0001\u001a\u00030¹\u00018\u0000@\u0000X\u000e¢\u0006\u0017\n\u0005\be\u0010º\u0001\u001a\u0006\b\u0001\u0010»\u0001\"\u0006\b¿\u0001\u0010½\u0001R*\u0010Â\u0001\u001a\u00030¹\u00018\u0000@\u0000X\u000e¢\u0006\u0018\n\u0006\b¨\u0001\u0010º\u0001\u001a\u0006\bº\u0001\u0010»\u0001\"\u0006\bÁ\u0001\u0010½\u0001R)\u0010Å\u0001\u001a\u00030¹\u00018\u0000@\u0000X\u000e¢\u0006\u0017\n\u0005\bK\u0010º\u0001\u001a\u0006\bÃ\u0001\u0010»\u0001\"\u0006\bÄ\u0001\u0010½\u0001R*\u0010É\u0001\u001a\u00030¹\u00018\u0000@\u0000X\u000e¢\u0006\u0018\n\u0006\bÆ\u0001\u0010º\u0001\u001a\u0006\bÇ\u0001\u0010»\u0001\"\u0006\bÈ\u0001\u0010½\u0001R'\u0010Í\u0001\u001a\u0002028\u0000@\u0000X\u000e¢\u0006\u0016\n\u0004\bN\u0010X\u001a\u0006\bÆ\u0001\u0010Ê\u0001\"\u0006\bË\u0001\u0010Ì\u0001R,\u0010Ô\u0001\u001a\u0005\u0018\u00010Î\u00018\u0000@\u0000X\u000e¢\u0006\u0018\n\u0006\bÇ\u0001\u0010Ï\u0001\u001a\u0006\bÐ\u0001\u0010Ñ\u0001\"\u0006\bÒ\u0001\u0010Ó\u0001¨\u0006Õ\u0001"}, d2 = {"LGK/z$a;", "", "<init>", "()V", "LGK/z;", "okHttpClient", "(LGK/z;)V", "LGK/p;", "dispatcher", "h", "(LGK/p;)LGK/z$a;", "LGK/w;", "interceptor", "a", "(LGK/w;)LGK/z$a;", "b", "LGK/r;", "eventListener", "i", "(LGK/r;)LGK/z$a;", "", "retryOnConnectionFailure", "S", "(Z)LGK/z$a;", "followRedirects", "j", "followProtocolRedirects", "k", "LGK/c;", "cache", "d", "(LGK/c;)LGK/z$a;", "Ljava/net/Proxy;", "proxy", "Q", "(Ljava/net/Proxy;)LGK/z$a;", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "T", "(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;)LGK/z$a;", "", "LGK/l;", "connectionSpecs", "g", "(Ljava/util/List;)LGK/z$a;", "LGK/A;", "protocols", "P", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "e", "(JLjava/util/concurrent/TimeUnit;)LGK/z$a;", "f", "R", "U", "c", "()LGK/z;", "LGK/p;", "u", "()LGK/p;", "setDispatcher$okhttp", "(LGK/p;)V", "LGK/k;", "LGK/k;", "r", "()LGK/k;", "setConnectionPool$okhttp", "(LGK/k;)V", "connectionPool", "", "Ljava/util/List;", "A", "()Ljava/util/List;", "interceptors", "C", "networkInterceptors", "LGK/r$c;", "LGK/r$c;", "w", "()LGK/r$c;", "setEventListenerFactory$okhttp", "(LGK/r$c;)V", "eventListenerFactory", "Z", "J", "()Z", "setRetryOnConnectionFailure$okhttp", "(Z)V", "LGK/b;", "LGK/b;", "l", "()LGK/b;", "setAuthenticator$okhttp", "(LGK/b;)V", "authenticator", "x", "setFollowRedirects$okhttp", "y", "setFollowSslRedirects$okhttp", "followSslRedirects", "LGK/n;", "LGK/n;", "t", "()LGK/n;", "setCookieJar$okhttp", "(LGK/n;)V", "cookieJar", "LGK/c;", "m", "()LGK/c;", "setCache$okhttp", "(LGK/c;)V", "LGK/q;", "LGK/q;", "v", "()LGK/q;", "setDns$okhttp", "(LGK/q;)V", "dns", "Ljava/net/Proxy;", "F", "()Ljava/net/Proxy;", "setProxy$okhttp", "(Ljava/net/Proxy;)V", "Ljava/net/ProxySelector;", "n", "Ljava/net/ProxySelector;", "H", "()Ljava/net/ProxySelector;", "setProxySelector$okhttp", "(Ljava/net/ProxySelector;)V", "proxySelector", "o", "G", "setProxyAuthenticator$okhttp", "proxyAuthenticator", "Ljavax/net/SocketFactory;", "p", "Ljavax/net/SocketFactory;", "L", "()Ljavax/net/SocketFactory;", "setSocketFactory$okhttp", "(Ljavax/net/SocketFactory;)V", "socketFactory", "q", "Ljavax/net/ssl/SSLSocketFactory;", "M", "()Ljavax/net/ssl/SSLSocketFactory;", "setSslSocketFactoryOrNull$okhttp", "(Ljavax/net/ssl/SSLSocketFactory;)V", "sslSocketFactoryOrNull", "Ljavax/net/ssl/X509TrustManager;", "O", "()Ljavax/net/ssl/X509TrustManager;", "setX509TrustManagerOrNull$okhttp", "(Ljavax/net/ssl/X509TrustManager;)V", "x509TrustManagerOrNull", "s", "setConnectionSpecs$okhttp", "(Ljava/util/List;)V", "E", "setProtocols$okhttp", "Ljavax/net/ssl/HostnameVerifier;", "Ljavax/net/ssl/HostnameVerifier;", "z", "()Ljavax/net/ssl/HostnameVerifier;", "setHostnameVerifier$okhttp", "(Ljavax/net/ssl/HostnameVerifier;)V", "hostnameVerifier", "LGK/g;", "LGK/g;", "()LGK/g;", "setCertificatePinner$okhttp", "(LGK/g;)V", "certificatePinner", "LTK/c;", "LTK/c;", "()LTK/c;", "setCertificateChainCleaner$okhttp", "(LTK/c;)V", "certificateChainCleaner", "", "I", "()I", "setCallTimeout$okhttp", "(I)V", "callTimeout", "setConnectTimeout$okhttp", "connectTimeout", "setReadTimeout$okhttp", "readTimeout", "N", "setWriteTimeout$okhttp", "writeTimeout", "B", "D", "setPingInterval$okhttp", "pingInterval", "()J", "setMinWebSocketMessageToCompress$okhttp", "(J)V", "minWebSocketMessageToCompress", "LLK/h;", "LLK/h;", "K", "()LLK/h;", "setRouteDatabase$okhttp", "(LLK/h;)V", "routeDatabase", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: A  reason: collision with root package name */
        private int f135190A;

        /* renamed from: B  reason: collision with root package name */
        private int f135191B;

        /* renamed from: C  reason: collision with root package name */
        private long f135192C;

        /* renamed from: D  reason: collision with root package name */
        private h f135193D;

        /* renamed from: a  reason: collision with root package name */
        private C15797p f135194a;

        /* renamed from: b  reason: collision with root package name */
        private C15792k f135195b;

        /* renamed from: c  reason: collision with root package name */
        private final List<C15804w> f135196c;

        /* renamed from: d  reason: collision with root package name */
        private final List<C15804w> f135197d;

        /* renamed from: e  reason: collision with root package name */
        private C15799r.c f135198e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f135199f;

        /* renamed from: g  reason: collision with root package name */
        private C15783b f135200g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f135201h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f135202i;

        /* renamed from: j  reason: collision with root package name */
        private C15795n f135203j;

        /* renamed from: k  reason: collision with root package name */
        private C15784c f135204k;

        /* renamed from: l  reason: collision with root package name */
        private C15798q f135205l;

        /* renamed from: m  reason: collision with root package name */
        private Proxy f135206m;

        /* renamed from: n  reason: collision with root package name */
        private ProxySelector f135207n;

        /* renamed from: o  reason: collision with root package name */
        private C15783b f135208o;

        /* renamed from: p  reason: collision with root package name */
        private SocketFactory f135209p;

        /* renamed from: q  reason: collision with root package name */
        private SSLSocketFactory f135210q;

        /* renamed from: r  reason: collision with root package name */
        private X509TrustManager f135211r;

        /* renamed from: s  reason: collision with root package name */
        private List<C15793l> f135212s;

        /* renamed from: t  reason: collision with root package name */
        private List<? extends C15773A> f135213t;

        /* renamed from: u  reason: collision with root package name */
        private HostnameVerifier f135214u;

        /* renamed from: v  reason: collision with root package name */
        private C15788g f135215v;

        /* renamed from: w  reason: collision with root package name */
        private C16554c f135216w;

        /* renamed from: x  reason: collision with root package name */
        private int f135217x;

        /* renamed from: y  reason: collision with root package name */
        private int f135218y;

        /* renamed from: z  reason: collision with root package name */
        private int f135219z;

        public a() {
            this.f135194a = new C15797p();
            this.f135195b = new C15792k();
            this.f135196c = new ArrayList();
            this.f135197d = new ArrayList();
            this.f135198e = C15864d.g(C15799r.f135090b);
            this.f135199f = true;
            C15783b bVar = C15783b.f134850b;
            this.f135200g = bVar;
            this.f135201h = true;
            this.f135202i = true;
            this.f135203j = C15795n.f135076b;
            this.f135205l = C15798q.f135087b;
            this.f135208o = bVar;
            SocketFactory socketFactory = SocketFactory.getDefault();
            C17542s.i(socketFactory, "getDefault()");
            this.f135209p = socketFactory;
            b bVar2 = z.f135157E;
            this.f135212s = bVar2.a();
            this.f135213t = bVar2.b();
            this.f135214u = C16555d.f138919a;
            this.f135215v = C15788g.f134910d;
            this.f135218y = 10000;
            this.f135219z = 10000;
            this.f135190A = 10000;
            this.f135192C = 1024;
        }

        public final List<C15804w> A() {
            return this.f135196c;
        }

        public final long B() {
            return this.f135192C;
        }

        public final List<C15804w> C() {
            return this.f135197d;
        }

        public final int D() {
            return this.f135191B;
        }

        public final List<C15773A> E() {
            return this.f135213t;
        }

        public final Proxy F() {
            return this.f135206m;
        }

        public final C15783b G() {
            return this.f135208o;
        }

        public final ProxySelector H() {
            return this.f135207n;
        }

        public final int I() {
            return this.f135219z;
        }

        public final boolean J() {
            return this.f135199f;
        }

        public final h K() {
            return this.f135193D;
        }

        public final SocketFactory L() {
            return this.f135209p;
        }

        public final SSLSocketFactory M() {
            return this.f135210q;
        }

        public final int N() {
            return this.f135190A;
        }

        public final X509TrustManager O() {
            return this.f135211r;
        }

        public final a P(List<? extends C15773A> list) {
            C17542s.j(list, "protocols");
            List w12 = C16877v.w1(list);
            C15773A a10 = C15773A.H2_PRIOR_KNOWLEDGE;
            if (!w12.contains(a10) && !w12.contains(C15773A.HTTP_1_1)) {
                throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + w12).toString());
            } else if (w12.contains(a10) && w12.size() > 1) {
                throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + w12).toString());
            } else if (!w12.contains(C15773A.HTTP_1_0)) {
                C17542s.h(w12, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Protocol?>");
                if (!w12.contains((Object) null)) {
                    w12.remove(C15773A.SPDY_3);
                    if (!C17542s.e(w12, this.f135213t)) {
                        this.f135193D = null;
                    }
                    List<? extends C15773A> unmodifiableList = Collections.unmodifiableList(w12);
                    C17542s.i(unmodifiableList, "unmodifiableList(protocolsCopy)");
                    this.f135213t = unmodifiableList;
                    return this;
                }
                throw new IllegalArgumentException("protocols must not contain null");
            } else {
                throw new IllegalArgumentException(("protocols must not contain http/1.0: " + w12).toString());
            }
        }

        public final a Q(Proxy proxy) {
            if (!C17542s.e(proxy, this.f135206m)) {
                this.f135193D = null;
            }
            this.f135206m = proxy;
            return this;
        }

        public final a R(long j10, TimeUnit timeUnit) {
            C17542s.j(timeUnit, "unit");
            this.f135219z = C15864d.k("timeout", j10, timeUnit);
            return this;
        }

        public final a S(boolean z10) {
            this.f135199f = z10;
            return this;
        }

        public final a T(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
            C17542s.j(sSLSocketFactory, "sslSocketFactory");
            C17542s.j(x509TrustManager, "trustManager");
            if (!C17542s.e(sSLSocketFactory, this.f135210q) || !C17542s.e(x509TrustManager, this.f135211r)) {
                this.f135193D = null;
            }
            this.f135210q = sSLSocketFactory;
            this.f135216w = C16554c.f138918a.a(x509TrustManager);
            this.f135211r = x509TrustManager;
            return this;
        }

        public final a U(long j10, TimeUnit timeUnit) {
            C17542s.j(timeUnit, "unit");
            this.f135190A = C15864d.k("timeout", j10, timeUnit);
            return this;
        }

        public final a a(C15804w wVar) {
            C17542s.j(wVar, "interceptor");
            this.f135196c.add(wVar);
            return this;
        }

        public final a b(C15804w wVar) {
            C17542s.j(wVar, "interceptor");
            this.f135197d.add(wVar);
            return this;
        }

        public final z c() {
            return new z(this);
        }

        public final a d(C15784c cVar) {
            this.f135204k = cVar;
            return this;
        }

        public final a e(long j10, TimeUnit timeUnit) {
            C17542s.j(timeUnit, "unit");
            this.f135217x = C15864d.k("timeout", j10, timeUnit);
            return this;
        }

        public final a f(long j10, TimeUnit timeUnit) {
            C17542s.j(timeUnit, "unit");
            this.f135218y = C15864d.k("timeout", j10, timeUnit);
            return this;
        }

        public final a g(List<C15793l> list) {
            C17542s.j(list, "connectionSpecs");
            if (!C17542s.e(list, this.f135212s)) {
                this.f135193D = null;
            }
            this.f135212s = C15864d.W(list);
            return this;
        }

        public final a h(C15797p pVar) {
            C17542s.j(pVar, "dispatcher");
            this.f135194a = pVar;
            return this;
        }

        public final a i(C15799r rVar) {
            C17542s.j(rVar, "eventListener");
            this.f135198e = C15864d.g(rVar);
            return this;
        }

        public final a j(boolean z10) {
            this.f135201h = z10;
            return this;
        }

        public final a k(boolean z10) {
            this.f135202i = z10;
            return this;
        }

        public final C15783b l() {
            return this.f135200g;
        }

        public final C15784c m() {
            return this.f135204k;
        }

        public final int n() {
            return this.f135217x;
        }

        public final C16554c o() {
            return this.f135216w;
        }

        public final C15788g p() {
            return this.f135215v;
        }

        public final int q() {
            return this.f135218y;
        }

        public final C15792k r() {
            return this.f135195b;
        }

        public final List<C15793l> s() {
            return this.f135212s;
        }

        public final C15795n t() {
            return this.f135203j;
        }

        public final C15797p u() {
            return this.f135194a;
        }

        public final C15798q v() {
            return this.f135205l;
        }

        public final C15799r.c w() {
            return this.f135198e;
        }

        public final boolean x() {
            return this.f135201h;
        }

        public final boolean y() {
            return this.f135202i;
        }

        public final HostnameVerifier z() {
            return this.f135214u;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public a(z zVar) {
            this();
            C17542s.j(zVar, "okHttpClient");
            this.f135194a = zVar.u();
            this.f135195b = zVar.o();
            C16877v.E(this.f135196c, zVar.D());
            C16877v.E(this.f135197d, zVar.G());
            this.f135198e = zVar.w();
            this.f135199f = zVar.P();
            this.f135200g = zVar.f();
            this.f135201h = zVar.y();
            this.f135202i = zVar.z();
            this.f135203j = zVar.r();
            this.f135204k = zVar.j();
            this.f135205l = zVar.v();
            this.f135206m = zVar.L();
            this.f135207n = zVar.N();
            this.f135208o = zVar.M();
            this.f135209p = zVar.Q();
            this.f135210q = zVar.f135180q;
            this.f135211r = zVar.V();
            this.f135212s = zVar.p();
            this.f135213t = zVar.K();
            this.f135214u = zVar.C();
            this.f135215v = zVar.m();
            this.f135216w = zVar.l();
            this.f135217x = zVar.k();
            this.f135218y = zVar.n();
            this.f135219z = zVar.O();
            this.f135190A = zVar.T();
            this.f135191B = zVar.I();
            this.f135192C = zVar.E();
            this.f135193D = zVar.A();
        }
    }

    public z() {
        this(new a());
    }
}
