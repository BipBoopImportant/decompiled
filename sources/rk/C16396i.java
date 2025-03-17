package RK;

import GK.C15773A;
import QK.C16347c;
import QK.C16354j;
import RK.l;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00072\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LRK/i;", "LRK/m;", "<init>", "()V", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "a", "(Ljavax/net/ssl/SSLSocket;)Z", "isSupported", "()Z", "", "b", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "hostname", "", "LGK/A;", "protocols", "LXH/N;", "c", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: RK.i  reason: case insensitive filesystem */
public final class C16396i implements m {

    /* renamed from: a  reason: collision with root package name */
    public static final b f138043a = new b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final l.a f138044b = new a();

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"RK/i$a", "LRK/l$a;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "a", "(Ljavax/net/ssl/SSLSocket;)Z", "LRK/m;", "b", "(Ljavax/net/ssl/SSLSocket;)LRK/m;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: RK.i$a */
    public static final class a implements l.a {
        a() {
        }

        public boolean a(SSLSocket sSLSocket) {
            C17542s.j(sSLSocket, "sslSocket");
            boolean b10 = C16347c.f137698e.b();
            return false;
        }

        public m b(SSLSocket sSLSocket) {
            C17542s.j(sSLSocket, "sslSocket");
            return new C16396i();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LRK/i$b;", "", "<init>", "()V", "LRK/l$a;", "factory", "LRK/l$a;", "a", "()LRK/l$a;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: RK.i$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l.a a() {
            return C16396i.f138044b;
        }

        private b() {
        }
    }

    public boolean a(SSLSocket sSLSocket) {
        C17542s.j(sSLSocket, "sslSocket");
        return false;
    }

    public String b(SSLSocket sSLSocket) {
        C17542s.j(sSLSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : C17542s.e(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    public void c(SSLSocket sSLSocket, String str, List<? extends C15773A> list) {
        C17542s.j(sSLSocket, "sslSocket");
        C17542s.j(list, "protocols");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            parameters.setApplicationProtocols((String[]) C16354j.f137719a.b(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }

    public boolean isSupported() {
        return C16347c.f137698e.b();
    }
}
