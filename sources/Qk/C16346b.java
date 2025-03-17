package QK;

import GK.C15773A;
import RK.C16391d;
import RK.C16395h;
import RK.C16396i;
import RK.j;
import RK.k;
import RK.l;
import RK.m;
import RK.n;
import TK.C16554c;
import TK.C16556e;
import YH.C16877v;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u000212B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0018\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020(2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b)\u0010*R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020+0\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010,R\u0014\u00100\u001a\u00020.8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010/¨\u00063"}, d2 = {"LQK/b;", "LQK/j;", "<init>", "()V", "Ljava/net/Socket;", "socket", "Ljava/net/InetSocketAddress;", "address", "", "connectTimeout", "LXH/N;", "f", "(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "LGK/A;", "protocols", "e", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "h", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "closer", "", "i", "(Ljava/lang/String;)Ljava/lang/Object;", "message", "stackTrace", "m", "(Ljava/lang/String;Ljava/lang/Object;)V", "", "j", "(Ljava/lang/String;)Z", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "LTK/c;", "c", "(Ljavax/net/ssl/X509TrustManager;)LTK/c;", "LTK/e;", "d", "(Ljavax/net/ssl/X509TrustManager;)LTK/e;", "LRK/m;", "Ljava/util/List;", "socketAdapters", "LRK/j;", "LRK/j;", "closeGuard", "a", "b", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: QK.b  reason: case insensitive filesystem */
public final class C16346b extends C16354j {

    /* renamed from: f  reason: collision with root package name */
    public static final a f137692f = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f137693g;

    /* renamed from: d  reason: collision with root package name */
    private final List<m> f137694d;

    /* renamed from: e  reason: collision with root package name */
    private final j f137695e;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LQK/b$a;", "", "<init>", "()V", "LQK/j;", "a", "()LQK/j;", "", "isSupported", "Z", "b", "()Z", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: QK.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C16354j a() {
            if (b()) {
                return new C16346b();
            }
            return null;
        }

        public final boolean b() {
            return C16346b.f137693g;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LQK/b$b;", "LTK/e;", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Ljava/lang/reflect/Method;", "findByIssuerAndSignatureMethod", "<init>", "(Ljavax/net/ssl/X509TrustManager;Ljava/lang/reflect/Method;)V", "Ljava/security/cert/X509Certificate;", "cert", "a", "(Ljava/security/cert/X509Certificate;)Ljava/security/cert/X509Certificate;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljavax/net/ssl/X509TrustManager;", "b", "Ljava/lang/reflect/Method;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: QK.b$b  reason: collision with other inner class name */
    public static final class C3373b implements C16556e {

        /* renamed from: a  reason: collision with root package name */
        private final X509TrustManager f137696a;

        /* renamed from: b  reason: collision with root package name */
        private final Method f137697b;

        public C3373b(X509TrustManager x509TrustManager, Method method) {
            C17542s.j(x509TrustManager, "trustManager");
            C17542s.j(method, "findByIssuerAndSignatureMethod");
            this.f137696a = x509TrustManager;
            this.f137697b = method;
        }

        public X509Certificate a(X509Certificate x509Certificate) {
            C17542s.j(x509Certificate, "cert");
            try {
                Object invoke = this.f137697b.invoke(this.f137696a, new Object[]{x509Certificate});
                C17542s.h(invoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
                return ((TrustAnchor) invoke).getTrustedCert();
            } catch (IllegalAccessException e10) {
                throw new AssertionError("unable to get issues and signature", e10);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3373b)) {
                return false;
            }
            C3373b bVar = (C3373b) obj;
            return C17542s.e(this.f137696a, bVar.f137696a) && C17542s.e(this.f137697b, bVar.f137697b);
        }

        public int hashCode() {
            return (this.f137696a.hashCode() * 31) + this.f137697b.hashCode();
        }

        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f137696a + ", findByIssuerAndSignatureMethod=" + this.f137697b + ')';
        }
    }

    static {
        boolean z10 = false;
        if (C16354j.f137719a.h() && Build.VERSION.SDK_INT < 30) {
            z10 = true;
        }
        f137693g = z10;
    }

    public C16346b() {
        m[] mVarArr = {n.a.b(n.f138053j, (String) null, 1, (Object) null), new l(C16395h.f138035f.d()), new l(k.f138049a.a()), new l(C16396i.f138043a.a())};
        ArrayList arrayList = new ArrayList();
        for (Object next : C16877v.s(mVarArr)) {
            if (((m) next).isSupported()) {
                arrayList.add(next);
            }
        }
        this.f137694d = arrayList;
        this.f137695e = j.f138045d.a();
    }

    public C16554c c(X509TrustManager x509TrustManager) {
        C17542s.j(x509TrustManager, "trustManager");
        C16391d a10 = C16391d.f138028d.a(x509TrustManager);
        return a10 != null ? a10 : super.c(x509TrustManager);
    }

    public C16556e d(X509TrustManager x509TrustManager) {
        C17542s.j(x509TrustManager, "trustManager");
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            declaredMethod.setAccessible(true);
            C17542s.i(declaredMethod, "method");
            return new C3373b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.d(x509TrustManager);
        }
    }

    public void e(SSLSocket sSLSocket, String str, List<C15773A> list) {
        Object obj;
        C17542s.j(sSLSocket, "sslSocket");
        C17542s.j(list, "protocols");
        Iterator it = this.f137694d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((m) obj).a(sSLSocket)) {
                break;
            }
        }
        m mVar = (m) obj;
        if (mVar != null) {
            mVar.c(sSLSocket, str, list);
        }
    }

    public void f(Socket socket, InetSocketAddress inetSocketAddress, int i10) {
        C17542s.j(socket, "socket");
        C17542s.j(inetSocketAddress, PlaceTypes.ADDRESS);
        try {
            socket.connect(inetSocketAddress, i10);
        } catch (ClassCastException e10) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e10);
            }
            throw e10;
        }
    }

    public String h(SSLSocket sSLSocket) {
        Object obj;
        C17542s.j(sSLSocket, "sslSocket");
        Iterator it = this.f137694d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((m) obj).a(sSLSocket)) {
                break;
            }
        }
        m mVar = (m) obj;
        if (mVar != null) {
            return mVar.b(sSLSocket);
        }
        return null;
    }

    public Object i(String str) {
        C17542s.j(str, "closer");
        return this.f137695e.a(str);
    }

    public boolean j(String str) {
        C17542s.j(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    public void m(String str, Object obj) {
        C17542s.j(str, "message");
        if (!this.f137695e.b(obj)) {
            C16354j.l(this, str, 5, (Throwable) null, 4, (Object) null);
        }
    }
}
