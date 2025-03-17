package QK;

import GK.C15773A;
import GK.z;
import RK.C16392e;
import TK.C16552a;
import TK.C16553b;
import TK.C16554c;
import TK.C16556e;
import WK.C16770e;
import YH.C16877v;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 <2\u00020\u0001:\u0001<B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010 \u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J-\u0010&\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\u001e2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020(2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b)\u0010*J\u0019\u0010,\u001a\u0004\u0018\u00010\u00012\u0006\u0010+\u001a\u00020\u0004H\u0016¢\u0006\u0004\b,\u0010-J!\u0010/\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u00042\b\u0010.\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u0002022\u0006\u00101\u001a\u00020\nH\u0016¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u0002052\u0006\u00101\u001a\u00020\nH\u0016¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u0002082\u0006\u00101\u001a\u00020\nH\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0004H\u0016¢\u0006\u0004\b;\u0010\u0006¨\u0006="}, d2 = {"LQK/j;", "", "<init>", "()V", "", "g", "()Ljava/lang/String;", "Ljavax/net/ssl/SSLContext;", "n", "()Ljavax/net/ssl/SSLContext;", "Ljavax/net/ssl/X509TrustManager;", "p", "()Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "hostname", "", "LGK/A;", "protocols", "LXH/N;", "e", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "b", "(Ljavax/net/ssl/SSLSocket;)V", "h", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "Ljava/net/Socket;", "socket", "Ljava/net/InetSocketAddress;", "address", "", "connectTimeout", "f", "(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V", "message", "level", "", "t", "k", "(Ljava/lang/String;ILjava/lang/Throwable;)V", "", "j", "(Ljava/lang/String;)Z", "closer", "i", "(Ljava/lang/String;)Ljava/lang/Object;", "stackTrace", "m", "(Ljava/lang/String;Ljava/lang/Object;)V", "trustManager", "LTK/c;", "c", "(Ljavax/net/ssl/X509TrustManager;)LTK/c;", "LTK/e;", "d", "(Ljavax/net/ssl/X509TrustManager;)LTK/e;", "Ljavax/net/ssl/SSLSocketFactory;", "o", "(Ljavax/net/ssl/X509TrustManager;)Ljavax/net/ssl/SSLSocketFactory;", "toString", "a", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: QK.j  reason: case insensitive filesystem */
public class C16354j {

    /* renamed from: a  reason: collision with root package name */
    public static final a f137719a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static volatile C16354j f137720b;

    /* renamed from: c  reason: collision with root package name */
    private static final Logger f137721c = Logger.getLogger(z.class.getName());

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\u0006J!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\u00020\u00102\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138BX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138BX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00138BX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\u001c\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015R\u0014\u0010\u001e\u001a\u00020\u001d8\u0006XT¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u001d8\u0006XT¢\u0006\u0006\n\u0004\b \u0010\u001fR\u001c\u0010#\u001a\n \"*\u0004\u0018\u00010!0!8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"LQK/j$a;", "", "<init>", "()V", "LQK/j;", "f", "()LQK/j;", "d", "e", "g", "", "LGK/A;", "protocols", "", "b", "(Ljava/util/List;)Ljava/util/List;", "", "c", "(Ljava/util/List;)[B", "", "j", "()Z", "isConscryptPreferred", "k", "isOpenJSSEPreferred", "i", "isBouncyCastlePreferred", "h", "isAndroid", "", "INFO", "I", "WARN", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "logger", "Ljava/util/logging/Logger;", "platform", "LQK/j;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: QK.j$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final C16354j d() {
            C16392e.f138031a.b();
            C16354j a10 = C16345a.f137689e.a();
            if (a10 != null) {
                return a10;
            }
            C16354j a11 = C16346b.f137692f.a();
            C17542s.g(a11);
            return a11;
        }

        private final C16354j e() {
            C16353i a10;
            C16347c a11;
            C16348d b10;
            if (j() && (b10 = C16348d.f137701e.b()) != null) {
                return b10;
            }
            if (i() && (a11 = C16347c.f137698e.a()) != null) {
                return a11;
            }
            if (k() && (a10 = C16353i.f137716e.a()) != null) {
                return a10;
            }
            C16352h a12 = C16352h.f137714d.a();
            if (a12 != null) {
                return a12;
            }
            C16354j a13 = C16349e.f137705i.a();
            return a13 != null ? a13 : new C16354j();
        }

        /* access modifiers changed from: private */
        public final C16354j f() {
            return h() ? d() : e();
        }

        private final boolean i() {
            return C17542s.e("BC", Security.getProviders()[0].getName());
        }

        private final boolean j() {
            return C17542s.e("Conscrypt", Security.getProviders()[0].getName());
        }

        private final boolean k() {
            return C17542s.e("OpenJSSE", Security.getProviders()[0].getName());
        }

        public final List<String> b(List<? extends C15773A> list) {
            C17542s.j(list, "protocols");
            ArrayList<C15773A> arrayList = new ArrayList<>();
            for (Object next : list) {
                if (((C15773A) next) != C15773A.HTTP_1_0) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(C16877v.y(arrayList, 10));
            for (C15773A a10 : arrayList) {
                arrayList2.add(a10.toString());
            }
            return arrayList2;
        }

        public final byte[] c(List<? extends C15773A> list) {
            C17542s.j(list, "protocols");
            C16770e eVar = new C16770e();
            for (String next : b(list)) {
                eVar.Z1(next.length());
                eVar.D0(next);
            }
            return eVar.R1();
        }

        public final C16354j g() {
            return C16354j.f137720b;
        }

        public final boolean h() {
            return C17542s.e("Dalvik", System.getProperty("java.vm.name"));
        }

        private a() {
        }
    }

    static {
        a aVar = new a((DefaultConstructorMarker) null);
        f137719a = aVar;
        f137720b = aVar.f();
    }

    public static /* synthetic */ void l(C16354j jVar, String str, int i10, Throwable th2, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                i10 = 4;
            }
            if ((i11 & 4) != 0) {
                th2 = null;
            }
            jVar.k(str, i10, th2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
    }

    public void b(SSLSocket sSLSocket) {
        C17542s.j(sSLSocket, "sslSocket");
    }

    public C16554c c(X509TrustManager x509TrustManager) {
        C17542s.j(x509TrustManager, "trustManager");
        return new C16552a(d(x509TrustManager));
    }

    public C16556e d(X509TrustManager x509TrustManager) {
        C17542s.j(x509TrustManager, "trustManager");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        C17542s.i(acceptedIssuers, "trustManager.acceptedIssuers");
        return new C16553b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void e(SSLSocket sSLSocket, String str, List<C15773A> list) {
        C17542s.j(sSLSocket, "sslSocket");
        C17542s.j(list, "protocols");
    }

    public void f(Socket socket, InetSocketAddress inetSocketAddress, int i10) {
        C17542s.j(socket, "socket");
        C17542s.j(inetSocketAddress, PlaceTypes.ADDRESS);
        socket.connect(inetSocketAddress, i10);
    }

    public final String g() {
        return "OkHttp";
    }

    public String h(SSLSocket sSLSocket) {
        C17542s.j(sSLSocket, "sslSocket");
        return null;
    }

    public Object i(String str) {
        C17542s.j(str, "closer");
        if (f137721c.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public boolean j(String str) {
        C17542s.j(str, "hostname");
        return true;
    }

    public void k(String str, int i10, Throwable th2) {
        C17542s.j(str, "message");
        f137721c.log(i10 == 5 ? Level.WARNING : Level.INFO, str, th2);
    }

    public void m(String str, Object obj) {
        C17542s.j(str, "message");
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        k(str, 5, (Throwable) obj);
    }

    public SSLContext n() {
        SSLContext instance = SSLContext.getInstance("TLS");
        C17542s.i(instance, "getInstance(\"TLS\")");
        return instance;
    }

    public SSLSocketFactory o(X509TrustManager x509TrustManager) {
        C17542s.j(x509TrustManager, "trustManager");
        try {
            SSLContext n10 = n();
            n10.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
            SSLSocketFactory socketFactory = n10.getSocketFactory();
            C17542s.i(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e10) {
            throw new AssertionError("No System TLS: " + e10, e10);
        }
    }

    public X509TrustManager p() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
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

    public String toString() {
        String simpleName = getClass().getSimpleName();
        C17542s.i(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}
