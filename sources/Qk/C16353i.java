package QK;

import GK.C15773A;
import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.openjsse.net.ssl.OpenJSSE;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0001\u001aB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"LQK/i;", "LQK/j;", "<init>", "()V", "Ljavax/net/ssl/SSLContext;", "n", "()Ljavax/net/ssl/SSLContext;", "Ljavax/net/ssl/X509TrustManager;", "p", "()Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "LGK/A;", "protocols", "LXH/N;", "e", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "h", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "Ljava/security/Provider;", "d", "Ljava/security/Provider;", "provider", "a", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: QK.i  reason: case insensitive filesystem */
public final class C16353i extends C16354j {

    /* renamed from: e  reason: collision with root package name */
    public static final a f137716e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f137717f;

    /* renamed from: d  reason: collision with root package name */
    private final Provider f137718d;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LQK/i$a;", "", "<init>", "()V", "LQK/i;", "a", "()LQK/i;", "", "isSupported", "Z", "b", "()Z", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: QK.i$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C16353i a() {
            if (b()) {
                return new C16353i((DefaultConstructorMarker) null);
            }
            return null;
        }

        public final boolean b() {
            return C16353i.f137717f;
        }

        private a() {
        }
    }

    static {
        a aVar = new a((DefaultConstructorMarker) null);
        f137716e = aVar;
        boolean z10 = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, aVar.getClass().getClassLoader());
            z10 = true;
        } catch (ClassNotFoundException unused) {
        }
        f137717f = z10;
    }

    public /* synthetic */ C16353i(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public void e(SSLSocket sSLSocket, String str, List<C15773A> list) {
        C17542s.j(sSLSocket, "sslSocket");
        C17542s.j(list, "protocols");
        super.e(sSLSocket, str, list);
    }

    public String h(SSLSocket sSLSocket) {
        C17542s.j(sSLSocket, "sslSocket");
        return super.h(sSLSocket);
    }

    public SSLContext n() {
        SSLContext instance = SSLContext.getInstance("TLSv1.3", this.f137718d);
        C17542s.i(instance, "getInstance(\"TLSv1.3\", provider)");
        return instance;
    }

    public X509TrustManager p() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f137718d);
        instance.init((KeyStore) null);
        TrustManager[] trustManagers = instance.getTrustManagers();
        C17542s.g(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                C17542s.h(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unexpected default trust managers: ");
        String arrays = Arrays.toString(trustManagers);
        C17542s.i(arrays, "toString(this)");
        sb2.append(arrays);
        throw new IllegalStateException(sb2.toString().toString());
    }

    private C16353i() {
        this.f137718d = new OpenJSSE();
    }
}
