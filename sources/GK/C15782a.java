package GK;

import GK.C15803v;
import HK.C15864d;
import com.adjust.sdk.Constants;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0004H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u0000H\u0000¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0002H\u0016¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007¢\u0006\f\n\u0004\b*\u00100\u001a\u0004\b1\u00102R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0007¢\u0006\f\n\u0004\b$\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007¢\u0006\f\n\u0004\b4\u00106\u001a\u0004\b(\u00107R\u0017\u0010\u0011\u001a\u00020\u00108\u0007¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0007¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b<\u0010>R\u0017\u0010\u001a\u001a\u00020\u00198\u0007¢\u0006\f\n\u0004\b:\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010F\u001a\u00020B8G¢\u0006\f\n\u0004\b@\u0010C\u001a\u0004\bD\u0010ER\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148G¢\u0006\f\n\u0004\b.\u0010G\u001a\u0004\b8\u0010HR\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00148G¢\u0006\f\n\u0004\b1\u0010G\u001a\u0004\b,\u0010H¨\u0006I"}, d2 = {"LGK/a;", "", "", "uriHost", "", "uriPort", "LGK/q;", "dns", "Ljavax/net/SocketFactory;", "socketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "LGK/g;", "certificatePinner", "LGK/b;", "proxyAuthenticator", "Ljava/net/Proxy;", "proxy", "", "LGK/A;", "protocols", "LGK/l;", "connectionSpecs", "Ljava/net/ProxySelector;", "proxySelector", "<init>", "(Ljava/lang/String;ILGK/q;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;LGK/g;LGK/b;Ljava/net/Proxy;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "that", "d", "(LGK/a;)Z", "toString", "()Ljava/lang/String;", "a", "LGK/q;", "c", "()LGK/q;", "b", "Ljavax/net/SocketFactory;", "j", "()Ljavax/net/SocketFactory;", "Ljavax/net/ssl/SSLSocketFactory;", "k", "()Ljavax/net/ssl/SSLSocketFactory;", "Ljavax/net/ssl/HostnameVerifier;", "e", "()Ljavax/net/ssl/HostnameVerifier;", "LGK/g;", "()LGK/g;", "f", "LGK/b;", "h", "()LGK/b;", "g", "Ljava/net/Proxy;", "()Ljava/net/Proxy;", "Ljava/net/ProxySelector;", "i", "()Ljava/net/ProxySelector;", "LGK/v;", "LGK/v;", "l", "()LGK/v;", "url", "Ljava/util/List;", "()Ljava/util/List;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: GK.a  reason: case insensitive filesystem */
public final class C15782a {

    /* renamed from: a  reason: collision with root package name */
    private final C15798q f134838a;

    /* renamed from: b  reason: collision with root package name */
    private final SocketFactory f134839b;

    /* renamed from: c  reason: collision with root package name */
    private final SSLSocketFactory f134840c;

    /* renamed from: d  reason: collision with root package name */
    private final HostnameVerifier f134841d;

    /* renamed from: e  reason: collision with root package name */
    private final C15788g f134842e;

    /* renamed from: f  reason: collision with root package name */
    private final C15783b f134843f;

    /* renamed from: g  reason: collision with root package name */
    private final Proxy f134844g;

    /* renamed from: h  reason: collision with root package name */
    private final ProxySelector f134845h;

    /* renamed from: i  reason: collision with root package name */
    private final C15803v f134846i;

    /* renamed from: j  reason: collision with root package name */
    private final List<C15773A> f134847j;

    /* renamed from: k  reason: collision with root package name */
    private final List<C15793l> f134848k;

    public C15782a(String str, int i10, C15798q qVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C15788g gVar, C15783b bVar, Proxy proxy, List<? extends C15773A> list, List<C15793l> list2, ProxySelector proxySelector) {
        C17542s.j(str, "uriHost");
        C17542s.j(qVar, "dns");
        C17542s.j(socketFactory, "socketFactory");
        C17542s.j(bVar, "proxyAuthenticator");
        C17542s.j(list, "protocols");
        C17542s.j(list2, "connectionSpecs");
        C17542s.j(proxySelector, "proxySelector");
        this.f134838a = qVar;
        this.f134839b = socketFactory;
        this.f134840c = sSLSocketFactory;
        this.f134841d = hostnameVerifier;
        this.f134842e = gVar;
        this.f134843f = bVar;
        this.f134844g = proxy;
        this.f134845h = proxySelector;
        this.f134846i = new C15803v.a().u(sSLSocketFactory != null ? Constants.SCHEME : "http").j(str).p(i10).e();
        this.f134847j = C15864d.W(list);
        this.f134848k = C15864d.W(list2);
    }

    public final C15788g a() {
        return this.f134842e;
    }

    public final List<C15793l> b() {
        return this.f134848k;
    }

    public final C15798q c() {
        return this.f134838a;
    }

    public final boolean d(C15782a aVar) {
        C17542s.j(aVar, "that");
        return C17542s.e(this.f134838a, aVar.f134838a) && C17542s.e(this.f134843f, aVar.f134843f) && C17542s.e(this.f134847j, aVar.f134847j) && C17542s.e(this.f134848k, aVar.f134848k) && C17542s.e(this.f134845h, aVar.f134845h) && C17542s.e(this.f134844g, aVar.f134844g) && C17542s.e(this.f134840c, aVar.f134840c) && C17542s.e(this.f134841d, aVar.f134841d) && C17542s.e(this.f134842e, aVar.f134842e) && this.f134846i.o() == aVar.f134846i.o();
    }

    public final HostnameVerifier e() {
        return this.f134841d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C15782a) {
            C15782a aVar = (C15782a) obj;
            return C17542s.e(this.f134846i, aVar.f134846i) && d(aVar);
        }
    }

    public final List<C15773A> f() {
        return this.f134847j;
    }

    public final Proxy g() {
        return this.f134844g;
    }

    public final C15783b h() {
        return this.f134843f;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f134846i.hashCode()) * 31) + this.f134838a.hashCode()) * 31) + this.f134843f.hashCode()) * 31) + this.f134847j.hashCode()) * 31) + this.f134848k.hashCode()) * 31) + this.f134845h.hashCode()) * 31) + Objects.hashCode(this.f134844g)) * 31) + Objects.hashCode(this.f134840c)) * 31) + Objects.hashCode(this.f134841d)) * 31) + Objects.hashCode(this.f134842e);
    }

    public final ProxySelector i() {
        return this.f134845h;
    }

    public final SocketFactory j() {
        return this.f134839b;
    }

    public final SSLSocketFactory k() {
        return this.f134840c;
    }

    public final C15803v l() {
        return this.f134846i;
    }

    public String toString() {
        StringBuilder sb2;
        Object obj;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Address{");
        sb3.append(this.f134846i.i());
        sb3.append(':');
        sb3.append(this.f134846i.o());
        sb3.append(", ");
        if (this.f134844g != null) {
            sb2 = new StringBuilder();
            sb2.append("proxy=");
            obj = this.f134844g;
        } else {
            sb2 = new StringBuilder();
            sb2.append("proxySelector=");
            obj = this.f134845h;
        }
        sb2.append(obj);
        sb3.append(sb2.toString());
        sb3.append('}');
        return sb3.toString();
    }
}
