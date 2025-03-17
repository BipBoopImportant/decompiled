package RK;

import TK.C16554c;
import android.net.http.X509TrustManagerExtensions;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0001\u0018\u0000 \u001b2\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"LRK/d;", "LTK/c;", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Landroid/net/http/X509TrustManagerExtensions;", "x509TrustManagerExtensions", "<init>", "(Ljavax/net/ssl/X509TrustManager;Landroid/net/http/X509TrustManagerExtensions;)V", "", "Ljava/security/cert/Certificate;", "chain", "", "hostname", "a", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "Ljavax/net/ssl/X509TrustManager;", "c", "Landroid/net/http/X509TrustManagerExtensions;", "d", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: RK.d  reason: case insensitive filesystem */
public final class C16391d extends C16554c {

    /* renamed from: d  reason: collision with root package name */
    public static final a f138028d = new a((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    private final X509TrustManager f138029b;

    /* renamed from: c  reason: collision with root package name */
    private final X509TrustManagerExtensions f138030c;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LRK/d$a;", "", "<init>", "()V", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "LRK/d;", "a", "(Ljavax/net/ssl/X509TrustManager;)LRK/d;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: RK.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C16391d a(X509TrustManager x509TrustManager) {
            X509TrustManagerExtensions x509TrustManagerExtensions;
            C17542s.j(x509TrustManager, "trustManager");
            try {
                x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
            } catch (IllegalArgumentException unused) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions != null) {
                return new C16391d(x509TrustManager, x509TrustManagerExtensions);
            }
            return null;
        }

        private a() {
        }
    }

    public C16391d(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        C17542s.j(x509TrustManager, "trustManager");
        C17542s.j(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f138029b = x509TrustManager;
        this.f138030c = x509TrustManagerExtensions;
    }

    public List<Certificate> a(List<? extends Certificate> list, String str) {
        C17542s.j(list, "chain");
        C17542s.j(str, "hostname");
        try {
            List<X509Certificate> checkServerTrusted = this.f138030c.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            C17542s.i(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return checkServerTrusted;
        } catch (CertificateException e10) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e10.getMessage());
            sSLPeerUnverifiedException.initCause(e10);
            throw sSLPeerUnverifiedException;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C16391d) && ((C16391d) obj).f138029b == this.f138029b;
    }

    public int hashCode() {
        return System.identityHashCode(this.f138029b);
    }
}
